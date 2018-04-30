import java.util.ArrayList;

/**
 * @author
 * 	Gonz�lez, Fernanda Magali
 *	Martino Martinez, Fabi�n 
 *
 */
public class Coleccion {
	
	private ArrayList<Libro> biblioteca;

	/**
	 * @param biblioteca
	 */
	public Coleccion(ArrayList<Libro> biblioteca) {
		this.biblioteca = biblioteca;
	}

	/**
	 * @return the biblioteca
	 */
	public ArrayList<Libro> getBiblioteca() {
		return biblioteca;
	}

	/**
	 * @param biblioteca the biblioteca to set
	 */
	public void setBiblioteca(ArrayList<Libro> biblioteca) {
		this.biblioteca = biblioteca;
	}
	
}
