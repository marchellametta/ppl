/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.controller;

import com.mscheduler.model.User;
import java.util.List;
import org.easymock.EasyMock;
import org.easymock.EasyMockRule;
import org.easymock.EasyMockSupport;
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
public class UserControllerTest extends EasyMockSupport{
 
    public EasyMockRule rule = new EasyMockRule(this);
//
    @Mock
    private User usr = EasyMock.createMock(User.class); // 1
    
    @TestSubject
    private UserController uc; // 2
    
    public UserControllerTest() {
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
     * Test of getInstance method, of class UserController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        UserController expResult = UserController.getInstance();
        UserController result = UserController.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of loadUser method, of class UserController.
     */
    @Test
    public void testLoadUser() {
        System.out.println("loadUser");
        UserController instance = new UserController();
        int expResult = 6;
        List<User> result = instance.loadUser();
        assertEquals(expResult, result.size());
    }

    /**
     * Test of listUser method, of class UserController.
     */
    @Test
    public void testListUser() {
        System.out.println("listUser");
        UserController instance = new UserController();
        List<User> result = instance.listUser();
        String expResult = instance.listUser().get(0).getEmail();
        String res = result.get(0).getEmail();
        
        assertEquals(expResult, res);
    }

    /**
     * Test of listUsersAll method, of class UserController.
     */
    @Test
    public void testListUsersAll() {
        System.out.println("listUsersAll");
        UserController instance = new UserController();
        String expResult = instance.listUsersAll();
        String result = instance.listUsersAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of listUserAll method, of class UserController.
     */
    @Test
    public void testListUserAll() { //Boundary
        System.out.println("listUserAll");
        int page = 1;
        UserController instance = new UserController();
        String expResult = instance.listUserAll(page);
        String result = instance.listUserAll(page);
        assertEquals(expResult, result);
        
        System.out.println("listUserAll");
        int page2 = 0;
        UserController instance2 = new UserController();
        String expResult2 = instance2.listUserAll(page2);
        String result2 = instance2.listUserAll(page2);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of addUser method, of class UserController.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        UserController instance = new UserController();
        boolean expResult = false;
        boolean result = instance.addUser(usr);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkLogin method, of class UserController.
     */
    @Test
    public void testCheckLogin() {
        System.out.println("checkLogin");
        String email = "";
        String pass = "";
        UserController instance = new UserController();
        User userMock = EasyMock.createMock(User.class);
        EasyMock.expect(userMock.checkLoginDb(userMock)).andReturn(pass);
        EasyMock.replay(userMock);
        String expResult = "0";
        String result = instance.checkLogin(email, pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of editUser method, of class UserController.
     */
    @Test
    public void testEditUser() {
        System.out.println("editUser");
        String email = "clara@gmail.com";
        User userMock = EasyMock.createMock(User.class);
        UserController instance = new UserController();
        boolean expResult = false;
        boolean result = instance.editUser(email, userMock);
        assertEquals(expResult, result);
    }

    /**
     * Test of userEditAll method, of class UserController.
     */
    @Test
    public void testUserEditAll() {
        System.out.println("userEditAll");
        String email = "clara@mail.com";
        
        User userMock = EasyMock.createMock(User.class);
        EasyMock.expect(userMock.getEmail()).andReturn("");
        EasyMock.expectLastCall().anyTimes();
        EasyMock.expect(userMock.editAll(userMock)).andReturn(true);
        EasyMock.replay(userMock);
        UserController instance = new UserController();
        int expResult = 0;
        int result = instance.userEditAll(email, userMock);
        assertEquals(expResult, result);
    }

    /**
     * Test of userEditOne method, of class UserController.
     */
    @Test
    public void testUserEditOne() {
        System.out.println("userEditOne");
        String email = "";
        String condition = "";
        UserController instance = new UserController();
        User userMock = EasyMock.createMock(User.class);
        EasyMock.expect(userMock.getEmail()).andReturn("");
        EasyMock.expectLastCall().anyTimes();
        EasyMock.expect(userMock.readUserOne(email)).andReturn(userMock);
        EasyMock.replay(userMock);
        
        
        int expResult = 0;
        int result = instance.userEditOne(email, condition, userMock);
        assertEquals(expResult, result);
    }

    /**
     * Test of intEditUser method, of class UserController.
     */
    @Test
    public void testIntEditUser() {
        System.out.println("intEditUser");
        String email = "";
        UserController instance = new UserController();
        int expResult = 0;
        int result = instance.intEditUser(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of delUser method, of class UserController.
     */
    @Test
    public void testDelUser() {
        System.out.println("delUser");
        String email = "";
        UserController instance = new UserController();
        int expResult = 0;
        int result = instance.delUser(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of login method, of class UserController.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String email = "clara@mail.com";
        String password = "";
        UserController instance = new UserController();
        User result = instance.login(email, password);
        String res = result.getEmail();
        String expResult = instance.login(email, password).getEmail();
        
        assertEquals(expResult, res);
    }

    /**
     * Test of getUserByEmail method, of class UserController.
     */
    @Test
    public void testGetUserByEmail() {
        System.out.println("getUserByEmail");
        String email = "clara@mail.com";
        UserController instance = new UserController();
        User expResult = instance.getUserByEmail(email);
        User result = instance.getUserByEmail(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of existUser method, of class UserController.
     */
    @Test
    public void testExistUser() {
        System.out.println("existUser");
        String email = "clara@gmail.com";
        UserController instance = new UserController();
        boolean expResult = instance.existUser(email);
        boolean result = instance.existUser(email);
        assertEquals(expResult, result);
    }
    
}
