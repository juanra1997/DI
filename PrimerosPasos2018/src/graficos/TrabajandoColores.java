package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
//import java.awt.SystemColor;
//import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {

		//2º Instanciar la ventana
		
		LaminaFuente miMarco=new LaminaFuente();
		miMarco.setVisible(true);
		miMarco.setResizable(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//miMarco.add(new LaminaTexto());
	}
	
}

	//1º Creamos la ventana
	
class MarcoVentanaTexto2 extends JFrame {
		
	private static final long serialVersionUID = 1L;
		
	public MarcoVentanaTexto2(){
			
		setSize(405,400);
		setLocationRelativeTo(null);
		setTitle("Primer texto en ventana");	
		
		//4º Instanciamos la lamina
		
		LaminaTexto3 miLamina=new LaminaTexto3();
		add(miLamina);
	}
		
}

//3º Creamos una lamina/Panel

class LaminaTexto2 extends JPanel {

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
//		g2.draw(rectangulo);
		//Creamos un objeto elipse2D
//		Ellipse2D elipse=new Ellipse2D.Double(10, 10, 100, 100);
//		g2.draw(elipse);
//		g2.draw(new Ellipse2D.Double(290, 10, 100, 100));
//		g.drawArc(150, 145, 100, 100, 195, 150);
		//g.drawLine(0, 0, 430, 400);
		/*Color color1=new Color(150, 254, 254);
		g2.setPaint(color1);
		g2.draw(rectangulo);
		Ellipse2D elipse=new Ellipse2D.Double(rectangulo.getX(), rectangulo.getY(), rectangulo.getWidth(), rectangulo.getHeight());
		g2.setPaint(Color.RED);
		g2.draw(elipse);
		g.setColor(Color.YELLOW);
		g.drawLine(100, 100, 300, 250);
		g.drawLine(300, 100, 100, 250);
		Ellipse2D elipse2=new Ellipse2D.Double();
		elipse2.setFrameFromCenter(rectangulo.getCenterX(), rectangulo.getCenterY(), rectangulo.getCenterX()+125, rectangulo.getCenterY()+125);
		g2.setPaint(Color.RED);
		g2.draw(elipse2);
		Ellipse2D elipse3=new Ellipse2D.Double();
		g2.setPaint(Color.YELLOW);
		elipse3.setFrameFromCenter(rectangulo.getCenterX(), rectangulo.getCenterY(), rectangulo.getCenterX()+150, rectangulo.getCenterY()+150);
		g2.draw(elipse3);
		Ellipse2D elipse4=new Ellipse2D.Double();
		g2.setPaint(new Color(150, 254, 254));
		elipse4.setFrameFromCenter(rectangulo.getCenterX(), rectangulo.getCenterY(), rectangulo.getCenterX()+175, rectangulo.getCenterY()+175);
		g2.draw(elipse4);
		//g.drawString("Empezamos con el color", 5, 10);
		g2.setPaint(new Color(255, 0, 255));
		//g2.drawString("Empezamos con el color", 5, 10);
		//Instanciamos un color
		//Color color1=new Color(150, 254, 254);
		//g2.setPaint(color1);
		g2.drawString("Empezamos con el color", 5, 10);
		setBackground(Color.BLACK);*/
		g2.setPaint(new Color(0, 0, 153));
		g2.draw(rectangulo);
		g2.setPaint(new Color(255, 0, 255));
		//g2.draw(rectangulo);
		g2.fill(rectangulo);
		setBackground(SystemColor.window);
	}
}

//Dentro del paquete de practicasPropuestas. Tercera practica propuesta. Crea una ventana, en la cual aparecerá el texto "cabecera" en la parte superior centrada y el texto "pie" en la parte inferior derecha
