/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.controller;

import com.mscheduler.model.DateRange;
import com.mscheduler.model.Invitation;
import com.mscheduler.model.InvitationStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;
import org.easymock.*;
import com.mscheduler.model.Meeting;
import com.mscheduler.model.MeetingStatus;
import com.mscheduler.model.Schedule;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Marchella Metta
 */
public class MeetingControllerTest extends EasyMockSupport{
 
    public EasyMockRule rule = new EasyMockRule(this);
//
    @Mock
    private InvitationController ic =  EasyMock.createMock(InvitationController.class); // 1
    private SchedulerController sc =  EasyMock.createMock(SchedulerController.class);

    @TestSubject
    private MeetingController mc; // 2

    public MeetingControllerTest() {
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
    
    @Test
    public void testCreateMeeting(){ //Boundary
        System.out.println("createMeeting");
        List<String> participants1 = new ArrayList();
        participants1.add("Acel,Clara,Elia");
        List<String> important_participants1 = new ArrayList();
        participants1.add("Ko Clau");
        List<String> participants2 = new ArrayList();
        List<String> important_participants2 = new ArrayList();
        Meeting m1 = new Meeting(10,"Rapat Mingguan","Membahas apa saja", "9014", 2, new DateRange("02-06-2017 - 31-12-2017"), new Date(),participants1,important_participants1, MeetingStatus.negotiating,
        new DateRange("02-06-2017 - 31-12-2017"),false);
        Meeting m2 = new Meeting(10,"Rapat Mingguan","Membahas apa saja", "9014", 2, new DateRange("02-06-2017 - 31-12-2017"), new Date(),participants2,important_participants2, MeetingStatus.negotiating,
        new DateRange("02-06-2017 - 31-12-2017"),false);
        boolean expResult = true;
        
        List<Invitation> mockList = EasyMock.createMock(List.class);
         
        expect(ic.loadInvitations()).andReturn(mockList);
        expect(ic.saveInvitations(anyObject())).andReturn(true);
        replay(ic);
        
        mc = new MeetingController(ic);
        try{
            boolean result1 = mc.createMeeting(m1);
            assertEquals(expResult,result1);
            boolean result2 = mc.createMeeting(m2);
            assertEquals(expResult,result2);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }

    }
    
    @Test
    public void testUpdateMeeting(){
        System.out.println("updateMeeting");
        List<String> participants = new ArrayList();
        participants.add("Acel,Clara,Elia");
        List<String> important_participants = new ArrayList();
        participants.add("Ko Clau");
        Meeting m = new Meeting(10,"Rapat Mingguan","Membahas apa saja", "9014", 2, new DateRange("02-06-2017 - 31-12-2017"), new Date(),participants,important_participants, MeetingStatus.negotiating,
        new DateRange("02-06-2017 - 31-12-2017"),false);
        MeetingStatus expResult = MeetingStatus.confirmed;

        List<Invitation> mockList = EasyMock.createMock(List.class);
         
        expect(ic.loadInvitations()).andReturn(mockList);
        expect(ic.saveInvitations(anyObject())).andReturn(true);
        replay(ic);
        
        mc = new MeetingController(ic);
        try{
            boolean temp = mc.updateMeeting(m, MeetingStatus.confirmed, InvitationStatus.confirmed);
            MeetingStatus result = m.getStatus();
            assertEquals(expResult,result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }
    
    @Test
    public void testUpdateMeetingStatus(){
        System.out.println("updateMeeting");
        List<String> participants = new ArrayList();
        participants.add("Acel,Clara,Elia");
        List<String> important_participants = new ArrayList();
        participants.add("Ko Clau");
        Meeting m = new Meeting(10,"Rapat Mingguan","Membahas apa saja", "9014", 2, new DateRange("02-06-2017 - 31-12-2017"), new Date(),participants,important_participants, MeetingStatus.negotiating,
        new DateRange("02-06-2017 - 31-12-2017"),false);
        MeetingStatus expResult = MeetingStatus.confirmed;
        
        List<Invitation> mockList = EasyMock.createMock(List.class);
         
        expect(ic.loadInvitations()).andReturn(mockList); 
        expect(ic.saveInvitations(anyObject())).andReturn(true);
        replay(ic);
        
        mc = new MeetingController(ic);
        try{
            boolean temp = mc.updateMeeting(m, MeetingStatus.confirmed, InvitationStatus.confirmed);
            MeetingStatus result = m.getStatus();
            assertEquals(expResult,result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }
    
    @Test
    public void testCancelMeeting(){
        System.out.println("cancelMeeting");
        List<String> participants = new ArrayList();
        participants.add("Acel,Clara,Elia");
        List<String> important_participants = new ArrayList();
        participants.add("Ko Clau");
        Meeting m = new Meeting(10,"Rapat Mingguan","Membahas apa saja", "9014", 2, new DateRange("02-06-2017 - 31-12-2017"), new Date(),participants,important_participants, MeetingStatus.negotiating,
        new DateRange("02-06-2017 - 31-12-2017"),false);
        MeetingStatus expResult = MeetingStatus.canceled;
        
        List<Invitation> mockList = EasyMock.createMock(List.class);
         
        expect(ic.loadInvitations()).andReturn(mockList); 
        expect(ic.saveInvitations(anyObject())).andReturn(true);
        replay(ic);
        
        mc = new MeetingController(ic);
        try{
            boolean temp = mc.cancelMeeting(m.getId());
            MeetingStatus result = m.getStatus();
            assertEquals(expResult,result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }
    
    @Test
    public void testRunScheduler(){
        System.out.println("runScheduler");
        List<String> participants = new ArrayList();
        participants.add("Acel,Clara,Elia");
        List<String> important_participants = new ArrayList();
        participants.add("Ko Clau");
        Meeting m = new Meeting(10,"Rapat Mingguan","Membahas apa saja", "9014", 2, new DateRange("02-06-2017 - 31-12-2017"), new Date(),participants,important_participants, MeetingStatus.negotiating,
        new DateRange("02-06-2017 - 31-12-2017"),false);
        int expResult = 1;
        
        Schedule s = EasyMock.createMock(Schedule.class);
         
        expect(sc.runSchedule(m.getId())).andReturn(s);
        expect(s.getDate()).andReturn(new DateRange("02/11/2017 09 - 02-11-2017 11"));
        replay(sc);
        
        mc = new MeetingController(ic);
        try{
            int result = mc.runScheduler(m.getId());
            assertEquals(expResult,result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }
}
