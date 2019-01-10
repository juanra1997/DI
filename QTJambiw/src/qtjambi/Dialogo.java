package qtjambi;

/********************************************************************************
 ** Form generated from reading ui file 'dialogoQTJambi.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import javax.swing.JOptionPane;

public class Dialogo implements com.trolltech.qt.QUiForm<QDialog>
{
    public QWidget widget;
    public QLabel label;
    public QWidget widget_2;
    public QGridLayout gridLayout;
    public QLineEdit tnombre;
    public QSpacerItem verticalSpacer;
    public QSpacerItem verticalSpacer_3;
    public QSpacerItem verticalSpacer_2;
    public QSpacerItem horizontalSpacer_2;
    public QLabel label_2;
    public QSpacerItem verticalSpacer_6;
    public QSpacerItem horizontalSpacer_7;
    public QSpacerItem horizontalSpacer_8;
    public QSpacerItem horizontalSpacer_3;
    public QSpacerItem verticalSpacer_7;
    public QLabel label_3;
    public QLabel label_4;
    public QLineEdit tdireccion;
    public QSpacerItem horizontalSpacer_6;
    public QLineEdit tapellidos;
    public QSpacerItem verticalSpacer_4;
    public QSpacerItem horizontalSpacer_4;
    public QLabel label_5;
    public QLineEdit ttelefono;
    public QSpinBox cantidadhabitaciones;
    public QSpacerItem verticalSpacer_5;
    public QLabel habitaciones;
    public QWidget widget_3;
    public QLabel label_6;
    public QLabel label_7;
    public QLabel label_8;
    public QLabel label_9;
    public QDateEdit fechaentrada;
    public QDateEdit fechasalida;
    public QLineEdit dias;
    public QComboBox combo;
    public QCheckBox ninnos;
    public QWidget widget_4;
    public QSpinBox edad;
    public QLabel label_10;
    public QLabel label_12;
    public QTextEdit extras;
    public QLabel label_11;
    public QWidget widget_5;
    public QLabel label_13;
    public QGroupBox groupBox;
    public QRadioButton rbsi;
    public QRadioButton rbno;
    public QSlider slider;
    public QLabel label_14;
    public QWidget widget_6;
    public QPushButton baceptar;
    public QPushButton bcancelar;
    public QLabel label_15;
    public QLineEdit timporte;

    public Dialogo() { super(); }

    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(1552, 884).expandedTo(Dialog.minimumSizeHint()));
        Dialog.setWindowIcon(new QIcon(new QPixmap("diamante.png")));
        Dialog.setModal(true);
        widget = new QWidget(Dialog);
        widget.setObjectName("widget");
        widget.setGeometry(new QRect(0, 0, 1571, 141));
        widget.setStyleSheet("background-color: rgb(0, 0, 0);");
        label = new QLabel(widget);
        label.setObjectName("label");
        label.setGeometry(new QRect(570, 20, 491, 91));
        QFont font = new QFont();
        font.setFamily("Algerian");
        font.setPointSize(48);
        label.setFont(font);
        widget_2 = new QWidget(Dialog);
        widget_2.setObjectName("widget_2");
        widget_2.setGeometry(new QRect(0, 140, 291, 241));
        widget_2.setStyleSheet("background-color: rgb(85, 255, 255);");
        gridLayout = new QGridLayout(widget_2);
        gridLayout.setObjectName("gridLayout");
        tnombre = new QLineEdit(widget_2);
        tnombre.setObjectName("tnombre");
        tnombre.setStyleSheet("background-color: rgb(255, 255, 255);");

        gridLayout.addWidget(tnombre, 0, 1, 1, 1);

        verticalSpacer = new QSpacerItem(20, 19, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer, 0, 2, 1, 1);

        verticalSpacer_3 = new QSpacerItem(20, 19, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer_3, 2, 2, 1, 1);

        verticalSpacer_2 = new QSpacerItem(20, 27, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer_2, 1, 2, 1, 1);

        horizontalSpacer_2 = new QSpacerItem(134, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_2, 1, 1, 1, 1);

        label_2 = new QLabel(widget_2);
        label_2.setObjectName("label_2");
        QFont font1 = new QFont();
        font1.setPointSize(10);
        label_2.setFont(font1);

        gridLayout.addWidget(label_2, 0, 0, 1, 1);

        verticalSpacer_6 = new QSpacerItem(20, 26, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer_6, 3, 2, 1, 1);

        horizontalSpacer_7 = new QSpacerItem(92, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_7, 3, 0, 1, 1);

        horizontalSpacer_8 = new QSpacerItem(92, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_8, 1, 0, 1, 1);

        horizontalSpacer_3 = new QSpacerItem(134, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_3, 3, 1, 1, 1);

        verticalSpacer_7 = new QSpacerItem(20, 27, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer_7, 5, 2, 1, 1);

        label_3 = new QLabel(widget_2);
        label_3.setObjectName("label_3");
        QFont font2 = new QFont();
        font2.setPointSize(10);
        label_3.setFont(font2);

        gridLayout.addWidget(label_3, 2, 0, 1, 1);

        label_4 = new QLabel(widget_2);
        label_4.setObjectName("label_4");
        QFont font3 = new QFont();
        font3.setPointSize(10);
        label_4.setFont(font3);

        gridLayout.addWidget(label_4, 4, 0, 1, 1);

        tdireccion = new QLineEdit(widget_2);
        tdireccion.setObjectName("tdireccion");
        tdireccion.setStyleSheet("background-color: rgb(255, 255, 255);");

        gridLayout.addWidget(tdireccion, 4, 1, 1, 1);

        horizontalSpacer_6 = new QSpacerItem(92, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_6, 5, 0, 1, 1);

        tapellidos = new QLineEdit(widget_2);
        tapellidos.setObjectName("tapellidos");
        tapellidos.setStyleSheet("background-color: rgb(255, 255, 255);");

        gridLayout.addWidget(tapellidos, 2, 1, 1, 1);

        verticalSpacer_4 = new QSpacerItem(20, 19, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer_4, 4, 2, 1, 1);

        horizontalSpacer_4 = new QSpacerItem(134, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_4, 5, 1, 1, 1);

        label_5 = new QLabel(widget_2);
        label_5.setObjectName("label_5");
        QFont font4 = new QFont();
        font4.setPointSize(10);
        label_5.setFont(font4);

        gridLayout.addWidget(label_5, 6, 0, 1, 1);

        ttelefono = new QLineEdit(widget_2);
        ttelefono.setObjectName("ttelefono");
        ttelefono.setStyleSheet("background-color: rgb(255, 255, 255);");
        

        gridLayout.addWidget(ttelefono, 6, 1, 1, 1);

        verticalSpacer_5 = new QSpacerItem(20, 19, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer_5, 6, 2, 1, 1);

        widget_3 = new QWidget(Dialog);
        widget_3.setObjectName("widget_3");
        widget_3.setGeometry(new QRect(290, 140, 841, 241));
        widget_3.setStyleSheet("background-color: rgb(255, 0, 0);");
        label_6 = new QLabel(widget_3);
        label_6.setObjectName("label_6");
        label_6.setGeometry(new QRect(40, 40, 141, 16));
        QFont font5 = new QFont();
        font5.setPointSize(10);
        label_6.setFont(font5);
        label_7 = new QLabel(widget_3);
        label_7.setObjectName("label_7");
        label_7.setGeometry(new QRect(40, 80, 141, 16));
        QFont font6 = new QFont();
        font6.setPointSize(10);
        label_7.setFont(font6);
        label_8 = new QLabel(widget_3);
        label_8.setObjectName("label_8");
        label_8.setGeometry(new QRect(40, 120, 141, 16));
        QFont font7 = new QFont();
        font7.setPointSize(10);
        label_8.setFont(font7);
        label_9 = new QLabel(widget_3);
        label_9.setObjectName("label_9");
        label_9.setGeometry(new QRect(40, 160, 141, 16));
        QFont font8 = new QFont();
        font8.setPointSize(10);
        label_9.setFont(font8);
        fechaentrada = new QDateEdit(widget_3);
        fechaentrada.setObjectName("fechaentrada");
        fechaentrada.setGeometry(new QRect(230, 40, 110, 22));
        fechaentrada.setStyleSheet("background-color: rgb(255, 255, 255);");
        fechaentrada.setCalendarPopup(false);
        fechaentrada.setDate(QDate.currentDate());
//        fechaentrada.dateChanged.connect(this, "cambiardias()");
        fechasalida = new QDateEdit(widget_3);
        fechasalida.setObjectName("fechasalida");
        fechasalida.setGeometry(new QRect(230, 80, 110, 22));
        fechasalida.setStyleSheet("background-color: rgb(255, 255, 255);");
        fechasalida.setDate((QDate.currentDate()).addDays(1));
//        fechasalida.dateChanged.connect(this, "cambiardias()");
        dias = new QLineEdit(widget_3);
        dias.setObjectName("dias");
        dias.setGeometry(new QRect(230, 120, 111, 22));
        dias.setStyleSheet("background-color: rgb(255, 255, 255);");
        dias.setText(String.valueOf(fechasalida.date().compareTo(fechaentrada.date())));
        dias.setEnabled(false);
        cantidadhabitaciones = new QSpinBox(widget_3);
        cantidadhabitaciones.setObjectName("cantidadhabitaciones");
        cantidadhabitaciones.setGeometry(new QRect(230, 190, 111, 22));
        cantidadhabitaciones.setStyleSheet("background-color: rgb(255, 255, 255);");
        combo = new QComboBox(widget_3);
        combo.setObjectName("combo");
        combo.setGeometry(new QRect(230, 160, 111, 22));
        combo.setStyleSheet("background-color: rgb(255, 255, 255);");
        ninnos = new QCheckBox(widget_3);
        ninnos.setObjectName("ninnos");
        ninnos.setGeometry(new QRect(400, 40, 81, 20));
        QFont font9 = new QFont();
        font9.setPointSize(10);
        ninnos.setFont(font9);
        widget_4 = new QWidget(widget_3);
        widget_4.setObjectName("widget_4");
        widget_4.setGeometry(new QRect(519, 19, 301, 201));
        widget_4.setStyleSheet("background-color: rgb(255, 255, 0);");
        edad = new QSpinBox(widget_4);
        edad.setObjectName("edad");
        edad.setGeometry(new QRect(80, 10, 101, 22));
        edad.setStyleSheet("background-color: rgb(255, 255, 255);");
        edad.setMinimum(0);
        edad.setMaximum(14);
        edad.valueChanged.connect(this, "poner()");
        label_10 = new QLabel(widget_4);
        label_10.setObjectName("label_10");
        label_10.setGeometry(new QRect(20, 10, 53, 16));
        QFont font10 = new QFont();
        font10.setPointSize(10);
        label_10.setFont(font10);
        label_12 = new QLabel(widget_4);
        label_12.setObjectName("label_12");
        label_12.setGeometry(new QRect(20, 50, 53, 16));
        QFont font11 = new QFont();
        font11.setPointSize(10);
        label_12.setFont(font11);
        habitaciones = new QLabel(widget_3);
        habitaciones.setObjectName("habitaciones");
        habitaciones.setGeometry(new QRect(40, 190, 191, 16));
        QFont font12 = new QFont();
        font12.setPointSize(10);
        habitaciones.setFont(font12);
        extras = new QTextEdit(widget_4);
        widget_4.setVisible(false);
        extras.setObjectName("extras");
        extras.setGeometry(new QRect(20, 80, 261, 111));
        extras.setStyleSheet("background-color: rgb(255, 255, 255);");
        label_11 = new QLabel(Dialog);
        label_11.setObjectName("label_11");
        label_11.setGeometry(new QRect(0, 380, 1131, 511));
        label_11.setPixmap(new QPixmap(("265-swimming-pool-22-hotel-barcelo-costa-cancun_tcm7-126728.png")));
        label_11.setScaledContents(true);
        widget_5 = new QWidget(Dialog);
        widget_5.setObjectName("widget_5");
        widget_5.setGeometry(new QRect(1130, 380, 431, 511));
        widget_5.setStyleSheet("background-color: rgb(0, 255, 0);");
        label_13 = new QLabel(widget_5);
        label_13.setObjectName("label_13");
        label_13.setGeometry(new QRect(70, 50, 291, 16));
        QFont font20 = new QFont();
        font20.setPointSize(10);
        label_13.setFont(font20);
        groupBox = new QGroupBox(widget_5);
        groupBox.setObjectName("groupBox");
        groupBox.setGeometry(new QRect(70, 90, 120, 80));
        rbsi = new QRadioButton(groupBox);
        rbsi.setObjectName("rbsi");
        rbsi.setGeometry(new QRect(0, 10, 95, 20));
        QFont font13 = new QFont();
        font13.setPointSize(10);
        rbsi.setFont(font13);
        rbno = new QRadioButton(groupBox);
        rbno.setObjectName("rbno");
        rbno.setGeometry(new QRect(0, 40, 95, 20));
        QFont font14 = new QFont();
        font14.setPointSize(10);
        rbno.setFont(font14);
        slider = new QSlider(widget_5);
        slider.setObjectName("slider");
        slider.setGeometry(new QRect(40, 330, 351, 22));
        slider.setMaximum(100);
        slider.setValue(50);
        slider.setOrientation(com.trolltech.qt.core.Qt.Orientation.Horizontal);
        label_14 = new QLabel(widget_5);
        label_14.setObjectName("label_14");
        label_14.setGeometry(new QRect(140, 260, 161, 20));
        QFont font15 = new QFont();
        font15.setPointSize(10);
        label_14.setFont(font15);
        widget_6 = new QWidget(Dialog);
        widget_6.setObjectName("widget_6");
        widget_6.setGeometry(new QRect(1129, 139, 441, 241));
        widget_6.setStyleSheet("background-color: rgb(0, 85, 255);");
        baceptar = new QPushButton(widget_6);
        baceptar.setObjectName("baceptar");
        baceptar.setGeometry(new QRect(60, 90, 93, 28));
        baceptar.setStyleSheet("background-color: rgb(255, 255, 255);");
        bcancelar = new QPushButton(widget_6);
        bcancelar.setObjectName("bcancelar");
        bcancelar.setGeometry(new QRect(220, 90, 93, 28));
        bcancelar.setStyleSheet("background-color: rgb(255, 255, 255);");
        label_15 = new QLabel(widget_6);
        label_15.setObjectName("label_15");
        label_15.setGeometry(new QRect(70, 170, 71, 16));
        QFont font16 = new QFont();
        font16.setPointSize(10);
        label_15.setFont(font16);
        timporte = new QLineEdit(widget_6);
        timporte.setObjectName("timporte");
        timporte.setGeometry(new QRect(160, 170, 113, 22));
        timporte.setStyleSheet("background-color: rgb(255, 255, 255);");
        timporte.setReadOnly(true);
        QWidget.setTabOrder(tnombre, tapellidos);
        QWidget.setTabOrder(tapellidos, tdireccion);
        QWidget.setTabOrder(tdireccion, ttelefono);
        QWidget.setTabOrder(ttelefono, fechaentrada);
        QWidget.setTabOrder(fechaentrada, fechasalida);
        QWidget.setTabOrder(fechasalida, dias);
        QWidget.setTabOrder(dias, combo);
        QWidget.setTabOrder(combo, cantidadhabitaciones);
        QWidget.setTabOrder(cantidadhabitaciones, ninnos);
        QWidget.setTabOrder(ninnos, edad);
        QWidget.setTabOrder(edad, extras);
        QWidget.setTabOrder(extras, baceptar);
        QWidget.setTabOrder(baceptar, bcancelar);
        QWidget.setTabOrder(bcancelar, rbsi);
        QWidget.setTabOrder(rbsi, rbno);
        QWidget.setTabOrder(rbno, slider);
        retranslateUi(Dialog);
        bcancelar.clicked.connect(tnombre, "clear()");
        bcancelar.clicked.connect(tapellidos, "clear()");
        bcancelar.clicked.connect(tdireccion, "clear()");
        bcancelar.clicked.connect(ttelefono, "clear()");
//        bcancelar.clicked.connect(fechaentrada, "clear()");
//        bcancelar.clicked.connect(fechasalida, "clear()");
//        bcancelar.clicked.connect(dias, "clear()");
//        bcancelar.clicked.connect(combo, "clear()");
        bcancelar.clicked.connect(this, "cancelar()");
        bcancelar.clicked.connect(extras, "clear()");
//        bcancelar.clicked.connect(edad, "clear()");
        ninnos.toggled.connect(this, "accion()");
        baceptar.clicked.connect(this, "calcular()");

        Dialog.connectSlotsByName();
    } // setupUi
    
    void accion(){
        if(ninnos.isChecked()){
            widget_4.setVisible(true);
        }else{
            widget_4.setVisible(false);
        }
    }
    
    void cancelar(){
        widget_4.setVisible(false);
        ninnos.setChecked(false);
    }
    
    void calcular(){
        if(tnombre.text().isEmpty()||tapellidos.text().isEmpty()||tdireccion.text().isEmpty()||ttelefono.text().isEmpty()){
            JOptionPane.showMessageDialog(null, "Faltan datos");
        }else{
        int suma=0;
        if(combo.currentIndex()==0){
            suma=suma+50;
        }
        if(combo.currentIndex()==1){
            suma=suma+75;
        }
        if(combo.currentIndex()==2){
            suma=suma+125;
        }
        suma=suma*Integer.parseInt(dias.text());
        if(ninnos.isChecked()){
            suma=suma+20;
        }
        suma=suma*cantidadhabitaciones.value();
        timporte.setText(suma+"€");
        }
    }
    
    void poner(){
        if(edad.value()>=0&&edad.value()<=3){
            extras.setText("Cuna, ");
        }else if(edad.value()>=4&&edad.value()<=10){
            extras.setText("Cama supletoria pequeña, ");
        }else{
            extras.setText("Cama supletoria normal, ");
        }
    }
    
    /*void cambiardias(){
        dias.setText(String.valueOf(fechasalida.date().compareTo(fechaentrada)));
    }*/

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Alta Reservas", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-size:36pt; color:#ffffff;\">HOTEL DIAMANTE</span></p></body></html>", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Nombre:", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Apellidos:", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Direccion:", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Telefono:", null));
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fecha de entrada:", null));
        label_7.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fecha de salida:", null));
        label_8.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dias de estancia:", null));
        label_9.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tipo de habitacion:", null));
        combo.clear();
        combo.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Simple", null));
        combo.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Doble", null));
        combo.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Suite", null));
        ninnos.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "\u00bfNi\u00f1os?", null));
        label_10.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Edad:", null));
        label_12.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Extras:", null));
        label_11.setText("");
        label_13.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "\u00bfTe ha resultado comoda esta interfaz?", null));
        groupBox.setTitle("");
        habitaciones.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Numero de habitaciones:", null));
        rbsi.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Si", null));
        rbno.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "No", null));
        label_14.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "\u00bfC\u00f3mo de comoda?", null));
        baceptar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Aceptar", null));
        bcancelar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cancelar", null));
        label_15.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Importe:", null));
        extras.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Introduce los extras que quieres para los ni\u00f1os</p></body></html>", null));
        groupBox.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Esto es para saber si la interfaz ha resultado comoda</p></body></html>", null));
        slider.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Esto es para como de comoda ha sido la interfaz</p></body></html>", null));
    } // retranslateUi

}

