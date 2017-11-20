/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class DateRangeTest {
    
    public DateRangeTest() {
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
     * Test of dateToLocalDateTime method, of class DateRange.
     */
    @Test
    public void testDateToLocalDateTime() {
        System.out.println("dateToLocalDateTime");
        Date date = new Date();
        DateRange instance = new DateRange();
        LocalDateTime expResult = LocalDateTime.now();
        LocalDateTime result = instance.dateToLocalDateTime(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of localDateTimeToDate method, of class DateRange.
     */
    @Test
    public void testLocalDateTimeToDate() {
        System.out.println("localDateTimeToDate");
        LocalDateTime ldate = LocalDateTime.now();;
        DateRange instance = new DateRange();
        Date expResult = new Date();
        Date result = instance.localDateTimeToDate(ldate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDate_start method, of class DateRange.
     */
    @Test
    public void testGetDate_start() {
        System.out.println("getDate_start");
        DateRange instance = new DateRange();
        Date expResult = new Date();
        Date result = instance.getDate_start();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDate_start method, of class DateRange.
     */
    @Test
    public void testSetDate_start() {
        System.out.println("setDate_start");
        Date date_start = new Date();
        DateRange instance = new DateRange();
        instance.setDate_start(date_start);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDate_end method, of class DateRange.
     */
    @Test
    public void testGetDate_end() {
        System.out.println("getDate_end");
        DateRange instance = new DateRange();
        Date expResult = new Date();
        Date result = instance.getDate_end();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDate_end method, of class DateRange.
     */
    @Test
    public void testSetDate_end() {
        System.out.println("setDate_end");
        Date date_end = new Date();
        DateRange instance = new DateRange();
        instance.setDate_end(date_end);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of localDateStart method, of class DateRange.
     */
    @Test
    public void testLocalDateStart() {
        System.out.println("localDateStart");
        DateRange instance = new DateRange();
        LocalDateTime expResult = LocalDateTime.now();
        LocalDateTime result = instance.localDateStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLocalDate_start method, of class DateRange.
     */
    @Test
    public void testSetLocalDate_start() {
        System.out.println("setLocalDate_start");
        LocalDateTime date_start = LocalDateTime.now();
        DateRange instance = new DateRange();
        instance.setLocalDate_start(date_start);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of localDateEnd method, of class DateRange.
     */
    @Test
    public void testLocalDateEnd() {
        System.out.println("localDateEnd");
        DateRange instance = new DateRange();
        LocalDateTime expResult = LocalDateTime.now();
        LocalDateTime result = instance.localDateEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLocalDate_end method, of class DateRange.
     */
    @Test
    public void testSetLocalDate_end() {
        System.out.println("setLocalDate_end");
        LocalDateTime date_end = LocalDateTime.now();
        DateRange instance = new DateRange();
        instance.setLocalDate_end(date_end);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of length method, of class DateRange.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        DateRange instance = new DateRange();
        int expResult = 0;
        int result = instance.length();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isBetweenAny method, of class DateRange.
     */
    @Test
    public void testIsBetweenAny() {
        System.out.println("isBetweenAny");
        List<DateRange> date =  new ArrayList<DateRange>();
        DateRange instance = new DateRange();
        boolean expResult = false;
        boolean result = instance.isBetweenAny(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isDateRangeBetween method, of class DateRange.
     */
    @Test
    public void testIsDateRangeBetween() {
        System.out.println("isDateRangeBetween");
        DateRange date = new DateRange();
        DateRange instance = new DateRange();
        boolean expResult = false;
        boolean result = instance.isDateRangeBetween(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isDateBetween method, of class DateRange.
     */
    @Test
    public void testIsDateBetween() {
        System.out.println("isDateBetween");
        LocalDateTime date = LocalDateTime.now();
        DateRange instance = new DateRange();
        boolean expResult = false;
        boolean result = instance.isDateBetween(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DateRange.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DateRange instance = new DateRange();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString2 method, of class DateRange.
     */
    @Test
    public void testToString2() {
        System.out.println("toString2");
        DateRange instance = new DateRange();
        String expResult = "";
        String result = instance.toString2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isOverlap method, of class DateRange.
     */
    @Test
    public void testIsOverlap() {
        System.out.println("isOverlap");
        DateRange dr2 = new DateRange();
        DateRange instance = new DateRange();
        boolean expResult = false;
        boolean result = instance.isOverlap(dr2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mergeDate method, of class DateRange.
     */
    @Test
    public void testMergeDate() {
        System.out.println("mergeDate");
        DateRange dr = new DateRange();
        DateRange instance = new DateRange();
        instance.mergeDate(dr);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isOverlapAny method, of class DateRange.
     */
    @Test
    public void testIsOverlapAny() {
        System.out.println("isOverlapAny");
        List<DateRange> conflicted_meeting_time = new ArrayList<DateRange>();
        DateRange instance = new DateRange();
        boolean expResult = false;
        boolean result = instance.isOverlapAny(conflicted_meeting_time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
