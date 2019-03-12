/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static com.itextpdf.text.Annotation.URL;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JOptionPane;
import vista.Esqueleto;
import vista.PanelAyuda;
import vista.PanelInformes;
import vista.PanelProductos;
import vista.PanelVehiculos;

/**
 * Clase que controla las acciones que se realizan al pulsar los botones de la vista esqueleto
 * @author Juanra
 */
public class CtrlEsqueleto implements ActionListener/*, FocusListener*/{
    
    Esqueleto esqueleto;
    PanelAyuda ayuda;
    PanelProductos productos;
    PanelVehiculos vehiculos;
    PanelInformes informes;
    Connection conexion;
    /**
     * Constructor
     * @param e El esqueleto que se le pasa al constructor
     * @param pa El panel de ayuda aque se le pasa al constructor
     * @param pp El panel de productos que se le pasa al constructor
     * @param pv El panel de vehiculos que se le pasa al constructor
     * @param pi El panel de informes que se le pasa al constructor
     * @param c La conexion que se le pasa al constructor
     */
    public CtrlEsqueleto(Esqueleto e, PanelAyuda pa, PanelProductos pp, PanelVehiculos pv, PanelInformes pi, Connection c){
        
        esqueleto=e;
        ayuda=pa;
        productos=pp;
        vehiculos=pv;
        informes=pi;
        conexion=c;
    }
    /**
     * Metodo para iniciar la ventana
     */
    public void iniciar(){
        
        Ayuda();
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
        /*esqueleto.addFocusListener(this);
        vehiculos.addFocusListener(this);
        ayuda.addFocusListener(this);
        informes.addFocusListener(this);
        productos.addFocusListener(this);*/
    }
    /**
     * Metodo para quitar el panel que tiene la ventana
     */
    private void quitarPaneles(){
        esqueleto.getContentPane().removeAll();
    }
    /**
     * Metodo para repintar la ventana
     */
    private void ultimar(){
        esqueleto.getContentPane().revalidate();
        esqueleto.getContentPane().repaint();
    }
    /**
     * Metodo para poner el panel de productos en la ventana
     */
    public void ponerProductos(){
        quitarPaneles();
        esqueleto.getContentPane().add(productos);
        ultimar();
        productos.requestFocus();
        
    }
    /**
     * Metodo para poner el panel de vehiculos en la ventana
     */
    public void ponerVehiculos(){
        quitarPaneles();
        esqueleto.getContentPane().add(vehiculos);
        ultimar();
        vehiculos.requestFocus();
    }
    /**
     * Metodo para poner el panel de informes en la ventana
     */
    public void ponerInformes(){
        quitarPaneles();
        esqueleto.getContentPane().add(informes);
        ultimar();
        informes.requestFocus();
    }
    /**
     * Metodo para poner el panel de ayuda en la ventana
     */
    public void ponerAyuda(){
        quitarPaneles();
        esqueleto.getContentPane().add(ayuda);
        ultimar();
        ayuda.requestFocus();
    }
    /**
     * Metodo que permite mostrar la ayuda en la ventanaa
     */
    public void Ayuda(){
        try{
            File fichero =new File("src/help/help_set.hs");
            URL hsURL=fichero.toURI().toURL();
            HelpSet helpset=new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb=helpset.createHelpBroker();
            hb.enableHelpOnButton(esqueleto.MAyuda, "principal", helpset);
            
            hb.enableHelpKey(ayuda, "ayuda", helpset);
            hb.enableHelpKey(productos, "productos", helpset);
            hb.enableHelpKey(vehiculos, "vehiculos", helpset);
            hb.enableHelpKey(productos.buscar, "pbuscar", helpset);
            hb.enableHelpKey(productos.limpiar, "plimpiar", helpset);
            hb.enableHelpKey(productos.borrar, "pborrar", helpset);
            hb.enableHelpKey(productos.actualizar, "pactualizar", helpset);
            hb.enableHelpKey(productos.guardar, "pguardar", helpset);
            hb.enableHelpKey(vehiculos.buscar, "vbuscar", helpset);
            hb.enableHelpKey(vehiculos.limpiar, "vlimpiar", helpset);
            hb.enableHelpKey(vehiculos.borrar, "vborrar", helpset);
            hb.enableHelpKey(vehiculos.actualizar, "vactualizar", helpset);
            hb.enableHelpKey(vehiculos.guardar, "vguardar", helpset);
            hb.enableHelpKey(ayuda.productos, "bproductos", helpset);
            hb.enableHelpKey(ayuda.vehiculos, "bvehiculos", helpset);
            hb.enableHelpKey(ayuda.salir, "bsalir", helpset);
            hb.enableHelpKey(informes, "informes", helpset);
            hb.enableHelpKey(informes.informe1, "binforme", helpset);
            hb.enableHelpKey(informes.informe2, "binforme", helpset);
            hb.enableHelpKey(informes.informe3, "binforme", helpset);
            hb.enableHelpKey(informes.informe4, "binforme", helpset);
            hb.enableHelpKey(informes.informe5, "binforme", helpset);
            hb.enableHelpKey(informes.informe6, "binforme", helpset);
            hb.enableHelpKey(informes.pdf1, "bpdf", helpset);
            hb.enableHelpKey(informes.pdf2, "bpdf", helpset);
            hb.enableHelpKey(informes.pdf3, "bpdf", helpset);
            hb.enableHelpKey(informes.pdf4, "bpdf", helpset);
            hb.enableHelpKey(informes.pdf5, "bpdf", helpset);
            hb.enableHelpKey(informes.pdf6, "bpdf", helpset);
            
        }catch(Exception e){
            
        }
    }
    /*public void Ayuda(){
        try{
            File fichero =new File("src/help/help_set.hs");
            URL hsURL=fichero.toURI().toURL();
            HelpSet helpset=new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb=helpset.createHelpBroker();
            hb.enableHelpOnButton(esqueleto.MAyuda, "borrar", helpset);
            hb.enableHelpKey(ayuda, "borrar", helpset);
            hb.enableHelpKey(productos, "productos", helpset);
            hb.enableHelpKey(vehiculos, "vehiculos", helpset);
            
        }catch(Exception e){
            
        }
    }*/
    /**
     * ActionListener que ejecuta la accion del boton que se presiona
     * @param e Evento que genera al presionar el boton
     */
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

    /*@Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
