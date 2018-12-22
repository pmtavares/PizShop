package GUI;

import Beans.DelivererBeans;
import Controller.DelivererController;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class DelivererScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form StaffScreen
     */
    //Variable for Singleton pattern
    private static DelivererScreen delivererScreen = null;
    MaskFormatter formatPhone;
    SimpleDateFormat formatDate;
    DelivererBeans delivererB;
    DelivererController delivererController;
    DefaultTableModel tModel;
    
    
    public DelivererScreen() {
        initComponents();       
        delivererB = new DelivererBeans();
        delivererController = new DelivererController();
        tModel = (DefaultTableModel)tb_deliverers.getModel();

    }

    public static DelivererScreen getInstance()
    {
        if(delivererScreen == null)
        {
            delivererScreen = new DelivererScreen();
        }
        return delivererScreen; 
    } 

    private void setCurrentDate(JTextField field)
    {
        formatDate = new SimpleDateFormat("dd/MM/yyyy");
        field.setText(formatDate.format(new Date()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_code = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_deliverers = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Register Deliverer");
        setToolTipText("");
        setAlignmentX(0.7F);
        setAlignmentY(0.7F);
        setMinimumSize(new java.awt.Dimension(500, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Code:");

        txt_code.setEditable(false);
        txt_code.setEnabled(false);
        txt_code.setName("txt_code"); // NOI18N
        txt_code.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Name:");

        txt_name.setEnabled(false);
        txt_name.setName("txt_name"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Date:");

        txt_date.setEditable(false);
        txt_date.setEnabled(false);
        txt_date.setName("txt_date"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Search:");

        txt_search.setName("txt_search"); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        tb_deliverers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Status", "Registration"
            }
        ));
        tb_deliverers.setColumnSelectionAllowed(false);
        tb_deliverers.setName("tb_deliverers"); // NOI18N
        tb_deliverers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_deliverersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_deliverers);
        if (tb_deliverers.getColumnModel().getColumnCount() > 0) {
            tb_deliverers.getColumnModel().getColumn(0).setMinWidth(60);
            tb_deliverers.getColumnModel().getColumn(0).setPreferredWidth(70);
            tb_deliverers.getColumnModel().getColumn(0).setMaxWidth(100);
            tb_deliverers.getColumnModel().getColumn(1).setMinWidth(140);
            tb_deliverers.getColumnModel().getColumn(1).setPreferredWidth(190);
            tb_deliverers.getColumnModel().getColumn(1).setMaxWidth(240);
            tb_deliverers.getColumnModel().getColumn(2).setMinWidth(100);
            tb_deliverers.getColumnModel().getColumn(2).setPreferredWidth(140);
            tb_deliverers.getColumnModel().getColumn(2).setMaxWidth(190);
        }

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/insert.png"))); // NOI18N
        btnNew.setToolTipText("New Record");
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setMaximumSize(new java.awt.Dimension(97, 23));
        btnNew.setMinimumSize(new java.awt.Dimension(97, 23));
        btnNew.setName("btnNew"); // NOI18N
        btnNew.setPreferredSize(new java.awt.Dimension(97, 23));
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btn_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/save.png"))); // NOI18N
        btn_register.setToolTipText("Save Record");
        btn_register.setEnabled(false);
        btn_register.setName("btn_register"); // NOI18N
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
        btn_edit.setToolTipText("Edit Record");
        btn_edit.setEnabled(false);
        btn_edit.setName("btn_register"); // NOI18N
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_register)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        btn_register.getAccessibleContext().setAccessibleName("btn_register");
        btn_register.getAccessibleContext().setAccessibleDescription("");

        setBounds(270, 40, 600, 588);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        cleanFields();
        setCurrentDate(txt_date);
        enableFields(true);
        txt_code.setText(delivererController.checkNextStaff());
        btn_register.setEnabled(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        fillClientBeans();
        delivererController.verifyData(delivererB);
        cleanFields();
        btn_register.setEnabled(false);
    }//GEN-LAST:event_btn_registerActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        tModel.setNumRows(0);
        delivererController.controlSearch(txt_search.getText(), tModel);
    }//GEN-LAST:event_txt_searchKeyReleased

    private void tb_deliverersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_deliverersMouseClicked
        //Get code of the selected row
        int codePassed = Integer.parseInt(tModel.getValueAt(tb_deliverers.getSelectedRow(),0).toString());
        delivererB = delivererController.fillFields(codePassed);
        txt_code.setText(delivererB.getCode() + "");
        txt_name.setText(delivererB.getName());
        txt_date.setText(delivererB.getRegistration());
        enableFields(true);
        btn_edit.setEnabled(true);
    }//GEN-LAST:event_tb_deliverersMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        fillClientBeans();
        delivererController.verifyDataEdit(delivererB);
        cleanFields();
        btn_edit.setEnabled(false);
        tModel.setNumRows(0);
        delivererController.controlSearch(txt_search.getText(), tModel);
        
    }//GEN-LAST:event_btn_editActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tb_deliverers;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
   
    final void enableFields(boolean value)
    {
        txt_name.setEnabled(value);
        txt_date.setEnabled(value);
    } 
    
    final void fillClientBeans()
    {
        delivererB.setName(txt_name.getText());
        delivererB.setRegistration(txt_date.getText());
        delivererB.setCode(Integer.parseInt(txt_code.getText()));
    }
    
    final void cleanFields()
    {
        txt_name.setText("");
        txt_date.setText("");
        //txt_search.setText("");
        //cb_function.setSelectedIndex(0);
    }
}
