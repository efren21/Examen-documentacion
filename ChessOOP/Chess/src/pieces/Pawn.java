/**

    La clase Pawn representa al peón, que es una pieza del juego de ajedrez y hereda de la clase Piece.
    @author
    @version
    */

package pieces;

import java.util.ArrayList;

import chess.Cell;

public class Pawn extends Piece{

    /**
     * Constructor de la clase Pawn
     * 
     * @param i es el id de la pieza
     * @param p es el path de la imagen de la pieza
     * @param c es el color de la pieza
     */
    public Pawn(String i,String p,int c)
    {
	    setId(i);
	    setPath(p);
	    setColor(c);
    }

    /**
     * Esta función sobrescribe la función move de la clase Piece
     * 
     * @param state es el estado actual del tablero
     * @param x es la fila en la que se encuentra la pieza
     * @param y es la columna en la que se encuentra la pieza
     * @return un ArrayList de Cell con las posibles jugadas que puede hacer la pieza
     */
    @Override
    public ArrayList<Cell> move(Cell state[][],int x,int y)
    {
	    // El peón solo puede moverse una casilla, excepto en su primer turno donde puede moverse 2 casillas.
	    // Solo puede moverse en diagonal para atacar una pieza de color opuesto.
	    // No puede moverse hacia atrás ni moverse hacia adelante para atacar una pieza.
	    
	    possiblemoves.clear();
	    if(getcolor()==0)
	    {
		    if(x==0)
			    return possiblemoves;
		    if(state[x-1][y].getpiece()==null)
		    {
			    possiblemoves.add(state[x-1][y]);
			    if(x==6)
			    {
				    if(state[4][y].getpiece()==null)
					    possiblemoves.add(state[4][y]);
			    }
		    }
		    if((y>0)&&(state[x-1][y-1].getpiece()!=null)&&(state[x-1][y-1].getpiece().getcolor()!=this.getcolor()))
			    possiblemoves.add(state[x-1][y-1]);
		    if((y<7)&&(state[x-1][y+1].getpiece()!=null)&&(state[x-1][y+1].getpiece().getcolor()!=this.getcolor()))
			    possiblemoves.add(state[x-1][y+1]);
	    }
	    else
	    {
		    if(x==8)
			    return possiblemoves;
		    if(state[x+1][y].getpiece()==null)
		    {
			    possiblemoves.add(state[x+1][y]);
			    if(x==1)
			    {
				    if(state[3][y].getpiece()==null)
					    possiblemoves.add(state[3][y]);
			    }
		    }
		    if((y>0)&&(state[x+1][y-1].getpiece()!=null)&&(state[x+1][y-1].getpiece().getcolor()!=this.getcolor()))
			    possiblemoves.add(state[x+1][y-1]);
		    if((y<7)&&(state[x+1][y+1].getpiece()!=null)&&(state[x+1][y+1].getpiece().getcolor()!=this.getcolor()))
			    possiblemoves.add(state[x+1][y+1]);
	    }
	    return possiblemoves;
    }
}
