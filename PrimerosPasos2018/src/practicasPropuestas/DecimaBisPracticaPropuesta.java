package practicasPropuestas;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;

//import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DecimaBisPracticaPropuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VentanaP10b miMarco=new VentanaP10b();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("OTRO");
		miMarco.setVisible(true);
	}

}

class VentanaP10b extends JFrame implements FocusListener {

	private static final long serialVersionUID = 1L;
	
	JTextField texto1;
	JPasswordField texto2;

	public VentanaP10b() {
		
		setBounds(300, 300, 500, 350);
		
		setLayout(null);
		
		texto1=new JTextField();
		texto1.setBounds(10, 20, 100, 20);
		texto1.addFocusListener(this);
		add(texto1);
		
		texto2=new JPasswordField();
		texto2.setBounds(10, 50, 100, 20);
		texto2.addFocusListener(this);
		add(texto2);

	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==texto1) {
			JOptionPane.showMessageDialog(null, texto1.getText());
		}
		if(arg0.getSource()==texto2) {
			String pass=new String(texto2.getPassword());
			JOptionPane.showMessageDialog(null, pass);
		}
	}
}