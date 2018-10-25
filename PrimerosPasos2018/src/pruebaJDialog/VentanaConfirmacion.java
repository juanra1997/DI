package pruebaJDialog;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class VentanaConfirmacion extends JDialog {

	private static final long serialVersionUID = 1L;

	public VentanaConfirmacion(VentanaPrincipal vp, boolean modal) {
		
		super(vp, modal);
		setTitle("Ventana de confirmacion");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
