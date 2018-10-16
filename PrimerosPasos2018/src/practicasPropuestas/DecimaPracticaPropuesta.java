package practicasPropuestas;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DecimaPracticaPropuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VentanaP10 miMarco=new VentanaP10();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("Decima practica");
		miMarco.setVisible(true);
	}

}

class VentanaP10 extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	
	JTextField texto1;
	JPasswordField texto2;

	public VentanaP10() {
		
		setBounds(300, 300, 500, 350);
		
		setLayout(null);
		
		texto1=new JTextField();
		texto1.setBounds(10, 20, 100, 20);
		texto1.addKeyListener(this);
		add(texto1);
		
		texto2=new JPasswordField();
		texto2.setBounds(10, 50, 100, 20);
		texto2.addKeyListener(this);
		add(texto2);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==texto1) {
			if(arg0.getKeyCode()==KeyEvent.VK_ENTER) {
				JOptionPane.showMessageDialog(null, texto1.getText());
			}
		}
		if(arg0.getSource()==texto2) {
			if(arg0.getKeyCode()==KeyEvent.VK_ENTER) {
				String pass=new String(texto2.getPassword());
				JOptionPane.showMessageDialog(null, pass);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}