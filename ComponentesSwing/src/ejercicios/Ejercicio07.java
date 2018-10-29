package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;

public class Ejercicio07 {

	public static void main(String[] args) {

		Ventana07 miVentana=new Ventana07();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setSize(400, 400);
        miVentana.setLocationRelativeTo(null);
        miVentana.setResizable(false);
        miVentana.setVisible(true);
        
	}

}

class Ventana07 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JMenuBar miBarra;
	private JMenu archivo, edicion, herramientas,  girar, acerca;
	private JMenuItem nuevo, abrir, guardar, salir, copiar, pegar, vertical, horizontal, itemEmergente1, itemEmergente2, aplicacion;
	private JPopupMenu menuEmergente;
	private JPanel miPanel;
	private JCheckBox check1, check2;
	private JRadioButton radio1, radio2;
	private JLabel menu, larchivo, ledicion, lopciones, lsarchivo, lsedicion, lchb1, lchb2, lrb1, lrb2;
	
	public Ventana07() {
		
		miBarra=new JMenuBar();
		archivo=new JMenu("Archivo");
		edicion=new JMenu("Edicion");
		herramientas=new JMenu("Herramientas");
		acerca=new JMenu("Acerca de...");
		acerca.addActionListener(this);
		
		nuevo=new JMenuItem("Nuevo");
		nuevo.addActionListener(this);
		abrir=new JMenuItem("Abrir");
		abrir.addActionListener(this);
		guardar=new JMenuItem("Guardar");
		guardar.addActionListener(this);
		salir=new JMenuItem("Salir");
		salir.addActionListener(this);

		copiar=new JMenuItem("Copiar");
		copiar.addActionListener(this);
		pegar=new JMenuItem("Pegar");
		pegar.addActionListener(this);
		girar=new JMenu("Girar");
		vertical=new JMenuItem("Vertical");
		vertical.addActionListener(this);
		horizontal=new JMenuItem("Horizontal");
		horizontal.addActionListener(this);
		
		check1=new JCheckBox("Check 1");
		check1.addActionListener(this);
		check2=new JCheckBox("Check 2");
		check2.addActionListener(this);
		radio1=new JRadioButton("Radio 1");
		radio1.addActionListener(this);
		radio2=new JRadioButton("Radio 2");
		radio2.addActionListener(this);
		
		girar.add(vertical);
		girar.add(horizontal);
		
		aplicacion=new JMenuItem("Aplicacion");
		aplicacion.addActionListener(this);
		
		archivo.add(nuevo);
		
		archivo.addSeparator();
		
		archivo.add(abrir);
		
		archivo.addSeparator();
		
		archivo.add(guardar);
		
		archivo.addSeparator();
		
		archivo.add(salir);
		
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.add(girar);		
		
		herramientas.add(check1);
		herramientas.add(check2);
		
		herramientas.addSeparator();
		
		herramientas.add(radio1);
		herramientas.add(radio2);
		
		acerca.add(aplicacion);
		
		miBarra.add(archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
		miBarra.add(acerca);
		
		setJMenuBar(miBarra);
		
		menuEmergente=new JPopupMenu();
		miPanel=new JPanel();
		miPanel.setLayout(null);
		itemEmergente1=new JMenuItem("Opcion emergente 1");
		itemEmergente1.addActionListener(this);
		itemEmergente2=new JMenuItem("Opcion emergente 2");
		itemEmergente2.addActionListener(this);
		
		menuEmergente.add(itemEmergente1);
		menuEmergente.add(itemEmergente2);
		
		miPanel.setComponentPopupMenu(menuEmergente);
		
		add(miPanel);
		
		//-------------------------------------------------------------------------------------------------
		
		menu=new JLabel("MENU"); 
		
		menu.setBounds(10, 10, 50, 20);
		miPanel.add(menu);
		
		larchivo=new JLabel("Archivo:");
		
		larchivo.setBounds(10, 40, 50, 20);
		miPanel.add(larchivo);
		
		lsarchivo=new JLabel("Selecciona");
		lsarchivo.setBounds(70, 40, 100, 20);
		miPanel.add(lsarchivo);
		
		ledicion=new JLabel("Edicion:");
		
		ledicion.setBounds(10, 70, 50, 20);
		miPanel.add(ledicion);
		
		lsedicion=new JLabel("Selecciona");
		
		lsedicion.setBounds(70, 70, 100, 20);
		miPanel.add(lsedicion);
		
		lopciones=new JLabel("Opciones:");
		
		lopciones.setBounds(10, 100, 80, 20);
		miPanel.add(lopciones);
		
		lchb1=new JLabel("Check 1: False");
		
		lchb1.setBounds(70, 120, 100, 20);
		miPanel.add(lchb1);
		
		lchb2=new JLabel("Check 2: False");
		
		lchb2.setBounds(70, 140, 100, 20);
		miPanel.add(lchb2);
		
		lrb1=new JLabel("Radio 1: False");
		
		lrb1.setBounds(70, 160, 100, 20);
		miPanel.add(lrb1);
		
		lrb2=new JLabel("Radio 2: False");
		
		lrb2.setBounds(70, 180, 100, 20);
		miPanel.add(lrb2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==aplicacion) {
			JOptionPane.showMessageDialog(null, "Esta es una aplicacion simple con el fin de exponer de forma sencilla el funcionamiento basico de los componentes de los menus");
		}
		
		if(e.getSource()==nuevo) {
			lsarchivo.setText("Nuevo");
		}
		
		if(e.getSource()==abrir) {
			lsarchivo.setText("Abrir");
		}
		
		if(e.getSource()==guardar) {
			lsarchivo.setText("Guardar");
		}
		
		if(e.getSource()==salir) {
			lsarchivo.setText("Salir");
		}
		
		if(e.getSource()==copiar) {
			lsedicion.setText("Copiar");
		}
		
		if(e.getSource()==pegar) {
			lsedicion.setText("Pegar");
		}
		
		if(e.getSource()==vertical) {
			lsedicion.setText("Girar/Vertical");
		}
		
		if(e.getSource()==horizontal) {
			lsedicion.setText("Girar/Horizontal");
		}
		
		if(e.getSource()==check1) {
			if(!check1.isSelected()) {
				lchb1.setText("Check 1: False");
			} else {
				lchb1.setText("Check 1: True");
			}
		}
		
		if(e.getSource()==check2) {
			if(!check2.isSelected()) {
				lchb2.setText("Check 2: False");
			} else {
				lchb2.setText("Check 2: True");
			}
		}
		
		if(e.getSource()==radio1) {
			if(!radio1.isSelected()) {
				lrb1.setText("Radio 1: False");
			} else {
				lrb1.setText("Radio 1: True");
			}
		}
		
		if(e.getSource()==radio2) {
			if(!radio2.isSelected()) {
				lrb2.setText("Radio 2: False");
			} else {
				lrb2.setText("Radio 2: True");
			}
		}
		
		if(e.getSource()==itemEmergente1) {
			JOptionPane.showMessageDialog(null, "Presionó la opcion emergente 1");
		}
		
		if(e.getSource()==itemEmergente2) {
			JOptionPane.showMessageDialog(null, "Presionó la opcion emergente 2");
		}
	}
}