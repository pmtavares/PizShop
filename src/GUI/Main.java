package GUI;

import Utility.ScreenBackground;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class Main extends javax.swing.JFrame {
   
    ScreenBackground screen;
    ClientScreen clientScreen;
    StaffScreen staffScreen;
    DelivererScreen delivererScreen;
    MenuScreen menuScreen;
    OrdersScreen orderScreen;
    
    public Main() {
       initComponents();
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       setLayout(new GridLayout());
       // screen = new ScreenBackground("src/Icons/pizzeria-background1.jpg");  
       screen = new ScreenBackground("/Icons/pizzeria-background1.jpg");
       getContentPane().add(screen);
        //Menu Icons
       setMenuIcons(main_menu);
        //Form Icon
       setFormIconImage();
        
    }
    
    private void setMenuIcons(JMenuBar menu)
    {
       //One way to insert icons. This way, we dont need to create a folder after building in order
       // to show the images
       menu.getMenu(0).setIcon(new ImageIcon(getClass().getResource("/Icons/insert-32.png")));       
       menu.getMenu(1).setIcon(new ImageIcon(getClass().getResource("/Icons/ico_till.png")));
       menu.getMenu(2).setIcon(new ImageIcon(getClass().getResource("/Icons/ico_rep.png")));
       menu.getMenu(3).setIcon(new ImageIcon(getClass().getResource("/Icons/ico_exit.png")));
       //Sub Menus: Second way to insert icons. The line below is with a folder with the images
       //menu.getMenu(0).getItem(0).setIcon(new ImageIcon("src/Icons/ico_clients.png"));
       menu.getMenu(0).getItem(0).setIcon(new ImageIcon(getClass().getResource("/Icons/ico_clients.png")));
       menu.getMenu(0).getItem(1).setIcon(new ImageIcon(getClass().getResource("/Icons/ico_staff.png")));
       menu.getMenu(0).getItem(2).setIcon(new ImageIcon(getClass().getResource("/Icons/ico_menu.png")));
       menu.getMenu(0).getItem(3).setIcon(new ImageIcon(getClass().getResource("/Icons/ico_boy.png")));
    }

    private void setFormIconImage()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/ico_menu.png"));
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_client = new javax.swing.JMenuItem();
        menuStaff = new javax.swing.JMenuItem();
        menuMenu = new javax.swing.JMenuItem();
        menuDeliverer = new javax.swing.JMenuItem();
        menu_till = new javax.swing.JMenu();
        menuOrder = new javax.swing.JMenuItem();
        menu_report = new javax.swing.JMenu();
        menu_exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tavares Pizzeria");

        main_menu.setName("main_menu"); // NOI18N

        jMenu1.setText("Register");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menu_client.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_client.setText("Clients");
        menu_client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_clientActionPerformed(evt);
            }
        });
        jMenu1.add(menu_client);

        menuStaff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuStaff.setText("Staff");
        menuStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuStaffActionPerformed(evt);
            }
        });
        jMenu1.add(menuStaff);

        menuMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuMenu.setText("Menu");
        menuMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMenuActionPerformed(evt);
            }
        });
        jMenu1.add(menuMenu);

        menuDeliverer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuDeliverer.setText("Deliverer");
        menuDeliverer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuDeliverer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDelivererActionPerformed(evt);
            }
        });
        jMenu1.add(menuDeliverer);

        main_menu.add(jMenu1);

        menu_till.setText("Cashier");
        menu_till.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_till.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuOrder.setText("Orders");
        menuOrder.setName("menuOrder"); // NOI18N
        menuOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOrderActionPerformed(evt);
            }
        });
        menu_till.add(menuOrder);
        menuOrder.getAccessibleContext().setAccessibleName("menuOrder");

        main_menu.add(menu_till);

        menu_report.setText("Reports");
        menu_report.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_report.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        main_menu.add(menu_report);

        menu_exit.setText("Exit");
        menu_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_exit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        main_menu.add(menu_exit);

        setJMenuBar(main_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_clientActionPerformed
        clientScreen = ClientScreen.getInstance();
        if (!clientScreen.isShowing()){
            screen.add(clientScreen);
            clientScreen.show();
        }
        
    }//GEN-LAST:event_menu_clientActionPerformed

    private void menuStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStaffActionPerformed
        //Refactor to use singleton and avoid many windows to open
        staffScreen = new StaffScreen();
        screen.add(staffScreen);
        staffScreen.setVisible(true);
        
    }//GEN-LAST:event_menuStaffActionPerformed

    private void menuDelivererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDelivererActionPerformed
        delivererScreen = DelivererScreen.getInstance();
        if(!delivererScreen.isShowing())
        {
            screen.add(delivererScreen);
            delivererScreen.show();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Window is already opened","Info", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/info-64.png")));
        }
       
    }//GEN-LAST:event_menuDelivererActionPerformed

    private void menuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMenuActionPerformed
        menuScreen = MenuScreen.getInstance();
        if(!menuScreen.isShowing())
        {
            screen.add(menuScreen);
            menuScreen.show();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Window is already opened","Info", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/info-64.png")));
        }
    }//GEN-LAST:event_menuMenuActionPerformed

    private void menuOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOrderActionPerformed
        orderScreen = new OrdersScreen();
        screen.add(orderScreen);
        orderScreen.show();
    }//GEN-LAST:event_menuOrderActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar main_menu;
    private javax.swing.JMenuItem menuDeliverer;
    private javax.swing.JMenuItem menuMenu;
    private javax.swing.JMenuItem menuOrder;
    private javax.swing.JMenuItem menuStaff;
    private javax.swing.JMenuItem menu_client;
    private javax.swing.JMenu menu_exit;
    private javax.swing.JMenu menu_report;
    private javax.swing.JMenu menu_till;
    // End of variables declaration//GEN-END:variables
}
