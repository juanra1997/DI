package graficos;

import javax.swing.JFrame;

public class CreandoMarcos {

	public static void main(String[] args) {

		MiMarco marco1=new MiMarco();
		marco1.setVisible(true);
		marco1.setSize(400,200);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setLocationRelativeTo(null);
		marco1.setTitle("Mi marco");
		//marco1.setResizable(false);
		//marco1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}

}

class MiMarco extends JFrame{

	private static final long serialVersionUID = 1L;
	
	//Creamos el constructor
	
	public MiMarco() {
		
		//setLocationRelativeTo(null);
		//setBounds(50, 200, 500, 100);
		//setTitle("Mi marco");
		
	}
}