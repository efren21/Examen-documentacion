package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * Esta es la clase Knight heredada de la clase abstracta Piece
 * @author [nombre del autor]
 * @version [versión del programa]
 */
public class Knight extends Piece{

	/**
	 * Constructor de la clase Knight
	 * @param i ID de la pieza
	 * @param p Ruta de la imagen de la pieza
	 * @param c Color de la pieza (1 para blanco, 0 para negro)
	 */
	public Knight(String i,String p,int c)
	{
		setId(i);
		setPath(p);
		setColor(c);
	}

	/**
	 * Función para mover la pieza
	 * @param state Estado actual del tablero
	 * @param x Coordenada x actual de la pieza
	 * @param y Coordenada y actual de la pieza
	 * @return Lista de celdas a las que se puede mover la pieza
	 */
	@Override
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		possiblemoves.clear();
		int posx[]={x+1,x+1,x+2,x+2,x-1,x-1,x-2,x-2};
		int posy[]={y-2,y+2,y-1,y+1,y-2,y+2,y-1,y+1};
		for(int i=0;i<8;i++)
			if((posx[i]>=0&&posx[i]<8&&posy[i]>=0&&posy[i]<8))
				if((state[posx[i]][posy[i]].getpiece()==null||state[posx[i]][posy[i]].getpiece().getcolor()!=this.getcolor()))
				{
					possiblemoves.add(state[posx[i]][posy[i]]);
				}
		return possiblemoves;
	}
}

