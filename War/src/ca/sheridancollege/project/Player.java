// War Card Game: player (models player moves)
// 8 April 2019
// Brandon, John and Joshua

/**
 SYST 17796 Project Winter 2019 Base code.
 Students can modify and extend to implement their game.
 Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 A class that models each Player in the game. Players have an identifier, which
 should be unique.

 @author dancye, 2018
 */
public abstract class Player {

    protected String playerID; //the unique ID for this player

    /**
     A constructor that allows you to set the player's unique ID

     @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        playerID = name;
    }

    /**
     @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     Ensure that the playerID is unique

     @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) {
        playerID = givenID;
    }

    /**
     The method to be instantiated when you subclass the Player class with your
     specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();

}

class WarPlayer extends Player {

    private Card pickedCard;
    private int score = 0;
    private ArrayList<Card> deck = new ArrayList<Card>(26);

    public WarPlayer(String givenName) {
        super(givenName);
    }

    @Override
    public void play() {
        pickedCard = deck.get(0);
        deck.remove(0);
        System.out.println(super.playerID + " has drawn the " + pickedCard.getRank() + " of " + pickedCard.getSuit());
    }

    public int getDeckSize() {
        return deck.size();
    }

    //Returns the score of the player
    public int getScore() {
        return score;
    }

    //Adds a point to the players score
    public void addPoint() {
        score++;
    }

    //Get the card the player has most recently picked
    public Card getPickedCard() {
        return pickedCard;
    }

    //Adds a card to the deck (for shuffling purposes)
    public void addCardToDeck(Card givenCard) {
        deck.add(givenCard);
    }
}
