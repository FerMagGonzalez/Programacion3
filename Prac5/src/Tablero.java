/**
 * @author Fernanda M. Gonzalez
 */
public class Tablero {

	private int[][] tablero;
	private int[] sumaFila;
	private int[] sumaColumna;
	private int tamaño;
	/**
	 * @param tablero
	 * @param sumaFila
	 * @param sumaColumna
	 * @param tamaño
	 */
	public Tablero(int n) {
		this.tablero = new int[n][n];
		this.sumaFila = new int[n];
		this.sumaColumna = new int[n];
		this.tamaño = n;
	}
	
	/*
	 * 
	 */
	public int getTamaño(){
		return this.tamaño;
	}
	
	/**
	 * 
	 * @param i
	 * @return
	 */
	public int getSumaFila(int i){
		if (i<this.tamaño){
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
		if (i<this.tamaño){
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
		if ((f<tamaño)&&(tablero[f][tamaño-1] != 0))
			return true;
		return false;
	}
	
	/**
	 * 
	 * @param c
	 * @return
	 */
	public boolean columnaCompleta(int c){
		if ((c<tamaño) && (tablero[tamaño-1][c] != 0))
			return true;
		return false;
	}
	
	/**
	 * 
	 * @param cas
	 * @param e
	 */
	public void ingresarElem(int cas, int e){
		int f = cas/tamaño;
		int c = cas%tamaño;
		if (tablero[f][c] == 0){
			tablero[f][c] = e;
			this.sumarFila(f, e);
			this.sumarColumna(c, e);
		}
	}
	
	public void borrarElem(int cas, int e){
		int f = cas/tamaño;
		int c = cas%tamaño;
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
		for (int i=0; i < this.tamaño; i++){
			for (int j = 0; j < this.tamaño; j++) {
				System.out.print("| " + this.tablero[i][j] + " |");
			}
			System.out.print("  " + this.getSumaFila(i));
			System.out.println(" ");
		}
		for (int c = 0; c < this.tamaño; c++) {
			System.out.print("  " + this.getSumaColumna(c) + " ");
		}
	}
	
}
