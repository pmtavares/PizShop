package DAO;

import Beans.MenuBeans;
import Utility.Connec;
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
public class MenuDAO {
    
    public MenuDAO()
    {
        
    }
    
    public void registerStaff(MenuBeans model)
    {
        try {
            String SQLInsertion = "INSERT INTO menu (men_description, men_type, men_value) VALUES (?,?,?)";
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLInsertion);
            
            st.setString(1, model.getDescription());
            st.setString(2, model.getType());
            st.setDouble(3, model.getValue());
            
            st.execute();
            Connec.getConnection().commit(); //enable commit
            JOptionPane.showMessageDialog(null,"Record saved.","Saved", 0, new ImageIcon(getClass().getResource("/Icons/ok.png")));
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage(),"Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));
        }
    }
    
    public String nextRecord()
    {
        String SQLSelection = "SELECT men_cod FROM menu order by men_cod desc limit 1";
        try {            
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                int lastRegister =  Integer.parseInt(rs.getString("men_cod")) + 1;
                return String.valueOf(lastRegister);
            }
            else
            {
                return "1";
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to open last record!","Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));
            return "0";
        }
    }
    
    
    public void searchRecord(String search, DefaultTableModel model)
    {
        String SQLSelection = "SELECT * FROM menu WHERE men_description LIKE '%" + search + "%' ";
        try {            
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("men_cod"),rs.getString("men_description"),rs.getString("men_type"),rs.getDouble("men_value") });
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to search record","Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));
            
        }
    }
    
    public MenuBeans fillFields(int code)
    {        
        MenuBeans menuBeans =  new MenuBeans();
        String SQLSelection = "SELECT * FROM menu WHERE men_cod = ?";
        
        try {            
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, code);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                menuBeans.setCode(rs.getInt("men_cod"));
                menuBeans.setDescription(rs.getString("men_description"));
                menuBeans.setType(rs.getString("men_type"));
                menuBeans.setValue(rs.getDouble("men_value"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to select record","Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));          
        }
        return menuBeans;
    }
    
    public void editRecord (MenuBeans model)
    {
         try {
            String SQLInsertion = "UPDATE menu set men_description = ?,  men_type = ?, men_value = ? where men_cod = ? ";
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLInsertion);
            
            st.setString(1, model.getDescription());
            st.setString(2, model.getType());
            st.setDouble(3, model.getValue());
            st.setInt(4, model.getCode());
            
            st.execute();
            Connec.getConnection().commit(); //enable commit
            JOptionPane.showMessageDialog(null,"Record edited.","Saved", 0, new ImageIcon(getClass().getResource("/Icons/ok.png")));
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage(),"Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));
        }
    }
    
}
