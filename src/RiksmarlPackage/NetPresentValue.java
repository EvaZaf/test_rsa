/**
 *
 * @author cgntuser
 */
package RiksmarlPackage;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class NetPresentValue extends javax.swing.JPanel {
    Connection xampp;
    ResultSet rs;//=null
    PreparedStatement pst=null;
    PreparedStatement values=null;
    ArrayList<javax.swing.JTextField> list = new ArrayList<javax.swing.JTextField>();
    ArrayList<javax.swing.JLabel> LabelList= new ArrayList<javax.swing.JLabel>();
    String username;//value for new cnstructor
    /**
     * Creates new form NetPresentValue
     */
    public NetPresentValue(){
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            xampp=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");       
            JOptionPane.showMessageDialog(null, "Συνδέθηκε επιτυχώς.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Δεν υπάρχει σύνδεση.");
            //JOptionPane.showMessageDialog(null, "Inside catch in LoginPage() \n"+e+"\n");
        }//catch
    }//public NetPresentValue
    public NetPresentValue(String username) {
        this.username=username;
        System.out.println(username+" Inside NetPresentValue");
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
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
        jTextField1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
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
        clearButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        label2 = new java.awt.Label();
        epitokio1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        arxkostos1 = new java.awt.TextField();
        arxkostos2 = new java.awt.TextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        result1 = new java.awt.TextField();
		
	//------------------------Σύγκριση με 2η επένδυση-------------------------------//
		jPanel4.setVisible(false);
		jButton3.setVisible(false);
		result1.setVisible(false);
		
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

        jButton1.setBackground(new java.awt.Color(34, 34, 37));
        jButton1.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Υπολόγισε");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
        epitokio.setText("Επιτόκιο:");

        jTextField1.setBackground(new java.awt.Color(37, 34, 34));
        jTextField1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setBackground(new java.awt.Color(37, 34, 34));
        jLabel17.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Εκτιμώμενο Κέρδος:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(epitokio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(epitokio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addContainerGap(17, Short.MAX_VALUE))
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
        jLabel1.setText("Υπολογισμός Καθαρής Παρούσας Αξίας");

        clearButton.setBackground(new java.awt.Color(37, 34, 34));
        clearButton.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

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
        epitokio1.setText("Επιτόκιο:");

        arxkostos1.setBackground(new java.awt.Color(37, 34, 34));
        arxkostos1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        arxkostos1.setForeground(new java.awt.Color(255, 255, 255));
        arxkostos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arxkostos1ActionPerformed(evt);
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
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(epitokio1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(100, 100, 100))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator8)
                                    .addComponent(label5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(arxkostos1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(arxkostos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arxkostos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arxkostos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(epitokio1)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jButton3.setBackground(new java.awt.Color(34, 34, 37));
        jButton3.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Υπολόγισε");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        result1.setBackground(new java.awt.Color(37, 34, 34));
        result1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        result1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clearButton)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(arxkostos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(86, 86, 86)
                                                .addComponent(jCheckBox1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(result, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(result1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
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

    double apot;//gia result1 decimalFormat
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	try{
            DecimalFormat df = new DecimalFormat("#.##");//DecimalFormat df = new DecimalFormat("#.####")
            df.setRoundingMode(RoundingMode.CEILING);
            result.setEditable(false);
            String kostos = arxkostos.getText();
            String uepitokio=jTextField1.getText();
            String gains=kerdos.getText();
            double athroisma=0;//Δήλωση μεταβλητής & αρχικοποίηση
            double metatropi = (Double.parseDouble(uepitokio)/100);//---Μετατροπή της τιμής που δίνει ο χρήστης για επιτόκιο σε %---//
            int k = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            //-------------------------------------------------//
            athroisma += (Double.parseDouble(kerdos.getText())/Math.pow((1+metatropi),1));
            System.out.println(Math.pow((1+metatropi),1));
            System.out.println("Before for");
            for(int i=0;i<k-1;i++){//or i=1
                athroisma+=Double.parseDouble(list.get(i).getText())/Math.pow((1+metatropi),i+2);//or i+1
                System.out.println(Math.pow((1+metatropi),i+2));//or i+1
            }//for
            //result.setText(df.format(String.valueOf(athroisma-Double.parseDouble(kostos))));
            System.out.println("Athroisma = "+athroisma);
            
            athroisma=athroisma-Double.parseDouble(kostos);
            apot=athroisma;
            result.setText(String.valueOf(df.format(athroisma)));//-Double.parseDouble(kostos)
            
            if(apot > 0)//Double.parseDouble(result.getText())
                JOptionPane.showMessageDialog(null, "Η επένδυση θα έχει κέρδος.");
            else if(apot == 0)//Double.parseDouble(result.getText())
                JOptionPane.showMessageDialog(null, "Η επένδυση δεν θα έχει κέρδος και ζημία.");
            else
                JOptionPane.showMessageDialog(null, "Η επένδυση θα έχει ζημία.");
            /***
            *
            * Ερώτηση στον χρήστη για το αν θέλει να αποθηκεύσει το αποτέλεσμα
            *
            */
            try{
                Class.forName("com.mysql.jdbc.Driver"); 
                xampp=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
                int dialogButton= JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Θέλεις να αποθηκεύσεις το αποτέλεσμα;","Warning",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    System.out.println("PRIN thn INSERT INTO\n");
                    String npvquery="INSERT INTO results (username,arxkostos,epitokio,xronia,result) VALUES (?,?,?,?,?) ";
                    System.out.println("META thn Insert\n");
                    System.out.println(username+"\n");
                    pst=xampp.prepareStatement(npvquery);
                    System.out.println("mphke");
                    pst.setString(1,username);
                    System.out.println(username);
                    pst.setString(2, arxkostos.getText());
                    System.out.println(arxkostos.getText());
                    pst.setString(3, jTextField1.getText());
                    System.out.println(jTextField1.getText());
                    pst.setInt(4, k);
                    System.out.println(k);
                    pst.setDouble(5, apot);//result.getText()
                    System.out.println(apot);//result.getText()
                    System.out.println("Vghke");
                    pst.executeUpdate();
                    pst.close();
                    xampp.close();
                }//if JOptionDialog=yes
            }//try
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Δεν υπάρχει σύνδεση στο δίκτυο.\nΞαναπροσπάθησε αργότερα.");//+e
                System.out.println("Exception in Db inside NetPresentValue"+e);
            }//catch
        }//try
        catch(Exception e){
            System.out.println(e.getMessage()+" Exception in jButton Try");
            JOptionPane.showMessageDialog(null, "Παρακαλώ εισάγετε όλα τα πεδία.");
        }//catch
    }//GEN-LAST:event_jButton1ActionPerformed

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

        }
        //-----------------unvisible τα jTextField & jLabel ανάλογα με την επιλογή του χρήστη---------------//
        for(int i=k-1;i<list.size();i++){
            list.get(i).setVisible(false);
            LabelList.get(i).setVisible(false);
            //-----------------------------------------------------------//
            if(Integer.parseInt(jComboBox1.getSelectedItem().toString())<6)
            jSeparator7.setVisible(false);

            if(Integer.parseInt(jComboBox1.getSelectedItem().toString())<11)
            jSeparator6.setVisible(false);

        }

        this.validate();//ανανέωση του window
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
       //---------------------CLEAR BUTTON------------------------//
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
        arxkostos1.setText("");
        jTextField1.setText("");
        result.setEnabled(true);
        result.setEditable(false);
        result.setText("");
        result1.setText("");
        jButton3.setVisible(false);
        result1.setVisible(false);
        jCheckBox1.setSelected(false);
        jPanel4.setVisible(false);
        arxkostos.setEnabled(true);
        jComboBox1.setEnabled(true);
        jTextField1.setEnabled(true);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void arxkostos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arxkostos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arxkostos1ActionPerformed

    private void arxkostos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arxkostos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arxkostos2ActionPerformed

    private void jComboBox2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBox2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2AncestorAdded

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
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

        }
        //-----------------unvisible τα jTextField & jLabel ανάλογα με την επιλογή του χρήστη---------------//
        for(int i=k-1;i<list.size();i++){
            list.get(i).setVisible(false);
            LabelList.get(i).setVisible(false);
            //-----------------------------------------------------------//
            if(Integer.parseInt(jComboBox2.getSelectedItem().toString())<6)
            jSeparator7.setVisible(false);

            if(Integer.parseInt(jComboBox2.getSelectedItem().toString())<11)
            jSeparator6.setVisible(false);

        }

        this.validate();//ανανέωση του window
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        //όταν ο χρήστης επιλέξει ότι θέλει σύγκριση με 2η επένδυση
        //αρχικοποιούνται τα πεδία που βάζειτα μελλοντικά κέρδη
           if(jCheckBox1.isSelected()&&result.getText().equals("")){
                jCheckBox1.setSelected(false);
                JOptionPane.showMessageDialog(null, "Παρακαλώ υπολογίστε την πρώτη επιχείρηση.");
           }//if
     
            if(jCheckBox1.isSelected() && !result.getText().isEmpty()){
                System.out.println("einai epilegmeno");
                jPanel1.validate();
                jPanel4.setVisible(true);
                jButton3.setVisible(true);
                jButton3.setEnabled(true);
		result1.setVisible(true);
                result1.setEditable(false);
                result1.setEnabled(true);
                result.setEnabled(false);
                arxkostos.setEnabled(false);//Δεν επιτρέπει στον χρήστη να αλλάξει τις τιμές στην 1η επένδυση
                jComboBox1.setEnabled(false);//Δεν επιτρέπει στον χρήστη να αλλάξει τις τιμές στην 1η επένδυση
                jTextField1.setEnabled(false);//Δεν επιτρέπει στον χρήστη να αλλάξει τις τιμές στην 1η επένδυση
                jButton1.setEnabled(false);
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
                    kerdos.setText("");
                }//for
            }//if isSelected
            else if(!jCheckBox1.isSelected() && !result.getText().isEmpty()) {//==false
                jPanel1.validate();
                System.out.println("den einai epilegmeno");
                int arxikopoihsh = Integer.parseInt(jComboBox1.getSelectedItem().toString());
                System.out.println("den einai epilegmeno");
                arxkostos.setEnabled(true);
                jComboBox1.setEnabled(true);
                jTextField1.setEnabled(true);
                jPanel4.setVisible(false);
                jPanel5.setVisible(false);
                jPanel3.revalidate();
                jButton1.setEnabled(true);
                result.setEnabled(false);
                result.setEditable(false);
                jButton3.setVisible(false);
                result1.setEditable(false);
                result1.setVisible(false);
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
            }//else if 
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    
    double apot1;//gia result2 decimalFormat
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            DecimalFormat df = new DecimalFormat("#.##");//DecimalFormat df = new DecimalFormat("#.####")
            df.setRoundingMode(RoundingMode.CEILING);
            result1.setEditable(false);
            String kostos = arxkostos2.getText();
            String uepitokio=arxkostos1.getText();
            String gains=kerdos.getText();//η default πρωτη τιμή πιθανου κερδους
            double athroisma=0;//Δήλωση μεταβλητής & αρχικοποίηση
            double metatropi = (Double.parseDouble(uepitokio)/100);//---Μετατροπή της τιμής που δίνει ο χρήστης για επιτόκιο σε %---//
            
            int k = Integer.parseInt(jComboBox2.getSelectedItem().toString());
            athroisma += (Double.parseDouble(kerdos.getText())/Math.pow((1+metatropi),1));
            System.out.println(Math.pow((1+metatropi),0));

            for(int i=0;i<k-1;i++){//or i=1
                athroisma+=Double.parseDouble(list.get(i).getText())/Math.pow((1+metatropi),i+2);//or i+1
                System.out.println(Math.pow((1+metatropi),i+2));//or i+1
            }
            athroisma=athroisma-Double.parseDouble(kostos);
            apot1=athroisma;
            result1.setText(String.valueOf(df.format(athroisma)));// -Double.parseDouble(kostos)

            //------------------------Εμφάνιση ανάλογα με το αποτέλεσμα-------------------------//
            //---------------------------Σύγκριση με την 1η επένδυση----------------------------//
            if(apot1 > apot && apot1 > 0)//Double.parseDouble(result1.getText()) Double.parseDouble(result.getText()) Double.parseDouble(result1.getText())
		JOptionPane.showMessageDialog(null, "Η δεύτερη επένδυση θα αποφέρει περισσότερα κέρδη.");
            else if(apot1 == apot && apot1==0)//Double.parseDouble(result1.getText()) Double.parseDouble(result.getText()) Double.parseDouble(result1.getText())
		JOptionPane.showMessageDialog(null, "Η επένδυση δεν θα έχει κέρδος και ζημία.");
            else if(apot > apot1)//Double.parseDouble(result.getText()) Double.parseDouble(result1.getText())
                JOptionPane.showMessageDialog(null, "Η πρώτη επένδυση θα αποφέρει περισσότερα κέρδη.");
            else if(apot1 <0 && apot <0)//Double.parseDouble(result1.getText()) Double.parseDouble(result.getText())
                JOptionPane.showMessageDialog(null, "Και οι δύο επενδύσεις θα έχουν ζημία.");
        }//try
        catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Παρακαλώ εισάγετε όλα τα πεδία.");
        }//catch
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField arxkostos;
    private java.awt.TextField arxkostos1;
    private java.awt.TextField arxkostos2;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel epitokio;
    private javax.swing.JLabel epitokio1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JTextField jTextField1;
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
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.TextField result;
    private java.awt.TextField result1;
    // End of variables declaration//GEN-END:variables
}
