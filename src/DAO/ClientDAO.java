package DAO;

import Beans.ClientBeans;
import Utility.Connec;
import Utility.Corrector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class ClientDAO {
    
    public ClientDAO()
    {
    }
    
    public void registerClient(ClientBeans client)
    {
        try {
            String SQLInsertion = "INSERT INTO clients(cli_name, cli_phone,cli_region, cli_street. cli_data_reg ) "
                    + "VALUES (?,?,?,?,?)";
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLInsertion);
            
            st.setString(1, client.getName());
            st.setString(2, client.getPhone());
            st.setString(3, client.getRegion());
            st.setString(4, client.getStreet());
            st.setString(5, Corrector.ConvertToSQL(client.getDateReg()));
            
            st.execute();
            Connec.getConnection().commit(); //enable commit
            JOptionPane.showMessageDialog(null,"Registration saved.","Saved", 0, new ImageIcon("/images/ok.png"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to conect to DB","Error", 0, new ImageIcon("/images/btn_sair.png"));
        }
    }
    
}
