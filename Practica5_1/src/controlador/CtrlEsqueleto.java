/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.Esqueleto;
import vista.PanelAyuda;
import vista.PanelInformes;
import vista.PanelProductos;
import vista.PanelVehiculos;

/**
 *
 * @author Juanra
 */
public class CtrlEsqueleto implements ActionListener{
    
    Esqueleto esqueleto;
    PanelAyuda ayuda;
    PanelProductos productos;
    PanelVehiculos vehiculos;
    PanelInformes informes;
    Connection conexion;
    
    public CtrlEsqueleto(Esqueleto e, PanelAyuda pa, PanelProductos pp, PanelVehiculos pv, PanelInformes pi, Connection c){
        
        esqueleto=e;
        ayuda=pa;
        productos=pp;
        vehiculos=pv;
        informes=pi;
        conexion=c;
    }
    
    public void iniciar(){
        
        //ayuda=new PanelAyuda();
        ayuda.setBackground(Color.WHITE);
        //productos=new PanelProductos();
        productos.setBackground(Color.WHITE);
        //vehiculos=new PanelVehiculos();
        vehiculos.setBackground(Color.WHITE);
        esqueleto.getContentPane().setBackground(Color.WHITE);
        esqueleto.setTitle("Practica 5");
        esqueleto.setLocationRelativeTo(null);
        esqueleto.setLayout(new FlowLayout());
        esqueleto.iSalir.addActionListener(this);
        esqueleto.iAyuda.addActionListener(this);
        esqueleto.iProductos.addActionListener(this);
        esqueleto.iVehiculos.addActionListener(this);
        esqueleto.iInfo.addActionListener(this);
        esqueleto.getContentPane().add(ayuda);
        esqueleto.iInformes.addActionListener(this);
    }
    
    private void quitarPaneles(){
        esqueleto.getContentPane().removeAll();
    }
    
    private void ultimar(){
        esqueleto.getContentPane().revalidate();
        esqueleto.getContentPane().repaint();
    }
    
    public void ponerProductos(){
        quitarPaneles();
        esqueleto.getContentPane().add(productos);
        ultimar();
        
    }
    
    public void ponerVehiculos(){
        quitarPaneles();
        esqueleto.getContentPane().add(vehiculos);
        ultimar();
    }
    
    public void ponerInformes(){
        quitarPaneles();
        esqueleto.getContentPane().add(informes);
        ultimar();
    }
    
    public void ponerAyuda(){
        quitarPaneles();
        esqueleto.getContentPane().add(ayuda);
        ultimar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==esqueleto.iSalir){
            try {
                conexion.close();
            } catch (SQLException ex) {
                //Logger.getLogger(CtrlEsqueleto.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }
        if(e.getSource()==esqueleto.iProductos){
            ponerProductos();
        }
        if(e.getSource()==esqueleto.iVehiculos){
            ponerVehiculos();
        }
        if(e.getSource()==esqueleto.iAyuda){
            ponerAyuda();
        }
        if(e.getSource()==esqueleto.iInfo){
            JOptionPane.showMessageDialog(null, "Aplicacion desarrollada por Juan Raul Mellado Garcia");
        }
        if(e.getSource()==esqueleto.iInformes){
            ponerInformes();
        }
    }
    
}
