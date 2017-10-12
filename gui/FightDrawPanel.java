package gui;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class FightDrawPanel extends JPanel{
     /**
	 *@author Raeymaekers Charles
	 */
	private static final long serialVersionUID = 1L;
	ArrayList <GamePanel> al = new ArrayList<GamePanel>();
	
    public Object addG(Object o){
        return al.add((GamePanel) o);
    }

	public void paintComponent(Graphics g){
       Font font = new Font("Courier", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.black);
        g.drawString("Draw!",this.getWidth()/2 -50, this.getHeight()/2-70);
        g.drawString("=", this.getWidth()/2, this.getHeight()/2);
        
        for(int i1 = 0; i1 < al.size();i1 ++){
            al.get(i1).paintComponent(g);
            
        }
    }


}