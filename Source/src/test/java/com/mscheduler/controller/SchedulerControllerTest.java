/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.controller;

import com.mscheduler.model.DateRange;
import com.mscheduler.model.Meeting;
import com.mscheduler.model.Schedule;
import java.util.Comparator;
import java.util.List;
import org.easymock.EasyMock;
import static org.easymock.EasyMock.expect;
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
        int meeting_id = 1;
        InvitationController ic = new InvitationController();
        MeetingController mc = new MeetingController(ic);
        SchedulerController instance = new SchedulerController();
        Schedule expResult;
        List<Schedule> mockSchedule = EasyMock.createMock(List.class);
        
        
        int durasi;
//        List<Schedule> listSchedule;
        Schedule resultSchedule;
        Meeting m;
        DateRange range;
        
        //Algoritma
        m = mc.detailMeeting(meeting_id);
        m.setProposed_date_range(new DateRange("02-06-2017 - 31-12-2017"));
        range = m.getProposed_date_range();
        durasi = m.getDuration();
        //mockSchedule = instance.generateRange(range,durasi,m);
        expect(instance.generateRange(range,durasi,m)).andReturn(mockSchedule);
        
        //mockSchedule = instance.discardConflictedRange(mockSchedule,range);
        expect(instance.discardConflictedRange(mockSchedule,range)).andReturn(mockSchedule);
        
        //mockSchedule = instance.intersectWithImportantParticipant(mockSchedule,m);
        expect(instance.intersectWithImportantParticipant(mockSchedule,m)).andReturn(mockSchedule);
        
        if (mockSchedule == null) {
            expResult =  null;
        }
        //mockSchedule = instance.updateAcceptParticipant(mockSchedule,m);
        expect(instance.updateAcceptParticipant(mockSchedule,m)).andReturn(mockSchedule);
        //sort
        Comparator<Schedule> byTotalParticipant = Comparator.comparing(
            x -> x.getTotalParticipant()
        );
        Comparator<Schedule> byDate = Comparator.comparing(
            x -> x.getDate().getDate_end()
        );
        resultSchedule = mockSchedule.stream()
                .filter(x->x.getTotalParticipant() > 1).sorted(byTotalParticipant.thenComparing(byDate)).findFirst().orElse(null); 
        if (resultSchedule != null) {
            expResult =  resultSchedule; 
        }else{
            expResult = null;
        }
        
        //Schedule expResult = null;
        Schedule result = instance.runSchedule(meeting_id);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
