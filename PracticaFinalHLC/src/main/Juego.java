/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Juanra
 */
public class Juego extends Canvas implements Runnable {

    Raqueta raqueta;
    Bola bola;
    Cuadro cuadro1, cuadro2, cuadro3, cuadro4, cuadro5, cuadro6;
    boolean pausado, jugando;
    private Image imagenaux;
    private Graphics gaux;
    private Dimension dimaux, dimcanvas;
    ImagenFondo imagen;
    int velocidad, reventados;
    Ventana ventana;

    public Juego(Ventana v) {

        setBounds(0, 0, 402, 565);
        ventana = v;
        imagen = new ImagenFondo(this);
        dimcanvas = getSize();
        setBackground(Color.BLACK);
        raqueta = new Raqueta();
        cuadro1 = new Cuadro(0, 60);
        cuadro2 = new Cuadro(67, 60);
        cuadro3 = new Cuadro(134, 60);
        cuadro4 = new Cuadro(201, 60);
        cuadro5 = new Cuadro(268, 60);
        cuadro6 = new Cuadro(335, 60);
        bola = new Bola(this);
        jugando = true;
        pausado = false;
        //velocidad = 5;
        reventados = 0;
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    raqueta.dx = -1;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    raqueta.dx = 1;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    raqueta.dx = 0;
                }
            }
        });

    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void paint(Graphics g) {

        if (gaux == null || dimaux == null || dimcanvas.width != dimaux.width || dimcanvas.height != dimaux.height) {
            dimaux = dimcanvas;
            imagenaux = createImage(dimaux.width, dimaux.height);
            gaux = imagenaux.getGraphics();
        }
        imagen.paint(gaux);
        raqueta.paint(gaux);
        bola.paint(gaux);
        cuadro1.paint(gaux);
        cuadro2.paint(gaux);
        cuadro3.paint(gaux);
        cuadro4.paint(gaux);
        cuadro5.paint(gaux);
        cuadro6.paint(gaux);

        g.drawImage(imagenaux, 0, 0, this);

    }

    @Override
    public void run() {
        velocidad=6-Integer.parseInt(ventana.nivel.getText());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while (jugando) {
            while (pausado) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            raqueta.mover();
            bola.mover();

            //System.out.println(reventados);
            if (reventados == 6) {
                if (velocidad != 1) {

                    ventana.nivel.setText(String.valueOf(Integer.parseInt(ventana.nivel.getText())+1));
                    velocidad--;
                    bola.x = 196;
                    bola.y = 500;
                    bola.dx = -1;
                    bola.dy = -1;
                    raqueta.dx = 0;
                    raqueta.x = 171;
                    raqueta.y = 520;
                    reventados = 0;
                    cuadro1.setColor(Color.WHITE);
                    cuadro2.setColor(Color.WHITE);
                    cuadro3.setColor(Color.WHITE);
                    cuadro4.setColor(Color.WHITE);
                    cuadro5.setColor(Color.WHITE);
                    cuadro6.setColor(Color.WHITE);
                    cuadro1.setPintar(true);
                    cuadro2.setPintar(true);
                    cuadro3.setPintar(true);
                    cuadro4.setPintar(true);
                    cuadro5.setPintar(true);
                    cuadro6.setPintar(true);

                    JOptionPane.showMessageDialog(null, "Has pasado de nivel");

                } else {
                    JOptionPane.showMessageDialog(null, "Has superado todos los niveles, enhorabuena");
                    pausado = false;
                    jugando = false;
                    bola.x = 196;
                    bola.y = 500;
                    bola.dx = 0;
                    bola.dy = 0;
                    raqueta.dx = 0;
                    raqueta.x = 171;
                    raqueta.y = 520;
                    reventados = 0;
                    ventana.iniciar.setEnabled(true);
                    ventana.parar.setEnabled(false);
                    ventana.pausar.setEnabled(false);
                    ventana.sumar.setEnabled(true);
                    ventana.restar.setEnabled(true);
                }
            }
            repaint();
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
