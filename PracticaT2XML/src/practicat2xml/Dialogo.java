package practicat2xml;

/********************************************************************************
 ** Form generated from reading ui file 'dialogo.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Dialogo implements com.trolltech.qt.QUiForm<QDialog>
{
    public QWidget widget;
    public QGridLayout gridLayout_6;
    public QLabel label_7;
    public QGridLayout gridLayout;
    public QLabel lb_dni;
    public QLineEdit tdni;
    public QLabel lb_nombre;
    public QLineEdit tnombre;
    public QLabel lb_direccion;
    public QLineEdit tdireccion;
    public QSpacerItem horizontalSpacer_2;
    public QLabel lb_localidad;
    public QLineEdit tlocalidad;
    public QLabel lb_provincia;
    public QLineEdit tprovincia;
    public QGridLayout gridLayout_2;
    public QLabel label;
    public QLabel label_2;
    public QCalendarWidget centrada;
    public QSpacerItem horizontalSpacer;
    public QCalendarWidget csalida;
    public QGridLayout gridLayout_3;
    public QLabel label_3;
    public QSpinBox snumerohabitaciones;
    public QSpacerItem horizontalSpacer_3;
    public QLabel label_4;
    public QComboBox combo;
    public QSpacerItem horizontalSpacer_4;
    public QCheckBox cbfumador;
    public QGridLayout gridLayout_4;
    public QLabel lbobservaciones;
    public QSpacerItem horizontalSpacer_6;
    public QSpacerItem horizontalSpacer_7;
    public QSpacerItem horizontalSpacer_5;
    public QSpacerItem verticalSpacer;
    public QGroupBox groupBox;
    public QRadioButton rbalojamientoydesayuno;
    public QRadioButton rbmediapension;
    public QRadioButton rbpensioncompleta;
    public QGridLayout gridLayout_5;
    public QPushButton blimpiar;
    public QPushButton baceptar;
    public QPushButton bcancelar;
    public QSpacerItem horizontalSpacer_8;
    public QSpacerItem horizontalSpacer_9;
    public QSpacerItem horizontalSpacer_10;
    public QSpacerItem horizontalSpacer_11;
    public QLabel label_6;

    public Dialogo() { super(); }

    @Override
    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(811, 723).expandedTo(Dialog.minimumSizeHint()));
        widget = new QWidget(Dialog);
        widget.setObjectName("widget");
        widget.setGeometry(new QRect(20, 10, 770, 686));
        gridLayout_6 = new QGridLayout(widget);
        gridLayout_6.setObjectName("gridLayout_6");
        label_7 = new QLabel(widget);
        label_7.setObjectName("label_7");
        QFont font = new QFont();
        font.setFamily("Calibri");
        font.setPointSize(26);
        font.setBold(true);
        font.setWeight(75);
        label_7.setFont(font);

        gridLayout_6.addWidget(label_7, 2, 0, 1, 1);

        gridLayout = new QGridLayout();
        gridLayout.setObjectName("gridLayout");
        lb_dni = new QLabel(widget);
        lb_dni.setObjectName("lb_dni");

        gridLayout.addWidget(lb_dni, 0, 0, 1, 1);

        tdni = new QLineEdit(widget);
        tdni.setObjectName("tdni");

        gridLayout.addWidget(tdni, 0, 1, 1, 3);

        lb_nombre = new QLabel(widget);
        lb_nombre.setObjectName("lb_nombre");

        gridLayout.addWidget(lb_nombre, 0, 4, 1, 1);

        tnombre = new QLineEdit(widget);
        tnombre.setObjectName("tnombre");

        gridLayout.addWidget(tnombre, 0, 5, 1, 3);

        lb_direccion = new QLabel(widget);
        lb_direccion.setObjectName("lb_direccion");

        gridLayout.addWidget(lb_direccion, 1, 0, 1, 2);

        tdireccion = new QLineEdit(widget);
        tdireccion.setObjectName("tdireccion");

        gridLayout.addWidget(tdireccion, 1, 2, 1, 6);

        horizontalSpacer_2 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_2, 2, 0, 1, 2);

        lb_localidad = new QLabel(widget);
        lb_localidad.setObjectName("lb_localidad");

        gridLayout.addWidget(lb_localidad, 2, 2, 1, 1);

        tlocalidad = new QLineEdit(widget);
        tlocalidad.setObjectName("tlocalidad");

        gridLayout.addWidget(tlocalidad, 2, 3, 1, 3);

        lb_provincia = new QLabel(widget);
        lb_provincia.setObjectName("lb_provincia");

        gridLayout.addWidget(lb_provincia, 2, 6, 1, 1);

        tprovincia = new QLineEdit(widget);
        tprovincia.setObjectName("tprovincia");

        gridLayout.addWidget(tprovincia, 2, 7, 1, 1);


        gridLayout_6.addLayout(gridLayout, 1, 0, 1, 1);

        gridLayout_2 = new QGridLayout();
        gridLayout_2.setObjectName("gridLayout_2");
        label = new QLabel(widget);
        label.setObjectName("label");

        gridLayout_2.addWidget(label, 0, 0, 1, 1);

        label_2 = new QLabel(widget);
        label_2.setObjectName("label_2");

        gridLayout_2.addWidget(label_2, 0, 2, 1, 1);

        centrada = new QCalendarWidget(widget);
        centrada.setObjectName("centrada");

        gridLayout_2.addWidget(centrada, 1, 0, 1, 1);

        horizontalSpacer = new QSpacerItem(48, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_2.addItem(horizontalSpacer, 1, 1, 1, 1);

        csalida = new QCalendarWidget(widget);
        csalida.setObjectName("csalida");

        gridLayout_2.addWidget(csalida, 1, 2, 1, 1);


        gridLayout_6.addLayout(gridLayout_2, 3, 0, 1, 1);

        gridLayout_3 = new QGridLayout();
        gridLayout_3.setObjectName("gridLayout_3");
        label_3 = new QLabel(widget);
        label_3.setObjectName("label_3");

        gridLayout_3.addWidget(label_3, 0, 0, 1, 1);

        snumerohabitaciones = new QSpinBox(widget);
        snumerohabitaciones.setObjectName("snumerohabitaciones");
        snumerohabitaciones.setMinimum(1);
        snumerohabitaciones.setMaximum(15);
        snumerohabitaciones.setValue(1);

        gridLayout_3.addWidget(snumerohabitaciones, 0, 1, 1, 1);

        horizontalSpacer_3 = new QSpacerItem(48, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_3.addItem(horizontalSpacer_3, 0, 2, 1, 1);

        label_4 = new QLabel(widget);
        label_4.setObjectName("label_4");

        gridLayout_3.addWidget(label_4, 0, 3, 1, 1);

        combo = new QComboBox(widget);
        combo.setObjectName("combo");
        combo.setEditable(true);

        gridLayout_3.addWidget(combo, 0, 4, 1, 1);

        horizontalSpacer_4 = new QSpacerItem(18, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_3.addItem(horizontalSpacer_4, 0, 5, 1, 1);

        cbfumador = new QCheckBox(widget);
        cbfumador.setObjectName("cbfumador");
        cbfumador.setChecked(true);

        gridLayout_3.addWidget(cbfumador, 0, 6, 1, 1);


        gridLayout_6.addLayout(gridLayout_3, 4, 0, 1, 1);

        gridLayout_4 = new QGridLayout();
        gridLayout_4.setObjectName("gridLayout_4");
        lbobservaciones = new QLabel(widget);
        lbobservaciones.setObjectName("lbobservaciones");
        lbobservaciones.setWordWrap(true);

        gridLayout_4.addWidget(lbobservaciones, 0, 2, 1, 1);

        horizontalSpacer_6 = new QSpacerItem(78, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_4.addItem(horizontalSpacer_6, 1, 1, 1, 1);

        horizontalSpacer_7 = new QSpacerItem(458, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_4.addItem(horizontalSpacer_7, 1, 2, 1, 1);

        horizontalSpacer_5 = new QSpacerItem(208, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_4.addItem(horizontalSpacer_5, 1, 0, 1, 1);

        verticalSpacer = new QSpacerItem(20, 118, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout_4.addItem(verticalSpacer, 0, 1, 1, 1);

        groupBox = new QGroupBox(widget);
        groupBox.setObjectName("groupBox");
        rbalojamientoydesayuno = new QRadioButton(groupBox);
        rbalojamientoydesayuno.setObjectName("rbalojamientoydesayuno");
        rbalojamientoydesayuno.setGeometry(new QRect(10, 20, 161, 20));
        rbmediapension = new QRadioButton(groupBox);
        rbmediapension.setObjectName("rbmediapension");
        rbmediapension.setGeometry(new QRect(10, 60, 111, 20));
        rbpensioncompleta = new QRadioButton(groupBox);
        rbpensioncompleta.setObjectName("rbpensioncompleta");
        rbpensioncompleta.setGeometry(new QRect(10, 100, 141, 20));

        gridLayout_4.addWidget(groupBox, 0, 0, 1, 1);


        gridLayout_6.addLayout(gridLayout_4, 5, 0, 1, 1);

        gridLayout_5 = new QGridLayout();
        gridLayout_5.setObjectName("gridLayout_5");
        blimpiar = new QPushButton(widget);
        blimpiar.setObjectName("blimpiar");

        gridLayout_5.addWidget(blimpiar, 0, 0, 1, 1);

        baceptar = new QPushButton(widget);
        baceptar.setObjectName("baceptar");

        gridLayout_5.addWidget(baceptar, 0, 2, 1, 1);

        bcancelar = new QPushButton(widget);
        bcancelar.setObjectName("bcancelar");

        gridLayout_5.addWidget(bcancelar, 0, 3, 1, 1);

        horizontalSpacer_8 = new QSpacerItem(88, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_5.addItem(horizontalSpacer_8, 1, 0, 1, 1);

        horizontalSpacer_9 = new QSpacerItem(418, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_5.addItem(horizontalSpacer_9, 1, 1, 1, 1);

        horizontalSpacer_10 = new QSpacerItem(88, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_5.addItem(horizontalSpacer_10, 1, 2, 1, 1);

        horizontalSpacer_11 = new QSpacerItem(88, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_5.addItem(horizontalSpacer_11, 1, 3, 1, 1);


        gridLayout_6.addLayout(gridLayout_5, 6, 0, 1, 1);

        label_6 = new QLabel(widget);
        label_6.setObjectName("label_6");
        QFont font1 = new QFont();
        font1.setFamily("Calibri");
        font1.setPointSize(26);
        font1.setBold(true);
        font1.setWeight(75);
        label_6.setFont(font1);

        gridLayout_6.addWidget(label_6, 0, 0, 1, 1);

        lb_dni.setBuddy(tdni);
        lb_nombre.setBuddy(tnombre);
        lb_direccion.setBuddy(tdireccion);
        lb_localidad.setBuddy(tlocalidad);
        lb_provincia.setBuddy(tprovincia);
        label_3.setBuddy(snumerohabitaciones);
        QWidget.setTabOrder(tdni, tnombre);
        QWidget.setTabOrder(tnombre, tdireccion);
        QWidget.setTabOrder(tdireccion, tlocalidad);
        QWidget.setTabOrder(tlocalidad, tprovincia);
        QWidget.setTabOrder(tprovincia, centrada);
        QWidget.setTabOrder(centrada, csalida);
        QWidget.setTabOrder(csalida, snumerohabitaciones);
        QWidget.setTabOrder(snumerohabitaciones, combo);
        QWidget.setTabOrder(combo, cbfumador);
        QWidget.setTabOrder(cbfumador, rbalojamientoydesayuno);
        QWidget.setTabOrder(rbalojamientoydesayuno, rbmediapension);
        QWidget.setTabOrder(rbmediapension, rbpensioncompleta);
        QWidget.setTabOrder(rbpensioncompleta, baceptar);
        QWidget.setTabOrder(baceptar, bcancelar);
        QWidget.setTabOrder(bcancelar, blimpiar);
        retranslateUi(Dialog);
        blimpiar.clicked.connect(tdni, "clear()");
        blimpiar.clicked.connect(tnombre, "clear()");
        blimpiar.clicked.connect(tdireccion, "clear()");
        blimpiar.clicked.connect(tlocalidad, "clear()");
        blimpiar.clicked.connect(tprovincia, "clear()");
        blimpiar.clicked.connect(snumerohabitaciones, "clear()");
        blimpiar.clicked.connect(combo, "repaint()");
        blimpiar.clicked.connect(cbfumador, "setChecked(boolean)");
        bcancelar.clicked.connect(Dialog, "close()");
        baceptar.clicked.connect(Dialog, "showMaximized()");
        blimpiar.clicked.connect(groupBox, "repaint()");

        combo.setCurrentIndex(1);


        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dialog", null));
        label_7.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" text-decoration: underline;\">Datos de Reserva</span></p></body></html>", null));
        lb_dni.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&DNI", null));
        lb_nombre.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Nombre", null));
        lb_direccion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Direccion", null));
        lb_localidad.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Localidad", null));
        lb_provincia.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Provincia", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fecha de llegada", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fecha de salida", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Numero Habitaciones:", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Tipo de habitacion:", null));
        combo.clear();
        combo.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Simple", null));
        combo.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Doble", null));
        combo.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Suite", null));
        cbfumador.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fumador", null));
        lbobservaciones.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "mekl\u00f1ajsdlk\u00f1gfjasl\u00f1dkjfkasdjofioqewphja\u00f1dlkf jasdlk\u00f1 fjioas hgfihsdapkujfhjksda fkl\u00f1sdj f\u00f1kjsda \u00f1klfj ewi\u00f1alj flk\u00f1sdaj friqweu hfioasjd\u00f1 fkl\u00f1j3oipqew fio\u00f1lasd jfkp\u00f1asd", null));
        groupBox.setTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Regimen:", null));
        rbalojamientoydesayuno.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Alojamiento y desayuno", null));
        rbmediapension.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Media pension", null));
        rbpensioncompleta.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Pension Completa", null));
        blimpiar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Limpiar", null));
        baceptar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Aceptar", null));
        bcancelar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cancelar", null));
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" text-decoration: underline;\">Datos del Cliente</span></p></body></html>", null));
    } // retranslateUi
    
    public void limpiar(){
        if(rbalojamientoydesayuno.isChecked()){
            rbalojamientoydesayuno.setAutoExclusive(false);
            rbalojamientoydesayuno.setChecked(false);
            rbalojamientoydesayuno.setAutoExclusive(true);
        }else if(rbmediapension.isChecked()){
            rbmediapension.setAutoExclusive(false);
            rbmediapension.setChecked(false);
            rbmediapension.setAutoExclusive(true);
        }else if(rbpensioncompleta.isChecked()){
            rbpensioncompleta.setAutoExclusive(false);
            rbpensioncompleta.setChecked(false);
            rbpensioncompleta.setAutoExclusive(true);
        }
    }

}

