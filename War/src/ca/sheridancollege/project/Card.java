/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 * @modifier shbrando, 2019
 */
public class Card 
{
    private String suit;
    private String rank;
    private int value;
    
    public Card(){
        
    }
    public Card(String getSuit, String getRank){
        this.suit = getSuit;
        this.rank = getRank;
        
        if(rank.equals("2")){
            value = 2;
        }
        else if(rank.equals("3")){
            value = 3;
        }
        else if(rank.equals("4")){
            value = 4;
        }
        else if(rank.equals("5")){
            value = 5;
        }
        else if(rank.equals("6")){
            value = 6;
        }
        else if(rank.equals("7")){
            value = 7;
        }
        else if(rank.equals("8")){
            value = 8;
        }
        else if(rank.equals("9")){
            value = 9;
        }
        else if(rank.equals("10")){
            value = 10;
        }
        else if(rank.equals("Jack")){
            value = 11;
        }
        else if(rank.equals("Queen")){
            value = 12;
        }
        else if(rank.equals("King")){
            value = 13;
        }
        else if(rank.equals("Ace")){
            value = 14;
        }
    }
    public String getSuit(){
        return suit;
    }
    public String getRank(){
        return rank;
    }
    public int getValue(){
        return value;
    }
    public void setSuit(String suit){
        this.suit = suit;
    }
    public void setRank(String rank){
        this.rank = rank;
    }
    public void setValue(int value){
        this.value = value;
    }
    @Override
    public String toString(){
        return rank + " " + suit;
    }
    public Card copy(Card card){
        Card temp = new Card (card.getSuit(), card.getRank());
        return temp;
    }
    public int isGreater(Card card){
        int temp;
        if (value > card.getValue()){
            temp = 1;
        }
        else if (value < card.getValue()){
            temp = 2;
        }
        else{
            temp = 3;
        }
        return temp;
    
    }
}
