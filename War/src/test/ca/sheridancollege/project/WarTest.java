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
public class WarTest {
    
    public WarTest() {
    }
    
    /**
     * Test of addPlayer method, of class War.
     */
    @Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        WarPlayer player = new WarPlayer("Joshua");
        War instance = null;
        instance.addPlayer(player);
    }

    /**
     * Test of play method, of class War.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        War instance = null;
        instance.play();
    }

    /**
     * Test of checkForEndOfGame method, of class War.
     */
    @Test
    public void testCheckForEndOfGame() {
        System.out.println("checkForEndOfGame");
        War instance = null;
        boolean expResult = false;
        boolean result = instance.checkForEndOfGame();
        assertEquals(expResult, result);
    }

    /**
     * Test of declareWinner method, of class War.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        War instance = null;
        instance.declareWinner();
    }

    /**
     * Test of distributeCards method, of class War.
     */
    @Test
    public void testDistributeCards() {
        System.out.println("distributeCards");
        GroupOfCards deck = null;
        WarPlayer plr1 = null;
        WarPlayer plr2 = null;
        War instance = null;
        instance.distributeCards(deck, plr1, plr2);
    }
    
}
