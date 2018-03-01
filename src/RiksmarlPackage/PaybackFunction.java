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
public class PaybackFunction extends javax.swing.JPanel {
    /**
     * Creates new form PaybackFunction
     */
    ArrayList<javax.swing.JTextField> list = new ArrayList<javax.swing.JTextField>();
    ArrayList<javax.swing.JLabel> LabelList= new ArrayList<javax.swing.JLabel>();
    String username;//value for new cnstructor
    //Connection con;//=null
    Connection xampp;//for online
    ResultSet rs=null;
    PreparedStatement pst=null;

     public PaybackFunction(){
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            xampp=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");
            initComponents();
            JOptionPane.showMessageDialog(null, "Συνδέθηκε επιτυχώς."); 
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Δεν υπάρχει σύνδεση.");
         }//catch
    }//public Payback()
     
    public PaybackFunction(User user){//apo User.java
        username=user.getUsername();
        initComponents();
        System.out.println(username+" After init getUsername inside PaybackFunction.java");
    }

    public PaybackFunction(String username){
        this.username=username;
        System.out.println(username+" Inside PaybackFunction");
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultButton = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        result = new java.awt.TextField();
        arxkostos = new java.awt.TextField();
        label4 = new java.awt.Label();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        epithimitoEtosjLabel = new javax.swing.JLabel();
        jTextFieldepithimitoEtos = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        Payback1 = new javax.swing.JLabel();
        resultPayback1 = new javax.swing.JTextField();
        Payback2 = new javax.swing.JLabel();
        resultPayback2 = new javax.swing.JTextField();
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
        backButton = new javax.swing.JButton();
        jPanelSecondInvestment = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        label2 = new java.awt.Label();
        epitokio1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        epitokio1TextField = new java.awt.TextField();
        arxkostos2 = new java.awt.TextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextFieldepithimitoEtos1 = new javax.swing.JTextField();
        jLabelepithimitoEtos1 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextFieldEpitokio = new javax.swing.JTextField();
        epitokio = new javax.swing.JLabel();
        resultButton1 = new javax.swing.JButton();
        result1 = new java.awt.TextField();

		
		//--------------------------CUSTOM CODE--------------------------//
		
		//unvisible τα jTextFields & jLabels για να εμφανίζονται ανάλογα με την επιλογή του χρήστη
        //--------------------------jTextFields----------------------------//
		
		jPanelSecondInvestment.setVisible(false);
		resultButton1.setVisible(false);
		result1.setVisible(false);
		Payback1.setVisible(false);
		Payback2.setVisible(false);
		resultPayback1.setVisible(false);
		resultPayback2.setVisible(false);
		
		//-------------------------------jTextFields------------------------------//
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
        jPanel1.setPreferredSize(new java.awt.Dimension(849, 525));

        resultButton.setBackground(new java.awt.Color(34, 34, 37));
        resultButton.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        resultButton.setForeground(new java.awt.Color(255, 255, 255));
        resultButton.setText("Υπολόγισε");
        resultButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        resultButton.setBorderPainted(false);
        resultButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
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
        jComboBox1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBox1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(37, 34, 34));

        epithimitoEtosjLabel.setBackground(new java.awt.Color(37, 34, 34));
        epithimitoEtosjLabel.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        epithimitoEtosjLabel.setForeground(new java.awt.Color(255, 255, 255));
        epithimitoEtosjLabel.setText("Επιθυμιτό Έτος:");

        jTextFieldepithimitoEtos.setBackground(new java.awt.Color(37, 34, 34));
        jTextFieldepithimitoEtos.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextFieldepithimitoEtos.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setBackground(new java.awt.Color(37, 34, 34));
        jLabel17.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Εκτιμώμενο Κέρδος:");

        Payback1.setBackground(new java.awt.Color(37, 34, 34));
        Payback1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Payback1.setForeground(new java.awt.Color(255, 255, 255));
        Payback1.setText("Έτος επανείσπραξης 1ης επένδυσης:");

        resultPayback1.setEditable(false);
        resultPayback1.setBackground(new java.awt.Color(37, 34, 34));
        resultPayback1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        resultPayback1.setForeground(new java.awt.Color(255, 255, 255));
        resultPayback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultPayback1ActionPerformed(evt);
            }
        });

        Payback2.setBackground(new java.awt.Color(37, 34, 34));
        Payback2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Payback2.setForeground(new java.awt.Color(255, 255, 255));
        Payback2.setText("Έτος επανείσπραξης 2ης επένδυσης:");

        resultPayback2.setEditable(false);
        resultPayback2.setBackground(new java.awt.Color(37, 34, 34));
        resultPayback2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        resultPayback2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(epithimitoEtosjLabel)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel17)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Payback2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(resultPayback2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldepithimitoEtos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Payback1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultPayback1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldepithimitoEtos)
                    .addComponent(epithimitoEtosjLabel))
                .addGap(24, 24, 24)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultPayback1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Payback1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Payback2)
                    .addComponent(resultPayback2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        jLabel1.setText("Υπολογισμός Περιόδου Επανείσπραξης");

        backButton.setBackground(new java.awt.Color(37, 34, 34));
        backButton.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Clear");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jPanelSecondInvestment.setBackground(new java.awt.Color(37, 34, 34));

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

        epitokio1TextField.setBackground(new java.awt.Color(37, 34, 34));
        epitokio1TextField.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        epitokio1TextField.setForeground(new java.awt.Color(255, 255, 255));
        epitokio1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epitokio1TextFieldActionPerformed(evt);
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
        jComboBox2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBox2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextFieldepithimitoEtos1.setBackground(new java.awt.Color(37, 34, 34));
        jTextFieldepithimitoEtos1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextFieldepithimitoEtos1.setForeground(new java.awt.Color(255, 255, 255));

        jLabelepithimitoEtos1.setBackground(new java.awt.Color(37, 34, 34));
        jLabelepithimitoEtos1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabelepithimitoEtos1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelepithimitoEtos1.setText("Επιθυμιτό Έτος:");

        javax.swing.GroupLayout jPanelSecondInvestmentLayout = new javax.swing.GroupLayout(jPanelSecondInvestment);
        jPanelSecondInvestment.setLayout(jPanelSecondInvestmentLayout);
        jPanelSecondInvestmentLayout.setHorizontalGroup(
            jPanelSecondInvestmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSecondInvestmentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSecondInvestmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSecondInvestmentLayout.createSequentialGroup()
                        .addGroup(jPanelSecondInvestmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelepithimitoEtos1)
                            .addGroup(jPanelSecondInvestmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldepithimitoEtos1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSecondInvestmentLayout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanelSecondInvestmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(epitokio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanelSecondInvestmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arxkostos2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(epitokio1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        jPanelSecondInvestmentLayout.setVerticalGroup(
            jPanelSecondInvestmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSecondInvestmentLayout.createSequentialGroup()
                .addGroup(jPanelSecondInvestmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arxkostos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSecondInvestmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelSecondInvestmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSecondInvestmentLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(epitokio1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSecondInvestmentLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(epitokio1)))
                .addGap(20, 20, 20)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelSecondInvestmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelepithimitoEtos1)
                    .addComponent(jTextFieldepithimitoEtos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jTextFieldEpitokio.setBackground(new java.awt.Color(37, 34, 34));
        jTextFieldEpitokio.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTextFieldEpitokio.setForeground(new java.awt.Color(255, 255, 255));

        epitokio.setBackground(new java.awt.Color(37, 34, 34));
        epitokio.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        epitokio.setForeground(new java.awt.Color(255, 255, 255));
        epitokio.setText("Επιτόκιο:");

        resultButton1.setBackground(new java.awt.Color(34, 34, 37));
        resultButton1.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        resultButton1.setForeground(new java.awt.Color(255, 255, 255));
        resultButton1.setText("Υπολόγισε");
        resultButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        resultButton1.setBorderPainted(false);
        resultButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        resultButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButton1ActionPerformed(evt);
            }
        });

        result1.setBackground(new java.awt.Color(37, 34, 34));
        result1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        result1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(125, 125, 125)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(resultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(epitokio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(arxkostos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEpitokio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resultButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jCheckBox1)
                    .addGap(18, 18, 18)
                    .addComponent(jPanelSecondInvestment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1)
                            .addComponent(arxkostos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEpitokio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(epitokio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelSecondInvestment, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );
    }// </editor-fold>                        
double resultepithimito=0;//global metavliti gia epithimito etos epaneispraksis 1
    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonActionPerformed
        try{
            System.out.println("IS ONLINE inside PaybackFunction");
            result.setEditable(false);
            String kostos = arxkostos.getText();
            String uepitokio=jTextFieldEpitokio.getText();
            String gains=kerdos.getText();//δίνεται απ τον χρήστη
            double athroisma=0;//Δήλωση μεταβλητής & αρχικοποίηση
            double metatropi = (Double.parseDouble(uepitokio)/100);//---Μετατροπή της τιμής που δίνει ο χρήστης για επιτόκιο σε %---//
            int k = Integer.parseInt(jComboBox1.getSelectedItem().toString());//επιλογή χρόνων απο χρήστη
            athroisma += (Double.parseDouble(kerdos.getText())*Math.pow((1+metatropi),-1));//ειναι (-) επειδη είναι πχ. 1.10^(-1)..
            System.out.println("Μετατροπή πριν μπεί στην for = "+Math.pow((1+metatropi),-1));
            System.out.println("Athroisma prin mpei sthn for "+athroisma);
            System.out.println(kostos);
            System.out.println(uepitokio);
            System.out.println(gains);
            boolean isfirsttime=true;//set isfirsttime = true
            double epithimito1=0;//gia to insert into(epeidh den dexetai insert dedomenwn me df.format)
            if(k==1){
                DecimalFormat df = new DecimalFormat("#.##");//DecimalFormat df = new DecimalFormat("#.####")
                df.setRoundingMode(RoundingMode.CEILING);
                Double upoloipo;
                upoloipo=Double.parseDouble(arxkostos.getText())-athroisma;
                upoloipo=upoloipo/Double.parseDouble(kerdos.getText());
                upoloipo=1+upoloipo;
                System.out.println("Year of Payback Period = "+(df.format(upoloipo))+"\n");
                resultPayback1.setText(String.valueOf(df.format(upoloipo)));
                Payback1.setVisible(true);
                resultPayback1.setVisible(true);
                epithimito1=Double.parseDouble(String.valueOf(upoloipo));//Double.parseDouble(resultPayback1.getText())
                resultepithimito=epithimito1;
            }//if year is 1
            for(int i=0;i<k-1;i++){//or i=1 //k-1
                System.out.println("\nbefore the 'athroisma' the i = "+i);
                athroisma+=(Double.parseDouble(list.get(i).getText()))*Math.pow((1+metatropi),-i-2);//or -i-1  ειναι (-) επειδη είναι πχ. 1.10^(-1)..
                System.out.println("After -i-2  the i= "+(-i-2));
                System.out.println("\nEthsio athroisma = "+(Double.parseDouble(list.get(i).getText()))*Math.pow((1+metatropi),-i-2));
                //System.out.println(list.get(i).getText()+" list items"+"& i =" + i);
                System.out.println("Μετατροπή(επιτοκίου) = "+Math.pow((1+metatropi),-i-2)+"\n");//or i+1
                System.out.println("Άθροισμα ="+athroisma+  " of year= " +(i+2)+"\n");
                if((Double.parseDouble(arxkostos.getText())>=athroisma)&&isfirsttime){//.toString()
                    DecimalFormat df = new DecimalFormat("#.##");//DecimalFormat df = new DecimalFormat("#.####")
                    df.setRoundingMode(RoundingMode.CEILING);
                    Double upoloipo;
                    upoloipo=Double.parseDouble(arxkostos.getText())-athroisma;
                    System.out.println("arxkostos-athroisma = "+(Double.parseDouble(arxkostos.getText())-athroisma));
                    upoloipo=upoloipo/Double.parseDouble(list.get(i+1).getText());
                    System.out.println(df.format(upoloipo)+"\n");
                    upoloipo=i+2+upoloipo;
                    System.out.println("Year of Payback Period = "+(df.format(upoloipo))+"\n");
                    System.out.println("\n Inside isFirstTime Athroisma= "+athroisma);
                    resultPayback1.setText(String.valueOf(df.format(upoloipo)));
          //------------------------------------------???????------------------------------------------------//
                    //resultPayback1.setText(String.valueOf(upoloipo));
                    Payback1.setVisible(true);
                    resultPayback1.setVisible(true);
                    epithimito1=Double.parseDouble(String.valueOf(upoloipo));//Double.parseDouble(resultPayback1.getText())
                    resultepithimito=epithimito1;
                    //αν το αρχικο κοστος >= κερδους(ετησιο), 
                    //τότε εμφάνισε ποιά είναι η χρονιά επανείσπραξης(Payback Period)
                    if (Double.parseDouble(jTextFieldepithimitoEtos.getText())>=upoloipo){
//                        resultPayback1.setText(String.valueOf(df.format(upoloipo)));
                        JOptionPane.showMessageDialog(null, "Το έτος επανείσπραξης\nθα είναι πρίν το επιθυμιτό\nχρονικό διάστημα.\nΔηλαδή σε :"+df.format(upoloipo)+"έτη.");
                    }//if
                    //set first time = false για να ΜΗΝ ξανα μπει μέσα στην if
                    //resultPayback1.setText(String.valueOf(upoloipo));
                    isfirsttime=false;//η payback period επιστρέφει 1 αποτέλεσμα(το έτος επανείσπραξης)
                }//if  
                else if((Double.parseDouble(arxkostos.getText())<athroisma)&&isfirsttime){//=
                    DecimalFormat df = new DecimalFormat("#.##");//DecimalFormat df = new DecimalFormat("#.####")
                    df.setRoundingMode(RoundingMode.CEILING);
                    Double upoloipo;
                    upoloipo=Double.parseDouble(arxkostos.getText())-athroisma;
                    upoloipo=upoloipo/Double.parseDouble(list.get(i+1).getText());
                    System.out.println(df.format(upoloipo)+"\n");
                    upoloipo=i+2+upoloipo;
                    System.out.println("Year of Payback Period = "+(df.format(upoloipo))+"\n");
                    System.out.println("\n Inside isFirstTime Athroisma= "+athroisma);
                    resultPayback1.setText(String.valueOf(df.format(upoloipo)));
          //------------------------------------------???????------------------------------------------------//
                    //resultPayback1.setText(String.valueOf(upoloipo));
                    Payback1.setVisible(true);
                    resultPayback1.setVisible(true);
                    epithimito1=Double.parseDouble(String.valueOf(upoloipo));//Double.parseDouble(resultPayback1.getText())
                    resultepithimito=epithimito1;
                    //αν το αρχικο κοστος >= κερδους(ετησιο), 
                    //τότε εμφάνισε ποιά είναι η χρονιά επανείσπραξης(Payback Period)
                    if (Double.parseDouble(jTextFieldepithimitoEtos.getText())>=upoloipo){
//                        resultPayback1.setText(String.valueOf(df.format(upoloipo)));
                        JOptionPane.showMessageDialog(null, "Το έτος επανείσπραξης\nθα είναι πρίν το επιθυμιτό\nχρονικό διάστημα.\nΔηλαδή σε :"+df.format(upoloipo)+"έτη.");
                    }//if
                    //set first time = false για να ΜΗΝ ξανα μπει μέσα στην if
                    //resultPayback1.setText(String.valueOf(upoloipo));
                    isfirsttime=false;//η payback period επιστρέφει 1 αποτέλεσμα(το έτος επανείσπραξης)
                }//else if arxkostos<athroisma
    
            }//for
            DecimalFormat df = new DecimalFormat("#.####");//DecimalFormat df = new DecimalFormat("#.####")
            df.setRoundingMode(RoundingMode.CEILING);
            athroisma=athroisma-Double.parseDouble(arxkostos.getText());
            //result.setText("Καθαρό Κέρδος= "+String.valueOf(df.format(athroisma)));//-Double.parseDouble(kostos)
            result.setText(String.valueOf(athroisma));
            //--------Εμφάνιση μηνύματος ανάλογα με το αποτέλεσμα--------//
            if(Double.parseDouble(result.getText())> 0)
                JOptionPane.showMessageDialog(null, "Η επένδυση θα έχει κέρδος.");
            else if(Double.parseDouble(result.getText()) == 0)
                JOptionPane.showMessageDialog(null, "Η επένδυση δεν θα έχει κέρδος και ζημία.");
            else
                JOptionPane.showMessageDialog(null, "Η επένδυση θα έχει ζημία.");   
       //--------------INSERT INTO paybackperiod XAMPP DB----------------//  
       try{
            Class.forName("com.mysql.jdbc.Driver"); 
            xampp=DriverManager.getConnection("jdbc:mysql://localhost:3306/testxampp?zeroDateTimeBehavior=convertToNull","root","");      
            int dialogButton= JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Θέλεις να αποθηκεύσεις το αποτέλεσμα;","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                System.out.println("Before insert into\n"+username);
                String npvquery="INSERT INTO paybackperiod (username,arxkostos,epitokio,xronia,epithimito_etos,result,etos_epaneispraksis) VALUES (?,?,?,?,?,?,?) ";
                System.out.println("After insert into the username= \n"+username);
                pst=xampp.prepareStatement(npvquery);
                System.out.println("After prepareStatement\n");
                System.out.println("mphke");
                pst.setString(1,username);
                pst.setString(2, arxkostos.getText());
                pst.setString(3, jTextFieldEpitokio.getText());
                pst.setInt(4, k);
                pst.setString(5,jTextFieldepithimitoEtos.getText());
                pst.setDouble(6, athroisma);
                pst.setString(7, String.valueOf(epithimito1));//resultPayback1.getText()
                System.out.println("Vghke");
                pst.executeUpdate();
                pst.close();
                xampp.close();
            }//if dialogResult=YES OPTION
        }//try Insert Into
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Δεν υπάρχει σύνδεση στο δίκτυο.\nΞαναπροσπάθησε αργότερα.");//+e
                System.out.println("Exception in Db inside PaybackPeriod "+e);
           }//catch for insert
        }//try
        catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Παρακαλώ εισάγετε όλα τα πεδία.");
        }//catch
    }//GEN-LAST:event_resultButtonActionPerformed

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
        }//for visible
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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //-----------------------------------------------------//
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
        arxkostos.setEditable(true);
        arxkostos2.setText("");
        Payback1.setVisible(false);
        Payback2.setVisible(false);
        resultPayback1.setText("");
        
        resultPayback1.setVisible(false);
        resultPayback2.setText("");
        resultPayback2.setVisible(false);
        epitokio1TextField.setText("");
        jTextFieldepithimitoEtos1.setText("");
        resultPayback1.setText("");
        resultPayback2.setText("");
        jTextFieldepithimitoEtos.setText("");
        jTextFieldepithimitoEtos.setVisible(true);
        jTextFieldepithimitoEtos.setEditable(true);
        jTextFieldEpitokio.setText("");
        jTextFieldEpitokio.setEditable(true);
        result.setText("");
        result.setEnabled(true);
        result.setEditable(false);
        result1.setText("");
        resultButton1.setVisible(false);
        result1.setVisible(false);
        jCheckBox1.setSelected(false);
        jPanelSecondInvestment.setVisible(false);
        arxkostos.setEnabled(true);
        jComboBox1.setEnabled(true);
        resultButton.setEnabled(true);
   
    }//GEN-LAST:event_backButtonActionPerformed

    private void epitokio1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epitokio1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epitokio1TextFieldActionPerformed

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
        }//for
        //-----------------unvisible τα jTextField & jLabel ανάλογα με την επιλογή του χρήστη---------------//
        for(int i=k-1;i<list.size();i++){
            list.get(i).setVisible(false);
            LabelList.get(i).setVisible(false);
            //-----------------------------------------------------------//
            if(Integer.parseInt(jComboBox2.getSelectedItem().toString())<6)
                jSeparator7.setVisible(false);
            
            if(Integer.parseInt(jComboBox2.getSelectedItem().toString())<11)
                jSeparator6.setVisible(false);
        }//for
        this.validate();//ανανέωση του window
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()&&result.getText().equals("")){
                jCheckBox1.setSelected(false);
                JOptionPane.showMessageDialog(null, "Παρακαλώ υπολογίστε την πρώτη επιχείρηση.");
        }//if ..να βγεί πρώτα το αποτέλεσμα για την 1η επένδυση
        //όταν ο χρήστης επιλέξει ότι θέλει σύγκριση με 2η επένδυση
        //αρχικοποιούνται τα πεδία που βάζειτα μελλοντικά κέρδη
            if(jCheckBox1.isSelected()==true){
                jPanel1.validate();
                jPanelSecondInvestment.setVisible(true);
                result1.setVisible(true);
                result1.setEditable(false);
                resultButton1.setVisible(true);
                resultButton.setEnabled(false);
                arxkostos.setEditable(false);
                jTextFieldEpitokio.setEditable(false);
                jComboBox1.setEnabled(false);
                jTextFieldepithimitoEtos.setEditable(false);
                int arxikopoihsh = Integer.parseInt(jComboBox2.getSelectedItem().toString());//epilogh xronwn apo ton xrhsth 
                if(!result1.getText().isEmpty()){
                    Payback2.setVisible(true);
                    resultPayback2.setVisible(true);
                }//if result1 isNotEmpty
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
                this.validate();
            }//if
           else if(!jCheckBox1.isSelected() && !result.getText().isEmpty()){//
               int arxikopoihsh = Integer.parseInt(jComboBox1.getSelectedItem().toString());
                arxkostos.setEditable(true);
                jTextFieldEpitokio.setEditable(true);
                jComboBox1.setEnabled(true);
                jTextFieldepithimitoEtos.setEditable(true);
                resultButton.setEnabled(true);
                jPanelSecondInvestment.setVisible(false);
                resultButton1.setVisible(false);
                result1.setVisible(false);
                Payback2.setVisible(false);
                resultPayback2.setVisible(false);
                //arxkostos2.setText("");//arxiko kostos gia 2h ependush
                //epitokio1TextField.setText("");//epitokio gia 2h ependush
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
            this.validate();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void resultButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButton1ActionPerformed
        try{
            result1.setEditable(false);
            String kostos = arxkostos2.getText();
            String uepitokio=epitokio1TextField.getText();
            double athroisma=0;//Δήλωση μεταβλητής & αρχικοποίηση
            String gains=kerdos.getText();//η default πρωτη τιμή πιθανου κερδους(δίνεται απο τον χρήστη)
            double metatropi = (Double.parseDouble(uepitokio)/100);//---Μετατροπή της τιμής που δίνει ο χρήστης για επιτόκιο σε %---//
            int k = Integer.parseInt(jComboBox2.getSelectedItem().toString());//επιλογή χρόνων απο χρήστη
            athroisma += (Double.parseDouble(kerdos.getText())*Math.pow((1+metatropi),-1));//ειναι (-) επειδη είναι πχ. 1.10^(-1)..
            System.out.println("Μετατροπή πριν μπεί στην for = "+Math.pow((1+metatropi),-1));
            System.out.println("Athroisma prin mpei sthn for "+athroisma);
            boolean isfirsttime=true;//set isfirsttime = true
            double epithimito=0;//gia to insert into(epeidh den dexetai insert dedomenwn me df.format)
            if(k==1){
                DecimalFormat df = new DecimalFormat("#.##");//DecimalFormat df = new DecimalFormat("#.####")
                df.setRoundingMode(RoundingMode.CEILING);
                Double upoloipo;
                upoloipo=Double.parseDouble(arxkostos2.getText())-athroisma;
                upoloipo=upoloipo/Double.parseDouble(kerdos.getText());
                upoloipo=1+upoloipo;
                System.out.println("Year of Payback Period = "+(df.format(upoloipo))+"\n");
                resultPayback2.setText(String.valueOf(df.format(upoloipo)));
                Payback2.setVisible(true);
                resultPayback2.setVisible(true);
                epithimito=Double.parseDouble(String.valueOf(upoloipo));//Double.parseDouble(resultPayback1.getText())
            }//if year is 1
            for(int i=0;i<k-1;i++){//or i=1 //k-1
                System.out.println("before the 'athroisma' the i = "+i);
                athroisma+=(Double.parseDouble(list.get(i).getText()))*Math.pow((1+metatropi),-i-2);//or -i-1  ειναι (-) επειδη είναι πχ. 1.10^(-1)..
                System.out.println("After -i-2  the i= "+(-i-2));
                //System.out.println(list.get(i).getText()+" list items"+"& i =" + i);
                System.out.println("Μετατροπή(επιτοκίου) = "+Math.pow((1+metatropi),-i-2));//or i+1
                System.out.println("Άθροισμα ="+athroisma+  " of year= " +(i+2));
                if((Double.parseDouble(arxkostos2.getText())>=athroisma)&&isfirsttime){//.toString()
                    DecimalFormat df = new DecimalFormat("#.##");//DecimalFormat df = new DecimalFormat("#.####")
                    df.setRoundingMode(RoundingMode.CEILING);
                    Double upoloipo;
                    upoloipo=Double.parseDouble(arxkostos2.getText())-athroisma;
                    upoloipo=upoloipo/Double.parseDouble(list.get(i+1).getText());
                    System.out.println(df.format(upoloipo)+"\n");
                    upoloipo=i+2+upoloipo;
                    System.out.println("Year of Payback Period = "+(df.format(upoloipo)));
                    System.out.println("\n "+athroisma);
                    resultPayback2.setText(String.valueOf(df.format(upoloipo)));
                    Payback2.setVisible(true);
                    resultPayback2.setVisible(true);
                    epithimito=Double.parseDouble(String.valueOf(upoloipo));//Double.parseDouble(resultPayback1.getText())
                    //αν το αρχικο κοστος >= κερδους(ετησιο), 
                    //τότε εμφάνισε ποιά είναι η χρονιά επανείσπραξης(Payback Period)
                    if (Double.parseDouble(jTextFieldepithimitoEtos1.getText())>=upoloipo){
//                        resultPayback1.setText(String.valueOf(df.format(upoloipo)));
                        JOptionPane.showMessageDialog(null, "Το έτος επανείσπραξης\nθα είναι πρίν το επιθυμιτό\nχρονικό διάστημα.\nΔηλαδή σε :"+df.format(upoloipo)+"έτη.");
                    }//if
                    //set first time = false για να ΜΗΝ ξανα μπει μέσα στην if
                    isfirsttime=false;//η payback period επιστρέφει 1 αποτέλεσμα(το έτος επανείσπραξης)
                }//if
                else if((Double.parseDouble(arxkostos2.getText())<athroisma)&&isfirsttime){
                    DecimalFormat df = new DecimalFormat("#.##");//DecimalFormat df = new DecimalFormat("#.####")
                    df.setRoundingMode(RoundingMode.CEILING);
                    Double upoloipo;
                    upoloipo=Double.parseDouble(arxkostos2.getText())-athroisma;
                    upoloipo=upoloipo/Double.parseDouble(list.get(i+1).getText());
                    System.out.println(df.format(upoloipo)+"\n");
                    upoloipo=i+2+upoloipo;
                    System.out.println("Year of Payback Period = "+(df.format(upoloipo)));
                    System.out.println("\n "+athroisma);
                    resultPayback2.setText(String.valueOf(df.format(upoloipo)));
                    Payback2.setVisible(true);
                    resultPayback2.setVisible(true);
                    epithimito=Double.parseDouble(String.valueOf(upoloipo));//Double.parseDouble(resultPayback1.getText())
                    //αν το αρχικο κοστος >= κερδους(ετησιο), 
                    //τότε εμφάνισε ποιά είναι η χρονιά επανείσπραξης(Payback Period)
                    if (Double.parseDouble(jTextFieldepithimitoEtos1.getText())>=upoloipo){
//                        resultPayback1.setText(String.valueOf(df.format(upoloipo)));
                        JOptionPane.showMessageDialog(null, "Το έτος επανείσπραξης\nθα είναι πρίν το επιθυμιτό\nχρονικό διάστημα.\nΔηλαδή σε :"+df.format(upoloipo)+"έτη.");
                    }//if
                    //set first time = false για να ΜΗΝ ξανα μπει μέσα στην if
                    isfirsttime=false;//η payback period επιστρέφει 1 αποτέλεσμα(το έτος επανείσπραξης)
                }//else if arxkostos<athroisma
            }//for
            DecimalFormat df = new DecimalFormat("#.####");//DecimalFormat df = new DecimalFormat("#.####")
            df.setRoundingMode(RoundingMode.CEILING);
            athroisma=athroisma-Double.parseDouble(arxkostos2.getText());
            //result.setText("Καθαρό Κέρδος= "+String.valueOf(df.format(athroisma)));//-Double.parseDouble(kostos)
            result1.setText(String.valueOf(athroisma));
            //--------Εμφάνιση μηνύματος ανάλογα με το αποτέλεσμα--------//
            //if(Double.parseDouble(resultPayback2.getText())< Double.parseDouble(resultPayback1.getText()))
            if(epithimito < resultepithimito)
                JOptionPane.showMessageDialog(null, "Η δεύτερη επένδυση θα εισπράξει πιο γρήγορα\nτα χρήματα της αρχικής επένδυσης.");
            else if(epithimito == resultepithimito)
                JOptionPane.showMessageDialog(null, "Και οι δύο επενδύσεις θα εισπράξουν σε ίδιο χρονικό διάστημα\nτα χρήματα της αρχικής τους επένδυσης.");
            else
                JOptionPane.showMessageDialog(null, "Η πρώτη επένδυση θα εισπράξει πιο γρήγορα\nτα χρήματα της αρχικής επένδυσης."); 

            //------------------------Εμφάνιση ανάλογα με το αποτέλεσμα-------------------------//
            //---------------------------Σύγκριση με την 1η επένδυση----------------------------//
            if(Double.parseDouble(result1.getText()) > Double.parseDouble(result.getText()) && Double.parseDouble(result1.getText()) > 0)
                JOptionPane.showMessageDialog(null, "Το καθαρό κέρδος της δεύτερης επένδυσης\nείναι μεγαλύτερο.");
            else if(Double.parseDouble(result1.getText()) == Double.parseDouble(result.getText()))
                JOptionPane.showMessageDialog(null, "Οι δύο επενδύσεις θα έχουν ίδιο κέρδος.");
            else
                JOptionPane.showMessageDialog(null, "Η πρώτη επένδυση έχει μεγαλύτερο\nκαθαρό κέρδος.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Παρακαλώ εισάγετε όλα τα πεδία.");
        }
    }//GEN-LAST:event_resultButton1ActionPerformed
 public interface resetInterface{
        public void resetPanel();
    }
 
// private PaybackFunction.resetInterface reseter = null;//CLEAR BUTTON
    private void resultPayback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultPayback1ActionPerformed
        for(int i=0;i<list.size()-1;i++){
            list.get(i).setVisible(false);
            list.get(i).setText("");
            LabelList.get(i).setVisible(false);
            jSeparator7.setVisible(false);
            jSeparator6.setVisible(false);
        }//for
        kerdos.setText("");
        arxkostos.setText("");
        arxkostos2.setText("");
        jTextFieldEpitokio.setText("");
        jTextFieldepithimitoEtos.setText("");
        jTextFieldepithimitoEtos.setVisible(true);
        jTextFieldepithimitoEtos1.setText("");
        resultPayback1.setVisible(false);
        resultPayback2.setVisible(false);
        Payback1.setVisible(false);
        Payback2.setVisible(false);
        result.setText("");
        result.setEnabled(true);
        result.setEditable(false);
        result1.setText("");
        resultButton1.setVisible(false);
        result1.setVisible(false);
        jCheckBox1.setSelected(false);
        jPanelSecondInvestment.setVisible(false);
        arxkostos.setEnabled(true);
        jComboBox1.setEnabled(true);
        resultButton.setEnabled(true);
    }//GEN-LAST:event_resultPayback1ActionPerformed

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
            java.util.logging.Logger.getLogger(PaybackFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaybackFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaybackFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaybackFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        //PaybackFunction pp=new PaybackFunction();
        //pp.setSize(950, 650);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            //pp.setVisible(true);
              //  new PaybackFunction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Payback1;
    private javax.swing.JLabel Payback2;
    private java.awt.TextField arxkostos;
    private java.awt.TextField arxkostos2;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel epithimitoEtosjLabel;
    private javax.swing.JLabel epitokio;
    private javax.swing.JLabel epitokio1;
    private java.awt.TextField epitokio1TextField;
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
    private javax.swing.JLabel jLabelepithimitoEtos1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelSecondInvestment;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
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
    private javax.swing.JTextField jTextFieldEpitokio;
    private javax.swing.JTextField jTextFieldepithimitoEtos;
    private javax.swing.JTextField jTextFieldepithimitoEtos1;
    private javax.swing.JTextField kerdos;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.TextField result;
    private java.awt.TextField result1;
    private javax.swing.JButton resultButton;
    private javax.swing.JButton resultButton1;
    private javax.swing.JTextField resultPayback1;
    private javax.swing.JTextField resultPayback2;
    // End of variables declaration//GEN-END:variables
}
