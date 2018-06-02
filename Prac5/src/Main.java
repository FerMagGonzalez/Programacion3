/**
 * @author Fernanda M. Gonzalez
 */
public class Main {

	public static int N = 3;   //tamaño de la matriz
	public static int K = 12;  //numeros que se pueden utilizar
	public static int S = 15;  //valor que deben sumar
	
	public static void main(String[] args) {
		
		Tablero cuboMagico = new Tablero(N);
		int[] usados = new int[K+1];
		int nroCas = 0;
		
		backCuboMagico(cuboMagico, nroCas, usados);
		
		System.out.println("El CUBO MAGICO\n");
		cuboMagico.mostrar();

	}

	/**
	 * 
	 * @param t
	 * @param nroCas
	 * @param usados
	 */
	private static void backCuboMagico(Tablero t, int nroCas, int[] usados) {
		
		if (nroCas == (N*N+1)){   //Llene el tablero
			t.mostrar();
		}
		else{
			for (int i=1; i<=K; i++){
				if (usados[i] == 0){   //No esta usado
					if(!poda(t,nroCas,i)){
						usados[i] = 1;
						t.ingresarElem(nroCas, i);
						backCuboMagico(t, nroCas+1, usados);
						usados[i] = 0;
						t.borrarElem(nroCas, -i);
					}
				}
			}
		}
		
	}

	/**
	 * 
	 * @param t
	 * @param n
	 * @param e
	 * @return
	 */
	private static boolean poda(Tablero t, int n, int e){
		int f = n/N;
		int c = n%N;
		if ((t.filaCompleta(f)) || (t.columnaCompleta(c))){
			if ((t.getSumaFila(f) != S) || (t.getSumaColumna(c) != S)){
				return true;
			}
		}
		return false;
	}
	
}
