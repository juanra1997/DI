package practicasPropuestas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CuartaPracticaPropuesta {

	public static void main(String[] args) {

		NoMovilesVentana obj=new NoMovilesVentana();
		obj.setVisible(true);
	}

}

class NoMovilesVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public NoMovilesVentana() {
		
		setSize(1000,1000);
		setLocationRelativeTo(null);
		setTitle("Primer texto en ventana");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new NoMoviles());
	}
	
}
class NoMoviles extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		setBackground(Color.WHITE);
		Graphics2D g2=(Graphics2D)g;
		Ellipse2D circulo=new Ellipse2D.Double(100, 100, 800, 800);
		g2.setPaint(Color.RED);
		g2.setStroke(new BasicStroke(90f));
		g2.draw(circulo);
		/*Ellipse2D circulo1=new Ellipse2D.Double();
		circulo1.setFrameFromCenter(circulo.getCenterX(), circulo.getCenterY(), 100, 100);
		g2.draw(circulo1);*/
		g2.setStroke(new BasicStroke(0f));
		RoundRectangle2D marco=new RoundRectangle2D.Float(10f, 10f, 10f, 10f, 25f, 25f);
		marco.setFrameFromCenter(circulo.getCenterX(), circulo.getCenterY(), 350, 250);
		g2.setPaint(Color.BLACK);
		g2.fill(marco);
		g2.draw(marco);
		Rectangle2D pantalla=new Rectangle2D.Double();
		pantalla.setFrameFromCenter(circulo.getCenterX(), circulo.getCenterY()-20, 400, 320);
		g2.setPaint(Color.WHITE);
		g2.fill(pantalla);
		g2.draw(pantalla);
		
		Ellipse2D circulo2=new Ellipse2D.Double(475, 670, 50, 50);
		g2.setPaint(Color.WHITE);
		g2.fill(circulo2);
		g2.draw(circulo2);
		
		g2.setStroke(new BasicStroke(90f));
		g2.setPaint(Color.RED);
		g.drawLine(250, 250, 750, 750);
	}
	
}