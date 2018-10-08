package practicasPropuestas;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class NovenaPracticaPropuesta {

	public static void main(String[] args) {

		MarcoRaton1 miMarco=new MarcoRaton1();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("Eventos de Raton");
	}

}

class MarcoRaton1 extends JFrame implements MouseMotionListener {

	private static final long serialVersionUID = 1L;

	public MarcoRaton1() {
		
		setVisible(true);
		setBounds(300, 300, 500, 350);
		addMouseMotionListener(this);
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Arrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Moviendo");
	}

}