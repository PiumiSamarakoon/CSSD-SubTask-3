/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.AccountList;
import Models.UserList;
import Views.MobileApp_Login;
import Views.MobileApp_JourneySchedule;
import Views.MobileApp_ReservationDetails;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
            new MobileApp_Login().setVisible(true);
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
                    new MobileApp_Login().setVisible(true);
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
    public static boolean getAccountID(String email,String password)
    {
            UserList <User> userArr = null;       //declare user array
            userArr = new UserList <User>();        //create new user array
            userArr = (UserList <User>) Deserializeusers(file1);     //deserialize file

        for (int i = 0; i < userArr.size(); i++) {
                    User temp = (User) userArr.get(i);
                    
           if (email.equals(temp.getEmail()) && password.equals(temp.getPassword())) {

                MobileApp_JourneySchedule.accountid.setText(String.valueOf(temp.getID()));
                return true;
            }             
       
    
        }
        return true;
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

                MobileApp_ReservationDetails.balance.setText(String.valueOf(temp.getbalance()));

            }             
       
    
        }
    }
    
        

    
    
    AccountList<Account> accounts = new AccountList<Account>();

    public static final File file = new File("Account.txt");

    
        public void serializefile(AccountList accArr){
        try{
          
           java.io.FileOutputStream fos = new java.io.FileOutputStream(file);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(accArr);
            fos.close();
            System.out.println("Serialized");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
          
    }
    
    
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
}