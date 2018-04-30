import java.util.ArrayList;

/**
 * @author
 * 	Gonz�lez, Fernanda Magali
 *	Martino Martinez, Fabi�n 
 *
 */
public class Libro {

	private String titulo;
	private String autor;
	private int cantPag;
	private ArrayList<String> generos;
	
	/**
	 * @param titulo
	 * @param autor
	 * @param cantPag
	 * @param generos
	 */
	public Libro(String titulo, String autor, int cantPag, ArrayList<String> generos) {
		this.titulo = titulo;
		this.autor = autor;
		this.cantPag = cantPag;
		this.generos = generos;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the cantPag
	 */
	public int getCantPag() {
		return cantPag;
	}

	/**
	 * @param cantPag the cantPag to set
	 */
	public void setCantPag(int cantPag) {
		this.cantPag = cantPag;
	}

	/**
	 * @return the generos
	 */
	public ArrayList<String> getGeneros() {
		return generos;
	}

	/**
	 * @param generos the generos to set
	 */
	public void setGeneros(ArrayList<String> generos) {
		this.generos = generos;
	}
	
}
