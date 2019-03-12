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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
import javax.crypto.CipherOutputStream;
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
    String frase, clave, cifrado, accion, resultado;
    byte[] objetobyte, passbprov, passb, objetoconvertido, buffer;
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
    FileInputStream fis;
    CipherOutputStream cip;

    public HiloServidor(Socket c, JTextArea a) {

        con = c;
        area = a;
        codificador = Base64.getEncoder();
        decodificador = Base64.getDecoder();
        //buffer = new byte[1024];
        
    }

    public void realizarAccion(String formato) {

        try {

            if (formato.equalsIgnoreCase("frase")) {

                frase = String.valueOf(oin.readObject()).trim();

            } else if (formato.equalsIgnoreCase("archivo")) {

                do {

                    pfich = new ParteFichero();
                    aux = oin.readObject();

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

            clave = String.valueOf(oin.readObject()).trim();
            cifrado = String.valueOf(oin.readObject()).trim();
            accion = String.valueOf(oin.readObject()).trim();
            area.setText(area.getText() + "***********************************\n");

            if (formato.equalsIgnoreCase("frase")) {

                area.setText(area.getText() + "Ha llegado una cadena\n");
                area.setCaretPosition(area.getDocument().getLength());

            } else if (formato.equalsIgnoreCase("archivo")) {

                area.setText(area.getText() + "Ha llegado un archivo\n");
                area.setCaretPosition(area.getDocument().getLength());

            }

            passbprov = clave.getBytes("UTF8");

            switch (cifrado) {

                case "des":

                    area.setText(area.getText() + "Ha seleccionado 3DES como cifrado\n");
                    area.setCaretPosition(area.getDocument().getLength());
                    passb = copyOf(passbprov, 24);
                    pass = new SecretKeySpec(passb, "DESede");
                    cifrador = Cipher.getInstance("DESede");
                    break;

                case "aes16":

                    area.setText(area.getText() + "Ha seleccionado AES 16 como cifrado\n");
                    area.setCaretPosition(area.getDocument().getLength());
                    passb = copyOf(passbprov, 16);
                    pass = new SecretKeySpec(passb, "AES");
                    cifrador = Cipher.getInstance("AES/ECB/PKCS5PADDING");
                    break;

                case "aes32":

                    area.setText(area.getText() + "Ha seleccionado AES 32 como cifrado\n");
                    area.setCaretPosition(area.getDocument().getLength());
                    passb = copyOf(passbprov, 32);
                    pass = new SecretKeySpec(passb, "AES");
                    cifrador = Cipher.getInstance("AES/ECB/PKCS5PADDING");
                    break;

            }

            switch (accion) {

                case "cifrado":

                    area.setText(area.getText() + "Ha seleccionado cifrado como accion\n");
                    area.setCaretPosition(area.getDocument().getLength());
                    cifrador.init(Cipher.ENCRYPT_MODE, pass);
                    if (formato.equalsIgnoreCase("frase")) {
                        
                        area.setText(area.getText()+"Convirtiendo la cadena...\n");
                        area.setCaretPosition(area.getDocument().getLength());
                        objetobyte = frase.getBytes("UTF8");
                        objetoconvertido = cifrador.doFinal(objetobyte);
                        
                    } else if (formato.equalsIgnoreCase("archivo")) {

                        area.setText(area.getText()+"Convirtiendo el archivo...\n");
                        area.setCaretPosition(area.getDocument().getLength());
                        //objetobyte = Files.readAllBytes(recibido.toPath());
                        /****/
                        buffer=new byte[1024];
                        fis = new FileInputStream(recibido);
                        cip = new CipherOutputStream(new FileOutputStream("cifrado"+recibido.getName()), cifrador);
                        leidos=0;
                        
                        while((leidos=fis.read(buffer))>0){
                            
                            cip.write(buffer, 0, leidos);
                            
                        }
                        
                        fis.close();
                        cip.close();
                        /****/

                    }
                    
                    
                    
                    if (formato.equalsIgnoreCase("frase")) {

                        area.setText(area.getText() + "Cadena convertida\nDevolviendo cadena...\n");
                        area.setCaretPosition(area.getDocument().getLength());
                        oout.writeObject(codificador.encodeToString(objetoconvertido));
                        area.setText(area.getText() + "Cadena devuelta\n");
                        area.setCaretPosition(area.getDocument().getLength());

                    } else if (formato.equalsIgnoreCase("archivo")) {

                        area.setText(area.getText() + "Archivo convertido\n");
                        area.setText(area.getText() + "Escribiendo archivo\n");
                        area.setCaretPosition(area.getDocument().getLength());
                        /*FileOutputStream stream = new FileOutputStream("cifrado" + recibido.getName());

                        try {

                            stream.write(objetoconvertido);

                        } catch (Exception e) {

                        } finally {

                            stream.close();

                        }*/
                        
                        area.setText(area.getText() + "Archivo escrito\n");

                        area.setText(area.getText() + "Devolviendo archivo...\n");
                        area.setCaretPosition(area.getDocument().getLength());

                    }

                    break;

                case "descifrado":

                    area.setText(area.getText() + "Ha seleccionado descifrado como accion\nConvirtiendo la cadena...\n");
                    area.setCaretPosition(area.getDocument().getLength());
                    cifrador.init(Cipher.DECRYPT_MODE, pass);
                    
                    if (formato.equalsIgnoreCase("frase")) {

                        objetobyte = decodificador.decode(frase);
                        objetoconvertido = cifrador.doFinal(objetobyte);

                    } else if (formato.equalsIgnoreCase("archivo")) {

                        objetobyte = Files.readAllBytes(recibido.toPath());
                        /****/
                        buffer=new byte[1024];
                        fis = new FileInputStream(recibido);
                        cip = new CipherOutputStream(new FileOutputStream("descifrado"+recibido.getName()), cifrador);
                        leidos=0;
                        
                        while((leidos=fis.read(buffer))>0){
                            
                            cip.write(buffer, 0, leidos);
                            
                        }
                        
                        fis.close();
                        cip.close();
                        /****/

                    }
                    
                    //objetoconvertido = cifrador.doFinal(objetobyte);
                    
                    if (formato.equalsIgnoreCase("frase")) {
                        
                        area.setText(area.getText() + "Cadena convertida\nDevolviendo cadena...\n");
                        area.setCaretPosition(area.getDocument().getLength());
                        oout.writeObject(new String(objetoconvertido));
                        area.setText(area.getText() + "Cadena devuelta\n");
                        area.setCaretPosition(area.getDocument().getLength());
                        
                    } else if (formato.equalsIgnoreCase("archivo")) {

                        area.setText(area.getText() + "Archivo convertido\n");
                        area.setText(area.getText() + "Escribiendo archivo\n");
                        area.setCaretPosition(area.getDocument().getLength());
                        /*FileOutputStream stream = new FileOutputStream("descifrado" + recibido.getName());

                        try {

                            stream.write(objetoconvertido);

                        } catch (Exception e) {

                        } finally {

                            stream.close();

                        }*/
                        
                        area.setText(area.getText() + "Archivo escrito\n");
                        area.setText(area.getText() + "Devolviendo archivo...\n");
                        area.setCaretPosition(area.getDocument().getLength());

                    }
                    
                    break;

            }

            if (formato.equalsIgnoreCase("archivo")) {

                if (accion.equalsIgnoreCase("cifrado")) {

                    elegido = new File("cifrado" + recibido.getName());

                } else if (accion.equalsIgnoreCase("descifrado")) {

                    elegido = new File("descifrado" + recibido.getName());

                }

                bis = new BufferedInputStream(new FileInputStream(elegido));
                leidos = 0;

                do {

                    pfich = new ParteFichero();
                    pfich.setNombreFichero(elegido.getName());
                    leidos = bis.read(pfich.getParte());

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

                } while (!pfich.isUltimaParte());

                bis.close();
                area.setText(area.getText() + "Archivo enviado\n");

            }

            area.setText(area.getText() + "***********************************\n");
            area.setCaretPosition(area.getDocument().getLength());
            
            if(formato.equalsIgnoreCase("archivo")){
                elegido.delete();
                recibido.delete();
            }
            elegido = null;
            recibido = null;
            oin.close();
            oout.close();

        } catch (IOException ex) {

            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);

        } catch (InvalidKeyException ex) {

            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IllegalBlockSizeException ex) {

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
        }

    }

    @Override
    public void run() {

        try {

            oout = new ObjectOutputStream(con.getOutputStream());
            oin = new ObjectInputStream(con.getInputStream());
            realizarAccion(String.valueOf(oin.readObject()));

        } catch (IOException ex) {
            
            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
        
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }
    
}
