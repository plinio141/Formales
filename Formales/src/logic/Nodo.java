package logic;

import java.util.ArrayList;

public class Nodo {
	String nombre;
	ArrayList<Relacion> relaciones;

	public Nodo(String n) {
		nombre=n;
		relaciones=new ArrayList<Relacion>();
	}
	public void addRelacion(Nodo e, char l){
		relaciones.add(new Relacion(e, l));
	}
}

