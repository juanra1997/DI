package practicasPropuestas;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;



public class SeptimaPracticaPropuesta {

	public static void main(String[] args) {

		Ventana8 obj=new Ventana8();
		obj.setLocation(10, 10);
		obj.setVisible(true);
		Ventana1 obj1=new Ventana1();
		obj1.setLocation(620, 10);
		obj1.setVisible(true);
	}

}

class Ventana8 extends JFrame implements WindowListener {

	private static final long serialVersionUID = 1L;

	public Ventana8() {
		
		setTitle("Eventos ventana");
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(this);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 activada");
		getContentPane().setBackground(Color.WHITE);
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 cerrada");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 cerrada");
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 desactivada");
		getContentPane().setBackground(Color.BLACK);
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 ampliada");
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 minimizada");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 abierta");
	}
}

class Ventana1 extends JFrame implements WindowListener {

	private static final long serialVersionUID = 1L;

	public Ventana1() {
		
		setTitle("Eventos ventana");
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		addWindowListener(this);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 activada");
		getContentPane().setBackground(Color.WHITE);
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 cerrada");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 cerrada");
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 desactivada");
		getContentPane().setBackground(Color.BLACK);
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 ampliada");
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 minimizada");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Ventana 2 abierta");
	}
}

