package gt.edu.umg.progra3.colas;

import java.util.NoSuchElementException;

public class ColaImplementacion implements Cola {
	private Node inicio = null;
	private Node fin = null;

	@Override
	public void enqueue(String item) {
		// TODO Auto-generated method stub
		Node nuevoNodo = new Node(item, null);
		if (isEmpty()) {
			inicio = nuevoNodo;
		} else {
			fin.siguiente = nuevoNodo;
		}
		fin = nuevoNodo;

	}

	@Override
	public String deque() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new NoSuchElementException("Cannot dequeue from empty Queue");
		}
		String item = inicio.item;
		if (fin == inicio) {
			fin = null;
		}
		inicio = inicio.siguiente;
		return item;

	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		if (inicio == null) {
			throw new NoSuchElementException("Cannot peek from empty Queue");
		}
		return inicio.item;

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		int contador = 0;
		for (Node node = inicio; node != null; node = node.siguiente) {
			contador++;
		}
		return contador;

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return inicio == null;

	}
	
	class Node {
		private String item;
		private Node siguiente;
		public Node(String item, Node siguiente) {
			this.item = item;
			this.siguiente = siguiente;
		}
		
	}

	

}
