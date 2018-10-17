package componentesAtomicos;

import java.awt.Font;
//import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;

public class VentanaPrincipal extends JFrame{

	private JPanel contenedor;
	private JLabel lbTitulo, lbLabel, lbBoton, lbTongleButton, lbCheckBox, lbRadioButtons, lbEtiqueta;
	private JButton bBoton;
	private JCheckBox cbCB1, cbCB2;
	private JRadioButton rbBoton1, rbBoton2;
	private ButtonGroup bgGrupo;
	private JToggleButton tbTogle;
	private JComboBox<String> combo;
	private JSeparator separador, separador2;
	private JSlider deslizador;
	private JSpinner spiner;
	private JProgressBar barra;
	
	private static final long serialVersionUID = 1L;

	public VentanaPrincipal() {
		
		iniciarComponentes();
		setTitle("Swing Componentes Atómicos");
		setSize(630, 250);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void iniciarComponentes() {
		
		contenedor=new JPanel();
		
		contenedor.setLayout(null);
		
		//-----------------------------------------------------------------------------------------------------
	
		lbTitulo=new JLabel();
		
		lbTitulo.setText("Componentes Atómicos");
		lbTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbTitulo.setBounds(180, 5, 380, 40);
		contenedor.add(lbTitulo);
		
		//-----------------------------------------------------------------------------------------------------
		
		lbLabel=new JLabel();
		
		lbLabel.setText("JLabel: ");
		lbLabel.setBounds(20, 50, 50, 23);
		contenedor.add(lbLabel);
		
		//-----------------------------------------------------------------------------------------------------
		
		lbBoton=new JLabel();
		
		lbBoton.setText("JButton: ");
		lbBoton.setBounds(20, 80, 200, 23);
		contenedor.add(lbBoton);
		
		//-----------------------------------------------------------------------------------------------------
		
		lbRadioButtons=new JLabel();
		
		lbRadioButtons.setText("JRadioButtons: ");
		lbRadioButtons.setBounds(20, 140, 200, 23);
		contenedor.add(lbRadioButtons);
		
		//-----------------------------------------------------------------------------------------------------
		
		lbCheckBox=new JLabel();
		
		lbCheckBox.setText("JCheckBox: ");
		lbCheckBox.setBounds(20, 110, 200, 23);
		contenedor.add(lbCheckBox);
		
		//-----------------------------------------------------------------------------------------------------
		
		lbTongleButton=new JLabel();
		
		lbTongleButton.setText("JToggleButton: ");
		lbTongleButton.setBounds(20, 170, 200, 23);
		contenedor.add(lbTongleButton);
		
		//-----------------------------------------------------------------------------------------------------
		
		bBoton=new JButton();
		
		bBoton.setText("BOTON");
		bBoton.setBounds(80, 80, 80, 23);
		contenedor.add(bBoton);
		
		//-----------------------------------------------------------------------------------------------------
		
		cbCB1=new JCheckBox();
		cbCB1.setText("Check 1");
		cbCB1.setBounds(100, 110, 72, 23);
		contenedor.add(cbCB1);

		//-----------------------------------------------------------------------------------------------------
		
		cbCB2=new JCheckBox();
		cbCB2.setText("Check 2");
		cbCB2.setBounds(170, 110, 80, 23);
		contenedor.add(cbCB2);
		
		//-----------------------------------------------------------------------------------------------------
		
		rbBoton1=new JRadioButton();
		
		rbBoton1.setText("Radio 1");
		rbBoton1.setBounds(110, 140, 67, 23);
		contenedor.add(rbBoton1);
		
		//-----------------------------------------------------------------------------------------------------
		
		rbBoton2=new JRadioButton();
		
		rbBoton2.setText("Radio 2");
		rbBoton2.setBounds(173, 140, 80, 23);
		contenedor.add(rbBoton2);
		
		//-----------------------------------------------------------------------------------------------------
		
		bgGrupo=new ButtonGroup();
		
		bgGrupo.add(rbBoton1);
		bgGrupo.add(rbBoton2);
		
		//-----------------------------------------------------------------------------------------------------
		
		tbTogle=new JToggleButton();
		
		tbTogle.setText("Activar");
		tbTogle.setBounds(120, 170, 80 ,23);
		contenedor.add(tbTogle);
		
		//-----------------------------------------------------------------------------------------------------
		
		lbEtiqueta=new JLabel();
		
		lbEtiqueta.setText("Esto es una etiqueta");
		lbEtiqueta.setBounds(70, 50, 120, 23);
		contenedor.add(lbEtiqueta);
		
		//-----------------------------------------------------------------------------------------------------
		
		String[] opciones= {"Opcion 1", "Opcion 2", "Opcion 3", "Opcion 4", "Opcion 5"};
		
		combo=new JComboBox<String>(opciones);
		
		combo.setBounds(430, 50, 100, 23);
		//combo.setSelectedItem(combo.getItemAt(2));
		contenedor.add(combo);
				
		//-----------------------------------------------------------------------------------------------------
		
		separador=new JSeparator();
		
		separador.setOrientation(JSeparator.VERTICAL/*SwingConstants.VERTICAL*/);
		separador.setBounds(300, 60, 10, 200);
		contenedor.add(separador);
		
		//-----------------------------------------------------------------------------------------------------
		
		separador2=new JSeparator();
		
		separador2.setBounds(430, 92, 100, 5);
		contenedor.add(separador2);
		
		//-----------------------------------------------------------------------------------------------------
		
		deslizador=new JSlider(JSlider.HORIZONTAL, 0, 100, 30);
		
		deslizador.setBounds(430, 140, 100, 50);
		deslizador.setPaintTicks(true);
		deslizador.setMajorTickSpacing(50);
		deslizador.setMinorTickSpacing(5);
		deslizador.setFont(new Font("Tahoma", Font.PLAIN, 11));
		deslizador.setPaintLabels(true);
		deslizador.setPaintTrack(true);
		contenedor.add(deslizador);
		
		//-----------------------------------------------------------------------------------------------------
		
		spiner=new JSpinner();
		
		spiner.setBounds(430, 105, 100, 30);
		contenedor.add(spiner);
		
		//-----------------------------------------------------------------------------------------------------
		
		barra=new JProgressBar();
		
		barra.setBounds(430, 190, 110, 23);
		contenedor.add(barra);
		
		//-----------------------------------------------------------------------------------------------------
		add(contenedor);
	}
}
