/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.User;
import Models.UserList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 *
 * @author piumi
 */
public class MobileApp_SignUp extends javax.swing.JFrame {
    
    UserList <User> users = new UserList<User>();

    /**
     *
     */
    public static final File file = new File("User.txt");
    
    /**
     *
     * @param userArr
     */
    //serialize userArr
    public void Serialize(UserList userArr){
        try{
          
           FileOutputStream fos = new FileOutputStream(file);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(userArr);
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
    
    /**
     *
     * @param file
     * @return
     */
    //deserialize file
    public UserList Deserialize(File file){
        
         UserList d_arraylist = null;
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
           
          
            d_arraylist = (UserList)(UserList)ois.readObject();
            fis.close();
            System.out.println("Deserialized");
            System.out.println(d_arraylist);
        }
            
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } 
        catch(ClassCastException ex2){
            ex2.printStackTrace();
        }
       
        return d_arraylist;
    }

    
    /**
     * Creates new form SignUp
     */
    public MobileApp_SignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nameText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        cityText = new javax.swing.JTextField();
        postcodeText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 3, 24)); // NOI18N
        jLabel1.setText("TRAVEL ANYWHERE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setText("City");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setText("Post Code");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setText("Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));
        jPanel1.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 150, -1));
        jPanel1.add(addressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 150, -1));
        jPanel1.add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 150, -1));

        postcodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postcodeTextActionPerformed(evt);
            }
        });
        jPanel1.add(postcodeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 150, -1));
        jPanel1.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 150, -1));
        jPanel1.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 150, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("<< Back ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ka1 (1).jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
        
        String name = nameText.getText();
        String address = addressText.getText();
        String city = cityText.getText();
        String postcode = postcodeText.getText();
        String email = emailText.getText();
        String password =passwordText.getText();
        

        if (name.isEmpty() || address.isEmpty() || city.isEmpty() || postcode.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill All The Fileds!");
        }
        
        else if(!email.matches("^.+@.+\\..+$"))
        {
           
         JOptionPane.showMessageDialog(null, "Please Enter Email In Correct Format!");
             
        }else{
            User usr = new User(name, address, city, postcode, email, password);
            
            UserList <User> userArr = new UserList<User>();
            UserList <User> userArr2 = new UserList<User>();
            userArr2 = Deserialize(file);
            usr.setUserCount(userArr2.size());
            userArr.add(usr);

            
            Serialize(userArr);
            JOptionPane.showMessageDialog(null, "Account Succesfully Created! Please Click OK to Login ");
            new MobileApp_Login().setVisible(true);
            this.dispose();
            
            System.out.println("Checking again");
            for (int i=0;i<userArr.size();i++){
                User temp = (User)userArr.get(i);
                System.out.println("id:" + " " + temp.getID() + "name:" + " " + temp.getName() + " " + "Address:" + " " + temp.getAddress() + " " + "city:" + " " + temp.getCity() + " " + "Post Code:" + " " + temp.getPostCode() + " " + "email:" + " " + temp.getEmail() + " " + "password:" + " " + temp.getPassword());
            }           

   
        } 
//                          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new MobileApp_Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         nameText.setText("");
        addressText.setText("");
        cityText.setText("");
        postcodeText.setText("");
        emailText.setText("");
        passwordText.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void postcodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postcodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postcodeTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
         try {
          
      UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
    }
       
        catch(Exception e)
	{
            e.printStackTrace();
        }
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MobileApp_SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameText;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField postcodeText;
    // End of variables declaration//GEN-END:variables
}
