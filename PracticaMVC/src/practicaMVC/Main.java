/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaMVC;

import controlador.CtrlJuego;
import modelo.Consultas;
import modelo.Juego;
import vista.FrmJuego;

/**
 *
 * @author Juanra
 */
public class Main {

    public static void main(String[] args) {

        Juego j = new Juego();
        Consultas c = new Consultas();
        FrmJuego f = new FrmJuego();

        CtrlJuego cj = new CtrlJuego(j, c, f);
        
        cj.iniciar();
        
        f.setVisible(true);

    }

}
