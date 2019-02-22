/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorssl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
    int num;
    ArrayList<PrintWriter> salidas;
    
    public HiloRecibir(BufferedReader bf, int i, ArrayList<PrintWriter> array){
        
        in=bf;
        continuar=true;
        num=i;
        salidas=array;
        
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while(continuar){
            
            try {
                cad=in.readLine();
            } catch (IOException ex) {
                Logger.getLogger(HiloRecibir.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex){
                //System.out.println("Estoy aqui 4");
            }
            System.out.println("[Cliente "+num+"]>"+cad);
            if(cad.equalsIgnoreCase("exit")){
                continuar=false;
            }else{
                for(int i=0; i<salidas.size(); i++){
                    if(i!=(num-1)){
                        salidas.get(i).println("[Cliente "+num+"]>"+cad);
                    }
                }
            }
            
        }
    }
    
}
