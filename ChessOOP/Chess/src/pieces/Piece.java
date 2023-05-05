/**
    Esta es la clase Piece. Es una clase abstracta de la cual heredan todas las piezas reales.
    Define todas las funciones comunes a todas las piezas.
    La función move() es una función abstracta que debe ser sobrescrita en todas las clases heredadas.
    Implementa la interfaz Cloneable, ya que a menudo se requiere una copia de la pieza.
    Etiquetas:
    @version 1.0
    @since 2021-09-01
    @author
    */
    package pieces;

import java.util.ArrayList;

import chess.Cell;

public abstract class Piece implements Cloneable{

	//Variables de miembro
    private int color;
    private String id=null;
    private String path;
    protected ArrayList<Cell> possiblemoves = new ArrayList<Cell>();  //Protegido (acceso desde las clases hijas)
    public abstract ArrayList<Cell> move(Cell pos[][],int x,int y);  //Función abstracta. Debe ser sobrescrita.

    /**
     * Setter del ID
     * @param id El ID de la pieza
     */
    public void setId(String id)
    {
	    this.id=id;
    }

    /**
     * Setter del path
     * @param path El path del archivo de imagen de la pieza
     */
    public void setPath(String path)
    {
	    this.path=path;
    }

    /**
     * Setter del color
     * @param c El color de la pieza
     */
    public void setColor(int c)
    {
	    this.color=c;
    }

    /**
     * Getter del path
     * @return El path del archivo de imagen de la pieza
     */
    public String getPath()
    {
	    return path;
    }

    /**
     * Getter del ID
     * @return El ID de la pieza
     */
    public String getId()
    {
	    return id;
    }

    /**
     * Getter del color
     * @return El color de la pieza
     */
    public int getcolor()
    {
	    return this.color;
    }

    /**
     * Función para retornar una copia "shallow" del objeto. La copia tiene exactamente el mismo valor de variables, pero una referencia diferente.
     * @return Una copia superficial de la pieza
     * @throws CloneNotSupportedException Si no se puede crear una copia de la pieza
     */
    public Piece getcopy() throws CloneNotSupportedException
    {
	    return (Piece) this.clone();
    }

}
