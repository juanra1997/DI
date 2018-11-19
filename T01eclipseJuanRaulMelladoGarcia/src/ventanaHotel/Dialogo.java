package ventanaHotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Dialogo extends JDialog implements FocusListener, ActionListener {

	private static final long serialVersionUID = 1L;

	PanelArriba pa;
	SegundoPanel sp;
	TercerPanel tp;
	Imagen i;
	CuartoPanel cp;
	QuintoPanel qp;
	JTextArea ta1, ta2;
	JTextField cd, importe;
	JCheckBox cb;
	JComboBox<String> tipo;
	JSpinner ch;
	JTabbedPane tpp;
	JPanel panel1, panel2;
	JTextField nombre, apellidos, direccion, telefono, fechae, fechas;
	JButton aceptar, cancelar, imprimir;
	Date fecha, fechass;
	DateFormat dateFormat;
	JTextArea area;

	public Dialogo(Ventana n, boolean m) {

		super(n, m);
		Toolkit t = Toolkit.getDefaultToolkit();
		setSize(t.getScreenSize().width, t.getScreenSize().height);
		setIconImage(t.getImage("diamante.png"));

		setLayout(null);

		getContentPane().setBackground(Color.WHITE);

		pa = new PanelArriba();
		pa.setBounds(0, 0, t.getScreenSize().width, 120);
		add(pa);

		sp = new SegundoPanel();
		sp.setBounds(1015, 120, 400, 650);
		add(sp);

		tp = new TercerPanel();
		tp.setBounds(1415, 120, 500, 650);
		add(tp);

		i = new Imagen();
		i.setBounds(0, 120, 1015, 650);
		add(i);

		tpp = new JTabbedPane();
		panel1 = new JPanel();
		panel1.setLayout(null);
		ta1 = new JTextArea();
		ta1.setLineWrap(true);
		ta1.setBounds(0, 0, 395, 255);
		ta1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel1.add(ta1);
		tpp.addTab("Datos personales", panel1);
		panel2 = new JPanel();
		panel2.setLayout(null);
		ta2 = new JTextArea();
		ta2.setLineWrap(true);
		ta2.setBounds(0, 0, 395, 255);
		ta2.setFont(new Font("Arial", Font.PLAIN, 12));
		panel2.add(ta2);
		tpp.addTab("Datos de habitacion", panel2);
		tpp.setBounds(0, 768, 400, 275);

		add(tpp);

		qp = new QuintoPanel();
		qp.setBounds(400, 768, t.getScreenSize().width - 400, 275);
		add(qp);

		cd = tp.diast;
		importe = sp.importet;
		cb = tp.ninnos;
		tipo = tp.tipo;
		ch = tp.numeroHabitaciones;
		aceptar = sp.aceptar;
		cancelar = sp.cancelar;
		imprimir = sp.imprimir;
		fecha = new Date();
		fechass = new Date();
		dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		nombre = sp.nombret;
		apellidos = sp.apellidot;
		direccion = sp.direcciont;
		telefono = sp.telefonot;
		fechae = tp.tfechaEntrada;
		fechas = tp.tfechaSalida;
		area = tp.area;

		aceptar.addActionListener(this);
		cancelar.addActionListener(this);
		imprimir.addActionListener(this);

		importe.addFocusListener(this);
		importe.setHorizontalAlignment(JTextField.CENTER);
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == importe) {

			int suma = 0;

			if (tipo.getSelectedIndex() == 0) {

				suma = suma + 50;
			} else if (tipo.getSelectedIndex() == 1) {

				suma = suma + 75;
			} else if (tipo.getSelectedIndex() == 2) {

				suma = suma + 125;
			}

			suma = suma * (Integer.parseInt(cd.getText()));

			if (cb.isSelected()) {
				suma = suma + 20;
			}

			suma = suma * Integer.parseInt(String.valueOf(ch.getValue()));

			importe.setText(String.valueOf(suma + "€"));
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == cancelar) {

			String prueba = dateFormat.format(fecha);
			prueba = String.valueOf(Integer.parseInt(prueba.substring(0, 2)) + 1) + "/" + prueba.substring(3, 5) + "/"
					+ prueba.substring(6, 10);

			try {
				fechass = dateFormat.parse(prueba);
			} catch (ParseException pe) {
				// TODO Auto-generated catch block
				pe.printStackTrace();
			}

			nombre.setText("");
			apellidos.setText("");
			direccion.setText("");
			telefono.setText("");
			fechae.setText(dateFormat.format(fecha));
			fechas.setText(dateFormat.format(fechass));
			ch.setValue(1);
			tipo.setSelectedIndex(0);
			/*
			 * fechae.setText(""); fechas.setText(t);
			 */
		}

		if (e.getSource() == aceptar) {

			if (nombre.getText().length() == 0 || apellidos.getText().length() == 0 || direccion.getText().length() == 0
					|| telefono.getText().length() == 0 || fechae.getText().charAt(9) == ' '
					|| fechas.getText().charAt(9) == ' ') {

				JOptionPane.showMessageDialog(null, "Faltan datos por rellenar");
			} else {

				if (cb.isSelected() && area.getText().length() == 0) {

					JOptionPane.showMessageDialog(null, "Faltan datos por rellenar");
				} else {

					JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
					String prueba = dateFormat.format(fecha);
					prueba = String.valueOf(Integer.parseInt(prueba.substring(0, 2)) + 1) + "/" + prueba.substring(3, 5)
							+ "/" + prueba.substring(6, 10);

					try {
						fechass = dateFormat.parse(prueba);
					} catch (ParseException pe) {
						// TODO Auto-generated catch block
						pe.printStackTrace();
					}

					nombre.setText("");
					apellidos.setText("");
					direccion.setText("");
					telefono.setText("");
					fechae.setText(dateFormat.format(fecha));
					fechas.setText(dateFormat.format(fechass));
					ch.setValue(1);
					tipo.setSelectedIndex(0);
				}
			}
		}

		if (e.getSource() == imprimir) {

			ta1.setText("Nombre: " + nombre.getText() + "\nApellidos: " + apellidos.getText() + "\nDireccion: "
					+ direccion.getText() + "\nTelefono: " + telefono.getText());
			if (cb.isSelected()) {
				ta2.setText("Dias de estancia: " + cd.getText() + "\nTipo: " + tipo.getSelectedItem()
						+ "\nNumero de habitaciones: " + ch.getValue() + "\nNiños: Si");
			} else {
				ta2.setText("Dias de estancia: " + cd.getText() + "\nTipo: " + tipo.getSelectedItem()
						+ "\nNumero de habitaciones: " + ch.getValue() + "\nNiños: No");
			}
		}
	}
}
