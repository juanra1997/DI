package ventanaHotel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class MiPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton boton;
	private Ventana topFrame;

	public MiPanel() {

		topFrame = (Ventana) SwingUtilities.getWindowAncestor(this);

		setLayout(null);
		setBackground(Color.WHITE);

		Toolkit t = Toolkit.getDefaultToolkit();

		// Boton------------------------------------------------------------------------------------

		boton = new JButton("Reservas");

		boton.setPreferredSize(new Dimension(100, 35));
		boton.setBounds(t.getScreenSize().width / 5 + 50, t.getScreenSize().height / 5 - 20, 100, 40);
		boton.setBackground(Color.BLACK);
		boton.setForeground(Color.WHITE);
		boton.setFocusPainted(false);

		add(boton);

		// Botones----------------------------------------------------------------------------------

		Push palta = new Push("alta");
		Push pbaja = new Push("baja");

		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

		KeyStroke alta = KeyStroke.getKeyStroke("ctrl A");
		KeyStroke baja = KeyStroke.getKeyStroke("ctrl B");

		mapaEntrada.put(alta, "darAlta");
		mapaEntrada.put(baja, "darBaja");

		ActionMap mapaAction = getActionMap();

		mapaAction.put("darAlta", palta);
		mapaAction.put("darBaja", pbaja);

		// -----------------------------------------------------------------------------------------
	}

	public JButton getBoton() {
		return boton;
	}

	private class Push extends AbstractAction {

		private static final long serialVersionUID = 1L;

		String action;

		public Push(String a) {

			action = a;
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			if (action.equals("baja")) {

				JOptionPane.showMessageDialog(null, "La aplicacion no esta desarrollada");
			}
			if (action.equals("alta")) {

				Dialogo obj = new Dialogo(topFrame, true);
				obj.setLocationRelativeTo(null);
				obj.setResizable(false);
				obj.setTitle("Alta reservas");
				obj.setVisible(true);
			}
		}

	}
}
