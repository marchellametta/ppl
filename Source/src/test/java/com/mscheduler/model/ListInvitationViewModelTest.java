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
public class ListInvitationViewModelTest {
    
    public ListInvitationViewModelTest() {
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

//    /**
//     * Test of getMeeting_id method, of class ListInvitationViewModel.
//     */
//    @Test
//    public void testGetMeeting_id() {
//        System.out.println("getMeeting_id");
//        ListInvitationViewModel instance = null;
//        int expResult = 0;
//        int result = instance.getMeeting_id();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setMeeting_id method, of class ListInvitationViewModel.
     */
    @Test
    public void testSetMeeting_id() {
        System.out.println("setMeeting_id");
        int meeting_id = 2;
        ListInvitationViewModel instance = new ListInvitationViewModel(1,"Rapat Mingguan", InvitationStatus.accepted);
        instance.setMeeting_id(meeting_id);
        int result = instance.getMeeting_id();
        try{
            assertEquals(meeting_id, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }

//    /**
//     * Test of getMeeting_title method, of class ListInvitationViewModel.
//     */
//    @Test
//    public void testGetMeeting_title() {
//        System.out.println("getMeeting_title");
//        ListInvitationViewModel instance = null;
//        String expResult = "";
//        String result = instance.getMeeting_title();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setMeeting_title method, of class ListInvitationViewModel.
     */
    @Test
    public void testSetMeeting_title() {
        System.out.println("setMeeting_title");
        String meeting_title = "";
        ListInvitationViewModel instance = new ListInvitationViewModel(1,"Rapat Mingguan", InvitationStatus.accepted);
        instance.setMeeting_title(meeting_title);
        String result = instance.getMeeting_title();
        // TODO review the generated test code and remove the default call to fail.
        try{
            assertEquals(meeting_title, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }

//    /**
//     * Test of getInvitation_status method, of class ListInvitationViewModel.
//     */
//    @Test
//    public void testGetInvitation_status() {
//        System.out.println("getInvitation_status");
//        ListInvitationViewModel instance = null;
//        InvitationStatus expResult = null;
//        InvitationStatus result = instance.getInvitation_status();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setInvitation_status method, of class ListInvitationViewModel.
     */
    @Test
    public void testSetInvitation_status() {
        System.out.println("setInvitation_status");
        InvitationStatus invitation_status = null;
        ListInvitationViewModel instance = new ListInvitationViewModel(1,"Rapat Mingguan", InvitationStatus.accepted);
        instance.setInvitation_status(invitation_status);
        InvitationStatus result = instance.getInvitation_status();
        try{
            assertEquals(invitation_status, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }
    
}
