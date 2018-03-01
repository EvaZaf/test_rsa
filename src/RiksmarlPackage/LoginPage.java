/**
 *
 * @author cgntuser
 */
package RiksmarlPackage;

import java.awt.Toolkit;//εχεις το δικαιωμα σε περιεργη ιστοσελιδα να βλεπεις εργαλεια
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;//προφύλαξη απο exceptions
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.applet.*;
import javax.swing.JApplet;
import java.net.*;

public class LoginPage extends javax.swing.JFrame{//  JApplet
    /**
     * Creates new form LoginPage
     */
    ResultSet rs=null;//=null;
    String roleuser;
    PreparedStatement pst=null;
    Connection con;
    Connection xampp;
    //HomePage homepage;
    //String passw;
    //String usern;
    public LoginPage() throws SQLException {
        this.setResizable(false);//remove maximize button from Jframe
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");// localhost
            xampp=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");       
            JOptionPane.showMessageDialog(null, "Συνδέθηκε επιτυχώς.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Δεν υπάρχει σύνδεση.\n");//+e
        }//catch
    }//public LoginPage
    
    public LoginPage(Role role){
        roleuser=role.getRole();
        initComponents();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        
        setIconImage(new ImageIcon("C:\\Users\\temp-user\\Documents\\NetBeansProjects\\RiksmarlApplication\\src\\RiksmarlPackage\\logo.png").getImage());
        setTitle("Riksmarl Application   |   Login Page");
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(37, 34, 34));

        jPanel1.setBackground(new java.awt.Color(0, 56, 64));
        jPanel1.setForeground(new java.awt.Color(0, 56, 64));

        jPanel2.setBackground(new java.awt.Color(37, 34, 34));
        jPanel2.setForeground(new java.awt.Color(37, 34, 34));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login Form");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");

        username.setBackground(new java.awt.Color(37, 34, 34));
        username.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");

        password.setBackground(new java.awt.Color(37, 34, 34));
        password.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(37, 34, 34));
        jButton1.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ΕΙΣΟΔΟΣ");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RiksmarlPackage/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(60, 60, 60)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(55, 55, 55)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Riksmarl");

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUICK EVALUATION!!!");

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("   For business.");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RiksmarlPackage/rsz_calculator.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Zafeiriou Evanthia");

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Supervisor: Panagiotis Batos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jSeparator5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addGap(64, 64, 64)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        String upassword = password.getText();
        String u_username = username.getText();
        System.out.println(upassword);
        System.out.println(u_username);
        try{
            xampp=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
            String sql="Select username,password,role from login ";
            System.out.println("AFTER SELECT login inside LoginPage");
            pst=xampp.prepareStatement(sql);
            rs=pst.executeQuery();
            String a="";
            while(rs.next()){//ανατρέχει όλα τα στοιχεία της βάσης μέχρι να βρεί το σωστό username & password
                if(upassword.equals(rs.getString("password")) && u_username.equals(rs.getString("username"))){
                    System.out.println("\nAFTER EQUALS PASSWORD & USERNAME");
                    a=rs.getString(3);
                    System.out.println("\nA= "+a);
                //----------------if user------------------//
                    if(a.equals("user")){
                        System.out.println("\nROLE= "+a+" Username= "+u_username+" Password= "+upassword);
                        System.out.println("\nAFTER EQUALS USER");
                        JOptionPane.showMessageDialog(null, "Καλως ήρθες "+u_username);//the connection is done
                        User user = new User(u_username,upassword);
                        new HomePage(user).setVisible(true);
                        System.out.println("The HomePage is opened.");
                        dispose();//close the window
                        break;
                    }//if user
                //----------------if admin------------------//
                    else if(a.equals("admin")){// if admin
                        System.out.println("\nELSE ROLE= "+a+" Username= "+u_username+" Password= "+upassword);
                        User user = new User(u_username,upassword);
                        System.out.println("\nELSE ROLE AFTER HomePageAdmin= "+a+" Username= "+u_username+" Password= "+upassword);
                        JOptionPane.showMessageDialog(null, "Καλως ήρθες "+u_username);
                        new  HomePageAdmin(user).setVisible(true);
                        dispose();//close the window
                        break;
                    }//else if
                    System.out.println("\nAFTER ELSE ROLE= "+a+" Username= "+u_username+" Password= "+upassword);
                }//if
            }//while
            if(a.equals("")){
                JOptionPane.showMessageDialog(null,"Λάθος στοιχεία.");
                username.setText("");
                password.setText("");
            }//if
            try {
                pst.close();
                xampp.close();
            }//try for close
            catch (SQLException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
             }//catch for close
        }//try
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Δεν υπάρχει σύνδεση στο δίκτυο.\nΞαναπροσπάθησε αργότερα.");//+e
            System.out.println(e.getMessage());
            username.setText("");
            password.setText("");
        }//catch
        }//if KEYEVENT 
    }//GEN-LAST:event_passwordKeyPressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String upassword = password.getText();
        String u_username = username.getText();
        System.out.println(upassword);
        System.out.println(u_username);
        try{
            xampp=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
            String sql="Select username,password,role from login ";
            System.out.println("AFTER SELECT login inside LoginPage");
            pst=xampp.prepareStatement(sql);
            rs=pst.executeQuery();
            String a="";
            while(rs.next()){//ανατρέχει όλα τα στοιχεία της βάσης μέχρι να βρεί το σωστό username & password
                if(upassword.equals(rs.getString("password")) && u_username.equals(rs.getString("username"))){
                    System.out.println("\nAFTER EQUALS PASSWORD & USERNAME");
                    a=rs.getString(3);
                    System.out.println("\nA= "+a);
                //----------------if user------------------//
                    if(a.equals("user")){
                        System.out.println("\nROLE= "+a+" Username= "+u_username+" Password= "+upassword);
                        System.out.println("\nAFTER EQUALS USER");
                        JOptionPane.showMessageDialog(null, "Καλως ήρθες "+u_username);//the connection is done
                        User user = new User(u_username,upassword);
                        new HomePage(user).setVisible(true);
                        System.out.println("The HomePage is opened.");
                        dispose();//close the window
                        break;
                    }//if user
                //----------------if admin------------------//
                    else if(a.equals("admin")){// if admin
                        System.out.println("\nELSE ROLE= "+a+" Username= "+u_username+" Password= "+upassword);
                        User user = new User(u_username,upassword);
                        System.out.println("\nELSE ROLE AFTER HomePageAdmin= "+a+" Username= "+u_username+" Password= "+upassword);
                        JOptionPane.showMessageDialog(null, "Καλως ήρθες "+u_username);
                        new  HomePageAdmin(user).setVisible(true);
                        dispose();//close the window
                        break;
                    }//else if
                    System.out.println("\nAFTER ELSE ROLE= "+a+" Username= "+u_username+" Password= "+upassword);
                }//if
            }//while
            if(a.equals("")){
                JOptionPane.showMessageDialog(null,"Λάθος στοιχεία.");
                username.setText("");
                password.setText("");
            }//if
            try {
                pst.close();
                xampp.close();
            }//try for close
            catch (SQLException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
             }//catch for close
        }//try
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Δεν υπάρχει σύνδεση στο δίκτυο.\nΞαναπροσπάθησε αργότερα.");//+e
            System.out.println(e.getMessage());
            username.setText("");
            password.setText("");
        }//catch
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           String upassword = password.getText();
        String u_username = username.getText();
        System.out.println(upassword);
        System.out.println(u_username);
        try{
            xampp=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
            String sql="Select username,password,role from login ";
            System.out.println("AFTER SELECT login inside LoginPage");
            pst=xampp.prepareStatement(sql);
            rs=pst.executeQuery();
            String a="";
            while(rs.next()){//ανατρέχει όλα τα στοιχεία της βάσης μέχρι να βρεί το σωστό username & password
                if(upassword.equals(rs.getString("password")) && u_username.equals(rs.getString("username"))){
                    System.out.println("\nAFTER EQUALS PASSWORD & USERNAME");
                    a=rs.getString(3);
                    System.out.println("\nA= "+a);
                //----------------if user------------------//
                    if(a.equals("user")){
                        System.out.println("\nROLE= "+a+" Username= "+u_username+" Password= "+upassword);
                        System.out.println("\nAFTER EQUALS USER");
                        JOptionPane.showMessageDialog(null, "Καλως ήρθες "+u_username);//the connection is done
                        User user = new User(u_username,upassword);
                        new HomePage(user).setVisible(true);
                        System.out.println("The HomePage is opened.");
                        dispose();//close the window
                        break;
                    }//if user
                //----------------if admin------------------//
                    else if(a.equals("admin")){// if admin
                        System.out.println("\nELSE ROLE= "+a+" Username= "+u_username+" Password= "+upassword);
                        User user = new User(u_username,upassword);
                        System.out.println("\nELSE ROLE AFTER HomePageAdmin= "+a+" Username= "+u_username+" Password= "+upassword);
                        JOptionPane.showMessageDialog(null, "Καλως ήρθες "+u_username);
                        new  HomePageAdmin(user).setVisible(true);
                        dispose();//close the window
                        break;
                    }//else if
                    System.out.println("\nAFTER ELSE ROLE= "+a+" Username= "+u_username+" Password= "+upassword);
                }//if
            }//while
            if(a.equals("")){
                JOptionPane.showMessageDialog(null,"Λάθος στοιχεία.");
                username.setText("");
                password.setText("");
            }//if
            try {
                pst.close();
                xampp.close();
            }//try for close
            catch (SQLException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
             }//catch for close
        }//try
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Δεν υπάρχει σύνδεση στο δίκτυο.\nΞαναπροσπάθησε αργότερα.");//+e
            System.out.println(e.getMessage());
            username.setText("");
            password.setText("");
        }//catch
        }//if KEYEVENT
    }//GEN-LAST:event_jButton1KeyPressed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        String upassword = password.getText();
        String u_username = username.getText();
        System.out.println(upassword);
        System.out.println(u_username);
        try{
            xampp=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
            String sql="Select username,password,role from login ";
            System.out.println("AFTER SELECT login inside LoginPage");
            pst=xampp.prepareStatement(sql);
            rs=pst.executeQuery();
            String a="";
            while(rs.next()){//ανατρέχει όλα τα στοιχεία της βάσης μέχρι να βρεί το σωστό username & password
                if(upassword.equals(rs.getString("password")) && u_username.equals(rs.getString("username"))){
                    System.out.println("\nAFTER EQUALS PASSWORD & USERNAME");
                    a=rs.getString(3);
                    System.out.println("\nA= "+a);
                //----------------if user------------------//
                    if(a.equals("user")){
                        System.out.println("\nROLE= "+a+" Username= "+u_username+" Password= "+upassword);
                        System.out.println("\nAFTER EQUALS USER");
                        JOptionPane.showMessageDialog(null, "Καλως ήρθες "+u_username);//the connection is done
                        User user = new User(u_username,upassword);
                        new HomePage(user).setVisible(true);
                        System.out.println("The HomePage is opened.");
                        dispose();//close the window
                        break;
                    }//if user
                //----------------if admin------------------//
                    else if(a.equals("admin")){// if admin
                        System.out.println("\nELSE ROLE= "+a+" Username= "+u_username+" Password= "+upassword);
                        User user = new User(u_username,upassword);
                        System.out.println("\nELSE ROLE AFTER HomePageAdmin= "+a+" Username= "+u_username+" Password= "+upassword);
                        JOptionPane.showMessageDialog(null, "Καλως ήρθες "+u_username);
                        new  HomePageAdmin(user).setVisible(true);
                        dispose();//close the window
                        break;
                    }//else if
                    System.out.println("\nAFTER ELSE ROLE= "+a+" Username= "+u_username+" Password= "+upassword);
                }//if
            }//while
            if(a.equals("")){
                JOptionPane.showMessageDialog(null,"Λάθος στοιχεία.");
                username.setText("");
                password.setText("");
            }//if
            try {
                pst.close();
                xampp.close();
            }//try for close
            catch (SQLException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
             }//catch for close
        }//try
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Δεν υπάρχει σύνδεση στο δίκτυο.\nΞαναπροσπάθησε αργότερα.");//+e
            System.out.println(e.getMessage());
            username.setText("");
            password.setText("");
        }//catch
      }//if KEYEVENT
    }//GEN-LAST:event_usernameKeyPressed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginPage().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
