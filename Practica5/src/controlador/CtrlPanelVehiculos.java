/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.mysql.jdbc.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import javax.swing.JOptionPane;
import modelo.ConsultasVehiculos;
import modelo.Vehiculo;
import vista.PanelVehiculos;

/**
 *
 * @author Juanra
 */
public class CtrlPanelVehiculos implements ActionListener, KeyListener{
    
    //private Connection conexion;
    
    private Vehiculo vehiculo;
    
    private ConsultasVehiculos consultas;
    
    PanelVehiculos panelVehiculos;
    
    public CtrlPanelVehiculos(PanelVehiculos pv, Connection c){
        
        //conexion=c;
        
        vehiculo=new Vehiculo();
        
        consultas=new ConsultasVehiculos(c);
        
        panelVehiculos=pv;
        
        panelVehiculos.guardar.addActionListener(this);
        panelVehiculos.actualizar.addActionListener(this);
        panelVehiculos.borrar.addActionListener(this);
        panelVehiculos.limpiar.addActionListener(this);
        panelVehiculos.buscar.addActionListener(this);
        panelVehiculos.txtRevision.addKeyListener(this);
        panelVehiculos.txtKilometros.addKeyListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==panelVehiculos.buscar){        
            
            //System.out.println("Holis");
            
            vehiculo.setMatricula(panelVehiculos.txtMatricula.getText());
            
            if(consultas.buscar(vehiculo)){
                JOptionPane.showMessageDialog(null, "Registro encontado");
                panelVehiculos.txtMatricula.setText(vehiculo.getMatricula());
                panelVehiculos.txtMarca.setText(vehiculo.getMarca());
                panelVehiculos.txtModelo.setText(vehiculo.getModelo());
                panelVehiculos.txtKilometros.setText(String.valueOf(vehiculo.getKilometros()));
                panelVehiculos.txtRevision.setText(String.valueOf(vehiculo.getFechaRevision()));
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al buscar el registro");
                limpiar();
            }
        }
        if(e.getSource()==panelVehiculos.limpiar){
            limpiar();
        }
        if(e.getSource()==panelVehiculos.guardar){
            
            vehiculo.setMatricula(panelVehiculos.txtMatricula.getText());
            vehiculo.setMarca(panelVehiculos.txtMarca.getText());
            vehiculo.setModelo(panelVehiculos.txtModelo.getText());
            vehiculo.setKilometros(Integer.parseInt(panelVehiculos.txtKilometros.getText()));
            vehiculo.setFechaRevision(Date.valueOf(panelVehiculos.txtRevision.getText()));
            
            if(consultas.guardar(vehiculo)){
                JOptionPane.showMessageDialog(null, "Registro guradado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar el registro");
                limpiar();
            }
        }
        if(e.getSource()==panelVehiculos.actualizar){
            
            vehiculo.setMatricula(panelVehiculos.txtMatricula.getText());
            vehiculo.setMarca(panelVehiculos.txtMarca.getText());
            vehiculo.setModelo(panelVehiculos.txtModelo.getText());
            vehiculo.setKilometros(Integer.parseInt(panelVehiculos.txtKilometros.getText()));
            vehiculo.setFechaRevision(Date.valueOf(panelVehiculos.txtRevision.getText()));
            
            if(consultas.actualizar(vehiculo)){
                JOptionPane.showMessageDialog(null, "Registro modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar el registro");
                limpiar();
            }
        }
        if(e.getSource()==panelVehiculos.borrar){
            
            vehiculo.setMatricula(panelVehiculos.txtMatricula.getText());
            if(consultas.eliminar(vehiculo)){
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
                limpiar();
            }
        }
    }
    
    public void limpiar(){
        panelVehiculos.txtMatricula.setText("");
        panelVehiculos.txtMarca.setText("");
        panelVehiculos.txtModelo.setText("");
        panelVehiculos.txtKilometros.setText("");
        panelVehiculos.txtRevision.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==panelVehiculos.txtKilometros){
            if(!Character.isDigit(e.getKeyChar())){
                e.consume();
            }
        }
        if(e.getSource()==panelVehiculos.txtRevision){
            if(!Character.isDigit(e.getKeyChar())&&e.getKeyChar()!=KeyEvent.VK_MINUS){
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
