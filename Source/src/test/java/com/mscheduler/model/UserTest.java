/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEmail method, of class User.
     */
//    @Test
//    public void testGetEmail() {
//        System.out.println("getEmail");
//        User instance = new User();
//        String expResult = "";
//        String result = instance.getEmail();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "clara@gmail.com";
        User instance = new User();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
        
        
        System.out.println("getEmail");
        //User instance = new User();
        String expResult = "clara@gmail.com";
        String result = instance.getEmail();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
        try{
            assertEquals(expResult, result);
        }
        catch(Exception e){
            System.out.println("Tidak sesuai ekspektasi");
        }
    }

    /**
     * Test of getPassword method, of class User.
     */
//    @Test
//    public void testGetPassword() {
//        System.out.println("getPassword");
//        User instance = new User();
//        String expResult = "";
//        String result = instance.getPassword();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "asdasdasd";
        User instance = new User();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
        
        
        System.out.println("getPassword");
        //User instance = new User();
        String expResult = "asdasdasd";
        String result = instance.getPassword();
        try{
            assertEquals(expResult, result);
        }
        catch(Exception e){
            System.out.println("Tidak sesuai ekspektasi");
        }
    }

    /**
     * Test of getName method, of class User.
     */
//    @Test
//    public void testGetName() {
//        System.out.println("getName");
//        User instance = new User();
//        String expResult = "";
//        String result = instance.getName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Clara";
        User instance = new User();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
        
        
        System.out.println("getName");
        //User instance = new User();
        String expResult = "Clara";
        String result = instance.getName();
        try{
            assertEquals(expResult, result);
        }
        catch(Exception e){
            System.out.println("Tidak sesuai ekspektasi");
        }
    }

    /**
     * Test of isIsAdmin method, of class User.
     */
    @Test
    public void testIsIsAdmin() {
        System.out.println("isIsAdmin");
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.isIsAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        try{
//            assertEquals(expResult, result);
//        }
//        catch(Exception e){
//            System.out.println("Tidak sesuai ekspektasi");
//        }
    }

    /**
     * Test of setIsAdmin method, of class User.
     */
    @Test
    public void testSetIsAdmin() {
        System.out.println("setIsAdmin");
        boolean isAdmin = false;
        User instance = new User();
        instance.setIsAdmin(isAdmin);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saving method, of class User.
     */
    @Test
    public void testSaving() {
        System.out.println("saving");
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.saving();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BooleanReadUser method, of class User.
     */
    @Test
    public void testBooleanReadUser() {
        System.out.println("BooleanReadUser");
        String input = "clara@gmail.com";
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.BooleanReadUser(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BooleanReadPass method, of class User.
     */
    @Test
    public void testBooleanReadPass() {
        System.out.println("BooleanReadPass");
        String email = "clara@gmail.com";
        String input = "asdasdasd";
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.BooleanReadPass(email, input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkLoginDb method, of class User.
     */
    @Test
    public void testCheckLoginDb() {
        System.out.println("checkLoginDb");
        User instance = new User();
        String expResult = "0";
        String result = instance.checkLoginDb(instance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of lastAdmin method, of class User.
     */
    @Test
    public void testLastAdmin() {
        System.out.println("lastAdmin");
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.lastAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editAll method, of class User.
     */
    @Test
    public void testEditAll() {
        System.out.println("editAll");
        User usr = null;
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.editAll(instance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editOne method, of class User.
     */
    @Test
    public void testEditOne() {
        System.out.println("editOne");
        String condition = "name";
        User usr = null;
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.editOne(condition, instance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of del method, of class User.
     */
    @Test
    public void testDel() {
        System.out.println("del");
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.del();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkdel method, of class User.
     */
    @Test
    public void testCheckdel() {
        System.out.println("checkdel");
        String Email = "clara@gmail.com";
        User instance = new User("clara@gmail.com", "asdasdasd", "Clara", false);
        boolean expResult = true;
        boolean result = instance.checkdel(Email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
