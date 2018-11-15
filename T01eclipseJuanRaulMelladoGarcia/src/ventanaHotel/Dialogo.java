package ventanaHotel;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JDialog;

public class Dialogo extends JDialog {

	private static final long serialVersionUID = 1L;
	
	PrimerPanel pp;
	SegundoPanel sp;

	public Dialogo(Ventana n, boolean m) {
		
		super(n, m);
		Toolkit t=Toolkit.getDefaultToolkit();
		setSize(t.getScreenSize().width, t.getScreenSize().height);
		setIconImage(t.getImage("f1y0bb.png"));
		
		setLayout(null);
		
		getContentPane().setBackground(Color.WHITE);
		
		pp=new PrimerPanel();
		pp.setBounds(5, 5, 100, 100);
		
		add(pp);
		//add((new PrimerPanel()).setBounds(10, 10, 100, 100));
		sp=new SegundoPanel();
		sp.setBounds(20, 120, 300, 500);
		add(sp);
	}
}
