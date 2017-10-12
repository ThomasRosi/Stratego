package gui;

import pieces.Array;

import java.util.ArrayList;

/**
*@author Raeymaekers Charles
*/

public class Game {
	BoardPanel pp;

	public Game(BoardPanel pp) {
		int w = 40;
		int h = 40;
		this.pp = pp;
		new Array();
		new ArrayList<GamePanel>();
		
		Object marechal = new GamePanel(10,84, 84, w, h,"blue", "Marechal.png");
		pp.addG(marechal);
		Object general =new GamePanel(9, 84, 129, w, h,"blue", "General.png");
		pp.addG(general);
		Object colonel =new GamePanel(8, 84, 174, w, h,"blue", "Colonel.png");
		pp.addG(colonel);
		Object major =new GamePanel(7, 84, 219, w, h,"blue", "Major.png");
		pp.addG(major);
		Object captain =new GamePanel(6, 84, 264, w, h,"blue", "Captain.png");
		pp.addG(captain);
		Object lieutenant =new GamePanel(5, 84, 309, w, h,"blue", "Lieutenant.png");
		pp.addG(lieutenant);
		Object sergeant =new GamePanel(4, 84, 354, w, h,"blue", "Sergeant.png");
		pp.addG(sergeant);
		Object miner =new GamePanel(3,84, 399, w, h,"blue", "Miner.png");
		pp.addG(miner);
		Object scout =new GamePanel(2,84, 444, w, h,"blue", "Scout.png");
		pp.addG(scout);
		Object spy =new GamePanel(1,84, 489, w, h,"blue", "Spy.png");
		pp.addG(spy);
		Object bomb =new GamePanel(11,84, 535, w, h,"blue", "Bomb.png");
		pp.addG(bomb);
		Object flag =new GamePanel(0,84, 579, w, h,"blue", "Flag.png");
		pp.addG(flag);
		
		//pp.repaint();
		
	}
	

}
