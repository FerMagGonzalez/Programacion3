package ArbolBinario;

/**
 * 
 * @author Fernanda M. Gonzalez
 *
 */
public class Main {

	public static void main(String[] args) {

		BinaryTree arbol = new BinaryTree();
		
		arbol.insert(55);
		arbol.insert(6);
		arbol.insert(57);
		arbol.insert(15);
		arbol.insert(22);
		arbol.insert(60);
		arbol.insert(56);
		arbol.insert(100);
		
		System.out.println("---------------Ejercicio de Arbol Binario---------------\n");
		
		System.out.println(" El Árbol esta vacio? " + arbol.isEmpty());
		
		System.out.println("\n Existe el elemento 22? " + arbol.hasElem(22));
		
		System.out.println("\n La altura del árbol es: " + arbol.getHeight());
		
		System.out.println("\n Distintas formas de imprimir un árbol: ");
		System.out.println(" PreOrder: ");
		arbol.printPreOrder();
		System.out.println("\n InOrder: ");
		arbol.printInOrder();
		System.out.println("\n PosOrder: ");
		arbol.printPosOrder();
		
		System.out.println("\n\n El valor máximo es: " + arbol.getMaxElement());

	}

}
