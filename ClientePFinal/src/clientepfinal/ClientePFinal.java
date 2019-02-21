/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientepfinal;

import controlador.CtrlVistaCliente;
import vista.VistaCliente;

/**
 *
 * @author Juanra
 */
public class ClientePFinal {
    
    VistaCliente cliente;
    CtrlVistaCliente ctrl;

    public ClientePFinal() {
       
        cliente=new VistaCliente();
        ctrl=new CtrlVistaCliente(cliente);
        cliente.setVisible(true);
        
        
    }
    
}
