import java.util.ArrayList;

/**
 * @author
 * 	González, Fernanda Magali
 *	Martino Martinez, Fabián 
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
