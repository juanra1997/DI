package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
//import javax.swing.InputMap;
import javax.swing.JButton;
//import javax.swing.JComponent;
import javax.swing.JFrame;

public class AccionTecladoClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaAccionTeclado miMarco=new VentanaAccionTeclado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("Eventos de Teclado");
		miMarco.setVisible(true);
	}

}
class VentanaAccionTeclado extends JFrame/* implements MouseListener*/{

	private static final long serialVersionUID = 1L;
	
	JButton btn1;//=new JButton("Amarillo");
	JButton btn2;//=new JButton("Azul");
	JButton btn3;//=new JButton("Rojo");

	public VentanaAccionTeclado() {
		//setVisible(true);
		setBounds(300, 300, 510, 350);
		setLayout(null);
		//EventoTeclas tecla=new EventoTeclas();
		//addMouseListener(this);
		ColorFondo colorAmarillo=new ColorFondo(Color.YELLOW);
		ColorFondo colorAzul=new ColorFondo(Color.CYAN);
		ColorFondo colorRojo=new ColorFondo(Color.RED);
		btn1=new JButton(colorAmarillo);
		btn1.setText("Amarillo");
		btn2=new JButton(colorAzul);
		btn2.setText("Azul");
		btn3=new JButton(colorRojo);
		btn3.setText("Rojo");
		btn1.setIcon(new ImageIcon("C:\\Users\\Juanra\\Desktop\\amarillo.jpg"));
		btn2.setIcon(new ImageIcon("C:\\Users\\Juanra\\Desktop\\azul.jpg"));
		btn3.setIcon(new ImageIcon("C:\\Users\\Juanra\\Desktop\\rojo.jpg"));
		btn1.setBounds(10, 20, 150, 50);
		btn2.setBounds(170, 20, 150, 50);
		btn3.setBounds(330, 20, 150, 50);
		btn1.setMnemonic(KeyEvent.VK_1);
		btn2.setMnemonic(KeyEvent.VK_2);
		btn3.setMnemonic(KeyEvent.VK_3);
		//-------------------------------------------Maping----------------------------------------------
		//InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//-----------------------------------------------------------------------------------------------
		add(btn1);
		add(btn2);
		add(btn3);
		
		//setLayout(null);
	}
	
	private class ColorFondo extends AbstractAction {

		private Color colorFondo;
		
		public ColorFondo(Color c) {
			colorFondo=c;
		}
		
		private static final long serialVersionUID = 1L;

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			getContentPane().setBackground(colorFondo);
			
		}
		
	}
}