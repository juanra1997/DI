package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Ejercicio06 {

	public static void main(String[] args) {

		Ventana06 miVentana=new Ventana06();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setSize(500, 400);
        miVentana.setLocationRelativeTo(null);
        miVentana.setResizable(false);
        miVentana.setTitle("Ejercicio06");
        miVentana.setVisible(true);
        
	}

}

class Ventana06 extends JFrame implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	
	JLabel usuario, contrasenna, telefono, alta, nyl, digitos;
	JPasswordField tcontrasenna;
	JFormattedTextField ttelefono, talta;
	JTextField tusuario;
	JTextArea area;
	JButton boton;
	MaskFormatter musuario, mtelefono, malta;
	Date fecha;
	DateFormat dateFormat;
	
	public Ventana06() {
		
		setLayout(null);
		
		fecha=new Date();
		
		usuario=new JLabel("Usuario:");
		
		usuario.setBounds(20, 10, 100, 20);
		add(usuario);
		
		contrasenna=new JLabel("Contraseña:");
		
		contrasenna.setBounds(20, 40, 100, 20);
		add(contrasenna);
		
		telefono=new JLabel("Telefono:");
		
		telefono.setBounds(20, 70, 100, 20);
		add(telefono);
		
		alta=new JLabel("Fecha de alta:");
		
		alta.setBounds(20, 100, 100, 20);
		add(alta);
		
		nyl=new JLabel("Máximo 6 alfanuméricos");
		
		nyl.setBounds(320, 10, 140, 20);
		add(nyl);
		
		digitos=new JLabel("Nueve digitos");

		digitos.setBounds(320, 70, 140, 20);
		add(digitos);
		
		tusuario=new JTextField();
		
		tusuario.addKeyListener(this);
		tusuario.setBounds(120, 10, 150, 20);
		add(tusuario);
		
		tcontrasenna=new JPasswordField();
		
		tcontrasenna.setBounds(120, 40, 150, 20);
		add(tcontrasenna);
		
		try {
			mtelefono=new MaskFormatter("#########");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ttelefono=new JFormattedTextField(mtelefono);
		
		ttelefono.setBounds(120, 70, 150, 20);
		add(ttelefono);
		
		try {
			malta=new MaskFormatter("##/##/####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		talta=new JFormattedTextField(malta);		
		dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		
		talta.setText(dateFormat.format(fecha));
		talta.setBounds(120, 100, 150, 20);
		add(talta);
		
		
		area=new JTextArea();
		
		area.setBounds(20, 130, 250, 200);
		add(area);
		
		
		boton=new JButton("Enviar datos");
		
		boton.setBounds(320, 300, 150, 25);
		boton.addActionListener(this);
		add(boton);
		
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		/*JTextField tcontrasenna;
	JFormattedTextField tusuario, ttelefono, talta;*/
		if(tcontrasenna.getPassword().length>0&&!tusuario.getText().isEmpty()&&!ttelefono.getText().isEmpty()&&Character.isDigit(talta.getText().charAt(9))) {
			
			area.setText("Usuario="+tusuario.getText()+"\nContraseña encriptada="+tcontrasenna.getPassword()+"\nTelefono="+contrasenna.getText()+"\nFecha de alta="+talta.getText());
			
		} else {
			JOptionPane.showMessageDialog(null, "Rellena todos los campos");
		}
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
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(tusuario.getText().length()>5||(!Character.isLetter(e.getKeyChar())&&!Character.isDigit(e.getKeyChar()))) {
			
			e.consume();
		}
	}
}