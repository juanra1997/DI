package servidorMulticliente;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import static java.util.Arrays.copyOf;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class HiloServidor implements Runnable {

    static String pass = "Secreto";
    static byte[] fraseBytes;
    static byte[] passbyteprov;
    static byte[] passbytebuena;
    static byte[] frasecifrada;
    static SecretKey clave;
    static Cipher descifrador, cifrador;
    private Socket concli;
    private int num;
    ArrayList<PrintWriter> salidas;
    PrintWriter OUT;
    static Base64.Decoder decoder = Base64.getDecoder();
    static Base64.Encoder encoder = Base64.getEncoder();
    
    /**/int cont=1;

    public HiloServidor(Socket con, int num, ArrayList<PrintWriter> ls) {
        concli = con;
        this.num = num;
        salidas = ls;

        try {
            passbyteprov = pass.getBytes("UTF8");
            passbytebuena = copyOf(passbyteprov, 32);
            clave = new SecretKeySpec(passbytebuena, "AES");
            descifrador = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            descifrador.init(Cipher.DECRYPT_MODE, clave);
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
        String cad = "";
        String cliente = "[Cliente_" + num + "]>";
        try (BufferedReader in = new BufferedReader(new InputStreamReader(concli.getInputStream()));
             PrintWriter out = new PrintWriter(concli.getOutputStream(), true)){
            OUT = out;
            salidas.add(OUT);

            while (!new String(descifrador.doFinal(decoder.decode(cad.getBytes("UTF8")))).equalsIgnoreCase("exit")) {
                cad = in.readLine().trim();
               
                if (new String(descifrador.doFinal(decoder.decode(cad.getBytes("UTF8")))).equalsIgnoreCase("exit")) {
                    //salidas.remove(OUT);
                    salidas.get(num-1).print("exit");
                    salidas.set((num - 1), null);

                    System.out.println("Cliente: " + num + " desconectado");
                    break;
                } else if(!cad.isEmpty()){
                    for (int i = 0; i < salidas.size(); i++) {

                        if (i != (num - 1) && salidas.get(i) != null) {
                            salidas.get(i).println(encoder.encodeToString(cifrador.doFinal((cliente + new String(descifrador.doFinal(decoder.decode(cad.getBytes("UTF8"))))).getBytes("UTF8"))));

                        }
                    }
                    System.out.println(cliente + "Frase original: " + cad);
                    System.out.println(cliente + "Frase descifrada: " + new String(descifrador.doFinal(decoder.decode(cad.getBytes("UTF8")))));
                }

                
            }

        } catch (Exception ex) {
            //salidas.remove(OUT);
            salidas.set((num - 1), null);
            System.out.println("Error en HiloServidor: " + ex.getMessage());

        }
    }

}
