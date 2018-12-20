package Utility;

import GUI.Main;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;


/**
 *
 * @author Pedro
 */
public class ScreenBackground extends JDesktopPane {
    private Image image;
    
    public ScreenBackground(String image)
    {
        //this.image = new ImageIcon(image).getImage();
        this.image = new ImageIcon(Main.class.getResource(image)).getImage();
    }
    
    //Draw Image to background
    @Override
    public void paintComponent(Graphics g)
    {
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}
