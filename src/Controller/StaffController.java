package Controller;

import Beans.StaffBeans;
import DAO.StaffDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 * Implement Business layer in the future
 */
public class StaffController {
    
    StaffDAO staffDao;
    
    public StaffController()
    {
        staffDao = new StaffDAO();
    }
    
    public boolean verifyData(StaffBeans staff)
    {
        if(staff.getName().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the name.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        if(staff.getFunction().equals("Select a function"))
        {
            JOptionPane.showMessageDialog(null,"Fill out the function.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }

        staffDao.registerStaff(staff);
        return true;
    }
    
    public boolean verifyDataEdit(StaffBeans staff)
    {
        if(staff.getName().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the name.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        if(staff.getFunction().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill out the function.","Error", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/Icons/delete.png")));
            return false;
        }
        
        staffDao.editStaff(staff);
        return true;
    }
    
    public String checkNextStaff()
    {
        return staffDao.nextStaff();
    }
    
    public void controlSearch(String search, DefaultTableModel model)
    {
        staffDao.searchStaff(search, model);
    }
    
    public  StaffBeans fillFields(int code)
    {
       return staffDao.fillFields(code);
    }
}
