/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientessl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/**
 *
 * @author Juanra
 */
public class ClienteSSL {
    
    static Scanner sc;
    static SSLSocketFactory serverfac;
    static SSLSocket cliente;
    static BufferedReader in;
    static PrintWriter out;
    static String cad;
    static boolean continuar;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("javax.net.ssl.trustStore", "AlmacenClienteSSL");
        System.setProperty("javax.net.ssl.trustStorePassword", "usuario");
        continuar=true;
        sc=new Scanner(System.in);
        serverfac=(SSLSocketFactory) SSLSocketFactory.getDefault();
        
        try {
            cliente=(SSLSocket) serverfac.createSocket("localhost", 11000);
            in=new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            out=new PrintWriter(cliente.getOutputStream(), true);
            (new Thread(new HiloRecibir(in))).start();
            while(continuar){
                cad=sc.nextLine();
                out.println(cad);
                if(cad.equalsIgnoreCase("exit")){
                    continuar=false;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ClienteSSL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
        
    }
    
}
