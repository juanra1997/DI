/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mysql.jdbc.Connection;
import controlador.CtrlEsqueleto;
import vista.*;
import modelo.*;
import controlador.*;

/**
 *
 * @author Juanra
 */
public class Main {
    
    static Esqueleto esqueleto;
    static CtrlEsqueleto ctrlEsqueleto;
    static PanelAyuda ayuda;
    static CtrlPanelAyuda ctrlPanelAyuda;
    static PanelProductos productos;
    static CtrlPanelProductos ctrlPanelProductos;
    static PanelVehiculos vehiculos;
    static CtrlPanelVehiculos ctrlPanelVehiculos;
    static Connection conexion;
    static Conexion con;
    static PanelInformes informes;
    static CtrlPanelInformes ctrlPanelInformes;
    //static ConsultasProductos consultasProductos;
    //static ConsultasVehiculos consultasVehiculos;
    //static Producto producto;
    //static Vehiculo vehiculo;
    
    public static void main(String[] args){
        
        esqueleto = new Esqueleto();
        
        ayuda=new PanelAyuda();
        
        informes=new PanelInformes();
        
        productos=new PanelProductos();
        
        vehiculos=new PanelVehiculos();
        
        con=new Conexion();
        
        conexion=con.getConexion();
        
        ctrlEsqueleto = new CtrlEsqueleto(esqueleto, ayuda, productos, vehiculos, informes, conexion);
        
        ctrlEsqueleto.iniciar();
        
        ctrlPanelProductos=new CtrlPanelProductos(productos, conexion);
        
        ctrlPanelVehiculos=new CtrlPanelVehiculos(vehiculos, conexion);
        
        ctrlPanelAyuda=new CtrlPanelAyuda(ayuda, ctrlEsqueleto);
        
        ctrlPanelInformes=new CtrlPanelInformes(informes, conexion);
        
        esqueleto.setVisible(true);
    }
}
