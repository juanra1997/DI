/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miejcardlayout;

//import java.awt.BorderLayout;
//import java.awt.CardLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	
	Panel p=new Panel();
    PanelTexto pt=new PanelTexto();
    PanelBotones pb=new PanelBotones();
    
    public Ventana(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        //setLayout(new CardLayout());
        add(p);
    }
}
