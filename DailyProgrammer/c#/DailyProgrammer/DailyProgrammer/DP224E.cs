using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DailyProgrammer
{
    class DP224E
    {
        static void Main(string[] args)
        {
            var file = System.IO.File.OpenText(@"..\..\DP244EInput.txt");

            var inputs = int.Parse(file.ReadLine());
            var frac1 = new Fraction(file.ReadLine());
            while (inputs > 1)
            {
                frac1.add(new Fraction(file.ReadLine()));
                inputs--;
            }
            Console.WriteLine(frac1.numerator + "/" + frac1.denominator);
        
        }
    }

    public class Fraction
    {
        public Int64 numerator;
        public Int64 denominator;

        public Fraction(string s)
        {
            var arr = s.Split('/').ToArray();
            numerator = int.Parse(arr[0]);
            denominator = int.Parse(arr[1]);
        }

        public void multDenom(Int64 mult){
                denominator *= mult;
                numerator *= mult;
        }

        public void add(Fraction adder)
        {
            if (adder.denominator != denominator)
            {
                var currDenom = denominator;
                multDenom(adder.denominator);
                adder.multDenom(currDenom);
            }

            //add num
            numerator += adder.numerator;

            //reduce
            reduce();
        }

        public void reduce()
        {
            var gcd = getGCDEuclid(numerator, denominator);
            if (gcd != 1)
            {
                numerator /= gcd;
                denominator /= gcd;
            }
        }

        public static Int64 getGCDEuclid(Int64 a, Int64 b)
        {
            if (b == 0) return a;
            return getGCDEuclid(b, a % b);
        }
    }

    
}
