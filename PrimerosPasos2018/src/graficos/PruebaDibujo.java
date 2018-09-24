package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaDibujo {

	public static void main(String[] args) {

		//2º Instanciar la ventana
		
		MarcoVentanaTexto1 miMarco=new MarcoVentanaTexto1();
		miMarco.setVisible(true);
		miMarco.setResizable(false);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//miMarco.add(new LaminaTexto());
	}
	
}

	//1º Creamos la ventana
	
class MarcoVentanaTexto1 extends JFrame {
		
	private static final long serialVersionUID = 1L;
		
	public MarcoVentanaTexto1(){
			
		setSize(405,400);
		setLocationRelativeTo(null);
		setTitle("Primer texto en ventana");	
		
		//4º Instanciamos la lamina
		
		LaminaTexto1 miLamina=new LaminaTexto1();
		add(miLamina);
	}
		
}

//3º Creamos una lamina/Panel

class LaminaTexto1 extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//Utilizamos el constructor por defecto
	//Vamos a sobreescribir el metodo paintComponente para escribir dentro de la lamina/el JPanel
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		/*g.drawString("Estamos aprendiendo a escribir en un panel 1", 50, 100);
		g.drawRect(50, 75, 200, 150);
		g.drawLine(10, 10, 500, 500);
		g.drawArc(50, 100, 200, 75, 120, 150);
		obtenemos un objeto Graphics2D a traves de casting*/
		Graphics2D g2=(Graphics2D)g;
		//No podemos instanciar directamente la clase Rectangle 2D por ser abstracta, por el principio de Liskov instanciamos a traves de una subclase Rectangle2D.Double
		Rectangle2D rectangulo=new Rectangle2D.Double(100, 100, 200, 150);
		//Ahora dibujamos el objeto
		g2.draw(rectangulo);
		//Creamos un objeto elipse2D
		Ellipse2D elipse=new Ellipse2D.Double(10, 10, 100, 100);
		g2.draw(elipse);
		g2.draw(new Ellipse2D.Double(290, 10, 100, 100));
		g.drawArc(150, 145, 100, 100, 195, 150);
	}
}

//Dentro del paquete de practicasPropuestas. Tercera practica propuesta. Crea una ventana, en la cual aparecerá el texto "cabecera" en l aparte superior centrada y el texto "pie" en la parte inferior derecha
