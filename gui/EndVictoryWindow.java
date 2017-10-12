package gui;

import javax.swing.*;

public class EndVictoryWindow extends JFrame {

	 /**
	 *@author Raeymaekers Charles
	 */
	private static final long serialVersionUID = 1L;

	public EndVictoryWindow(){
		
		 VictoryPanel vicpan = new VictoryPanel();
	     //give the title 
	     this.setTitle("End");
	     //define the size: 300 pixels of weight et 300 pixels high
	     this.setSize(300, 300);
	     //define the location to the center with null
	     this.setLocationRelativeTo(null);
	     //we close the fenetre when we click on the red cross
	     this.setDefaultCloseOperation(OptionFenetre.EXIT_ON_CLOSE);
	     //define if we could extend the fenetre, in this case we can't
	     this.setResizable(false);
	     this.setContentPane(vicpan);
	     //we make this visible to us
		 this.setVisible(true);
	 }

}
