/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miejcardlayout;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class PanelTexto extends JPanel{

	private static final long serialVersionUID = 1L;
	
	JTextField texto;
    
    public PanelTexto(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        //setSize(600, 200);
        
        texto=new JTextField();
        texto.setEditable(false);
        texto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        texto.setHorizontalAlignment(JTextField.CENTER);
        //texto.setMaximumSize(new Dimension(300, 100));
        texto.setPreferredSize(new Dimension(582,1200));
        add(texto);
        
        setSize(40,10);
        
        //setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
    }
}
