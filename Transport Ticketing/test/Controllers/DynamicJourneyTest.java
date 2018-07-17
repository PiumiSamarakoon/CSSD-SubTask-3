/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author DELL
 */
public class DynamicJourneyTest {
    
    public DynamicJourneyTest(){
        
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
    public void testaddDestinationstop() {
        System.out.println("addDestination");
        String source_stop = "";
        String destination_stop = "";
        String DateOfpurchase = "";
        AccountRegistry.verifyAccount(destination_stop);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of findAccount method, of class AccountRegistry.
     */
    @Test
    public void testcheckjourneycomplete() {
        System.out.println("checkjournycomplete");
        String destination_stop = "";
        AccountRegistry.verifyAccount(destination_stop);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
