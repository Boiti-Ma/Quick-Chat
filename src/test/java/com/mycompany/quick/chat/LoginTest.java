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
public class LoginTest {
    
    public LoginTest() {
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
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUsername method, of class Login.
     */
    @Test
    public void testCheckUsernameTrue() {
        System.out.println("checkUsername");
        String Username = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUsername(Username);
        assertEquals(expResult, result);
       
    }
 @Test
    public void testCheckUsernameFalse() {
        System.out.println("checkUsername");
        String Username = "kyle!!!!!!!!!!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUsername(Username);
        assertEquals(expResult, result);
       
    }
    /**
     * Test of checkPassword method, of class Login.
     */
    @Test
    public void testCheckPasswordTrue() {
        System.out.println("checkPassword");
        String password = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
        
    }
@Test
    public void testCheckPasswordFalse() {
        System.out.println("checkPassword");
        String password = "password";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of checkCellphone method, of class Login.
     */
    @Test
    public void testCheckCellphoneTrue() {
        System.out.println("checkCellphone");
        String StoreCellphonenumber = "+27838968976";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkCellphone(StoreCellphonenumber);
        assertEquals(expResult, result);
       
    }
 @Test
    public void testCheckCellphoneFalse() {
        System.out.println("checkCellphone");
        String StoreCellphonenumber = "08366553";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellphone(StoreCellphonenumber);
        assertEquals(expResult, result);
       
    }
    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("LoginUser");
        String username = "";
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.LoginUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String username = "";
        String password = "";
        String firstname = "";
        String lastname = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(username, password, firstname, lastname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
