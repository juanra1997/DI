/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorssl;

import java.io.BufferedReader;

/**
 *
 * @author Juanra
 */
public class HiloRecibir implements Runnable{
    
    BufferedReader in;
    
    public HiloRecibir(BufferedReader bf){
        
        in=bf;
        
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
