/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientessl;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juanra
 */
public class HiloRecibir implements Runnable{
    
    BufferedReader in;
    boolean continuar;
    String cad;
    
    public HiloRecibir(BufferedReader bf){
        
        in=bf;
        continuar=true;
        
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while(continuar){
            try {
                cad=in.readLine();
            } catch (IOException ex) {
                Logger.getLogger(HiloRecibir.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(cad.equalsIgnoreCase("serverexit")){
                System.exit(0);
            }
            System.out.println(cad);
        }
    }
    
}
