/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.project;
import java.util.Scanner;
/**
 *
 * @author Brandon
 */
public class main{
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        String displayRules;
        War war = new War("War");
        WarPlayer player1 = null;
        WarPlayer player2 = null;
        int numOfPlayers;
        
        do{
            System.out.println("Would you like to view the rules? (Y/N)");
            String temp = ui.nextLine();
            displayRules = temp.substring(0,1);
        }while(!displayRules.equalsIgnoreCase("y") && !displayRules.equalsIgnoreCase("n"));
        
        if(displayRules.equalsIgnoreCase("y")){
            System.out.println("Welcome to War! (Press enter to continue) ");
            ui.nextLine();
            System.out.println("The rules of the game are simple. (Press enter to continue)");
            ui.nextLine();
            System.out.println("Each player will get half of the deck,");
            System.out.println("and every round each player will draw one card. (Press enter to continue)");
            ui.nextLine();
            System.out.println("The round gets awarded to the player with the");
            System.out.println("highest card value. If the players have equal");
            System.out.println("card values, they redraw until one is higher");
            System.out.println("than the other. This is called a 'War'. (Press enter to continue)");
            ui.nextLine();
        }
        
        System.out.println("To get started, please choose the amount of players. [1-2]");
        numOfPlayers = ui.nextInt();
        while(numOfPlayers != 1 && numOfPlayers != 2){
            System.out.println("Please choose a valid amount of players [1-2]");
            numOfPlayers = ui.nextInt();
        }
        
        if(numOfPlayers == 1){
            String plrName = "";
            while(plrName.isEmpty()){
                System.out.println("Please enter a name for Player1");
                plrName = ui.nextLine();
            }
            player1 = new WarPlayer(plrName);
            player2 = new WarPlayer("Computer");
            war.addPlayer(player1);
            war.addPlayer(player2);
        }else if(numOfPlayers == 2){
            String plr1Name;
            String plr2Name;
            System.out.println("Please enter a name for Player1");
            plr1Name = ui.nextLine();
            while(plr1Name == ""){
                System.out.println("Please enter a valid name");
                plr1Name = ui.nextLine();
            }
            System.out.println("Please enter a name for Player2");
            plr2Name = ui.nextLine();
            while(plr2Name == ""){
                System.out.println("Please enter a valid name");
                plr2Name = ui.nextLine();
            }
            player1 = new WarPlayer(plr1Name);
            player2 = new WarPlayer(plr2Name);
            war.addPlayer(player1);
            war.addPlayer(player2);
        }
        GroupOfCards deck = new GroupOfCards();
        System.out.println("Shuffling Deck...");
        deck.shuffle();
        System.out.println("Deck shuffled!");
        System.out.println("Distributing cards...");
        war.distributeCards(deck, player1, player2);
        System.out.println("Cards distributed, Press Enter to Play!");
        ui.nextLine();
        while(!war.checkForEndOfGame()){
            war.play();
            System.out.println(war.checkForEndOfGame());
            System.out.println("Press Enter to draw again");
            ui.nextLine();
        }
        war.declareWinner();
    }
}
