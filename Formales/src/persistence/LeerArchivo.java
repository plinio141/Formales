package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Esta clase permite leer automatas que se encuentran guardados
 * @author Tatiz
 *
 */
public class LeerArchivo {
	/*
	 *atributo Cola 
	 */
	private Queue<String> data;
	


	public LeerArchivo(String path){
		setData(new LinkedList<String>());
		leerArchivo(path);
	}
	/*
	 * método para leer un archivo tomando ayuda de colas
	 */
	public Queue<String> leerArchivo(String path){
		try {
			String line;
			File file = new File(path);
			FileReader fr= new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			/*
			 * lee una linea del archivo
			 */
			while((line = br.readLine()) != null){
				data.add(line);
				fr.close();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		return data;
	}
	
	
	
	public Queue<String> getData() {
		return data;
	}

	public void setData(Queue<String> data) {
		this.data = data;
	}
}
