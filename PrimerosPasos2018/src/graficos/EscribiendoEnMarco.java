package graficos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EscribiendoEnMarco {

	public static void main(String[] args) {

		//2º Instanciar la ventana
		
		MarcoVentanaTexto miMarco=new MarcoVentanaTexto();
		miMarco.setVisible(true);
		miMarco.setResizable(false);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//miMarco.add(new LaminaTexto());
	}
	
}

	//1º Creamos la ventana
	
class MarcoVentanaTexto extends JFrame {
		
	private static final long serialVersionUID = 1L;
		
	public MarcoVentanaTexto(){
			
		setSize(400,400);
		setLocationRelativeTo(null);
		setTitle("Primer texto en ventana");	
		
		//4º Instanciamos la lamina
		
		LaminaTexto miLamina=new LaminaTexto();
		add(miLamina);
	}
		
}

//3º Creamos una lamina/Panel

class LaminaTexto extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//Utilizamos el constructor por defecto
	//Vamos a sobreescribir el metodo paintComponente para escribir dentro de la lamina/el JPanel
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawString("Estamos aprendiendo a escribir en un panel", 50, 100);
	}
}
