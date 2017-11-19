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

public class ListMeetingViewModelTest {

    public ListMeetingViewModelTest() {
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
     * Test of getMeeting_id method, of class ListMeetingViewModel.
     */
//    @Test
//    public void testGetMeeting_id() {
//        System.out.println("getMeeting_id");
//        ListMeetingViewModel instance = null;
//        int expResult = 0;
//        int result = instance.getMeeting_id();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of setMeeting_id method, of class ListMeetingViewModel.
     */
    @Test
    public void testSetMeeting_id() {
        System.out.println("setMeeting_id");
        int meeting_id = 0;
        ListMeetingViewModel instance = new ListMeetingViewModel(meeting_id, "Rapat dosen", MeetingStatus.negotiating);
        instance.setMeeting_id(meeting_id);
        // TODO review the generated test code and remove the default call to fail.

        //fail("The test case is a prototype.");
        //getMeetingId
        System.out.println("getMeeting_id");
        //ListMeetingViewModel instance = null;
        int expResult = 0;
        int result = instance.getMeeting_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        try {
//            assertEquals(expResult, result);
//        } catch (Exception e) {
//            System.out.println("Tidak sesuai ekspektasi");
//        }
    }

    /**
     * Test of getMeeting_title method, of class ListMeetingViewModel.
     */
//    @Test
//    public void testGetMeeting_title() {
//        System.out.println("getMeeting_title");
//        ListMeetingViewModel instance = null;
//        String expResult = "";
//        String result = instance.getMeeting_title();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of setMeeting_title method, of class ListMeetingViewModel.
     */
    @Test
    public void testSetMeeting_title() {
        System.out.println("setMeeting_title");
        String meeting_title = "Rapat dosen";
        //int meeting_id = 0;
        ListMeetingViewModel instance = new ListMeetingViewModel(0, meeting_title, MeetingStatus.negotiating);
        instance.setMeeting_title(meeting_title);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

        System.out.println("getMeeting_title");
        //ListMeetingViewModel instance = null;
        String expResult = "Rapat dosen";
        String result = instance.getMeeting_title();
        
        assertEquals(expResult, result);
//        try {
//            assertEquals(expResult, result);
//        } catch (Exception e) {
//            System.out.println("Tidak sesuai ekspektasi");
//        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMeeting_status method, of class ListMeetingViewModel.
     */
//    @Test
//    public void testGetMeeting_status() {
//        System.out.println("getMeeting_status");
//        ListMeetingViewModel instance = null;
//        MeetingStatus expResult = null;
//        MeetingStatus result = instance.getMeeting_status();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of setMeetingStatus method, of class ListMeetingViewModel.
     */
    @Test
    public void testSetMeetingStatus() {
        System.out.println("setMeetingStatus");
        MeetingStatus meeting_status = MeetingStatus.negotiating;
        ListMeetingViewModel instance = new ListMeetingViewModel(0, "Rapat dosen", meeting_status);
        instance.setMeetingStatus(meeting_status);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

        System.out.println("getMeeting_status");
        //ListMeetingViewModel instance = null;
        MeetingStatus expResult = MeetingStatus.negotiating;
        MeetingStatus result = instance.getMeeting_status();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        assertEquals(expResult, result);
//        try {
//            assertEquals(expResult, result);
//        } catch (Exception e) {
//            System.out.println("Tidak sesuai ekspektasi");
//        }

    }

}
