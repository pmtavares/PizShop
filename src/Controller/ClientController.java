package Controller;

import Beans.ClientBeans;
import DAO.ClientDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 * Implement Business layer in the future
 */
public class ClientController {
    
    ClientDAO clientDao;
    
    public ClientController()
    {
        clientDao = new ClientDAO();
    }
    
    public boolean verifyData(ClientBeans client)
    {
        if(client.getName().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the name.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        if(client.getRegion().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the region.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        if(client.getStreet().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the street.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        clientDao.registerClient(client);
        return true;
    }
    
    public boolean verifyDataEdit(ClientBeans client)
    {
        if(client.getName().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the name.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        if(client.getRegion().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the region.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        if(client.getStreet().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the street.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        clientDao.editClient(client);
        return true;
    }
    
    public String checkNextCLient()
    {
        return clientDao.nextClient();
    }
    
    public void controlSearch(String search, DefaultTableModel model)
    {
        clientDao.searchClient(search, model);
    }
    
    public  ClientBeans fillFields(int code)
    {
       return clientDao.fillFields(code);
    }
}
