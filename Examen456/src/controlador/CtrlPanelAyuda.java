/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import vista.Esqueleto;
import vista.PanelAyuda;

/**
 * Clase que controla las acciones que se realizan al pulsar los botones de la vista ayuda
 * @author Juanra
 */
public class CtrlPanelAyuda implements ActionListener{
    
    PanelAyuda panelAyuda;
    CtrlEsqueleto ctrlEsqueleto;
    /**
     * Constructor
     * @param pa panel de ayuda que se le pasa al constructor
     * @param e controlador del esqueleto que se le pasa al constructor
     */
    public CtrlPanelAyuda(PanelAyuda pa, CtrlEsqueleto e){
        
        //Ayuda();
        panelAyuda=pa;
        ctrlEsqueleto=e;
        panelAyuda.productos.addActionListener(this);
        panelAyuda.salir.addActionListener(this);
        //panelAyuda.vehiculos.addActionListener(this);
        
    }
    /**
     * Metodo que permite mostrar la ayuda en la ventanaa
     */
    /*public void Ayuda(){
        try{
            File fichero =new File("src/help/help_set.hs");
            URL hsURL=fichero.toURI().toURL();
            HelpSet helpset=new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb=helpset.createHelpBroker();
            hb.enableHelpOnButton(panelAyuda, "ayuda", helpset);*/
            /*hb.enableHelpKey(panelAyuda.productos, "productos", helpset);
            hb.enableHelpKey(panelAyuda.vehiculos, "vehiculos", helpset);  
            hb.enableHelpKey(panelAyuda.salir, "bsalir", helpset);*/
            
        /*}catch(Exception e){
            
        }
    }*/
    
    /**
     * ActionListener que ejecuta la accion del boton que se presiona
     * @param e Evento que genera al presionar el boton
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==panelAyuda.productos){
            ctrlEsqueleto.ponerProductos();
        }
        /*if(e.getSource()==panelAyuda.vehiculos){
            ctrlEsqueleto.ponerVehiculos();
        }*/
        if(e.getSource()==panelAyuda.salir){
            System.exit(0);
        }
    }
}
