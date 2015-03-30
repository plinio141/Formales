package test;

import logic.Lista;
import logic.Nodo;

public class Prueba {
	public static void main(String[] args) {
		Lista l=new Lista();
		Nodo g1=new Nodo("g1");
		Nodo g2=new Nodo("g2");
		l.addNodo(g1);
		l.addNodo(g2);
		l.inicial(g1);
		l.addUltimo(g2);
		l.agregarRelacion(g1, g2, 'a');
		l.agregarRelacion(g1, g1, 'b');
		l.agregarRelacion(g2, g1, 'b');
		l.matrix();
		
	}
}
