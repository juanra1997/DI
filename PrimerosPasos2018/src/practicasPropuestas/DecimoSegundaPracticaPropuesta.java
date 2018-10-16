package practicasPropuestas;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DecimoSegundaPracticaPropuesta {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VentanaP12 miMarco=new VentanaP12();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("Decima segunda practica");
		miMarco.setVisible(true);
	}

}

class VentanaP12 extends JFrame implements FocusListener, KeyListener{

	private static final long serialVersionUID = 1L;
	
	JTextField texto1, texto2, texto3;

	public VentanaP12() {
		
		setBounds(300, 300, 500, 350);
		
		setLayout(null);
		
		texto1=new JTextField();
		texto1.setBounds(10, 20, 100, 20);
		texto1.addFocusListener(this);
		add(texto1);
		
		texto2=new JTextField();
		texto2.setBounds(10, 50, 100, 20);
		texto2.addFocusListener(this);
		add(texto2);
		
		texto3=new JTextField();
		texto3.setBounds(130, 30, 100, 20);
		texto3.setEditable(false);
		add(texto3);
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		if(!(texto1.getText().isEmpty()||texto2.getText().isEmpty())) {
			try {
				double pr=Double.parseDouble(texto1.getText());
				double se=Double.parseDouble(texto2.getText());
				double sum=pr+se;
				texto3.setText(String.valueOf(sum));
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Entrada no valida");
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==texto1){
            if((e.getKeyChar()<'0'||e.getKeyChar()>'9')&&e.getKeyChar()!='.'){
                e.consume();
            }
        }
		if(e.getSource()==texto2){
            if((e.getKeyChar()<'0'||e.getKeyChar()>'9')&&e.getKeyChar()!='.'){
                e.consume();
            }
        }
	}
}