/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.controller;

import com.mscheduler.model.Schedule;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Clara Christina
 */
public class SchedulerControllerTest {
    
    public SchedulerControllerTest() {
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
     * Test of runSchedule method, of class SchedulerController.
     */
    @Test
    public void testRunSchedule() {
        System.out.println("runSchedule");
        int meeting_id = 0;
        SchedulerController instance = new SchedulerController();
        Schedule expResult = null;
        Schedule result = instance.runSchedule(meeting_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
