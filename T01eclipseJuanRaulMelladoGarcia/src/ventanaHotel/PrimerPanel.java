package ventanaHotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

//import javax.swing.JButton;
import javax.swing.JPanel;

public class PrimerPanel extends JPanel{


	private static final long serialVersionUID = 1L;

	/*public PrimerPanel() {

		setBackground(Color.WHITE);
		//setSize(100,100);
		
		//add(new JButton("Boton"));
	}*/
	//--------------------------------------------------------------------------------------------------
	
	/*public PrimerPanel() {
		
		setLayout(null);
		setBackground(Color.BLACK);
		
	}*/
	
	//--------------------------------------------------------------------------------------------------
		
	public void paintComponent(Graphics g) {
		
		g.setFont(new Font("Algerian", Font.PLAIN, 100));
		g.setColor(Color.WHITE);
		g.drawString("HOTEL DIAMANTE", 30, 100);
	}
	//}
}
