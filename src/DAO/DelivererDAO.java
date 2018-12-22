package DAO;

import Beans.DelivererBeans;
import Utility.Connec;
import Utility.Corrector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 */
public class DelivererDAO {
    
    public DelivererDAO()
    {
        
    }
    
    public void registerDeliverer(DelivererBeans model)
    {
        try {
            String SQLInsertion = "INSERT INTO deliverer(del_name, del_status, del_data_reg) VALUES (?,?,?)";
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLInsertion);
            
            st.setString(1, model.getName());
            st.setString(2, "Livre");
            st.setString(3, Corrector.ConvertToSQL(model.getRegistration()));

            
            st.execute();
            Connec.getConnection().commit(); //enable commit
            JOptionPane.showMessageDialog(null,"Registration saved.","Saved", 0, new ImageIcon(getClass().getResource("/Icons/ok.png")));
            
        } catch (SQLException ex) {
            Logger.getLogger(DelivererDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage(),"Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));
        }
    }
    
    public String nextDeliverer()
    {
        String SQLSelection = "SELECT del_cod FROM deliverer order by del_cod desc limit 1";
        try {            
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                int lastRegister =  Integer.parseInt(rs.getString("del_cod")) + 1;
                return String.valueOf(lastRegister);
            }
            else
            {
                return "1";
            }
        } catch (SQLException ex) {
            Logger.getLogger(DelivererDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to open last record!","Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));
            return "0";
        }
    }
    
    
    public void searchDeliverer(String search, DefaultTableModel model)
    {
        String SQLSelection = "SELECT * FROM deliverer WHERE del_name LIKE '%" + search + "%' ";
        try {            
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("del_cod"),rs.getString("del_name"),rs.getString("del_status"),Corrector.ConvertToJava(rs.getString("del_data_reg"))});
            }
        } catch (SQLException ex) {
            Logger.getLogger(DelivererDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to search data","Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));
            
        }
    }
    
    public DelivererBeans fillFields(int code)
    {        
        DelivererBeans delivererBeans =  new DelivererBeans();
        String SQLSelection = "SELECT * FROM deliverer WHERE del_cod = ?";
        
        try {            
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, code);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                delivererBeans.setCode(rs.getInt("del_cod"));
                delivererBeans.setName(rs.getString("del_name"));
                delivererBeans.setRegistration(Corrector.ConvertToJava(rs.getString("del_data_reg")));
                delivererBeans.setStatus(rs.getString("del_status"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DelivererDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to select deliverer","Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));          
        }
        return delivererBeans;
    }
    
    public void editDeliverer(DelivererBeans deliverer)
    {
         try {
            String SQLInsertion = "UPDATE deliverer set del_name = ?, del_status = ? where del_cod = ? ";
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLInsertion);
            
            st.setString(1, deliverer.getName());
            st.setString(2, deliverer.getStatus());
            st.setInt(3, deliverer.getCode());
            
            st.execute();
            Connec.getConnection().commit(); //enable commit
            JOptionPane.showMessageDialog(null,"Registration edited.","Saved", 0, new ImageIcon(getClass().getResource("/Icons/ok.png")));
            
        } catch (SQLException ex) {
            Logger.getLogger(DelivererDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage(),"Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));
        }
    }
    
}
