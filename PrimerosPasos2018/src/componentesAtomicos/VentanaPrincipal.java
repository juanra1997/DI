package componentesAtomicos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class VentanaPrincipal extends JFrame implements ActionListener, ChangeListener {

	private JPanel contenedor;
	private JLabel lbTitulo, lbLabel, lbBoton, lbTongleButton, lbCheckBox, lbRadioButtons;
	private JLabel lbEtiqueta, lbCombo, lbSeparador, lbSpiner, lbDeslizador, lbBarra;
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
		bBoton.setBounds(120, 80, 80, 23);
		bBoton.addActionListener(this);
		contenedor.add(bBoton);
		
		//-----------------------------------------------------------------------------------------------------
		
		cbCB1=new JCheckBox();
		cbCB1.setText("Check 1");
		cbCB1.setBounds(120, 110, 72, 23);
		contenedor.add(cbCB1);

		//-----------------------------------------------------------------------------------------------------
		
		cbCB2=new JCheckBox();
		cbCB2.setText("Check 2");
		cbCB2.setBounds(190, 110, 80, 23);
		contenedor.add(cbCB2);
		
		//-----------------------------------------------------------------------------------------------------
		
		rbBoton1=new JRadioButton();
		
		rbBoton1.setText("Radio 1");
		rbBoton1.setBounds(120, 140, 67, 23);
		contenedor.add(rbBoton1);
		
		//-----------------------------------------------------------------------------------------------------
		
		rbBoton2=new JRadioButton();
		
		rbBoton2.setText("Radio 2");
		rbBoton2.setBounds(183, 140, 80, 23);
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
		lbEtiqueta.setBounds(120, 50, 120, 23);
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
		deslizador.addChangeListener(this);
		contenedor.add(deslizador);
		
		//-----------------------------------------------------------------------------------------------------
		
		spiner=new JSpinner();
		
		spiner.setBounds(430, 105, 100, 30);
		spiner.setValue(30);
		spiner.addChangeListener(this);
		contenedor.add(spiner);
		
		//-----------------------------------------------------------------------------------------------------
		
		barra=new JProgressBar(0, 100);
		
		barra.setBounds(430, 190, 110, 23);
		barra.setValue(deslizador.getValue());
		contenedor.add(barra);
		
		//-----------------------------------------------------------------------------------------------------
		//**********************************************
		lbCombo=new JLabel();
		
		lbCombo.setText("JComboBox: ");
		lbCombo.setBounds(335, 50, 80, 23);
		contenedor.add(lbCombo);
		
		//-----------------------------------------------------------------------------------------------------
		
		lbSeparador=new JLabel();
		
		lbSeparador.setText("JSeparator: ");
		lbSeparador.setBounds(335, 80, 80, 23);
		contenedor.add(lbSeparador);
		
		//-----------------------------------------------------------------------------------------------------
		
		lbSpiner=new JLabel();
		
		lbSpiner.setText("JSpinner: ");
		lbSpiner.setBounds(335, 110, 80, 23);
		contenedor.add(lbSpiner);
		
		//-----------------------------------------------------------------------------------------------------
		
		lbDeslizador=new JLabel();
		
		lbDeslizador.setText("JSlider: ");
		lbDeslizador.setBounds(335, 155, 80, 23);
		contenedor.add(lbDeslizador);
		
		//-----------------------------------------------------------------------------------------------------
		
		lbBarra=new JLabel();
		
		lbBarra.setText("JProgressBar: ");
		lbBarra.setBounds(335, 190, 100, 23);
		contenedor.add(lbBarra);
		
		//-----------------------------------------------------------------------------------------------------
		
		add(contenedor);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if(arg0.getSource()==bBoton) {
			JOptionPane.showMessageDialog(null, validaSalida());
		}
	}
	
	private String validaSalida() {
		
		String cad="Seleccionado: \n";
		if(cbCB1.isSelected()) {
			cad=cad+"JCheckBox 1: Activado\n";
		} else {
			cad=cad+"JCheckBox 1: Desctivado\n";
		}
		if(cbCB2.isSelected()) {
			cad=cad+"JCheckBox 2\n";
		} else {
			cad=cad+"JCheckBox 2: Desctivado\n";
		}
		if(rbBoton1.isSelected()) {
			cad=cad+"JRadioButton 1: Activado\n";
		} else {
			cad=cad+"JRadioButton 1: Desctivado\n";
		}
		if(rbBoton2.isSelected()) {
			cad=cad+"JRadioButton 1: Activado\n";
		} else {
			cad=cad+"JRadioButton 2: Desctivado\n";
		}
		if(tbTogle.isSelected()) {
			cad=cad+"JToggleButton: Activado\n";
		} else {
			cad=cad+"JToggleButton: Desctivado\n";
		}
		cad=cad+"ComboBox: "+combo.getSelectedItem()+"\n";
		//cad=cad+"Spinner: "+spiner.getValue()+"\n";
		//cad=cad+"Slider: "+deslizador.getValue()+"\n";
		
		return cad;
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		int valor;
		
		if(arg0.getSource()==spiner) {
			valor=(int) spiner.getValue();
			deslizador.setValue(valor);
			barra.setValue(valor);
		}
		
		if(arg0.getSource()==deslizador) {
			valor=(int) deslizador.getValue();
			spiner.setValue(valor);
			barra.setValue(valor);
		}
	}
}
