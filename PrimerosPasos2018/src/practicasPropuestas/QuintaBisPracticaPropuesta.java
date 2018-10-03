package practicasPropuestas;

import javax.swing.JOptionPane;

public class QuintaBisPracticaPropuesta {

	public static void main(String[] args) {

		MiIcon mio=new MiIcon();
		String[] op= {"Guardar", "Salir", "Cerrar", "Abrir"};
		int seleccion=JOptionPane.showOptionDialog(null, "CHOOSE", "ONLY A TITLE", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, mio, op, 0);
		if(seleccion==0) {
			JOptionPane.showMessageDialog(null, "Archivo guardado");
		}
	}

}
