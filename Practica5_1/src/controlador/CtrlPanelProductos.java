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
import javax.swing.JOptionPane;
import modelo.ConsultasProductos;
import modelo.Producto;
import vista.PanelProductos;

/**
 *
 * @author Juanra
 */
public class CtrlPanelProductos implements ActionListener, KeyListener{
    
    //private Connection conexion;    
    private Producto producto;
    private ConsultasProductos consultas;
    private PanelProductos panelProductos;
    
    public CtrlPanelProductos(PanelProductos pp, Connection c){
        
        //conexion=c;
        
        producto=new Producto();
        
        consultas=new ConsultasProductos(c);
        
        panelProductos=pp;
        
        panelProductos.guardar.addActionListener(this);
        panelProductos.actualizar.addActionListener(this);
        panelProductos.borrar.addActionListener(this);
        panelProductos.limpiar.addActionListener(this);
        panelProductos.buscar.addActionListener(this);
        panelProductos.txtPrecio.addKeyListener(this);
        panelProductos.txtDescuento.addKeyListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==panelProductos.buscar){        
            
            //System.out.println("Holis");
            
            producto.setReferencia(panelProductos.txtReferencia.getText());
            
            if(consultas.buscar(producto)){
                JOptionPane.showMessageDialog(null, "Registro encontado");
                panelProductos.txtReferencia.setText(producto.getReferencia());
                panelProductos.txtNombre.setText(producto.getNombre());
                panelProductos.txtDescripcion.setText(producto.getDescripcion());
                panelProductos.txtPrecio.setText(String.valueOf(producto.getPrecio()));
                panelProductos.txtDescuento.setText(String.valueOf(producto.getDescuento()));
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al buscar el registro");
                limpiar();
            }
        }
        if(e.getSource()==panelProductos.limpiar){
            limpiar();
        }
        if(e.getSource()==panelProductos.guardar){
            
            producto.setReferencia(panelProductos.txtReferencia.getText());
            producto.setNombre(panelProductos.txtNombre.getText());
            producto.setDescripcion(panelProductos.txtDescripcion.getText());
            producto.setPrecio(Double.parseDouble(panelProductos.txtPrecio.getText()));
            producto.setDescuento(Double.parseDouble(panelProductos.txtDescuento.getText()));
            
            if(consultas.guardar(producto)){
                JOptionPane.showMessageDialog(null, "Registro guradado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar el registro");
                limpiar();
            }
        }
        if(e.getSource()==panelProductos.actualizar){
            
            producto.setReferencia(panelProductos.txtReferencia.getText());
            producto.setNombre(panelProductos.txtNombre.getText());
            producto.setDescripcion(panelProductos.txtDescripcion.getText());
            producto.setPrecio(Double.parseDouble(panelProductos.txtPrecio.getText()));
            producto.setDescuento(Double.parseDouble(panelProductos.txtDescuento.getText()));
            
            if(consultas.actualizar(producto)){
                JOptionPane.showMessageDialog(null, "Registro modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar el registro");
                limpiar();
            }
        }
        if(e.getSource()==panelProductos.borrar){
            
            producto.setReferencia(panelProductos.txtReferencia.getText());
            if(consultas.eliminar(producto)){
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
                limpiar();
            }
        }
    }
    
    public void limpiar(){
        panelProductos.txtReferencia.setText("");
        panelProductos.txtNombre.setText("");
        panelProductos.txtDescripcion.setText("");
        panelProductos.txtPrecio.setText("");
        panelProductos.txtDescuento.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==panelProductos.txtPrecio||e.getSource()==panelProductos.txtDescuento){
            if(!Character.isDigit(e.getKeyChar())&&e.getKeyChar()!=KeyEvent.VK_PERIOD){
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
