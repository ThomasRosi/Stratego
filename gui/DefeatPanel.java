package gui;
import java.awt.*;
import javax.swing.*;

public class DefeatPanel extends JPanel{
     /**
	 *@author Raeymaekers Charles 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){
       Font font = new Font("Courier", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.red);
        g.drawString("Defeat!",this.getWidth()/2 -50, this.getHeight()/2-70);
    }   
}