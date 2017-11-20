/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.controller;

import com.mscheduler.model.DateRange;
import com.mscheduler.model.Invitation;
import com.mscheduler.model.InvitationStatus;
import com.mscheduler.model.Meeting;
import com.mscheduler.model.MeetingStatus;
import com.mscheduler.model.Schedule;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.easymock.EasyMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
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
     * Test of updateAcceptParticipant method, of class SchedulerController.
     */
    
    @Test
    public void testUpdateAcceptParticipant() {
        System.out.println("updateAcceptParticipant");
        List<String> participants = new ArrayList();
        participants.add("Acel,Clara,Elia");
        List<String> important_participants = new ArrayList();
        participants.add("Ko Clau");
        Meeting m = new Meeting(10, "Rapat Mingguan", "Membahas apa saja", "9014", 2, new DateRange("02-06-2017 - 31-12-2017"), new Date(), participants, important_participants, MeetingStatus.negotiating,
                new DateRange("02-06-2017 - 31-12-2017"), false);
        boolean expResult = true;
        List<Invitation> mockList = EasyMock.createMock(List.class);
        List<Schedule> schmock = new ArrayList();
        InvitationController ic = EasyMock.createMock(InvitationController.class);
        Invitation i = EasyMock.createMock(Invitation.class);
        
        expect(ic.listInvitation(m.getId(), m.getParticipants())).andReturn(mockList);
        List<DateRange> availability = new ArrayList();
        availability.add(new DateRange("02-06-2017 - 31-12-2017"));
        i.setAvailability(availability);
        expect(ic.acceptInvitation(10, availability)).andReturn(true);
        schmock.stream().filter(x-> x.getDate().isBetweenAny(i.getAvailability())).collect(Collectors.toList());
        EasyMock.expectLastCall().anyTimes();
        

        if(schmock.isEmpty()){
            expResult = true;
        }
        replay(ic,i,mockList);
        SchedulerController instance = new SchedulerController();
        try {
            List<Schedule> tempList = instance.updateAcceptParticipant(schmock, m);
            boolean result = tempList.isEmpty();
            assertEquals(expResult, result);
        } catch (Exception e) {
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }
}
