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
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "clara@gmail.com";
        User instance = new User();
        instance.setEmail(email);
        
        System.out.println("getEmail");
        String expResult = "clara@gmail.com";
        String result = instance.getEmail();
        try{
            assertEquals(expResult, result);
        }
        catch(Exception e){
            System.out.println("Tidak sesuai ekspektasi");
        }
    }
    
    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "asdasdasd";
        User instance = new User();
        instance.setPassword(password);
        
        System.out.println("getPassword");
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
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Clara";
        User instance = new User();
        instance.setName(name);
        
        System.out.println("getName");
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
    }

    /**
     * Test of setIsAdmin method, of class User.
     */
    @Test
    public void testSetIsAdmin() {
        System.out.println("setIsAdmin");
        boolean isAdmin = true;
        User instance = new User();
        instance.setIsAdmin(isAdmin);
        boolean expResult = true;
        boolean result = instance.isIsAdmin();
        assertEquals(expResult, result);
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
    }

    /**
     * Test of BooleanReadUser method, of class User.
     */
    @Test
    public void testBooleanReadUser() {
        System.out.println("BooleanReadUser");
        String input = "clara@gmail.com";
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.BooleanReadUser(input);
        assertEquals(expResult, result);
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
        boolean expResult = true;
        boolean result = instance.BooleanReadPass(email, input);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkLoginDb method, of class User.
     */
    @Test
    public void testCheckLoginDb() {
        System.out.println("checkLoginDb");
        User instance = new User();
        String expResult = "1";
        String result = instance.checkLoginDb(instance);
        assertEquals(expResult, result);
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
    }

    /**
     * Test of editAll method, of class User.
     */
    @Test
    public void testEditAll() {
        System.out.println("editAll");
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.editAll(instance);
        assertEquals(expResult, result);
    }

    /**
     * Test of editOne method, of class User.
     */
    @Test
    public void testEditOne() {
        System.out.println("editOne");
        String condition = "name";
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.editOne(condition, instance);
        assertEquals(expResult, result);
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
    }

    /**
     * Test of checkdel method, of class User.
     */
    @Test
    public void testCheckdel() {
        System.out.println("checkdel");
        User instance = new User("clara@gmail.com", "asdasdasd", "Clara", false);
        String email = instance.getEmail();
        boolean expResult = true;
        boolean result = instance.checkdel(email);
        assertEquals(expResult, result);
    }
    
}
