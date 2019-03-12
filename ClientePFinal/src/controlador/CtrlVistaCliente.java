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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

                oout = new ObjectOutputStream(socket.getOutputStream());
                
                if(formato.equalsIgnoreCase("archivo")){

                    bis = new BufferedInputStream(new FileInputStream(elegido));
                
                }

                leidos = 0;
                creado = false;
                oout.writeObject(formato);
                
                if (formato.equalsIgnoreCase("frase")) {
                    
                    oout.writeObject(cliente.txtFrase.getText());
                    
                } else if (formato.equalsIgnoreCase("archivo")) {

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
                    pfich = null;

                }

                oout.writeObject(cliente.txtClave.getText());
                oout.writeObject(cifrado);
                oout.writeObject(accion);

                if (formato.equalsIgnoreCase("frase")) {

                    oin = new ObjectInputStream(socket.getInputStream());

                    cliente.txtResultado.setText(String.valueOf(oin.readObject()).trim());

                } else if (formato.equalsIgnoreCase("archivo")) {

                    oin = new ObjectInputStream(socket.getInputStream());

                    do {

                        pfich = new ParteFichero();

                        aux = oin.readObject();

                        if (aux instanceof ParteFichero) {

                            pfich = (ParteFichero) aux;

                            if (!creado) {

                                recibido = new File(elegido.getParent()+"\\"+pfich.getNombreFichero());
                                creado = true;
                                fos = new FileOutputStream(recibido);

                            }

                            fos.write(pfich.getParte(), 0, pfich.getBytesValidos());

                        }

                    } while (!pfich.isUltimaParte());

                    fos.close();
                    JOptionPane.showMessageDialog(null, "La accion de "+accion+" se ha realizado correctamente");

                }
                
                oin=null;
                oout=null;
                elegido=null;
                recibido=null;
                socket.close();
                cliente.txtArchivo.setText("");

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
        
        if (e.getSource() == cliente.bCifrar) {

            if (!cliente.txtFrase.getText().isEmpty()) {

                realizarAccion("cifrado", "frase");

            } else if (!cliente.txtArchivo.getText().isEmpty()) {

                realizarAccion("cifrado", "archivo");

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

                realizarAccion("descifrado", "frase");

            } else if (!cliente.txtArchivo.getText().isEmpty()) {

                realizarAccion("descifrado", "archivo");

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

            JOptionPane.showMessageDialog(null, "Introduce solo un archivo o una frase\nEn el caso de que se introduzcan las dos cosas, solo se aplicara la accion a la frase\nEl archivo convertido se guarda en el mismo lugar en el que se encuentra el seleccionado\nAplicacion desarrollada por Juan Raul Mellado Garcia");

        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        if (e.getSource() == cliente.txtPuerto) {

            if (!Character.isDigit(e.getKeyChar())) {

                e.consume();

            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

}
