package graficos;

import javax.swing.JFrame;

public class CreandoMarcos2 {

	public static void main(String[] args) {

		/*mostrar();
	}
	
	public static void mostrar() {*/
		 
		MiMarco2 marco1=new MiMarco2();
		marco1.setLocationRelativeTo(null);
		
	}
}

class MiMarco2 extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public MiMarco2() {
		
		iniciar();
	}
	
	public void iniciar() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocationRelativeTo(null);
		setTitle("La segunda");
		setSize(400,200);
	}
}

