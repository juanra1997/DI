package pruebaJDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel miPanel;
	private JButton miBoton;
	//private VentanaPrincipal mvp;
	private VentanaConfirmacion mvc;

	public VentanaPrincipal() {
		
		iniciarComponentes();
		setTitle("Dialogos");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void iniciarComponentes() {
		
		miPanel=new JPanel();
		miPanel.setLayout(null);
		
		miBoton=new JButton("Abrir dialogo");
		miBoton.setBounds(100, 80, 80, 23);
		miBoton.addActionListener(this);
		miPanel.add(miBoton);
		
		add(miPanel);
	}

	/*public void setVentanaPrincipal(VentanaPrincipal ventana) {
		
		mvp=ventana;
	}*/
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==miBoton) {
			
			//mvp.setVentanaPrincipal(this);
			mvc=new VentanaConfirmacion(this, true);
			mvc.setVisible(true);
		}
	}

}
