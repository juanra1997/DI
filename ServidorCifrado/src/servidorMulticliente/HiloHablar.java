package servidorMulticliente;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import static java.util.Arrays.copyOf;
import java.util.Base64;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class HiloHablar implements Runnable {

    static String pass = "Secreto";
    static byte[] fraseBytes;
    static byte[] passbyteprov;
    static byte[] passbytebuena;
    static byte[] frasecifrada;
    static SecretKey clave;
    static Cipher cifrador;
    ArrayList<PrintWriter> salidas;
    Scanner teclado;
    static Base64.Encoder encoder = Base64.getEncoder();

    public HiloHablar(ArrayList<PrintWriter> salidas) {
        this.salidas = salidas;
        teclado = new Scanner(System.in);
        try {
            passbyteprov = pass.getBytes("UTF8");
            passbytebuena = copyOf(passbyteprov, 16);
            clave = new SecretKeySpec(passbytebuena, "AES");
            cifrador = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cifrador.init(Cipher.ENCRYPT_MODE, clave);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(HiloHablar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(HiloHablar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(HiloHablar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(HiloHablar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void run() {
        String cad;
        while (true) {
            cad="[Servidor]>";
            cad = cad+teclado.nextLine();
            if (cad.equalsIgnoreCase("exit")) {
                System.exit(0);
            }
            if (salidas.size() == 0) {
                System.out.println("No hay NINGUN Cliente!!!");
            } else {

                for (int i=0; i<salidas.size(); i++) {
                    
                    try {

                        salidas.get(i).println(encoder.encodeToString(cifrador.doFinal(cad.getBytes("UTF8"))));
                    } catch (IllegalBlockSizeException ex) {
                        Logger.getLogger(HiloHablar.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (BadPaddingException ex) {
                        Logger.getLogger(HiloHablar.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedEncodingException ex) {
                        Logger.getLogger(HiloHablar.class.getName()).log(Level.SEVERE, null, ex);
                    }catch(Exception e){
                        
                    }
                }
            }
        }

    }
}
