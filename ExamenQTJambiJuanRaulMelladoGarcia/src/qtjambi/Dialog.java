package qtjambi;

/********************************************************************************
 ** Form generated from reading ui file 'Dialogo.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import javax.swing.JOptionPane;

public class Dialog implements com.trolltech.qt.QUiForm<QDialog>
{
    public QGridLayout gridLayout_7;
    public QWidget widget;
    public QGridLayout gridLayout;
    public QSpacerItem verticalSpacer_2;
    public QSpacerItem horizontalSpacer;
    public QLabel label;
    public QSpacerItem horizontalSpacer_2;
    public QSpacerItem verticalSpacer;
    public QWidget widget_2;
    public QGridLayout gridLayout_2;
    public QLabel label_5;
    public QLabel label_2;
    public QLineEdit tcodigo;
    public QGroupBox groupBox;
    public QRadioButton gasolina;
    public QRadioButton diesel;
    public QRadioButton hibrido;
    public QRadioButton electrico;
    public QLabel label_3;
    public QComboBox combo;
    public QLabel info;
    public QCheckBox cambiomanual;
    public QSpacerItem verticalSpacer_6;
    public QWidget widget_3;
    public QGridLayout gridLayout_3;
    public QLabel label_6;
    public QLabel label_8;
    public QDateEdit fechaalta;
    public QLabel label_9;
    public QSpinBox precio;
    public QLabel label_10;
    public QComboBox ubicacion;
    public QSpacerItem horizontalSpacer_5;
    public QWidget widget_4;
    public QGridLayout gridLayout_4;
    public QLabel label_11;
    public QPlainTextEdit plainTextEdit;
    public QWidget widget_5;
    public QGridLayout gridLayout_5;
    public QLabel label_7;
    public QSpacerItem horizontalSpacer_3;
    public QWidget widget_6;
    public QGridLayout gridLayout_6;
    public QPushButton aceptar;
    public QPushButton cancelar;

    public Dialog() { super(); }

    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(1484, 887).expandedTo(Dialog.minimumSizeHint()));
        Dialog.setStyleSheet("background-color: rgb(0, 0, 255);");
        Dialog.setModal(true);
        gridLayout_7 = new QGridLayout(Dialog);
        gridLayout_7.setMargin(0);
        gridLayout_7.setObjectName("gridLayout_7");
        widget = new QWidget(Dialog);
        widget.setObjectName("widget");
        widget.setStyleSheet("background-color: rgb(0, 0, 0);");
        gridLayout = new QGridLayout(widget);
        gridLayout.setObjectName("gridLayout");
        verticalSpacer_2 = new QSpacerItem(20, 13, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer_2, 0, 1, 1, 1);

        horizontalSpacer = new QSpacerItem(519, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer, 1, 0, 1, 1);

        label = new QLabel(widget);
        label.setObjectName("label");
        QFont font = new QFont();
        font.setFamily("Algerian");
        font.setPointSize(18);
        label.setFont(font);

        gridLayout.addWidget(label, 1, 1, 1, 1);

        horizontalSpacer_2 = new QSpacerItem(518, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_2, 1, 2, 1, 1);

        verticalSpacer = new QSpacerItem(20, 13, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer, 2, 1, 1, 1);


        gridLayout_7.addWidget(widget, 0, 0, 1, 5);

        widget_2 = new QWidget(Dialog);
        widget_2.setObjectName("widget_2");
        widget_2.setStyleSheet("background-color: rgb(85, 255, 255);");
        gridLayout_2 = new QGridLayout(widget_2);
        gridLayout_2.setObjectName("gridLayout_2");
        label_5 = new QLabel(widget_2);
        label_5.setObjectName("label_5");
        QFont font1 = new QFont();
        font1.setPointSize(20);
        label_5.setFont(font1);

        gridLayout_2.addWidget(label_5, 0, 0, 1, 2);

        label_2 = new QLabel(widget_2);
        label_2.setObjectName("label_2");

        gridLayout_2.addWidget(label_2, 1, 0, 1, 1);

        tcodigo = new QLineEdit(widget_2);
        tcodigo.setObjectName("tcodigo");
        tcodigo.setStyleSheet("background-color: rgb(255, 255, 255);");

        gridLayout_2.addWidget(tcodigo, 1, 1, 1, 1);

        groupBox = new QGroupBox(widget_2);
        groupBox.setObjectName("groupBox");
        gasolina = new QRadioButton(groupBox);
        gasolina.setObjectName("gasolina");
        gasolina.setGeometry(new QRect(100, 0, 81, 20));
        gasolina.setChecked(true);
        diesel = new QRadioButton(groupBox);
        diesel.setObjectName("diesel");
        diesel.setGeometry(new QRect(180, 0, 61, 20));
        hibrido = new QRadioButton(groupBox);
        hibrido.setObjectName("hibrido");
        hibrido.setGeometry(new QRect(250, 0, 71, 20));
        electrico = new QRadioButton(groupBox);
        electrico.setObjectName("electrico");
        electrico.setGeometry(new QRect(320, 0, 71, 20));

        gridLayout_2.addWidget(groupBox, 2, 0, 1, 3);

        label_3 = new QLabel(widget_2);
        label_3.setObjectName("label_3");

        gridLayout_2.addWidget(label_3, 3, 0, 1, 1);

        combo = new QComboBox(widget_2);
        combo.setObjectName("combo");
        combo.setStyleSheet("background-color: rgb(255, 255, 255);");

        gridLayout_2.addWidget(combo, 3, 1, 1, 1);

        info = new QLabel(widget_2);
        info.setObjectName("info");
        info.setVisible(false);

        gridLayout_2.addWidget(info, 4, 0, 1, 3);

        cambiomanual = new QCheckBox(widget_2);
        cambiomanual.setObjectName("cambiomanual");
        cambiomanual.stateChanged.connect(this,"cambio()");

        gridLayout_2.addWidget(cambiomanual, 5, 0, 1, 1);


        gridLayout_7.addWidget(widget_2, 1, 0, 1, 1);

        verticalSpacer_6 = new QSpacerItem(20, 188, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout_7.addItem(verticalSpacer_6, 1, 3, 1, 1);

        widget_3 = new QWidget(Dialog);
        widget_3.setObjectName("widget_3");
        widget_3.setStyleSheet("background-color: rgb(255, 0, 0);");
        gridLayout_3 = new QGridLayout(widget_3);
        gridLayout_3.setObjectName("gridLayout_3");
        label_6 = new QLabel(widget_3);
        label_6.setObjectName("label_6");
        QFont font2 = new QFont();
        font2.setPointSize(20);
        label_6.setFont(font2);

        gridLayout_3.addWidget(label_6, 0, 0, 1, 2);

        label_8 = new QLabel(widget_3);
        label_8.setObjectName("label_8");

        gridLayout_3.addWidget(label_8, 1, 0, 1, 1);

        fechaalta = new QDateEdit(widget_3);
        fechaalta.setObjectName("fechaalta");
        fechaalta.setStyleSheet("background-color: rgb(255, 255, 255);");
        fechaalta.setDate(QDate.currentDate());

        gridLayout_3.addWidget(fechaalta, 1, 1, 1, 1);

        label_9 = new QLabel(widget_3);
        label_9.setObjectName("label_9");

        gridLayout_3.addWidget(label_9, 2, 0, 1, 1);

        precio = new QSpinBox(widget_3);
        precio.setObjectName("precio");
        precio.setStyleSheet("background-color: rgb(255, 255, 255);");
        precio.setMinimum(9000);
        precio.setMaximum(50000);

        gridLayout_3.addWidget(precio, 2, 1, 1, 1);

        label_10 = new QLabel(widget_3);
        label_10.setObjectName("label_10");

        gridLayout_3.addWidget(label_10, 3, 0, 1, 1);

        ubicacion = new QComboBox(widget_3);
        ubicacion.setObjectName("ubicacion");
        ubicacion.setStyleSheet("background-color: rgb(255, 255, 255);");

        gridLayout_3.addWidget(ubicacion, 3, 1, 1, 1);


        gridLayout_7.addWidget(widget_3, 1, 4, 1, 1);

        horizontalSpacer_5 = new QSpacerItem(683, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_7.addItem(horizontalSpacer_5, 2, 0, 1, 2);

        widget_4 = new QWidget(Dialog);
        widget_4.setObjectName("widget_4");
        widget_4.setStyleSheet("background-color: rgb(255, 255, 0);");
        gridLayout_4 = new QGridLayout(widget_4);
        gridLayout_4.setObjectName("gridLayout_4");
        label_11 = new QLabel(widget_4);
        label_11.setObjectName("label_11");

        gridLayout_4.addWidget(label_11, 0, 0, 1, 1);

        plainTextEdit = new QPlainTextEdit(widget_4);
        plainTextEdit.setObjectName("plainTextEdit");
        plainTextEdit.setStyleSheet("background-color: rgb(255, 255, 255);");

        gridLayout_4.addWidget(plainTextEdit, 1, 0, 1, 1);


        gridLayout_7.addWidget(widget_4, 2, 4, 2, 1);

        widget_5 = new QWidget(Dialog);
        widget_5.setObjectName("widget_5");
        gridLayout_5 = new QGridLayout(widget_5);
        gridLayout_5.setObjectName("gridLayout_5");
        label_7 = new QLabel(widget_5);
        label_7.setObjectName("label_7");
        label_7.setPixmap(new QPixmap(("brz_WR_Blue_Pearl_027png.png")));
        label_7.setScaledContents(true);

        gridLayout_5.addWidget(label_7, 0, 0, 1, 1);


        gridLayout_7.addWidget(widget_5, 3, 0, 1, 3);

        horizontalSpacer_3 = new QSpacerItem(413, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_7.addItem(horizontalSpacer_3, 4, 1, 1, 1);

        widget_6 = new QWidget(Dialog);
        widget_6.setObjectName("widget_6");
        widget_6.setStyleSheet("background-color: rgb(255, 255, 255);");
        gridLayout_6 = new QGridLayout(widget_6);
        gridLayout_6.setObjectName("gridLayout_6");
        aceptar = new QPushButton(widget_6);
        aceptar.setObjectName("aceptar");
        aceptar.setStyleSheet("background-color: rgb(136, 136, 136);");
        aceptar.clicked.connect(this,"aceptar()");

        gridLayout_6.addWidget(aceptar, 0, 0, 1, 1);

        cancelar = new QPushButton(widget_6);
        cancelar.setObjectName("cancelar");
        cancelar.setStyleSheet("background-color: rgb(136, 136, 136);");
        cancelar.clicked.connect(this,"cancelar()");

        gridLayout_6.addWidget(cancelar, 0, 1, 1, 1);


        gridLayout_7.addWidget(widget_6, 4, 2, 1, 2);

        QWidget.setTabOrder(tcodigo, gasolina);
        QWidget.setTabOrder(gasolina, diesel);
        QWidget.setTabOrder(diesel, hibrido);
        QWidget.setTabOrder(hibrido, electrico);
        QWidget.setTabOrder(electrico, combo);
        QWidget.setTabOrder(combo, cambiomanual);
        QWidget.setTabOrder(cambiomanual, fechaalta);
        QWidget.setTabOrder(fechaalta, precio);
        QWidget.setTabOrder(precio, ubicacion);
        QWidget.setTabOrder(ubicacion, plainTextEdit);
        retranslateUi(Dialog);

        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dialog", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" color:#ffffff;\">ALTA</span></p></body></html>", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Datos del vehiculo:", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Codigo:", null));
        groupBox.setTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tipo de motor:", null));
        gasolina.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Gasolina", null));
        diesel.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Diesel", null));
        hibrido.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Hibrido", null));
        electrico.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Electrico", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tipo de vehiculos:", null));
        combo.clear();
        combo.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Turismo", null));
        combo.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Monovolumen", null));
        combo.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "SUV", null));
        combo.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Todoterreno", null));
        info.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "El extra de cambio manual incrementa el precio en 500,00\u20ac", null));
        cambiomanual.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cambio manual", null));
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Datos de alta:                        ", null));
        label_8.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fecha de alta:", null));
        label_9.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Precio:", null));
        label_10.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Ubicacion:", null));
        ubicacion.clear();
        ubicacion.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Almacen", null));
        ubicacion.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tienda", null));
        ubicacion.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Taller", null));
        label_11.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Observaciones:", null));
        plainTextEdit.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Campo para indicar observaciones sobre el vehiculo</p></body></html>", null));
        label_7.setText("");
        aceptar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Aceptar", null));
        cancelar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cancelar", null));
    } // retranslateUi

    void cancelar(){
        tcodigo.setText("");
        gasolina.setChecked(true);
        combo.setCurrentIndex(0);
        info.setVisible(false);
        cambiomanual.setChecked(false);
        fechaalta.setDate(QDate.currentDate());
        precio.setValue(9000);
        ubicacion.setCurrentIndex(0);
        plainTextEdit.clear();
    }
    
    void cambio(){
        if(cambiomanual.isChecked()){
            info.setVisible(true);
        }else{
            info.setVisible(false);
        }
    }
    
    void aceptar(){
        if(!tcodigo.text().isEmpty()){
            JOptionPane.showMessageDialog(null, "Registro guardado");
            if(!plainTextEdit.toPlainText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Se tomaran en cuenta las observaciones");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Faltan datos por rellenar");
        }
    }
}

