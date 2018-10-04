package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {

	public static void main(String[] args) {

		MarcoTeclado miMarco=new MarcoTeclado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("Eventos de teclado");
	}

}

class MarcoTeclado extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;

	public MarcoTeclado() {
		setVisible(true);
		setBounds(300, 300, 500, 350);
		//EventoTeclas tecla=new EventoTeclas();
		addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//int codigo=e.getKeyCode();
		char letra=e.getKeyChar();
		System.out.println("tecla: "+letra);
		
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