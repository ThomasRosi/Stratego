package gui;

import game.Tiles;

import java.awt.*;

import javax.swing.*;

import pieces.Array;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

/**
*<p>
*sf2 class create one window from the UHM
*<p>
*@author Raeymaekers Charles
*/
public class StratFenetre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Array gameArray = new Array();
	protected Array placementArray = new Array();
	protected final PicturePannel pan = new PicturePannel("startego.png");
	protected final BoardPanel pan2 = new BoardPanel();
	protected final BoardPanel pan4 = new BoardPanel();
	protected JButton bouton1 = new JButton("Play");
	protected JButton bouton2 = new JButton("Option");
	protected JButton bouton3 = new JButton("Menu");
	protected JButton bouton4 = new JButton("Save");
	protected JButton bouton5 = new JButton("Load");
	protected JButton bouton6 = new JButton("Play");
	protected JButton bouton7 = new JButton("Menu");
	public int[][] listpiece = new int[4][10];
	public int[][] iaList = this.setListIA();
	public int levelia = 0;
	public boolean play = false;

	public int n = 1;

	protected Tiles t;
	protected int a = 0;
	protected JFrame parent = this;

	String path;

	public void stratFenetre() {

		// give the title
		this.setTitle("Stratego");
		// define the size: 1024 pixels of weight et 768 pixels high
		this.setSize(1024, 768);
		// define the location to the center with null
		this.setLocationRelativeTo(null);
		// finish the process when we click on the red cross
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// define if we could extend the fenetre, in this case we can't
		this.setResizable(false);
		// create new panel

		// give a size for the button
		bouton1.setPreferredSize(new Dimension(80, 30));
		bouton2.setPreferredSize(new Dimension(80, 30));
		bouton3.setPreferredSize(new Dimension(80, 30));
		bouton4.setPreferredSize(new Dimension(80, 30));
		bouton5.setPreferredSize(new Dimension(80, 30));
		bouton6.setPreferredSize(new Dimension(80, 30));
		bouton7.setPreferredSize(new Dimension(80, 30));

		// we create a array when we add a pointer
		GridBagLayout ngl1 = new GridBagLayout();
		pan.setLayout(ngl1);
		// we create a pointer to center our elements
		GridBagConstraints gbc = new GridBagConstraints();
		// we add the buttons in the pointer
		pan.add(bouton1, gbc);
		gbc.gridy = 1; // gridy is to put the buttons on axe y
		pan.add(bouton2, gbc);

		final JPanel pan3 = new JPanel();
		BorderLayout bl0 = new BorderLayout();
		GridBagLayout ngl2 = new GridBagLayout();
		pan3.setLayout(ngl2);
		GridBagConstraints gbc2 = new GridBagConstraints();
		pan3.add(bouton3, gbc2);
		gbc2.gridy = 1; // gridy is to put the buttons on axe y
		pan3.add(bouton6, gbc2);
		gbc2.gridy = 2;
		pan3.add(bouton5, gbc2);

		pan2.setLayout(bl0);
		pan2.add(pan3, BorderLayout.EAST);

		final JPanel pan5 = new JPanel();
		BorderLayout bl1 = new BorderLayout();
		GridBagLayout ngl3 = new GridBagLayout();
		pan5.setLayout(ngl3);
		GridBagConstraints gbc3 = new GridBagConstraints();
		pan5.add(bouton7, gbc3);
		gbc3.gridy = 1; // gridy is to put the buttons on axe y
		pan5.add(bouton4, gbc3);

		pan4.setLayout(bl1);
		pan4.add(pan5, BorderLayout.EAST);

		// we run the panel
		this.setContentPane(pan);

		// define an action on the button
		bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pan.setVisible(false);
				parent.setContentPane(pan2);
				pan2.setVisible(true);
				parent.repaint();
				Game gam = new Game(pan2);
			}
		});
		bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// if(bool1 == true)
				OptionFenetre fenop = new OptionFenetre();
				levelia = fenop.getIalevel();
			}
		});

		bouton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pan2.setVisible(false);
				parent.setContentPane(pan);
				pan.setVisible(true);
				parent.repaint();

			}
		});
		bouton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameArray.save();

			}
		});
		bouton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameArray.load();
			}
		});

		bouton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				placementArray.set(listpiece);
				placementArray.setIA(iaList);
				gameArray = placementArray;
				Game gam = new Game(pan4);
				affichePiece();
				play = true;
				System.out.println(play);
				pan2.setVisible(false);
				parent.setContentPane(pan4);
				pan4.setVisible(true);
				parent.repaint();

			}
		});

		bouton7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				pan4.setVisible(false);
				parent.setContentPane(pan);
				pan.setVisible(true);
				parent.repaint();

			}

		});
		System.out.println(play);

		pan2.addMouseListener(new MouseListener() {

			int march = 0;
			int gener = 0;
			int colon = 0;
			int maj = 0;
			int capt = 0;
			int lieut = 0;
			int serg = 0;
			int mine = 0;
			int scout = 0;
			int spy = 0;
			int bomb = 0;
			int fl = 0;

			int min;
			int a = 0;
			int b = a;
			int y = 0;
			int x = 0;
			int rank;

			public void mouseClicked(MouseEvent event) {

			}

			public void mouseEntered(MouseEvent event) {

			}

			public void mouseExited(MouseEvent event) {
			}

			public void mousePressed(MouseEvent event) {
			}

			public void mouseReleased(MouseEvent event) {
				if (event.getButton() == MouseEvent.BUTTON1) {
					if (!play) {
						if (b == 0) {
							Point p2 = new Point(x = event.getX(), y = event
									.getY());

							if ((84 < x) && (x < 124)) {
								if (((84 < y) && (y < 124)) && (march != 1)) {
									rank = 10;
									path = "Marechal.png";
									march++;
									b = 1;
								} else if (((129 < y) && (y < 169))
										&& (gener != 1)) {
									rank = 9;
									path = "General.png";
									gener++;
									b = 1;
								} else if (((174 < y) && (y < 214))
										&& (colon != 2)) {
									rank = 8;
									path = "Colonel.png";
									colon++;
									b = 1;
								} else if (((219 < y) && (y < 249))
										&& (maj != 3)) {
									rank = 7;
									path = "Major.png";
									maj++;
									b = 1;
								} else if (((254 < y) && (y < 294))
										&& (capt != 4)) {
									rank = 6;
									path = "Captain.png";
									capt++;
									b = 1;
								} else if (((299 < y) && (y < 339))
										&& (lieut != 4)) {
									rank = 5;
									path = "Lieutenant.png";
									lieut++;
									b = 1;
								} else if (((344 < y) && (y < 384))
										&& (serg != 4)) {
									rank = 4;
									path = "Sergeant.png";
									serg++;
									b = 1;
								} else if (((389 < y) && (y < 429))
										&& (mine != 5)) {
									rank = 3;
									path = "Miner.png";
									mine++;
									b = 1;
								} else if (((434 < y) && (y < 474))
										&& (scout != 8)) {
									rank = 2;
									path = "Scout.png";
									scout++;
									b = 1;
								} else if (((479 < y) && (y < 519))
										&& (spy != 1)) {
									rank = 1;
									path = "Spy.png";
									spy++;
									b = 1;
								} else if (((524 < y) && (y < 564))
										&& (bomb != 6)) {
									rank = 11;
									path = "Bomb.png";
									bomb++;
									b = 1;
								} else if (((569 < y) && (y < 609))
										&& (fl != 1)) {
									rank = 0;
									path = "Flag.png";
									fl++;
									b = 1;
								}

								System.out.println(b);
								System.out.println(rank);
								System.out.println(path);
							}
						}

						else if (b == 1) {
							Point p2 = new Point(x = event.getX(), y = event
									.getY());
							if ((((min = 444) < y) && (y < 504))
									|| (((min = 504) < y) && (y < 564))
									|| (((min = 564) < y) && (y < 624))
									|| (((min = 624) < y) && ((y < 684)))) {
								if ((212 < x) && (x < 272)) {
									pan2.addT(new GamePanel(rank, 222,
											(min + 10), 0, 0, "blue", path));
									pan2.repaint();
									parent.repaint();
									b = 0;

									if ((min + 10) == 634) {
										listpiece[0][0] = rank;
									} else if ((min + 10) == 574) {
										listpiece[1][0] = rank;
									} else if ((min + 10) == 514) {
										listpiece[2][0] = rank;
									} else if ((min + 10) == 454) {
										listpiece[3][0] = rank;
									}

								} else if ((272 < x) && (x < 332)) {
									pan2.addT(new GamePanel(rank, 282,
											(min + 10), 0, 0, "blue", path));
									pan2.repaint();
									parent.repaint();
									b = 0;

									if ((min + 10) == 634) {
										listpiece[0][1] = rank;
									} else if ((min + 10) == 574) {
										listpiece[1][1] = rank;
									} else if ((min + 10) == 514) {
										listpiece[2][1] = rank;
									} else if ((min + 10) == 454) {
										listpiece[3][1] = rank;
									}

								} else if ((332 < x) && (x < 392)) {
									pan2.addT(new GamePanel(rank, 342,
											(min + 10), 0, 0, "blue", path));
									pan2.repaint();
									parent.repaint();
									b = 0;

									if ((min + 10) == 634) {
										listpiece[0][2] = rank;
									} else if ((min + 10) == 574) {
										listpiece[1][2] = rank;
									} else if ((min + 10) == 514) {
										listpiece[2][2] = rank;
									} else if ((min + 10) == 454) {
										listpiece[3][2] = rank;
									}

								} else if ((392 < x) && (x < 452)) {
									pan2.addT(new GamePanel(rank, 402,
											(min + 10), 0, 0, "blue", path));
									pan2.repaint();
									parent.repaint();
									b = 0;

									if ((min + 10) == 634) {
										listpiece[0][3] = rank;
									} else if ((min + 10) == 574) {
										listpiece[1][3] = rank;
									} else if ((min + 10) == 514) {
										listpiece[2][3] = rank;
									} else if ((min + 10) == 454) {
										listpiece[3][3] = rank;
									}

								} else if ((452 < x) && (x < 512)) {
									pan2.addT(new GamePanel(rank, 462,
											(min + 10), 0, 0, "blue", path));
									pan2.repaint();
									parent.repaint();
									b = 0;

									if ((min + 10) == 634) {
										listpiece[0][4] = rank;
									} else if ((min + 10) == 574) {
										listpiece[1][4] = rank;
									} else if ((min + 10) == 514) {
										listpiece[2][4] = rank;
									} else if ((min + 10) == 454) {
										listpiece[3][4] = rank;
									}

								} else if ((512 < x) && (x < 572)) {
									pan2.addT(new GamePanel(rank, 522,
											(min + 10), 0, 0, "blue", path));
									pan2.repaint();
									parent.repaint();
									b = 0;

									if ((min + 10) == 634) {
										listpiece[0][5] = rank;
									} else if ((min + 10) == 574) {
										listpiece[1][5] = rank;
									} else if ((min + 10) == 514) {
										listpiece[2][5] = rank;
									} else if ((min + 10) == 454) {
										listpiece[3][5] = rank;
									}

								} else if ((572 < x) && (x < 632)) {
									pan2.addT(new GamePanel(rank, 582,
											(min + 10), 0, 0, "blue", path));
									pan2.repaint();
									parent.repaint();
									b = 0;

									if ((min + 10) == 634) {
										listpiece[0][6] = rank;
									} else if ((min + 10) == 574) {
										listpiece[1][6] = rank;
									} else if ((min + 10) == 514) {
										listpiece[2][6] = rank;
									} else if ((min + 10) == 454) {
										listpiece[3][6] = rank;
									}

								} else if ((632 < x) && (x < 692)) {
									pan2.addT(new GamePanel(rank, 642,
											(min + 10), 0, 0, "blue", path));
									pan2.repaint();
									parent.repaint();
									b = 0;

									if ((min + 10) == 634) {
										listpiece[0][7] = rank;
									} else if ((min + 10) == 574) {
										listpiece[1][7] = rank;
									} else if ((min + 10) == 514) {
										listpiece[2][7] = rank;
									} else if ((min + 10) == 454) {
										listpiece[3][7] = rank;
									}

								} else if ((692 < x) && (x < 752)) {
									pan2.addT(new GamePanel(rank, 702,
											(min + 10), 0, 0, "blue", path));
									pan2.repaint();
									parent.repaint();
									b = 0;

									if ((min + 10) == 634) {
										listpiece[0][8] = rank;
									} else if ((min + 10) == 574) {
										listpiece[1][8] = rank;
									} else if ((min + 10) == 514) {
										listpiece[2][8] = rank;
									} else if ((min + 10) == 454) {
										listpiece[3][8] = rank;
									}

								} else if ((752 < x) && (x < 812)) {
									pan2.addT(new GamePanel(rank, 762,
											(min + 10), 0, 0, "blue", path));
									pan2.repaint();
									parent.repaint();
									b = 0;

									if ((min + 10) == 634) {
										listpiece[0][9] = rank;
									} else if ((min + 10) == 574) {
										listpiece[1][9] = rank;
									} else if ((min + 10) == 514) {
										listpiece[2][9] = rank;
									} else if ((min + 10) == 454) {
										listpiece[3][9] = rank;
									}

								}
							}



						}
					}

				}
			}
		});
		pan4.addMouseListener(new MouseListener() {
			int min = 0;
			int y = 0;
			int c = y;
			int x = 0;
			int tx;
			int ty;
			int abs;
			int ord;

			public void mouseClicked(MouseEvent event) {
				if (event.getButton() == MouseEvent.BUTTON1) {

					if (play) {
						if(c == 0){
							Point p2 = new Point(x = event.getX(), y = event.getY());
							if ((((min = 84) < y) && (y < 144))
									|| (((min = 144) < y) && (y < 204))
									|| (((min = 204) < y) && (y < 264))
									|| (((min = 264) < y) && (y < 324))
									|| (((min = 324) < y) && (y < 384))
									|| (((min = 384) < y) && (y < 444))
									|| (((min = 444) < y) && (y < 504))
									|| (((min = 504) < y) && (y < 564))
									|| (((min = 564) < y) && (y < 624))
									|| (((min = 624) < y) && (y < 684))) {
								if ((212 < x) && (x < 272)) {
									ord = 0;
									if (min == 84) {
										abs = 0;
									} else if (min == 144) {
										abs = 1;
									} else if (min == 204) {
										abs = 2;
									} else if (min == 264) {
										abs = 3;
									} else if (min == 324) {
										abs = 4;
									} else if (min == 384) {
										abs = 5;
									} else if (min == 444) {
										abs = 6;
									} else if (min == 504) {
										abs = 7;
									} else if (min == 564) {
										abs = 8;
									} else if (min == 624) {
										abs = 9;
									}
								} else if ((272 < x) && (x < 332)) {
									ord = 1;
									if (min == 84) {
										abs = 0;
									} else if (min == 144) {
										abs = 1;
									} else if (min == 204) {
										abs = 2;
									} else if (min == 264) {
										abs = 3;
									} else if (min == 324) {
										abs = 4;
									} else if (min == 384) {
										abs = 5;
									} else if (min == 444) {
										abs = 6;
									} else if (min == 504) {
										abs = 7;
									} else if (min == 564) {
										abs = 8;
									} else if (min == 624) {
										abs = 9;
									}
								} else if ((332 < x) && (x < 392)) {
									ord = 2;
									if (min == 84) {
										abs = 0;
									} else if (min == 144) {
										abs = 1;
									} else if (min == 204) {
										abs = 2;
									} else if (min == 264) {
										abs = 3;
									} else if (min == 324) {
										abs = 4;
									} else if (min == 384) {
										abs = 5;
									} else if (min == 444) {
										abs = 6;
									} else if (min == 504) {
										abs = 7;
									} else if (min == 564) {
										abs = 8;
									} else if (min == 624) {
										abs = 9;
									}
								} else if ((392 < x) && (x < 452)) {
									ord = 3;
									if (min == 84) {
										abs = 0;
									} else if (min == 144) {
										abs = 1;
									} else if (min == 204) {
										abs = 2;
									} else if (min == 264) {
										abs = 3;
									} else if (min == 324) {
										abs = 4;
									} else if (min == 384) {
										abs = 5;
									} else if (min == 444) {
										abs = 6;
									} else if (min == 504) {
										abs = 7;
									} else if (min == 564) {
										abs = 8;
									} else if (min == 624) {
										abs = 9;
									}
								} else if ((452 < x) && (x < 512)) {
									ord = 4;
									if (min == 84) {
										abs = 0;
									} else if (min == 144) {
										abs = 1;
									} else if (min == 204) {
										abs = 2;
									} else if (min == 264) {
										abs = 3;
									} else if (min == 324) {
										abs = 4;
									} else if (min == 384) {
										abs = 5;
									} else if (min == 444) {
										abs = 6;
									} else if (min == 504) {
										abs = 7;
									} else if (min == 564) {
										abs = 8;
									} else if (min == 624) {
										abs = 9;
									}
								} else if ((512 < x) && (x < 572)) {
									ord = 5;
									if (min == 84) {
										abs = 0;
									} else if (min == 144) {
										abs = 1;
									} else if (min == 204) {
										abs = 2;
									} else if (min == 264) {
										abs = 3;
									} else if (min == 324) {
										abs = 4;
									} else if (min == 384) {
										abs = 5;
									} else if (min == 444) {
										abs = 6;
									} else if (min == 504) {
										abs = 7;
									} else if (min == 564) {
										abs = 8;
									} else if (min == 624) {
										abs = 9;
									}
								} else if ((572 < x) && (x < 632)) {
									ord = 6;
									if (min == 84) {
										abs = 0;
									} else if (min == 144) {
										abs = 1;
									} else if (min == 204) {
										abs = 2;
									} else if (min == 264) {
										abs = 3;
									} else if (min == 324) {
										abs = 4;
									} else if (min == 384) {
										abs = 5;
									} else if (min == 444) {
										abs = 6;
									} else if (min == 504) {
										abs = 7;
									} else if (min == 564) {
										abs = 8;
									} else if (min == 624) {
										abs = 9;
									}
								} else if ((632 < x) && (x < 692)) {
									ord = 7;
									if (min == 84) {
										abs = 0;
									} else if (min == 144) {
										abs = 1;
									} else if (min == 204) {
										abs = 2;
									} else if (min == 264) {
										abs = 3;
									} else if (min == 324) {
										abs = 4;
									} else if (min == 384) {
										abs = 5;
									} else if (min == 444) {
										abs = 6;
									} else if (min == 504) {
										abs = 7;
									} else if (min == 564) {
										abs = 8;
									} else if (min == 624) {
										abs = 9;
									}
								} else if ((692 < x) && (x < 752)) {
									ord = 8;
									if (min == 84) {
										abs = 0;
									} else if (min == 144) {
										abs = 1;
									} else if (min == 204) {
										abs = 2;
									} else if (min == 264) {
										abs = 3;
									} else if (min == 324) {
										abs = 4;
									} else if (min == 384) {
										abs = 5;
									} else if (min == 444) {
										abs = 6;
									} else if (min == 504) {
										abs = 7;
									} else if (min == 564) {
										abs = 8;
									} else if (min == 624) {
										abs = 9;
									}
								} else if ((752 < x) && (x < 812)) {
									ord = 9;
									if (min == 84) {
										abs = 0;
									} else if (min == 144) {
										abs = 1;
									} else if (min == 204) {
										abs = 2;
									} else if (min == 264) {
										abs = 3;
									} else if (min == 324) {
										abs = 4;
									} else if (min == 384) {
										abs = 5;
									} else if (min == 444) {
										abs = 6;
									} else if (min == 504) {
										abs = 7;
									} else if (min == 564) {
										abs = 8;
									} else if (min == 624) {
										abs = 9;
									}
								}
								if (gameArray.getTiles(abs, ord) != null) {
									t = gameArray.getTiles(abs, ord);
									t.affichage();
									if ((!t.getPiece().getBelongs())) {
										System.out.println("This piece belongs to your opponent!");
									}
									else if(!gameArray.mvtTest(t)) {
										System.out.println("This piece cann't move!");
									}
									else {
										c = 1;
									}
								}
							}
						}
						System.out.println(c);
						if(c == 1){
							Point p3 = new Point(x = event.getX(), y = event.getY());
							tx = t.getX();
							ty = t.getY();
                            System.out.println(tx+" + "+ty);

                            if(t.getPiece().getRank() == 2){
                                if((ty*60 + 212 < x) && (x < ty*60 + 272)){
                                    int up = gameArray.counterUp(t);
                                    int down = gameArray.counterDown(t);
                                    if((tx*60 + 24 - 0*60 < y) && (y < tx*60 + 84 - 0*60)){
                                		if (1 <= up){
                                			gameArray.up(t,1);
                                            c = 2;
                                    	}
                                    }
                                    else if((tx*60 + 24 - 1*60 < y) && (y < tx*60 + 84 - 1*60)){
                                		if (2 <= up){
                                			gameArray.up(t,2);
                                            c = 2;
                                    	}
                                    }
                                    else if((tx*60 + 24 - 2*60 < y) && (y < tx*60 + 84 - 2*60)){
                                		if (3 <= up){
                                			gameArray.up(t,3);
                                            c = 2;
                                    	}
                                    }
                                    else if((tx*60 + 24 - 3*60 < y) && (y < tx*60 + 84 - 3*60)){
                                		if (4 <= up){
                                			gameArray.up(t,4);
                                            c = 2;
                                    	}
                                    }
                                    else if((tx*60 + 24 - 4*60 < y) && (y < tx*60 + 84 - 4*60)){
                                		if (5 <= up){
                                			gameArray.up(t,5);
                                            c = 2;
                                    	}
                                    }
                                    else if((tx*60 + 24 - 5*60 < y) && (y < tx*60 + 84 - 5*60)){
                                		if (6 <= up){
                                			gameArray.up(t,6);
                                            c = 2;
                                    	}
                                    }
                                    else if((tx*60 + 24 - 6*60 < y) && (y < tx*60 + 84 - 6*60)){
                                		if (7 <= up){
                                			gameArray.up(t,7);
                                            c = 2;
                                    	}
                                    }
                                    else if((tx*60 + 24 - 7*60 < y) && (y < tx*60 + 84 - 7*60)){
                                    	if (8 <= up){
                                    		gameArray.up(t,8);
                                            c = 2;
                                    	}
                                    }
                                    else if((tx*60 + 24 - 8*60 < y) && (y < tx*60 + 84 - 8*60)){
                                    	if (9 <= up){
                                    		gameArray.up(t,9);
                                            c = 2;
                                    	}
                                    }
                                    else if((tx*60 + 144 + 0*60 < y ) && (y < tx*60 + 204 + 0*60)){
                                        if (1 <= down){
                                            gameArray.down(t,1);
                                            c = 2;
                                        }
                                    }
                                    else if((tx*60 + 144 + 1*60 < y ) && (y < tx*60 + 204 + 1*60)){
                                        if (2 <= down){
                                            gameArray.down(t,2);
                                            c = 2;
                                        }
                                    }
                                    else if((tx*60 + 144 + 2*60 < y ) && (y < tx*60 + 204 + 2*60)){
                                        if (3 <= down){
                                            gameArray.down(t,3);
                                            c = 2;
                                        }
                                    }
                                    else if((tx*60 + 144 + 3*60 < y ) && (y < tx*60 + 204 + 3*60)){
                                        if (4 <= down){
                                            gameArray.down(t,4);
                                            c = 2;
                                        }
                                    }
                                    else if((tx*60 + 144 + 4*60 < y ) && (y < tx*60 + 204 + 4*60)){
                                        if (5 <= down){
                                            gameArray.down(t,5);
                                            c = 2;
                                        }
                                    }
                                    else if((tx*60 + 144 + 5*60 < y ) && (y < tx*60 + 204 + 5*60)){
                                        if (6 <= down){
                                            gameArray.down(t,6);
                                            c = 2;
                                        }
                                    }
                                    else if((tx*60 + 144 + 6*60 < y ) && (y < tx*60 + 204 + 6*60)){
                                        if (7 <= down){
                                            gameArray.down(t,7);
                                            c = 2;
                                        }
                                    }
                                    else if((tx*60 + 144 + 7*60 < y ) && (y < tx*60 + 204 + 7*60)){
                                        if (8 <= down){
                                            gameArray.down(t,8);
                                            c = 2;
                                        }
                                    }
                                    else if((tx*60 + 144 + 8*60 < y ) && (y < tx*60 + 204 + 8*60)){
                                        if (9 <= down){
                                            gameArray.down(t,9);
                                            c = 2;
                                        }
                                    }
                                }
                                else if((tx*60 + 84 < y) && (y < tx*60 + 144)){
                                    int right = gameArray.counterRight(t);
                                    int left = gameArray.counterLeft(t);
                                    if ((ty*60 + 272 + 0*60 < x) && (x < ty*60 + 332 + 0*60)){
                                        if (1 <= right){
                                            gameArray.right(t,1);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 272 + 1*60 < x) && (x < ty*60 + 332 + 1*60)){
                                        if (2 <= right){
                                            gameArray.right(t,2);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 272 + 2*60 < x) && (x < ty*60 + 332 + 2*60)){
                                        if (3 <= right){
                                            gameArray.right(t,3);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 272 + 3*60 < x) && (x < ty*60 + 332 + 3*60)){
                                        if (4 <= right){
                                            gameArray.right(t,4);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 272 + 4*60 < x) && (x < ty*60 + 332 + 4*60)){
                                        if (5 <= right){
                                            gameArray.right(t,5);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 272 + 5*60 < x) && (x < ty*60 + 332 + 5*60)){
                                        if (6 <= right){
                                            gameArray.right(t,6);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 272 + 6*60 < x) && (x < ty*60 + 332 + 6*60)){
                                        if (7 <= right){
                                            gameArray.right(t,7);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 272 + 7*60 < x) && (x < ty*60 + 332 + 7*60)){
                                        if (8 <= right){
                                            gameArray.right(t,8);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 272 + 8*60 < x) && (x < ty*60 + 332 + 8*60)){
                                        if (9 <= right){
                                            gameArray.right(t,9);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 152 - 0*60 < x) && (x < ty*60 + 212 - 0*60)){
                                        if (1 <= left){
                                            gameArray.left(t,1);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 152 - 1*60< x) && (x < ty*60 + 212 - 1*60)){
                                        if (2 <= left){
                                            gameArray.left(t,2);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 152 - 2*60< x) && (x < ty*60 + 212 - 2*60)){
                                        if (3 <= left){
                                            gameArray.left(t,3);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 152 - 3*60< x) && (x < ty*60 + 212 - 3*60)){
                                        if (4 <= left){
                                            gameArray.left(t,4);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 152 - 4*60< x) && (x < ty*60 + 212 - 4*60)){
                                        if (5 <= left){
                                            gameArray.left(t,5);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 152 - 5*60< x) && (x < ty*60 + 212 - 5*60)){
                                        if (6 <= left){
                                            gameArray.left(t,6);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 152 - 6*60< x) && (x < ty*60 + 212 - 6*60)){
                                        if (7 <= left){
                                            gameArray.left(t,7);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 152 - 7*60< x) && (x < ty*60 + 212 - 7*60)){
                                        if (8 <= left){
                                            gameArray.left(t,8);
                                            c = 2;
                                        }
                                    }
                                    else if ((ty*60 + 152 - 8*60< x) && (x < ty*60 + 212 - 8*60)){
                                        if (9 <= left){
                                            gameArray.left(t,9);
                                            c = 2;
                                        }
                                    }
                                }
                            }
                            else{
    							if((ty*60 + 212 < x) && (x < ty*60 + 272)){
    								if((tx*60 + 24 < y ) && (y < tx*60 + 84)){
    									if (gameArray.testup(t)){
    										gameArray.up(t,1);
    										c = 2;
    									}
    								}
    								else if((tx*60 + 144 < y ) && (y < tx*60 + 204)){
    									if (gameArray.testdown(t)){
    										gameArray.down(t,1);
    										c = 2;
    									}
    								}
    							}
    							if((tx*60 + 84 < y ) && (y < tx*60 + 144)){
    								if ((ty*60 + 272 < x) && (x < ty*60 + 332)){
    									if (gameArray.testright(t)){
    										gameArray.right(t,1);
    										c = 2;
    									}
    								}
    								else if ((ty*60 + 152 < x) && (x < ty*60 + 212)){
    									if(gameArray.testleft(t)){
    										gameArray.left(t,1);
    										c = 2;
    									}
    								}
    							}
    							System.out.println(x+" + "+y);
                            }
						}
						if (c == 2){
							StratGame(t);
							c = 0;
						}
					}
				}
			}

			public void mouseEntered(MouseEvent event) {

			}

			public void mouseExited(MouseEvent event) {
			}

			public void mousePressed(MouseEvent event) {
			}

			public void mouseReleased(MouseEvent event) {

			}
		});
		System.out.println(play);
		for (int y = 274, i = 0; y >= 94 && i < 4; y = y - 60, i++) {

			for (int x = 222, j = 0; x <= 762 && j < 10; x = x + 60, j++) {
				pan2.addT(new GamePanel(iaList[i][j], x, y, 40, 40, "red",
						"IAicon.png"));

			}

		}

		// we make this visible to us
		this.setVisible(true);
	}

	public int[][] setListIA() {

		Random random = new Random();
		ArrayList<int[][]> a = new ArrayList<int[][]>(20);
		int[][] set1 = { { 0, 11, 11, 5, 6, 4, 2, 3, 11, 4 },
				{ 11, 4, 11, 3, 3, 6, 7, 4, 3, 5 },
				{ 7, 11, 3, 1, 9, 8, 2, 6, 2, 10 },
				{ 2, 8, 2, 5, 2, 6, 2, 5, 2, 7 } };
		int[][] set2 = { { 4, 11, 11, 3, 3, 4, 5, 0, 11, 2 },
				{ 11, 11, 2, 4, 5, 6, 1, 11, 3, 6 },
				{ 10, 2, 7, 4, 2, 3, 2, 9, 8, 6 },
				{ 2, 2, 3, 7, 5, 8, 6, 5, 2, 7 } };
		int[][] set3 = { { 6, 5, 3, 7, 0, 7, 4, 6, 11, 11 },
				{ 3, 3, 2, 11, 11, 11, 1, 6, 3, 4 },
				{ 2, 3, 10, 8, 2, 5, 5, 9, 7, 2 },
				{ 11, 2, 4, 6, 2, 5, 2, 4, 2, 8 } };
		// int[][] set4 = {{},{},{},{}};
		// int[][] set5 = {{},{},{},{}};
		// int[][] set6 = {{},{},{},{}};
		// int[][] set7 = {{},{},{},{}};
		// int[][] set8 = {{},{},{},{}};
		// int[][] set9 = {{},{},{},{}};
		// int[][] set10 = {{},{},{},{}};
		a.add(set1);
		a.add(set2);
		a.add(set3);
		int n = a.size();
		int index = random.nextInt(n);
		int[][] listIA = (int[][]) a.get(index);
		return listIA;
	}

	public String getPath() {
		return path;
	}

	public void StratGame(Tiles t) {
		gameArray.affichage();
		placementArray = gameArray;
		n++;
		if (gameArray.end(n)){EndVictoryWindow victory = new EndVictoryWindow();}
		else {
			if (levelia == 0){
				gameArray.randomIA();
				n++;
			}
			else if (levelia == 1){
				gameArray.averageIA();
				n++;
			}
			System.out.println(" ");
			gameArray.affichage();
			if (gameArray.end(n)){EndDefeatWindow defeat = new EndDefeatWindow();}
		}

		parent.repaint();
		pan4.repaint();
		affichePiece();
	}
	public void affichePiece() {
		pan4.reset();

		for (int y = 94, i = 0; y <= 674 && i < 10; y = y + 60, i++) {

			for (int x = 222, j = 0; x <= 762 && j < 10; x = x + 60, j++) {

				t = gameArray.getTiles(i, j);
				if ((t != null) && (t.getPiece() != null)) {
					int rank = t.getPiece().getRank();
					//System.out.println(rank);
					//System.out.println(t);
					boolean belong = t.getPiece().getBelongs();

					if (rank == 10) {
						path = "Marechal.png";
						if (!belong) {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "red",
									"IAicon.png"));
						} else {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "blue",
									path));
						}

					} else if (rank == 9) {
						path = "General.png";
						if (!belong) {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "red",
									"IAicon.png"));
						} else {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "blue",
									path));
						}

					} else if (rank == 8) {
						path = "Colonel.png";
						if (!belong) {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "red",
									"IAicon.png"));
						} else {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "blue",
									path));
						}

					} else if (rank == 7) {
						path = "Major.png";
						if (!belong) {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "red",
									"IAicon.png"));
						} else {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "blue",
									path));
						}

					} else if (rank == 6) {
						path = "Captain.png";
						if (!belong) {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "red",
									"IAicon.png"));
						} else {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "blue",
									path));
						}

					} else if (rank == 5) {
						path = "Lieutenant.png";
						if (!belong) {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "red",
									"IAicon.png"));
						} else {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "blue",
									path));
						}

					} else if (rank == 4) {
						path = "Sergeant.png";
						if (!belong) {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "red",
									"IAicon.png"));
						} else {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "blue",
									path));
						}

					} else if (rank == 3) {
						path = "Miner.png";
						if (!belong) {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "red",
									"IAicon.png"));
						} else {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "blue",
									path));
						}

					} else if (rank == 2) {
						path = "Scout.png";
						if (!belong) {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "red",
									"IAicon.png"));
						} else {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "blue",
									path));
						}

					} else if (rank == 1) {
						path = "SPy.png";
						if (!belong) {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "red",
									"IAicon.png"));
						} else {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "blue",
									path));
						}

					} else if (rank == 11) {
						path = "Bomb.png";
						if (!belong) {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "red",
									"IAicon.png"));
						} else {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "blue",
									path));
						}

					} else if (rank == 0) {
						path = "Flag.png";
						if (!belong) {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "red",
									"IAicon.png"));
						} else {
							pan4.addT(new GamePanel(rank, x, y, 40, 40, "blue",
									path));
						}

					}
				}
			}

		}
		pan4.repaint();

		pan4.updateUI();
		parent.repaint();
	}

}