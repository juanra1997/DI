package ejercicios;

import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejercicio05 {

	public static void main(String[] args) {

		/*String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(int i=0; i<fontNames.length; i++) {
        	System.out.println(fontNames[i]);
        }*/
		Ventana05 miVentana=new Ventana05();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setSize(200, 250);
        miVentana.setLocationRelativeTo(null);
        miVentana.setResizable(false);
        miVentana.setTitle("Ejercicio05");
        miVentana.setVisible(true);
        
	}

}

class Ventana05 extends JFrame implements ChangeListener {

	private static final long serialVersionUID = 1L;
	
	JSpinner control, control1, control2, control3, control4;
	String lista[] = { "Enero", "Febrero", "Marzo" };
	String listaF[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	JProgressBar barra;
	
	public Ventana05() {
		
		setLayout(null);
		
		control = new JSpinner(new SpinnerDateModel());
		
		control.setBounds(20, 10, 120, 20);
		
		control1 = new JSpinner(new SpinnerListModel(lista));
		
		control1.setBounds(20, 40, 120, 20);
				
		control2 = new JSpinner(new SpinnerListModel(listaF));
		
		control2.setBounds(20, 70, 120, 20);
		
		control3 = new JSpinner(new SpinnerNumberModel(10, 0, 20, 2));
		
		control3.setBounds(20, 100, 120, 20);
		
		control4 = new JSpinner(new SpinnerNumberModel(50, 0, 100, 1));
		
		control4.setBounds(20, 130, 120, 20);
		control4.addChangeListener(this);
		
		barra=new JProgressBar(0, 100);
		
		barra.setValue(Integer.parseInt(String.valueOf(control4.getValue())));
		barra.setBounds(20, 160, 100, 20);
		
		add(control);
		add(control1);
		add(control2);
		add(control3);
		add(control4);
		add(barra);
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
	
		barra.setValue(Integer.parseInt(String.valueOf(control4.getValue())));
	}
}