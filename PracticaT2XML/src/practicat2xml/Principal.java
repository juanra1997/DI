/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicat2xml;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;

/**
 *
 * @author Juanra
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QApplication.initialize(args);

                QMainWindow mw = new QMainWindow();

                Ventana principal = new Ventana();

                principal.setupUi( mw );

                mw.show();

                QApplication.execStatic();


        
    }
    
}
