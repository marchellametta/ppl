/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler;

import java.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marchella Metta
 */
public class UtilitiesTest {
    
    public UtilitiesTest() {
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
     * Test of getPage method, of class Utilities.
     */
    @Test
    public void testGetPage() { //Boundary
        System.out.println("getPage");
        String str = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n";
        int page = 2;
        String expResult = "11";
        String result = Utilities.getPage(str, page);
        assertEquals(expResult, result);
        
        int page4 = 1;
        String expResult4 = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10";
        String result4 = Utilities.getPage(str, page4);
        assertEquals(expResult4, result4);
        
        int page2 = 0;
        String expResult2 = "";
        String result2 = Utilities.getPage(str, page2);
        assertEquals(expResult2, result2);
        
        int page3 = 10;
        String expResult3 = "";
        String result3 = Utilities.getPage(str, page3);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of countMaxPage method, of class Utilities.
     */
    @Test
    public void testCountMaxPage() { //Boundary
        System.out.println("countMaxPage");
        String str = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n";
        int expResult = 3;
        int result = Utilities.countMaxPage(str);
        assertEquals(expResult, result);
        
        String str2 = "";
        int expResult2 = 1;
        int result2 = Utilities.countMaxPage(str2);
        assertEquals(expResult2, result2);
        
    }

    /**
     * Test of validDateRange method, of class Utilities.
     */
    @Test
    public void testValidDateRange() {
        System.out.println("validDateRange");
        String date = "02/11/2017 09 - 02/11/2017 11";
        boolean expResult = true;
        boolean result = Utilities.validDateRange(date);
        assertEquals(expResult, result);
        
        String date2 = "02-11-2017 09 - 02-11-2017 11";
        boolean expResult2 = false;
        boolean result2 = Utilities.validDateRange(date2);
        assertEquals(expResult2, result2);
        
        String date3 = "02-11 09 - 02-11 11";
        boolean expResult3 = false;
        boolean result3 = Utilities.validDateRange(date3);
        assertEquals(expResult3, result3);
        
    }

    /**
     * Test of isValidDateTimeString method, of class Utilities.
     */
    @Test
    public void testIsValidDateTimeString_String() {
        System.out.println("isValidDateTimeString");
        String date = "02/08/2017 09";
        boolean expResult = true;
        boolean result = Utilities.isValidDateTimeString(date);
        assertEquals(expResult, result);
        
        String date2 = "02/8/2017 09";
        boolean expResult2 = false;
        boolean result2 = Utilities.isValidDateTimeString(date2);
        assertEquals(expResult2, result2);
        
    }

    /**
     * Test of isValidDateTimeString method, of class Utilities.
     */
    @Test
    public void testIsValidDateTimeString_String_DateTimeFormatter() {
        System.out.println("isValidDateTimeString");
        DateTimeFormatter format = Config.DATETIME_INPUT_FORMATTER;
        String date = "02/11/2017 09";
        boolean expResult = true;
        boolean result = Utilities.isValidDateTimeString(date, format);
        assertEquals(expResult, result);
        
        DateTimeFormatter format2 = Config.DATE_INPUT_FORMATTER;
        boolean expResult2 = false;
        boolean result2 = Utilities.isValidDateTimeString(date, format2);
        assertEquals(expResult2, result2);
        
    }

    /**
     * Test of isValidDate method, of class Utilities.
     */
    @Test
    public void testIsValidDate() {
        System.out.println("isValidDate");
        String date = "02/11/2017";
        boolean expResult = true;
        boolean result = Utilities.isValidDate(date);
        
        String date2 = "02/Nov/2017";
        boolean expResult2 = false;
        boolean result2 = Utilities.isValidDate(date2);
        assertEquals(expResult2, result2);
        
    }

    /**
     * Test of isValidEmail method, of class Utilities.
     */
    @Test
    public void testIsValidEmail() {
        System.out.println("isValidEmail");
        String email = "7314015@student.unpar.ac.id";
        boolean expResult = true;
        boolean result = Utilities.isValidEmail(email);
        assertEquals(expResult, result);
        
        String email2 = "7314015.student.unpar.ac.id";
        boolean expResult2 = false;
        boolean result2 = Utilities.isValidEmail(email2);
        assertEquals(expResult2, result2);
        
    }

    /**
     * Test of checkDateRange method, of class Utilities.
     */
    @Test
    public void testCheckDateRange() {
        System.out.println("checkDateRange");
        String date1 = "02/11/2017";
        String date2 = "02/11/2017";
        boolean expResult = true;
        boolean result = Utilities.checkDateRange(date1, date2);
        
        String date3 = "02/11/2017";
        String date4 = "01/11/2017";
        boolean expResult2 = false;
        boolean result2 = Utilities.checkDateRange(date3, date4);
        assertEquals(expResult2, result2);
       
    }

    /**
     * Test of isDateAfterToday method, of class Utilities.
     */
    @Test
    public void testIsDateAfterToday() {
        System.out.println("isDateAfterToday");
        String dt1 = "02/11/2017";
        boolean expResult = false;
        boolean result = Utilities.isDateAfterToday(dt1);
        assertEquals(expResult, result);
        
        String dt2 = "02/12/2017";
        boolean expResult2 = true;
        boolean result2 = Utilities.isDateAfterToday(dt2);
        assertEquals(expResult2, result2);
        
    }
    
}
