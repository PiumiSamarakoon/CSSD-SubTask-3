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
        String email = "piumi@gmail.com";
        String password = "a";
        boolean expResult = true;
        boolean result = AccountRegistry.findAccount(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
     @Test
    public void testFindAccountFalse() {
        System.out.println("findAccount");
        String email = "piumi@gmail.com";
        String password = "abcd";
        boolean expResult = false;
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
        String email = "piumi@gmail.com";
        String password = "a";
        boolean expResult = true;
        boolean result = AccountRegistry.getAccountID(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetAccountIDFalse() {
        System.out.println("getAccountID");
        String email = "piumi@gmail.com";
        String password = "abd";
        boolean expResult = true;
        boolean result = AccountRegistry.getAccountID(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    

    /**
     * Test of getAccountBalance method, of class AccountRegistry.
     */
//    @Test
//    public void testGetAccountBalance() {
//        System.out.println("getAccountBalance");
//        String AccountID = "0";
//        AccountRegistry.getAccountBalance(AccountID);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of serializefile method, of class AccountRegistry.
     */
//    @Test
//    public void testSerializefile() {
//        System.out.println("serializefile");
//        AccountList accArr = null;
//        AccountRegistry instance = new AccountRegistry();
//        instance.serializefile(accArr);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

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
//
//    /**
//     * Test of Deserializeusers method, of class AccountRegistry.
//     */
//    @Test
//    public void testDeserializeusers() {
//        System.out.println("Deserializeusers");
//        File filename = null;
//        UserList expResult = null;
//        UserList result = AccountRegistry.Deserializeusers(filename);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
