package practicasPropuestasLayouts;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaLayouts3 {

	public static void main(String[] args) {
		
		VentanaPL3 obj=new VentanaPL3();
		obj.setVisible(true);
	}

}

class VentanaPL3 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	PanelPL3P pp=new PanelPL3P();
	
	public VentanaPL3() {
		
		setLayout(new GridLayout(1,1));
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Paneles Juan Raul Mellado Garcia");
		//setVisible(true);
		
		add(pp);
	}
}

class PanelPL3P extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	JLabel texto=new JLabel();
	Panel1PL3 p1=new Panel1PL3();
	Panel2PL3 p2=new Panel2PL3();
	JButton mostrar, ocultar, reinicio, aceptar;
	
	public PanelPL3P() {
		
		setLayout(null);
		
		texto.setText("Panel principal");
		texto.setBounds(350, 50, 100, 20);
		add(texto);
		
		p1.setBounds(40, 100, 300, 200);
		add(p1);
		
		p2.setBounds(450, 100, 300, 200);
		add(p2);

		mostrar=new JButton("Mostrar Panel 2");
		
		mostrar.setBounds(40, 320, 150, 30);
		mostrar.addActionListener(this);
		add(mostrar);
		
		ocultar=new JButton("Ocultar Panel 2");
		
		ocultar.setBounds(40, 360, 150, 30);
		ocultar.addActionListener(this);
		add(ocultar);
		
		reinicio=new JButton("Reiniciar Datos");
		
		reinicio.setBounds(450, 320, 150, 30);
		reinicio.addActionListener(this);
		add(reinicio);
		
		aceptar=new JButton("Aceptar");
		
		aceptar.setBounds(450, 360, 150, 30);
		aceptar.addActionListener(this);
		add(aceptar);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==ocultar) {
			p2.setVisible(false);
		}
		
		if(e.getSource()==mostrar) {
			p2.setVisible(true);
		}
		
		if(e.getSource()==reinicio) {
			p1.jtnombre.setText("");
			p1.jtapellidos.setText("");
			p1.jtnombre.requestFocus();
		}
		
		if(e.getSource()==aceptar) {
			if(p1.jtnombre.getText().equals("")||p1.jtapellidos.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Faltan datos");
			}else {
				JOptionPane.showMessageDialog(null, "Se han guardado los datos");
				p1.jtnombre.setText("");
				p1.jtapellidos.setText("");
				p1.jtnombre.requestFocus();
			}
		}
	}
	
}

class Panel1PL3 extends JPanel {

	private static final long serialVersionUID = 1L;
	
	JLabel titulo, nombre, apellidos;
	JTextField jtnombre, jtapellidos;
	
	public Panel1PL3() {
		
		setLayout(null);
		
		setBackground(Color.GRAY);
		
		titulo=new JLabel("Titulo Panel 1");
		titulo.setBounds(100, 10, 100, 20);
		add(titulo);
		
		titulo=new JLabel("Nombre:");
		titulo.setBounds(60, 60, 100, 20);
		add(titulo);
		
		titulo=new JLabel("Apellidos:");
		titulo.setBounds(60, 110, 100, 20);
		add(titulo);
		
		jtnombre=new JTextField();
		jtnombre.setBounds(130, 60, 100, 20);
		add(jtnombre);
		
		jtapellidos=new JTextField();
		jtapellidos.setBounds(130, 110, 100, 20);
		add(jtapellidos);
	}
	
}

class Panel2PL3 extends JPanel {

	private static final long serialVersionUID = 1L;
	
	JLabel titulo;
	JButton boton;
	
	public Panel2PL3() {
		
		setLayout(null);
		
		setBackground(Color.GREEN);
		
		titulo=new JLabel("Titulo Panel 2");
		titulo.setBounds(100, 10, 100, 20);
		add(titulo);
		
		boton=new JButton("Boton");
		boton.setBounds(100, 80, 100, 30);
		add(boton);
	}
}