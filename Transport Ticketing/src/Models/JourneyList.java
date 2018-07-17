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

   public class JourneyList <DynamicJourney> extends Vector<DynamicJourney>  {
    
    
    private static final long serialVersionUID = 1L;
    
    
    //call methods in the super class
    public JourneyList()
        {
            super();
        }

    /**
     *
     * @param account
     * @return
     */
    //add account details
    public boolean addJourneyList(DynamicJourney account) {
		return this.add(account);
	}

    /**
     *
     * @param account
     * @return
     */
    //remove account details
    public boolean removeJourney(DynamicJourney account) {
		return this.remove(account);		
	}

  
     
}
