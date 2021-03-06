/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradordearchivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import static java.util.Arrays.copyOf;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author Juanra
 */
public class Main extends javax.swing.JFrame {

    File elegido;

    String pass;
    String cifrado;

    byte[] clavesecreta;
    byte[] clavefinal;
    byte[] fichero;
    byte[] ficherocifrado;

    SecretKey clave;
    Cipher cifrador;

    /**
     * Creates new form Main
     */
    public Main() {

        initComponents();
        setLocationRelativeTo(null);
        //rbAES256.setVisible(false);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        choser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbAES128 = new javax.swing.JRadioButton();
        rbAES256 = new javax.swing.JRadioButton();
        rb3DES = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtArchivo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setText("(DES)CIFRADOR DE ARCHIVOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Algoritmo:");

        grupo.add(rbAES128);
        rbAES128.setSelected(true);
        rbAES128.setText("AES 128 bits");

        grupo.add(rbAES256);
        rbAES256.setText("AES 256 bits");

        grupo.add(rb3DES);
        rb3DES.setText("3DES");

        jLabel3.setText("Clave de cifrado:");

        txtpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setText("Seleccionar archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Archivo:");

        txtArchivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtArchivo.setFocusable(false);

        jButton4.setText("Descifrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cifrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("SALIR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbAES128)
                                .addGap(91, 91, 91)
                                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(246, 246, 246)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbAES256)
                                    .addComponent(rb3DES))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(125, 125, 125))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(171, 171, 171)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAES128)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbAES256)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb3DES))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        choser.showOpenDialog(this);
        elegido = choser.getSelectedFile();
        try{
        txtArchivo.setText(elegido.getAbsolutePath());
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (!txtpass.getText().isEmpty() && !txtArchivo.getText().isEmpty()) {
            pass = txtpass.getText();
            try {

                clavesecreta = pass.getBytes("UTF8");
                
                if (rb3DES.isSelected()) {
                    clavefinal = copyOf(clavesecreta, 24);
                    clave = new SecretKeySpec(clavefinal, "DESede");
                    cifrador = Cipher.getInstance("DESede");
                    cifrado = "cifrado3DES";
                } else if (rbAES128.isSelected()) {
                    clavefinal = copyOf(clavesecreta, 16);
                    clave = new SecretKeySpec(clavefinal, "AES");
                    cifrador = Cipher.getInstance("AES/ECB/PKCS5PADDING");
                    cifrado = "cifradoAES128";
                    } else if (rbAES256.isSelected()) {
                        clavefinal = copyOf(clavesecreta, 32);
                     clave = new SecretKeySpec(clavefinal, "AES");
                     cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
                     cifrado = "cifradoAES256";
                }
                fichero = Files.readAllBytes(elegido.toPath());
                cifrador.init(Cipher.ENCRYPT_MODE, clave);
                ficherocifrado = cifrador.doFinal(fichero);
                
                FileOutputStream stream = new FileOutputStream(elegido.getParent() + "\\" + cifrado + elegido.getName());

                try {
                    
                    stream.write(ficherocifrado);
                } catch (Exception e) {

                } finally {
                    stream.close();
                }

                txtArchivo.setText("");
                txtpass.setText("");
                elegido = null;

                pass = null;
                cifrado = null;

                clavesecreta = null;
                clavefinal = null;
                fichero = null;
                ficherocifrado = null;

                clave = null;
                cifrador = null;

            } catch (UnsupportedEncodingException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeyException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalBlockSizeException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (txtArchivo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecciona el archivo");
        } else {
            JOptionPane.showMessageDialog(null, "Introduce la contraseña");
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!txtpass.getText().isEmpty() && !txtArchivo.getText().isEmpty()) {
            pass = txtpass.getText();
            try {
                FileInputStream fileInputStream = new FileInputStream(elegido);
                clavesecreta = pass.getBytes("UTF8");
                

                ficherocifrado = Files.readAllBytes(elegido.toPath());

                if (rb3DES.isSelected()) {
                    clavefinal = copyOf(clavesecreta, 24);
                    clave = new SecretKeySpec(clavefinal, "DESede");
                    cifrador = Cipher.getInstance("DESede");

                } else if (rbAES128.isSelected()) {
                    clavefinal = copyOf(clavesecreta, 16);
                    clave = new SecretKeySpec(clavefinal, "AES");
                    cifrador = Cipher.getInstance("AES/ECB/PKCS5PADDING");

                    } else if (rbAES256.isSelected()) {
                        clavefinal = copyOf(clavesecreta, 32);
                     clave = new SecretKeySpec(clavefinal, "AES");
                     cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
                }
                cifrador.init(Cipher.DECRYPT_MODE, clave);
                fichero = cifrador.doFinal(ficherocifrado);
                
                FileOutputStream stream = new FileOutputStream(elegido.getParent() + "\\no" + elegido.getName());

                try{
                    stream.write(fichero);
                } catch (Exception e) {

                }finally{
                    stream.close();
                }
                
                fileInputStream.close();

                txtArchivo.setText("");
                txtpass.setText("");
                elegido = null;

                pass = null;
                cifrado = null;

                clavesecreta = null;
                clavefinal = null;
                fichero = null;
                ficherocifrado = null;

                clave = null;
                cifrador = null;

            } catch (IOException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeyException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalBlockSizeException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (txtArchivo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecciona el archivo");
        } else {
            JOptionPane.showMessageDialog(null, "Introduce la contraseña");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser choser;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rb3DES;
    private javax.swing.JRadioButton rbAES128;
    private javax.swing.JRadioButton rbAES256;
    private javax.swing.JTextField txtArchivo;
    private javax.swing.JTextField txtpass;
    // End of variables declaration//GEN-END:variables
}
