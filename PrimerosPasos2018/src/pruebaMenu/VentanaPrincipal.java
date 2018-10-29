package pruebaMenu;

import java.awt.Color;

//import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JMenuBar miBarra;
	private JMenu archivo, edicion, herramientas,  opciones;
	private JMenuItem guardar, guardarComo, copiar, cortar, pegar, opcion1, opcion2, itemEmergente1, itemEmergente2;
	private JPopupMenu menuEmergente;
	private JPanel miPanel;

	public VentanaPrincipal() {
		
		setTitle("Menus y Menus Emergentes");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		
		miBarra=new JMenuBar();
		archivo=new JMenu("Archivo");
		edicion=new JMenu("Edicion");
		herramientas=new JMenu("Herramientas");
		
		guardar=new JMenuItem("Guardar");
		guardarComo=new JMenuItem("Guardar como");
		copiar=new JMenuItem("Copiar");
		cortar=new JMenuItem("Cortar");
		pegar=new JMenuItem("Pegar");
		opcion1=new JMenuItem("Opcion1");
		opcion2=new JMenuItem("Opcion2");
		opciones=new JMenu("Opciones");
		
		archivo.add(guardar);
		archivo.add(guardarComo);
		
		edicion.add(copiar);
		edicion.add(cortar);
		edicion.add(pegar);
		
		edicion.addSeparator();
		
		edicion.add(opciones);
		
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		
		
		//añadimos los menus a la barra
		
		miBarra.add(archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
		
		//add(miBarra, BorderLayout.PAGE_START);
		
		setJMenuBar(miBarra);
		
		//Creamos el menu emergente
		menuEmergente=new JPopupMenu();
		miPanel=new JPanel();
		miPanel.setLayout(null);
		itemEmergente1=new JMenuItem("Item 1");
		itemEmergente2=new JMenuItem("Item 2");
		
		menuEmergente.add(itemEmergente1);
		menuEmergente.add(itemEmergente2);
		
		//miPanel.setBackground(Color.BLACK);
		
		miPanel.setComponentPopupMenu(menuEmergente);
		
		add(miPanel);
	}
	
}
