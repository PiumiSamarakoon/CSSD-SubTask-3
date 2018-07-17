/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

/**
 *
 * @author piumi
 */
public class TokenMaker {
    
    private Token mobile;
    private Token email;
    

   public TokenMaker() {
      mobile = new Mobile_Token();
      email = new Email_Token();
      
   }

   public void createMobileToken(){
      mobile.createToken();
   }
   public void createEmailToken(){
      email.createToken();
   }
   
}
