package DAO;

import Utility.Connec;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class OrderDAO {
    
    public void searchItems(String search, List<String> list)
    {
        PreparedStatement st = null;
        String SQLQuery = "select * from menu where men_description like '%"+ search + "%'";
        try {            
            st = Connec.getConnection().prepareStatement(SQLQuery);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                list.add(rs.getString("men_description"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to search","Error", 0, new ImageIcon("./images/btn_sair.png"));          
        
        } finally {
            
        }
    }
    
}
