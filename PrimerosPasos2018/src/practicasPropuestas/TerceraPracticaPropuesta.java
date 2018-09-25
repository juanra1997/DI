package practicasPropuestas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TerceraPracticaPropuesta extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		TerceraPracticaPropuesta miVentana=new TerceraPracticaPropuesta();
	}

	public TerceraPracticaPropuesta() {
		
		JLabel sup=new JLabel("Cabecera");
		JLabel inf=new JLabel("Pie       ");
		
		sup.setHorizontalAlignment(JLabel.CENTER);
		inf.setHorizontalAlignment(JLabel.RIGHT);
		
		add(sup, BorderLayout.PAGE_START);
		add(inf, BorderLayout.PAGE_END);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Primera Practica Propuesta");
		setSize(500,300);
		setLocationRelativeTo(null);
	}
}
//Dentro del paquete de practicasPropuestas.
//Tercera practica propuesta.
//Crea una ventana, en la cual aparecerá el texto "cabecera" en la parte superior centrada y
//el texto "pie" en la parte inferior derecha
