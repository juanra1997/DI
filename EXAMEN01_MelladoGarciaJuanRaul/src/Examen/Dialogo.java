package Examen;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JDialog;

public class Dialogo extends JDialog{

	private static final long serialVersionUID = 1L;
	
	PanelTitulo pt=new PanelTitulo();
	Panel p=new Panel();
	
	public Dialogo(Ventana n, boolean m) {
		
		super(n, m);
		Toolkit t = Toolkit.getDefaultToolkit();
		setSize(1000, 600);
		setIconImage(t.getImage("f1y0bb.png"));
		
		getContentPane().setBackground(Color.WHITE);
		
		setLayout(null);
		
		pt=new PanelTitulo();
		
		pt.setBounds(0, 0, 1000, 100);
		add(pt);
		
		p.setBounds(0, 100, 1000, 465);
		add(p);
		
	}
}
