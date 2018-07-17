/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Vector;

/**
 *
 * @author piumi
 */
public class PaymentObjectList<Payment> extends Vector<Payment> {
    
    private static final long serialVersionUID = 1L;

    //call methods in the super class
    public PaymentObjectList()
        {
            super();
        }

   
    public boolean addPaymentList(Payment payment) {
		return this.add(payment);
	}

   
    public boolean removePayment(Payment payment) {
		return this.remove(payment);		
	}

}
