/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Esqueleto;
import vista.PanelAyuda;

/**
 *
 * @author Juanra
 */
public class CtrlPanelAyuda implements ActionListener{
    
    PanelAyuda panelAyuda;
    CtrlEsqueleto ctrlEsqueleto;
    
    public CtrlPanelAyuda(PanelAyuda pa, CtrlEsqueleto e){
        
        panelAyuda=pa;
        ctrlEsqueleto=e;
        panelAyuda.productos.addActionListener(this);
        panelAyuda.salir.addActionListener(this);
        panelAyuda.vehiculos.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==panelAyuda.productos){
            ctrlEsqueleto.ponerProductos();
        }
        if(e.getSource()==panelAyuda.vehiculos){
            ctrlEsqueleto.ponerVehiculos();
        }
        if(e.getSource()==panelAyuda.salir){
            System.exit(0);
        }
    }
}
