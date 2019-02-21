/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorpfinal;

import controlador.CtrlVistaServidor;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.VistaServidor;

/**
 *
 * @author Juanra
 */
public class ServidorPFinal {

    /**
     * @param args the command line arguments
     */
    
    /*static*/ VistaServidor vista;
    //static ArrayList<PrintWriter> salida;
    /*static*/ ServerSocket socket;
    /*static*/public boolean seguir;
    static CtrlVistaServidor ctrl;
    
    public ServidorPFinal() {
        // TODO code application logic here
        
        //salida=new ArrayList<PrintWriter>();
        vista=new VistaServidor();
        vista.setVisible(true);
        seguir=true;
        ctrl=new CtrlVistaServidor(this, vista.boton);
        
        /*try {
            
            socket=new ServerSocket(15001);
            
            while(seguir){
                
                (new Thread(new HiloServidor(socket.accept(), vista.area))).start();
                //System.out.println("Hola");
                //System.out.println(seguir);
                
            }
            
        } catch (IOException ex) {
            
            Logger.getLogger(ServidorPFinal.class.getName()).log(Level.SEVERE, null, ex);
        
        }finally{
            
            try {
                
                socket.close();
                
            } catch (IOException ex) {
                
                Logger.getLogger(ServidorPFinal.class.getName()).log(Level.SEVERE, null, ex);
            
            }
        }*/
        /*JOptionPane.showMessageDialog(null, "Se ha cerrado el servidor");
        System.exit(0);*/
    }
    
    public void iniciar(){
        
        try {
            
            socket=new ServerSocket(15001);
            
            while(seguir){
                
                (new Thread(new HiloServidor(socket.accept(), vista.area))).start();
                //System.out.println("Hola");
                //System.out.println(seguir);
                
            }
            
        } catch (IOException ex) {
            
            Logger.getLogger(ServidorPFinal.class.getName()).log(Level.SEVERE, null, ex);
        
        }finally{
            
            try {
                
                socket.close();
                
            } catch (IOException ex) {
                
                Logger.getLogger(ServidorPFinal.class.getName()).log(Level.SEVERE, null, ex);
            
            }
        }
        
        JOptionPane.showMessageDialog(null, "Se ha cerrado el servidor");
        System.exit(0);
        
    }
    
}
