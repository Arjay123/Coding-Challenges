import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by arjaynguyen on 6/1/15.
 */
public class Deck {

    ArrayList<Card> cards = new ArrayList<Card>();
    private static final String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
    private static final String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public Deck(){
        for(String suit: suits)
            for(String value: values)
                cards.add(new Card(suit, value));

        Collections.shuffle(cards);
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card[] deal(int num){
        Card[] cardArr = new Card[num];

        for(int i = 0; i < num; i++)
            cardArr[i] = cards.remove(i);

        return cardArr;
    }
}
