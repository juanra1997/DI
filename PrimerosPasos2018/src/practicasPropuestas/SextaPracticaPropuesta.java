package practicasPropuestas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SextaPracticaPropuesta {

	public static void main(String[] args) {

		miVentana ventana=new miVentana();
		ventana.setVisible(true);
	}

}

class miVentana extends JFrame implements ActionListener {

	JButton saludar=new JButton("SALUDAR");
	JButton despedir=new JButton("DESPEDIR");
	
	private static final long serialVersionUID = 1L;

	public miVentana() {
		
		iniciar();
	}
	
	public void iniciar() {
		
		//Ventana
		
		setLayout(null);
		setSize(457, 280);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setResizable(false);
		setTitle("SALUDOS");
		getContentPane().setBackground(Color.WHITE);
		
		//JButton saludar=new JButton("SALUDAR");
		
		saludar.setBounds(10, 20, 200, 200);
		saludar.addActionListener(this);
		saludar.setBackground(Color.BLACK);
		saludar.setForeground(Color.WHITE);
		add(saludar);
		
		//JButton despedir=new JButton("DESPEDIR");
		
		despedir.setBounds(240, 20, 200, 200);
		despedir.addActionListener(this);
		despedir.setBackground(Color.BLACK);
		despedir.setForeground(Color.WHITE);
		add(despedir);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==saludar) {
			JOptionPane.showMessageDialog(null, "¡HOLA!");
		}
		
		if(e.getSource()==despedir) {
			JOptionPane.showMessageDialog(null, "¡ADIOS!");
		}
	}
}