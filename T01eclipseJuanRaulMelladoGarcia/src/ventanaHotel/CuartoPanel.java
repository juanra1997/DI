package ventanaHotel;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class CuartoPanel extends JTabbedPane{

	private static final long serialVersionUID = 1L;
	
	JPanel panel1, panel2;// = makeTextPanel("Panel #1");

	public CuartoPanel() {
		
		setLayout(null);
		
		panel1=new JPanel();
		addTab("Datos personales", panel1);
		
		panel2=new JPanel();
		addTab("Datos de habitacion", panel2);

	}
}
