package practicasPropuestas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

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
		
		setSize(400,500);
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
		Graphics2D g2=(Graphics2D)g;
		Rectangle2D marco=new Rectangle2D.Double(100, 100, 200, 300);
		g2.setPaint(Color.WHITE);
		g2.fill(marco);
		g2.draw(marco);
		
	}
	
}