package ventanaHotel;

import java.awt.BorderLayout;
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

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JMenuBar miBarra;
	private JMenu archivo, reservas, ayuda;
	private JMenuItem salir, alta, baja, acerca;
	private JButton boton;
	private MiPanel p;

	public Ventana() {

		Toolkit t = Toolkit.getDefaultToolkit();
		setSize((t.getScreenSize().width / 2), (t.getScreenSize().height / 2));
		setIconImage(t.getImage("diamante.png"));

		// Barra------------------------------------------------------------------------------------

		miBarra = new JMenuBar();

		miBarra.setBackground(Color.WHITE);

		archivo = new JMenu("Archivo");
		reservas = new JMenu("Reservas");

		reservas.setMnemonic(KeyEvent.VK_R);

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

		// ---------------------------------------------------------------------------------------

		p = new MiPanel();

		boton = p.getBoton();
		boton.addActionListener(this);

		add(p, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

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
			obj.setTitle("Alta reservas");
			obj.setVisible(true);
		}
	}
}
