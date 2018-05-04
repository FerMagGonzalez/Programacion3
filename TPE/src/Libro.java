import java.util.Arrays;


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
	private String[] generos;
	
	/**
	 * @param titulo
	 * @param autor
	 * @param cantPag
	 * @param generos
	 */
	public Libro(String titulo, String autor, int cantPag, String[] generos) {
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
	public String[] getGeneros() {
		return generos;
	}

	/**
	 * @param generos the generos to set
	 */
	public void addGeneros(String[] generos) {
		this.generos = generos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", cantPag="
				+ cantPag + ", generos=" + Arrays.toString(generos)
				+ ", getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor()
				+ ", getCantPag()=" + getCantPag() + "]";
	}
	
}
