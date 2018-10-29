package ejercicios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ejercicio08 {

	public static void main(String[] args) {

		Ventana08 miVentana=new Ventana08();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setSize(670, 300);
        miVentana.setLocationRelativeTo(null);
        miVentana.setResizable(false);
        miVentana.setVisible(true);
        
	}

}

class Ventana08 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	JTextArea area, area1;
	JButton boton;
	
	public Ventana08() {
		
		setLayout(null);
		
		getContentPane().setBackground(Color.CYAN);
		
		area=new JTextArea();
		
		area.setBounds(20, 20, 250, 200);
		add(area);
		
		area1=new JTextArea();
		
		area1.setBounds(390, 20, 250, 200);
		area1.setEditable(false);
		add(area1);
		
		boton=new JButton("COPIAR>>>");
		
		boton.setBounds(280, 100, 100, 30);
		boton.addActionListener(this);
		add(boton);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		area1.setText(area.getText());
	}
}