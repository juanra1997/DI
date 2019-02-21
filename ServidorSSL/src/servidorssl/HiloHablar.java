/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorssl;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juanra
 */
public class HiloHablar implements Runnable{
    
    ArrayList<PrintWriter> salidas;
    Scanner sc;
    boolean seguir;
    String cad;
    
    public HiloHablar(ArrayList<PrintWriter> array){
        
        salidas=array;
        sc=new Scanner(System.in);
        seguir=true;
        
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while(seguir){
            cad=sc.nextLine();
            if(!cad.equalsIgnoreCase("serverexit")){
                for(int i=0; i<salidas.size(); i++){
                    salidas.get(i).println(cad);
                }
            }else{
                seguir=false;
            }
        }
    }
    
}
