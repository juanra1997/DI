/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import servidorpfinal.ServidorPFinal;

/**
 *
 * @author Juanra
 */
public class CtrlVistaServidor implements ActionListener{
    
    JButton boton;
    Socket socket;
    ServidorPFinal servidor;
    //boolean seguir;
    
    public CtrlVistaServidor(ServidorPFinal s, JButton b){
        
        servidor=s;
        boton=b;
        
        boton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==boton){
            
            servidor.seguir=false;
            //System.out.println(seguir);
            
            try {
                
                socket = new Socket("localhost", 15001);
                
            } catch (IOException ex) {
                
                Logger.getLogger(CtrlVistaServidor.class.getName()).log(Level.SEVERE, null, ex);
            
            }
        }
    }
}
