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

/**
 *
 * @author i14015
 */
public class ScheduleTest {
    
    public ScheduleTest() {
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
     * Test of getDate method, of class Schedule.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Meeting meeting = new Meeting();
        DateRange expResult = new DateRange("01-01-2017 - 01-02-2017");
        Schedule instance = new Schedule(meeting,expResult);
        DateRange result = instance.getDate();
        try{
            assertEquals(expResult, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }

    /**
     * Test of setDate method, of class Schedule.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Meeting meeting = new Meeting();
        DateRange date = new DateRange("01-01-2017 - 01-02-2017");
        Schedule instance = new Schedule(meeting,date);
        DateRange expResult = new DateRange("01-01-2017 - 01-03-2017");
        instance.setDate(expResult);
        DateRange result = instance.getDate();
        try{
            assertEquals(expResult, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }

    /**
     * Test of addImportantParticipant method, of class Schedule.
     */
    @Test
    public void testAddImportantParticipant() {
        System.out.println("addImportantParticipant");
        Meeting meeting = new Meeting();
        DateRange date = new DateRange("01-01-2017 - 01-02-2017");
        Schedule instance = new Schedule(meeting,date);
        int expResult = instance.getTotalParticipant() + 1;
        instance.addImportantParticipant();
        int result = instance.getTotalParticipant();
        try{
            assertEquals(expResult, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }

    /**
     * Test of addParticipant method, of class Schedule.
     */
    @Test
    public void testAddParticipant() {
        System.out.println("addImportantParticipant");
        Meeting meeting = new Meeting();
        DateRange date = new DateRange("01-01-2017 - 01-02-2017");
        Schedule instance = new Schedule(meeting,date);
        int expResult = instance.getTotalParticipant() + 1;
        instance.addParticipant();
        int result = instance.getTotalParticipant();
        try{
            assertEquals(expResult, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }

//    /**
//     * Test of getTotalParticipant method, of class Schedule.
//     */
//    @Test
//    public void testGetTotalParticipant() {
//        System.out.println("getTotalParticipant");
//        Schedule instance = null;
//        int expResult = 0;
//        int result = instance.getTotalParticipant();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of isValid method, of class Schedule.
//     */
//    @Test
//    public void testIsValid() {
//        System.out.println("isValid");
//        Schedule instance = null;
//        boolean expResult = false;
//        boolean result = instance.isValid();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
