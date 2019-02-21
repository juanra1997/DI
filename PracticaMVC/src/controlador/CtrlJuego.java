/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.*;
import vista.FrmJuego;

/**
 *
 * @author Juanra
 */
public class CtrlJuego implements ActionListener {
    
    private Juego j;
    private Consultas c;
    private FrmJuego f;
    
    public CtrlJuego(Juego juego, Consultas consultas, FrmJuego frame){
        
        j=juego;
        c=consultas;
        f=frame;
        f.bbuscar.addActionListener(this);
        f.beliminar.addActionListener(this);
        f.bguardar.addActionListener(this);
        f.blimpiar.addActionListener(this);
        f.bmodificar.addActionListener(this);
    }
    
    public void iniciar(){
        f.setTitle("Juegos");
        f.setLocationRelativeTo(null);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        if(e.getSource()==f.bbuscar){           
            
            j.setNombre(f.txtnombre.getText());
            
            if(c.buscar(j)){
                JOptionPane.showMessageDialog(null, "Registro encontado");
                f.txtdificultad.setText(j.getDificultad());
                f.txtnombre.setText(j.getNombre());
                f.txtgenero.setText(j.getGenero());
                f.txthoras.setText(String.valueOf(j.getHoras_de_juego()));
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al buscar el registro");
                limpiar();
            }
        }
        if(e.getSource()==f.blimpiar){
            limpiar();
        }
        if(e.getSource()==f.bguardar){
            
            j.setDificultad(f.txtdificultad.getText());
            j.setGenero(f.txtgenero.getText());
            j.setNombre(f.txtnombre.getText());
            j.setHoras_de_juego(Integer.parseInt(f.txthoras.getText()));
            if(c.registrar(j)){
                JOptionPane.showMessageDialog(null, "Registro guradado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar el registro");
                limpiar();
            }
        }
        if(e.getSource()==f.bmodificar){
            
            j.setDificultad(f.txtdificultad.getText());
            j.setGenero(f.txtgenero.getText());
            j.setNombre(f.txtnombre.getText());
            j.setHoras_de_juego(Integer.parseInt(f.txthoras.getText()));
            if(c.modificar(j)){
                JOptionPane.showMessageDialog(null, "Registro modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar el registro");
                limpiar();
            }
        }
        if(e.getSource()==f.beliminar){
            
            j.setNombre(f.txtnombre.getText());
            if(c.eliminar(j)){
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
                limpiar();
            }
        }
    }
    
    public void limpiar(){
        f.txtdificultad.setText("");
        f.txtnombre.setText("");
        f.txthoras.setText("");
        f.txtgenero.setText("");
    }
    
}
