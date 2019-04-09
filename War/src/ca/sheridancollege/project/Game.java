/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */
public abstract class Game 
{
    final String gameName;//the title of the game
    private ArrayList <Player> players;// the players of the game
    
    public Game(String givenName)
    {
        gameName = givenName;
        players = new ArrayList();
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players) 
    {
        this.players = players;
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play();
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

   
    
}//end class

class War extends Game {
    private ArrayList <WarPlayer> playerslist = new ArrayList <WarPlayer>(2);
    public War(String givenName)
    {
        super(givenName);
    }
    
    public void addPlayer(WarPlayer player){
        playerslist.add(player);
    }
    
    @Override
    public void play(){

        playerslist.get(0).play();
        playerslist.get(1).play();
        
        if(playerslist.get(0).getPickedCard().getValue() > playerslist.get(1).getPickedCard().getValue()){
            playerslist.get(0).addPoint();
            System.out.println(playerslist.get(0).getPlayerID() + " has won the round!");
            
        }else if(playerslist.get(0).getPickedCard().getValue() < playerslist.get(1).getPickedCard().getValue()){
            playerslist.get(1).addPoint();
            System.out.println(playerslist.get(1).getPlayerID() + " has won the round!");
        }else if(playerslist.get(0).getPickedCard().getValue() == playerslist.get(1).getPickedCard().getValue()){
            if(playerslist.get(0).getDeckSize() != 0){
                do{
                    System.out.println("War! Re-drawing");
                    playerslist.get(0).play();
                    playerslist.get(1).play();
                }while(playerslist.get(0).getPickedCard().getValue() == playerslist.get(1).getPickedCard().getValue() 
                       && playerslist.get(0).getDeckSize() != 0);
                if(playerslist.get(0).getDeckSize() != 0){
                    if(playerslist.get(0).getPickedCard().getValue() > playerslist.get(1).getPickedCard().getValue()){
                        playerslist.get(0).addPoint();
                        System.out.println(playerslist.get(0).getPlayerID() + " has won the round!");
                    }else if(playerslist.get(0).getPickedCard().getValue() < playerslist.get(1).getPickedCard().getValue()){
                        playerslist.get(1).addPoint();
                        System.out.println(playerslist.get(1).getPlayerID() + " has won the round!");
                    }
                }
            }
        }
        System.out.println(playerslist.get(0).getPlayerID() + " has " + playerslist.get(0).getScore() + " points.");
        System.out.println(playerslist.get(1).getPlayerID() + " has " + playerslist.get(1).getScore() + " points.");
    }
    
    public boolean checkForEndOfGame(){
        return playerslist.get(1).getDeckSize() == 0;
    }
    @Override
    public void declareWinner(){
        if(playerslist.get(0).getScore() > playerslist.get(1).getScore()){
            System.out.println(playerslist.get(0).getPlayerID() + " has won the game with " + playerslist.get(0).getScore() + " points!");
        }else if(playerslist.get(0).getScore() < playerslist.get(1).getScore()){
            System.out.println(playerslist.get(1).getPlayerID() + " has won the game with " + playerslist.get(1).getScore() + " points!");
        }else{
            System.out.println("It's a tie! No one has won the game!");
        }
    }
    
    public void distributeCards(GroupOfCards deck, WarPlayer plr1, WarPlayer plr2){
        ArrayList <Card> temp = deck.getShuffledDeck();
        plr1.addCardToDeck(temp.get(0));
        plr1.addCardToDeck(temp.get(1));
        plr1.addCardToDeck(temp.get(2));
        plr1.addCardToDeck(temp.get(3));
        plr1.addCardToDeck(temp.get(4));
        plr1.addCardToDeck(temp.get(5));
        plr2.addCardToDeck(temp.get(6));
        plr2.addCardToDeck(temp.get(7));
        plr2.addCardToDeck(temp.get(8));
        plr2.addCardToDeck(temp.get(9));
        plr2.addCardToDeck(temp.get(10));
        plr2.addCardToDeck(temp.get(11));
    }
}