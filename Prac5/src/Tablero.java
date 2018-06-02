/**
 * @author Fernanda M. Gonzalez
 */
public class Tablero {

	private int[][] tablero;
	private int[] sumaFila;
	private int[] sumaColumna;
	private int tama�o;
	/**
	 * @param tablero
	 * @param sumaFila
	 * @param sumaColumna
	 * @param tama�o
	 */
	public Tablero(int n) {
		this.tablero = new int[n][n];
		this.sumaFila = new int[n];
		this.sumaColumna = new int[n];
		this.tama�o = n;
	}
	
	/*
	 * 
	 */
	public int getTama�o(){
		return this.tama�o;
	}
	
	/**
	 * 
	 * @param i
	 * @return
	 */
	public int getSumaFila(int i){
		if (i<this.tama�o){
			return this.sumaFila[i];
		}
		return 0;
	}
	
	/**
	 * 
	 * @param i
	 * @return
	 */
	public int getSumaColumna(int i){
		if (i<this.tama�o){
			return this.sumaColumna[i];
		}
		return 0;
	}
	
	/**
	 * 
	 * @param f
	 * @param e
	 */
	public void sumarFila(int f, int e){
		if (sumaFila[f] == 0){
			sumaFila[f] = e;
		}
		else{
			sumaFila[f] = sumaFila[f] + e;
		}
	}
	
	/**
	 * 
	 * @param c
	 * @param e
	 */
	public void sumarColumna(int c, int e){
		if (sumaColumna[c] == 0){
			sumaColumna[c] = e;
		}
		else{
			sumaColumna[c] = sumaColumna[c] + e;
		}
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	public boolean filaCompleta(int f){
		if ((f<tama�o)&&(tablero[f][tama�o-1] != 0))
			return true;
		return false;
	}
	
	/**
	 * 
	 * @param c
	 * @return
	 */
	public boolean columnaCompleta(int c){
		if ((c<tama�o) && (tablero[tama�o-1][c] != 0))
			return true;
		return false;
	}
	
	/**
	 * 
	 * @param cas
	 * @param e
	 */
	public void ingresarElem(int cas, int e){
		int f = cas/tama�o;
		int c = cas%tama�o;
		if (tablero[f][c] == 0){
			tablero[f][c] = e;
			this.sumarFila(f, e);
			this.sumarColumna(c, e);
		}
	}
	
	public void borrarElem(int cas, int e){
		int f = cas/tama�o;
		int c = cas%tama�o;
		if (tablero[f][c] != 0){
			tablero[f][c] = 0;
			this.sumarFila(f, e);
			this.sumarColumna(c, e);
		}
	}
	
	/*
	 * 
	 */
	public void mostrar(){
		for (int i=0; i < this.tama�o; i++){
			for (int j = 0; j < this.tama�o; j++) {
				System.out.print("| " + this.tablero[i][j] + " |");
			}
			System.out.print("  " + this.getSumaFila(i));
			System.out.println(" ");
		}
		for (int c = 0; c < this.tama�o; c++) {
			System.out.print("  " + this.getSumaColumna(c) + " ");
		}
	}
	
}
