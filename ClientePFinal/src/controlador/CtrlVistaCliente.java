/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.VistaCliente;

/**
 *
 * @author Juanra
 */
public class CtrlVistaCliente implements ActionListener, KeyListener {

    VistaCliente cliente;
    String frase, clave, cifrado, resultado;
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    InetAddress ip;

    public CtrlVistaCliente(VistaCliente c) {

        cifrado = "aes32";

        cliente = c;

        cliente.bCifrar.addActionListener(this);
        cliente.bSalir.addActionListener(this);
        cliente.bDescifrar.addActionListener(this);
        cliente.aes16.addActionListener(this);
        cliente.aes32.addActionListener(this);
        cliente.des.addActionListener(this);
        cliente.original.addActionListener(this);
        cliente.personalizada.addActionListener(this);
        cliente.iAyuda.addActionListener(this);
        cliente.iSalir.addActionListener(this);
        cliente.txtPuerto.addKeyListener(this);

    }

    public void realizarAccion(String accion) {

        if (cliente.txtIp.getText().isEmpty() || cliente.txtPuerto.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Introduce la ip y el puerto");

        } else if (cliente.txtFrase.getText().isEmpty() || cliente.txtClave.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Introduce la clave y la frase");

        } else {

            try {

                ip = InetAddress.getByName(cliente.txtIp.getText());
                socket = new Socket(ip, Integer.parseInt(cliente.txtPuerto.getText()));

                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                out.println(cliente.txtFrase.getText());
                out.println(cliente.txtClave.getText());
                out.println(cifrado);
                out.println(accion);

                cliente.txtResultado.setText(in.readLine().trim());

                in.close();
                out.close();

                socket.close();

                    //System.out.println(socket.isClosed());
            } catch (UnknownHostException ex) {

                Logger.getLogger(CtrlVistaCliente.class.getName()).log(Level.SEVERE, null, ex);

            } catch (ConnectException ex) {

                JOptionPane.showMessageDialog(null, "Se ha producido un error al intentar conectar con el servidor");

            } catch (IOException ex) {

                Logger.getLogger(CtrlVistaCliente.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource() == cliente.bCifrar) {
            
            realizarAccion("cifrar");

            /*if(cliente.txtIp.getText().isEmpty()||cliente.txtPuerto.getText().isEmpty()){
                
             JOptionPane.showMessageDialog(null, "Introduce la ip y el puerto");
                
             }else if(cliente.txtFrase.getText().isEmpty()||cliente.txtClave.getText().isEmpty()){
                
             JOptionPane.showMessageDialog(null, "Introduce la clave y la frase");
                
             }else{
                
             try {
                    
             ip = InetAddress.getByName(cliente.txtIp.getText());
             socket=new Socket(ip, Integer.parseInt(cliente.txtPuerto.getText()));
                    
             in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
             out=new PrintWriter(socket.getOutputStream(), true);
                    
             out.println(cliente.txtFrase.getText());
             out.println(cliente.txtClave.getText());
             out.println(cifrado);
             out.println(accion);
                    
             cliente.txtResultado.setText(in.readLine().trim());
                    
             in.close();
             out.close();
                    
             socket.close();
                    
             //System.out.println(socket.isClosed());
            
             } catch (UnknownHostException ex) {
                    
             Logger.getLogger(CtrlVistaCliente.class.getName()).log(Level.SEVERE, null, ex);
                
             } catch(ConnectException ex){
                
             JOptionPane.showMessageDialog(null, "Se ha producido un error al intentar conectar con el servidor");
                
             }catch (IOException ex) {
                    
             Logger.getLogger(CtrlVistaCliente.class.getName()).log(Level.SEVERE, null, ex);
                
             }
             }*/
        }

        if (e.getSource() == cliente.bSalir) {

            System.exit(0);

        }

        if (e.getSource() == cliente.bDescifrar) {

            realizarAccion("descifrar");
            
        }

        if (e.getSource() == cliente.aes32) {

            cifrado = "aes32";

        }

        if (e.getSource() == cliente.aes16) {

            cifrado = "aes16";

        }

        if (e.getSource() == cliente.des) {

            cifrado = "des";

        }

        if (e.getSource() == cliente.original) {

            cliente.txtIp.setEditable(false);
            cliente.txtIp.setBackground(Color.WHITE);
            cliente.txtIp.setForeground(Color.BLACK);
            cliente.txtIp.setText("cifradorredjuanra.onthewifi.com");

        }

        if (e.getSource() == cliente.personalizada) {

            cliente.txtIp.setEditable(true);
            cliente.txtIp.setBackground(Color.BLACK);
            cliente.txtIp.setForeground(Color.WHITE);
            cliente.txtIp.setText("");

        }

        if (e.getSource() == cliente.iSalir) {

            System.exit(0);

        }

        if (e.getSource() == cliente.iAyuda) {

            JOptionPane.showMessageDialog(null, "Aplicacion desarrollada por Juan Raul Mellado Garcia");

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource() == cliente.txtPuerto) {

            if (!Character.isDigit(e.getKeyChar())) {

                e.consume();

            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
