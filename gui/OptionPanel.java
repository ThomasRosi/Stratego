package gui;

import java.awt.*;
import javax.swing.*;

public class OptionPanel extends JPanel{
     /**
	 *@author Raeymaekers Charles
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){
       Font font = new Font("Courier", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.red);
        g.drawString("IA level.",this.getWidth()/2 -50, this.getHeight()/2-70);
    }   
}