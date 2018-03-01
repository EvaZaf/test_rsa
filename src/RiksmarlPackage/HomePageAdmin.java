/**
 *
 * @author cgntuser
 */
package RiksmarlPackage;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
//import java.sql.Statement;
//import java.text.SimpleDateFormat;
//import static javafx.scene.paint.Color.color;
//import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
//import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TableView;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.dbutils.DbUtils;
public class HomePageAdmin extends javax.swing.JFrame {
    //-------------Connection-----------//
    Connection con;//=null
    ResultSet rs=null;
    PreparedStatement pst=null;
    //----------------------------------//
    String username;//value for new cnstructor
    String password;
    public HomePageAdmin() {
          initComponents();
          try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
            //pst=con.createStatement();
            initComponents();
            JOptionPane.showMessageDialog(null, "Συνδέθηκε επιτυχώς..");
           }//try
          catch(Exception e){
            JOptionPane.showMessageDialog(null, "Δεν υπάρχει σύνδεση.");
        }//catch
    }//public HomePageAdmin
    
    public HomePageAdmin(User user){//apo User.java
        this.setResizable(false);
        System.out.print("epilogi1 window = "+username);
        username=user.getUsername();
        initComponents();
    }//public HomePageAdmin(User user)
    
    HomePageAdmin(User user, User pass) {
        password=pass.getPassword();
        username=user.getUsername();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("testxampp?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        loginQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM Login l");
        loginList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : loginQuery.getResultList();
        loginQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM Login l");
        loginList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : loginQuery1.getResultList();
        resultsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Results r");
        resultsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : resultsQuery.getResultList();
        averagerateofreturn_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Averagerateofreturn_1 a");
        averagerateofreturn_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : averagerateofreturn_1Query.getResultList();
        paybackperiodQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Paybackperiod p");
        paybackperiodList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : paybackperiodQuery.getResultList();
        select = new javax.swing.JPanel();
        Welcome = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        RegUserPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        RUsernamelabel = new javax.swing.JLabel();
        usName = new javax.swing.JTextField();
        psWord = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        role = new javax.swing.JTextField();
        RegUserBUTTON = new javax.swing.JButton();
        regUserScrolPane = new javax.swing.JScrollPane();
        jTableLogin = new javax.swing.JTable();
        deleteUserPanel = new javax.swing.JPanel();
        delete = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        deletebutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableforDelete = new javax.swing.JTable();
        userid = new javax.swing.JLabel();
        UserId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPaneNetPresentValue = new javax.swing.JScrollPane();
        jTableNPV = new javax.swing.JTable();
        jScrollPaneAverageROReturn = new javax.swing.JScrollPane();
        jTableAROR = new javax.swing.JTable();
        jScrollPanePaybackPeriod = new javax.swing.JScrollPane();
        jTablePP = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuTables = new javax.swing.JMenu();
        jMenuItemNPVprevious = new javax.swing.JMenuItem();
        jMenuItemPPprevious = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Register = new javax.swing.JMenu();
        RegisterUser = new javax.swing.JMenuItem();
        deleteUser = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        select.setBackground(new java.awt.Color(37, 34, 34));
        select.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(37, 34, 34));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(37, 34, 34));
        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome administrator!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel7)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout WelcomeLayout = new javax.swing.GroupLayout(Welcome);
        Welcome.setLayout(WelcomeLayout);
        WelcomeLayout.setHorizontalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        WelcomeLayout.setVerticalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        select.add(Welcome, "card4");
        Welcome.getAccessibleContext().setAccessibleDescription("");

        RegUserPanel.setBackground(new java.awt.Color(37, 34, 34));
        RegUserPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(37, 34, 34));
        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Κατέγραψε έναν καινούργιο χρήστη.");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N

        RUsernamelabel.setBackground(new java.awt.Color(37, 34, 34));
        RUsernamelabel.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        RUsernamelabel.setForeground(new java.awt.Color(255, 255, 255));
        RUsernamelabel.setText("Username:");

        usName.setBackground(new java.awt.Color(37, 34, 34));
        usName.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        usName.setForeground(new java.awt.Color(255, 255, 255));
        usName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usNameActionPerformed(evt);
            }
        });

        psWord.setBackground(new java.awt.Color(37, 34, 34));
        psWord.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        psWord.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(37, 34, 34));
        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");

        jLabel4.setBackground(new java.awt.Color(37, 34, 34));
        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Role:");

        role.setBackground(new java.awt.Color(37, 34, 34));
        role.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        role.setForeground(new java.awt.Color(255, 255, 255));
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        role.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                roleKeyPressed(evt);
            }
        });

        RegUserBUTTON.setBackground(new java.awt.Color(37, 34, 34));
        RegUserBUTTON.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        RegUserBUTTON.setForeground(new java.awt.Color(255, 255, 255));
        RegUserBUTTON.setText("Καταχώρηση");
        RegUserBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegUserBUTTONActionPerformed(evt);
            }
        });
        RegUserBUTTON.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RegUserBUTTONKeyPressed(evt);
            }
        });

        regUserScrolPane.setForeground(new java.awt.Color(255, 255, 255));

        jTableLogin.setBackground(new java.awt.Color(204, 204, 204));
        jTableLogin.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jTableLogin.setForeground(new java.awt.Color(37, 34, 34));
        jTableLogin.setSelectionBackground(new java.awt.Color(37, 34, 34));
        jTableLogin.setSelectionForeground(new java.awt.Color(153, 153, 153));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, loginList, jTableLogin);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${userID}"));
        columnBinding.setColumnName("User ID");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${username}"));
        columnBinding.setColumnName("Username");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${password}"));
        columnBinding.setColumnName("Password");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${role}"));
        columnBinding.setColumnName("Role");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableLogin.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableLoginComponentAdded(evt);
            }
        });
        regUserScrolPane.setViewportView(jTableLogin);

        javax.swing.GroupLayout RegUserPanelLayout = new javax.swing.GroupLayout(RegUserPanel);
        RegUserPanel.setLayout(RegUserPanelLayout);
        RegUserPanelLayout.setHorizontalGroup(
            RegUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegUserPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(RegUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegUserBUTTON)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegUserPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegUserPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(psWord, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegUserPanelLayout.createSequentialGroup()
                        .addComponent(RUsernamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regUserScrolPane, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(RegUserPanelLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegUserPanelLayout.setVerticalGroup(
            RegUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegUserPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(RegUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RUsernamelabel)
                            .addComponent(usName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(RegUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(psWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(RegUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(RegUserBUTTON)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(RegUserPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(regUserScrolPane, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        select.add(RegUserPanel, "card5");

        delete.setBackground(new java.awt.Color(37, 34, 34));
        delete.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(37, 34, 34));
        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Διέγραψε κάποιον χρήστη.");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N

        deletebutton.setBackground(new java.awt.Color(37, 34, 34));
        deletebutton.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        deletebutton.setForeground(new java.awt.Color(255, 255, 255));
        deletebutton.setText("Διαγραφή");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        deletebutton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deletebuttonKeyPressed(evt);
            }
        });

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jTableforDelete.setBackground(new java.awt.Color(204, 204, 204));
        jTableforDelete.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jTableforDelete.setForeground(new java.awt.Color(37, 34, 34));
        jTableforDelete.setSelectionBackground(new java.awt.Color(37, 34, 34));
        jTableforDelete.setSelectionForeground(new java.awt.Color(153, 153, 153));

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, loginList1, jTableforDelete);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${userID}"));
        columnBinding.setColumnName("User ID");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${username}"));
        columnBinding.setColumnName("Username");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${password}"));
        columnBinding.setColumnName("Password");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${role}"));
        columnBinding.setColumnName("Role");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTableforDelete);

        userid.setBackground(new java.awt.Color(37, 34, 34));
        userid.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        userid.setForeground(new java.awt.Color(255, 255, 255));
        userid.setText("userId:");

        UserId.setBackground(new java.awt.Color(37, 34, 34));
        UserId.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        UserId.setForeground(new java.awt.Color(255, 255, 255));
        UserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIdActionPerformed(evt);
            }
        });
        UserId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserIdKeyPressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(37, 34, 34));
        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Πληκτρολόγισε το User ID του");

        jLabel6.setBackground(new java.awt.Color(37, 34, 34));
        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("χρήστη που θέλεις να διαγράψεις.");

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(deleteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addComponent(deletebutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(deleteLayout.createSequentialGroup()
                                .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UserId, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userid)
                            .addComponent(UserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124)
                        .addComponent(deletebutton)
                        .addGap(80, 80, 80))))
        );

        javax.swing.GroupLayout deleteUserPanelLayout = new javax.swing.GroupLayout(deleteUserPanel);
        deleteUserPanel.setLayout(deleteUserPanelLayout);
        deleteUserPanelLayout.setHorizontalGroup(
            deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
            .addGroup(deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteUserPanelLayout.setVerticalGroup(
            deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
            .addGroup(deleteUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        select.add(deleteUserPanel, "card7");

        jScrollPaneNetPresentValue.setBackground(new java.awt.Color(37, 34, 34));
        jScrollPaneNetPresentValue.setForeground(new java.awt.Color(255, 255, 255));

        jTableNPV.setBackground(new java.awt.Color(204, 204, 204));
        jTableNPV.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jTableNPV.setForeground(new java.awt.Color(37, 34, 34));
        jTableNPV.setSelectionBackground(new java.awt.Color(37, 34, 34));
        jTableNPV.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTableNPV.getTableHeader().setReorderingAllowed(false);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, resultsList, jTableNPV);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${username}"));
        columnBinding.setColumnName("Username");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${arxkostos}"));
        columnBinding.setColumnName("Arxkostos");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${xronia}"));
        columnBinding.setColumnName("Xronia");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${epitokio}"));
        columnBinding.setColumnName("Epitokio");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${result}"));
        columnBinding.setColumnName("Result");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableNPV.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableNPVComponentAdded(evt);
            }
        });
        jTableNPV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNPVMouseClicked(evt);
            }
        });
        jScrollPaneNetPresentValue.setViewportView(jTableNPV);

        select.add(jScrollPaneNetPresentValue, "card5");

        jTableAROR.setBackground(new java.awt.Color(204, 204, 204));
        jTableAROR.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jTableAROR.setForeground(new java.awt.Color(37, 34, 34));
        jTableAROR.setSelectionBackground(new java.awt.Color(37, 34, 34));
        jTableAROR.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTableAROR.getTableHeader().setReorderingAllowed(false);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, averagerateofreturn_1List, jTableAROR);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${username}"));
        columnBinding.setColumnName("Username");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${arxkostos}"));
        columnBinding.setColumnName("Arxkostos");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${xronia}"));
        columnBinding.setColumnName("Xronia");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kostoskefalaiou}"));
        columnBinding.setColumnName("Kostoskefalaiou");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${result}"));
        columnBinding.setColumnName("Result");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPaneAverageROReturn.setViewportView(jTableAROR);

        select.add(jScrollPaneAverageROReturn, "card6");

        jTablePP.setBackground(new java.awt.Color(204, 204, 204));
        jTablePP.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jTablePP.setForeground(new java.awt.Color(37, 34, 34));
        jTablePP.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTablePP.setSelectionForeground(new java.awt.Color(37, 34, 34));
        jTablePP.getTableHeader().setReorderingAllowed(false);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, paybackperiodList, jTablePP);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${username}"));
        columnBinding.setColumnName("Username");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${arxkostos}"));
        columnBinding.setColumnName("Arxkostos");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${xronia}"));
        columnBinding.setColumnName("Xronia");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${epitokio}"));
        columnBinding.setColumnName("Epitokio");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${epithimitoEtos}"));
        columnBinding.setColumnName("Epithimito Etos");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${etosEpaneispraksis}"));
        columnBinding.setColumnName("Etos Epaneispraksis");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${result}"));
        columnBinding.setColumnName("Result");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPanePaybackPeriod.setViewportView(jTablePP);

        select.add(jScrollPanePaybackPeriod, "card7");

        getContentPane().add(select, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(37, 35, 35));
        jMenuBar1.setForeground(new java.awt.Color(37, 35, 35));
        jMenuBar1.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(37, 35, 35));
        jMenu1.setText("Αρχική Σελίδα");
        jMenu1.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenuTables.setBackground(new java.awt.Color(255, 255, 255));
        jMenuTables.setForeground(new java.awt.Color(37, 35, 35));
        jMenuTables.setText("Προβολή προηγούμενων αποτελεσμάτων");
        jMenuTables.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jMenuTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTablesActionPerformed(evt);
            }
        });

        jMenuItemNPVprevious.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemNPVprevious.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jMenuItemNPVprevious.setForeground(new java.awt.Color(37, 35, 35));
        jMenuItemNPVprevious.setText("Καθαρής Παρούσας Αξίας");
        jMenuItemNPVprevious.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItemNPVprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNPVpreviousActionPerformed(evt);
            }
        });
        jMenuTables.add(jMenuItemNPVprevious);

        jMenuItemPPprevious.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemPPprevious.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jMenuItemPPprevious.setForeground(new java.awt.Color(37, 35, 35));
        jMenuItemPPprevious.setText("Περιόδου Επανείσπραξης");
        jMenuItemPPprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPPpreviousActionPerformed(evt);
            }
        });
        jMenuTables.add(jMenuItemPPprevious);

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(37, 35, 35));
        jMenuItem1.setText("Μέσης Απόδοσης");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuTables.add(jMenuItem1);

        jMenuBar1.add(jMenuTables);

        Register.setBackground(new java.awt.Color(255, 255, 255));
        Register.setForeground(new java.awt.Color(37, 35, 35));
        Register.setText("Διαχείρηση χρηστών");
        Register.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        RegisterUser.setBackground(new java.awt.Color(255, 255, 255));
        RegisterUser.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        RegisterUser.setForeground(new java.awt.Color(37, 35, 35));
        RegisterUser.setText("Καταχώρηση χρήστη");
        RegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterUserActionPerformed(evt);
            }
        });
        Register.add(RegisterUser);

        deleteUser.setBackground(new java.awt.Color(255, 255, 255));
        deleteUser.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        deleteUser.setForeground(new java.awt.Color(37, 35, 35));
        deleteUser.setText("Διαγραφή χρήστη");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });
        Register.add(deleteUser);

        jMenuBar1.add(Register);

        setJMenuBar(jMenuBar1);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void updateLogin(){
        loginQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM Login l");
        loginList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : loginQuery.getResultList();
               
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, loginList, jTableLogin);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${userID}"));
        columnBinding.setColumnName("User ID");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${username}"));
        columnBinding.setColumnName("Username");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${password}"));
        columnBinding.setColumnName("Password");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${role}"));
        columnBinding.setColumnName("Role");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableLogin.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableLoginComponentAdded(evt);
            }
        });
        regUserScrolPane.setViewportView(jTableLogin);
}//private void updateLogin

private void updateLoginDelete(){
        loginQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM Login l");
        loginList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : loginQuery1.getResultList();
        
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, loginList1, jTableforDelete);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${userID}"));
        columnBinding.setColumnName("User ID");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${username}"));
        columnBinding.setColumnName("Username");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${password}"));
        columnBinding.setColumnName("Password");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${role}"));
        columnBinding.setColumnName("Role");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTableforDelete);
}//private void updateLoginDelete

    private void jMenuItemNPVpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNPVpreviousActionPerformed
        select.removeAll();
        select.add(jScrollPaneNetPresentValue);
        select.repaint();
        select.revalidate();
    }//GEN-LAST:event_jMenuItemNPVpreviousActionPerformed

    private void jMenuItemPPpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPPpreviousActionPerformed
        select.removeAll();
        select.add(jScrollPanePaybackPeriod);
        select.repaint();
        select.revalidate();
    }//GEN-LAST:event_jMenuItemPPpreviousActionPerformed

    private void jMenuTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuTablesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        select.removeAll();
        select.add(jScrollPaneAverageROReturn);
        select.repaint();
        select.revalidate();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
       
    }//GEN-LAST:event_RegisterActionPerformed

    private void RegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterUserActionPerformed
        select.removeAll();
        updateLogin();
        select.add(RegUserPanel);
        select.repaint();
        select.revalidate();
    }//GEN-LAST:event_RegisterUserActionPerformed

    private void usNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usNameActionPerformed

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleActionPerformed

    private void RegUserBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegUserBUTTONActionPerformed
            String u=usName.getText();
            String p=psWord.getText();
            String r=role.getText();
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
                    String sql="Select username,password,role from login ";
                    pst=con.prepareStatement(sql);
                    rs=pst.executeQuery();
                    boolean isWrong=false;
                    while(rs.next()){
                        if(u.equals(rs.getString("username"))){//&&p.equals(rs.getString("password")) &&r.equals(rs.getString("role"))
                            usName.setText("");
                            psWord.setText("");
                            role.setText("");
                            u="";
                            p="";
                            r="";
                            isWrong=true;
                            JOptionPane.showMessageDialog(null, "Υπάρχει ήδη εγγεγραμμένος χρήστης με αυτό το username.\nΞαναπροσπάθισε με διαφορετικό.");
                        }//if
                    }//while rs.next()
                    if(!u.isEmpty() &&!p.isEmpty() && !r.isEmpty()){//if isNotEmpty username, password & role
                        if(role.getText().equals("admin")||role.getText().equals("user")){//if role= admin OR user
                            String query = "INSERT INTO login(username, password, role) VALUES (?,?,?)";
                            pst=con.prepareStatement(query);
                            pst.setString(1, u);//usName.getText()
                            pst.setString(2, p);//psWord.getText()
                            pst.setString(3, r);//role.getText()
                            pst.executeUpdate();
                            pst.close();
                            con.close();
                            System.out.println("Ο χρήστης καταχωρήθηκε.");
                            int dialogButton= JOptionPane.YES_NO_OPTION;
                            int dialogResult = JOptionPane.showConfirmDialog (null, "Ο χρήστης καταχωρήθηκε.\nΘέλεις να καταχωρήσεις και άλλον χρήστη?","Warning",dialogButton);
                            if(dialogResult == JOptionPane.YES_OPTION){
                                usName.setText("");
                                psWord.setText("");
                                role.setText("");
                                u="";
                                p="";
                                r="";
                            }//if you want to register another user
                        }//if
                        else{//if role != user OR admin
                            //usName.setText("");
                            //psWord.setText("");
                            role.setText("");
                            //u="";
                            //p="";
                            r="";
                            JOptionPane.showMessageDialog(null, "Ο ρόλος του χρήστη πρέπει να είναι είτε user είτε admin.");
                        }//else
                        //isWrong=false;
                    }//if isNotEmpty
                    else if ((u.isEmpty() || p.isEmpty() || r.isEmpty()) && isWrong==false){
                        JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσεις όλα τα πεδία.");//+isWrong
                    }//else
                    updateLogin();
                    RegUserPanel.revalidate();
                }//try 
                catch(Exception e){
                    System.out.println(e);
                }//catch     
    }//GEN-LAST:event_RegUserBUTTONActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        // TODO add your handling code here:
        select.removeAll();
        updateLoginDelete();
        select.add(deleteUserPanel);
        select.repaint();
        select.revalidate();
    }//GEN-LAST:event_deleteUserActionPerformed

    private void jTableNPVComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableNPVComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableNPVComponentAdded

    private void jTableNPVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNPVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableNPVMouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        select.removeAll();
        select.add(Welcome);
        select.repaint();
        select.revalidate();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void UserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIdActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        //------------------DELETE USER---------------------//
        String id=UserId.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
            String sql="Select userID from login ";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            boolean notMatches=true;
            while(rs.next()){
                if(id.equals(rs.getString("userID")) && !id.equals("")){
                    String query = "Delete from login where userID=?";//WORKS
                    pst=con.prepareStatement(query);
                    pst.setString(1, id);//usName.getText()
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Ο χρήστης με id = "+UserId.getText()+" διαγράφτηκε.");
                    System.out.println("Ο χρήστης διαγράφτηκε.");
                    notMatches=false;
                }//if
            }//while
            if(notMatches==true && !id.isEmpty()){//!id.isEmpty()
                JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσεις το σωστό id του χρήστη.");
            }//if
            else if(id.isEmpty()){//if id != ""
                JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσεις το id του χρήστη\nπου θέλεις να διαγράψεις.");
                id="";
            }//else
            UserId.setText("");
            updateLoginDelete();
            deleteUserPanel.revalidate();
        }//try
        catch (Exception e) {
            System.out.println("Exception occured!\n"+e);
        }//catch
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void jTableLoginComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableLoginComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableLoginComponentAdded

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        select.removeAll();
        select.add(Welcome);
        select.repaint();
        select.revalidate();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
        
    }//GEN-LAST:event_jMenu1MousePressed

    private void RegUserBUTTONKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegUserBUTTONKeyPressed
        //--------FOR REGISTER USER-------//
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String u=usName.getText();
            String p=psWord.getText();
            String r=role.getText();
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
                    String sql="Select username,password,role from login ";
                    pst=con.prepareStatement(sql);
                    rs=pst.executeQuery();
                    boolean isWrong=false;
                    while(rs.next()){
                        if(u.equals(rs.getString("username"))){//&&p.equals(rs.getString("password")) &&r.equals(rs.getString("role"))
                            usName.setText("");
                            psWord.setText("");
                            role.setText("");
                            u="";
                            p="";
                            r="";
                            isWrong=true;
                            JOptionPane.showMessageDialog(null, "Υπάρχει ήδη εγγεγραμμένος χρήστης με αυτό το username.\nΞαναπροσπάθισε με διαφορετικό.");
                        }//if
                    }//while rs.next()
                    if(!u.isEmpty() &&!p.isEmpty() && !r.isEmpty()){//if isNotEmpty username, password & role
                        if(role.getText().equals("admin")||role.getText().equals("user")){//if role= admin OR user
                            String query = "INSERT INTO login(username, password, role) VALUES (?,?,?)";
                            pst=con.prepareStatement(query);
                            pst.setString(1, u);//usName.getText()
                            pst.setString(2, p);//psWord.getText()
                            pst.setString(3, r);//role.getText()
                            pst.executeUpdate();
                            pst.close();
                            con.close();
                            System.out.println("Ο χρήστης καταχωρήθηκε.");
                            int dialogButton= JOptionPane.YES_NO_OPTION;
                            int dialogResult = JOptionPane.showConfirmDialog (null, "Ο χρήστης καταχωρήθηκε.\nΘέλεις να καταχωρήσεις και άλλον χρήστη?","Warning",dialogButton);
                            if(dialogResult == JOptionPane.YES_OPTION){
                                usName.setText("");
                                psWord.setText("");
                                role.setText("");
                                u="";
                                p="";
                                r="";
                            }//if you want to register another user
                        }//if
                        else{//if role != user OR admin
                            //usName.setText("");
                            //psWord.setText("");
                            role.setText("");
                            //u="";
                            //p="";
                            r="";
                            JOptionPane.showMessageDialog(null, "Ο ρόλος του χρήστη πρέπει να είναι είτε user είτε admin.");
                        }//else
                        //isWrong=false;
                    }//if isNotEmpty
                    else if ((u.isEmpty() || p.isEmpty() || r.isEmpty()) && isWrong==false){
                        JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσεις όλα τα πεδία.");//+isWrong
                    }//else
                    updateLogin();
                    RegUserPanel.revalidate();
                }//try 
                catch(Exception e){
                    System.out.println(e);
                }//catch   
        }//if KEYEVENT
    }//GEN-LAST:event_RegUserBUTTONKeyPressed

    private void roleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roleKeyPressed
        //---------FOR REGISTER USER------------//
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String u=usName.getText();
            String p=psWord.getText();
            String r=role.getText();
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
                    String sql="Select username,password,role from login ";
                    pst=con.prepareStatement(sql);
                    rs=pst.executeQuery();
                    boolean isWrong=false;
                    while(rs.next()){
                        if(u.equals(rs.getString("username"))){//&&p.equals(rs.getString("password")) &&r.equals(rs.getString("role"))
                            usName.setText("");
                            psWord.setText("");
                            role.setText("");
                            u="";
                            p="";
                            r="";
                            isWrong=true;
                            JOptionPane.showMessageDialog(null, "Υπάρχει ήδη εγγεγραμμένος χρήστης με αυτό το username.\nΞαναπροσπάθισε με διαφορετικό.");
                        }//if
                    }//while rs.next()
                    if(!u.isEmpty() &&!p.isEmpty() && !r.isEmpty()){//if isNotEmpty username, password & role
                        if(role.getText().equals("admin")||role.getText().equals("user")){//if role= admin OR user
                            String query = "INSERT INTO login(username, password, role) VALUES (?,?,?)";
                            pst=con.prepareStatement(query);
                            pst.setString(1, u);//usName.getText()
                            pst.setString(2, p);//psWord.getText()
                            pst.setString(3, r);//role.getText()
                            pst.executeUpdate();
                            pst.close();
                            con.close();
                            System.out.println("Ο χρήστης καταχωρήθηκε.");
                            int dialogButton= JOptionPane.YES_NO_OPTION;
                            int dialogResult = JOptionPane.showConfirmDialog (null, "Ο χρήστης καταχωρήθηκε.\nΘέλεις να καταχωρήσεις και άλλον χρήστη?","Warning",dialogButton);
                            if(dialogResult == JOptionPane.YES_OPTION){
                                usName.setText("");
                                psWord.setText("");
                                role.setText("");
                                u="";
                                p="";
                                r="";
                            }//if you want to register another user
                        }//if
                        else{//if role != user OR admin
                            //usName.setText("");
                            //psWord.setText("");
                            role.setText("");
                            //u="";
                            //p="";
                            r="";
                            JOptionPane.showMessageDialog(null, "Ο ρόλος του χρήστη πρέπει να είναι είτε user είτε admin.");
                        }//else
                        //isWrong=false;
                    }//if isNotEmpty
                    else if ((u.isEmpty() || p.isEmpty() || r.isEmpty()) && isWrong==false){
                        JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσεις όλα τα πεδία.");//+isWrong
                    }//else
                    updateLogin();
                    RegUserPanel.revalidate();
                }//try 
                catch(Exception e){
                    System.out.println(e);
                }//catch 
        }//if KEYEVENT
    }//GEN-LAST:event_roleKeyPressed

    private void deletebuttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deletebuttonKeyPressed
     if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            //------------------DELETE USER---------------------//
        String id=UserId.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
            String sql="Select userID from login ";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            boolean notMatches=true;
            while(rs.next()){
                if(id.equals(rs.getString("userID")) && !id.equals("")){
                    String query = "Delete from login where userID=?";//WORKS
                    pst=con.prepareStatement(query);
                    pst.setString(1, id);//usName.getText()
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Ο χρήστης με id = "+UserId.getText()+" διαγράφτηκε.");
                    System.out.println("Ο χρήστης διαγράφτηκε.");
                    notMatches=false;
                }//if
            }//while
            if(notMatches==true && !id.isEmpty()){//!id.isEmpty()
                JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσεις το σωστό id του χρήστη.");
            }//if
            else if(id.isEmpty()){//if id != ""
                JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσεις το id του χρήστη\nπου θέλεις να διαγράψεις.");
                id="";
            }//else
            UserId.setText("");
            updateLoginDelete();
            deleteUserPanel.revalidate();
        }//try
        catch (Exception e) {
            System.out.println("Exception occured!\n"+e);
        }//catch
            
      }//if KEYEVENT
    }//GEN-LAST:event_deletebuttonKeyPressed

    private void UserIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserIdKeyPressed
     if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            //------------------DELETE USER---------------------//
        String id=UserId.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
            String sql="Select userID from login ";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            boolean notMatches=true;
            while(rs.next()){
                if(id.equals(rs.getString("userID")) && !id.equals("")){
                    String query = "Delete from login where userID=?";//WORKS
                    pst=con.prepareStatement(query);
                    pst.setString(1, id);//usName.getText()
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Ο χρήστης με id = "+UserId.getText()+" διαγράφτηκε.");
                    System.out.println("Ο χρήστης διαγράφτηκε.");
                    notMatches=false;
                }//if
            }//while
            if(notMatches==true && !id.isEmpty()){//!id.isEmpty()
                JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσεις το σωστό id του χρήστη.");
            }//if
            else if(id.isEmpty()){//if id != ""
                JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσεις το id του χρήστη\nπου θέλεις να διαγράψεις.");
                id="";
            }//else
            UserId.setText("");
            updateLoginDelete();
            deleteUserPanel.revalidate();
        }//try
        catch (Exception e) {
            System.out.println("Exception occured!\n"+e);
        }//catch
            
      }//if KEYEVENT
    }//GEN-LAST:event_UserIdKeyPressed

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
            java.util.logging.Logger.getLogger(HomePageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RUsernamelabel;
    private javax.swing.JButton RegUserBUTTON;
    private javax.swing.JPanel RegUserPanel;
    private javax.swing.JMenu Register;
    private javax.swing.JMenuItem RegisterUser;
    private javax.swing.JTextField UserId;
    private javax.swing.JPanel Welcome;
    private java.util.List<RiksmarlPackage.Averagerateofreturn_1> averagerateofreturn_1List;
    private javax.persistence.Query averagerateofreturn_1Query;
    private javax.swing.JPanel delete;
    private javax.swing.JMenuItem deleteUser;
    private javax.swing.JPanel deleteUserPanel;
    private javax.swing.JButton deletebutton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemNPVprevious;
    private javax.swing.JMenuItem jMenuItemPPprevious;
    private javax.swing.JMenu jMenuTables;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneAverageROReturn;
    private javax.swing.JScrollPane jScrollPaneNetPresentValue;
    private javax.swing.JScrollPane jScrollPanePaybackPeriod;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableAROR;
    private javax.swing.JTable jTableLogin;
    private javax.swing.JTable jTableNPV;
    private javax.swing.JTable jTablePP;
    private javax.swing.JTable jTableforDelete;
    private java.util.List<RiksmarlPackage.Login> loginList;
    private java.util.List<RiksmarlPackage.Login> loginList1;
    private javax.persistence.Query loginQuery;
    private javax.persistence.Query loginQuery1;
    private java.util.List<RiksmarlPackage.Paybackperiod> paybackperiodList;
    private javax.persistence.Query paybackperiodQuery;
    private javax.swing.JPasswordField psWord;
    private javax.swing.JScrollPane regUserScrolPane;
    private java.util.List<RiksmarlPackage.Results> resultsList;
    private javax.persistence.Query resultsQuery;
    private javax.swing.JTextField role;
    private javax.swing.JPanel select;
    private javax.swing.JTextField usName;
    private javax.swing.JLabel userid;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
