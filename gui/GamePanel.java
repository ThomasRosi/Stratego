package gui;

import java.awt.*;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class GamePanel extends JPanel{
    /**
	*@author Raeymaekers Charles 
	*/
	private static final long serialVersionUID = 1L;
	int x, y, w, h;
	int rank;
	
   
 
    
	String path;
   //create the icon of the pieces
    public GamePanel(int rank, int x, int y, int w, int h,String side, String path){

    	this.w = w;
    	this.h = h;
    	this.x = x;
    	this.y = y; 
        this.path = path;
    }

 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
       
        try {
        	java.net.URL url = getClass().getResource("/image/" + path);
            Image img = ImageIO.read(url);
           
            g.drawImage(img, x, y, this);
            
        } catch (IOException e) {
            
        	e.printStackTrace(); 
        }
    
    } 
    
 
}
