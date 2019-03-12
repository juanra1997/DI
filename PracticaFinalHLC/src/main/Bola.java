/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;

/**
 *
 * @author Juanra
 */
public class Bola {
    
    Juego miJuego;
    int x, y, dy, dx;
    
    public Bola(Juego j){
        
        x=196;
        y=500;
        dy=-1;
        dx=-1;
        miJuego=j;
        
    }
    
    public void paint(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.WHITE);
        g2d.fillOval(x, y, 10, 10);
        
    }
    
    public void mover(){
        
        x=dx+x;
        y=dy+y;
        
        if(y==555){
            miJuego.pausado=false;
            miJuego.jugando=false;
            JOptionPane.showMessageDialog(null, "Has perdido");
            miJuego.ventana.iniciar.setEnabled(true);
            miJuego.ventana.parar.setEnabled(false);
            miJuego.ventana.pausar.setEnabled(false);
        }

        if(x==0){
            dx=1;

        }
        if(y==0){
            dy=1;         

        }
        if(miJuego.raqueta.devolverRaqueta().intersects(devolverBola())){

            if(y==511){
                dy=-1;
            }

        }
        if(x==390){
            dx=-1;

        }
        if(y==555){
            dy=-1;

        }

        if(miJuego.cuadro1.devolverCuadro().intersects(devolverBola())){

            if(miJuego.cuadro1.getColor()==Color.WHITE){
                miJuego.cuadro1.setColor(Color.CYAN);
                
                if(y>51&&y<74){
                    if(dx==-1){
                        dx=1;
                    }else{
                        dx=-1;
                    }
                }else if(y==74){
                    dy=1;
                }else{
                    dy=-1;
                }
                
            }else if(miJuego.cuadro1.getColor()==Color.CYAN){
                miJuego.cuadro1.setColor(Color.BLACK);
                miJuego.cuadro1.setPintar(false);
                
                if(y>51&&y<74){
                    if(dx==-1){
                        dx=1;
                    }else{
                        dx=-1;
                    }
                }else if(y==74){
                    dy=1;
                }else{
                    dy=-1;
                }
                miJuego.reventados++;
            }
            
        }
        if(miJuego.cuadro2.devolverCuadro().intersects(devolverBola())){

            if(miJuego.cuadro2.getColor()==Color.WHITE){
                miJuego.cuadro2.setColor(Color.CYAN);
                if(y>51&&y<74){
                    if(dx==-1){
                        dx=1;
                    }else{
                        dx=-1;
                    }
                }else if(y==74){
                    dy=1;
                }else{
                    dy=-1;
                }
                
                
            }else if(miJuego.cuadro2.getColor()==Color.CYAN){
                miJuego.cuadro2.setColor(Color.BLACK);
                miJuego.cuadro2.setPintar(false);
                if(y>51&&y<74){
                    if(dx==-1){
                        dx=1;
                    }else{
                        dx=-1;
                    }
                }else if(y==74){
                    dy=1;
                }else{
                    dy=-1;
                }
                miJuego.reventados++;
            }
            
        }
        if(miJuego.cuadro3.devolverCuadro().intersects(devolverBola())){

            if(miJuego.cuadro3.getColor()==Color.WHITE){
                miJuego.cuadro3.setColor(Color.CYAN);
                if(y>51&&y<74){
                    if(dx==-1){
                        dx=1;
                    }else{
                        dx=-1;
                    }
                }else if(y==74){
                    dy=1;
                }else{
                    dy=-1;
                
                }
                
            }else if(miJuego.cuadro3.getColor()==Color.CYAN){
                miJuego.cuadro3.setColor(Color.BLACK);
                miJuego.cuadro3.setPintar(false);
                if(y>51&&y<74){
                    if(dx==-1){
                        dx=1;
                    }else{
                        dx=-1;
                    }
                }else if(y==74){
                    dy=1;
                }else{
                    dy=-1;
                }
                miJuego.reventados++;
            }
            
        }
        if(miJuego.cuadro4.devolverCuadro().intersects(devolverBola())){

            if(miJuego.cuadro4.getColor()==Color.WHITE){
                miJuego.cuadro4.setColor(Color.CYAN);
                if(y>51&&y<74){
                    if(dx==-1){
                        dx=1;
                    }else{
                        dx=-1;
                    }
                }else if(y==74){
                    dy=1;
                }else{
                    dy=-1;
                }
                
            }else if(miJuego.cuadro4.getColor()==Color.CYAN){
                miJuego.cuadro4.setColor(Color.BLACK);
                miJuego.cuadro4.setPintar(false);
                if(y>51&&y<74){
                    if(dx==-1){
                        dx=1;
                    }else{
                        dx=-1;
                    }
                }else if(y==74){
                    dy=1;
                }else{
                    dy=-1;
                
                }
                miJuego.reventados++;
            }
            
        }
        if(miJuego.cuadro5.devolverCuadro().intersects(devolverBola())){

            if(miJuego.cuadro5.getColor()==Color.WHITE){
                miJuego.cuadro5.setColor(Color.CYAN);
                if(y>51&&y<74){
                    if(dx==-1){
                        dx=1;
                    }else{
                        dx=-1;
                    }
                }else if(y==74){
                    dy=1;
                }else{
                    dy=-1;
                
                }
                
            }else if(miJuego.cuadro5.getColor()==Color.CYAN){
                miJuego.cuadro5.setColor(Color.BLACK);
                miJuego.cuadro5.setPintar(false);
                if(y>51&&y<74){
                    if(dx==-1){
                        dx=1;
                    }else{
                        dx=-1;
                    }
                }else if(y==74){
                    dy=1;
                }else{
                    dy=-1;
                }
                miJuego.reventados++;
            }
            
        }
        if(miJuego.cuadro6.devolverCuadro().intersects(devolverBola())){

            if(miJuego.cuadro6.getColor()==Color.WHITE){
                miJuego.cuadro6.setColor(Color.CYAN);
                if(y>51&&y<74){
                    if(dx==-1){
                        dx=1;
                    }else{
                        dx=-1;
                    }
                }else if(y==74){
                    dy=1;
                }else{
                    dy=-1;
                }
                
            }else if(miJuego.cuadro6.getColor()==Color.CYAN){
                miJuego.cuadro6.setColor(Color.BLACK);
                miJuego.cuadro6.setPintar(false);
                if(y>51&&y<74){
                    if(dx==-1){
                        dx=1;
                    }else{
                        dx=-1;
                    }
                }else if(y==74){
                    dy=1;
                }else{
                    dy=-1;
                }
                miJuego.reventados++;
            }
            
        }
    }
    
    
    public Rectangle devolverBola(){
        
        return new Rectangle(x, y, 10, 10);
    }
}
