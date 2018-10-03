package paneles;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.UIManager;

public class General {

	public static void main(String[] args) {
		
		Ventana miVentana=new Ventana();
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setResizable(false);
		miVentana.getContentPane().setBackground(Color.BLACK);
		miVentana.setVisible(true);
		
		//COSAS BASICAS DE PRIMERO----------------------------------------------------------------------------
				
		/*JOptionPane.showMessageDialog(null, "Metodo con dos argumentos");
		JOptionPane.showMessageDialog(null, "ERROR MESSAGE", "mensaje en la ba", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "INFORMATION_MESSAGE", "mensaje en la ba", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "WARNING_MESSAGE", "mensaje en la ba", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "QUESTION_MESSAGE", "mensaje en la ba", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "PLAIN_MESSAGE", "mensaje en la ba", JOptionPane.PLAIN_MESSAGE);*/
		
		//MiIcon mio=new MiIcon();
		
		/*UIManager UI=new UIManager();
		UIManager.put("OptionPane.background", Color.WHITE);
		UIManager.put("Panel.background", Color.WHITE);
		JOptionPane.showMessageDialog(null, "The World Ends With You", "FIN", JOptionPane.DEFAULT_OPTION, mio);*/
		
		
		//-----------------------------------------------------------------------------------------------------
		
		/*String resp0=JOptionPane.showInputDialog("Escribe tu nombre");
		String resp1=JOptionPane.showInputDialog(null, "esc");
		String resp2=JOptionPane.showInputDialog("Escribe tu apellido", "Lopez");
		String resp3=JOptionPane.showInputDialog(null, "Escriba de nuevo su nombre", "Error", JOptionPane.WARNING_MESSAGE);
		String[] modulos={"AD", "SGE", "DI", "PSP", "DM"};
		String resp4 = null;
		JOptionPane.showInputDialog(null, "SELECCIONA UN MODULO", "SELECT * FROM modulos", JOptionPane.DEFAULT_OPTION, mio, modulos, resp4);*/
		
		//------------------------------------------------------------------------------------------------------
		
		/*JOptionPane.showConfirmDialog(null, "¿Esta seguro?");
		JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta", JOptionPane.OK_CANCEL_OPTION);
		JOptionPane.showConfirmDialog(null, "¿Sergio es monger?", "Pregunta seria", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, mio);
		JOptionPane.showConfirmDialog(null, "¿Sergio es monger?", "Pregunta seria", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, mio);*/
		
		
		//------------------------------------------------------------------------------------------------------
		
		//String[] op= {"Guardar", "Salir", "Cerrar", "Abrir"/*, "op5", "op6", "op7", "op8", "op9", "op10", "op11"*/};
		/*int seleccion=JOptionPane.showOptionDialog(null, "CHOOSE", "ONLY A TITLE", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, mio, op, 0);
		if(seleccion==0) {
			JOptionPane.showMessageDialog(null, "Archivo guardado");
		}*/
		
		//------------------------------------------------------------------------------------------------------
		
		
	}

}

class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;

	public Ventana() {
		
		setTitle("Prueba de dialogos con botones");
		setSize(400, 400);
		setLocationRelativeTo(null);
		add(new Panel(), BorderLayout.PAGE_END);
	}
}

class Panel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public Panel() {
		
		add(new JButton("Aceptar"));
	}
}