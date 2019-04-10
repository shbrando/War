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
public class WarPlayerTest {
    
    public WarPlayerTest() {
    }

    /**
     * Test of play method, of class WarPlayer.
     * Cannot be tested at unit level (uses multiple methods)
     * Test in combination with full game (players, cards, etc.)
     *
    @Test
    public void testPlay() {
        System.out.println("play");
        WarPlayer instance = new WarPlayer("Joshua");
        instance.play();
    } */

    /**
     * Test of getDeckSize method, of class WarPlayer.
     */
    @Test
    public void testGetDeckSize() {
        System.out.println("getDeckSize");
        WarPlayer instance = new WarPlayer("Joshua");
        int expResult = 0;
        int result = instance.getDeckSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getScore method, of class WarPlayer.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        WarPlayer instance = new WarPlayer("Joshua");
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
    }

    /**
     * Test of addPoint method, of class WarPlayer.
     */
    @Test
    public void testAddPoint() {
        System.out.println("addPoint");
        WarPlayer instance = new WarPlayer("Joshua");
        instance.addPoint();
    }

    /**
     * Test of getPickedCard method, of class WarPlayer.
     */
    @Test
    public void testGetPickedCard() {
        System.out.println("getPickedCard");
        WarPlayer instance = new WarPlayer("Joshua");
        Card expResult = null;
        Card result = instance.getPickedCard();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCardToDeck method, of class WarPlayer.
     */
    @Test
    public void testAddCardToDeck() {
        System.out.println("addCardToDeck");
        Card givenCard = new Card("Hearts", "Ace");
        WarPlayer instance = new WarPlayer("Joshua");
        instance.addCardToDeck(givenCard);
    }
    
}
