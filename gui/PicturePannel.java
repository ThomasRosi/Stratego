package gui;

import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.*;
import javax.swing.*;
/**
*<p>
*this class is use to put a picture in background
*<p>
*@author Raeymaekers Charles
*/
public class PicturePannel extends JPanel{


	private static final long serialVersionUID = 1L;
	String path;
   
    public PicturePannel(String path){
        this.path = path;
    }

 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
     
        try {
        	java.net.URL urlBack = getClass().getResource("/image/" + path);
            Image img = ImageIO.read(urlBack);
             //for the background picture
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
        } catch (IOException e) {
            
        	e.printStackTrace(); 
        }
    
    }   
}