package practicasPropuestasLayouts;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaLayouts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaPL1 obj=new VentanaPL1();
		obj.setLocationRelativeTo(null);
		obj.setSize(600, 400);
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setVisible(true);
	}

}
class VentanaPL1 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public VentanaPL1() {
		
		add(new PanelSuperiorPL1(), BorderLayout.LINE_START);
		add(new PanelInferiorPL1(), BorderLayout.PAGE_END);
	}
	
}

class PanelSuperiorPL1 extends JPanel {
	
	JButton amarillo, rojo;

	private static final long serialVersionUID = 1L;
	
	public PanelSuperiorPL1() {
		
		amarillo=new JButton("Amarillo");
		//amarillo.setSize(100, 20);
		add(amarillo);
		
		rojo=new JButton("Rojo");
		//rojo.setSize(100, 20);
		add(rojo);
	}
	
}
class PanelInferiorPL1 extends JPanel {
	
	JButton azul, negro, verde;
	
	private static final long serialVersionUID = 1L;
	
	public PanelInferiorPL1() {
		
		azul=new JButton("Azul");
		add(azul);
		
		negro=new JButton("Negro");
		negro.setPreferredSize(new Dimension(450, 25));
		add(negro);
		
		verde=new JButton("Verde");
		add(verde);
	}
}