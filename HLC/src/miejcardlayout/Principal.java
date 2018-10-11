/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miejcardlayout;

import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Principal {
    
    public static void main(String[] args){
        
        Ventana miVentana=new Ventana();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setSize(600, 400);
        miVentana.setLocationRelativeTo(null);
        miVentana.setVisible(true);
    }
}
