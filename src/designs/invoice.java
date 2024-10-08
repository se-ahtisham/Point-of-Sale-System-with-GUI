/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package designs;

/*
import designs.confirmorder;
import static designs.confirmorder.getExistingConfirmOrderInstance;*/
import designs.order;
import entities.Order;
import entities.orderproducts;
import entities.productclass;
import entities.store;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class invoice extends javax.swing.JFrame {

    /**
     * Creates new form invoice
     */
    public invoice() {
        this.setLocation(420, 130);
        initComponents();
        store.dummyadd();
        addvalues();
    }

    public void setSinglevalueontabel(productclass p) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] colarr = new Object[5];
        colarr[0] = p.getProductId();
        colarr[1] = p.getProductName();
        colarr[2] = p.getProductCatagory();
        colarr[3] = p.getProductStock();
        colarr[4] = p.getProductRetailPrice();
        model.addRow(colarr);
    }

    void addvalues() {
        ArrayList<productclass> objects = store.printall();
        if (objects != null) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            for (int i = 0; i < objects.size(); i++) {
                //column Array
                Object[] colarr = new Object[5];
                colarr[0] = objects.get(i).getProductId();
                colarr[1] = objects.get(i).getProductName();
                colarr[2] = objects.get(i).getProductCatagory();
                colarr[3] = objects.get(i).getProductStock();
                colarr[4] = objects.get(i).getProductRetailPrice();
                model.addRow(colarr);

            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField11 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField14 = new javax.swing.JTextField();
        userquantity = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField22 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField23 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        orderidfield = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));

        jTextField7.setBackground(new java.awt.Color(238, 238, 238));
        jTextField7.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 102, 102));
        jTextField7.setText("Great Dealing!!!!");
        jTextField7.setBorder(null);
        jTextField7.setFocusable(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setBackground(new java.awt.Color(238, 238, 238));
        jTextField8.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 102, 102));
        jTextField8.setText("MAKE INVOICE!");
        jTextField8.setBorder(null);
        jTextField8.setFocusable(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTextField13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(0, 102, 102));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Cancel");
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jTextField13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField13.setPreferredSize(new java.awt.Dimension(64, 19));
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(241, 241, 241));
        jComboBox2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 102, 102));
        jComboBox2.setBorder(null);
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setFocusable(false);

        jTextField11.setBackground(new java.awt.Color(242, 242, 242));
        jTextField11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(204, 204, 204));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Search by Name");
        jTextField11.setBorder(null);
        jTextField11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField11KeyPressed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 102, 102));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("OR");
        jTextField4.setBorder(null);
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField4.setFocusable(false);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField12.setBackground(new java.awt.Color(242, 242, 242));
        jTextField12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(204, 204, 204));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("Search by ID");
        jTextField12.setBorder(null);
        jTextField12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField12KeyPressed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Name", "Catagory", "Stocks", "Price"
            }
        ));
        jTable1.setAlignmentX(10.2F);
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(0, 102, 102));
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(227, 227, 227));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        jTextField14.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(0, 102, 102));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField14.setText("Enter Quantity:");
        jTextField14.setBorder(null);
        jTextField14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField14.setFocusable(false);
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        userquantity.setBackground(new java.awt.Color(242, 242, 242));
        userquantity.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        userquantity.setForeground(new java.awt.Color(204, 204, 204));
        userquantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userquantity.setBorder(null);
        userquantity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userquantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userquantityMouseClicked(evt);
            }
        });
        userquantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userquantityKeyPressed(evt);
            }
        });

        jTextField21.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(0, 102, 102));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField21.setText("Selected Quantites:");
        jTextField21.setBorder(null);
        jTextField21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField21.setFocusable(false);
        jTextField21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField21MouseClicked(evt);
            }
        });
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jComboBox3.setBackground(new java.awt.Color(241, 241, 241));
        jComboBox3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 102, 102));
        jComboBox3.setBorder(null);
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox3.setFocusable(false);

        jTextField22.setBackground(new java.awt.Color(0, 102, 102));
        jTextField22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(255, 255, 255));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setText("Confirm");
        jTextField22.setBorder(null);
        jTextField22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField22.setFocusable(false);
        jTextField22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField22MouseClicked(evt);
            }
        });

        jTextField24.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(0, 102, 102));
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField24.setText("Selected Items:");
        jTextField24.setBorder(null);
        jTextField24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField24.setFocusable(false);
        jTextField24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField24MouseClicked(evt);
            }
        });
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 231, 231), 2));
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));

        jTextField23.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(0, 102, 102));
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField23.setText("Customer Ph#:");
        jTextField23.setBorder(null);
        jTextField23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField23.setFocusable(false);
        jTextField23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField23MouseClicked(evt);
            }
        });
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });

        jTextField25.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(0, 102, 102));
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField25.setText("Customer ID-Card:");
        jTextField25.setBorder(null);
        jTextField25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField25.setFocusable(false);
        jTextField25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField25MouseClicked(evt);
            }
        });
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        jTextField26.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(0, 102, 102));
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField26.setText("Customer Address:");
        jTextField26.setBorder(null);
        jTextField26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField26.setFocusable(false);
        jTextField26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField26MouseClicked(evt);
            }
        });
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });

        jTextField27.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jTextField27.setForeground(new java.awt.Color(0, 102, 102));
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField27.setText("Customer Name:");
        jTextField27.setBorder(null);
        jTextField27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField27.setFocusable(false);
        jTextField27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField27MouseClicked(evt);
            }
        });
        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });

        jTextField28.setBackground(new java.awt.Color(242, 242, 242));
        jTextField28.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(204, 204, 204));
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.setText("03xxxxxxxxx");
        jTextField28.setBorder(null);
        jTextField28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField28MouseClicked(evt);
            }
        });

        jTextField29.setBackground(new java.awt.Color(242, 242, 242));
        jTextField29.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField29.setForeground(new java.awt.Color(204, 204, 204));
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setText("xxxxxxxxxxxxx");
        jTextField29.setBorder(null);
        jTextField29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField29MouseClicked(evt);
            }
        });

        jTextField30.setBackground(new java.awt.Color(242, 242, 242));
        jTextField30.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(204, 204, 204));
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setText("Name");
        jTextField30.setBorder(null);
        jTextField30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField30MouseClicked(evt);
            }
        });

        jTextField31.setBackground(new java.awt.Color(242, 242, 242));
        jTextField31.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField31.setForeground(new java.awt.Color(204, 204, 204));
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setText("Address");
        jTextField31.setBorder(null);
        jTextField31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField28)
                    .addComponent(jTextField29))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField31)
                    .addComponent(jTextField30))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(0, 102, 102));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField10.setText("Customer Details:");
        jTextField10.setBorder(null);
        jTextField10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField10.setFocusable(false);
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        orderidfield.setBackground(new java.awt.Color(242, 242, 242));
        orderidfield.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        orderidfield.setForeground(new java.awt.Color(204, 204, 204));
        orderidfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        orderidfield.setText("xx");
        orderidfield.setBorder(null);
        orderidfield.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orderidfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderidfieldMouseClicked(evt);
            }
        });

        jTextField33.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jTextField33.setForeground(new java.awt.Color(0, 102, 102));
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField33.setText("Order ID:");
        jTextField33.setBorder(null);
        jTextField33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField33.setFocusable(false);
        jTextField33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField33MouseClicked(evt);
            }
        });
        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(75, 75, 75)
                                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(userquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(115, 115, 115)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(118, 118, 118)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(orderidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(orderidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(0, 102, 102));
        jTextField5.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("SpotOut");
        jTextField5.setBorder(null);
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField5.setFocusable(false);

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(0, 102, 102));
        jTextField6.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("HOME");
        jTextField6.setBorder(null);
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField6.setFocusable(false);
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(0, 102, 102));
        jTextField9.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setText("PRODUCT");
        jTextField9.setBorder(null);
        jTextField9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField9.setFocusable(false);
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(0, 102, 102));
        jTextField16.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jTextField16.setText("USER");
        jTextField16.setBorder(null);
        jTextField16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField16.setFocusable(false);
        jTextField16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField16MouseClicked(evt);
            }
        });
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(0, 102, 102));
        jTextField17.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(255, 255, 255));
        jTextField17.setText("ORDERS");
        jTextField17.setBorder(null);
        jTextField17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField17.setFocusable(false);
        jTextField17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField17MouseClicked(evt);
            }
        });
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(130, 2));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/side.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTextField20.setEditable(false);
        jTextField20.setBackground(new java.awt.Color(0, 102, 102));
        jTextField20.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(255, 255, 255));
        jTextField20.setText("LOGOUT");
        jTextField20.setBorder(null);
        jTextField20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField20.setFocusable(false);
        jTextField20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField20MouseClicked(evt);
            }
        });
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jPanel10.setPreferredSize(new java.awt.Dimension(130, 2));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new dashboard().setVisible(true);
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new product().setVisible(true);

    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField16MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new user().setVisible(true);
    }//GEN-LAST:event_jTextField16MouseClicked

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField17MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new order().setVisible(true);
    }//GEN-LAST:event_jTextField17MouseClicked

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField20MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new signin().setVisible(true);

    }//GEN-LAST:event_jTextField20MouseClicked

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new order().setVisible(true);
    }//GEN-LAST:event_jTextField13MouseClicked

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10MouseClicked

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
        // TODO add your handling code here:
        if (jTextField11.getText().equals("Search by Name")) {
            jTextField11.setText("");
            jTextField11.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField11MouseClicked

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
        if (!jTextField11.getText().equals("Search by Name") && !jTextField11.getText().equals(" ")) {
            productclass obj = store.serachProductByName(jTextField11.getText());
            if (obj != null) {
                this.setSinglevalueontabel(obj);
            }
        } else {
            store.showerrormessage("Enter Product Name!");
        }
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyPressed
        // TODO add your handling code here:
        if (jTextField11.getText().equals("Search by Name")) {
            jTextField11.setText("");
            jTextField11.setForeground(Color.BLACK);
        }
        addvalues();
    }//GEN-LAST:event_jTextField11KeyPressed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // TODO add your handling code hsere:
        this.setVisible(false);
        this.dispose();
        new showallprodduct().setVisible(true);
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
        // TODO add your handling code here:
        if (jTextField12.getText().equals("Search by ID")) {
            jTextField12.setText("");
            jTextField12.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField12MouseClicked

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
        if (!jTextField12.getText().equals("Search by ID") && !jTextField12.getText().equals(" ")) {
            productclass obj = store.serachProductById(Integer.parseInt(jTextField12.getText()));
            if (obj != null) {
                this.setSinglevalueontabel(obj);
            }

        } else {
            store.showerrormessage("Enter Product ID!");
        }


    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyPressed
        // TODO add your handling code here:
        if (jTextField12.getText().equals("Search by ID")) {
            jTextField12.setText("");
            jTextField12.setForeground(Color.BLACK);
        }
        addvalues();
    }//GEN-LAST:event_jTextField12KeyPressed

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void userquantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userquantityMouseClicked
        // TODO add your handling code here:
        if (userquantity.getText().equals(" ") || userquantity.getText().isEmpty()) {
            userquantity.setText("");
            userquantity.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_userquantityMouseClicked

    private void jTextField21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21MouseClicked

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField22MouseClicked
        // TODO add your handling code here:

        Order newOrder = new Order();
        ArrayList<orderproducts> products = new ArrayList<>();
        ArrayList<orderproducts> orderstaticproducts = new ArrayList<>();

        if (!jTextField29.getText().equals("xxxxxxxxxxxxx") && !jTextField29.getText().isEmpty()) {
            newOrder.setCustomerId(Long.parseLong(jTextField29.getText()));

            if (!jTextField30.getText().equals("Name") && !jTextField30.getText().isEmpty()) {
                newOrder.setCustomerName(jTextField30.getText());

                if (!jTextField28.getText().equals("03xxxxxxxxx") && !jTextField28.getText().isEmpty()) {
                    newOrder.setCustomerPhonenumber(jTextField28.getText());

                    if (!jTextField31.getText().equals("Address") && !jTextField31.getText().isEmpty()) {
                        newOrder.setCustomerAddress(jTextField31.getText());

                        if (!orderidfield.getText().equals("xx") && !orderidfield.getText().isEmpty() && !orderidfield.getText().equals(" ")) {
                            boolean res = store.searchOrderbyid(Integer.parseInt(orderidfield.getText()));
                            if (res == false) {
                                //set
                                newOrder.setOrderId(Integer.parseInt(orderidfield.getText()));
                                for (int i = 0; i < jComboBox2.getItemCount(); i++) {
                                    orderproducts orderProduct = new orderproducts();

                                    int id = store.returnid(jComboBox2.getItemAt(i));

                                    int oldprice = store.returnprice(id);
                                    int newprice = oldprice * Integer.parseInt(jComboBox3.getItemAt(i));
                                    String cat = store.returnCatagory(id);

                                    orderProduct.setId(id);
                                    orderProduct.setName(jComboBox2.getItemAt(i));
                                    orderProduct.setPrice(newprice);
                                    orderProduct.setQuantity(Integer.parseInt(jComboBox3.getItemAt(i)));
                                    orderProduct.setCategory(cat);

                                    products.add(orderProduct);
                                    orderstaticproducts.add(orderProduct);

                                }
                                for (int i = 0; i < products.size(); i++) {
                                    newOrder.addOrder(products.get(i));
                                    newOrder.addstaticOrder(orderstaticproducts.get(i));
                                }
                                store.addOrder(newOrder);

                                userquantity.setText(" ");
                                userquantity.setForeground(new Color(204, 204, 204));
                                jTextField11.setText("Search by Name");
                                jTextField11.setForeground(new Color(204, 204, 204));
                                jTextField12.setText("Search by ID");
                                jTextField12.setForeground(new Color(204, 204, 204));
                                addvalues();

                                new confirmorder(orderidfield.getText()).setVisible(true);
                                this.setVisible(false);
                                this.dispose();
                            } else {
                                store.showerrormessage("Try antoher ID");
                            }

                        } else {
                            store.showerrormessage("Enter Order-ID!");
                        }

                    } else {
                        store.showerrormessage("Enter Address!");
                    }
                } else {
                    store.showerrormessage("Enter Ph#!");
                }
            } else {
                store.showerrormessage("Enter Name!");
            }
        } else {
            store.showerrormessage("Enter ID!");
        }


    }//GEN-LAST:event_jTextField22MouseClicked

    private void jTextField23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23MouseClicked

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24MouseClicked

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25MouseClicked

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26MouseClicked

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jTextField27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField27MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27MouseClicked

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField28MouseClicked
        // TODO add your handling code here:
        if (!jTextField30.getText().equals("Name")) {
            if (jTextField28.getText().equals("03xxxxxxxxx")) {
                jTextField28.setText("");
                jTextField28.setForeground(Color.BLACK);
            }
        } else {
            store.showerrormessage("Fill the Name Field");
        }
    }//GEN-LAST:event_jTextField28MouseClicked

    private void jTextField29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField29MouseClicked
        // TODO add your handling code here:
        if (jTextField29.getText().equals("xxxxxxxxxxxxx")) {
            jTextField29.setText("");
            jTextField29.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_jTextField29MouseClicked

    private void jTextField30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField30MouseClicked
        // TODO add your handling code here:

        if (jTextField30.getText().equals("Name")) {
            jTextField30.setText("");
            jTextField30.setForeground(Color.BLACK);
        }


    }//GEN-LAST:event_jTextField30MouseClicked

    private void jTextField31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField31MouseClicked
        // TODO add your handling code here:     
        if (!jTextField28.getText().equals("xxxxxxxxxxxxx")) {

            if (jTextField31.getText().equals("Address")) {
                jTextField31.setText("");
                jTextField31.setForeground(Color.BLACK);
            }
        } else {
            store.showerrormessage("Fill Phone Number Field!");
        }
    }//GEN-LAST:event_jTextField31MouseClicked

    private void userquantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userquantityKeyPressed
        boolean results = false;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!jTextField11.getText().equals("Search by Name") && !jTextField11.getText().equals(" ")) {
                results = store.serachstock(jTextField11.getText(), Integer.parseInt(userquantity.getText()));
                if (results) {

                    String findname = jTextField11.getText();
                    int id = store.returnid(findname, Integer.parseInt(userquantity.getText()));
                    store.updateStock(id, Integer.parseInt(userquantity.getText()));

                    jComboBox2.addItem(jTextField11.getText());
                    jComboBox2.setSelectedItem(jTextField11.getText());
                    jComboBox3.addItem(userquantity.getText());
                    jComboBox3.setSelectedItem(userquantity.getText());

                    userquantity.setText("");
                    userquantity.setForeground(new Color(204, 204, 204));
                    jTextField11.setText("Search by Name");
                    jTextField11.setForeground(new Color(204, 204, 204));
                    jTextField12.setText("Search by ID");
                    jTextField12.setForeground(new Color(204, 204, 204));

                    addvalues();

                } else {
                    store.showerrormessage("Out of Stock!");
                }

            }
            if (!jTextField12.getText().equals("Search by ID") && !jTextField12.getText().equals(" ")) {
                results = store.serachstockbyid(Integer.parseInt(jTextField12.getText()), Integer.parseInt(userquantity.getText()));
                if (results) {
                    int id = Integer.parseInt(jTextField12.getText());
                    store.updateStock(id, Integer.parseInt(userquantity.getText()));
                    String name = store.returnname(Integer.parseInt(jTextField12.getText()));

                    jComboBox2.addItem(name);
                    jComboBox2.setSelectedItem(name);
                    jComboBox3.addItem(userquantity.getText());
                    jComboBox3.setSelectedItem(userquantity.getText());

                    userquantity.setText("");
                    userquantity.setForeground(new Color(204, 204, 204));
                    jTextField11.setText("Search by Name");
                    jTextField11.setForeground(new Color(204, 204, 204));
                    jTextField12.setText("Search by ID");
                    jTextField12.setForeground(new Color(204, 204, 204));

                    addvalues();

                } else {
                    store.showerrormessage("Out of Stock!");
                }

            }

            /*
            if (!jTextField12.getText().equals("Search by ID") && !jTextField12.getText().equals(" "))
            {
                results = store.serachstockbyid(Integer.parseInt(jTextField12.getText()), Integer.parseInt(userquantity.getText()));
                if (results) {
                    orderproducts orderProduct = new orderproducts();
                    Order newOrder = new Order();
                    Order newstaticOrder = new Order();
                    if (!jTextField29.getText().equals("xxxxxxxxxxxxx")) {
                        newOrder.setCustomerId(Long.parseLong(jTextField29.getText()));
                        newOrder.setOrderId(Integer.parseInt(jTextField29.getText()));
                        if (!jTextField30.getText().equals("Name")) {
                            newOrder.setCustomerName(jTextField30.getText());
                            if (!jTextField28.getText().equals("03xxxxxxxxx")) {
                                newOrder.setCustomerPhonenumber(jTextField28.getText());
                                if (!jTextField31.getText().equals("Address")) {
                                    newOrder.setCustomerAddress(jTextField31.getText());
                                    if (!jTextField12.getText().equals("Search by Id") && !jTextField12.getText().isEmpty()) {
                                        String name = store.returnproductname(Integer.parseInt(jTextField12.getText()));
                                        orderProduct.setName(name); // Set the product name                                     
                                        if (!userquantity.getText().equals(" ")) {
                                            orderProduct.setQuantity(Integer.parseInt(userquantity.getText()));
                                            int id = store.returnid(name, Integer.parseInt(userquantity.getText()));
                                            orderProduct.setId(id);

                                            int oldprice = store.returnprice(id);
                                            int newprice = oldprice * Integer.parseInt(userquantity.getText());
                                            orderProduct.setPrice(newprice);

                                            String cat = store.returnCatagory(id);
                                            orderProduct.setCategory(cat);

                                            orderid.setText(jTextField29.getText());
                                            newOrder.addOrder(orderProduct);

                                            store.updateStock(id, Integer.parseInt(userquantity.getText()));

                                            jComboBox2.addItem(name);
                                            jComboBox2.setSelectedItem(name);
                                            jComboBox3.addItem(userquantity.getText());
                                            jComboBox3.setSelectedItem(userquantity.getText());
                                            userquantity.setText("");
                                            userquantity.setForeground(new Color(204, 204, 204));
                                            jTextField11.setText("Search by Name");
                                            jTextField11.setForeground(new Color(204, 204, 204));
                                            jTextField12.setText("Search by ID");
                                            jTextField12.setForeground(new Color(204, 204, 204));

                                            addvalues();
                                        } else {
                                            store.showerrormessage("Enter Quantity!");
                                        }
                                    } else {
                                        store.showerrormessage("Enter Name!");
                                    }
                                } else {
                                    store.showerrormessage("Enter Address!");
                                }
                            } else {
                                store.showerrormessage("Enter Ph#!");
                            }
                        } else {
                            store.showerrormessage("Enter Name!");
                        }
                    } else {
                        store.showerrormessage("Enter ID Card!");
                    }
                } else {
                    store.showerrormessage("Out of stock!");
                }

            }*/
        }
    }//GEN-LAST:event_userquantityKeyPressed

    private void jTextField33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField33MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33MouseClicked

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void orderidfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderidfieldMouseClicked
        // TODO add your handling code here:
        if (orderidfield.getText().equals("xx") || orderidfield.getText().equals(" ")) {
            orderidfield.setText("");
            orderidfield.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_orderidfieldMouseClicked

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
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    public static javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField orderidfield;
    public static javax.swing.JTextField userquantity;
    // End of variables declaration//GEN-END:variables
}
