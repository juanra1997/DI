/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorpfinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
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

/**
 *
 * @author Juanra
 */
public class HiloServidor implements Runnable {

    Socket con;
    JTextArea area;
    BufferedReader in;
    PrintWriter out;
    String frase, clave, cifrado, accion, resultado;
    byte[] frasebyte, passbprov, passb, fraseconvertida;
    SecretKey pass;
    Cipher cifrador;
    Base64.Encoder codificador;
    Base64.Decoder decodificador;

    public HiloServidor(Socket c, JTextArea a) {

        con = c;
        area = a;
        codificador=Base64.getEncoder();
        decodificador=Base64.getDecoder();

    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {

            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            out = new PrintWriter(con.getOutputStream(), true);

            frase = in.readLine().trim();
            clave = in.readLine().trim();
            cifrado = in.readLine().trim();
            accion = in.readLine().trim();

            if (!frase.isEmpty()) {

                area.setText(area.getText() + "***********************************\n");
                area.setText(area.getText() + "Ha llegado una cadena\n");

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
                        frasebyte=frase.getBytes("UTF8");
                        fraseconvertida = cifrador.doFinal(frasebyte);
                        area.setText(area.getText() + "Cadena convertida\nDevolviendo cadena...\n");
                        out.println(codificador.encodeToString(fraseconvertida));
                        area.setText(area.getText() + "Cadena devuelta\n");
                        break;

                    case "descifrar":

                        area.setText(area.getText() + "Ha seleccionado descifrar como accion\nConvirtiendo la cadena...\n");
                        cifrador.init(Cipher.DECRYPT_MODE, pass);
                        frasebyte=decodificador.decode(frase);
                        fraseconvertida = cifrador.doFinal(frasebyte);
                        area.setText(area.getText() + "Cadena convertida\nDevolviendo cadena...\n");
                        out.println(new String(fraseconvertida));
                        area.setText(area.getText() + "Cadena devuelta\n");
                        break;

                }

                area.setText(area.getText() + "***********************************\n");

                area.setCaretPosition(area.getDocument().getLength());

            }

        } catch (IOException ex) {

            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);

        } catch (InvalidKeyException ex) {
            
            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
        
        } catch (IllegalBlockSizeException ex) {
            
            //Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
            area.setText(area.getText() + "Error de codificacion\nNotificando...\n");
            out.println("Error en la codificacion");
            area.setText(area.getText() + "Notificado\n");
            area.setText(area.getText() + "***********************************\n");
            area.setCaretPosition(area.getDocument().getLength());
            
        } catch (BadPaddingException ex) {
            
            //Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
            area.setText(area.getText() + "Error de cifrado o contraseña\nNotificando...\n");
            out.println("Error en el tipo de cifrado o contraseña");
            area.setText(area.getText() + "Notificado\n");
            area.setText(area.getText() + "***********************************\n");
            area.setCaretPosition(area.getDocument().getLength());
            
        } catch (NoSuchAlgorithmException ex) {
            
            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
        
        } catch (NoSuchPaddingException ex) {
            
            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
        
        }finally {

            try {

                in.close();
                out.close();

            } catch (IOException ex) {

                Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }
}
