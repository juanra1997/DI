/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Juanra
 */
public class ImagenFondo {
    
    BufferedImage icono;
    Juego miJuego;
    
    public ImagenFondo(Juego j){
        miJuego=j;
        try {
            icono = ImageIO.read(new File("Imagen.jpg"));
        } catch (IOException ex) {
            //Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        g2d.drawImage(icono, 0, 0, miJuego.getWidth(), miJuego.getHeight(), null);
    }
}
