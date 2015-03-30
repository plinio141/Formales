package logic;

import java.util.ArrayList;

public class Lista {
	Nodo inicial;
	ArrayList<Nodo> ultimos;
	ArrayList<Nodo> nodos;
	public  Lista() {
		nodos=new ArrayList<Nodo>();
		ultimos=new ArrayList<Nodo>();
	}
	public void agregarRelacion(Nodo n1, Nodo n2, char l){
		n1.addRelacion(n2,l);
	}
	public void addNodo(Nodo s){
		nodos.add(s);
	}
	public void inicial(Nodo n){
		inicial=n;
	}
	public void addUltimo(Nodo n){
		ultimos.add(n);
	}
	public boolean evaluar(String s){
		Nodo n=inicial;
		char[] c=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			ArrayList<Relacion> r=inicial.relaciones;
			for (int j = 0; j < r.size(); j++) {
				if(r.get(j).l==c[i]){
					n=r.get(j).nodo;
					break;
				}
			}
		}
		return false;
	}
	public Nodo getNodo(String g){
		for (int i = 0; i < nodos.size(); i++) {
			if(nodos.get(i).nombre.equals(g)){
				return nodos.get(i);
			}
		}
		return null;
	}
	public void matrix(){
		for (int i = 0; i < nodos.size(); i++) {
			nodos.get(i).mostrarRelaciones();
		}
	}
}
