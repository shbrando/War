/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**

 @author joshuagajewski
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    /**
     * Test of getPlayerID method, of class Player.
     */
    @Test
    public void testGetPlayerID() {
        System.out.println("getPlayerID");
        Player instance = new WarPlayer("Joshua");
        String expResult = "Joshua";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayerID method, of class Player.
     */
    @Test
    public void testSetPlayerID() {
        System.out.println("setPlayerID");
        String givenID = "NewJoshua";
        Player instance = new WarPlayer("Joshua");
        instance.setPlayerID(givenID);
    }

    /**
     * Test of play method, of class Player.
     * Cannot be tested at unit level (uses multiple methods)
     * Test in combination with full game (players, cards, etc.)
     * 
    @Test
    public void testPlay() {
        System.out.println("play");
        Player instance = new WarPlayer("Joshua");
        instance.play();
    } */

    public class PlayerImpl extends Player {

        public PlayerImpl() {
            super("");
        }

        public void play() {
        }
    }
    
}
