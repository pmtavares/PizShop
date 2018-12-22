package Controller;

import Beans.DelivererBeans;
import DAO.DelivererDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 * Implement Business layer in the future
 */
public class DelivererController {
    
    DelivererDAO delivererDao;
    
    public DelivererController()
    {
        delivererDao = new DelivererDAO();
    }
    
    public boolean verifyData(DelivererBeans deliverer)
    {
        if(deliverer.getName().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the name.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        

        delivererDao.registerDeliverer(deliverer);
        return true;
    }
    
    public boolean verifyDataEdit(DelivererBeans deliverer)
    {
        if(deliverer.getName().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the name.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        
       
        
        delivererDao.editDeliverer(deliverer);
        return true;
    }
    
    public String checkNextStaff()
    {
        return delivererDao.nextDeliverer();
    }
    
    public void controlSearch(String search, DefaultTableModel model)
    {
        delivererDao.searchDeliverer(search, model);
    }
    
    public  DelivererBeans fillFields(int code)
    {
       return delivererDao.fillFields(code);
    }
}
