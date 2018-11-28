package Examen;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Ventana extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	private JMenuBar miBarra;
	private JMenu archivo, reservas, ayuda;
	private JMenuItem salir, alta, baja, acerca;
	private JButton boton;
	//private MiPanel p;

	public Ventana() {

		setLayout(null);
		
		Toolkit t = Toolkit.getDefaultToolkit();
		setSize(600, 300);
		setIconImage(t.getImage("f1y0bb.png"));
		getContentPane().setBackground(Color.WHITE);

		// Barra------------------------------------------------------------------------------------

		miBarra = new JMenuBar();

		miBarra.setBackground(Color.WHITE);

		archivo = new JMenu("Archivo");
		reservas = new JMenu("Edicion");

		reservas.setMnemonic(KeyEvent.VK_E);

		ayuda = new JMenu("Ayuda");

		salir = new JMenuItem("Salir");

		salir.addActionListener(this);

		alta = new JMenuItem("Alta");

		alta.addActionListener(this);

		baja = new JMenuItem("Baja");

		baja.addActionListener(this);

		acerca = new JMenuItem("Acerca de...");

		acerca.addActionListener(this);

		archivo.add(salir);
		reservas.add(alta);
		reservas.add(baja);
		ayuda.add(acerca);

		miBarra.add(archivo);
		miBarra.add(reservas);
		miBarra.add(ayuda);

		setJMenuBar(miBarra);
		
		boton=new JButton("Abrir");
		
		boton.setBounds(250, 10, 100, 30);
		boton.setBackground(Color.BLACK);
		boton.setForeground(Color.WHITE);
		boton.setFocusPainted(false);
		boton.addActionListener(this);
		add(boton);
		
		

		// ---------------------------------------------------------------------------------------

		/*p = new MiPanel();

		boton = p.getBoton();
		boton.addActionListener(this);

		add(p, BorderLayout.CENTER);*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == salir) {

			System.exit(0);
		}
		if (e.getSource() == baja) {

			JOptionPane.showMessageDialog(null, "La aplicacion no esta desarrollada");
		}
		if (e.getSource() == acerca) {

			JOptionPane.showMessageDialog(null, "Aplicacion creada por Juan Raul Mellado Garcia");
		}
		if (e.getSource() == alta || e.getSource() == boton) {

			Dialogo obj = new Dialogo(this, true);
			obj.setLocationRelativeTo(null);
			obj.setResizable(false);
			obj.setTitle("Alta");
			obj.setVisible(true);
		}
	}
}