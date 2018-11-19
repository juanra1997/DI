package ventanaHotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SegundoPanel extends JPanel implements KeyListener, FocusListener {

	private static final long serialVersionUID = 1L;

	public JLabel nombre, apellido, direccion, telefono, info, importe;
	public JTextField nombret, apellidot, direcciont, telefonot, importet;
	public JButton aceptar, cancelar, imprimir;

	public SegundoPanel() {

		setLayout(null);
		setBackground(Color.CYAN);

		nombre = new JLabel("Nombre:");
		nombret = new JTextField();
		apellido = new JLabel("Apellidos:");
		apellidot = new JTextField();
		direccion = new JLabel("Direccion:");
		direcciont = new JTextField();
		telefono = new JLabel("Telefono:");
		telefonot = new JTextField();
		info = new JLabel("DATOS PERSONALES");
		info.setBounds(50, 10, 300, 100);
		info.setFont(new Font("Algerian", Font.PLAIN, 30));
		add(info);

		nombre.setBounds(35, 130, 50, 20);
		add(nombre);

		nombret.setBounds(100, 130, 170, 20);
		add(nombret);

		apellido.setBounds(35, 180, 70, 20);
		add(apellido);

		apellidot.setBounds(100, 180, 170, 20);
		add(apellidot);

		direccion.setBounds(35, 230, 70, 20);
		add(direccion);

		direcciont.setBounds(100, 230, 170, 20);
		add(direcciont);

		telefono.setBounds(35, 280, 70, 20);
		add(telefono);

		telefonot.setBounds(100, 280, 170, 20);
		telefonot.addKeyListener(this);
		add(telefonot);

		aceptar = new JButton("Aceptar");

		aceptar.setBounds(35, 330, 320, 30);
		add(aceptar);

		cancelar = new JButton("Cancelar");

		cancelar.setBounds(35, 370, 320, 30);
		add(cancelar);

		imprimir = new JButton("Imprimir datos");

		imprimir.setBounds(35, 410, 320, 30);
		add(imprimir);

		importe = new JLabel("Importe:");

		importe.setBounds(100, 520, 110, 20);
		add(importe);

		importet = new JTextField();

		importet.addFocusListener(this);
		importet.setBounds(160, 520, 110, 20);
		add(importet);
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
		if (!Character.isDigit(arg0.getKeyChar())) {
			arg0.consume();
		}
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}
}
