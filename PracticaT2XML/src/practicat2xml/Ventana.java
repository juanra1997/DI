package practicat2xml;

/********************************************************************************
 ** Form generated from reading ui file 'principal.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ventana implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QWidget centralwidget;
    public QLabel label;
    public QLabel label_2;
    public QPushButton breservas;
    public QPushButton bsalir;
    public QMenuBar menubar;
    public QMenu menuAplicacion;
    public QMenu menuGestion;
    public QStatusBar statusbar;

    public Ventana() { super(); }
    
    void abrir(){

        Dialogo Alta = new Dialogo();
        QDialog dialog = new QDialog();
        Alta.setupUi(dialog);
        dialog.show();

    }

    @Override
    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(1014, 696).expandedTo(MainWindow.minimumSizeHint()));
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        label = new QLabel(centralwidget);
        label.setObjectName("label");
        label.setGeometry(new QRect(30, 60, 481, 471));
        label.setPixmap(new QPixmap(("C:\\qtjambi-community-4.8.7-win64-msvc2013\\T2_PracticaTema\\recursos\\f1y0bb.png")));
        label.setScaledContents(true);
        label_2 = new QLabel(centralwidget);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(540, 120, 451, 341));
        label_2.setWordWrap(true);
        breservas = new QPushButton(centralwidget);
        breservas.setObjectName("breservas");
        breservas.setGeometry(new QRect(540, 510, 93, 28));
        breservas.clicked.connect(this, "abrir()");
        
        bsalir = new QPushButton(centralwidget);
        bsalir.setObjectName("bsalir");
        bsalir.setGeometry(new QRect(720, 510, 93, 28));
        
        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 1014, 26));
        menuAplicacion = new QMenu(menubar);
        menuAplicacion.setObjectName("menuAplicacion");
        menuGestion = new QMenu(menubar);
        menuGestion.setObjectName("menuGestion");
        MainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);

        menubar.addAction(menuAplicacion.menuAction());
        menubar.addAction(menuGestion.menuAction());
        retranslateUi(MainWindow);

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        label.setText("");
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "<html><head/><body><p><span style=\" font-size:26pt;\">Oh Hi,</span></p><p><span style=\" font-size:26pt;\">It's me again.</span></p><p><span style=\" font-size:26pt;\">I miss you... </span></p><p><span style=\" font-size:26pt;\">Do You remember me, right?</span></p></body></html>", null));
        breservas.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Reservas", null));
        bsalir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Salir", null));
        menuAplicacion.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Aplicacion", null));
        menuGestion.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Gestion", null));
    } // retranslateUi

}

