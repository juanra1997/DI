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

/**
 *
 * @author Juanra
 */
public class Cuadro {
    
    int x, y;
    Color color;
    boolean pintar;
    
    public Cuadro(int xi, int yi){
        
        x=xi;
        y=yi;
        color=Color.WHITE;
        pintar=true;
        
    }
    
    public void paint(Graphics g) {
        
        if(pintar){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(color);
            g2d.fillRect(x, y, 66, 15);
        }
        
    }
    
    public Color getColor(){       
        
        return color;
        
    }
    
    public void setColor(Color c){
        
        color=c;
        
    }
    
    public Rectangle devolverCuadro(){
  
            return new Rectangle(x, y, 60, 15);
        
        
    }
    
    public void setPintar(boolean p){
        
        pintar=p;
        
    }
    
}
