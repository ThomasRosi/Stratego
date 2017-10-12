package gui;

import javax.swing.*;


public class FightDrawWindow extends JFrame {

	 /**
	 *@author Raeymaekers Charles 
	 */
	private static final long serialVersionUID = 1L;

	public FightDrawWindow(int i, int j){
		
		 FightDrawPanel fightpan = new FightDrawPanel();
		 if( i == 10){
			 fightpan.addG(new GamePanel(10,100, 100, 40, 40,"blue", "Marechal.png"));
		 }
		 else if(i == 9){
			 fightpan.addG(new GamePanel(9,100, 100, 40, 40,"blue", "General.png"));
		 }
		 else if(i == 8){
			 fightpan.addG(new GamePanel(8,90, 100, 40, 40,"blue", "Colonel.png"));
		 }
		 else if(i == 7){
			 fightpan.addG(new GamePanel(7,90, 100, 40, 40,"blue", "Major.png"));
		 }
		 else if(i == 6){
			 fightpan.addG(new GamePanel(6,90, 100, 40, 40,"blue", "Captain.png"));
		 }
		 else if(i == 5){
			 fightpan.addG(new GamePanel(5,90, 100, 40, 40,"blue", "Lieutenant.png"));
		 }
		 else if(i == 4){
			 fightpan.addG(new GamePanel(4,90, 100, 40, 40,"blue", "Sergeant.png"));
		 }
		 else if(i == 3){
			 fightpan.addG(new GamePanel(3,90, 100, 40, 40,"blue","Miner.png"));
		 }
		 else if(i == 2){
			 fightpan.addG(new GamePanel(2,90, 100, 40, 40,"blue","Scout.png"));
		 }
		 else if(i == 1){
			 fightpan.addG(new GamePanel(1,90, 100, 40, 40,"blue", "Spy.png"));
		 }
		 else if(i == 11){
			 fightpan.addG(new GamePanel(11,90, 100, 40, 40,"blue", "Bomb.png"));
		 }
		 else if(i == 0){
			 fightpan.addG(new GamePanel(0,90, 100, 40, 40,"blue", "Flag.png"));
		 }
		 
		 
		 if( j == 10){
			 fightpan.addG(new GamePanel(10,170, 100, 40, 40,"red", "Marechal2.png"));
		 }
		 else if(j == 9){
			 fightpan.addG(new GamePanel(9,170, 100, 40, 40,"red", "General2.png"));
		 }
		 else if(j == 8){
			 fightpan.addG(new GamePanel(8,170, 100, 40, 40,"red", "Colonel2.png"));
		 }
		 else if(j == 7){
			 fightpan.addG(new GamePanel(7,170, 100,40,40,"red", "Major2.png"));
		 }
		 else if(j == 6){
			 fightpan.addG(new GamePanel(6,170, 100, 40, 40,"red", "Captain2.png"));
		 }
		 else if(j == 5){
			 fightpan.addG(new GamePanel(5,170, 100,40, 40,"red", "Lieutenant2.png"));
		 }
		 else if(j == 4){
			 fightpan.addG(new GamePanel(4,170, 100, 40, 40,"red", "Sergeant2.png"));
		 }
		 else if(j == 3){
			 fightpan.addG(new GamePanel(3,170, 100, 40, 40,"red","Miner2.png"));
		 }
		 else if(j == 2){
			 fightpan.addG(new GamePanel(2,170, 100, 40, 40,"red","Scout2.png"));
		 }
		 else if(j == 1){
			 fightpan.addG(new GamePanel(1,170, 100, 40, 40,"red", "Spy2.png"));
		 }
		 else if(j == 11){
			 fightpan.addG(new GamePanel(11,170, 100, 40, 40,"red", "Bomb2.png"));
		 }
		 else if(j == 0){
			 fightpan.addG(new GamePanel(0,170, 100, 40, 40,"red", "Flag2.png"));
		 }
	     //give the title 
	     this.setTitle("Fight.");
	     //define the size: 300 pixels of weight et 300 pixels high
	     this.setSize(300, 300);
	     //define the location to the center with null
	     this.setLocationRelativeTo(null);
	     //we hide the fenetre when we click on the red cross
	     this.setDefaultCloseOperation(OptionFenetre.HIDE_ON_CLOSE);
	     //define if we could extend the fenetre, in this case we can't
	     this.setResizable(false);
	     this.setContentPane(fightpan);
	     //we make this visible to us
		 this.setVisible(true);
	 }

}