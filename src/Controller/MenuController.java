package Controller;

import Beans.MenuBeans;
import DAO.MenuDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 * Implement Business layer in the future
 */
public class MenuController {
    
    MenuDAO menuDAO;
    
    public MenuController()
    {
        menuDAO = new MenuDAO();
    }
    
    public boolean verifyData(MenuBeans model)
    {
        if(model.getDescription().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the description.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        if(model.getType().equals("Select a type"))
        {
            JOptionPane.showMessageDialog(null,"Fill out the type.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }

        menuDAO.registerStaff(model);
        return true;
    }
    
    public boolean verifyDataEdit(MenuBeans model)
    {
        if(model.getDescription().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the description.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        if(model.getType().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the type.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        if(model.getValue() < 0)
        {
            JOptionPane.showMessageDialog(null,"Fill out the value.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        
        menuDAO.editRecord(model);
        return true;
    }
    
    public String checkNextRecord()
    {
        return menuDAO.nextRecord();
    }
    
    public void controlSearch(String search, DefaultTableModel model)
    {
        menuDAO.searchRecord(search, model);
    }
    
    public  MenuBeans fillFields(int code)
    {
       return menuDAO.fillFields(code);
    }
}
