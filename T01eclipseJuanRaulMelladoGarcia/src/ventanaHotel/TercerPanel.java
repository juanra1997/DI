package ventanaHotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.MaskFormatter;

public class TercerPanel extends JPanel implements ActionListener, FocusListener{

	private static final long serialVersionUID = 1L;
	
	public JFormattedTextField tfechaEntrada, tfechaSalida;
	public MaskFormatter mfecha;
	public Date fecha, fechas;
	public DateFormat dateFormat;
	public JLabel fechaEntrada, fechaSalida, dias, tipoh, habitaciones, importe, info;
	public JTextField diast, importet;
	public JComboBox<String> tipo;
	public String[] tipos={"Simple", "Doble", "Suite"};
	public JSpinner numeroHabitaciones;
	public JCheckBox ninnos;
	public ExtraNinnos np;
	public JTextArea area;
	
	public TercerPanel() {
		
		fecha=new Date();
		
		setLayout(null);
		setBackground(Color.MAGENTA);
		
		try {
			mfecha=new MaskFormatter("##/##/####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tfechaEntrada=new JFormattedTextField(mfecha);		
		dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		tfechaEntrada.addFocusListener(this);
		tfechaEntrada.setText(dateFormat.format(fecha));
		tfechaEntrada.setBounds(130, 120, 150, 20);
		add(tfechaEntrada);
		
		tfechaSalida=new JFormattedTextField(mfecha);		
		//tfechaEntrada.setText(fecha.get);
		//System.out.println(fecha);
		//System.out.println(String.valueOf(fecha).substring(8, 10));
		String prueba=dateFormat.format(fecha);
		prueba=String.valueOf(Integer.parseInt(prueba.substring(0, 2))+1)+"/"+prueba.substring(3,5)+"/"+prueba.substring(6, 10);
		try {
			fechas=dateFormat.parse(prueba);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*System.out.println(prueba.substring(0, 2));
		System.out.println(prueba.substring(3, 5));
		System.out.println(prueba.substring(6, 10));*/
		tfechaSalida.setText(dateFormat.format(fechas));
		tfechaSalida.addFocusListener(this);
		tfechaSalida.setBounds(130, 150, 150, 20);
		add(tfechaSalida);
		
		fechaEntrada=new JLabel("Fecha de entrada:");
		
		fechaEntrada.setBounds(10, 120, 110, 20);
		add(fechaEntrada);
		
		fechaSalida=new JLabel("Fecha de salida:");
		
		fechaSalida.setBounds(10, 150, 110, 20);
		add(fechaSalida);
		
		dias=new JLabel("Dias de estancia:");
		
		dias.setBounds(10, 180, 110, 20);
		add(dias);
		
		diast=new JTextField();
		
		diast.setBounds(130, 180, 110, 20);
		diast.setHorizontalAlignment(JTextField.CENTER);
		diast.setText(String.valueOf(diferenciaEnDias(fecha, fechas)+1));
		//diast.addFocusListener(this);
		diast.setForeground(Color.BLACK);
		//diast.setEnabled(false);
		diast.setFocusable(false);
		add(diast);
		
		tipoh=new JLabel("Tipo de habitacion:");
		
		tipoh.setBounds(10, 210, 110, 20);
		add(tipoh);
		
		tipo=new JComboBox<String>(tipos);
		
		tipo.setBounds(130, 210, 110, 20);
		add(tipo);
		
		habitaciones=new JLabel("Habitaciones");
		
		habitaciones.setBounds(10, 240, 110, 20);
		add(habitaciones);
		
		 numeroHabitaciones=new JSpinner(new SpinnerNumberModel(1, 0, 50, 1));
		 
		 numeroHabitaciones.setBounds(130, 240, 110, 20);
		 add(numeroHabitaciones);
		 
		 ninnos=new JCheckBox("Niños");
		 
		 ninnos.setBounds(130, 270, 110, 20);
		 ninnos.setBackground(Color.MAGENTA);
		 ninnos.addActionListener(this);
		 ninnos.setFocusPainted(false);
		 add(ninnos);
		 
		 //------------------------------------------------------------------------------------------
		 
		 np=new ExtraNinnos();
		 
		 np.setBounds(10, 300, 480, 340);
		 np.setVisible(false);
		 add(np);
		 
		//------------------------------------------------------------------------------------------
		 
		 /*importe=new JLabel("Importe:");
		 
		 importe.setBounds(100, 520, 110, 20);
		 add(importe);
		 
		 importet=new JTextField();
		 
		 importet.setBounds(160, 520, 110, 20);
		 add(importet);*/
		 
		 info=new JLabel("DATOS DE LA HABITACION");
		 info.setBounds(70, 10, 400, 100);
		 info.setFont(new Font("Algerian", Font.PLAIN, 30));
		 add(info);
		 
		 area=np.area;
	}
	
	public static int diferenciaEnDias(Date fechaMayor, Date fechaMenor) {
		long diferenciaEn_ms = fechaMenor.getTime() - fechaMayor.getTime();
		long dias = diferenciaEn_ms / (1000 * 60 * 60 * 24);
		return (int) dias;
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ninnos) {
			
			if(ninnos.isSelected()) {
				
				np.setVisible(true);
			}else {
				
				np.setVisible(false);
			}
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		try {
			
			diast.setText(String.valueOf(diferenciaEnDias(dateFormat.parse(tfechaEntrada.getText()), dateFormat.parse(tfechaSalida.getText()))));
		}catch(Exception ex) {
			
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		/*if(e.getSource()==tfechaSalida) {
			
		}*/
		try {
	
			diast.setText(String.valueOf(diferenciaEnDias(dateFormat.parse(tfechaEntrada.getText()), dateFormat.parse(tfechaSalida.getText()))));
		}catch(Exception ex) {
			
		}
	}
}
