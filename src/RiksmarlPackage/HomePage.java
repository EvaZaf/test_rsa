/**
 *
 * @author cgntuser
 */
package RiksmarlPackage;

//import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.swing.ImageIcon;
import net.proteanit.sql.DbUtils;

public class HomePage extends javax.swing.JFrame {//CLEAR BUTTON  JPanel  implements PaybackFunction.resetInterface
    AverageRateOfReturn a;
    NetPresentValue nvfinal;
    PaybackFunction p;
    //-------------Connection-----------//
    Connection con;//=null
    ResultSet rs=null;
    PreparedStatement pst=null;
    //----------------------------------//
    String username;//value for new cnstructor User
    String password;//value for new cnstructor Pass
    ArrayList<javax.swing.JTextField> list = new ArrayList<javax.swing.JTextField>();
    ArrayList<javax.swing.JLabel> LabelList= new ArrayList<javax.swing.JLabel>();
    public HomePage() {
        //this.a = new AverageRateOfReturn(new User(username));//timh tou username
        initComponents();
         try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
            initComponents();
            JOptionPane.showMessageDialog(null, "Συνδέθηκε επιτυχώς."); 
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Δεν υπάρχει σύνδεση.");
         }//catch
         System.out.println(" Inside HomePage");
    }//public epilogi
    public HomePage(User user){     
        //this.setResizable(false);
        username=user.getUsername();
        a = new AverageRateOfReturn(user.getUsername());//apo User.java
        p=new PaybackFunction(user.getUsername());//p=new PaybackFunction(user.getUsername(),this);
        nvfinal=new NetPresentValue(user.getUsername());
        System.out.println("Inside HomePage\nUsername ="+username+" a= "+a+" p= "+p);
        initComponents();
    }
    public HomePage(User user, User pass) {
        password=pass.getPassword();
        username=user.getUsername();
        a = new AverageRateOfReturn(user.getUsername());//apo User.java
        p=new PaybackFunction(user.getUsername());//p=new PaybackFunction(user.getUsername(),this);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public HomePage(String username, String password){//apo User.java
        //this.setResizable(false);
        this.username=username;
        this.username=username;
        initComponents();
        System.out.println(this.username+" After init getUsername inside HomePage.java");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jMenu3 = new javax.swing.JMenu();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("testxampp?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        resultsQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Results r WHERE r.username = :username").setParameter("username", username);
        resultsList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : resultsQuery1.getResultList();
        //averagerateofreturn_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Averagerateofreturn_1 a WHERE a.username = :username").setParameter("username", username);
        //averagerateofreturn_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : averagerateofreturn_1Query.getResultList();
        //paybackperiodQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Paybackperiod p WHERE p.username = :username").setParameter("username", username);
        //paybackperiodList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : paybackperiodQuery.getResultList();
        resultsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Results r WHERE r.username = :username").setParameter("username", username);
        resultsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : resultsQuery.getResultList();
        averagerateofreturn_1Query1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Averagerateofreturn_1 a WHERE a.username = :username").setParameter("username", username);
        averagerateofreturn_1List1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : averagerateofreturn_1Query1.getResultList();
        paybackperiodQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Paybackperiod p WHERE p.username = :username").setParameter("username", username);
        paybackperiodList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : paybackperiodQuery1.getResultList();
        select = new javax.swing.JPanel();
        Details = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPaneNetPresentValue = new javax.swing.JScrollPane();
        jTableNPV = new javax.swing.JTable();
        jScrollPaneAverageROReturn = new javax.swing.JScrollPane();
        jTableAROR = new javax.swing.JTable();
        jScrollPanePaybackPeriod = new javax.swing.JScrollPane();
        jTablePP = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuDetails = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNPV = new javax.swing.JMenuItem();
        jMenuItemPP = new javax.swing.JMenuItem();
        jMenuItemAROR = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemNPVprevious = new javax.swing.JMenuItem();
        jMenuItemPPprevious = new javax.swing.JMenuItem();
        jMenuItemARORprevious = new javax.swing.JMenuItem();
        //--------------Home Page--------------//
		jTextArea1.setEditable(false);
		jTextArea2.setEditable(false);
		jTextArea3.setEditable(false);
                
        //---------------setIconImage & setTitle for window-----------------//
        setIconImage(new ImageIcon("C:\\Users\\temp-user\\Documents\\NetBeansProjects\\RiksmarlApplication\\src\\RiksmarlPackage\\logo.png").getImage());
        setTitle("Riksmarl Application   |   Login for User: "+username+"    |   Home Page Calculator");
        
        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        select.setBackground(new java.awt.Color(37, 34, 34));
        select.setPreferredSize(new java.awt.Dimension(914, 630));
        select.setLayout(new java.awt.CardLayout());

        Details.setBackground(new java.awt.Color(37, 34, 34));

        jTextArea1.setBackground(new java.awt.Color(37, 34, 34));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Book Antiqua", 1, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Η Καθαρή Παρούσα Αξία (Net Present Value, NPV) είναι το άθροισμα των παρουσών αξιών των εισερχόμενων και\n εξερχόμενων ταμειακών ροών κατά τη διάρκεια μιας χρονικής περιόδου. Μετράει το πλεόνασμα ή την έλλειψη\nταμειακών ροών, σε όρους παρούσας αξίας, σε σχέση με το κόστος κεφαλαίων που χρησιμοποιήθηκαν για μία \nεπένδυση.\nΤο κριτήριο για την αξιολόγηση της επένδυσης είναι: \n- ΚΠΑ > 0\tΗ επένδυση γίνεται αποδεκτή\n-ΚΠΑ = 0\tΗ επένδυση θεωρείται οριακή ή αδιάφορη\n-ΚΠΑ < 0\tΗ επένδυση δεν πρέπει να γίνει αποδεκτή\n");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setBackground(new java.awt.Color(37, 34, 34));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Book Antiqua", 1, 15)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("Η μέθοδος της Περιόδου Επανείσπραξης (Payback Period) δείχνει το χρονικό διάστημα μέσα στο οποίο ένα \nεπενδυτικό έργο θα αποδώσει την αρχική του επένδυση. Αν η περίοδος επανείσπραξης είναι μικρότερη ή \nίση από την επιθυμιτή περίοδο επανείσπραξης τότε η επένδυση γίνεται αποδεκτή, διαφορετικά η επένδυση\nαπορρίπτεται.");
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setBackground(new java.awt.Color(37, 34, 34));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Book Antiqua", 1, 15)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setRows(5);
        jTextArea3.setText("Η μέθοδος της Μέσης Απόδοσης δείχνει το ετήσιο καθαρό κέρδος το οποίο θα έχει κατά μέση όρο μια επιχείρηση \nαπό την αποδοχή ενός επενδυτικού έργου. Αν η μέση απόδοση είναι μεγαλύτερη από την απαιτούμενη απόδοση \nτότε η επένδυση γίνεται αποδεκτή, ενώ αν η μέση απόδοση είναι μικρότερη η επένδυση απορρίπτεται.");
        jScrollPane3.setViewportView(jTextArea3);

        jLabel1.setBackground(new java.awt.Color(37, 34, 34));
        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ανάλυση των Μεθόδων Αξιολόγησης Επενδύσεων");

        jSeparator1.setBackground(new java.awt.Color(37, 34, 34));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N

        javax.swing.GroupLayout DetailsLayout = new javax.swing.GroupLayout(Details);
        Details.setLayout(DetailsLayout);
        DetailsLayout.setHorizontalGroup(
            DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailsLayout.createSequentialGroup()
                .addGroup(DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DetailsLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)))
                    .addGroup(DetailsLayout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        DetailsLayout.setVerticalGroup(
            DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        select.add(Details, "card5");

        jScrollPaneNetPresentValue.setBackground(new java.awt.Color(37, 34, 34));
        jScrollPaneNetPresentValue.setForeground(new java.awt.Color(255, 255, 255));

        jTableNPV.setBackground(new java.awt.Color(204, 204, 204));
        jTableNPV.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jTableNPV.setForeground(new java.awt.Color(37, 34, 34));
        jTableNPV.setSelectionBackground(new java.awt.Color(37, 34, 34));
        jTableNPV.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTableNPV.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, resultsList, jTableNPV);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Short.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${username}"));
        columnBinding.setColumnName("Username");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${arxkostos}"));
        columnBinding.setColumnName("Arxkostos");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${epitokio}"));
        columnBinding.setColumnName("Epitokio");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${xronia}"));
        columnBinding.setColumnName("Xronia");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${result}"));
        columnBinding.setColumnName("Result");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
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
               

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, averagerateofreturn_1List1, jTableAROR);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${result}"));
        columnBinding.setColumnName("Result");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${xronia}"));
        columnBinding.setColumnName("Xronia");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kostoskefalaiou}"));
        columnBinding.setColumnName("Kostoskefalaiou");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${arxkostos}"));
        columnBinding.setColumnName("Arxkostos");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${username}"));
        columnBinding.setColumnName("Username");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Short.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPaneAverageROReturn.setViewportView(jTableAROR);

        select.add(jScrollPaneAverageROReturn, "card6");

        jTablePP.setBackground(new java.awt.Color(204, 204, 204));
        jTablePP.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jTablePP.setForeground(new java.awt.Color(37, 34, 34));
        jTablePP.setSelectionBackground(new java.awt.Color(37, 34, 34));
        jTablePP.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTablePP.getTableHeader().setReorderingAllowed(false);

        
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, paybackperiodList1, jTablePP);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${etosEpaneispraksis}"));
        columnBinding.setColumnName("Etos Epaneispraksis");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${result}"));
        columnBinding.setColumnName("Result");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${epithimitoEtos}"));
        columnBinding.setColumnName("Epithimito Etos");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${xronia}"));
        columnBinding.setColumnName("Xronia");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${epitokio}"));
        columnBinding.setColumnName("Epitokio");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${arxkostos}"));
        columnBinding.setColumnName("Arxkostos");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${username}"));
        columnBinding.setColumnName("Username");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Short.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPanePaybackPeriod.setViewportView(jTablePP);

        select.add(jScrollPanePaybackPeriod, "card7");

        getContentPane().add(select, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(37, 35, 35));
        jMenuBar1.setForeground(new java.awt.Color(37, 35, 35));
        jMenuBar1.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N

        jMenuDetails.setBackground(new java.awt.Color(255, 255, 255));
        jMenuDetails.setForeground(new java.awt.Color(37, 35, 35));
        jMenuDetails.setText("Αρχική Σελίδα");
        jMenuDetails.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jMenuDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDetailsMouseClicked(evt);
            }
        });
        jMenuDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDetailsActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuDetails);

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(37, 35, 35));
        jMenu1.setText("Συναρτήσεις");
        jMenu1.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemNPV.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemNPV.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jMenuItemNPV.setForeground(new java.awt.Color(37, 35, 35));
        jMenuItemNPV.setText("Υπολογισμός Καθαρής Παρούσας Αξίας");
        jMenuItemNPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNPVActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNPV);

        jMenuItemPP.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemPP.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jMenuItemPP.setForeground(new java.awt.Color(37, 35, 35));
        jMenuItemPP.setText("Υπολογισμός Περιόδου επανείσπραξης");
        jMenuItemPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPPActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemPP);

        jMenuItemAROR.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemAROR.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jMenuItemAROR.setForeground(new java.awt.Color(37, 35, 35));
        jMenuItemAROR.setText("Υπολογισμός Μέσης Απόδοσης");
        jMenuItemAROR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemARORActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAROR);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setForeground(new java.awt.Color(37, 35, 35));
        jMenu2.setText("Προηγούμενα Αποτελέσματα");
        jMenu2.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
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
        jMenu2.add(jMenuItemNPVprevious);

        jMenuItemPPprevious.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemPPprevious.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jMenuItemPPprevious.setForeground(new java.awt.Color(37, 35, 35));
        jMenuItemPPprevious.setText("Περιόδου Επανείσπραξης");
        jMenuItemPPprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPPpreviousActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPPprevious);

        jMenuItemARORprevious.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemARORprevious.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jMenuItemARORprevious.setForeground(new java.awt.Color(37, 35, 35));
        jMenuItemARORprevious.setText("Μέσης Απόδοσης");
        jMenuItemARORprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemARORpreviousActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemARORprevious);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        bindingGroup.bind();

        pack();
    }// </editor-fold>                        

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_jMenu1ActionPerformed
   
    private void updateTableNPV(){
        resultsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Results r WHERE r.username = :username").setParameter("username", username);
        resultsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : resultsQuery.getResultList();
        
        jScrollPaneNetPresentValue.setBackground(new java.awt.Color(37, 34, 34));
        jScrollPaneNetPresentValue.setForeground(new java.awt.Color(255, 255, 255));

        jTableNPV.setBackground(new java.awt.Color(204, 204, 204));
        jTableNPV.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jTableNPV.setForeground(new java.awt.Color(37, 34, 34));
        jTableNPV.setSelectionBackground(new java.awt.Color(37, 34, 34));
        jTableNPV.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTableNPV.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = 
                org.jdesktop.swingbinding.SwingBindings
                        .createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE,
                                resultsList, jTableNPV);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Short.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${username}"));
        columnBinding.setColumnName("Username");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${arxkostos}"));
        columnBinding.setColumnName("Arxkostos");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${epitokio}"));
        columnBinding.setColumnName("Epitokio");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${xronia}"));
        columnBinding.setColumnName("Xronia");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${result}"));
        columnBinding.setColumnName("Result");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
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
        
    }//private void updateTableNPV
    
    private void updateTablePP(){
        paybackperiodQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Paybackperiod p WHERE p.username = :username").setParameter("username", username);
        paybackperiodList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : paybackperiodQuery1.getResultList();
        
        jTablePP.setBackground(new java.awt.Color(204, 204, 204));
        jTablePP.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jTablePP.setForeground(new java.awt.Color(37, 34, 34));
        jTablePP.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTablePP.setSelectionForeground(new java.awt.Color(37, 34, 34));
        jTablePP.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, paybackperiodList1, jTablePP);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${etosEpaneispraksis}"));
        columnBinding.setColumnName("Etos Epaneispraksis");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${result}"));
        columnBinding.setColumnName("Result");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${epithimitoEtos}"));
        columnBinding.setColumnName("Epithimito Etos");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${xronia}"));
        columnBinding.setColumnName("Xronia");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${epitokio}"));
        columnBinding.setColumnName("Epitokio");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${arxkostos}"));
        columnBinding.setColumnName("Arxkostos");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${username}"));
        columnBinding.setColumnName("Username");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Short.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPanePaybackPeriod.setViewportView(jTablePP);
    }//updateTablePP
    
    private void updateTableAROR(){
        averagerateofreturn_1Query1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Averagerateofreturn_1 a WHERE a.username = :username").setParameter("username", username);
        averagerateofreturn_1List1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : averagerateofreturn_1Query1.getResultList();
        
        jTableAROR.setBackground(new java.awt.Color(204, 204, 204));
        jTableAROR.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jTableAROR.setForeground(new java.awt.Color(37, 34, 34));
        jTableAROR.setSelectionBackground(new java.awt.Color(37, 34, 34));
        jTableAROR.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTableAROR.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, averagerateofreturn_1List1, jTableAROR);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${result}"));
        columnBinding.setColumnName("Result");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${xronia}"));
        columnBinding.setColumnName("Xronia");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kostoskefalaiou}"));
        columnBinding.setColumnName("Kostoskefalaiou");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${arxkostos}"));
        columnBinding.setColumnName("Arxkostos");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${username}"));
        columnBinding.setColumnName("Username");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Short.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPaneAverageROReturn.setViewportView(jTableAROR);
        
    }//private void updateTableAROR
    
    private void jMenuItemNPVpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNPVpreviousActionPerformed
        //------Show table NPV-------//
        select.removeAll();
        updateTableNPV();
        select.add(jScrollPaneNetPresentValue);
        setTitle("Riksmarl Application  |   Login for User: "+username+"    |   Table for Net Present Value");
        select.repaint();
        select.revalidate();
    }//GEN-LAST:event_jMenuItemNPVpreviousActionPerformed

    private void jMenuItemNPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNPVActionPerformed
        //-----NPV FUNCTION-----//
        System.out.println("Inside HomePage");
        select.removeAll();
        setTitle("Riksmarl Application  |   Login for User: "+username+"    |   Net Present Value Calculator");
        select.add(nvfinal);
        select.repaint();
        select.revalidate();
    }//GEN-LAST:event_jMenuItemNPVActionPerformed

    private void jMenuItemPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPPActionPerformed
        //--------PAYBACK PERIOD FUNCTION---------//
        select.removeAll();
        setTitle("Riksmarl Application  |   Login for User: "+username+"    |   Payback Period Calculator");
        select.add(p);
        select.repaint();
        select.revalidate();
    }//GEN-LAST:event_jMenuItemPPActionPerformed

    private void jMenuItemPPpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPPpreviousActionPerformed
        //------Show table jTablePP-------//
            select.removeAll();
            updateTablePP();
            setTitle("Riksmarl Application  |   Login for User: "+username+"    |   Table for Payback Period");
            select.add(jScrollPanePaybackPeriod);
            select.repaint();
            select.revalidate();
    }//GEN-LAST:event_jMenuItemPPpreviousActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItemARORpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemARORpreviousActionPerformed
        //------Show table AROR-------//
            select.removeAll();
            updateTableAROR();
            setTitle("Riksmarl Application  |   Login for User: "+username+"    |   Table for Average Rate of Return");
            select.add(jScrollPaneAverageROReturn);
            select.repaint();
            select.revalidate();
    }//GEN-LAST:event_jMenuItemARORpreviousActionPerformed

    private void jMenuItemARORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemARORActionPerformed
        //Υπολογισμός Μεσης Απόδοσης
        select.removeAll();
        select.add(a);
        setTitle("Riksmarl Application  |   Login for User: "+username+"    |   Average Rate of Return Calculator");
        System.out.println("Inside jMenuItemARORActionPerformed username= "+username);
        select.repaint();
        select.revalidate();
    }//GEN-LAST:event_jMenuItemARORActionPerformed

    private void jMenuDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDetailsActionPerformed
        select.removeAll();
        setTitle("Riksmarl Application  |   Login for User: "+username+"    |   Home Page");
        select.add(Details);
        select.repaint();
        select.revalidate();
    }//GEN-LAST:event_jMenuDetailsActionPerformed

    private void jMenuDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDetailsMouseClicked
        // TODO add your handling code here:
        select.removeAll();
        setTitle("Riksmarl Application  |   Login for User: "+username+"    |   Home Page Calculator");
        select.add(Details);
        select.repaint();
        select.revalidate();
    }//GEN-LAST:event_jMenuDetailsMouseClicked

    private void jTableNPVComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableNPVComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableNPVComponentAdded

    private void jTableNPVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNPVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableNPVMouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Details;
    private java.util.List<RiksmarlPackage.Averagerateofreturn_1> averagerateofreturn_1List;
    private java.util.List<RiksmarlPackage.Averagerateofreturn_1> averagerateofreturn_1List1;
    private javax.persistence.Query averagerateofreturn_1Query;
    private javax.persistence.Query averagerateofreturn_1Query1;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDetails;
    private javax.swing.JMenuItem jMenuItemAROR;
    private javax.swing.JMenuItem jMenuItemARORprevious;
    private javax.swing.JMenuItem jMenuItemNPV;
    private javax.swing.JMenuItem jMenuItemNPVprevious;
    private javax.swing.JMenuItem jMenuItemPP;
    private javax.swing.JMenuItem jMenuItemPPprevious;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneAverageROReturn;
    private javax.swing.JScrollPane jScrollPaneNetPresentValue;
    private javax.swing.JScrollPane jScrollPanePaybackPeriod;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableAROR;
    private javax.swing.JTable jTableNPV;
    private javax.swing.JTable jTablePP;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private java.util.List<RiksmarlPackage.Paybackperiod> paybackperiodList;
    private java.util.List<RiksmarlPackage.Paybackperiod> paybackperiodList1;
    private javax.persistence.Query paybackperiodQuery;
    private javax.persistence.Query paybackperiodQuery1;
    private java.util.List<RiksmarlPackage.Results> resultsList;
    private java.util.List<RiksmarlPackage.Results> resultsList1;
    private javax.persistence.Query resultsQuery;
    private javax.persistence.Query resultsQuery1;
    private javax.swing.JPanel select;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
//CLEAR BUTTON
    public void resetPanel(){
          select.removeAll();
        select.add(new PaybackFunction(username));//select.add(new PaybackFunction(username,this));
        select.repaint();
        //select.validate();
        select.revalidate();
    }
    static class setVisible {

        public setVisible(boolean b) {
        }
    }
    
   
}
