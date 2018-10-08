package practicasPropuestas;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
//import javax.swing.JOptionPane;

public class OctavaPracticaPropuesta {

	public static void main(String[] args) {

		MarcoRaton miMarco=new MarcoRaton();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("Eventos de Raton");
	}

}

class MarcoRaton extends JFrame implements MouseListener {

	private static final long serialVersionUID = 1L;

	public MarcoRaton() {
		
		setVisible(true);
		setBounds(300, 300, 500, 350);
		addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getButton()==3) {
			System.out.println("Boton derecho");
		} else if(e.getButton()==1) {
			System.out.println("Boton izquierdo");
		} else {
			System.out.println("Otro boton");
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}