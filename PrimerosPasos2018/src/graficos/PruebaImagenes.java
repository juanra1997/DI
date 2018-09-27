package graficos;

//import java.awt.Color;
//import java.awt.Font;
import java.awt.Graphics;
//import java.awt.Graphics2D;
import java.awt.Image;
//import java.awt.SystemColor;
//import java.awt.SystemColor;
//import java.awt.geom.Ellipse2D;
//import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PruebaImagenes {

	public static void main(String[] args) {

		//2º Instanciar la ventana
		
		LaminaImagenes miMarco=new LaminaImagenes();
		miMarco.setVisible(true);
		miMarco.setResizable(false);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//miMarco.add(new LaminaTexto());
	}
	
}

	//1º Creamos la ventana
	
class LaminaImagenes extends JFrame {
		
	private static final long serialVersionUID = 1L;
		
	public LaminaImagenes(){
			
		setSize(1286,835);
		setLocationRelativeTo(null);
		setTitle("Primer texto en ventana");	
		
		//4º Instanciamos la lamina
		
		LaminaTexto4 miLamina=new LaminaTexto4();
		add(miLamina);
	}
		
}

//3º Creamos una lamina/Panel

class LaminaTexto4 extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//Utilizamos el constructor por defecto
	//Vamos a sobreescribir el metodo paintComponente para escribir dentro de la lamina/el JPanel
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		/*g.drawString("Empezamos la fuente", 50, 50);
		Graphics2D g2=(Graphics2D)g;
		Font miFuente1=new Font("Arial", Font.ITALIC, 20);
		g2.setFont(miFuente1);
		g2.setColor(Color.BLUE);
		g2.drawString("Modificando el tipo de letra", 50, 100);
		g2.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 26));
		g2.setColor(Color.GREEN);
		g2.drawString("Modificando el tipo de letra 2", 50, 150);*/
		File fichero=new File("C:\\Users\\Juanra\\Pictures\\170638retocada.jpg");
		try {
			Image miImagen=ImageIO.read(fichero);
			g.drawImage(miImagen, 0, 0, null);
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "La imagen no se encuentra");
		}
	}
}


/*Práctica propuesta 4:
 * Dentro del paquete de practicasPropuestas
 * CuartaPracticaPropuesta.java
 * Crea una ventana, en la que se muestre un cartel de prohibido utilizar móviles en clase. Crea el texto con un tipo
 * de letra grande, visible y en un color destacado, crea un objeto tipo rectángulo y táchalo con una línea.
 * comenta los métodos utilizados*/
