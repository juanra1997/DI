package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {

		MarcoCentrado obj=new MarcoCentrado();
		obj.setResizable(false);
		obj.setVisible(true);
		//obj.setLocationRelativeTo(null);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setTitle("Hola");
	}

}

class MarcoCentrado extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JButton prueba=new JButton("Si");
	
	public MarcoCentrado() {
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		//Dimension tamannoPantalla=miPantalla.getScreenSize();
		Dimension tamannoPantalla=new Dimension();
		tamannoPantalla=miPantalla.getScreenSize();
		setSize((int)tamannoPantalla.getWidth()/2, (int)tamannoPantalla.getHeight()/2);
		setLocationRelativeTo(null);
		Image miIcono=miPantalla.getImage("C:/Users/Juanra/Desktop/marco.jpg");
		setIconImage(miIcono);
		
	}

}
