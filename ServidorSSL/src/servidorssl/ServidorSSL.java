/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorssl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

/**
 *
 * @author Juanra
 */
public class ServidorSSL {
    
    //static Scanner sc;
    static SSLServerSocketFactory serverfac;
    static SSLServerSocket server;
    static SSLSocket cliente;
    static BufferedReader in;
    static PrintWriter out;
    static String cad;
    static int cont;
    static boolean continuar;
    static ArrayList<PrintWriter> salidas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        salidas=new ArrayList<>();
        continuar=true;
        cont=1;
        //sc=new Scanner(System.in);
        serverfac=(SSLServerSocketFactory)SSLServerSocketFactory.getDefault();
        try {

            server=(SSLServerSocket) serverfac.createServerSocket(11000);
            
            while(!continuar){
                cliente=(SSLSocket) server.accept();
                in=new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                out=new PrintWriter(cliente.getOutputStream(), true);
                salidas.add(out);
                System.out.println("Ha llegado un cliente, cliente numero "+cont);
            //while(!cad.equalsIgnoreCase("serverexit")){
                //cad=sc.nextLine();
                //out.println(cad);
            //}
            }

        } catch (IOException ex) {
            Logger.getLogger(ServidorSSL.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            /*try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(ServidorSSL.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            out.close();
        }
        System.exit(0);
        
    }
    
}
