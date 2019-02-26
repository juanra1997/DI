/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorpfinal;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Files;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import static java.util.Arrays.copyOf;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JTextArea;
import parteFichero.ParteFichero;

/**
 *
 * @author Juanra
 */
public class HiloServidor implements Runnable {

    Socket con;
    JTextArea area;
    BufferedReader in;
    //PrintWriter out;
    String frase, clave, cifrado, accion, resultado;
    byte[] objetobyte, passbprov, passb, objetoconvertido;
    SecretKey pass;
    Cipher cifrador;
    Base64.Encoder codificador;
    Base64.Decoder decodificador;
    ParteFichero pfich;
    Object aux;
    boolean creado;
    File recibido, elegido;
    ObjectInputStream oin;
    FileOutputStream fos;
    int leidos;
    BufferedInputStream bis;
    ObjectOutputStream oout;
    String f;

    public HiloServidor(Socket c, JTextArea a) {

        con = c;
        area = a;
        codificador = Base64.getEncoder();
        decodificador = Base64.getDecoder();
        creado = false;
        //leidos=0;

    }

    public void realizarAccion(String formato) {
        
        System.out.println("Listo");
        
        System.out.println(formato);

        try {

            if (formato.equalsIgnoreCase("frase")) {

                frase = in.readLine().trim();
                System.out.println(frase);
                
                System.out.println("Listo2");

            } else if (formato.equalsIgnoreCase("archivo")) {
                
                System.out.println("Listo para recibir el archivo");
                
                oin = new ObjectInputStream(con.getInputStream());

                do {

                    pfich = new ParteFichero();
                    
                    System.out.println("ParteFIchero creada");

                    aux = oin.readObject();

                    System.out.println("Recibiendo");

                    if (aux instanceof ParteFichero) {

                        pfich = (ParteFichero) aux;

                        if (!creado) {

                            recibido = new File(pfich.getNombreFichero());
                            creado = true;
                            fos = new FileOutputStream(recibido);

                        }

                        fos.write(pfich.getParte(), 0, pfich.getBytesValidos());

                    }

                } while (!pfich.isUltimaParte());

                fos.close();

            }

            clave = in.readLine().trim();
            cifrado = in.readLine().trim();
            accion = in.readLine().trim();

            //if (!frase.isEmpty()) {
            area.setText(area.getText() + "***********************************\n");

            if (formato.equalsIgnoreCase("frase")) {

                area.setText(area.getText() + "Ha llegado una cadena\n");

            } else if (formato.equalsIgnoreCase("archivo")) {

                area.setText(area.getText() + "Ha llegado un archivo\n");

            }

            passbprov = clave.getBytes("UTF8");

            switch (cifrado) {

                case "des":

                    area.setText(area.getText() + "Ha seleccionado 3DES como cifrado\n");
                    passb = copyOf(passbprov, 24);
                    pass = new SecretKeySpec(passb, "DESede");
                    cifrador = Cipher.getInstance("DESede");
                    break;

                case "aes16":

                    area.setText(area.getText() + "Ha seleccionado AES 16 como cifrado\n");
                    passb = copyOf(passbprov, 16);
                    pass = new SecretKeySpec(passb, "AES");
                    cifrador = Cipher.getInstance("AES/ECB/PKCS5PADDING");
                    break;

                case "aes32":

                    area.setText(area.getText() + "Ha seleccionado AES 32 como cifrado\n");
                    passb = copyOf(passbprov, 32);
                    pass = new SecretKeySpec(passb, "AES");
                    cifrador = Cipher.getInstance("AES/ECB/PKCS5PADDING");
                    break;

            }

            switch (accion) {

                case "cifrar":

                    area.setText(area.getText() + "Ha seleccionado cifrar como accion\nConvirtiendo la cadena...\n");
                    cifrador.init(Cipher.ENCRYPT_MODE, pass);
                    if (formato.equalsIgnoreCase("frase")) {
                        objetobyte = frase.getBytes("UTF8");
                    } else if (formato.equalsIgnoreCase("archivo")) {

                        objetobyte = Files.readAllBytes(recibido.toPath());

                    }
                    objetoconvertido = cifrador.doFinal(objetobyte);
                    if (formato.equalsIgnoreCase("frase")) {

                        area.setText(area.getText() + "Cadena convertida\nDevolviendo cadena...\n");
                        //System.out.println(codificador.encodeToString(objetoconvertido));
                        oout.writeObject(codificador.encodeToString(objetoconvertido));
                        area.setText(area.getText() + "Cadena devuelta\n");

                    } else if (formato.equalsIgnoreCase("archivo")) {

                        area.setText(area.getText() + "Archivo convertido\n");
                        area.setText(area.getText() + "Escribiendo archivo\n");
                        FileOutputStream stream = new FileOutputStream("cifrado" + recibido.getName());

                        try {

                            stream.write(objetoconvertido);
                            //System.out.println(objetoconvertido);

                        } catch (Exception e) {

                        } finally {

                            stream.close();

                        }
                        area.setText(area.getText() + "Archivo escrito\n");
                        //area.setText(area.getText() + "Archivo devuelto\n");
                        area.setText(area.getText() + "Devolviendo archivo...\n");
                        //area.setText(area.getText() + "Archivo devuelto\n");

                    }

                    break;

                case "descifrar":

                    area.setText(area.getText() + "Ha seleccionado descifrar como accion\nConvirtiendo la cadena...\n");
                    cifrador.init(Cipher.DECRYPT_MODE, pass);
                    if (formato.equalsIgnoreCase("frase")) {

                        objetobyte = decodificador.decode(frase);

                    } else if (formato.equalsIgnoreCase("archivo")) {

                        objetobyte = Files.readAllBytes(recibido.toPath());

                    }
                    objetoconvertido = cifrador.doFinal(objetobyte);
                    if (formato.equalsIgnoreCase("frase")) {
                        area.setText(area.getText() + "Cadena convertida\nDevolviendo cadena...\n");
                        oout.writeObject(new String(objetoconvertido));
                        area.setText(area.getText() + "Cadena devuelta\n");
                    } else if (formato.equalsIgnoreCase("archivo")) {

                        area.setText(area.getText() + "Archivo convertido\n");
                        area.setText(area.getText() + "Escribiendo archivo\n");
                        FileOutputStream stream = new FileOutputStream("descifrado" + recibido.getName());

                        try {

                            stream.write(objetoconvertido);
                            //System.out.println(objetoconvertido);

                        } catch (Exception e) {

                        } finally {

                            stream.close();

                        }
                        area.setText(area.getText() + "Archivo escrito\n");
                        //area.setText(area.getText() + "Archivo devuelto\n");
                        area.setText(area.getText() + "Devolviendo archivo...\n");

                        //area.setText(area.getText() + "Archivo devuelto\n");
                    }
                    break;

            }

            if (formato.equalsIgnoreCase("archivo")) {

                if (accion.equalsIgnoreCase("cifrar")) {

                    elegido = new File("cifrado" + recibido.getName());
                    //System.out.println("Holis");

                } else if (accion.equalsIgnoreCase("descifrar")) {

                    elegido = new File("descifrado" + recibido.getName());
                    //System.out.println("Holis");

                }
                
                bis = new BufferedInputStream(new FileInputStream(elegido));
                
                leidos=0;
                
                do {
                        
                        pfich = new ParteFichero();
                        pfich.setNombreFichero(elegido.getName());
                        leidos=bis.read(pfich.getParte());
                        
                        System.out.println("Supuestamente enviando");

                        if (leidos < 0) {
                            
                            break;
                        
                        }
                        
                        pfich.setBytesValidos(leidos);
                        
                        if (leidos < 1024) {
                        
                            pfich.setUltimaParte(true);
                        
                        } else {
                        
                            pfich.setUltimaParte(false);
                        
                        }
                        
                        oout.writeObject(pfich);
                    
                    } while(!pfich.isUltimaParte());
                
                area.setText(area.getText() + "Archivo enviado\n");
                
            }

            area.setText(area.getText() + "***********************************\n");

            area.setCaretPosition(area.getDocument().getLength());
            
            elegido=null;
            recibido=null;

            //}
        } catch (IOException ex) {

            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);

        } catch (InvalidKeyException ex) {

            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IllegalBlockSizeException ex) {

            //Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
            area.setText(area.getText() + "Error de codificacion\nNotificando...\n");
            try {
                oout.writeObject("Error en la codificacion");
            } catch (IOException ex1) {
                Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex1);
            }
            area.setText(area.getText() + "Notificado\n");
            area.setText(area.getText() + "***********************************\n");
            area.setCaretPosition(area.getDocument().getLength());

        } catch (BadPaddingException ex) {

            //Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
            area.setText(area.getText() + "Error de cifrado o contraseña\nNotificando...\n");
            try {
                oout.writeObject("Error en el tipo de cifrado o contraseña");
            } catch (IOException ex1) {
                Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex1);
            }
            area.setText(area.getText() + "Notificado\n");
            area.setText(area.getText() + "***********************************\n");
            area.setCaretPosition(area.getDocument().getLength());

        } catch (NoSuchAlgorithmException ex) {

            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);

        } catch (NoSuchPaddingException ex) {

            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {

                in.close();
                //out.close();
                if(f.equalsIgnoreCase("archivo")){
                    oin.close();
                    oout.close();
                }

            } catch (IOException ex) {

                Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }

    @Override
    public void run() {
        
        try {
            
            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            
            f = in.readLine();
            
            System.out.println("Formato leido");
            
            //if(f.equalsIgnoreCase("frase")){

            
            //out = new PrintWriter(con.getOutputStream(), true);
            
            //}else if(f.equalsIgnoreCase("archivo")){
            
            //oin = new ObjectInputStream(con.getInputStream());
            oout = new ObjectOutputStream(con.getOutputStream());
            
           // }


            System.out.println("Formato recibido");
            
            realizarAccion(f);

        } catch (IOException ex) {
            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
