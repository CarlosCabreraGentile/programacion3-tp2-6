package Ej6;
public class Node { 
	private int info; 
	private Node izquierdo;
	private Node derecho;

	public Node(int o) {
		info = o;
		izquierdo = null;
		derecho = null;  
	}
 
	public Node(int numero, Node izquiero, Node derecho) {
		setInfo(numero);
		setIzquierdo(izquiero);
		setDerecho(derecho);
	}

	public void setInfo(int numero) { 
		info = numero;
	} 

	public void setIzquierdo(Node p) {
		izquierdo = p;
	}
	
	public void setDerecho(Node n) {
		derecho = n;
	}

	public int getInfo() {
		return info;
	}

	public Node getDerecho() {
		return derecho;
	}
	
	public Node getIzquierdo() {
		return izquierdo;
	}
}