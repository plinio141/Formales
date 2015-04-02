package gui;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 * Esta clase es la ventana principal donde contiene todo acerca del automata
 * @author Tatiz
 *
 */
public class VentanaPrincipal extends JFrame implements ActionListener,   KeyListener {
	/* 
	 * barra de menú
	 */
	private JMenuBar menu;
	/*
	 * Menu opciones
	 */
	private JMenu file;
	/*
	 * item que permite abrir archivo
	 */
	private JMenu automata;
	/*
	 * crear un AFD, AFND
	 */
	private JMenu newA;
	/*
	 * ejecutar el automata
	 */
	private JMenu ejecutar;
	/*
	 * item que permite abrir un automata
	 */
	private JMenuItem open;
	/*
	 * item que permite guardar archivo
	 */
	private JMenuItem save;
	/*
	 * permite mostrar la matriz de transicion
	 */
	private JMenuItem matriz;
	/*
	 * permite mostrar los estados del automata
	 */
	private JMenuItem estados;
	/*
	 * perimite ver el estado inicial del automata
	 */
	private JMenuItem estado_inicial;
	/*
	 * permite el estado final del automata
	 */
	private JMenuItem estado_final;
	/*
	 * permite ver el lenguaje del automata
	 */
	private JMenuItem lenguaje;
	/*
	 * item cerrar
	 */
	private JMenuItem exit;
	/*
	 * ingresar la cadena para realizar la prueba
	 */
	private JMenuItem ingresarCadena;
	
	/*
	 * Constructor
	 */
	public VentanaPrincipal() {
		
		
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		init();
		setJMenuBar(menu);
	}
	/*
	 * método donde se inicia todos los atributos
	 */
	public void init (){
		
		this.menu = new JMenuBar();
		this.file = new JMenu("Archivo");
		this.newA = new JMenu("Nuevo Automata");
		this.automata = new JMenu("Automata");
		this.ejecutar = new JMenu("Ejecutar");
		
		
		this.open = new JMenuItem("Abrir");
		this.open.addActionListener(this);
		this.open.setActionCommand("ABRIR");
		
		this.save = new JMenuItem("Guardar");
		this.save.addActionListener(this);
		this.save.setActionCommand("GUARDAR");
		
		this.exit = new JMenuItem("Exit");
		
		this.matriz = new JMenuItem("Matriz de transición");
		this.estados = new JMenuItem("Estados");
		this.estado_inicial = new JMenuItem("Estado inicial");
		this.estado_final = new JMenuItem("Estado Final");
		this.lenguaje = new JMenuItem("Lenguaje");
		this.ingresarCadena = new JMenuItem("Ingresar la Cadena");

		

		add(menu);
		menu.add(file);
		menu.add(automata);
		menu.add(ejecutar);
		menu.add(newA);
		
		file.add(open);
		file.add(save);
		file.add(exit);
		
		automata.add(estados);
		automata.add(estado_inicial);
		automata.add(estado_final);
		automata.add(lenguaje);
		automata.add(matriz);
		
		ejecutar.add(ingresarCadena);
		}
	/*
	 * método para guardar el automata con extension tdp
	 */
	public void guardar(){
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("TDP", "tdp");
		chooser.setFileSelectionMode(chooser.DIRECTORIES_ONLY);
		int returnVal = chooser.showSaveDialog(getParent());

		if(returnVal == JFileChooser.APPROVE_OPTION ) {
			String path =chooser.getSelectedFile().getPath();
			automtata___.saveFile(path);
		}
		
	}
	/*
	 * método para abrir un automata
	 */
	public String abrir(){
		JFileChooser chooser = new JFileChooser();
		chooser.getSelectedFile();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("TDP", "tdp");
		chooser.setFileFilter(filter);
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int returnVal = chooser.showOpenDialog(getParent());

		if(returnVal == JFileChooser.APPROVE_OPTION ) {
			try{
				String path =chooser.getSelectedFile().getPath();
				automata----.loadFile(path);
				return path;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "El archivo no cumple con el formato o hay ficheros que no existen", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
		return "";
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equalsIgnoreCase("ABRIR")){
			try{
				String path = abrir();
			}
				catch (Exception e) {
					e.printStackTrace();
				}
		}
		if(arg0.getActionCommand().equalsIgnoreCase("GUARDAR")){
			guardar();
			
		}
		
	}

}
