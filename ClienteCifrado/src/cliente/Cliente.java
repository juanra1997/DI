package cliente;

import java.net.*;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import static java.util.Arrays.copyOf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Cliente {

    static String pass = "Secreto";
    static byte[] fraseBytes;
    static byte[] passbyteprov;
    static byte[] passbytebuena;
    static byte[] frasecifrada;
    static SecretKey clave;
    static Cipher cifrador;
    static Recibir recibir;
    static Socket socket;
    static InetAddress ipDestino;
    static int puerto;
    static Base64.Encoder encoder = Base64.getEncoder();
    static String cadO;

    public static void main(String[] args) {
        try {

            passbyteprov = pass.getBytes("UTF8");
            passbytebuena = copyOf(passbyteprov, 16);
            clave = new SecretKeySpec(passbytebuena, "AES");
            cifrador = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cifrador.init(Cipher.ENCRYPT_MODE, clave);

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (args.length < 2) {
            System.err.println("Error, se esperaba direccion IP y Puerto TCP");
            System.err.println("Uso: \"java ClienteTcp1 dirIP Puerto\"");
            System.exit(-1);
        }

        Scanner teclado = new Scanner(System.in);

        try {
            ipDestino = InetAddress.getByName(args[0]);
            puerto = Integer.parseInt(args[1]);
            socket = new Socket(ipDestino, puerto);
        } catch (UnknownHostException ex) {
            System.err.println("Imposible resolver direccion Servidor, verífique sintaxis!!!");
            System.exit(-1);
        } catch (NumberFormatException ex) {
            System.err.println("Formato de puerto INVALIDO!!!, debe ser un numero 1-65000");
            System.exit(-1);
        } catch (IOException ex) {
            System.out.println("El servidor no esta activo");
            System.exit(0);
        }


            recibir = new Recibir(socket, clave/*, cifrador*/);
            recibir.start();

            

        //--------------------------------------------------------
        try (PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);) {

            do {

                cadO = teclado.nextLine();
                //if(!cadO.equalsIgnoreCase("exit")){
                    salida.println(encoder.encodeToString(cifrador.doFinal(cadO.getBytes("UTF8")))/*mandar*/);
                //}
                //System.out.println(cadO);

            } while (!cadO.equalsIgnoreCase("exit"));
            
            System.exit(0);

        } catch (Exception ex) {
        }
    }
}

class Recibir extends Thread {

    boolean fin = false;
    Socket socket;
    BufferedReader entrada;
    String cadI;
    SecretKey clave;
    Cipher cifrador;
    Base64.Decoder decoder = Base64.getDecoder();

    public Recibir(Socket sockete, SecretKey c) {

        socket = sockete;
        clave=c;

        
        
        try {
            cifrador=Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cifrador.init(Cipher.DECRYPT_MODE, clave);
        } catch (InvalidKeyException ex) {

        } catch (NoSuchAlgorithmException ex) {

        } catch (NoSuchPaddingException ex) {

        }

    }

    @Override
    public void run() {
        try {
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException ex) {

        }
        while (!fin) {
            try {
                
                cadI = entrada.readLine().trim();

            } catch (IOException ex) {

            }
            if (cadI != null) {
                System.out.println("Frase original:" + cadI);
                try {

                    System.out.println("Frase cifrada:" + new String(cifrador.doFinal(decoder.decode(cadI.getBytes("UTF8")))));
                } catch (IllegalBlockSizeException ex) {

                } catch (BadPaddingException ex) {

                } catch (UnsupportedEncodingException ex) {

                }
                cadI=null;
            }
        }
    }
}
