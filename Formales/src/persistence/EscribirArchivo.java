package persistence;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Queue;

import javax.swing.filechooser.FileNameExtensionFilter;

public class EscribirArchivo {
	
	private PrintWriter pw;
	private FileWriter fw;
	
	public EscribirArchivo() {
		pw = null;
		fw = null;
	}
	/*
	 * con ayuda de colas se escribe el archivo
	 */
	public void escribirArchivo(Queue<String>data,String path){
		
		try {
			fw = new FileWriter(path);
			pw = new PrintWriter(fw);
			while(data.isEmpty() != true){
				pw.print(data.poll());
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		//confirmamos que se cierre el fichero
		finally{
			try {

				if(fw != null)
					fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
					
			}
		}
		
	}
}
