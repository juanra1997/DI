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
class VentanaPL1 extends JFrame{

	private static final long serialVersionUID = 1L;
	
	static JButton am, az, neg, ver,rojo;
	PanelSuperiorPL1 ps;
	PanelInferiorPL1 pi;
	boolean amarillo=false, azul=false, negro=false, verde=false, rojob=false;
	
	public VentanaPL1() {
		
		ps=new PanelSuperiorPL1();
		pi=new PanelInferiorPL1();
		
		am=ps.getAmarillo();
		rojo=ps.getRojo();
		neg=pi.getNegro();
		az=pi.getAzul();
		ver=pi.getVerde();
		
		add(ps, BorderLayout.LINE_START);
		add(pi, BorderLayout.PAGE_END);
	}
}

class PanelSuperiorPL1 extends JPanel{
	
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

	public JButton getAmarillo() {
		return amarillo;
	}

	public void setAmarillo(JButton amarillo) {
		this.amarillo = amarillo;
	}

	public JButton getRojo() {
		return rojo;
	}

	public void setRojo(JButton rojo) {
		this.rojo = rojo;
	}
}
class PanelInferiorPL1 extends JPanel{
	
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

	public JButton getAzul() {
		return azul;
	}

	public void setAzul(JButton azul) {
		this.azul = azul;
	}

	public JButton getNegro() {
		return negro;
	}

	public void setNegro(JButton negro) {
		this.negro = negro;
	}

	public JButton getVerde() {
		return verde;
	}

	public void setVerde(JButton verde) {
		this.verde = verde;
	}
}