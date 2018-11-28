package Examen;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

public class Panel extends JPanel implements KeyListener, FocusListener, ActionListener{

	private static final long serialVersionUID = 1L;
	
	JLabel fechaAlta, telefono, tipoMotor, PVP, tipoCoche, tipoCambio, datos, guardados;
	JButton aceptar, cancelar;
	JSpinner fechas;
	JTextField telefonot, PVPt;
	JRadioButton diesel, gasolina, turismo, monovolumen;
	ButtonGroup grupo, grupo2;
	JComboBox<String> combo;
	String[] cambio= {"Manual", "Automatico"};
	Font f;
	JTextArea area;

	public Panel() {
		
		f=new Font("Algerian", Font.PLAIN, 70);
		
		setLayout(null);
		
		setBackground(Color.CYAN);
		
		//-------------LABELS------------------------------
		
		fechaAlta=new JLabel("Fecha alta:");
		
		fechaAlta.setBounds(10, 30, 100, 20);
		add(fechaAlta);
		
		telefono=new JLabel("Telefono:");
		
		telefono.setBounds(10, 60, 100, 20);
		telefono.setToolTipText("Introduce un telefono de contacto");
		add(telefono);
		
		tipoMotor=new JLabel("Tipo de motor:");
		
		tipoMotor.setBounds(10, 90, 100, 20);
		tipoMotor.setToolTipText("Selecciona el tipo de motor que desees");
		add(tipoMotor);
		
		tipoCoche=new JLabel("Tipo de coche:");
		
		tipoCoche.setBounds(10, 120, 100, 20);
		tipoCoche.setToolTipText("Selecciona el tipo de coche que desees");
		add(tipoCoche);
		
		tipoCambio=new JLabel("Tipo de cambios:");
		
		tipoCambio.setBounds(10, 150, 100, 20);
		tipoCambio.setVisible(false);
		add(tipoCambio);
		
		PVP=new JLabel("P.V.P:");
		
		PVP.setBounds(10, 180, 100, 20);
		add(PVP);
		
		datos=new JLabel("DATOS");
		
		datos.setFont(f);
		datos.setBounds(600, 80, 300, 50);
		datos.setVisible(false);
		add(datos);
		
		guardados=new JLabel("GUARDADOS");
		guardados.setFont(f);
		guardados.setBounds(500, 180, 500, 50);
		guardados.setVisible(false);
		add(guardados);
		
		//-------------COMPONENTES------------------------------
		
		fechas=new JSpinner((new SpinnerDateModel()));

		fechas.setBounds(140, 30, 120, 20);
		add(fechas);
		
		telefonot=new JTextField();
		
		telefonot.setBounds(140, 60, 120, 20);
		telefonot.addKeyListener(this);
		add(telefonot);
		
		diesel=new JRadioButton("Diesel");
		
		diesel.setBounds(140, 90, 60, 20);
		diesel.setOpaque(false);
		diesel.setSelected(true);
		diesel.addActionListener(this);
		add(diesel);
		
		gasolina=new JRadioButton("Gasolina");
		
		gasolina.setBounds(210, 90, 80, 20);
		gasolina.setOpaque(false);
		gasolina.addActionListener(this);
		add(gasolina);
		
		grupo=new ButtonGroup();
		
		grupo.add(diesel);
		grupo.add(gasolina);
		
		turismo=new JRadioButton("Turismo");
		
		turismo.setBounds(140, 120, 80, 20);
		turismo.setOpaque(false);
		turismo.addActionListener(this);
		turismo.setSelected(true);
		add(turismo);
		
		monovolumen=new JRadioButton("Monovolumen");
		
		monovolumen.setBounds(210, 120, 110, 20);
		monovolumen.addActionListener(this);
		monovolumen.setOpaque(false);
		add(monovolumen);
		
		grupo2=new ButtonGroup();
		
		grupo2.add(turismo);
		grupo2.add(monovolumen);
		
		combo=new JComboBox<String>(cambio);
		
		combo.setBounds(140, 150, 110, 20);
		combo.setVisible(false);
		add(combo);
		
		PVPt=new JTextField();
		
		PVPt.setBounds(140, 180, 120, 20);
		PVPt.addKeyListener(this);
		PVPt.addFocusListener(this);
		add(PVPt);
		
		//---------------BOTONES----------------------------
		
		aceptar=new JButton("Aceptar");
		
		aceptar.setBounds(90, 250, 100, 30);
		aceptar.addActionListener(this);
		add(aceptar);
		
		cancelar=new JButton("Cancelar");
		
		cancelar.setBounds(210, 250, 100, 30);
		cancelar.addActionListener(this);
		add(cancelar);
		
		//---------MICOMPONENTE-------------------------------
		
		area=new JTextArea();
		
		area.setToolTipText("Introduce aqui tus observaciones");
		area.setBounds(50, 300, 300, 100);
		area.setLineWrap(true);
		add(area);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//if(e.getSource()==telefonot) {
			if(!Character.isDigit(e.getKeyChar())) {
				e.consume();
			//}
			//if(e.getSource()==PVPt) {
				//try {
					/*if(Double.parseDouble(PVPt.getText())>50000) {
						PVPt.setText("50000");
					}*/
				//} catch(Exception ex) {
					
				//}
			//}
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		try {
			if(Double.parseDouble(PVPt.getText())>50000) {
				PVPt.setText("50000");
			}
		}catch(Exception e) {
			
		}
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		try {
			if(Double.parseDouble(PVPt.getText())>50000) {
				PVPt.setText("50000");
			}
		}catch(Exception e) {
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cancelar) {
			telefonot.setText("");
			PVPt.setText("");
			diesel.setSelected(true);
			//diesel.setSelected(false);
			turismo.setSelected(true);
			//monovolumen.setSelected(false);
			datos.setVisible(false);
			guardados.setVisible(false);
			combo.setVisible(false);
			tipoCambio.setVisible(false);
		}
		if(e.getSource()==aceptar) {
			if(telefonot.getText().length()==0||PVPt.getText().length()==0) {
		
			JOptionPane.showMessageDialog(null, "Faltan datos por rellenar");
			}else {
				datos.setVisible(true);
				guardados.setVisible(true);
				telefonot.setText("");
				PVPt.setText("");
				diesel.setSelected(true);
				//diesel.setSelected(false);
				turismo.setSelected(true);
				//monovolumen.setSelected(false);
				combo.setVisible(false);
				tipoCambio.setVisible(false);
			}
		}
		if(e.getSource()==monovolumen||e.getSource()==gasolina||e.getSource()==diesel||e.getSource()==turismo) {
			if((turismo.isSelected()&&gasolina.isSelected())||(monovolumen.isSelected()&&diesel.isSelected())) {
				combo.setVisible(true);
				tipoCambio.setVisible(true);
			}else {
				combo.setVisible(false);
				tipoCambio.setVisible(false);
			}
		}
	}
}
