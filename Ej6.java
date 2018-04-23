package Ej6;

public class Ej6 {

	public static void main(String[] args) {
		ArbolBinario abb = new ArbolBinario(null);
		
//		abb.insert(4);
//		abb.insert(2);
//		abb.insert(1);
//		abb.insert(3);
//		abb.insert(6);
//		abb.insert(5);
//		abb.insert(7);
		
		//2DO ARBOL
//		abb.insert(15);
//		abb.insert(20);
//		abb.insert(9);
//		abb.insert(31);
//		abb.insert(3);
//		abb.insert(27);
//		abb.insert(12);
//		abb.insert(33);
		//FIN 2DO ARBOL
		
		//3ER ARBOL
		abb.insert(5);
		abb.insert(2);
		abb.insert(12);
		abb.insert(1);
		abb.insert(3); 
		abb.insert(9);
		abb.insert(21);
		abb.insert(19);
		abb.insert(25); 
		//FIN 3ER ARBOL
		abb.printPreOrder();
		System.out.println();
		 
//		abb.delete(12);
//		abb.delete(21);
//		abb.delete(19);
//		abb.delete(9);
//		abb.delete(5);
//		abb.delete(2);
//		abb.delete(25);
//		abb.printPreOrder();
		System.out.println(abb.hasElement(111));
	}

}
