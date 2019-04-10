/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**

 @author joshuagajewski
 */
public class GameTest {
    
    public GameTest() {
    }
    
    /**
     * Test of getGameName method, of class Game.
     */
    @Test
    public void testGetGameName() {
        System.out.println("getGameName");
        Game instance = new War("Game");
        String expResult = "Game";
        String result = instance.getGameName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        Game instance = new War("Game");
        ArrayList<Player> expResult = new ArrayList<Player>();
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
    } 

    /**
     * Test of setPlayers method, of class Game.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        ArrayList<Player> players = new ArrayList<>();
        Game instance = new War("Game");
        instance.setPlayers(players);
    }

    /**
     * Test of play method, of class Game.
     * Cannot be tested at unit level (uses multiple methods)
     * Test in combination with full game (players, cards, etc.)
     *
    @Test
    public void testPlay() {
        System.out.println("play");
        Game instance = new War("Game");
        instance.play();
    } */

    /**
     * Test of declareWinner method, of class Game.
     * Cannot be tested at unit level (uses multiple methods)
     * Test in combination with full game (players, cards, etc.)
     *
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        Game instance = new War("Game");
        instance.play();
        instance.declareWinner();
    } */

    public class GameImpl extends Game {

        public GameImpl() {
            super("");
        }

        public void play() {
        }

        public void declareWinner() {
        }
    }
    
}
