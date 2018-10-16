package practicasPropuestas;

//import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.FocusEvent;
//import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class DecimoTerceraPracticaPropuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VentanaP13 miMarco=new VentanaP13();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("Decima segunda practica");
		miMarco.setVisible(true);
	}

}

class VentanaPa13 extends JPanel implements ActionListener, KeyListener{

private static final long serialVersionUID = 1L;
	
	JTextField texto1, texto2, texto3;
	JButton suma;

	public VentanaPa13() {
		
		//setBounds(300, 300, 500, 350);
		
		setLayout(null);
		
		texto1=new JTextField();
		texto1.setBounds(10, 20, 100, 20);
		texto1.addKeyListener(this);
		add(texto1);
		
		texto2=new JTextField();
		texto2.setBounds(10, 50, 100, 20);
		texto2.addKeyListener(this);
		add(texto2);
		
		texto3=new JTextField();
		texto3.setBounds(130, 30, 100, 20);
		texto3.setEditable(false);
		add(texto3);
		
		Sumar sum=new Sumar();
		
		suma=new JButton(sum);
		
		suma.setBounds(10, 90, 150, 60);
		suma.addActionListener(this);
		suma.setText("Sumar");
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		KeyStroke sumar=KeyStroke.getKeyStroke("ctrl S");
		
		//Sumar sum=new Sumar();
		
		mapaEntrada.put(sumar, "sumar");
		
		ActionMap mapaAction=getActionMap();
		
		mapaAction.put("fondoAmarillo", sum);
		
		suma.setMnemonic(KeyEvent.VK_S);
		
		suma.setIcon(new MiIcon());
		
		add(suma);
		
		//No funciona con ctrl
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==suma) {
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
		if(e.getSource()==texto1){
            if((e.getKeyChar()<'0'||e.getKeyChar()>'9')&&e.getKeyChar()!='.'){
                e.consume();
            }
        }
	}
	
	private class Sumar extends AbstractAction {
		
		public Sumar() {
			
		}

		private static final long serialVersionUID = 1L;

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
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
}

class VentanaP13 extends JFrame /*implements ActionListener, KeyListener*/{

	private static final long serialVersionUID = 1L;

	public VentanaP13() {
		
		setBounds(300, 300, 500, 350);
		
		add(new VentanaPa13());
	}
}