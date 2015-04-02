package gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame{
	/* 
	 * barra de men�
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
	private JMenuItem exit;
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
	 * m�todo donde se inicia todos los atributos
	 */
	public void init (){
		
		this.menu = new JMenuBar();
		this.file = new JMenu("Archivo");
		this.newA = new JMenu("Nuevo Automata");
		this.automata = new JMenu("Automata");
		this.ejecutar = new JMenu("Ejecutar");
		
		
		this.open = new JMenuItem("Abrir");
		this.save = new JMenuItem("Guardar");
		this.exit = new JMenuItem("Exit");
		
		this.matriz = new JMenuItem("Matriz de transici�n");
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
	

}
