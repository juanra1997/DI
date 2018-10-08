package eventos;

import java.awt.Color;
import javax.swing.*;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class PruebaFocusListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ventana3 obj=new Ventana3();
		obj.setVisible(true);
	}

}

class Ventana3 extends JFrame {

	private static final long serialVersionUID = 1L;

	public Ventana3() {
		
		setTitle("Eventos ventana");
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new LaminaFoco());
	}
}

class LaminaFoco extends JPanel implements FocusListener {

	private static final long serialVersionUID = 1L;
	
	JLabel etiquetaEmail=new JLabel();
	JLabel etiquetaComprobacion=new JLabel();
	JTextField campoEmail=new JTextField();
	JTextField campoComprobacion=new JTextField();
	
	public LaminaFoco() {
		
		setLayout(null);
		/*JLabel etiquetaEmail=new JLabel();
		JLabel etiquetaComprobacion=new JLabel();
		JTextField campoEmail=new JTextField();
		JTextField campoComprobacion=new JTextField();*/
		campoEmail.setBounds(80, 20, 150, 20);
		campoComprobacion.setBounds(80, 60, 150, 20);
		etiquetaEmail.setText("Email: ");
		etiquetaComprobacion.setText("¿Correcto?");
		etiquetaEmail.setBounds(10, 20, 72, 20);
		etiquetaComprobacion.setBounds(10, 60, 72, 20);
		campoEmail.addFocusListener(this);
		//campoComprobacion.addFocusListener(this);
		add(etiquetaEmail);
		add(etiquetaComprobacion);
		setBackground(Color.WHITE);
		add(campoComprobacion);
		add(campoEmail);
	}

	@Override
	public void focusGained(FocusEvent e) {

		
	}

	@Override
	public void focusLost(FocusEvent e) {
		
		//JOptionPane.showMessageDialog(null, "Has perdido la dignidad");
		String email=campoEmail.getText();
		boolean comprobacion=false;
		for(int i=0; i<email.length();i++) {
			if(email.charAt(i)=='@') {
				comprobacion=true;
			}
		}
		if(comprobacion) {
			campoComprobacion.setText("Email correcto");
		} else {
			campoComprobacion.setText("Email incorrecto");
		}
	}
}