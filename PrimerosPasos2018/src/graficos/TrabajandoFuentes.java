package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
//import java.awt.SystemColor;
//import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoFuentes {

	public static void main(String[] args) {

		//2� Instanciar la ventana
		
		LaminaFuente miMarco=new LaminaFuente();
		miMarco.setVisible(true);
		miMarco.setResizable(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//miMarco.add(new LaminaTexto());
	}
	
}

	//1� Creamos la ventana
	
class LaminaFuente extends JFrame {
		
	private static final long serialVersionUID = 1L;
		
	public LaminaFuente(){
			
		setSize(405,400);
		setLocationRelativeTo(null);
		setTitle("Primer texto en ventana");	
		
		//4� Instanciamos la lamina
		
		LaminaTexto3 miLamina=new LaminaTexto3();
		add(miLamina);
	}
		
}

//3� Creamos una lamina/Panel

class LaminaTexto3 extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//Utilizamos el constructor por defecto
	//Vamos a sobreescribir el metodo paintComponente para escribir dentro de la lamina/el JPanel
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawString("Empezamos la fuente", 50, 50);
		Graphics2D g2=(Graphics2D)g;
		Font miFuente1=new Font("Arial", Font.ITALIC, 20);
		g2.setFont(miFuente1);
		g2.setColor(Color.BLUE);
		g2.drawString("Modificando el tipo de letra", 50, 100);
		g2.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 26));
		g2.setColor(Color.GREEN);
		g2.drawString("Modificando el tipo de letra 2", 50, 150);
	}
}


/*Pr�ctica propuesta 4:
 * Dentro del paquete de practicasPropuestas
 * CuartaPracticaPropuesta.java
 * Crea una ventana, en la que se muestre un cartel de prohibido utilizar m�viles en clase. Crea el texto con un tipo
 * de letra grande, visible y en un color destacado, crea un objeto tipo rect�ngulo y t�chalo con una l�nea.
 * comenta los m�todos utilizados*/
