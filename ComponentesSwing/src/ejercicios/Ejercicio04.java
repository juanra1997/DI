package ejercicios;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejercicio04 {

	public static void main(String[] args) {

		Ventana04 miVentana=new Ventana04();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setSize(1250, 400);
        miVentana.setLocationRelativeTo(null);
        miVentana.setResizable(false);
        miVentana.setVisible(true);
        
	}

}

class Ventana04 extends JFrame implements ChangeListener {

	private static final long serialVersionUID = 1L;
	
	JSlider deslizador;
	JLabel titulo;
	
	public Ventana04() {
		
		setLayout(null);
		
		titulo=new JLabel();
		titulo.setText("En un lugar de la mancha de cuyo nombre no quiero acordarme");
		titulo.setFont(new Font("Serif", Font.PLAIN, 20));
		titulo.setBounds(10, 10, 1500, 60);
		add(titulo, BorderLayout.LINE_START);
		
		deslizador=new JSlider(JSlider.HORIZONTAL, 8, 48, 20);
		
		deslizador.setBounds(430, 140, 100, 50);
		deslizador.setPaintTicks(true);
		deslizador.setMajorTickSpacing(20);
		deslizador.setMinorTickSpacing(2);
		deslizador.setFont(new Font("Tahoma", Font.PLAIN, 11));
		deslizador.setPaintLabels(true);
		deslizador.setPaintTrack(true);
		deslizador.addChangeListener(this);
		add(deslizador);
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {

		titulo.setFont(new Font("Serif", Font.PLAIN, deslizador.getValue()));
	}
}