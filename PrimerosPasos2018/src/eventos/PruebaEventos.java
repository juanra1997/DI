package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaEventos {
	
	public static void main(String[] args) {
		miVentana obj=new miVentana();
		obj.setVisible(true);
	}
}
	
class miVentana extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	JButton boton=new JButton("AZUL");
	JButton boton1=new JButton("AMARILLO");
	JButton boton2=new JButton("ROJO");
	JButton boton3=new JButton("VERDE");
	JButton boton4=new JButton("NEGRO");
	boolean azul=false, amarillo=false, rojo=false, verde=false, negro=false;
	
	public miVentana() {
		//JFrame ventana=new JFrame();
		
		setLayout(null);
		setSize(800, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setResizable(false);
		
		//JButton boton=new JButton("AZUL");
		
		boton.setBounds(10, 20, 200, 100);
		boton.addActionListener(this);
		add(boton);
		
		//JButton boton1=new JButton("AMARILLO");
		
		boton1.setBounds(580, 20, 200, 100);
		boton1.addActionListener(this);
		add(boton1);
		
		//JButton boton2=new JButton("ROJO");
		
		boton2.setBounds(10, 650, 200, 100);
		boton2.addActionListener(this);
		add(boton2);
		
		//JButton boton3=new JButton("VERDE");
		
		boton3.setBounds(580, 650, 200, 100);
		boton3.addActionListener(this);
		add(boton3);
		
		//JButton boton4=new JButton("NEGRO");
		
		boton4.setBounds(310, 340, 200, 100);
		boton4.addActionListener(this);
		add(boton4);
		
		//Color de ventana
		
		//getContentPane().setBackground(Color.WHITE);
		
		//setVisible(true);
	
	}

	@Override
public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton) {
			
			if(azul==false) {
				getContentPane().setBackground(Color.CYAN);
				azul=true;
				amarillo=false;
				rojo=false;
				verde=false;
				negro=false;
				boton.setBackground(Color.RED);
				boton1.setBackground(Color.RED);
				boton2.setBackground(Color.RED);
				boton3.setBackground(Color.RED);
				boton4.setBackground(Color.RED);
			}else {
				getContentPane().setBackground(null);
				azul=false;
				boton.setBackground(null);
				boton1.setBackground(null);
				boton2.setBackground(null);
				boton3.setBackground(null);
				boton4.setBackground(null);
			}
		}
		
		if(e.getSource()==boton1) {
			
			if(amarillo==false) {
				getContentPane().setBackground(Color.YELLOW);
				amarillo=true;
				azul=false;
				rojo=false;
				verde=false;
				negro=false;
				boton.setBackground(Color.BLUE);
				boton1.setBackground(Color.BLUE);
				boton2.setBackground(Color.BLUE);
				boton3.setBackground(Color.BLUE);
				boton4.setBackground(Color.BLUE);
			}else {
				getContentPane().setBackground(null);
				amarillo=false;
				boton.setBackground(null);
				boton1.setBackground(null);
				boton2.setBackground(null);
				boton3.setBackground(null);
				boton4.setBackground(null);
			}
		}
		
		if(e.getSource()==boton2) {
			
			if(rojo==false) {
				getContentPane().setBackground(Color.RED);
				rojo=true;
				azul=false;
				amarillo=false;
				verde=false;
				negro=false;
				boton.setBackground(Color.CYAN);
				boton1.setBackground(Color.CYAN);
				boton2.setBackground(Color.CYAN);
				boton3.setBackground(Color.CYAN);
				boton4.setBackground(Color.CYAN);
			}else {
				getContentPane().setBackground(null);
				rojo=false;
				boton.setBackground(null);
				boton1.setBackground(null);
				boton2.setBackground(null);
				boton3.setBackground(null);
				boton4.setBackground(null);
			}
		}
		
		if(e.getSource()==boton3) {
			
			if(verde==false) {
				getContentPane().setBackground(Color.GREEN);
				verde=true;
				azul=false;
				amarillo=false;
				rojo=false;
				negro=false;
				boton.setBackground(Color.MAGENTA);
				boton1.setBackground(Color.MAGENTA);
				boton2.setBackground(Color.MAGENTA);
				boton3.setBackground(Color.MAGENTA);
				boton4.setBackground(Color.MAGENTA);
			}else {
				getContentPane().setBackground(null);
				verde=false;
				boton.setBackground(null);
				boton1.setBackground(null);
				boton2.setBackground(null);
				boton3.setBackground(null);
				boton4.setBackground(null);
			}
		}
		
		if(e.getSource()==boton4) {
			
			if(negro==false) {
				getContentPane().setBackground(Color.BLACK);
				negro=true;
				azul=false;
				amarillo=false;
				rojo=false;
				verde=false;
				boton.setBackground(Color.WHITE);
				boton1.setBackground(Color.WHITE);
				boton2.setBackground(Color.WHITE);
				boton3.setBackground(Color.WHITE);
				boton4.setBackground(Color.WHITE);
			}else {
				getContentPane().setBackground(null);
				negro=false;
				boton.setBackground(null);
				boton1.setBackground(null);
				boton2.setBackground(null);
				boton3.setBackground(null);
				boton4.setBackground(null);
			}
		}
	}
}

//Crea una ventana, en la que se muestre un boton con el titulo saludo y otro con el titulo despedida, al pulsar
//el boton saludo aparezca un mensaje que diga hola y al pulsar el boton despedida aparezca adios