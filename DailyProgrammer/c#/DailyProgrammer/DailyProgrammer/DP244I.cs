using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DailyProgrammer
{
    class DP244I
    {
        const int BOARDROWSIZE = 6;
        const int BOARDCOLSIZE = 7;
        static char[,] board = new char[BOARDROWSIZE, BOARDCOLSIZE];

        public static void Main(string [] args)
        {
            var file = System.IO.File.OpenText(@"..\..\DP244IInput.txt");
            while (!file.EndOfStream)
            {
                var line = file.ReadLine().Replace(" ", "");
                var arr = line;
                foreach (var move in arr)
                {
                    var newMove = addPiecetoBoard(move);
                    printBoard();
                    if (checkWin(newMove.Item1, newMove.Item2))
                    {
                        string player = "Player 2";
                        if (Char.IsUpper(move)) player = "Player 1";

                        Console.WriteLine(player + " is the Winner!");
                        return;
                    }
                    Console.WriteLine();
                }
                
            }
            
        }

        public static void printBoard()
        {
            Console.WriteLine("  A B C D E F G");
            for (int i = BOARDROWSIZE; i > 0; i--)
            {
                Console.Write(i + " ");
                for (int j = 0; j < BOARDCOLSIZE; j++)
                {
                    if (board[i - 1, j] == '\0')
                        Console.Write(". ");
                    else
                        Console.Write(board[i - 1, j] + " ");
                }
                Console.WriteLine();
            }
        }

        public static Tuple<int, int> addPiecetoBoard(char c)
        {
            var piece = 'O';

            if (Char.IsUpper(c))
            {
                piece = 'X';
                c = Char.ToLower(c);
            }
            int col;
            if((col = (int)(c - 'a')) < BOARDCOLSIZE){
                Console.WriteLine(piece + " moves to column " + Char.ToUpper(c));
                int row = 0;
                while (row < BOARDROWSIZE && board[row, col] != '\0') row++;
                board[row, col] = piece;
                return new Tuple<int ,int>(row, col);

            }

            return null;
        }

        public static bool checkWin(int row, int col)
        {
            var inARow = 0;
            var rowCheck = row;
            var colCheck = col;
            var piece = board[row, col];

            //horizontal check
            while (colCheck < BOARDCOLSIZE && board[rowCheck, colCheck] == piece)
            {
                colCheck++;
                inARow++;
            }
            colCheck = col - 1;
            while (colCheck >= 0 && board[rowCheck, colCheck] == piece)
            {
                colCheck--;
                inARow++;
            }

            if (inARow >= 4) return true;

            colCheck = col;
            inARow = 0;

            //vertical check
            while (rowCheck < BOARDROWSIZE && board[rowCheck, colCheck] == piece)
            {
                rowCheck++;
                inARow++;
            }

            rowCheck = row - 1;
            while (rowCheck >= 0 && board[rowCheck, colCheck] == piece)
            {
                rowCheck--;
                inARow++;
            }
            if (inARow >= 4) return true;


            colCheck = col;
            rowCheck = row;
            inARow = 0;

            //diagonal right check
            while (rowCheck < BOARDROWSIZE && colCheck < BOARDCOLSIZE && board[rowCheck, colCheck] == piece)
            {
                rowCheck++;
                colCheck++;
                inARow++;
            }
            rowCheck = row - 1;
            colCheck = col - 1;
            while (rowCheck >= 0 && colCheck >= 0 && board[rowCheck, colCheck] == piece)
            {
                rowCheck--;
                colCheck--;
                inARow++;
            }
            if (inARow >= 4) return true;

            colCheck = col;
            rowCheck = row;
            inARow = 0;
            //diagonal left check
            while (rowCheck < BOARDROWSIZE && colCheck >= 0 && board[rowCheck, colCheck] == piece)
            {
                rowCheck++;
                colCheck--;
                inARow++;
            }
            rowCheck = row - 1;
            colCheck = col + 1;
            while (rowCheck >= 0 && colCheck < BOARDCOLSIZE && board[rowCheck, colCheck] == piece)
            {
                rowCheck--;
                colCheck++;
                inARow++;
            }
            if (inARow >= 4) return true;

            return false;
        }
    }
}
