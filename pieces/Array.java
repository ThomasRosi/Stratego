package pieces;

import game.Tiles;
import gui.FightDefeatWindow;
import gui.FightDrawWindow;
import gui.FightWinWindow;

import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;


/**
*<p>
*This is the class of the game
*It create a array of Tiles and some methods usefull for playing normaly like movement
*<p>
*@author ROSI THOMAS
*/

public class Array {

	protected Tiles tab[][];
    Scanner sc = new Scanner(System.in);

/**
*<p>
*Constructor: Create a array 10x10 to play, in this array, I placed tiles. Every tile has a APiece or nothing
*At the beginning, tiles have nothing
*To create 2 lakes, 8 places are void because APieces cann't move in
*<p>
*/
	public Array() {
		this.tab = new Tiles[(10)][(10)];
		for(int i = 0; i<10 ; i++){
			for(int j = 0; j<10 ; j++){
				tab[i][j] = new Tiles(null, i, j);
			}
		}
        for(int i = 4; i<= 5 ; i++){
            for(int j = 2 ; j <= 3 ; j++){
                tab[i][j] = null;
            }
        }
        for(int i = 4; i<= 5 ; i++){
            for(int j = 6 ; j <= 7 ; j++){
                tab[i][j] = null;
            }
        }
    }

/**
*@return the table of tiles created by the constructor of the array
*/
    public Tiles[][] getTab(){
        return tab;
    }

/**
*@param the X-coordinate
*@param the Y-coordinate
*@return the tile selected by the X-coordinate and the Y-coordinate
*/
    public Tiles getTiles(int x, int y) {
        return tab[x][y];
    }

/**
*<p>
*This method is only used to see the array in the console
*<p>
*/
    public void affichage() {
        for(int i = 0; i<10 ; i++){
            System.out.print(9-i+"  ");
            for(int j = 0; j<10 ; j++){
                if (tab[i][j]==null) {
                    System.out.print("          ");
                }
                else { tab[i][j].affichage(); }
            }
            System.out.println(" ");
        }
        System.out.println("        0         1         2         3         4         5         6         7         8         9");
        System.out.println(" ");
    }

/**
*<p>
*This method places APieces on the array by using the list created on the List class
*<p>
*@param a 2D-list of integer
*/
    public void set(int[][] list){
        for(int i = 0; i<4 ; i++){
            for(int j = 0; j<10 ; j++){
                int a = list[i][j];
                if (a == 0) {
                    APiece p = new Flag();
                    tab[9-i][j].setPiece(p);
                }
                else if (a == 1) {
                    APiece p = new Spy();
                    tab[9-i][j].setPiece(p);
                }
                else if (a == 2) {
                    APiece p = new Scout();
                    tab[9-i][j].setPiece(p);
                }
                else if (a == 3) {
                    APiece p = new Miner();
                    tab[9-i][j].setPiece(p);
                }
                else if (a == 4) {
                    APiece p = new Sergeant();
                    tab[9-i][j].setPiece(p);
                }
                else if (a == 5) {
                    APiece p = new Lieutenant();
                    tab[9-i][j].setPiece(p);
                }
                else if (a == 6) {
                    APiece p = new Captain();
                    tab[9-i][j].setPiece(p);
                }
                else if (a == 7) {
                    APiece p = new Major();
                    tab[9-i][j].setPiece(p);
                }
                else if (a == 8) {
                    APiece p = new Colonel();
                    tab[9-i][j].setPiece(p);
                }
                else if (a == 9) {
                    APiece p = new General();
                    tab[9-i][j].setPiece(p);
                }
                else if (a == 10) {
                    APiece p = new Marshal();
                    tab[9-i][j].setPiece(p);
                }
                else if (a == 11) {
                    APiece p = new Bomb();
                    tab[9-i][j].setPiece(p);
                }
            }
        }
    }

/**
*<p>
*This method places APieces on the array for the IA by using the list created on the List class
*<p>
*@param int[][] list
*/
    public void setIA(int[][] list){
        for(int i = 0; i<4 ; i++){
            for(int j = 0; j<10 ; j++){
                int a = list[i][j];
                if (a == 0) {
                    APiece p = new Flag();
                    p.setBelongs(false);
                    tab[i][j].setPiece(p);
                }
                else if (a == 1) {
                    APiece p = new Spy();
                    p.setBelongs(false);
                    tab[i][j].setPiece(p);
                }
                else if (a == 2) {
                    APiece p = new Scout();
                    p.setBelongs(false);
                    tab[i][j].setPiece(p);
                }
                else if (a == 3) {
                    APiece p = new Miner();
                    p.setBelongs(false);
                    tab[i][j].setPiece(p);
                }
                else if (a == 4) {
                    APiece p = new Sergeant();
                    p.setBelongs(false);
                    tab[i][j].setPiece(p);
                }
                else if (a == 5) {
                    APiece p = new Lieutenant();
                    p.setBelongs(false);
                    tab[i][j].setPiece(p);
                }
                else if (a == 6) {
                    APiece p = new Captain();
                    p.setBelongs(false);
                    tab[i][j].setPiece(p);
                }
                else if (a == 7) {
                    APiece p = new Major();
                    p.setBelongs(false);
                    tab[i][j].setPiece(p);
                }
                else if (a == 8) {
                    APiece p = new Colonel();
                    p.setBelongs(false);
                    tab[i][j].setPiece(p);
                }
                else if (a == 9) {
                    APiece p = new General();
                    p.setBelongs(false);
                    tab[i][j].setPiece(p);
                }
                else if (a == 10) {
                    APiece p = new Marshal();
                    p.setBelongs(false);
                    tab[i][j].setPiece(p);
                }
                else if (a == 11) {
                    APiece p = new Bomb();
                    p.setBelongs(false);
                    tab[i][j].setPiece(p);
                }
            }
        }
    }

/**
*<p>
*Deplacement upwards of one APiece in the array
*<p>
*@param a tiles
*@param a integer
*/
    public void up(Tiles t, int a) {
        APiece p = t.getPiece();
        int x = t.getX();
        int y = t.getY();
        if (p.getRank() == 0) {
            System.out.println("Flag cann't move.");
        }
        else if (p.getRank() == 11) {
            System.out.println("Bomb cann't move.");
        }
        else if (p == null) {
            System.out.println("You have not APiece there !");
        }
        else {
            if ((x==0) || (x==6 && (y==2 || y==3 || y==6 || y==7))) {
                System.out.println("You can't move this way.");
            }
            else {
                APiece p2 = tab[x-a][y].getPiece();
                if (p2 == null) {
                    tab[x-a][y].setPiece(p);
                    t.setPiece(null);
                }
                else if (p2.getBelongs() == p.getBelongs()) {
                    System.out.println("You can't move this way.");
                }
                else if (p2.getBelongs() != p.getBelongs()) {
                    if (p.getRank() == 1 && p2.getRank() == 10) {
                    	FightWinWindow fightwindow = new FightWinWindow(p.getRank(), p2.getRank());
                        tab[x-a][y].setPiece(p);
                        t.setPiece(null);
                    }
                    else if (p.getRank() == 3 && p2.getRank() == 11) {
                    	FightWinWindow fightwindow = new FightWinWindow(p.getRank(), p2.getRank());
                        tab[x-a][y].setPiece(p);
                        t.setPiece(null);
                    }
                    else  {
                        if (p2.getRank() < p.getRank()) {
                        	FightWinWindow fightwindow = new FightWinWindow(p.getRank(), p2.getRank());
                            tab[x-a][y].setPiece(p);
                            t.setPiece(null);
                        }
                        else if (p2.getRank() == p.getRank()) {
                        	FightDrawWindow fightwindow2 = new FightDrawWindow(p.getRank(), p2.getRank());
                            t.setPiece(null);
                            tab[x-a][y].setPiece(null);
                        }
                        else if (p2.getRank() > p.getRank()) {
                        	FightDefeatWindow fightwindow3 = new FightDefeatWindow(p.getRank(), p2.getRank());
                            t.setPiece(null);
                        }
                    } 
                }
            }
        }
    }

/**
*<p>
*Deplacement downwards of one APiece in the array
*<p>
*@param a tiles
*@param a integer
*/
    public void down(Tiles t, int a) {
        APiece p = t.getPiece();
        int x = t.getX();
        int y = t.getY();
        if (p.getRank() == 0) {
            System.out.println("Flag cann't move.");
        }
        else if (p.getRank() == 11) {
            System.out.println("Bomb cann't move.");
        }
        else if (p == null) {
            System.out.println("You have not APiece there !");
        }
        else {
            if ((x==9) || (x==4 && (y==2 ||y==3 || y==6 || y==7))) {
                System.out.println("You can't move this way.");
            }
            else {
                APiece p2 = tab[x+a][y].getPiece();
                if (p2 == null) {
                    tab[x+a][y].setPiece(p);
                    t.setPiece(null);
                }
                else if (p2.getBelongs() == p.getBelongs()) {
                    System.out.println("You can't move this way.");
                }
                else if (p2.getBelongs() != p.getBelongs()) {
                	
                    if (p.getRank() == 1 && p2.getRank() == 10) {
                    	FightWinWindow fightwindow = new FightWinWindow(p.getRank(), p2.getRank());
                        tab[x+a][y].setPiece(p);
                        t.setPiece(null);
                    }
                    else if (p.getRank() == 3 && p2.getRank() == 11) {
                    	FightWinWindow fightwindow = new FightWinWindow(p.getRank(), p2.getRank());
                        tab[x+a][y].setPiece(p);
                        
                        t.setPiece(null);
                    }
                    else  {
                        if (p2.getRank() < p.getRank()) {
                        	FightWinWindow fightwindow = new FightWinWindow(p.getRank(), p2.getRank());
                            tab[x+a][y].setPiece(p);
                            t.setPiece(null);
                        }
                        else if (p2.getRank() == p.getRank()) {
                        	FightDrawWindow fightwindow2 = new FightDrawWindow(p.getRank(), p2.getRank());
                            t.setPiece(null);
                            tab[x+a][y].setPiece(null);
                        }
                        else if (p2.getRank() > p.getRank()) {
                        	FightDefeatWindow fightwindow3 = new FightDefeatWindow(p.getRank(), p2.getRank());
                            t.setPiece(null);
                        }
                    }
                }
            }
        }
    }

/**
*<p>
*Deplacement rightwards of one APiece in the array
*<p>
*@param a tiles
*@param a integer
*/
    public void right(Tiles t, int a) {
        APiece p = t.getPiece();
        int x = t.getX();
        int y = t.getY();
        if (p.getRank() == 0) {
            System.out.println("Flag cann't move.");
        }
        else if (p.getRank() == 11) {
            System.out.println("Bomb cann't move.");
        }
        else if (p == null) {
            System.out.println("You have not APiece there !");
        }
        else {
            if ((y==9) || (y==1 && (x==4 || x==5)) || (y==5) && (x==4 || x==5)) {
                System.out.println("You can't move this way.");
            }
            else {
                APiece p2 = tab[x][y+a].getPiece();
                if (p2 == null) {
                    tab[x][y+a].setPiece(p);
                    t.setPiece(null);
                }
                else if (p2.getBelongs() == p.getBelongs()) {
                    System.out.println("You can't move this way.");
                }
                else if (p2.getBelongs() != p.getBelongs()) {
                    if (p.getRank() == 1 && p2.getRank() == 10) {
                    	FightWinWindow fightwindow = new FightWinWindow(p.getRank(), p2.getRank());
                        tab[x][y+a].setPiece(p);
                        t.setPiece(null);
                    }
                    else if (p.getRank() == 3 && p2.getRank() == 11) {
                    	FightWinWindow fightwindow = new FightWinWindow(p.getRank(), p2.getRank());
                        tab[x][y+a].setPiece(p);
                        t.setPiece(null);
                    }
                    else  {
                        if (p2.getRank() < p.getRank()) {
                        	FightWinWindow fightwindow = new FightWinWindow(p.getRank(), p2.getRank());
                            tab[x][y+a].setPiece(p);
                            t.setPiece(null);
                        }
                        else if (p2.getRank() == p.getRank()) {
                        	FightDrawWindow fightwindow2 = new FightDrawWindow(p.getRank(), p2.getRank());
                            t.setPiece(null);
                            tab[x][y+a].setPiece(null);
                        }
                        else if (p2.getRank() > p.getRank()) {
                        	FightDefeatWindow fightwindow3 = new FightDefeatWindow(p.getRank(), p2.getRank());
                            t.setPiece(null);
                        }
                    }
                }    
            }   
        }
    }   

/**
*<p>
*Deplacement leftwards of one APiece in the array
*<p>
*@param a tiles
*@param a integer
*/
    public void left(Tiles t,int a) {
        APiece p = t.getPiece();
        int x = t.getX();
        int y = t.getY();
        if (p.getRank() == 0) {
            System.out.println("Flag cann't move.");
        }
        else if (p.getRank() == 11) {
            System.out.println("Bomb cann't move.");
        }
        else if (p == null) {
            System.out.println("You have not APiece there !");
        }
        else {
            if ((y==0) || (y==8 && (x==4 || x==5)) || ((y==4) && (x==4 || x==5))) {
                System.out.println("You can't move this way.");
            }
            else {
                APiece p2 = tab[x][y-a].getPiece();
                if (p2 == null) {
                    tab[x][y-a].setPiece(p);
                    t.setPiece(null);
                }
                else if (p2.getBelongs() == p.getBelongs()) {
                    System.out.println("You can't move this way.");
                }
                else if (p2.getBelongs() != p.getBelongs()) {
                    if (p.getRank() == 1 && p2.getRank() == 10) {
                    	FightWinWindow fightwindow = new FightWinWindow(p.getRank(), p2.getRank());
                        tab[x][y-a].setPiece(p);
                        t.setPiece(null);
                    }
                    else if (p.getRank() == 3 && p2.getRank() == 11) {
                    	FightWinWindow fightwindow = new FightWinWindow(p.getRank(), p2.getRank());
                        tab[x][y-a].setPiece(p);
                        t.setPiece(null);
                    }
                    else  {
                        if (p2.getRank() < p.getRank()) {
                        	FightWinWindow fightwindow = new FightWinWindow(p.getRank(), p2.getRank());
                            tab[x][y-a].setPiece(p);
                            t.setPiece(null);
                        }
                        else if (p2.getRank() == p.getRank()) {
                        	FightDrawWindow fightwindow2 = new FightDrawWindow(p.getRank(), p2.getRank());
                            t.setPiece(null);
                            tab[x][y-a].setPiece(null);
                        }
                        else if (p2.getRank() > p.getRank()) {
                        	FightDefeatWindow fightwindow3 = new FightDefeatWindow(p.getRank(), p2.getRank());
                            t.setPiece(null);
                        }
                    }
                }
            }
        }
    }

/**
*<p>
*Testing the deplacement upwards of one APiece in the array
*<p>
*@param a tiles
*@return a boolean used to know if the APiece in this tile can move upwards
*/
    public boolean testup(Tiles t) {
        APiece p = t.getPiece();
        int x = t.getX();
        int y = t.getY();
        if (p.getRank() == 0) {
            return false;
        }
        else if (p.getRank() == 11) {
            return false;
        }
        else if (p == null) {
            return false;
        }
        else {
            if ((x==0) || (x==6 && (y==2 || y==3 || y==6 || y==7))) {
                return false;
            }
            else {
                APiece p2 = tab[x-1][y].getPiece();
                if (p2 == null) {
                    return true;
                }
                else if (p2.getBelongs() == p.getBelongs()) {
                    return false;
                }
                else if (p2.getBelongs() != p.getBelongs()) {
                    return true;
                }
            }
        }
        return false;
    }

/**
*<p>
*Testing the deplacement downwards of one APiece in the array
*<p>
*@param a tiles
*@return a boolean used to know if the APiece in this tile can move downwards
*/
    public boolean testdown(Tiles t) {
        APiece p = t.getPiece();
        int x = t.getX();
        int y = t.getY();
        if (p.getRank() == 0) {
            return false;
        }
        else if (p.getRank() == 11) {
            return false;
        }
        else if (p == null) {
            return false;
        }
        else {
            if ((x==9) || (x==3 && (y==2 ||y==3 || y==6 || y==7))) {
                return false;
            }
            else {
                APiece p2 = tab[x+1][y].getPiece();
                if (p2 == null) {
                    return true;
                }
                else if (p2.getBelongs() == p.getBelongs()) {
                    return false;
                }
                else if (p2.getBelongs() != p.getBelongs()) {
                    return true;
                }
            }
        }
        return false;
    }

/**
*<p>
*Testing the deplacement rightwards of one APiece in the array
*<p>
*@param a tiles
*@return a boolean used to know if the APiece in this tile can move rightwards
*/
    public boolean testright(Tiles t) {
        APiece p = t.getPiece();
        int x = t.getX();
        int y = t.getY();
        if (p.getRank() == 0) {
            return false;
        }
        else if (p.getRank() == 11) {
            return false;
        }
        else if (p == null) {
            return false;
        }
        else {
            if ((y==9) || (y==1 && (x==4 || x==5)) || (y==5) && (x==4 || x==5)) {
                return false;
            }
            else {
                APiece p2 = tab[x][y+1].getPiece();
                if (p2 == null) {
                    return true;
                }
                else if (p2.getBelongs() == p.getBelongs()) {
                    return false;
                }
                else if (p2.getBelongs() != p.getBelongs()) {
                    return true;
                }    
            }    
        }
        return false;
    }   

/**
*<p>
*Testing the deplacement leftwards of one APiece in the array
*<p>
*@param a tiles
*@return a boolean used to know if the APiece in this tile can move leftwards
*/
    public boolean testleft(Tiles t) {
        APiece p = t.getPiece();
        int x = t.getX();
        int y = t.getY();
        if (p.getRank() == 0) {
            return false;
        }
        else if (p.getRank() == 11) {
            return false;
        }
        else if (p == null) {
            return false;
        }
        else {
            if ((y==0) || (y==8 && (x==4 || x==5)) || (y==4) && (x==4 || x==5)) {
                return false;
            }
            else {
                APiece p2 = tab[x][y-1].getPiece();
                if (p2 == null) {
                    return true;
                }
                else if (p2.getBelongs() == p.getBelongs()) {
                    return false;
                }
                else if (p2.getBelongs() != p.getBelongs()) {
                    return true;
                }
            }
        }
        return false;
    }

/**
*<p>
*This method wont be used when the GUI will be done
*This method ask to the user which tile he want to move
*<p>
*@return a tiles chosen by the user to know which one he want to move
*/
    public Tiles tilesChoice(){
        int a = 0;
        int b = 0;
        boolean k = false;
        boolean l = false;
        boolean m = false;
        do{
            do {
                System.out.println("Which APiece do you want to move ?");
                do {
                    System.out.print("Line : ");
                    String str = sc.nextLine();
                    try{
                        a = Integer.parseInt(str);
                        k = true;
                        }catch(Exception e){
                        System.out.println("You have not enter a int number, please try again ! " + e.getMessage());
                        k = false;
                    }
                    if (a > 9 || a < 0) { System.out.println("You have not choose a number between 0 and 9 ! Please try again !");}
                }while(a > 9 || a < 0);
                do{
                    System.out.print("Column : ");
                    String str2 = sc.nextLine();
                    try{
                        b = Integer.parseInt(str2);
                        l = true;
                        }catch(Exception e){
                        System.out.println("You have not enter a int number, please try again ! " + e.getMessage());
                        l = false;
                    }
                    if (b > 9 || b < 0) { System.out.println("You have not choose a number between 0 and 9 ! Please try again !");}
                }while(b > 9 || b < 0);
            }while(k == false || l == false);
            if (tab[9-a][b].getPiece() == null) {
                System.out.println("You have not APiece there ! Please try again !");
            }
            else {m = true;}
        }while(m != true);
        return tab[9-a][b];
    }

/**
*<p>
*This method wont be used when the GUI will be done
*this method tests all movements possible by the APiece placed in the chosen tile and ask which one the user want to do
*<p>
*@param a tiles with a APiece;
*/
    public void mvtChoice(Tiles t){
        String str;
        APiece p = t.getPiece();
        do{
            String[] list = new String[4];
            if (this.testup(t)) {list[0] = "up";}
            if (this.testright(t)) {list[1] = "right";}
            if (this.testdown(t)) {list[2] = "down";}
            if (this.testleft(t)) {list[3] = "left";}
            System.out.println("Which movement do you want to do with your "+t.getPiece().getName()+" ?");
            System.out.println("Choose one movement :");
            for(int i = 0; i<4; i++){
                if (list[i] == "up") {System.out.println("  - up ;");}
                if (list[i] == "right") {System.out.println("  - right ;");}
                if (list[i] == "down") {System.out.println("  - down ;");}
                if (list[i] == "left") {System.out.println("  - left ;");}
            }
            System.out.println(" ");
            str = sc.nextLine();
            if (!str.equals("up") && !str.equals("right") && !str.equals("down") && !str.equals("left")) {
                System.out.println("You have not choose a good direction. Please try again.");
            }
        }while(!str.equals("up") && !str.equals("right") && !str.equals("down") && !str.equals("left"));
        if (str.equals("up")) {this.up(t,1);}
        else if (str.equals("right")) {this.right(t,1);}
        else if (str.equals("down")) {this.down(t,1);}
        else if (str.equals("left")) {this.left(t,1);}
    }

/**
*<p>
*This method tests all the movement possible 
*<p>
*@param a tiles with a APiece
*@return a boolean used to know if movements are possible with the APiece in this tile
*/
    public boolean mvtTest(Tiles t){
        APiece p = t.getPiece();
        boolean k = false;
        String[] list = new String[4];
        if (this.testup(t)) {list[0] = "up";}
        if (this.testright(t)) {list[1] = "right";}
        if (this.testdown(t)) {list[2] = "down";}
        if (this.testleft(t)) {list[3] = "left";}
        for (int i = 0; i < 4; i++){
            if (list[i] == "up" || list[i] == "right" || list[i] == "down" || list[i] == "left") {k = true;}
        }
        return k;
    }

/**
*<p>
*This method is used to know how many tiles are free between the tile in parameter and the board of the table/a ennemi piece
*@param a tile to start the counter
*<p>
*/
    public int counterUp(Tiles t){
        APiece p = t.getPiece();
        int counter = 0;
        int x = t.getX();
        int y = t.getY();
        boolean k = true;
        if ((x==0) || (x==6 && (y==2 || y==3 || y==6 || y==7))) {
            return counter;
        }
        else{
            do{
                if ((x-(counter+1)==0) || (x-(counter+1)==6 && (y==2 || y==3 || y==6 || y==7))) {
                    return counter+1;
                }
                APiece piece = tab[x-(counter+1)][y].getPiece();
                if(piece == null){
                    counter += 1;
                }
                else if (piece.getBelongs() != p.getBelongs()) {
                    counter += 1;
                    k = false;
                }
                else {
                    k = false;
                }
            }while(k);
            return counter;
        }
    }

/**
*<p>
*This method is used to know how many tiles are free between the tile in parameter and the board of the table/a ennemi piece
*@param a tile to start the counter
*<p>
*/
    public int counterDown(Tiles t){
        APiece p = t.getPiece();
        int counter = 0;
        int x = t.getX();
        int y = t.getY();
        boolean k = true;
        if ((x==9) || (x==3 && (y==2 ||y==3 || y==6 || y==7))) {
            return 0;
        }
        else{
            do{
                if ((x+(counter+1)==9) || (x+(counter+1)==3 && (y==2 ||y==3 || y==6 || y==7))) {
                    return counter+1;
                }
                APiece piece = tab[x+(counter+1)][y].getPiece();
                if(piece == null){
                    counter += 1;
                }
                else if (piece.getBelongs() != p.getBelongs()) {
                    counter += 1;
                    k = false;
                }
                else {
                    k = false;
                }
            }while(k);
            return counter;
        }
    }

/**
*<p>
*This method is used to know how many tiles are free between the tile in parameter and the board of the table/a ennemi piece
*@param a tile to start the counter
*<p>
*/
    public int counterRight(Tiles t){
        APiece p = t.getPiece();
        int counter = 0;
        int x = t.getX();
        int y = t.getY();
        boolean k = true;
        if ((y==9) || (y==1 && (x==4 || x==5)) || (y==5) && (x==4 || x==5)) {
            return 0;
        }
        else{
            do{
                if ((y+(counter+1)==9) || (y+(counter+1)==1 && (x==4 || x==5)) || (y+(counter+1)==5) && (x==4 || x==5)) {
                    return counter+1;
                }
                APiece piece = tab[x][y+(counter+1)].getPiece();
                if(piece == null){
                    counter += 1;
                }
                else if (piece.getBelongs() != p.getBelongs()) {
                    counter += 1;
                    k = false;
                }
                else {
                    k = false;
                }
            }while(k);
            return counter;
        }
    }

/**
*<p>
*This method is used to know how many tiles are free between the tile in parameter and the board of the table/a ennemi piece
*@param a tile to start the counter
*<p>
*/
    public int counterLeft(Tiles t){
        APiece p = t.getPiece();
        int counter = 0;
        int x = t.getX();
        int y = t.getY();
        boolean k = true;
        if ((y==0) || (y==8 && (x==4 || x==5)) || (y==4) && (x==4 || x==5)) {
            return 0;
        }
        else{
            do{
                if ((y-(counter+1)==0) || (y-(counter+1)==8 && (x==4 || x==5)) || (y-(counter+1)==4) && (x==4 || x==5)) {
                    return counter+1;
                }
                APiece piece = tab[x][y-(counter+1)].getPiece();
                if(piece == null){
                    counter += 1;
                }
                else if (piece.getBelongs() != p.getBelongs()) {
                    counter += 1;
                    k = false;
                }
                else {
                    k = false;
                }
            }while(k);
            return counter;
        }
    }

/**
*<p>
*This IA is a random one, it take 2 random integers to know where she is on the array, then it looks at the APiece in the tile selected by the 2 integers, and if the APiece belongs to the IA, it moves it towards a random direction
*<p>
*/
    public void randomIA(){
        boolean k = false;
        Random random = new Random();
        do{
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            if (this.getTiles(a,b) != null) {
                Tiles t = this.getTiles(a,b);
                if (t.getPiece() != null) {
                    APiece p = t.getPiece();
                    if (!p.getBelongs()) {
                        int c = random.nextInt(4);
                        if (c == 0){
                            if (this.testup(t)){
                                if (p.getRank()==2){
                                    int counter = this.counterUp(t);
                                    this.up(t,counter);
                                }
                                else{
                                    this.up(t,1);
                                }
                                k = true;
                            }
                        }
                        else if (c == 1){
                            if (this.testright(t)){
                                if(p.getRank()==2){
                                    int counter = this.counterRight(t);
                                    this.right(t,counter);
                                }
                                else{
                                    this.right(t,1);
                                }
                                k = true;
                            }
                        }
                        else if (c == 2){
                            if (this.testdown(t)){
                                if(p.getRank()==2){
                                    int counter = this.counterDown(t);
                                    this.down(t,counter);
                                }
                                else{
                                    this.down(t,1);
                                }
                                k = true;
                            }
                        }
                        else if (c == 3){
                            if (this.testleft(t)){
                                if(p.getRank()==2){
                                    int counter = this.counterLeft(t);
                                    this.left(t,counter);
                                }
                                else{
                                    this.left(t,1);
                                }
                                k = true;
                            }
                        }
                    }
                }
            }
        }while(k != true);
    }

/**
*<p>
*This IA is a average one, it want to go downwards but it cannt decided exatly which APiece is better than anohter one
*<p>
*/
    public void averageIA(){
        boolean k = false;
        Random random = new Random();
        do{
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            if (this.getTiles(a,b) != null) {
                Tiles t = this.getTiles(a,b);
                if (t.getPiece() != null) {
                    APiece p = t.getPiece();
                    if (!p.getBelongs()) {
                        if (this.testdown(t)){
                            if(p.getRank()==2){
                                int counter = this.counterLeft(t);
                                this.left(t,counter);
                            }
                            else{
                                this.left(t,1);
                            }
                            k = true;
                        }
                        else if (this.testright(t) && this.testleft(t)){
                            int c = random.nextInt(2);
                            if (c == 0) {
                                if(p.getRank()==2){
                                    int counter = this.counterRight(t);
                                    this.right(t,counter);
                                }
                                else{
                                    this.right(t,1);
                                }
                            }
                            else if (c == 1) {
                                if(p.getRank()==2){
                                    int counter = this.counterLeft(t);
                                    this.left(t,counter);
                                }
                                else{
                                    this.left(t,1);
                                }
                            }
                            k = true;
                        }
                        else if (this.testright(t)) {
                            if(p.getRank()==2){
                                int counter = this.counterRight(t);
                                this.right(t,counter);
                            }
                            else{
                                this.right(t,1);
                            }
                            k = true;
                        }
                        else if (this.testleft(t)) {
                            if(p.getRank()==2){
                                int counter = this.counterLeft(t);
                                this.left(t,counter);
                            }
                            else{
                                this.left(t,1);
                            }
                            k = true;
                        }
                        else if (this.testup(t)) {
                            if (p.getRank()==2){
                                int counter = this.counterUp(t);
                                this.up(t,counter);
                            }
                            else{
                                this.up(t,1);
                            }
                            k = true;
                        }
                    }
                }
            }
        }while(k != true);
    }

/**
*<p>
*This method tests all the possibilities to know if someone won the game or not
*This method do the test at the end of every turn
*The turn is defined by the param n, who is a counter
*<p>
*@param an integer representing the turn of the game
*@return a boolean used to know if the game is ended or not
*/
    public boolean end(int n){
        //Flag's Verification -> if there is one flag left, someone won
        int f = 0;
        for (int i = 0; i < 10 ; i++){
            for (int j = 0 ; j < 10 ; j++){
                if (tab[i][j] != null){
                    APiece p = tab[i][j].getPiece();
                    if (p != null) {
                        if (p.getRank() == 0) {
                            f++;
                        }
                    }
                }
            }
        }
        if (f != 2){return true;}
        else {
            //Movements Verification -> if one player can't move one of his APieces, he lost
            if (n%2 == 1) {
                boolean k = true;
                for (int i = 0; i < 10; i++){
                    for (int j = 0; j < 10; j++){
                        if (tab[i][j] != null){
                            Tiles t = this.getTiles(i,j);
                            if (t.getPiece() != null){
                                APiece p = t.getPiece();
                                if (p.getBelongs()){
                                    if (this.testup(t) || this.testright(t) || this.testdown(t) || this.testleft(t)) {k = false;}
                                }
                            }
                        }
                    }
                }
                return k;
            }
            else if (n%2 == 0) {
                boolean k = true;
                for (int i = 0; i < 10; i++){
                    for (int j = 0; j < 10; j++){
                        if (tab[i][j] != null){
                            Tiles t = this.getTiles(i,j);
                            if (t.getPiece() != null){
                                APiece p = t.getPiece();
                                if (!p.getBelongs()){
                                    if (this.testup(t) || this.testright(t) || this.testdown(t) || this.testleft(t)) {k = false;}
                                }
                            }
                        }
                    }
                }
                return k;
            }
        }
        return false;
    }

/**
*<p>
*Method used to save the position of APiece in the array in a file
*I saved it like an object, so I had to implement Serializable in my different objects : Tiles and APieces
*The file created is a binary file, the user cann't read it to know the position of the ennemy team
*<p>
*@throws FileNotFoundException
*@throws IOExcpetion
*/
    public void save() {
        try {
            FileOutputStream output = new FileOutputStream(new File("SaveStratego.txt"));
            ObjectOutputStream out = new ObjectOutputStream(output);
            out.writeObject(this.tab);
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

/**
*<p>
*Method used to load the position of APiece in the array from a file
*<p>
*@throws FileNotFoundException
*@throws IOExcpetion
*/
    public void load(){
        try{
            FileInputStream input = new FileInputStream(new File("SaveStratego.txt"));
            ObjectInputStream in = new ObjectInputStream(input);
            this.tab = (Tiles[][]) in.readObject();
            in.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}