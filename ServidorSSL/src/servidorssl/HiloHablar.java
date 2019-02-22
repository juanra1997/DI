/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorssl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/**
 *
 * @author Juanra
 */
public class HiloHablar implements Runnable{
    
    ArrayList<PrintWriter> salidas;
    Scanner sc;
    boolean seguir;
    String cad;
    SSLSocketFactory serverfac;
    SSLSocket cliente;
    //ServidorSSL server;
    
    public HiloHablar(ArrayList<PrintWriter> array/*, ServidorSSL s*/){
        
        salidas=array;
        sc=new Scanner(System.in);
        seguir=true;
        serverfac=(SSLSocketFactory) SSLSocketFactory.getDefault();
        //server=s;
        
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while(seguir){
            cad=sc.nextLine();
            if(!cad.equalsIgnoreCase("serverexit")){
                cad="[Servidor]>"+cad;
                for(int i=0; i<salidas.size(); i++){
                    salidas.get(i).println(cad);
                }
            }else{  
                    
                seguir=false;
                ServidorSSL.continuar=false;
                try {
                    for(int i=0; i<salidas.size(); i++){
                        salidas.get(i).println(cad);
                    }
                    cliente=(SSLSocket) serverfac.createSocket("localhost", 11000);
                } catch (IOException ex) {
                    Logger.getLogger(HiloHablar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
