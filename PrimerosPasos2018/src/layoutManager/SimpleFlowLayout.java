package layoutManager;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleFlowLayout {

	public static void main(String[] args) {

		MarcoFlowLayout marco = new MarcoFlowLayout();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}

class MarcoFlowLayout extends JFrame {

	private static final long serialVersionUID = 1L;

	public MarcoFlowLayout() {
		setTitle("Simple FlowLayout");
		setBounds(600, 350, 400, 100);
		PanelFlowLayout lamina = new PanelFlowLayout();
		add(lamina);
	}
}

class PanelFlowLayout extends JPanel {

	private static final long serialVersionUID = 1L;

	public PanelFlowLayout() {
		setLayout(new FlowLayout());
		add(new JLabel("Primera"));
		add(new JLabel("Segunda"));
		add(new JLabel("Tercera"));
		add(new JLabel("Cuarta"));
		add(new JLabel("Quinta"));
		add(new JLabel("Sexta"));
		add(new JLabel("Primera"));
		add(new JLabel("Segunda"));
		add(new JLabel("Tercera"));
		add(new JLabel("Cuarta"));
		add(new JLabel("Quinta"));
		add(new JLabel("Sexta"));
	}
}