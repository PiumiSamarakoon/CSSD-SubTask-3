/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.AccountList;
import Models.UserList;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author piumi
 */
public class AccountRegistryTest {
    
    public AccountRegistryTest() {
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
     * Test of findAccount method, of class AccountRegistry.
     */
    @Test
    public void testFindAccount() {
        System.out.println("findAccount");
        String email = "punch@gmail.com";
        String password = "b";
        boolean expResult = true;
        boolean result = AccountRegistry.findAccount(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountID method, of class AccountRegistry.
     */
    @Test
    public void testGetAccountID() {
        System.out.println("getAccountID");
        String email = "punch@gmail.com";
        String password = "b";
        AccountRegistry.getAccountID(email, password);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountBalance method, of class AccountRegistry.
     */
    @Test
    public void testGetAccountBalance() {
        System.out.println("getAccountBalance");
        String AccountID = "1";
        AccountRegistry.getAccountBalance(AccountID);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

     /**
     * Test of getAccountBalance method, of class AccountRegistry.
     */
    @Test
    public void testVerifyAccount() {
        System.out.println("VerifyAccount");
        String SerialNo = "1";
        AccountRegistry.verifyAccount(SerialNo);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    /**
     * Test of Deserialize method, of class AccountRegistry.
     */
//    @Test
//    public void testDeserialize() {
//        System.out.println("Deserialize");
//        File filename = null;
//        AccountList expResult = null;
//        AccountList result = AccountRegistry.Deserialize(filename);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of Deserializeusers method, of class AccountRegistry.
     */
//    @Test
//    public void testDeserializeusers() {
//        System.out.println("Deserializeusers");
//        File filename = null;
//        UserList expResult = null;
//        UserList result = AccountRegistry.Deserializeusers(filename);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//    
}
