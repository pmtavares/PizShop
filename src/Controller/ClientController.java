package Controller;

import Beans.ClientBeans;
import DAO.ClientDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
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
            JOptionPane.showMessageDialog(null,"Fill out the name.","Error", 0, new ImageIcon("/images/delete.png"));
            return false;
        }
        if(client.getRegion().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the region.","Error", 0, new ImageIcon("/images/delete.png"));
            return false;
        }
        if(client.getStreet().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the street.","Error", 0, new ImageIcon("/images/delete.png"));
            return false;
        }
        clientDao.registerClient(client);
        return true;
    }
}
