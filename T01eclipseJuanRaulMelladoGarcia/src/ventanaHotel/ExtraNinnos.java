package ventanaHotel;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;

public class ExtraNinnos extends JPanel implements FocusListener {

	private static final long serialVersionUID = 1L;

	JSpinner edad;
	JLabel edadl, extras;
	JTextArea area;

	public ExtraNinnos() {

		setLayout(null);
		setBackground(Color.RED);

		edad = new JSpinner(new SpinnerNumberModel(1, 0, 14, 1));

		edad.setBounds(50, 10, 110, 20);
		add(edad);

		edadl = new JLabel("Edad");

		edadl.setBounds(10, 10, 110, 20);
		add(edadl);

		extras = new JLabel("Extras:");

		extras.setBounds(10, 40, 110, 20);
		add(extras);

		area = new JTextArea();

		area.setBounds(10, 70, 460, 210);
		area.addFocusListener(this);
		area.setLineWrap(true);
		add(area);
	}

	@Override
	public void focusGained(FocusEvent e) {

		if (e.getSource() == area) {

			if (Integer.parseInt(String.valueOf(edad.getValue())) < 4
					&& Integer.parseInt(String.valueOf(edad.getValue())) >= 0) {

				area.setText("Cuna, ");
			}
			if (Integer.parseInt(String.valueOf(edad.getValue())) < 11
					&& Integer.parseInt(String.valueOf(edad.getValue())) >= 4) {

				area.setText("Cama supletoria pequeña, ");
			}
			if (Integer.parseInt(String.valueOf(edad.getValue())) < 15
					&& Integer.parseInt(String.valueOf(edad.getValue())) >= 11) {

				area.setText("Cama supletoria normal, ");
			}
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}

}
