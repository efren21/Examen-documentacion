package pieces;

import java.util.ArrayList;
import chess.Cell;

/**
 * Esta es la clase Bishop que representa el alfil en el juego de ajedrez.
 * La función move define las reglas básicas para el movimiento del alfil en el tablero de ajedrez.
 */
public class Bishop extends Piece {
	
	/**
	 * Crea una nueva instancia de la clase Bishop.
	 * 
	 * @param i El ID del alfil.
	 * @param p La ruta de la imagen del alfil.
	 * @param c El color del alfil.
	 */
	public Bishop(String i, String p, int c) {
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	/**
	 * Devuelve una lista de todas las posibles celdas a las que se puede mover el alfil.
	 * 
	 * @param state El estado actual del tablero.
	 * @param x La posición x actual del alfil.
	 * @param y La posición y actual del alfil.
	 * @return Una lista de todas las posibles celdas a las que se puede mover el alfil.
	 */
	public ArrayList<Cell> move(Cell state[][], int x, int y) {
		// El alfil se puede mover en diagonal en las 4 direcciones (NO, NE, SO, SE).
		// Esta función define esa lógica.
		possiblemoves.clear();
		int tempx=x+1,tempy=y-1;
		while(tempx<8 && tempy>=0) {
			if(state[tempx][tempy].getpiece()==null) {
				possiblemoves.add(state[tempx][tempy]);
			}
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor()) {
				break;
			}
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy--;
		}
		tempx=x-1;tempy=y+1;
		while(tempx>=0 && tempy<8) {
			if(state[tempx][tempy].getpiece()==null) {
				possiblemoves.add(state[tempx][tempy]);
			}
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor()) {
				break;
			}
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy++;
		}
		tempx=x-1;tempy=y-1;
		while(tempx>=0 && tempy>=0) {
			if(state[tempx][tempy].getpiece()==null) {
				possiblemoves.add(state[tempx][tempy]);
			}
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor()) {
				break;
			}
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy--;
		}
		tempx=x+1;tempy=y+1;
		while(tempx<8 && tempy<8) {
			if(state[tempx][tempy].getpiece()==null) {
				possiblemoves.add(state[tempx][tempy]);
			}
			else

