/**

    Clase Rook hereda de la clase abstracta Piece.
    Representa a la pieza Torre.
    @author (tu nombre)
    @version (fecha actual)
    */
    package pieces;

import java.util.ArrayList;

import chess.Cell;

public class Rook extends Piece {
	
    /**
     * Constructor de la clase Rook.
     *
     * @param i id de la pieza
     * @param p ruta de la imagen de la pieza
     * @param c color de la pieza (blanco o negro)
     */
    public Rook(String i, String p, int c) {
        setId(i);
        setPath(p);
        setColor(c);
    }

    /**
     * Método que retorna la lista de celdas posibles a las que se puede mover la torre.
     *
     * @param state estado actual del tablero
     * @param x coordenada x de la torre
     * @param y coordenada y de la torre
     * @return ArrayList<Cell> lista de celdas posibles
     */
    public ArrayList<Cell> move(Cell state[][], int x, int y) {
        possiblemoves.clear();
        int tempx = x - 1;
        while (tempx >= 0) {
            if (state[tempx][y].getpiece() == null)
                possiblemoves.add(state[tempx][y]);
            else if (state[tempx][y].getpiece().getcolor() == this.getcolor())
                break;
            else {
                possiblemoves.add(state[tempx][y]);
                break;
            }
            tempx--;
        }
        tempx = x + 1;
        while (tempx < 8) {
            if (state[tempx][y].getpiece() == null)
                possiblemoves.add(state[tempx][y]);
            else if (state[tempx][y].getpiece().getcolor() == this.getcolor())
                break;
            else {
                possiblemoves.add(state[tempx][y]);
                break;
            }
            tempx++;
        }
        int tempy = y - 1;
        while (tempy >= 0) {
            if (state[x][tempy].getpiece() == null)
                possiblemoves.add(state[x][tempy]);
            else if (state[x][tempy].getpiece().getcolor() == this.getcolor())
                break;
            else {
                possiblemoves.add(state[x][tempy]);
                break;
            }
            tempy--;
        }
        tempy = y + 1;
        while (tempy < 8) {
            if (state[x][tempy].getpiece() == null)
                possiblemoves.add(state[x][tempy]);
            else if (state[x][tempy].getpiece().getcolor() == this.getcolor())
                break;
            else {
                possiblemoves.add(state[x][tempy]);
                break;
            }
            tempy++;
        }
        return possiblemoves;
    }

}
