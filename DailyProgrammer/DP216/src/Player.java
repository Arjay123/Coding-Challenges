import java.util.ArrayList;

/**
 * Created by arjaynguyen on 6/1/15.
 */
public class Player {

    public String name;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name){
        this.name = name;
    }

    public void addCardToHand(Card c){
        hand.add(c);
    }

    public ArrayList<Card> getHand(){
        return hand;
    }

    public void setHand(Card[] cards){
        hand = new ArrayList<>();
        for(Card c: cards)
            hand.add(c);
    }
}
