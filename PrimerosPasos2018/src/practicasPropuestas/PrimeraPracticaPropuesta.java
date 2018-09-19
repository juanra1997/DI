package practicasPropuestas;

import javax.swing.JFrame;

public class PrimeraPracticaPropuesta {

	public static void main(String[] args) {

		MiMarco marco=new MiMarco();
		marco.setLocation(200,300);
		
	}
}

class MiMarco extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public MiMarco() {
		
		iniciar();
	}
	
	public void iniciar() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Primera Practica Propuesta");
		setSize(500,300);
	}
}

