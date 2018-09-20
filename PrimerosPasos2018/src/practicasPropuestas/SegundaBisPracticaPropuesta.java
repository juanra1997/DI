package practicasPropuestas;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class SegundaBisPracticaPropuesta {

	public static void main(String[] args) {

		VentanaBis obj=new VentanaBis();
		obj.setLocationRelativeTo(null);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class VentanaBis extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public VentanaBis() {
		
		setTitle("SegundaBis Practica Propuesta");
		Toolkit herramientas=Toolkit.getDefaultToolkit();
		setIconImage(herramientas.getImage("marco.jpg"));
		setSize(herramientas.getScreenSize());
	}
}