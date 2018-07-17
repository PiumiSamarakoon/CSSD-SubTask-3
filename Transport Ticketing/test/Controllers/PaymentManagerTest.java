/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

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
public class PaymentManagerTest {
    
    public PaymentManagerTest() {
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
     * Test of getOffer method, of class PaymentManager.
     */
//    @Test
//    public void testGetOffer() {
//        System.out.println("getOffer");
//        PaymentManager instance = null;
//        double expResult = 0.0;
//        double result = instance.getOffer();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSource method, of class PaymentManager.
//     */
//    @Test
//    public void testGetSource() {
//        System.out.println("getSource");
//        PaymentManager instance = null;
//        String expResult = "";
//        String result = instance.getSource();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDestination method, of class PaymentManager.
//     */
//    @Test
//    public void testGetDestination() {
//        System.out.println("getDestination");
//        PaymentManager instance = null;
//        String expResult = "";
//        String result = instance.getDestination();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTime method, of class PaymentManager.
//     */
//    @Test
//    public void testGetTime() {
//        System.out.println("getTime");
//        PaymentManager instance = null;
//        String expResult = "";
//        String result = instance.getTime();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDate method, of class PaymentManager.
//     */
//    @Test
//    public void testGetDate() {
//        System.out.println("getDate");
//        PaymentManager instance = null;
//        String expResult = "";
//        String result = instance.getDate();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getaccount method, of class PaymentManager.
//     */
//    @Test
//    public void testGetaccount() {
//        System.out.println("getaccount");
//        PaymentManager instance = null;
//        String expResult = "";
//        String result = instance.getaccount();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTransportType method, of class PaymentManager.
//     */
//    @Test
//    public void testGetTransportType() {
//        System.out.println("getTransportType");
//        PaymentManager instance = null;
//        String expResult = "";
//        String result = instance.getTransportType();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCost method, of class PaymentManager.
//     */
//    @Test
//    public void testGetCost() {
//        System.out.println("getCost");
//        PaymentManager instance = null;
//        double expResult = 0.0;
//        double result = instance.getCost();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class PaymentManager.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        PaymentManager instance = null;
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class PaymentManager.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        PaymentManager.main(args);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of checkOffers method, of class PaymentManager.
     */
    @Test
    public void testCheckOffers() {
        System.out.println("checkOffers");
        String Source = "London";
        String Dest = "Sheffield";
        String Date = "3-9-2018";
        String Time = "4.50";
        PaymentManager.checkOffers(Source, Dest, Date, Time);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
