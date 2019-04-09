// War Card Game: main (Command-Line Interface)
// 8 April 2019
// Brandon, John and Joshua

package ca.sheridancollege.project;

import java.util.Scanner;

/**
 @author Brandon
 @modified by Joshua
 */
public class main {

    public static void main(String[] args) {

        // TOOLS
        Scanner ui = new Scanner(System.in); // for text input from user
        Scanner nextStep = new Scanner(System.in); // seperate scanner so as not to interfere with text input
        String displayRules;
        War war = new War("War");
        WarPlayer player1 = null;
        WarPlayer player2 = null;
        int numOfPlayers = 0;
        boolean invalid = true; // assume user input is incorrect

        // HEADER
        // Clubs: \u2663, Hearts: \u2764, Spades: \u2660, Diamonds: \u2666
        String icons = "\u2663 \u2764 \u2660 \u2666 ";
        System.out.println("Welcome to War!\n" + icons + icons + "\n");

        // RULEBOOK
        do {
            System.out.print("Would you like to view the rules? (Y/N): ");
            String temp = ui.next();
            displayRules = temp.substring(0, 1);
        } while (!displayRules.equalsIgnoreCase("y") && !displayRules.equalsIgnoreCase("n"));

        if (displayRules.equalsIgnoreCase("y")) {
            System.out.println("The rules of the game are simple. (Press [Enter] to continue)");
            nextStep.nextLine();
            System.out.println("Each player will get half of the deck,");
            System.out.println("and every round each player will draw one card. (Press [Enter] to continue)");
            nextStep.nextLine();
            System.out.println("The round gets awarded to the player with the");
            System.out.println("highest card value. If the players have equal");
            System.out.println("card values, they redraw until one is higher");
            System.out.println("than the other. This is called a 'War'. (Press [Enter] to continue)");
            nextStep.nextLine();
        }

        // SET NUMBER OF PLAYERS
        do {
            try {
                System.out.print("To get started, please choose the amount of players (1-2): ");
                String tempNumOfPlayers = ui.next();
                if (tempNumOfPlayers.matches("[1-2]+$")) { // 1 or 2 ONLY
                    invalid = false; // they were smart
                    numOfPlayers = Integer.parseInt(tempNumOfPlayers);
                } else {
                    throw new NumberFormatException("Please select either 1 or 2 players only.");
                }
            } catch (NumberFormatException nfe) {
                System.out.println(nfe.getMessage());
            }
        } while (invalid); // while they're wrong

        // SET PLAYER NAMES
        // conditions: names must not be empty or match each other
        if (numOfPlayers == 1) { // SINGLE-PLAYER
            String plrName;
            do {
                System.out.print("Please enter a name for Player 1: ");
                plrName = ui.next();
            } while (plrName.isEmpty() || plrName.matches("Computer"));

            player1 = new WarPlayer(plrName);
            player2 = new WarPlayer("Computer");
            war.addPlayer(player1);
            war.addPlayer(player2);
        } else if (numOfPlayers == 2) { // MULTI-PLAYER
            String plrName1;
            do {
                System.out.print("Please enter a name for Player 1: ");
                plrName1 = ui.next();
            } while (plrName1.isEmpty());
            String plrName2;
            do {
                System.out.print("Please enter a name for Player 2: ");
                plrName2 = ui.next();
            } while (plrName2.isEmpty() || plrName2.matches(plrName1));
            player1 = new WarPlayer(plrName1);
            player2 = new WarPlayer(plrName2);
            war.addPlayer(player1);
            war.addPlayer(player2);
        }

        // GAME PREP
        GroupOfCards deck = new GroupOfCards();
        System.out.println("\nShuffling deck...");
        deck.shuffle();
        System.out.println("Deck shuffled!");
        System.out.println("Distributing cards...");
        war.distributeCards(deck, player1, player2);
        System.out.println("Cards distributed!\nPress [Enter] to play!");
        nextStep.nextLine();

        // PLAY ROUNDS
        while (!war.checkForEndOfGame()) {
            war.play();
            if (war.checkForEndOfGame()) { // if game is finished
                System.out.println("\nGame over!");
                war.declareWinner();
                System.exit(0);
            } else { // move on to next round
                System.out.println("Press [Enter] to draw again.");
            }
            nextStep.nextLine();
        }
    }
}
