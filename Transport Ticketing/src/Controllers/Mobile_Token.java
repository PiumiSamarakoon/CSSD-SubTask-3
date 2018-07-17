/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.MobileApp_Mobile;

/**
 *
 * @author piumi
 */
public class Mobile_Token implements Token {
    
    String AccountID;
    String EmailID;
    

   @Override
   public void createToken() {
       new MobileApp_Mobile().setVisible(true);

   }    
}
