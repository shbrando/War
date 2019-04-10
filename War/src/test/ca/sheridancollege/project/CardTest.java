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
public class CardTest {
    
    public CardTest() {
    }
    
    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = new Card("Hearts", "Ace");
        String expResult = "Hearts"; // it SHOULD return HEARTS
        String result = instance.getSuit();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        Card instance = new Card("Hearts", "Ace");
        String expResult = "Ace"; // it SHOULD return ACE
        String result = instance.getRank();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Card instance = new Card("Hearts", "Ace");
        int expResult = 14; // it SHOULD return 14
        int result = instance.getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSuit method, of class Card.
     */
    @Test
    public void testSetSuit() {
        System.out.println("setSuit");
        String suit = "Spades";
        Card instance = new Card("Hearts", "Ace");
        instance.setSuit(suit);
        System.out.println(instance.toString()); // it SHOULD return SPADES ACE
    }

    /**
     * Test of setRank method, of class Card.
     */
    @Test
    public void testSetRank() {
        System.out.println("setRank");
        String rank = "3";
        Card instance = new Card("Hearts", "Ace");
        instance.setRank(rank);
        System.out.println(instance.toString()); // it SHOULD return HEARTS 3
    }

    /**
     * Test of setValue method, of class Card.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 3;
        Card instance = new Card("Hearts", "Ace");
        instance.setValue(value);
        System.out.println(instance.getValue()); // it SHOULD return 3
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = new Card("Hearts", "Ace");
        String expResult = "Ace Hearts";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of copy method, of class Card.
     *
    @Test
    public void testCopy() {
        System.out.println("copy");
        Card card = new Card("Hearts", "Ace");
        Card instance = new Card("Hearts", "Ace");
        Card expResult = new Card("Hearts", "Ace");
        Card result = instance.copy(card);
        assertEquals(expResult, result);
    } */

    /**
     * Test of isGreater method, of class Card.
     */
    @Test
    public void testIsGreater() {
        System.out.println("isGreater");
        Card card = new Card("Hearts", "Ace");
        Card instance = new Card("Hearts", "Ace");
        int expResult = 3;
        int result = instance.isGreater(card);
        assertEquals(expResult, result);
    }
    
}
