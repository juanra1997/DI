/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miejcardlayout;

//import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
//import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame {

    private static final long serialVersionUID = 1L;
	
    Panel p0=new Panel();
    Panel p1=new Panel();
    Panel p2=new Panel();
    Panel p3=new Panel();
    PanelTexto pt=new PanelTexto();
    PanelBotones pb=new PanelBotones();
    CardLayout cl;
    
    public Ventana(){
        
        iniciaComponentes();
        
    }
    
    public void iniciaComponentes(){
        
    	cl=new CardLayout();
        setLayout(cl);
        p0.getPt().getTexto().setText("Panel 1");
        p0.getPt().setBackground(Color.WHITE);
        p0.getPb().setBackground(Color.WHITE);
        /*p.getPb().getPrimero().addActionListener(new ActionListener(){
        
        });*/
        add(p0);
        
        p1.getPt().setBackground(Color.CYAN);
        p1.getPb().setBackground(Color.CYAN);
        p1.getPt().getTexto().setText("Panel 2");
        add(p1);
        
        p2.getPt().setBackground(Color.RED);
        p2.getPb().setBackground(Color.RED);
        p2.getPt().getTexto().setText("Panel 3");
        add(p2);
        
        p3.getPt().setBackground(Color.BLACK);
        p3.getPb().setBackground(Color.BLACK);
        p3.getPt().getTexto().setText("Panel 4");
        add(p3);
    }
}

