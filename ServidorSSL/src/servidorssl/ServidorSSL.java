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
import java.net.SocketException;
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
    public static boolean continuar;
    static ArrayList<PrintWriter> salidas;
    //static Process proceso;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //try {
            // TODO code application logic here

            //Runtime.getRuntime().exec("shutdown /s");
            
            /*proceso=*///Runtime.getRuntime().exec("keytool -genkeypair -keyalg RSA -keysize 2048 -deststoretype pkcs12 -keystore ./sslstore -alias SSLserver -storepass serverstore -keypass serverstore");
            //proceso.waitFor();
            /*proceso=*///Runtime.getRuntime().exec("keytool -export -alias SSLserver -keystore ./sslstore -file sslserver.crt");
            //proceso.waitFor();
        /*} catch (IOException ex) {
            Logger.getLogger(ServidorSSL.class.getName()).log(Level.SEVERE, null, ex);
        }*//* catch (InterruptedException ex) {
            Logger.getLogger(ServidorSSL.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        System.setProperty("javax.net.ssl.keyStore", "AlmacenSSL");
        System.setProperty("javax.net.ssl.keyStorePassword", "usuario");
        
        salidas=new ArrayList<>();
        continuar=true;
        cont=1;
        //sc=new Scanner(System.in);
        serverfac=(SSLServerSocketFactory)SSLServerSocketFactory.getDefault();
        try {

            server=(SSLServerSocket) serverfac.createServerSocket(11000);
            
            (new Thread(new HiloHablar(salidas))).start();
            
            while(continuar){
                //System.out.println(server.getInetAddress());
                cliente=(SSLSocket) server.accept();
                in=new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                out=new PrintWriter(cliente.getOutputStream(), true);
                salidas.add(out);
                (new Thread(new HiloRecibir(in, cont, salidas))).start();
                if(continuar){
                    System.out.println("Ha llegado un cliente, cliente numero "+cont);
                    cont++;
                }
            //while(!cad.equalsIgnoreCase("serverexit")){
                //cad=sc.nextLine();
                //out.println(cad);
            //}
            }
            
        /*} catch(SocketException ex){
            
            System.out.println("Estoy aqui");*/

        } catch (IOException ex) {
            //Logger.getLogger(ServidorSSL.class.getName()).log(Level.SEVERE, null, ex);
            //System.out.println("Estoy aqui");

        }catch (Exception e){
            
            //System.out.println("Estoy aqui2");
        }finally{
            /*try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(ServidorSSL.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            //out.close();
        }
        System.exit(0);
        
    }
    
}
