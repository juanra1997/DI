package eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
//import javax.swing.JOptionPane;

public class EventosRaton {

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
		//EventoTeclas tecla=new EventoTeclas();
		addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Has echo un click");
		//System.out.println("Coordenada X: "+e.getX()+" Coordenada Y: "+e.getY());
		//System.out.println("Numero de clicks: "+e.getClickCount());
		//System.out.println(e.getButton());
		/*if(e.getButton()==3) {
			System.out.println("Boton derecho");
		} else if(e.getButton()==1) {
			System.out.println("Boton izquierdo");
		} else {
			System.out.println("Otro boton");
		}*/
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

/*class EventoTeclas implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	
	}
}*/