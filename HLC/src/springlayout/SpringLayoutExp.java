/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springlayout;

import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class SpringLayoutExp{
    
    public static void main(String[] args){
        
        MiVentana obj=new MiVentana();
        obj.setVisible(true);
        
    }
}

class MiVentana extends JFrame {

	private static final long serialVersionUID = 1L;

	public void iniciaComponentes(){
               
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejemplo BorderLayout");
        setSize(600, 400);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
