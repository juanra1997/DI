package practicasPropuestas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.FocusEvent;
//import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;

public class DecimoPrimeraPracticaPropuesta {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VentanaP11 miMarco=new VentanaP11();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("Decimo primera practica");
		miMarco.setVisible(true);
	}

}

class VentanaP11 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JButton boton1, boton2;

	public VentanaP11() {
		
		boton1=new JButton("Curso de Java Inicial");
		boton2=new JButton("Curso de Java Avanzado");
		
		setBounds(300, 300, 500, 350);
		
		setLayout(null);
		
		boton1.setBounds(10, 20, 200, 20);
		ActionListener Boton1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setTitle("Curso de Java Inicial");
			}
		};
		boton1.addActionListener(Boton1);
		add(boton1);
		
		boton2.setBounds(10, 50, 200, 20);
		ActionListener Boton2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setTitle("Curso de Java Avanzado");
			}
		};
		boton2.addActionListener(Boton2);
		add(boton2);

	}
}
