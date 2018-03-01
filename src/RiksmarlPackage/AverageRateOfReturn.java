/**
 *
 * @author cgntuser
 */
package RiksmarlPackage;

import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class AverageRateOfReturn extends javax.swing.JPanel {
    /**
     * Creates new form AverageRateOfReturn
     */
    ArrayList<javax.swing.JTextField> list = new ArrayList<javax.swing.JTextField>();
    ArrayList<javax.swing.JLabel> LabelList= new ArrayList<javax.swing.JLabel>();
    String username;//value for new cnstructor
    Connection con;//=null
    ResultSet rs=null;
    PreparedStatement pst=null;
    boolean isOnline=false; 
    
    public AverageRateOfReturn() {
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
            initComponents();
            JOptionPane.showMessageDialog(null, "Συνδέθηκε επιτυχώς."); 
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Δεν υπάρχει σύνδεση.");
         }//catch
    }//AverageRateOfReturn

    public AverageRateOfReturn(String username){//apo User.java
        //this.setResizable(false);
        this.username=username;
        initComponents();
        System.out.println(this.username+" After init getUsername inside AverageRateOfReturn.java");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonfirst = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        result = new java.awt.TextField();
        arxkostos = new java.awt.TextField();
        label4 = new java.awt.Label();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        epitokio = new javax.swing.JLabel();
        kostoskefalaiou = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        kerdos = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        label2 = new java.awt.Label();
        epitokio1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        kostoskefalaiou1 = new java.awt.TextField();
        arxkostos2 = new java.awt.TextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jButtonsecond = new javax.swing.JButton();
        result1 = new java.awt.TextField();
        jLabel17 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();

		//--------------------------CUSTOM CODE--------------------------//
		
		//unvisible τα jTextFields & jLabels για να εμφανίζονται ανάλογα με την επιλογή του χρήστη
        //--------------------------jTextFields----------------------------//
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jTextField7.setVisible(false);
        jTextField8.setVisible(false);
        jTextField9.setVisible(false);
        jTextField10.setVisible(false);
        jTextField11.setVisible(false);
        jTextField12.setVisible(false);
        jTextField13.setVisible(false);
        jTextField14.setVisible(false);
        jTextField15.setVisible(false);
        jTextField16.setVisible(false);
        //----------------------------jLabels------------------------------//
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
	//-----------------------jSeparators unvisible------------------//
	jSeparator6.setVisible(false);
	jSeparator7.setVisible(false);
	
	//------------------------jPanel4-------------------------------//
	jPanel4.setVisible(false);//εμφάνιση για αρχικό κόστος, επιλογή χρόνων & επιτόκιο
        jPanel5.setVisible(false);//Button & result1 για 2η επενδυση
        //--------------------------------------------------------------//
        //------add jTextFields on list & jLabels on LabelList----------//
        //------------------------jTextFields---------------------------//
        list.add(jTextField3);
        list.add(jTextField4);
        list.add(jTextField5);
        list.add(jTextField6);
        list.add(jTextField7);
        list.add(jTextField8);
        list.add(jTextField9);
        list.add(jTextField10);
        list.add(jTextField11);
        list.add(jTextField12);
        list.add(jTextField13);
        list.add(jTextField14);
        list.add(jTextField15);
        list.add(jTextField16);
        //-------------------------jLabel-------------------------------//
        LabelList.add(jLabel3);
        LabelList.add(jLabel4);
        LabelList.add(jLabel5);
        LabelList.add(jLabel6);
        LabelList.add(jLabel7);
        LabelList.add(jLabel8);
        LabelList.add(jLabel9);
        LabelList.add(jLabel10);
        LabelList.add(jLabel11);
        LabelList.add(jLabel12);
        LabelList.add(jLabel13);
        LabelList.add(jLabel14);
        LabelList.add(jLabel15);
        LabelList.add(jLabel16);
		
		
		
		
        jPanel1.setBackground(new java.awt.Color(37, 34, 34));
        jPanel1.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N

        jButtonfirst.setBackground(new java.awt.Color(34, 34, 37));
        jButtonfirst.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jButtonfirst.setForeground(new java.awt.Color(255, 255, 255));
        jButtonfirst.setText("Υπολόγισε");
        jButtonfirst.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonfirst.setBorderPainted(false);
        jButtonfirst.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonfirstActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Χρόνος:");

        result.setBackground(new java.awt.Color(37, 34, 34));
        result.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        result.setForeground(new java.awt.Color(255, 255, 255));

        arxkostos.setBackground(new java.awt.Color(37, 34, 34));
        arxkostos.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        arxkostos.setForeground(new java.awt.Color(255, 255, 255));
        arxkostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arxkostosActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Αρχικό Κόστος:");

        jComboBox1.setBackground(new java.awt.Color(37, 34, 34));
        jComboBox1.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBox1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(37, 34, 34));

        epitokio.setBackground(new java.awt.Color(37, 34, 34));
        epitokio.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        epitokio.setForeground(new java.awt.Color(255, 255, 255));
        epitokio.setText("Κόστος Κεφαλαίου:");

        kostoskefalaiou.setBackground(new java.awt.Color(37, 34, 34));
        kostoskefalaiou.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        kostoskefalaiou.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(epitokio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kostoskefalaiou, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kostoskefalaiou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(epitokio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(37, 34, 34));
        jPanel3.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1ο έτος:");

        kerdos.setBackground(new java.awt.Color(37, 34, 34));
        kerdos.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        kerdos.setForeground(new java.awt.Color(255, 255, 255));

        jTextField3.setBackground(new java.awt.Color(37, 34, 34));
        jTextField3.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setToolTipText("");

        jTextField4.setBackground(new java.awt.Color(37, 34, 34));
        jTextField4.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(37, 34, 34));
        jTextField5.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));

        jTextField6.setBackground(new java.awt.Color(37, 34, 34));
        jTextField6.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));

        jTextField7.setBackground(new java.awt.Color(37, 34, 34));
        jTextField7.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));

        jTextField8.setBackground(new java.awt.Color(37, 34, 34));
        jTextField8.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));

        jTextField9.setBackground(new java.awt.Color(37, 34, 34));
        jTextField9.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));

        jTextField10.setBackground(new java.awt.Color(37, 34, 34));
        jTextField10.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setBackground(new java.awt.Color(37, 34, 34));
        jTextField11.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));

        jTextField12.setBackground(new java.awt.Color(37, 34, 34));
        jTextField12.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));

        jTextField13.setBackground(new java.awt.Color(37, 34, 34));
        jTextField13.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));

        jTextField14.setBackground(new java.awt.Color(37, 34, 34));
        jTextField14.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));

        jTextField15.setBackground(new java.awt.Color(37, 34, 34));
        jTextField15.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));

        jTextField16.setBackground(new java.awt.Color(37, 34, 34));
        jTextField16.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("2ο έτος:");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("3ο έτος:");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("4ο έτος:");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("5ο έτος:");

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("6ο έτος:");

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("7ο έτος:");

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("8ο έτος:");

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("9ο έτος:");

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("10ο έτος:");

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("11ο έτος:");

        jLabel13.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("12ο έτος:");

        jLabel14.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("13ο έτος:");

        jLabel15.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("14ο έτος:");

        jLabel16.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("15ο έτος:");

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(kerdos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))
                    .addComponent(jLabel11))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(kerdos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8)
                                .addComponent(jLabel13))
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel9)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel16))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Υπολογισμός Μέσης Απόδοσης");

        jPanel4.setBackground(new java.awt.Color(37, 34, 34));

        label5.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Αρχικό Κόστος:");

        label2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Χρόνος:");

        epitokio1.setBackground(new java.awt.Color(37, 34, 34));
        epitokio1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        epitokio1.setForeground(new java.awt.Color(255, 255, 255));
        epitokio1.setText("Κόστος Κεφαλαίου:");

        kostoskefalaiou1.setBackground(new java.awt.Color(37, 34, 34));
        kostoskefalaiou1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        kostoskefalaiou1.setForeground(new java.awt.Color(255, 255, 255));
        kostoskefalaiou1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kostoskefalaiou1ActionPerformed(evt);
            }
        });

        arxkostos2.setBackground(new java.awt.Color(37, 34, 34));
        arxkostos2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        arxkostos2.setForeground(new java.awt.Color(255, 255, 255));
        arxkostos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arxkostos2ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(37, 34, 34));
        jComboBox2.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBox2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 58, Short.MAX_VALUE)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(epitokio1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator8))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kostoskefalaiou1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(arxkostos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arxkostos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(epitokio1)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kostoskefalaiou1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCheckBox1.setBackground(new java.awt.Color(37, 34, 34));
        jCheckBox1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Σύκγριση με 2η επένδυση");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(37, 34, 34));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N

        jButtonsecond.setBackground(new java.awt.Color(34, 34, 37));
        jButtonsecond.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jButtonsecond.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsecond.setText("Υπολόγισε");
        jButtonsecond.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonsecond.setBorderPainted(false);
        jButtonsecond.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonsecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsecondActionPerformed(evt);
            }
        });

        result1.setBackground(new java.awt.Color(37, 34, 34));
        result1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        result1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonsecond, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonsecond, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel17.setBackground(new java.awt.Color(37, 34, 34));
        jLabel17.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Εκτιμώμενο Κέρδος:");

        clearButton.setBackground(new java.awt.Color(37, 34, 34));
        clearButton.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(arxkostos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCheckBox1)))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(clearButton)
                                .addGap(166, 166, 166)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator5)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(arxkostos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonfirst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>                        
    String r;
    private void jButtonfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonfirstActionPerformed
        try{
            DecimalFormat df = new DecimalFormat("#.####");//DecimalFormat df = new DecimalFormat("#.####")
            df.setRoundingMode(RoundingMode.CEILING);
            String kostos = arxkostos.getText();
            String uepitokio=kostoskefalaiou.getText();
            String gains=kerdos.getText();
            result.setEditable(false);
            double athroisma=(Double.parseDouble(kerdos.getText()));//Δήλωση μεταβλητής & αρχικοποίηση-Double.parseDouble(arxkostos.getText())
            
            int k = Integer.parseInt(jComboBox1.getSelectedItem().toString());           
            for(int i=0;i<k-1;i++){//or i=1
                //athroisma+=Double.parseDouble(list.get(i).getText())/Math.pow((1+metatropi),i+2);//or i+1
                athroisma+=Double.parseDouble(list.get(i).getText());
                System.out.println(i+2);
                //System.out.println(Math.pow((1+metatropi),i+2));//or i+1
            }
            System.out.println("athroisma= "+athroisma+"\nk= "+k+"\nMesi ethsia tameiakh roh \n" +(athroisma/k));
            athroisma=athroisma/k;//mesi ethsia tameiakh roh
            double mesiapodosi;
            mesiapodosi=athroisma/Double.parseDouble(arxkostos.getText());
            System.out.println("Mesi apodosi \n"+mesiapodosi);
            r = String.valueOf(mesiapodosi);
            result.setText(String.valueOf(df.format(mesiapodosi*100)));//df.format(mesiapodosi)+" ή "+String.valueOf(mesiapodosi*100)+"%"
//----------------------------------------------------------------------------------------//
            //--------Εμφάνιση μηνύματος ανάλογα με το αποτέλεσμα--------//
            if(mesiapodosi*100> Double.parseDouble(kostoskefalaiou.getText()))
                JOptionPane.showMessageDialog(null, "Η επένδυση θα έχει κέρδος."+df.format(mesiapodosi)+" ή "+String.valueOf(mesiapodosi*100)+"%");
            else if(mesiapodosi*100 == Double.parseDouble(kostoskefalaiou.getText()))
                JOptionPane.showMessageDialog(null, "Η επένδυση δεν θα έχει κέρδος και ζημία.");
            else
                JOptionPane.showMessageDialog(null, "Η επένδυση θα έχει ζημία.");
            //----------------------------INSERT INTO averagerateofreturn-----------------------------//
          try{
            int dialogButton= JOptionPane.YES_NO_OPTION;
          int dialogResult = JOptionPane.showConfirmDialog (null, "Θέλεις να αποθηκεύσεις το αποτέλεσμα;","Warning",dialogButton);
          if(dialogResult == JOptionPane.YES_OPTION){
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
             System.out.println("Before insert into\n");
             String npvquery="INSERT INTO averagerateofreturn (username,arxkostos,kostoskefalaiou,xronia,result) VALUES (?,?,?,?,?) ";
             System.out.println("After insert into the username= \n"+username);
             pst=con.prepareStatement(npvquery);
             System.out.println("After prepareStatement\n");
             System.out.println("mphke");
             pst.setString(1,username);
             System.out.println("\nAfter pst.setstring 1,username "+username);
             pst.setString(2, arxkostos.getText());
             System.out.println("\nAfter pst.setstring 2,arxkostos "+arxkostos.getText());
             pst.setString(3, kostoskefalaiou.getText());
             System.out.println("\nAfter pst.setstring 3,kostoskefalaiou "+kostoskefalaiou.getText());
             pst.setInt(4, k);
             System.out.println("\nAfter pst.setstring 4,k "+k);
             pst.setString(5, r);//mesiapodosi
             System.out.println("\nAfter pst.setstring 5,mesiapodosi "+mesiapodosi);
             System.out.println("Vghke");
             pst.executeUpdate();
             pst.close();
             con.close();
           }//if dialog result set=YES
          }//try db
          catch(Exception e){
            JOptionPane.showMessageDialog(null, "Δεν υπάρχει σύνδεση στο δίκτυο.\nΞαναπροσπάθησε αργότερα.");//+e
                System.out.println("Exception in Db inside AverageRateOfReturn "+e);
           }//catch for insert
        }//try
        catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Παρακαλώ εισάγετε όλα τα πεδία.");
        }//catch
    }//GEN-LAST:event_jButtonfirstActionPerformed

    private void arxkostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arxkostosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arxkostosActionPerformed

    private void jComboBox1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBox1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1AncestorAdded

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //-----------------------------------------------------------------------//
        System.out.println(jComboBox1.getSelectedItem().toString());
        int k = Integer.parseInt(jComboBox1.getSelectedItem().toString());//η επιλογή του χρήστη γίνεται parseInt και αποθηκεύεται στην μεταβλητή k

        //-----------------visible τα jTextField & jLabel ανάλογα με την επιλογή του χρήστη---------------//
        for(int i=0;i<k-1;i++){
            list.get(i).setVisible(true);
            LabelList.get(i).setVisible(true);
            //---------------------------------------------------------------//
            if(Integer.parseInt(jComboBox1.getSelectedItem().toString())>5)
                jSeparator7.setVisible(true);

            if(Integer.parseInt(jComboBox1.getSelectedItem().toString())>10)
                jSeparator6.setVisible(true);
        }//for για εμφανιση
        //-----------------unvisible τα jTextField & jLabel ανάλογα με την επιλογή του χρήστη---------------//
        for(int i=k-1;i<list.size();i++){
            list.get(i).setVisible(false);
            LabelList.get(i).setVisible(false);
            //-----------------------------------------------------------//
            if(Integer.parseInt(jComboBox1.getSelectedItem().toString())<6)
                jSeparator7.setVisible(false);

            if(Integer.parseInt(jComboBox1.getSelectedItem().toString())<11)
                jSeparator6.setVisible(false);
        }//for unvisible
        this.validate();//ανανέωση του window
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void kostoskefalaiou1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kostoskefalaiou1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kostoskefalaiou1ActionPerformed

    private void arxkostos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arxkostos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arxkostos2ActionPerformed

    private void jComboBox2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBox2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2AncestorAdded

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        System.out.println(jComboBox2.getSelectedItem().toString());
        int k = Integer.parseInt(jComboBox2.getSelectedItem().toString());//η επιλογή του χρήστη γίνεται parseInt και αποθηκεύεται στην μεταβλητή k
        //-----------------visible τα jTextField & jLabel ανάλογα με την επιλογή του χρήστη---------------//
        for(int i=0;i<k-1;i++){
            list.get(i).setVisible(true);
            LabelList.get(i).setVisible(true);
            //---------------------------------------------------------------//
            if(Integer.parseInt(jComboBox2.getSelectedItem().toString())>5)
                jSeparator7.setVisible(true);

            if(Integer.parseInt(jComboBox2.getSelectedItem().toString())>10)
                jSeparator6.setVisible(true);
        }//for visible
        //-----------------unvisible τα jTextField & jLabel ανάλογα με την επιλογή του χρήστη---------------//
        for(int i=k-1;i<list.size();i++){
            list.get(i).setVisible(false);
            LabelList.get(i).setVisible(false);
            //-----------------------------------------------------------//
            if(Integer.parseInt(jComboBox2.getSelectedItem().toString())<6)
                jSeparator7.setVisible(false);

            if(Integer.parseInt(jComboBox2.getSelectedItem().toString())<11)
                jSeparator6.setVisible(false);
        }//for unvisible
        this.validate();//ανανέωση του window
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
         //---------Έλεγχος για να υπολογίσει την 1η επένδυση αρχικά-----------//
         if(jCheckBox1.isSelected()&&result.getText().equals("")){
                jCheckBox1.setSelected(false);
                JOptionPane.showMessageDialog(null, "Παρακαλώ υπολογίστε την πρώτη επιχείρηση.");
         }//if
        //όταν ο χρήστης επιλέξει ότι θέλει σύγκριση με 2η επένδυση
        //αρχικοποιούνται τα πεδία που βάζειτα μελλοντικά κέρδη
        //if(result.getText()!=null || result.getText()!=""){//να βγεί πρώτα το αποτέλεσμα για την 1η επένδυση
            if(jCheckBox1.isSelected()==true){
                jPanel1.validate();
                jPanel4.setVisible(true);
                jPanel5.setVisible(true);
                kostoskefalaiou.setEnabled(false);
                jComboBox1.setEnabled(false);
                arxkostos.setEnabled(false);
                result.setEnabled(false);
                result1.setEnabled(true);
                result1.setEditable(false);
                jButtonfirst.setEnabled(false);
                jButtonsecond.setVisible(true);
                result1.setVisible(true);
                int arxikopoihsh = Integer.parseInt(jComboBox2.getSelectedItem().toString());//epilogh xronwn apo ton xrhsth
                for(int i=arxikopoihsh-1;i<list.size();i++){
                    list.get(i).setVisible(false);
                    list.get(i).setText("");
                    LabelList.get(i).setVisible(false);
                    jSeparator7.setVisible(false);
                    jSeparator6.setVisible(false);
                    kerdos.setText("");
                }//for
                for(int i=0;i<arxikopoihsh-1;i++){
		    list.get(i).setVisible(true);
                    list.get(i).setText("");
                    LabelList.get(i).setVisible(true);
                    //-------Separators-------//
                    if(Integer.parseInt(jComboBox2.getSelectedItem().toString())>5)
                        jSeparator7.setVisible(true);
                    if(Integer.parseInt(jComboBox2.getSelectedItem().toString())>10)
                        jSeparator6.setVisible(true);
                    if(Integer.parseInt(jComboBox2.getSelectedItem().toString())<6)
                        jSeparator7.setVisible(false);
                    if(Integer.parseInt(jComboBox2.getSelectedItem().toString())<11)
                        jSeparator6.setVisible(false);
              //      jSeparator7.setVisible(true);
              //      jSeparator6.setVisible(true);
                    kerdos.setText("");
                }//for
                this.validate();
            }//if isSelected=true
            else if(!jCheckBox1.isSelected() && !result.getText().isEmpty()){// && !result.getText().isEmpty()
                jPanel1.validate();
                jPanel4.setVisible(false);
                jPanel5.setVisible(false);
                result.setEnabled(true);
                arxkostos2.setText("");//arxiko kostos gia 2h ependush
                kostoskefalaiou1.setText("");//epitokio gia 2h ependush
                kostoskefalaiou.setEnabled(true);
                jComboBox1.setEnabled(true);
                arxkostos.setEnabled(true);
                result1.setEnabled(false);
                result.setEnabled(true);
                result.setEditable(false);
                jButtonfirst.setEnabled(true);
                int arxikopoihsh = Integer.parseInt(jComboBox1.getSelectedItem().toString());//epilogh xronwn apo ton xrhsth
                for(int i=0;i<list.size()-1;i++){
                 list.get(i).setVisible(false);
                    list.get(i).setText("");
                    LabelList.get(i).setVisible(false);
                    jSeparator7.setVisible(false);
                    jSeparator6.setVisible(false);
                    kerdos.setText("");
                }//for
		for(int i=0;i<arxikopoihsh-1;i++){
                    list.get(i).setVisible(true);
                    list.get(i).setText("");
                    LabelList.get(i).setVisible(true);
                    //-------Separators-------//
                    if(Integer.parseInt(jComboBox2.getSelectedItem().toString())>5)
                        jSeparator7.setVisible(true);
                    if(Integer.parseInt(jComboBox2.getSelectedItem().toString())>10)
                        jSeparator6.setVisible(true);
                    if(Integer.parseInt(jComboBox2.getSelectedItem().toString())<6)
                        jSeparator7.setVisible(false);
                    if(Integer.parseInt(jComboBox2.getSelectedItem().toString())<11)
                        jSeparator6.setVisible(false);
                   // jSeparator7.setVisible(true);
                   // jSeparator6.setVisible(true);
                    kerdos.setText(""); 
                }//for
                this.validate();
            }//else
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButtonsecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsecondActionPerformed
        try{
            DecimalFormat df = new DecimalFormat("#.####");//DecimalFormat df = new DecimalFormat("#.####")
            df.setRoundingMode(RoundingMode.CEILING);
            String kostos = arxkostos2.getText();
            String uepitokio=kostoskefalaiou1.getText();
            String gains=kerdos.getText();//η default πρωτη τιμή πιθανου κερδους
            double athroisma=(Double.parseDouble(kerdos.getText()));//Δήλωση μεταβλητής & αρχικοποίηση-Double.parseDouble(arxkostos2.getText())
            int k = Integer.parseInt(jComboBox2.getSelectedItem().toString());           
            for(int i=0;i<k-1;i++){//or i=1
                athroisma+=Double.parseDouble(list.get(i).getText());
                System.out.println(i+2);
            }//for
            System.out.println("athroisma= "+athroisma+"\nk= "+k+"\nMesi ethsia tameiakh roh \n" +(athroisma/k));
            athroisma=athroisma/k;//mesi ethsia tameiakh roh
            double mesiapodosi;//Μέση Απόδοση=Μέση ετήσια ταμειακή ροή/Αρχικό κόστος
            mesiapodosi=athroisma/Double.parseDouble(arxkostos2.getText());
            System.out.println("Mesi apodosi \n"+mesiapodosi);
            result1.setText(String.valueOf(mesiapodosi*100));
            String r1;
            r1=String.valueOf(mesiapodosi);
            //------------------------Εμφάνιση ανάλογα με το αποτέλεσμα-------------------------//
            //---------------------------Σύγκριση με την 1η επένδυση----------------------------//
            if(mesiapodosi*100> Double.parseDouble(kostoskefalaiou1.getText())&& Double.parseDouble(result1.getText())> Double.parseDouble(r))//(Double.parseDouble(result.getText()))
            //if(mesiapodosi*100> Double.parseDouble(kostoskefalaiou1.getText())&& Double.parseDouble(String.valueOf(mesiapodosi))>(Double.parseDouble(result.getText())))
                JOptionPane.showMessageDialog(null, "Η δεύτερη επένδυση θα έχει περισσότερο κέρδος. "+df.format(mesiapodosi)+" ή "+String.valueOf(mesiapodosi*100)+"%");
            else if(Double.parseDouble(result1.getText()) == Double.parseDouble(r))//Double.parseDouble(result.getText())
                JOptionPane.showMessageDialog(null, "Η επένδυση δεν θα έχει κέρδος και ζημία.");
            else
                JOptionPane.showMessageDialog(null, "Η πρώτη επένδυση θα έχει περισσότερο κέρδος.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Παρακαλώ εισάγετε όλα τα πεδία.");
        }
    }//GEN-LAST:event_jButtonsecondActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        for(int i=0;i<list.size()-1;i++){
            list.get(i).setVisible(false);
            list.get(i).setText("");
            LabelList.get(i).setVisible(false);
            jSeparator7.setVisible(false);
            jSeparator6.setVisible(false);
        }//for
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        kerdos.setText("");
        arxkostos.setText("");
        arxkostos2.setText("");
        kostoskefalaiou.setText("");
        kostoskefalaiou1.setText("");
        kostoskefalaiou.setEnabled(true);
        result.setText("");
        result.setEnabled(true);
        result.setEditable(false);
        result1.setText("");
        jButtonsecond.setVisible(false);
        result1.setVisible(false);
        jCheckBox1.setSelected(false);
        jPanel4.setVisible(false);
        arxkostos.setEnabled(true);
        jComboBox1.setEnabled(true);
        jButtonfirst.setEnabled(true);
        
        
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AverageRateOfReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AverageRateOfReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AverageRateOfReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AverageRateOfReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AverageRateOfReturn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField arxkostos;
    private java.awt.TextField arxkostos2;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel epitokio;
    private javax.swing.JLabel epitokio1;
    private javax.swing.JButton jButtonfirst;
    private javax.swing.JButton jButtonsecond;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField kerdos;
    private javax.swing.JTextField kostoskefalaiou;
    private java.awt.TextField kostoskefalaiou1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.TextField result;
    private java.awt.TextField result1;
    // End of variables declaration//GEN-END:variables

    void init() {
         //To change body of generated methods, choose Tools | Templates.
         new AverageRateOfReturn().setVisible(true);
    }
}
