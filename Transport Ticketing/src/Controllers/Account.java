/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.AccountList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author piumi
 */
public class Account implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    //declare variables
    String accID;
    String card;
    String balance;
   

    
    /**
     *
     * @param accID
     * @param card
     * @param balance
     */
    //constructor
    public Account(String accID,String card,String balance)
    {
            //initialize variables
            this.accID=accID;
            this.card=card;
            this.balance=balance;
//          this.dynamicjourney=dynamicjourney;
    }
    
    /**
     *
     * @return accID
     */
    public String getaccID() {
      return accID;
    }
    
    /**
     *
     * @param accID
     */
    public void setaccID(String accID){
            this.accID = accID;
    }

    /**
     *
     * @return card
     */
    public String getcard() {
      return card;
    }
    
    /**
     *
     * @param card
     */
    public void setcard(String card){
            this.card = card;
    }

    /**
     *
     * @return balance
     */
    public String getbalance() {
      return balance;
    }
    
    /**
     *
     * @param balance
     */
    public void setbalance(String balance){
            this.balance = balance;
    }
    
   
    /**
     *
     * @return user email
     */
//    public String getUserEmail() {
//      return user.UserEmail;
//    }
//
//    /**
//     *
//     * @return password
//     */
//    public String getpassword() {
//      return user.UserPassword;
//    }
    
    /**
     *
     * @return transaction history
     */
//    public String gettransactionHistory() {
//      return transactionHistory;
//    }
//
//    /**
//     *
//     * @param transactionHistory
//     */
//    public void settransactionHistory(String transactionHistory){
//            this.transactionHistory = transactionHistory;
//    }
     
    
  
      @Override
    public String toString() {
     
         return "Account ID : "+ accID +" Card : "+card+" Balance : "+balance;
     }


     private static class Serialization {
         
         //serialization method
	
	public static void serializeObject(AccountList<Account> accountList) throws IOException{
		
		FileOutputStream fos = new FileOutputStream(new File("Account.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(accountList);
		oos.flush();
		oos.close();
	}
        
	//deserialization method
	public static AccountList<Account> deserializeObject() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(new File("Account.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		AccountList<Account> accountList = (AccountList<Account>)ois.readObject();
		ois.close();
		return accountList;
	}

}  

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
            
//            DynamicJourney dj=new  DynamicJourney(dynamicjourney.source,dynamicjourney.destination,dynamicjourney.date,dynamicjourney.time);
//            User u1 = new User("Harry","34/2,Park Road","London","0002","harry@gmail.com","harry");
//            User u2 = new User("Peter","33/7,Castle Road","London","0002","peter@gmail.com","peter");
//            User u3 = new User("Ann","84/4,Mary Road","Leeds","0062","ann@gmail.com","ann"); 
          
          
            Account A1 = new Account("1","111111111","0");
//            Account A2 = new Account("2","222222222","0",u2,"Good");
//            Account A3 = new Account("3","333333333","0",u3,"Good");
           
            
                 
	AccountList<Account> accountList = new AccountList<Account>();
		accountList.add(A1);
//		accountList.add(A2);
//		accountList.add(A3);
          

		try {
			Account.Serialization.serializeObject(accountList);

			for (Account account : Account.Serialization.deserializeObject()) {
				System.out.println(account);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}

