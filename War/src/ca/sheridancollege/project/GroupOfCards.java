// War Card Game: GroupOfCards (models a deck of cards)
// 8 April 2019
// Brandon, John and Joshua

/**
 SYST 17796 Project Winter 2019 Base code.
 Students can modify and extend to implement their game.
 Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 A concrete class that represents any grouping of cards for a Game. HINT, you
 might want to subclass this more than once. The group of cards has a maximum
 size attribute which is flexible for reuse.

 @author dancye
 @modifier
 */
public class GroupOfCards {

    Random random = new Random();

    private ArrayList<Card> Deck = new ArrayList<Card>(52);
    private ArrayList<Card> Shuffled = new ArrayList<Card>(52);

    GroupOfCards() {
        String suit = "";
        String rank = "";

        for (int x = 0; x < 4; x++) {
            switch (x) {
                case 0:
                    suit = "Clubs \u2663";
                    break;
                case 1:
                    suit = "Hearts \u2764";
                    break;
                case 2:
                    suit = "Spades \u2660";
                    break;
                case 3:
                    suit = "Diamonds \u2666";
                    break;
                default:
                    break;
            }
            for (int y = 1; y <= 13; y++) {
                if (y == 1) {
                    rank = "Ace";
                } else if (y > 1 && y < 11) {
                    rank = "" + y;
                } else if (y == 11) {
                    rank = "Jack";
                } else if (y == 12) {
                    rank = "Queen";
                } else if (y == 13) {
                    rank = "King";
                }
                Card card = new Card(suit, rank);
                Deck.add(card);
            }
        }
    }

    public ArrayList<Card> getShuffledDeck() {
        return Shuffled;
    }

    public void shuffle() {
        ArrayList<Integer> usednums = new ArrayList<>(52);
        int counter = 0;
        while (counter < 52) {
            int cardnum = random.nextInt((51 - 0) + 1) + 0;
            while (usednums.indexOf(cardnum) == -1) {
                usednums.add(counter, cardnum);
                Shuffled.add(counter, Deck.get(cardnum));
                counter++;
            }
        }
    }

}//end class
