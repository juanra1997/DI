package ejercicios;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio01 {

	public static void main(String[] args) {

		Ventana01 miVentana=new Ventana01();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setSize(800, 400);
        miVentana.setLocationRelativeTo(null);
        miVentana.setResizable(false);
        miVentana.setTitle("Ejercicio01");
        miVentana.setVisible(true);
	}

}

class Ventana01 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	JCheckBox cursiva;//=new JCheckBox();
	JCheckBox negrita;//=new JCheckBox();
	JLabel titulo;//=new JLabel("En un lugar de la mancha de cuyo nombre no quiero acordarme");
	
	public Ventana01() {
		
		setLayout(null);
		
		titulo=new JLabel();
		titulo.setText("En un lugar de la mancha de cuyo nombre no quiero acordarme");
		titulo.setFont(new Font("Arial", Font.PLAIN, 20));
		titulo.setBounds(110, 10, 800, 30);
		add(titulo);
		
		cursiva=new JCheckBox();
		cursiva.setBounds(300, 300, 80, 20);
		cursiva.setText("Cursiva");
		cursiva.addActionListener(this);
		add(cursiva);
		
		
		negrita=new JCheckBox();
		negrita.setBounds(400, 300, 80, 20);
		negrita.setText("Negrita");
		negrita.addActionListener(this);
		add(negrita);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if(negrita.isSelected()&&cursiva.isSelected()) {
			
			titulo.setFont(new Font("Arial", Font.BOLD|Font.ITALIC, 20));
		}
		
		if(negrita.isSelected()&&!cursiva.isSelected()) {
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
		}
		
		if(!negrita.isSelected()&&cursiva.isSelected()) {
			
			titulo.setFont(new Font("Arial", Font.ITALIC, 20));
		}
		
		if(!negrita.isSelected()&&!cursiva.isSelected()) {
			
			titulo.setFont(new Font("Arial", Font.PLAIN, 20));
		}
	}
}