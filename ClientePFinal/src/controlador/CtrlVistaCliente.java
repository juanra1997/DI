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
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import parteFichero.ParteFichero;
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
    File elegido, recibido;
    ObjectOutputStream oout;
    ObjectInputStream oin;
    Object aux;
    BufferedInputStream bis;
    int leidos;
    ParteFichero pfich;
    boolean creado;
    FileOutputStream fos;

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
        cliente.seleccionar.addActionListener(this);

    }

    public void realizarAccion(String accion, String formato) {

        if (cliente.txtIp.getText().isEmpty() || cliente.txtPuerto.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Introduce la ip y el puerto");

        } else if (cliente.txtClave.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Introduce la clave");

        } else {

            try {

                ip = InetAddress.getByName(cliente.txtIp.getText());
                socket = new Socket(ip, Integer.parseInt(cliente.txtPuerto.getText()));

                System.out.println("Conexion establecida");

                in = new BufferedReader(new InputStreamReader(/*input*/socket.getInputStream()));

                System.out.println("a");

                out = new PrintWriter(socket.getOutputStream(), true);

                System.out.println("b");

                oout = new ObjectOutputStream(socket.getOutputStream());

                System.out.println("c");

                //oin = new ObjectInputStream(input);
                System.out.println("d");
                
                if(formato.equalsIgnoreCase("archivo")){

                    bis = new BufferedInputStream(new FileInputStream(elegido));
                
                }

                System.out.println("e");

                leidos = 0;

                creado = false;

                //pfich = new ParteFichero();
                //pfich.setNombreFichero(elegido.getName());
                //pfich.setUltimaParte(false);
                System.out.println("Cosas creadas");

                out.println(formato);

                System.out.println("Formato enviado");

                if (formato.equalsIgnoreCase("frase")) {

                    out.println(cliente.txtFrase.getText());
                    
                    System.out.println("Frase enviada");

                } else if (formato.equalsIgnoreCase("archivo")) {

                    System.out.println("Supuestamente antes de enviar");

                    do {

                        pfich = new ParteFichero();
                        pfich.setNombreFichero(elegido.getName());
                        leidos = bis.read(pfich.getParte());

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

                    } while (!pfich.isUltimaParte());

                    pfich = null;

                }

                System.out.println("Supuestamente enviado");

                //elegido = null;

                out.println(cliente.txtClave.getText());
                out.println(cifrado);
                out.println(accion);

                if (formato.equalsIgnoreCase("frase")) {
                    
                    //System.out.println(in.readLine());
                    
                    oin = new ObjectInputStream(socket.getInputStream());

                    cliente.txtResultado.setText(String.valueOf(oin.readObject()));

                } else if (formato.equalsIgnoreCase("archivo")) {

                    oin = new ObjectInputStream(socket.getInputStream());

                    do {

                        pfich = new ParteFichero();

                        aux = oin.readObject();

                        System.out.println("Recibiendo");

                        if (aux instanceof ParteFichero) {

                            pfich = (ParteFichero) aux;

                            if (!creado) {

                                //System.out.println();
                                recibido = new File(elegido.getParent()+"\\"+pfich.getNombreFichero());
                                creado = true;
                                fos = new FileOutputStream(recibido);
                                //System.out.println(recibido);
                            }

                            fos.write(pfich.getParte(), 0, pfich.getBytesValidos());

                        }

                    } while (!pfich.isUltimaParte());

                    fos.close();

                }

                //in.close();
                out.close();
                oout.close();
                oin.close();
                
                if(formato.equalsIgnoreCase("archivo")){
                    
                    bis.close();
                }
                //fos.close();

                pfich = null;
                
                elegido=null;
                
                recibido=null;

                socket.close();
                
                cliente.txtArchivo.setText("");

                //System.out.println(socket.isClosed());
            } catch (UnknownHostException ex) {

                Logger.getLogger(CtrlVistaCliente.class.getName()).log(Level.SEVERE, null, ex);

            } catch (ConnectException ex) {

                JOptionPane.showMessageDialog(null, "Se ha producido un error al intentar conectar con el servidor");

            } catch (IOException ex) {

                Logger.getLogger(CtrlVistaCliente.class.getName()).log(Level.SEVERE, null, ex);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CtrlVistaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource() == cliente.bCifrar) {

            if (!cliente.txtFrase.getText().isEmpty()) {

                realizarAccion("cifrar", "frase");

            } else if (!cliente.txtArchivo.getText().isEmpty()) {

                System.out.println("Listo");

                realizarAccion("cifrar", "archivo");

            } else {

                JOptionPane.showMessageDialog(null, "Introduce una frase o selecciona un archivo");

            }
            
        }

        if (e.getSource() == cliente.seleccionar) {

            cliente.choser.showOpenDialog(cliente);
            elegido = cliente.choser.getSelectedFile();
            try {
                cliente.txtArchivo.setText(elegido.getAbsolutePath());
            } catch (Exception ex) {

            }

        }

        if (e.getSource() == cliente.bSalir) {

            System.exit(0);

        }

        if (e.getSource() == cliente.bDescifrar) {

            if (!cliente.txtFrase.getText().isEmpty()) {

                realizarAccion("descifrar", "frase");

            } else if (!cliente.txtArchivo.getText().isEmpty()) {

                realizarAccion("descifrar", "archivo");

            } else {

                JOptionPane.showMessageDialog(null, "Introduce una frase o selecciona un archivo");

            }

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
