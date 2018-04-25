package ArbolBinario;

/**
 * @author Fernanda M. Gonzalez
 *
 */
public class Node {

	private int info;
	private Node left;
	private Node right;
	
	/**
	 * Constructor del nodo.
	 * @param el valor para construir el nodo.
	 */
	public Node(int info) {
		this.info = info;
		this.right = null;
		this.left = null;
	}
	
	/**
	 * Constructor por defecto del nodo.
	 */
	public Node() {
		this.info = -1;
		this.right = null;
		this.left = null;
	}
	
	/**
	 * @return the info
	 */
	public int getInfo() {
		return info;
	}
	
	/**
	 * @param info the info to set
	 */
	public void setInfo(int info) {
		this.info = info;
	}
	
	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}
	
	/**
	 * @param left the left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}
	
	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}
	
	/**
	 * @param right the right to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}
		
}
