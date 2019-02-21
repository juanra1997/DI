/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Juanra
 */
public class Controlador implements ActionListener {

    private Vista v;
    private Modelo m;
    
    public Controlador(Vista vista, Modelo modelo){
        
        v=vista;
        m=modelo;
        v.boton.addActionListener(this);
    }
    
    public void iniciar(){
        v.setTitle("MVC Multiplicar");
        v.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        m.setNumerouno(Integer.parseInt(v.txt1.getText()));
        m.setNumerodos(Integer.parseInt(v.txt2.getText()));
        m.multiplicar();
        v.txtresul.setText(String.valueOf(m.getResultado()));
    }
    
}
