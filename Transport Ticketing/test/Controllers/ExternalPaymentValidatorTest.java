/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CardList;
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
public class ExternalPaymentValidatorTest {
    
    public ExternalPaymentValidatorTest() {
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
     * Test of paymentMethod method, of class ExternalPaymentValidator.
     */
    @Test
    public void testPaymentMethod() {
        System.out.println("paymentMethod");
        String cardnumber = "11111111";
        String pin = "111";
        String expirydate = "1-8-2018";
        ExternalPaymentValidator.paymentMethod(cardnumber, pin, expirydate);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
     @Test
    public void testPaymentMethod2() {
        System.out.println("paymentMethod");
        String cardnumber = "ggtt";
        String pin = "111";
        String expirydate = "1-8-2018";
        ExternalPaymentValidator.paymentMethod(cardnumber, pin, expirydate);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Deserialize method, of class ExternalPaymentValidator.
     */
//    @Test
//    public void testDeserialize() {
//        System.out.println("Deserialize");
//        File filename = null;
//        CardList expResult = null;
//        CardList result = ExternalPaymentValidator.Deserialize(filename);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
    
}
