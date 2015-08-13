import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by arjaynguyen on 6/1/15.
 */
public class Holdem {

    private Deck deck;
    private ArrayList<Player> players = new ArrayList<>();

    public Holdem(int playerCt){
        deck = new Deck();

        players.add(new Player("Player 1"));
        for(int i = 1; i < playerCt; i++)
            players.add(new Player("CPU "+ i));
    }


    public void startGame(){

        //deal hands


        for(Player player: players) {
            player.setHand(deck.deal(2));
            System.out.println(player.name + " Hand: " + player.getHand().toString());
        }
        System.out.println();

        Card[] flop = deck.deal(3);
        System.out.println("Flop: " + Arrays.toString(flop));
        

        Card[] turn = deck.deal(1);
        System.out.println("Turn: " + Arrays.toString(turn));


        Card[] river = deck.deal(1);
        System.out.println("River: " + Arrays.toString(river));


    }
}
