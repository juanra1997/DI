package examenqtjambijuanraul;

/********************************************************************************
 ** Form generated from reading ui file 'VentanaPrincipal.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class MainWindow implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionAcerda_de;
    public QAction actionNuevo_vehiculo;
    public QAction actionBaja_vehiculo;
    public QAction actionSalir;
    public QWidget centralwidget;
    public QPushButton pushButton;
    public QLabel label;
    public QMenuBar menubar;
    public QMenu menuArchivo;
    public QMenu menuVehiculo;
    public QMenu menuAcerca_de;
    public QStatusBar statusbar;

    public MainWindow() { super(); }

    @Override
    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(333, 335).expandedTo(MainWindow.minimumSizeHint()));
        MainWindow.setWindowIcon(new QIcon(new QPixmap("f1y0bb.png")));
        actionAcerda_de = new QAction(MainWindow);
        actionAcerda_de.setObjectName("actionAcerda_de");
        actionAcerda_de.triggered.connect(this, "mensaje()");
        actionNuevo_vehiculo = new QAction(MainWindow);
        actionNuevo_vehiculo.setObjectName("actionNuevo_vehiculo");
        actionNuevo_vehiculo.triggered.connect(this, "abrir()");
        actionBaja_vehiculo = new QAction(MainWindow);
        actionBaja_vehiculo.setObjectName("actionBaja_vehiculo");
        actionBaja_vehiculo.triggered.connect(this, "baja()");
        actionSalir = new QAction(MainWindow);
        actionSalir.setObjectName("actionSalir");
        actionSalir.triggered.connect(MainWindow, "close()");
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        pushButton = new QPushButton(centralwidget);
        pushButton.setObjectName("pushButton");
        pushButton.setGeometry(new QRect(100, 50, 131, 51));
        pushButton.clicked.connect(this,"abrir()");
        label = new QLabel(centralwidget);
        label.setObjectName("label");
        label.setGeometry(new QRect(110, 140, 121, 111));
        label.setPixmap(new QPixmap(("f1y0bb.png")));
        label.setScaledContents(true);
        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 333, 26));
        menuArchivo = new QMenu(menubar);
        menuArchivo.setObjectName("menuArchivo");
        menuVehiculo = new QMenu(menubar);
        menuVehiculo.setObjectName("menuVehiculo");
        menuAcerca_de = new QMenu(menubar);
        menuAcerca_de.setObjectName("menuAcerca_de");
        MainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);

        menubar.addAction(menuArchivo.menuAction());
        menubar.addAction(menuVehiculo.menuAction());
        menubar.addAction(menuAcerca_de.menuAction());
        menuArchivo.addAction(actionSalir);
        menuVehiculo.addAction(actionNuevo_vehiculo);
        menuVehiculo.addAction(actionBaja_vehiculo);
        menuAcerca_de.addAction(actionAcerda_de);
        retranslateUi(MainWindow);

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        actionAcerda_de.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Acerca de...", null));
        actionNuevo_vehiculo.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Nuevo vehiculo", null));
        actionBaja_vehiculo.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Baja vehiculo", null));
        actionSalir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Salir", null));
        pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Abrir", null));
        label.setText("");
        menuArchivo.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Archivo", null));
        menuVehiculo.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Vehiculo", null));
        menuAcerca_de.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Acerca de...", null));
    } // retranslateUi

    void abrir(){

        Dialog Alta = new Dialog();
        QDialog dialog = new QDialog();
        Alta.setupUi(dialog);
        dialog.show();

    }
    
    void baja(){
        QMessageBox.information(null, "Bajas", "Aplicacion en desarrollo");
    }
    
    void mensaje(){
        QMessageBox.information(null, "Acerca de...", "Aplicacion creada por Juan Raul Mellado Garcia");
    }
}

