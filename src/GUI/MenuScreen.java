package GUI;

import Beans.MenuBeans;
import Controller.MenuController;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class MenuScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuScreen
     */
    //Variable for Singleton pattern
    private static MenuScreen menuScreen = null;
    MaskFormatter formatPhone;
    SimpleDateFormat formatDate;
    MenuBeans menuB;
    MenuController menuController;
    DefaultTableModel tModel;
    
    
    public MenuScreen() {
        initComponents();       
        menuB = new MenuBeans();
        menuController = new MenuController();
        tModel = (DefaultTableModel)tb_details.getModel();
        
        //tModel.addRow(new Object[]{1,"Pedro", "street", "Rathborne", "1212231"});
    }

    public static MenuScreen getInstance()
    {
        if(menuScreen == null)
        {
            menuScreen = new MenuScreen();
        }
        return menuScreen; 
    } 

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_code = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_details = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        cb_type = new javax.swing.JComboBox<>();
        txt_value = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Register Menu");
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
        jLabel2.setText("Description");
        jLabel2.setToolTipText("");

        txt_name.setEnabled(false);
        txt_name.setName("txt_name"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Type");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Value €:");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Search:");

        txt_search.setName("txt_search"); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        tb_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Description", "Type", "Value"
            }
        ));
        tb_details.setCellSelectionEnabled(true);
        tb_details.setName("tb_details"); // NOI18N
        tb_details.getTableHeader().setReorderingAllowed(false);
        tb_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_detailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_details);

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

        cb_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an item", "Pizza", "Soft Drink", "Water" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_value, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
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
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_register)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        btn_register.getAccessibleContext().setAccessibleName("btn_register");
        btn_register.getAccessibleContext().setAccessibleDescription("");

        setBounds(290, 40, 600, 588);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        cleanFields();
        enableFields(true);
        txt_code.setText(menuController.checkNextRecord());
        txt_value.setText("0.0");
        btn_register.setEnabled(true);
        btn_edit.setEnabled(false);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        fillMenuBeans();
        if(menuController.verifyData(menuB))
        {
            cleanFields();
            btn_register.setEnabled(false);
            btn_edit.setEnabled(false);        
        }
        
        
    }//GEN-LAST:event_btn_registerActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        tModel.setNumRows(0);
        menuController.controlSearch(txt_search.getText(), tModel);
    }//GEN-LAST:event_txt_searchKeyReleased

    private void tb_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_detailsMouseClicked
        //Get code of the selected row
        int codePassed = Integer.parseInt(tModel.getValueAt(tb_details.getSelectedRow(),0).toString());
        menuB = menuController.fillFields(codePassed);
        txt_code.setText(menuB.getCode() + "");
        txt_name.setText(menuB.getDescription());
        cb_type.setSelectedItem(menuB.getType());
        txt_value.setText(menuB.getValue().toString());
        enableFields(true);
        btn_edit.setEnabled(true);
    }//GEN-LAST:event_tb_detailsMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        fillMenuBeans();
        if(menuController.verifyDataEdit(menuB))
        {
            cleanFields();
            btn_register.setEnabled(false);
            btn_edit.setEnabled(false); 
            tModel.setNumRows(0);
            menuController.controlSearch(txt_search.getText(), tModel);
        }         

    }//GEN-LAST:event_btn_editActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_register;
    private javax.swing.JComboBox<String> cb_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tb_details;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_value;
    // End of variables declaration//GEN-END:variables
   
    final void enableFields(boolean value)
    {
        txt_name.setEnabled(value);
        cb_type.setEnabled(value);
        txt_value.setEnabled(value);
    } 
    
    final void fillMenuBeans()
    {      
        menuB.setDescription(txt_name.getText());
        menuB.setType(cb_type.getSelectedItem().toString());
        menuB.setValue(checkNumericValue(txt_value.getText()));
              
        
        //menuB.setCode(Integer.parseInt(txt_code.getText()));
        
    }
    
    private Double checkNumericValue(String  value)
    {
        double n = 0.0;
        if(!value.equals("")){
           try{
               n = Double.parseDouble(value); 
           }
           catch(NumberFormatException ex)
           {
                JOptionPane.showMessageDialog(null,"Wrong type!","Error", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));         
           } 
           return n;
        }
        else
        {
            return n;          
        }

    }
    
    final void cleanFields()
    {
        txt_name.setText("");
        txt_value.setText("");
        //txt_search.setText("");
        cb_type.setSelectedIndex(0);
    }
}
