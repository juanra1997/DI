package Examen;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTitulo extends JPanel{

	private static final long serialVersionUID = 1L;

	Font f;
	JLabel l;
	
	public PanelTitulo() {
		
		f=new Font("Algerian", Font.PLAIN, 70);
		
		setBackground(Color.BLACK);
		
		l=new JLabel("ALTA");
		l.setFont(f);
		l.setForeground(Color.WHITE);
		add(l);
	}
}
