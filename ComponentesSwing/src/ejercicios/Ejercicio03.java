package ejercicios;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio03 {

	public static void main(String[] args) {

		/*String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(int i=0; i<fontNames.length; i++) {
        	System.out.println(fontNames[i]);
        }*/
		Ventana03 miVentana=new Ventana03();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setSize(1000, 400);
        miVentana.setLocationRelativeTo(null);
        miVentana.setResizable(false);
        miVentana.setVisible(true);
        
	}

}

class Ventana03 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	JComboBox<String> combo;
	String[] opciones= {"Serif", "SansSerif", "Monospaced", "Dialog", "Algerian"};
	JLabel titulo;
	
	public Ventana03() {
		
		setLayout(null);
		
		titulo=new JLabel();
		titulo.setText("En un lugar de la mancha de cuyo nombre no quiero acordarme");
		titulo.setFont(new Font("Serif", Font.PLAIN, 20));
		titulo.setBounds(10, 10, 1000, 40);
		add(titulo, BorderLayout.LINE_START);
		
		combo=new JComboBox<String>(opciones);
		
		combo.setBounds(430, 100, 100, 23);
		combo.setSelectedItem(combo.getItemAt(0));
		combo.addActionListener(this);
		add(combo);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if(combo.getSelectedIndex()==0) {
			
			titulo.setFont(new Font("Serif", Font.PLAIN, 20));
		}
		
		if(combo.getSelectedIndex()==1) {
			
			titulo.setFont(new Font("SansSerif", Font.PLAIN, 20));
		}
		
		if(combo.getSelectedIndex()==2) {
			
			titulo.setFont(new Font("Monospaced", Font.PLAIN, 20));
		}
		
		if(combo.getSelectedIndex()==3) {
			
			titulo.setFont(new Font("Dialog", Font.PLAIN, 20));
		}
		
		if(combo.getSelectedIndex()==4) {
			
			titulo.setFont(new Font("Algerian", Font.PLAIN, 20));
		}
	}
}