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
	public void mostrarRelaciones(){
		for (int i = 0; i < relaciones.size(); i++) {
			System.out.println(nombre+" "+relaciones.get(i).nodo+"  "+relaciones.get(i).l);
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nombre;
	}
}

