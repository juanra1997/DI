package ventanaHotel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
/*import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;*/
import javax.swing.JButton;
import javax.swing.JComponent;
//import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;*/
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class MiPanel extends JPanel /*implements ActionListener*/{

	private static final long serialVersionUID = 1L;
	
	/*private JMenuBar miBarra;
	private JMenu archivo, reservas, ayuda;
	private JMenuItem salir, alta, baja, acerca;*/
	private JButton boton;
	private Ventana topFrame;
	
	public MiPanel() {
		
		topFrame=(Ventana) SwingUtilities.getWindowAncestor(this);
		
		setLayout(null);
		setBackground(Color.WHITE);
		
		//Panel superior de la ventana-------------------------------------------------------------
		
		Toolkit t=Toolkit.getDefaultToolkit();
		/*setSize(t.getScreenSize().width/2, t.getScreenSize().height/2);*/
		//setIconImage(t.getImage("f1y0bb.png"));
		
		//Barra------------------------------------------------------------------------------------
		
		/*miBarra=new JMenuBar();
		
		miBarra.setBackground(Color.WHITE);
		
		archivo=new JMenu("Archivo");
		reservas=new JMenu("Reservas");
		
		reservas.setMnemonic(KeyEvent.VK_R);
		
		ayuda=new JMenu("Ayuda");
		
		salir=new JMenuItem("Salir");
		
		salir.addActionListener(this);
		
		alta=new JMenuItem("Alta");
		
		alta.addActionListener(this);
		
		baja=new JMenuItem("Baja");
		
		baja.addActionListener(this);
		
		acerca=new JMenuItem("Acerca de...");
		
		acerca.addActionListener(this);
		
		archivo.add(salir);
		reservas.add(alta);
		reservas.add(baja);
		ayuda.add(acerca);
		
		miBarra.add(archivo);
		miBarra.add(reservas);
		miBarra.add(ayuda);
		
		setJMenuBar(miBarra);*/
		
		//Boton------------------------------------------------------------------------------------
		
		boton=new JButton("Reservas");
		
		boton.setPreferredSize(new Dimension(100, 35));
		boton.setBounds(t.getScreenSize().width/5+50, t.getScreenSize().height/5-20, 100, 40);
		//boton.addActionListener();
		boton.setBackground(Color.BLACK);
		boton.setForeground(Color.WHITE);
		boton.setFocusPainted(false);
		
		add(boton);
		
		//Botones----------------------------------------------------------------------------------
		
		Push palta=new Push("alta");
		Push pbaja=new Push("baja");
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		KeyStroke alta=KeyStroke.getKeyStroke("ctrl A");
		KeyStroke baja=KeyStroke.getKeyStroke("ctrl B");
		
		mapaEntrada.put(alta, "darAlta");
		mapaEntrada.put(baja, "darBaja");
		
		ActionMap mapaAction=getActionMap();
		
		mapaAction.put("darAlta", palta);	
		mapaAction.put("darBaja", pbaja);
		
		//-----------------------------------------------------------------------------------------
	}

	public JButton getBoton() {
		return boton;
	}
	
	private class Push extends AbstractAction {
		
		private static final long serialVersionUID = 1L;
		
		String action;
		
		public Push(String a) {
			
			action=a;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(action.equals("baja")) {
				
				JOptionPane.showMessageDialog(null, "La aplicacion no esta desarrollada");
			}
			if(action.equals("alta")) {
				
				Dialogo obj=new Dialogo(topFrame, true);
				obj.setLocationRelativeTo(null);
				obj.setResizable(false);
				obj.setTitle("Alta reservas");
				obj.setVisible(true);
			}
		}
		
	}

	//-----------------------FALTA EL BOTON DE ALTA QUE CREA UN JDIALOG
	/*@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==salir) {
			
			System.exit(0);
		}
		if(e.getSource()==baja) {
			
			JOptionPane.showMessageDialog(null, "La aplicacion no esta desarrollada");
		}
		if(e.getSource()==acerca) {
			
			JOptionPane.showMessageDialog(null, "Aplicacion creada por Juan Raul Mellado Garcia");
		}
		if(e.getSource()==alta||e.getSource()==boton) {
			
			Dialogo obj=new Dialogo(this, true);
			obj.setLocationRelativeTo(null);
			obj.setResizable(false);
			obj.setTitle("Gestión Hotel Juan Raul Mellado Garcia");
			obj.setVisible(true);
		}
	}*/

}
