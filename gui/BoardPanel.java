package gui;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class BoardPanel extends JPanel{
	
	 /**
	 *@author Raeymaekers Charles
	 */
	private static final long serialVersionUID = 1L;
	ArrayList <GamePanel> al = new ArrayList<GamePanel>();
	ArrayList<GamePanel> al2 = new ArrayList<GamePanel>(40);
	    int cm = 1;
	    int cg = 1;
	    int cc = 2;
	    int cma = 3;
	    int cca = 4;
	    int cl = 4;
	    int cs = 4;
	    int cmi = 5;
	    int csc = 8;
	    int csp = 1;
	    int cb = 6;
	    int cf = 1;
	     int cm2 = 10;
	    int cg2 = 9;
	    int cc2 = 8;
	    int cma2 = 7;
	    int cca2 = 6;
	    int cl2 = 5;
	    int cs2 = 4;
	    int cmi2 = 3;
	    int csc2 = 2;
	    int csp2 = 1;
	    int cb2 = 11;
	    int cf2 = 0;
	    
	    public Object addG(Object o){
	        return al.add((GamePanel) o);
	    }
	    public Object addT(Object o){
	    	return al2.add((GamePanel) o);
	    }
	    public ArrayList<GamePanel> getPions(){
	        return al;
	    }
	    //this method is use to print the board of the game
	    public void paintComponent(Graphics g){
	        super.paintComponent(g);
	        int x1 = 212;
	        int y1 = 84;
	        int x2 = x1 ;
	        int y2 = y1 + 600;
	        int x3 = x1;
	        int x4 = x1 + 600;
	        int y3 = y1;
	        int y4 = y3;
	        
	        for(int i = 0; i <= 10; i++){
	        	for(int j= 0; j <= 10; j++){
		        	g.drawLine(x3, y3, x4, y4);
		        	y3 = y3 +60;
		        	y4 = y3;
	        	}
		        	g.drawLine(x1, y1, x2, y2);
		        	x1 = x1 + 60;
		        	x2 = x1;
	        }
	        g.fillRect(332, 324, 120, 120);
	        g.fillRect(572, 324, 120, 120);
	        g.setColor(Color.blue);
	        
	       
	       
	        g.drawString(""+cm,129, 124);
	        g.drawString(""+cg,129, 169);
	        g.drawString(""+cc,129, 214);
	        g.drawString(""+cma,129, 259);
	        g.drawString(""+cca,129, 304);
	        g.drawString(""+cl,129, 349);
	        g.drawString(""+cs,129, 394);
	        g.drawString(""+cmi,129, 439);
	        g.drawString(""+csc,129, 484);
	        g.drawString(""+csp,129, 529);
	        g.drawString(""+cb,129, 574);
	        g.drawString(""+cf,129, 619);
	        g.drawString("rang", 60, 79);
	         g.drawString(""+cm2,70, 124);
	        g.drawString(""+cg2,70, 169);
	        g.drawString(""+cc2,70, 214);
	        g.drawString(""+cma2,70, 259);
	        g.drawString(""+cca2,70, 304);
	        g.drawString(""+cl2,70, 349);
	        g.drawString(""+cs2,70, 394);
	        g.drawString(""+cmi2,70, 439);
	        g.drawString(""+csc2,70, 484);
	        g.drawString(""+csp2,70, 529);
	        g.drawString(""+cb2,70, 574);
	        g.drawString(""+cf2,70, 619);
	      
	       for(int i1 = 0; i1 < al.size();i1 ++){
	            al.get(i1).paintComponent(g);
	            
	        }
	       for(int i2 = 0; i2 < al2.size();i2 ++) {
	    	    //g.drawImage(StratFenetre.getPath(),)
	    	    al2.get(i2).paintComponent(g);
	            
	            
	       }
	       
	   }
	    
	    public void reset(){
	    	al2.clear();
	    }
}
