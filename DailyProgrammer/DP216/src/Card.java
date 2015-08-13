/**
 * Created by arjaynguyen on 6/1/15.
 */
public class Card {

    private String suit;
    private String value;

    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    public String toString(){
        return value + " of " + suit;
    }
}
