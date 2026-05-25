/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.quick.chat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class MessageTest {
    
    public MessageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
   

    /**
     * Test of checkMessageID method, of class Message.
     */
    @Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        Message instance = new Message("+27718693002","Hi mike can you jion us for dinner tonigth");
        boolean expResult = true;
        boolean result = instance.checkMessageID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkRecipientCell method, of class Message.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("CheckRecipientCell");
        Message instance = new Message("+2771186693002","Hi Keagen did you recive the payment?");
        boolean expResult = true;
        boolean result = instance.checkRecipientCell();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sentMessage method, of class Message.
     */
    @Test
    public void testSentMessage() {
        System.out.println("sentmessage lengthseccess");
        Message instance = new Message("+27718693002","Hi mike can you jion us for dinner tonigth");
        String expResult = "";
        String result = instance.sentMessage();
        assertEquals(expResult, result);
        
    }

    
    }
    

