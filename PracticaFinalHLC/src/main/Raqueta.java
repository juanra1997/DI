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
public class Raqueta {
    
    int x, y, dx;
    
    public Raqueta(){
        
        x=171;
        y=520;
        dx=0;
        
    }
    
    public void paint(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(x, y, 60, 15);
        
    }
    
    public void mover(){
        
        if(x+dx>0&&x+dx<340){
            
            x=x+dx;
        
        }
    
    }
    
    public Rectangle devolverRaqueta(){
        return new Rectangle(x, y, 60, 15);
    }

}
