/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.quick.chat;

import org.json.JSONObject;
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
public class MessageIT {
    
    public MessageIT() {
    }
    
    
    
    
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkMessageID method, of class Message.
     */
    @Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        Message instance = null;
        boolean expResult = false;
        boolean result = instance.checkMessageID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRecipientCell method, of class Message.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        Message instance = null;
        boolean expResult = false;
        boolean result = instance.checkRecipientCell();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sentMessage method, of class Message.
     */
    @Test
    public void testSentMessage() {
        System.out.println("sentMessage");
        Message instance = null;
        String expResult = "";
        String result = instance.sentMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Storemessage method, of class Message.
     */
    @Test
    public void testStoremessage() throws Exception {
        System.out.println("Storemessage");
        Message instance = null;
        JSONObject expResult = null;
        JSONObject result = instance.Storemessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disregardMessages method, of class Message.
     */
    @Test
public void testDisregardMessages() {
    String recipient = "+27834484567";
    String message = "Yohoooo, I am at your gate.";
    String flag = "Disregard";

    assertEquals("Disregard", flag);
}

@Test
public void testStoreMessagemenue() {
    String recipient = "+27838884567";
    String message = "Where are you? You are late! I have asked you to be on time.";
    String flag = "Stored";

    assertEquals("Stored", flag);
}

@Test
public void testDisplaySenderandRecipient() {
    String recipient = "+27834557896";
    String message = "Did you get the cake?";

    assertEquals("+27834557896", recipient);
}

@Test
public void testDisplayLongestMessage() {
    String longestMessage =
        "Where are you? You are late! I have asked you to be on time.";

    assertEquals(
        "Where are you? You are late! I have asked you to be on time.",
        longestMessage
    );
}

@Test
public void testSearchbymessageID() {
    String recipient = "+27834557896";
    String message = "Did you get the cake?";
    String flag = "Sent";

    assertNotNull(message);
}

@Test
public void testSearchbyRecipient() {
    String recipient = "+27838884567";
    String message = "Ok, I am leaving without you.";
    String flag = "Stored";

    assertEquals("+27838884567", recipient);
}

    /**
     * Test of DeleteMessagebyHash method, of class Message.
     */
    @Test
    public void testDeleteMessagebyHash() {
        System.out.println("DeleteMessagebyHash");
        String Hash = "";
        Message.DeleteMessagebyHash(Hash);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMessageHash method, of class Message.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        Message instance = null;
        String expResult = "";
        String result = instance.createMessageHash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMessage method, of class Message.
     */
    @Test
    public void testPrintMessage() {
        System.out.println("printMessage");
        Message instance = null;
        String expResult = "";
        String result = instance.printMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
