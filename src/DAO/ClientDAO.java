package DAO;

import Beans.ClientBeans;
import Utility.Connec;
import Utility.Corrector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
            String SQLInsertion = "INSERT INTO clients(cli_name, cli_phone,cli_region, cli_street, cli_data_reg ) "
                    + "VALUES (?,?,?,?,?)";
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLInsertion);
            
            st.setString(1, client.getName());
            st.setString(2, client.getPhone());
            st.setString(3, client.getRegion());
            st.setString(4, client.getStreet());
            st.setString(5, Corrector.ConvertToSQL(client.getDateReg()));
            
            st.execute();
            Connec.getConnection().commit(); //enable commit
            JOptionPane.showMessageDialog(null,"Registration saved.","Saved", 0, new ImageIcon("./images/ok.png"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage(),"Error", 0, new ImageIcon("./images/btn_sair.png"));
        }
    }
    
    public String nextClient()
    {
        String SQLSelection = "SELECT cli_cod FROM clients order by cli_cod desc limit 1";
        try {            
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                int lastRegister =  Integer.parseInt(rs.getString("cli_cod")) + 1;
                return String.valueOf(lastRegister);
            }
            else
            {
                return "1";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to open last record!","Error", 0, new ImageIcon("./images/btn_sair.png"));
            return "0";
        }
    }
    
    
    public void searchClient(String search, DefaultTableModel model)
    {
        String SQLSelection = "SELECT * FROM clients WHERE cli_name LIKE '%" + search + "%' ";
        try {            
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("cli_cod"),rs.getString("cli_name"),rs.getString("cli_street"),rs.getString("cli_region"),rs.getString("cli_phone")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to search client","Error", 0, new ImageIcon("./images/btn_sair.png"));
            
        }
    }
    
    public void searchClient(String search, List<String> list)
    {
        String SQLSelection = "SELECT * FROM clients WHERE cli_name LIKE '%" + search + "%' ";
        try {            
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                list.add(rs.getString("cli_cod") + " - " +  rs.getString("cli_name") + " - " + rs.getString("cli_phone"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to search client","Error", 0, new ImageIcon("./images/btn_sair.png"));
            
        }
    }
    
    public ClientBeans fillFields(int code)
    {        
        ClientBeans clientBeans =  new ClientBeans();
        String SQLSelection = "SELECT * FROM clients WHERE cli_cod = ?";
        
        try {            
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, code);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                clientBeans.setCode(rs.getInt("cli_cod"));
                clientBeans.setName(rs.getString("cli_name"));
                clientBeans.setStreet(rs.getString("cli_street"));
                clientBeans.setRegion(rs.getString("cli_region"));
                clientBeans.setPhone(rs.getString("cli_phone"));
                clientBeans.setDateReg(Corrector.ConvertToJava(rs.getString("cli_data_reg")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error to select client","Error", 0, new ImageIcon("./images/btn_sair.png"));          
        }
        return clientBeans;
    }
    
    public void editClient(ClientBeans client)
    {
         try {
            String SQLInsertion = "UPDATE clients set cli_name = ?,  cli_phone = ?, cli_region = ?, cli_street = ? where cli_cod = ? ";
            PreparedStatement st = Connec.getConnection().prepareStatement(SQLInsertion);
            
            st.setString(1, client.getName());
            st.setString(2, client.getPhone());
            st.setString(3, client.getRegion());
            st.setString(4, client.getStreet());
            st.setInt(5, client.getCode());
            
            st.execute();
            Connec.getConnection().commit(); //enable commit
            JOptionPane.showMessageDialog(null,"Registration edited.","Saved", 0, new ImageIcon("./images/ok.png"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage(),"Error", 0, new ImageIcon("./images/btn_sair.png"));
        }
    }
    
}
