package Ej6;
 
import java.util.ArrayList;
import java.util.List;

public class ArbolBinario { 
	protected int size;
	Node root = null;
	
	public ArbolBinario(Node root) {
		this.root = root;
	}
	
	public Node getRoot(){
	     return  this.root;
	}
 
	public boolean hasElement(int n) {
		return hasElement(root, n);
	} 
	
	private boolean hasElement(Node raiz, int n) {
		if(raiz != null) {
			if(raiz.getInfo() == n) {
				return true;
			}
			else if(raiz.getInfo() < n){ 
				return hasElement(raiz.getDerecho(), n);
			}
			else {
				return hasElement(raiz.getIzquierdo(), n);
			}
		}
		boolean hayElemento = false;
		return hayElemento;
	}
	
	public boolean isEmpty() {
		return root == null;
	} 

	public void insert(int numero) { 
		Node nuevoNodo = new Node(numero);
		if(isEmpty()) {
			this.root = nuevoNodo;
		}
		else {
			insert(root, nuevoNodo);
		}        
	}
	
	private void insert(Node root2, Node nuevoNodo) {
		if(root2.getInfo() > nuevoNodo.getInfo()) {
			if(root2.getIzquierdo() != null) {
				insert(root2.getIzquierdo(), nuevoNodo);
			}
			else {
				root2.setIzquierdo(nuevoNodo);
			}
		}
		else {
			if(root2.getDerecho() != null) {
				insert(root2.getDerecho(), nuevoNodo);
			}
			else {
				root2.setDerecho(nuevoNodo);
			}
		}
	} 
	  
	public boolean delete(int numero) {
		boolean delete=false;
		Node aux = root;
				if(root.getInfo() == numero) {
					if((root.getDerecho() != null) && ((root.getDerecho().getIzquierdo()!= null) || (root.getDerecho().getDerecho()!= null))) {
						root = realizarCorrimientos(root, numero);
						delete=true;
					}
					else if((root.getDerecho() != null) && ((root.getDerecho().getIzquierdo() == null) && (root.getDerecho().getDerecho() == null))) {
						root = aux.getDerecho();
						root.setIzquierdo(aux.getIzquierdo());
					} 
					else {
						root = root.getIzquierdo();
					}
				} 
				else {
					delete=delete(root, numero);
				}
			return delete;
	} 
	
	public boolean delete(Node raiz, int numero) {
	boolean delete=false;
		if(raiz!=null) {
			if((raiz.getInfo() > numero)&&(raiz.getIzquierdo()!=null)){
				if(raiz.getIzquierdo().getInfo() == numero) {
					raiz.setIzquierdo(realizarCorrimientos(raiz.getIzquierdo(), numero));
					delete = true;
					}
				else {
					delete = delete(raiz.getIzquierdo(), numero);
				}	
			}
			else if((raiz.getInfo() < numero) && (raiz.getDerecho()!=null)){
				if(raiz.getDerecho().getInfo() == numero) {
					raiz.setDerecho(realizarCorrimientos(raiz.getDerecho(), numero));
					delete=true;
					}
				else {
					delete = delete(raiz.getDerecho(), numero);
				}
			}
		}
		return delete;
	}
	
	private Node realizarCorrimientos(Node raiz, int numero) {
		 
		Node auxRaiz = raiz; 
		 
		if ((raiz.getDerecho() == null) && (raiz.getIzquierdo() == null)) {
			raiz = null; 
		} 
		else if ((raiz.getDerecho() != null) && (raiz.getIzquierdo() == null)) {
			raiz = raiz.getDerecho();
		} 
		else if ((raiz.getDerecho() == null) && (raiz.getIzquierdo() != null)) {
			raiz = raiz.getIzquierdo();
		} 
		else {
			if (raiz.getDerecho().getIzquierdo() == null) {
				raiz = raiz.getIzquierdo();
				raiz.setDerecho(auxRaiz.getDerecho());
			} 
			else {
				Node auxPadre = buscarNMI(raiz.getDerecho());
				Node auxRaizIzq = raiz.getIzquierdo();
				if (auxPadre.getIzquierdo() == null) {
					raiz = auxPadre;
					raiz.setDerecho(raiz.getDerecho());  
					raiz.setIzquierdo(auxRaizIzq);
				} else {
					raiz = auxPadre.getIzquierdo();
					auxPadre.setIzquierdo(/*auxPadre.getDerecho()*/null);
					raiz.setDerecho(auxPadre);
					raiz.setIzquierdo(auxRaizIzq);
				}
			}
		}
		return raiz;
	}
	
	public Node buscarNMI(Node aux) {
		if(aux.getIzquierdo()==null) {
			return aux;
		}else if((aux.getIzquierdo().getIzquierdo()==null)){
			return aux;
		}else {
			return buscarNMI(aux.getIzquierdo());
		} 
			
	}
	
	public int getHeight() {
		int altura = 0;
		return altura;
	}
	
	public void printPosOrder() {
		printPosOrder(this.root);
	}
	
	private void printPosOrder(Node root2) {
		if(root2 != null) {
			printPosOrder(root2.getIzquierdo());
			printPosOrder(root2.getDerecho());
			System.out.print(root2.getInfo() + " ");
		}
		else {
			System.out.print("- ");
		}
	}

	public void printPreOrder() {
		printPreOrder(this.root);
	}
	
	private void printPreOrder(Node root2) {
		if(root2 != null) {
			System.out.print(root2.getInfo() + " ");
			printPreOrder(root2.getIzquierdo());
			printPreOrder(root2.getDerecho());
		}
		else {
			System.out.print("- ");
		}
	}  

	public void printInOrder() {
		printInOrder(this.root);
	} 
	
	private void printInOrder(Node root2) {
		if(root2 != null) {
			printPreOrder(root2.getIzquierdo());
			System.out.print(root2.getInfo() + " ");
			printPreOrder(root2.getDerecho());
		}
		else {
			System.out.print("- ");
		}
	}

	public ArrayList getLongestBranch() {
		ArrayList lista = new ArrayList();
		return lista; 
	}
	
	public ArrayList getFrontera() {
		ArrayList lista = new ArrayList();
		return lista; 
	}
	
	public Object getMaxElement() {
		Object o = new Object();
		return o;
	}
	
	public ArrayList getElementAtLevel(int level) {
		ArrayList lista = new ArrayList();
		return lista; 
	}
	
	
	public int size () { 
		return size;
	}
	
}
