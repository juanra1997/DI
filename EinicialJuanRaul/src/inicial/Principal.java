package inicial;


import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		mostrar();
	}
	
	public static void mostrar() {
		
		Ventana miVentana=new Ventana();
		miVentana.setVisible(true);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
