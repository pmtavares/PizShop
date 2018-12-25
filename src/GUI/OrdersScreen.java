package GUI;

import Beans.ClientBeans;
import Controller.ClientController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author User
 */
public class OrdersScreen extends javax.swing.JInternalFrame {
    MaskFormatter formatPhone;
    ClientBeans clientB;
    ClientController clientController;
    List<String> clientList;


    public OrdersScreen() {
        initComponents();
        enableFields(false);
        clientList = new ArrayList<>();
        clientB = new ClientBeans();
        clientController = new ClientController();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFather = new javax.swing.JTabbedPane();
        PanelClients = new javax.swing.JPanel();
        btn_searchClient = new javax.swing.JButton();
        cb_clients = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txt_code = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_street = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_region = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        try
        {
            formatPhone = new MaskFormatter("(###)## ###-####");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error to insert phone", "Error", 0);
        }
        txt_phone = new JFormattedTextField(formatPhone);
        jLabel6 = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        btn_clientOrder = new javax.swing.JButton();
        btn_clientClose = new javax.swing.JButton();
        PanelOrders = new javax.swing.JPanel();
        txt_name_client = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_item = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cb_select_item = new javax.swing.JComboBox<>();
        btn_order_value = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_order_value = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_order_qt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_order_code = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_add = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        btn_calculate = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_total_value = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_finish_order = new javax.swing.JButton();
        btn_close_order = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Orders");
        setAlignmentX(0.9F);
        setAlignmentY(0.9F);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(100, 80));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        btn_searchClient.setText("Search");
        btn_searchClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_searchClient.setName("btn_searchClient"); // NOI18N
        btn_searchClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchClientActionPerformed(evt);
            }
        });

        cb_clients.setName("cb_clients"); // NOI18N

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Street:");

        txt_street.setEnabled(false);
        txt_street.setName("txt_street"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Region:");

        txt_region.setEnabled(false);
        txt_region.setName("txt_region"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Phone");

        txt_phone.setEnabled(false);
        txt_phone.setName("txt_phone"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Date:");

        txt_date.setEditable(false);
        txt_date.setEnabled(false);
        txt_date.setName("txt_date"); // NOI18N

        btn_clientOrder.setText("Order");
        btn_clientOrder.setToolTipText("");
        btn_clientOrder.setName("btn_clientOrder"); // NOI18N

        btn_clientClose.setText("Close");
        btn_clientClose.setActionCommand("btn_clientClose");
        btn_clientClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelClientsLayout = new javax.swing.GroupLayout(PanelClients);
        PanelClients.setLayout(PanelClientsLayout);
        PanelClientsLayout.setHorizontalGroup(
            PanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelClientsLayout.createSequentialGroup()
                        .addComponent(btn_searchClient, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_clients, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelClientsLayout.createSequentialGroup()
                            .addGroup(PanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelClientsLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_street, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelClientsLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_region, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelClientsLayout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelClientsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_clientOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_clientClose)
                .addGap(63, 63, 63))
        );
        PanelClientsLayout.setVerticalGroup(
            PanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_searchClient)
                    .addComponent(cb_clients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addGroup(PanelClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clientOrder)
                    .addComponent(btn_clientClose))
                .addContainerGap())
        );

        btn_searchClient.getAccessibleContext().setAccessibleName("btn_searchClient");
        cb_clients.getAccessibleContext().setAccessibleName("cb_clients");
        btn_clientOrder.getAccessibleContext().setAccessibleName("btn_clientOrder");
        btn_clientClose.getAccessibleContext().setAccessibleName("btn_clientClose");

        PanelFather.addTab("Clients", PanelClients);
        PanelClients.getAccessibleContext().setAccessibleName("PanelClients");

        txt_name_client.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_name_client.setToolTipText("");
        txt_name_client.setName("txt_name_client"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Item");

        txt_item.setToolTipText("");
        txt_item.setName("txt_item"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Select");

        cb_select_item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_select_item.setName("cb_select_item"); // NOI18N
        cb_select_item.setOpaque(false);

        btn_order_value.setText("Value");
        btn_order_value.setName("btn_order_value"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Value:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Quantity:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Code:");

        btn_add.setText("+");
        btn_add.setActionCommand("btn_add");
        btn_add.setName("btn_add"); // NOI18N

        btn_remove.setText("-");
        btn_remove.setActionCommand("btn_add");
        btn_remove.setName("btn_remove"); // NOI18N

        btn_calculate.setText("Calculate:");
        btn_calculate.setActionCommand("btn_calculate:");
        btn_calculate.setName("btn_calculate"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Total:");

        txt_total_value.setName("txt_total_value"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code item", "Description", "Value", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btn_finish_order.setText("Finish order");
        btn_finish_order.setName("btn_finish_order"); // NOI18N

        btn_close_order.setText("Close");
        btn_close_order.setName("btn_close_order"); // NOI18N

        javax.swing.GroupLayout PanelOrdersLayout = new javax.swing.GroupLayout(PanelOrders);
        PanelOrders.setLayout(PanelOrdersLayout);
        PanelOrdersLayout.setHorizontalGroup(
            PanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOrdersLayout.createSequentialGroup()
                .addGroup(PanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_name_client, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOrdersLayout.createSequentialGroup()
                        .addGroup(PanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelOrdersLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_item, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(PanelOrdersLayout.createSequentialGroup()
                                .addComponent(btn_order_value)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_order_value, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)))
                        .addGroup(PanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelOrdersLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_order_qt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_order_code, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelOrdersLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_select_item, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1)
                    .addGroup(PanelOrdersLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelOrdersLayout.createSequentialGroup()
                                .addComponent(btn_add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_remove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_calculate)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_total_value, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOrdersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_finish_order)
                .addGap(18, 18, 18)
                .addComponent(btn_close_order)
                .addGap(18, 18, 18))
        );
        PanelOrdersLayout.setVerticalGroup(
            PanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_name_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cb_select_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_order_value)
                    .addComponent(jLabel9)
                    .addComponent(txt_order_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_order_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_order_qt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_remove)
                    .addComponent(jLabel12)
                    .addComponent(txt_total_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calculate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_finish_order)
                    .addComponent(btn_close_order))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_remove.getAccessibleContext().setAccessibleName("btn_remove");
        btn_calculate.getAccessibleContext().setAccessibleName("btn_calculate");

        PanelFather.addTab("Orders", PanelOrders);
        PanelOrders.getAccessibleContext().setAccessibleName("PanelOrders");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFather)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFather)
        );

        PanelFather.getAccessibleContext().setAccessibleName("PanelFather");
        PanelFather.getAccessibleContext().setAccessibleDescription("");

        setBounds(280, 50, 650, 468);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clientCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btn_clientCloseActionPerformed

    private void btn_searchClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchClientActionPerformed
        cb_clients.removeAllItems();
        clientList.clear();
        String clientSearch = JOptionPane.showInputDialog(null, "Type the name of the client", "Search",3);
        clientController.controlSearch(clientSearch, clientList);
        //Same as for loop
        clientList.forEach((c) -> {
            cb_clients.addItem(c);
        });
        
        
    }//GEN-LAST:event_btn_searchClientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelClients;
    private javax.swing.JTabbedPane PanelFather;
    private javax.swing.JPanel PanelOrders;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_calculate;
    private javax.swing.JButton btn_clientClose;
    private javax.swing.JButton btn_clientOrder;
    private javax.swing.JButton btn_close_order;
    private javax.swing.JButton btn_finish_order;
    private javax.swing.JButton btn_order_value;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_searchClient;
    private javax.swing.JComboBox<String> cb_clients;
    private javax.swing.JComboBox<String> cb_select_item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_item;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_name_client;
    private javax.swing.JTextField txt_order_code;
    private javax.swing.JTextField txt_order_qt;
    private javax.swing.JTextField txt_order_value;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_region;
    private javax.swing.JTextField txt_street;
    private javax.swing.JTextField txt_total_value;
    // End of variables declaration//GEN-END:variables
    final void enableFields(boolean value)
    {
        txt_name.setEnabled(value);
        txt_street.setEnabled(value);
        txt_region.setEnabled(value);
        txt_date.setEnabled(value);
        txt_phone.setEnabled(value);
    } 
}
