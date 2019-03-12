/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame implements ActionListener, FocusListener{

    Juego miJuego;
    JButton iniciar, pausar, parar, salir, sumar, restar;
    JTextField nivel;
    Thread hilo;

    
    public Ventana() {

        setLayout(null);
        setSize(550, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        miJuego = new Juego(this);

        //miJuego.setBackground(Color.BLACK);
        //miJuego.
        add(miJuego);
        //(new Thread(miJuego)).start();
        //System.out.println("Hilo iniciado");

        iniciar = new JButton("Iniciar");
        iniciar.setFocusPainted(false);
        iniciar.setBounds(420, 30, 100, 30);
        iniciar.setBackground(Color.BLACK);
        iniciar.setForeground(Color.WHITE);
        iniciar.addActionListener(this);
        iniciar.addFocusListener(this);
        add(iniciar);

        pausar = new JButton("Pausar");
        pausar.setFocusPainted(false);
        pausar.setBounds(420, 80, 100, 30);
        pausar.setBackground(Color.BLACK);
        pausar.setForeground(Color.WHITE);
        pausar.addActionListener(this);
        pausar.setEnabled(false);
        pausar.addFocusListener(this);
        add(pausar);

        parar = new JButton("Parar");
        parar.setFocusPainted(false);
        parar.setBounds(420, 130, 100, 30);
        parar.setBackground(Color.BLACK);
        parar.setForeground(Color.WHITE);
        parar.addActionListener(this);
        parar.setEnabled(false);
        parar.addFocusListener(this);
        add(parar);

        sumar = new JButton("+");
        sumar.setFocusPainted(false);
        sumar.setBounds(420, 230, 100, 30);
        sumar.setBackground(Color.BLACK);
        sumar.setForeground(Color.WHITE);
        sumar.addActionListener(this);
        sumar.setEnabled(false);
        sumar.addFocusListener(this);
        add(sumar);

        nivel = new JTextField();
        nivel.setBackground(Color.BLACK);
        nivel.setForeground(Color.WHITE);
        nivel.setBounds(420, 280, 100, 30);
        nivel.setHorizontalAlignment(JTextField.CENTER);
        nivel.setText("1");
        nivel.setEditable(false);
        nivel.setFocusable(false);
        add(nivel);

        restar = new JButton("-");
        restar.setFocusPainted(false);
        restar.setBounds(420, 330, 100, 30);
        restar.setBackground(Color.BLACK);
        restar.setForeground(Color.WHITE);
        restar.addActionListener(this);
        restar.setEnabled(false);
        restar.addFocusListener(this);
        add(restar);

        salir = new JButton("Salir");
        salir.setFocusPainted(false);
        salir.setBounds(420, 180, 100, 30);
        salir.setBackground(Color.BLACK);
        salir.setForeground(Color.WHITE);
        salir.addActionListener(this);
        add(salir);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource() == iniciar) {
            miJuego.reventados=0;
            miJuego.bola.x = 196;
            miJuego.bola.y = 500;
            miJuego.bola.dx = -1;
            miJuego.bola.dy = -1;
            miJuego.raqueta.dx = 0;
            miJuego.raqueta.x = 171;
            miJuego.raqueta.y = 520;
            miJuego.jugando = true;
            miJuego.pausado = false;
            miJuego.velocidad = 5;
            miJuego.cuadro1.setColor(Color.WHITE);
            miJuego.cuadro2.setColor(Color.WHITE);
            miJuego.cuadro3.setColor(Color.WHITE);
            miJuego.cuadro4.setColor(Color.WHITE);
            miJuego.cuadro5.setColor(Color.WHITE);
            miJuego.cuadro6.setColor(Color.WHITE);
            miJuego.cuadro1.setPintar(true);
            miJuego.cuadro2.setPintar(true);
            miJuego.cuadro3.setPintar(true);
            miJuego.cuadro4.setPintar(true);
            miJuego.cuadro5.setPintar(true);
            miJuego.cuadro6.setPintar(true);
            hilo = new Thread(miJuego);
            hilo.start();
            iniciar.setEnabled(false);
            pausar.setEnabled(true);
            parar.setEnabled(true);
        }
        if (e.getSource() == pausar) {
            if (miJuego.pausado) {
                miJuego.pausado = false;
                pausar.setText("Pausar");
            } else {
                miJuego.pausado = true;
                pausar.setText("Reiniciar");
            }
        }
        if (e.getSource() == parar) {
            miJuego.jugando = false;
            iniciar.setEnabled(true);
            parar.setEnabled(false);
            pausar.setEnabled(false);
            pausar.setText("Pausar");
            miJuego.pausado = false;
        }
        if (e.getSource() == salir) {
            System.exit(0);
        }
        if(e.getSource()== sumar){
            if(Integer.parseInt(nivel.getText())<5){
                nivel.setText(String.valueOf(Integer.parseInt(nivel.getText())+1));
            }
        }
        if(e.getSource()== restar){
            if(Integer.parseInt(nivel.getText())>1){
                nivel.setText(String.valueOf(Integer.parseInt(nivel.getText())-1));
            }
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        miJuego.requestFocus();
    }

    @Override
    public void focusLost(FocusEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
