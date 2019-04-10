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
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    /**
     * Test of getShuffledDeck method, of class GroupOfCards.
     */
    @Test
    public void testGetShuffledDeck() {
        System.out.println("getShuffledDeck");
        GroupOfCards instance = new GroupOfCards();
        ArrayList<Card> expResult = new ArrayList<Card>();
        ArrayList<Card> result = instance.getShuffledDeck();
        assertEquals(expResult, result);
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards();
        instance.shuffle();
    }
    
}
