package practicasPropuestas;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class SegundaPracticaPropuesta {

	public static void main(String[] args) {

		Ventana obj=new Ventana();
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Ventana() {
		
		setBounds(200,300,500,300);
		setResizable(false);
		setTitle("Segunda Practica Propuesta");
		Toolkit herramientas=Toolkit.getDefaultToolkit();
		setIconImage(herramientas.getImage("src/practicasPropuestas/insti.jpg"));
	}
}