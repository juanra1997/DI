package qtjambi;

/********************************************************************************
 ** Form generated from reading ui file 'ventanaPrincipalQTJambi.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import javax.swing.JOptionPane;

public class Ventana implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction salir;
    public QAction actionAlta;
    public QAction actionBajas;
    public QAction actionAcerca_de;
    public QWidget centralwidget;
    public QPushButton pushButton;
    public QMenuBar menubar;
    public QMenu menuArchivo;
    public QMenu menuReservas;
    public QMenu menuAyuda;
    public QStatusBar statusbar;

    public Ventana() { super(); }
    
    void abrir(){

        Dialogo Alta = new Dialogo();
        QDialog dialog = new QDialog();
        Alta.setupUi(dialog);
        dialog.show();

    }
    
    void aviso(){
        
        JOptionPane.showMessageDialog(null, "Esta aplicación no se ha desarrollado aun");
    }

    @Override
    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(1160, 709).expandedTo(MainWindow.minimumSizeHint()));
        MainWindow.setWindowIcon(new QIcon(new QPixmap("diamante.png")));
        salir = new QAction(MainWindow);
        salir.setObjectName("salir");
        salir.triggered.connect(MainWindow, "close()");
        actionAlta = new QAction(MainWindow);
        actionAlta.setObjectName("actionAlta");
        actionAlta.triggered.connect(this, "abrir()");
        actionBajas = new QAction(MainWindow);
        actionBajas.setObjectName("actionBajas");
        actionBajas.triggered.connect(this, "baja()");
        
        actionAcerca_de = new QAction(MainWindow);
        actionAcerca_de.setObjectName("actionAcerca_de");
        actionAcerca_de.triggered.connect(this, "acerca()");
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        pushButton = new QPushButton(centralwidget);
        pushButton.setObjectName("pushButton");
        pushButton.setGeometry(new QRect(400, 240, 401, 151));
        QFont font = new QFont();
        font.setFamily("Algerian");
        font.setPointSize(20);
        pushButton.setFont(font);
        pushButton.clicked.connect(this, "abrir()");
        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 1160, 26));
        menuArchivo = new QMenu(menubar);
        menuArchivo.setObjectName("menuArchivo");
        menuReservas = new QMenu(menubar);
        menuReservas.setObjectName("menuReservas");
        menuAyuda = new QMenu(menubar);
        menuAyuda.setObjectName("menuAyuda");
        MainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);

        menubar.addAction(menuArchivo.menuAction());
        menubar.addAction(menuReservas.menuAction());
        menubar.addAction(menuAyuda.menuAction());
        menuArchivo.addAction(salir);
        menuReservas.addAction(actionAlta);
        menuReservas.addAction(actionBajas);
        menuAyuda.addAction(actionAcerca_de);
        retranslateUi(MainWindow);

        MainWindow.connectSlotsByName();
    } // setupUi

    void acerca(){
        JOptionPane.showMessageDialog(null, "Aplicacion creada por Juan Raul Mellado Garcia");
    }
    
    void baja(){
        JOptionPane.showMessageDialog(null, "Aplicacion en desarrollo");
    }
    
    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Gestion Hotel Diamante", null));
        salir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Salir", null));
        actionAlta.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Altas", null));
        actionBajas.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Bajas", null));
        actionAcerca_de.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Acerca de...", null));
        pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "RESERVAS", null));
        menuArchivo.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Archivo", null));
        menuReservas.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Reservas", null));
        menuAyuda.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Ayuda", null));
    } // retranslateUi

}

