/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miejcardlayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
//import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Juanra
 */
public class PanelBotones extends JPanel {

	private static final long serialVersionUID = 1L;
	
	JButton primero, previo, siguiente, ultimo;
    
    public PanelBotones(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        setPreferredSize(new Dimension(1000, 1000));
        
        //add(Box.createGlue());
        
        primero=new JButton("Primero");
        primero.setSize(200, 100);
        //primero.setAlignmentX(CENTER_ALIGNMENT);
        add(primero);
        
        previo=new JButton("Previo");
        previo.setSize(200, 100);
        //previo.setAlignmentX(CENTER_ALIGNMENT);
        add(previo);
        
        siguiente=new JButton("Siguiente");
        siguiente.setSize(200, 100);
        //siguiente.setAlignmentX(CENTER_ALIGNMENT);
        add(siguiente);
        
        ultimo=new JButton("Ultimo");
        ultimo.setSize(200, 100);
        //ultimo.setAlignmentX(CENTER_ALIGNMENT);
        add(ultimo);
        
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        //add(Box.createGlue());
    }
}
