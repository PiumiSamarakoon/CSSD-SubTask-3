/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.PaymentList;
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
public class RouteInformationTest {
    
    public RouteInformationTest() {
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
     * Test of serializeObject method, of class RouteInformation.
     */
    @Test
    public void testSerializeObject() throws Exception {
        System.out.println("serializeObject");
        PaymentList<PaymentManager> routeList = null;
        RouteInformation.serializeObject(routeList);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of deserializeObject method, of class RouteInformation.
     */
    @Test
    public void testDeserializeObject() throws Exception {
        System.out.println("deserializeObject");
        PaymentList<PaymentManager> expResult = null;
        PaymentList<PaymentManager> result = RouteInformation.deserializeObject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of searchJourneys method, of class RouteInformation.
     */
    @Test
    public void testSearchJourneys() throws Exception {
        System.out.println("searchJourneys");
        RouteInformation instance = new RouteInformation();
        PaymentList<PaymentManager> expResult = null;
        PaymentList<PaymentManager> result = instance.searchJourneys();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
