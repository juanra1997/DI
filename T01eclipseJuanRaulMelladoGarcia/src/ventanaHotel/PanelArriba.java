package ventanaHotel;

import java.awt.Color;

import javax.swing.JPanel;

public class PanelArriba extends JPanel{

	private static final long serialVersionUID = 1L;
	
	PrimerPanel pp;

	public PanelArriba() {
		
		setLayout(null);
		setBackground(Color.BLACK);
		
		pp=new PrimerPanel();
		
		pp.setBounds(5, 0, 1000, 100);
		//pp.setBounds(0, 0, t.getScreenSize().width, 100);
		add(pp);
	}
}
