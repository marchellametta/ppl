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
 * @author i14009
 */
public class LastIndexTest {
    
    public LastIndexTest() {
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
     * Test of setLastNo method, of class LastIndex.
     */
    @Test
    public void testSetLastNo() {
        System.out.println("setLastNo");
        int lastNo = 0;
        LastIndex instance = new LastIndex();
        instance.setLastNo(lastNo);
        
        System.out.println("getLastNo");
        int expResult = 0;
        int result = instance.getLastNo();
        assertEquals(expResult, result);
        
    }
    
}
