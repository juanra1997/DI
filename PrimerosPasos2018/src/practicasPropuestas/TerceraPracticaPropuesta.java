package practicasPropuestas;

//-------------------FORMA 1---------------------------------------------------------------------------------
//import java.awt.BorderLayout;
//-----------------------------------------------------------------------------------------------------------
import java.awt.Graphics;
import javax.swing.JFrame;
//-------------------FORMA 1---------------------------------------------------------------------------------
//import javax.swing.JLabel;
//-----------------------------------------------------------------------------------------------------------
import javax.swing.JPanel;

public class TerceraPracticaPropuesta extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		TerceraPracticaPropuesta miVentana=new TerceraPracticaPropuesta();
		miVentana.setVisible(true);
	}

	public TerceraPracticaPropuesta() {
//-------------------FORMA 1---------------------------------------------------------------------------------	
		/*JLabel sup=new JLabel("Cabecera");
		JLabel inf=new JLabel("Pie       ");
		
		sup.setHorizontalAlignment(JLabel.CENTER);
		inf.setHorizontalAlignment(JLabel.RIGHT);
		
		add(sup, BorderLayout.PAGE_START);
		add(inf, BorderLayout.PAGE_END);*/
		
//-----------------------------------------------------------------------------------------------------------
		//setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Primera Practica Propuesta");
		setSize(500,300);
		setLocationRelativeTo(null);
		setResizable(false);
		add(new ConGraphics());
	}
}

//-------------------FORMA 2---------------------------------------------------------------------------------
class ConGraphics extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawString("Cabecera", 210, 20);
		g.drawString("Pie", 450, 250);
	}
}
//------------------------------------------------------------------------------------------------------------


//Dentro del paquete de practicasPropuestas.
//Tercera practica propuesta.
//Crea una ventana, en la cual aparecerá el texto "cabecera" en la parte superior centrada y
//el texto "pie" en la parte inferior derecha
