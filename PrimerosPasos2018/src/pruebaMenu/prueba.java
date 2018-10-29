package pruebaMenu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class prueba extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuBar miBarra;
	private JMenu archivo, edicion, herramientas, opciones;
	private JMenuItem guardar, guardarComo, cortar, copiar, pegar, opcion1, opcion2, generales, itemEmergente1,
			itemEmergente2;
	private JPopupMenu menuEmergente;
	private JPanel miPanel;

	public prueba() {
		iniciarComponentes();
		// Asigna un titulo a la barra de titulo
		setTitle("Menus y Menus Emergentes");
		// tamaño de la ventana
		setSize(400, 300);
		// pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
		/* impide que la ventana cambie de tamaño */
		setResizable(false);
	}

	private void iniciarComponentes() {
		// lo más habitual es colocarla en la parte superior
		// creamos la barra en sí
		miBarra = new JMenuBar();
		// Creamos las opciones de la barra
		archivo = new JMenu("Archivo");
		edicion = new JMenu("Edicion");
		herramientas = new JMenu("Herramientas");
		opciones = new JMenu("Opciones");
		// la opciones de las fichas
		guardar = new JMenuItem("Guardar");
		guardarComo = new JMenuItem("Guardar Como");
		cortar = new JMenuItem("Cortar");
		copiar = new JMenuItem("Copiar");
		pegar = new JMenuItem("Pegar");
		opcion1 = new JMenuItem("Opcion1");
		opcion2 = new JMenuItem("Opcion2");
		generales = new JMenuItem("Generales");
		// agregamos las opciones al menu
		archivo.add(guardar);
		archivo.add(guardarComo);
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		// incluimos un separador
		edicion.addSeparator();
		herramientas.add(generales);
		opciones.add(opcion1);
		opciones.add(opcion2);
		// especificamos que opciones no cuelga de la barra general si no de edición
		edicion.add(opciones);
		miBarra.add(archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
		// añadimos la barra a la ventana
		setJMenuBar(miBarra);
		// las opciones del menu emergente
		miPanel = new JPanel();
		miPanel.setLayout(null);
		itemEmergente1 = new JMenuItem("Opcion Emergente 1");
		itemEmergente2 = new JMenuItem("Opcion Emergente 2");
		menuEmergente = new JPopupMenu();
		// añadimos las opciones al menu emergente
		menuEmergente.add(itemEmergente1);
		menuEmergente.add(itemEmergente2);
		// añadimos el menú emergente al panel
		miPanel.setComponentPopupMenu(menuEmergente);
		// añadimos el panel
		add(miPanel);
	}
}
