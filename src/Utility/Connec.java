package Utility;

/**
 *
 * @author Pedro
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.gjt.mm.mysql.Driver;
import sun.util.logging.PlatformLogger;

public class Connec {
    private final String URL = "jdbc:mysql://localhost:3306/pizza";
    private final String DRIVER = "org.gjt.mm.mysql.Driver";
    private final String USER = "root";
    private final String PASSWORD = "";
    private static Connection Con;
    
    public Connec()
    {        
        try
        {
            Con = DriverManager.getConnection(URL, USER, PASSWORD);
            Con.setAutoCommit(false); //disable commit
            JOptionPane.showMessageDialog(null,"Connected to DB","Success", 1);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error to conect to DB","Error", 0);
        }
    }
    
    public static Connection getConnection()
    {
        if(Con == null)
        {
            new Connec();
        }
        return Con;
    }
    
    public static void closeConnection()
    {
        try
        {            
            if(!Con.isClosed())
            {
                Con.close();
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Connec.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void main(String args[])
    {
        Connec.getConnection();
    }
        
}
