/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.AccountList;
import Models.TransactionList;
import Models.UserList;
import Views.Login;
import Views.MobileApp_JourneySchedule;
import Views.Mobile_App_PaymentFactory;
import Views.Select_Device;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author piumi
 */
public class AccountRegistry {
    
    /**
     *
     * @param email
     * @param password
     * @return
     */
    
    //method to find the account from email & password 
    public static boolean findAccount(String email,String password)
     {
       if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill All Fileds!");
            new Login().setVisible(true);
        } else {
            
            UserList <User> userArr = null;           //declare user array
            userArr = new UserList <User>();          //create new user array
            userArr = (UserList <User>) Deserializeusers(file1);   //deserialize file

            try {
                boolean login = false;

                for (int i = 0; i < userArr.size(); i++) {
                    User temp = (User) userArr.get(i);
                    if (email.equals(temp.getEmail()) && password.equals(temp.getPassword())) {
                        login = true;
                        
                    }
                }
                if (login == true) {
                    JOptionPane.showMessageDialog(null, "Successfully Logged In");
                    
                    try {
                        new MobileApp_JourneySchedule().setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(AccountRegistry.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        

                return true;
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Email or Password");
                    new Login().setVisible(true);
                    return false;
                }
            } catch (NullPointerException exc) {
                exc.printStackTrace();
            }

        }
       return true;
        
     }
    
    /**
     *
     * @param email
     * @param password
     */
    
    // method to get account ID
    public static void getAccountID(String email,String password)
    {
            UserList <User> userArr = null;       //declare user array
            userArr = new UserList <User>();        //create new user array
            userArr = (UserList <User>) Deserializeusers(file1);     //deserialize file

        for (int i = 0; i < userArr.size(); i++) {
                    User temp = (User) userArr.get(i);
                    
           if (email.equals(temp.getEmail()) && password.equals(temp.getPassword())) {

                MobileApp_JourneySchedule.accountid.setText(String.valueOf(temp.getID()));

            }             
       
    
        }
    }
    
    /**
     *
     * @param AccountID
     */
    
    //method to get account balance
    public static void getAccountBalance(String AccountID)
    {
           AccountList<Account> accArr = null;       //declare accArr 
           accArr = new AccountList<Account>();         //create new accArr 
           accArr = (AccountList<Account>) Deserialize(file);     //deserialize file

        for (int i = 0; i < accArr.size(); i++) {
            Account temp = (Account) accArr.get(i);
           if (AccountID.equals(temp.getaccID())) {

                Mobile_App_PaymentFactory.balance.setText(String.valueOf(temp.getbalance()));

            }             
       
    
        }
    }
    
     public static void checkjourney(String  AccountID)
    {
           AccountList<Account> accArr = new AccountList<>();       //declare accArr 
//           accArr = new AccountList<Account>();         //create new accArr 
           accArr =Deserialize(file);     //deserialize file

        for (int i = 0; i < accArr.size(); i++) {
            Account temp = (Account) accArr.get(i);
           if ((AccountID.equals(temp.getaccID()) && (Account.getDynamicID()==0)))  
          {
              
           int res; 
                   res = JOptionPane.showConfirmDialog(null, "Dynamic Journey Doesn't Exits. Do you want to create a Dynamic Journey?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
           if (res == JOptionPane.YES_OPTION) {
                        new Views.EntryGate_DynamicJourney().setVisible(true);
           
          }
          }
        }   

            
    }
     
     
       public static void verifyAccount(String SerialNo){
        
          // TransactionList <TransactionRecord> recArr = new TransactionList<TransactionRecord>();
          TransactionList<TransactionRecord> recArr = null;       //declare accArr 
          recArr = new TransactionList<TransactionRecord>();         //create new accArr 
          recArr = (TransactionList<TransactionRecord>) DeserializeFile(file2);
          
          for(int i=0; i<recArr.size();i++){
              TransactionRecord temp = (TransactionRecord) recArr.get(i);
              if(SerialNo.equals(temp.getSerialNo())){
              
           //  ExitGate_Stop_journey.idbox.setText(String.valueOf(temp.getSerialNo()));
                   
              }
          }
    }
    
    AccountList<Account> accounts = new AccountList<Account>();

    /**
     *
     */
    public static final File file = new File("Account.txt");

    /**
     *
     * @param filename
     * @return
     */
    public static AccountList Deserialize(File filename) {

        AccountList d_arraylist = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            d_arraylist = (AccountList) ois.readObject();
            fis.close();
            System.out.println("Deserialized");
            System.out.println(d_arraylist);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return d_arraylist;
    }

    UserList <User> users = new UserList <User>();

    /**
     *
     */
    public static final File file1 = new File("User.txt");

    /**
     *
     * @param filename
     * @return
     */
    public static UserList Deserializeusers(File filename) {

        UserList d_arraylist = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            d_arraylist = (UserList) ois.readObject();
            fis.close();
            System.out.println("Deserialized");
            System.out.println(d_arraylist);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return d_arraylist;
    }

    

TransactionList<TransactionRecord> transactions = new TransactionList<TransactionRecord>();

    public static final File file2 = new File("TransactionRecord.txt");

    
    
  public static TransactionList DeserializeFile(File filename) {

        TransactionList d_arraylist = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            d_arraylist = (TransactionList) ois.readObject();
            fis.close();
            System.out.println("Deserialized");
            System.out.println(d_arraylist);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return d_arraylist;
    }

    
}
