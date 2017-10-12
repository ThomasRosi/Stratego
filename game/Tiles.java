package game;

import java.io.Serializable; 

import pieces.APiece;

/**
*<p>
*A tile is a place for a piece, user can only move his pieces on a tile.
*<p>
*@author: ROSI THOMAS
*/

public class Tiles implements Serializable {
    protected APiece piece;
    protected int x;
    protected int y;

/**
*<p>
*Constructor: A tile has a piece and coordinates
*<p>
*@param a piece or nothing (null)
*@param the X-coordinate
*@param the Y-coordinate
*/
	public Tiles(APiece piece, int x, int y) {
		this.piece=piece;
        this.x = x;
        this.y = y;
	}
    
/**
*@return the piece in the selected tile
*/
    public APiece getPiece() {
        return piece;
    }

/**
*@param a piece used to change the old one
*/
    public void setPiece(APiece newPiece){
        piece = newPiece;
    }
    
/**
*@return the X-coordinate 
*/
    public int getX() {
        return x;
    }

/**
*@return the Y-coordinate
*/
    public int getY() {
        return y;
    }

/**
*This method is only used to see the selected tile in the console
*/
    public void affichage() { 
        if (piece==null) {
            System.out.print("   null   ");
        }
        else {
            piece.affichage();
        }
    }
}