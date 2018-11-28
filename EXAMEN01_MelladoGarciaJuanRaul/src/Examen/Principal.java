package Examen;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {

		Ventana obj = new Ventana();
		obj.setLocationRelativeTo(null);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setResizable(false);
		obj.setTitle("Gestión concesionario");
		obj.setVisible(true);
	}
}
