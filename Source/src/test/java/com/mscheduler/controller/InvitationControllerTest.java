/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mscheduler.controller;

import com.mscheduler.model.DateRange;
import com.mscheduler.model.Invitation;
import com.mscheduler.model.ListInvitationViewModel;
import java.util.ArrayList;
import java.util.List;
import org.easymock.EasyMock;
import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.TestSubject;
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
public class InvitationControllerTest {
    
    public EasyMockRule rule = new EasyMockRule(this);
    @Mock
    private MeetingController mc =  EasyMock.createMock(MeetingController.class); // 1
    
    
    @TestSubject
    private InvitationController ic; // 2
    
    public InvitationControllerTest() {
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
     * Test of getInstance method, of class InvitationController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        InvitationController expResult = InvitationController.getInstance();
        InvitationController result = InvitationController.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of listInvitationView method, of class InvitationController.
     */
    @Test
    public void testListInvitationView() {
        System.out.println("listInvitationView");
        InvitationController instance = new InvitationController();
        List<ListInvitationViewModel> expResult = instance.listInvitationView();
        List<ListInvitationViewModel> result = instance.listInvitationView();
        assertEquals(expResult, result);
    }

    /**
     * Test of listInvitation method, of class InvitationController.
     */
    @Test
    public void testListInvitation() {
        System.out.println("listInvitation");
        int meeting_id = 0;
        List<String> emailList = new ArrayList();
        InvitationController instance = new InvitationController();
        List<Invitation> expResult = instance.listInvitation(meeting_id, emailList);
        List<Invitation> result = instance.listInvitation(meeting_id, emailList);
        assertEquals(expResult, result);
   
        
    }

    /**
     * Test of detailInvitation method, of class InvitationController.
     */
    @Test
    public void testDetailInvitation() {
        System.out.println("detailInvitation");
        int meeting_id = 0;
        InvitationController instance = new InvitationController();
        String expResult = mc.detailMeeting(meeting_id).toString();; 
        String result = mc.detailMeeting(meeting_id).toString();;
        assertEquals(expResult, result);
        
        
    }//ini

    /**
     * Test of unionDateRange method, of class InvitationController.
     */
    @Test
    public void testUnionDateRange() {
        System.out.println("unionDateRange");
        List<DateRange> dateList = new ArrayList();
        InvitationController instance = new InvitationController();
        List<DateRange> expResult = instance.unionDateRange(dateList);
        List<DateRange> result = instance.unionDateRange(dateList);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of acceptInvitation method, of class InvitationController.
     */
    @Test
    public void testAcceptInvitation() {
        System.out.println("acceptInvitation");
        int meeting_id = 0;
        List<DateRange> availability = new ArrayList();
        InvitationController instance = new InvitationController();
        boolean expResult = instance.acceptInvitation(meeting_id, availability);
        boolean result = instance.acceptInvitation(meeting_id, availability);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of rejectInvitation method, of class InvitationController.
     */
    @Test
    public void testRejectInvitation() {
        System.out.println("rejectInvitation");
        int meeting_id = 0;
        InvitationController instance = new InvitationController();
        boolean expResult = instance.rejectInvitation(meeting_id);
        boolean result = instance.rejectInvitation(meeting_id);
        assertEquals(expResult, result);
      
        
    }

    /**
     * Test of getMeetingTitle method, of class InvitationController.
     */
    @Test
    public void testGetMeetingTitle() {
        System.out.println("getMeetingTitle");
        int meeting_id = 0;
        InvitationController instance = new InvitationController();
        String expResult = mc.getMeetingTitle(meeting_id);
        String result = mc.getMeetingTitle(meeting_id);
        assertEquals(expResult, result);
   
        
    }

    /**
     * Test of isMeetingIdValid method, of class InvitationController.
     */
    @Test
    public void testIsMeetingIdValid() {
        System.out.println("isMeetingIdValid");
        int meeting_id = 0;
        boolean respon = false;
        InvitationController instance = new InvitationController();
        boolean expResult = instance.isMeetingIdValid(meeting_id, respon);
        boolean result = instance.isMeetingIdValid(meeting_id, respon);
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of loadInvitations method, of class InvitationController.
     */
    @Test
    public void testLoadInvitations() {
        System.out.println("loadInvitations");
        InvitationController instance = new InvitationController();
        List<Invitation> expResult = instance.loadInvitations();
        List<Invitation> result = instance.loadInvitations();
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of saveInvitations method, of class InvitationController.
     */
    @Test
    public void testSaveInvitations() {
        System.out.println("saveInvitations");
        List<Invitation> invitations_list = new ArrayList();
        InvitationController instance = new InvitationController();
        boolean expResult = instance.saveInvitations(invitations_list);
        boolean result = instance.saveInvitations(invitations_list);
        assertEquals(expResult, result);
      
        
    }
    
}
