package DAO;

import Beans.StaffBeans;
import Utility.Connec;
import Utility.Corrector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 */
public class StaffDAO {
    
    public StaffDAO()
    {
        
    }
    
    public void registerStaff(StaffBeans staff)
    {
        try {
            String SQLInsertion = "INSERT INTO staffs(name, function, data_reg, staff_cod) VALUES (?,?,?, ?)";
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLInsertion);
            
            st.setString(1, staff.getName());
            st.setString(2, staff.getFunction());
            st.setString(3, Corrector.ConvertToSQL(staff.getDateReg()));
            st.setInt(4, staff.getCode());
            
            st.execute();
            Connec.getConnection().commit(); //enable commit
            JOptionPane.showMessageDialog(null,"Registration saved.","Saved", 0, new ImageIcon(getClass().getResource("/Icons/ok.png")));
            
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage(),"Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));
        }
    }
    
    public String nextStaff()
    {
        String SQLSelection = "SELECT staff_cod FROM staffs order by staff_cod desc limit 1";
        try {            
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                int lastRegister =  Integer.parseInt(rs.getString("staff_cod")) + 1;
                return String.valueOf(lastRegister);
            }
            else
            {
                return "1";
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to open last record!","Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));
            return "0";
        }
    }
    
    
    public void searchStaff(String search, DefaultTableModel model)
    {
        String SQLSelection = "SELECT * FROM staffs WHERE name LIKE '%" + search + "%' ";
        try {            
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("staff_cod"),rs.getString("name"),rs.getString("function"),Corrector.ConvertToJava(rs.getString("data_reg"))});
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to search staff","Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));
            
        }
    }
    
    public StaffBeans fillFields(int code)
    {        
        StaffBeans staffBeans =  new StaffBeans();
        String SQLSelection = "SELECT * FROM staffs WHERE staff_cod = ?";
        
        try {            
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, code);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                staffBeans.setCode(rs.getInt("staff_cod"));
                staffBeans.setName(rs.getString("name"));
                staffBeans.setDateReg(Corrector.ConvertToJava(rs.getString("data_reg")));
                staffBeans.setFunction(rs.getString("function"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to select staff","Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));          
        }
        return staffBeans;
    }
    
    public void editStaff(StaffBeans staff)
    {
         try {
            String SQLInsertion = "UPDATE staffs set name = ?,  function = ? where staff_cod = ? ";
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLInsertion);
            
            st.setString(1, staff.getName());
            st.setString(2, staff.getFunction());
            st.setInt(3, staff.getCode());
            
            st.execute();
            Connec.getConnection().commit(); //enable commit
            JOptionPane.showMessageDialog(null,"Registration edited.","Saved", 0, new ImageIcon(getClass().getResource("/Icons/ok.png")));
            
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage(),"Error", 0, new ImageIcon(getClass().getResource("/Icons/btn_sair.png")));
        }
    }
    
}
