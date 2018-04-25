package ArbolBinario;

/**
 * Métodos:
 *		Object getRoot(), boolean hasElem(Object), boolean isEmpty(), void insert(Object),
 *		boolean delete(Object), int getHeight(), void printPosOrder(), void printPreOrder(),
 *		void printInOrder(), List getLongestBranch(), List getFrontera(), Object getMaxElem(),
 *		List getElemAtLevel(i)
 *	1. ¿Cuál es la complejidad de cada uno de estos métodos?
 *
 * @author Fernanda M. Gonzalez
 *
 */
public class BinaryTree {

	private Node root;
	
	/**
	 * Costructor por defecto del Árbol.
	 */
	public BinaryTree() {
		this.setRoot(null);
	}


	/**
	 * Complejidad: O(1).
	 * @return Devuelve la raiz del arbol.
	 */
	public Node getRoot() {
		return root;
	}
	
	/**
	 * @param raiz the raiz to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}
	
	/**
	 * Método que dice si el árbol esta vacío o no.
	 * Complejidad: O(1).
	 * @return true si el árbol no contiene ningún elemento.
	 */
	public boolean isEmpty(){
		return (root == null);
	}
	
	/**
	 * Método que dice si un nodo es hoja o no.
	 * Complejidad: O(1).
	 * @return true si el nodo es hoja
	 */
	public boolean isSheet(){
		return ((root.getLeft() == null) && (root.getRight() == null));
	}
	
	/**
	 * Método que constata si el elemento buscado esta, o no, en la estructura.
	 * Complejidad: O(log(n)).
	 * @param e
	 * @return verdadero si el elemento esta en el arbol.
	 */
	public boolean hasElem(int e){
		return hasElement (root, e);
	}
	
	/**
	 * Busca el elmento, de forma recursiva, en la estructura.
	 * Complejidad: O(log(n)).
	 * @param n
	 * @param e
	 * @return verdadero si encuentra el valor en el nodo pasado por parametro.
	 */
	private boolean hasElement(Node n, int e){
		if (n != null){
			if (n.getInfo() == e){
				return true;
			}
			else if (n.getInfo() < e){
				return hasElement(n.getRight(), e);
			}
			else
				return hasElement(n.getLeft(), e);
		}
		else 
			return false;
	}
	
	/**
	 * Método que inserta un nuevo valor a la estructura.
	 * Complejidad: O(log(n).
	 * @param e
	 */
	public void insert (int e){	
		insert(root, new Node(e));
	}
	
	/**
	 * Inserta el nodo en el Arbol de forma recursiva. Si esta repetido no lo inserta.
	 * Complejidad: O(log(n)).
	 * @param raiz
	 * @param nNodo
	 */
	private void insert(Node raiz, Node nNodo){
		if (raiz == null){
            this.setRoot(nNodo);
        }
        else{
            if (nNodo.getInfo() <= raiz.getInfo()) {
            	if (raiz.getLeft() == null) {
                    raiz.setLeft(nNodo);
                }
                else{
                    insert(raiz.getLeft(), nNodo);
                }
            }
            else{
            	if (raiz.getRight() == null){
                    raiz.setRight(nNodo);
                }
                else{
                   insert(raiz.getRight(), nNodo);
                }
            }
        }
    }
	
	/**
	 * Método que devuelve cual es la altura de la estructura.
	 * Complejidad: O(n). Es asi ya que en el peor de los casos la altura el la misma que la
	 * cantidad de nodos del arbol (cuando se agregan sobre una sola rama o casos asi).
	 * @return 
	 */
	public int getHeight(){
		return getHeight(root);
	}
	
	/**
	 * Informa cual es la altura del árbol.
	 * Complejidad: O(n).
	 * @param n
	 * @return la altura.
	 */
	private int getHeight(Node n){
        if (n == null) {
            return 0;
        }
        else {
            return (1 + Math.max((this.getHeight(n.getLeft())), (this.getHeight(n.getRight()))));
        }
    }
	
	/**
	 * Complejidad: O(n).
	 * El costo de recorrer un ABB es O(n), ya que se necesita visitar todos los vértices.
	 */
	public void printPreOrder(){
		preOrder(root);
	}
	
	/**
	 * Complejidad: O(n).
	 * @param n
	 */
	private void preOrder(Node n){
        if (n != null) {
            System.out.print(n.getInfo() + ", ");
            if (n.getLeft() == null)
            	System.out.println(" Izq vacia ");
            if (n.getRight() == null)
            	System.out.println(" Der vacia ");
            preOrder(n.getLeft());
            preOrder(n.getRight());
        }
    }
	
	/**
	 * Complejidad: O(n).
	 * El costo de recorrer un ABB es O(n), ya que se necesita visitar todos los vértices.
	 */
	public void printInOrder(){
		inOrder(root);
	}
	
	/**
	 * Complejidad: O(n).
	 * @param n
	 */
    private void inOrder(Node n){
        if (n != null) {
            inOrder(n.getLeft());
            if (n.getLeft() == null)
            	System.out.println(" Izq vacia ");
            System.out.print( n.getInfo() + ", "  );
            if (n.getRight() == null)
            	System.out.println(" Der vacia ");
            inOrder(n.getRight());
        }
    }

    /**
	 * Complejidad: O(n).
	 * El costo de recorrer un ABB es O(n), ya que se necesita visitar todos los vértices.
	 */
	public void printPosOrder(){
		posOrder(root);
	}
    
	/**
	 * Complejidad: O(n).
	 * @param n
	 */
    private void posOrder(Node n){
        if (n != null) {
            posOrder(n.getRight());
            posOrder(n.getLeft());
            if (n.getRight() == null)
            	System.out.println(" Der vacia ");
            if (n.getLeft() == null)
            	System.out.println(" Izq vacia ");
            System.out.print( n.getInfo() + ", "  );
        }
    }
    
    /**
     * Método que devuelve el mayor elemento del árbol.
     * Complejidad: O(log(n)).
     * @return El elemento de mayor valor.
     */
    public int getMaxElement(){
    	return getMaxElem(root);
    }
    
    /**
	 * Busca el valor del nodo de mas a la derecha en el cual se encuentra el máximo valor del árbol. 
	 * Complejidad: O(log(n)).
	 * @param n
	 * @return el máximo del árbol.
	 */
	private int getMaxElem(Node n){
	     if(n.getRight() == null) //si no hay un nodo con mayor valor retorna el valor del nodo actual
	        return n.getInfo(); 
	     // sigue buscando en los nodos de mayor valor
	     return getMaxElem(n.getRight());    
	}
	
}
