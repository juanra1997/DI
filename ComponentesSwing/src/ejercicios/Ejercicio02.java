package ejercicios;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Ejercicio02 {

	public static void main(String[] args) {

		Ventana02 miVentana=new Ventana02();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setSize(1000, 400);
        miVentana.setLocationRelativeTo(null);
        miVentana.setResizable(false);
        miVentana.setVisible(true);
	}

}

class Ventana02 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	JRadioButton pequenno, mediano, grande, muygrande;
	ButtonGroup bgGrupo;
	JLabel titulo;
	
	public Ventana02() {
		
		setLayout(null);
		
		titulo=new JLabel();
		titulo.setText("En un lugar de la mancha de cuyo nombre no quiero acordarme");
		titulo.setFont(new Font("Arial", Font.PLAIN, 20));
		titulo.setBounds(10, 10, 1000, 40);
		add(titulo, BorderLayout.LINE_START);
		
		pequenno=new JRadioButton();
		
		pequenno.setText("Pequeño");
		pequenno.setBounds(300, 140, 100, 23);
		pequenno.addActionListener(this);
		add(pequenno);
		
		mediano=new JRadioButton();
		
		mediano.setText("Mediano");
		mediano.setBounds(300, 160, 100, 23);
		mediano.setSelected(true);
		mediano.addActionListener(this);
		add(mediano);
		
		grande=new JRadioButton();
		
		grande.setText("Grande");
		grande.setBounds(300, 180, 100, 23);
		grande.addActionListener(this);
		add(grande);
		
		muygrande=new JRadioButton();
		
		muygrande.setText("Muy grande");
		muygrande.setBounds(300, 200, 100, 23);
		muygrande.addActionListener(this);
		add(muygrande);
		
		bgGrupo=new ButtonGroup();
		
		bgGrupo.add(pequenno);
		bgGrupo.add(mediano);
		bgGrupo.add(grande);
		bgGrupo.add(muygrande);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if(pequenno.isSelected()) {
			titulo.setFont(new Font("Arial", Font.PLAIN, 15));
		}
		
		if(mediano.isSelected()) {
			titulo.setFont(new Font("Arial", Font.PLAIN, 20));
		}
		
		if(grande.isSelected()) {
			titulo.setFont(new Font("Arial", Font.PLAIN, 25));
		}
		
		if(muygrande.isSelected()) {
			titulo.setFont(new Font("Arial", Font.PLAIN, 30));
		}
	}
}