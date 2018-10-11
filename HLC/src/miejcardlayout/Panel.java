/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miejcardlayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author Juanra
 */
public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	PanelBotones pb;
    PanelTexto pt;
    
    public Panel(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        pt=new PanelTexto();
        pt.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        add(pt);
        
        pb=new PanelBotones();
        pb.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        add(pb);
    }
}