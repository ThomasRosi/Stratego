package pieces;

import java.io.Serializable;

/**
*Abstract class creating pieces
*@author ROSI THOMAS
*/

public abstract class APiece implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int rank;
	protected String name;
	protected String abv;
    protected boolean belongs;

/**
*<p>
*Constructor: Every piece has a rank, a name, an abbreviation and a boolean(used to know if piece belongs to user(true/Default Value) or to IA(false))
*<p>
*@param an integer representing the rank of the piece
*@param the name of the piece
*@param a abbreviation of the name 
*@param a boolean who decide to which player the piece belongs
*/
	public APiece(int rank, String name, String abv, boolean belongs) {
		this.rank = rank;
		this.name = name;
        this.abv = abv;
        this.belongs = belongs;
	}

/**
*@return the rank of the selected piece
*/
	public int getRank() {
		return rank;
	}

/**
*@return the name of the selected piece
*/
	public String getName() {
		return name;
	}

/**
*@return the abbreviation of the selected piece
*/
    public String getAbv() {
        return abv;
    }

/**
*@return the boolean used to know if the selected piece belongs to the user or to IA
*/
    public boolean getBelongs(){
        return belongs;
    }

/**
*@param a boolean to change the membership of the piece
*/
    public void setBelongs(boolean b){
        this.belongs = b;
    }
    
/**
*<p>
*This method is only used to see the selected piece in the console
*<p>
*/
	public void affichage() {
		System.out.print("  "+abv+"  ");
	}

/**
*<p>
*Method Equals (permission to use '==' in a condition)
*<p>
*@param a piece chosen to compare
*@return boolean to know if the piece p is equal to the piece to which was applied this method
*/
	public boolean equals(APiece p) {
		if (this.getName().equals(p.getName())) 
			{return true;}
		else 
			{return false;}
	}

}	
