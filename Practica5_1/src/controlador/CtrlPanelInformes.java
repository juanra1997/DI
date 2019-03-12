/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.mysql.jdbc.Connection;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
//import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
//import modelo.Conexion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import vista.PanelInformes;

/**
 * Clase que controla las acciones que se realizan al pulsar los botones de la vista informes
 * @author Juanra
 */
public class CtrlPanelInformes implements ActionListener, KeyListener{
    
    PanelInformes panelInformes;
    Connection con;
    private JasperPrint jasPrint;
    private JasperViewer jasView;
    private JDialog jasperDialog;
    
    public CtrlPanelInformes(PanelInformes pi, Connection c){
        
        //Ayuda();
        panelInformes=pi;
        con=c;
        panelInformes.informe1.addActionListener(this);
        panelInformes.informe2.addActionListener(this);
        panelInformes.informe3.addActionListener(this);
        panelInformes.informe4.addActionListener(this);
        panelInformes.informe5.addActionListener(this);
        panelInformes.informe6.addActionListener(this);
        panelInformes.pdf1.addActionListener(this);
        panelInformes.pdf2.addActionListener(this);
        panelInformes.pdf3.addActionListener(this);
        panelInformes.pdf4.addActionListener(this);
        panelInformes.pdf5.addActionListener(this);
        panelInformes.pdf6.addActionListener(this);
        panelInformes.txtOficina.addKeyListener(this);
        panelInformes.pdf1.addActionListener(this);
        
    }
    /**
     * Metodo que permite mostrar la ayuda en la ventanaa
     */
    /*
    public void Ayuda(){
        try{
            //System.out.println("Creado");
            File fichero =new File("src/help/help_set.hs");
            URL hsURL=fichero.toURI().toURL();
            HelpSet helpset=new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb=helpset.createHelpBroker();
            hb.enableHelpOnButton(panelInformes, "principal", helpset);
            hb.enableHelpKey(panelInformes.informe1, "binforme", helpset);
            hb.enableHelpKey(panelInformes.informe2, "binforme", helpset);
            hb.enableHelpKey(panelInformes.informe3, "binforme", helpset);
            hb.enableHelpKey(panelInformes.informe4, "binforme", helpset);
            hb.enableHelpKey(panelInformes.informe5, "binforme", helpset);
            hb.enableHelpKey(panelInformes.informe6, "binforme", helpset);
            hb.enableHelpKey(panelInformes.pdf1, "bpdf", helpset);
            hb.enableHelpKey(panelInformes.pdf2, "bpdf", helpset);
            hb.enableHelpKey(panelInformes.pdf3, "bpdf", helpset);
            hb.enableHelpKey(panelInformes.pdf4, "bpdf", helpset);
            hb.enableHelpKey(panelInformes.pdf5, "bpdf", helpset);
            hb.enableHelpKey(panelInformes.pdf6, "bpdf", helpset);
            
        }catch(Exception e){
            
        }
    }*/
    /**
     * ActionListener que ejecuta la accion del boton que se presiona
     * @param e Evento que genera al presionar el boton
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource() == panelInformes.informe1){
            String path="src/informes/Reporte1.jasper";
            
            try {
                jasPrint = JasperFillManager.fillReport(path, null, con);
                
                jasView = new JasperViewer(jasPrint);

                jasperDialog = new JDialog();
                jasperDialog.setContentPane(jasView.getContentPane());
                jasperDialog.setSize(jasView.getSize());
                jasperDialog.setModal(true);
                jasperDialog.setVisible(true);
            } catch (JRException ex) {
                //Logger.getLogger(CtrlPanelInformes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource() == panelInformes.informe2){
            String path="src/informes/Reporte2.jasper";
            
            try {
                jasPrint = JasperFillManager.fillReport(path, null, con);
                
                jasView = new JasperViewer(jasPrint);

                jasperDialog = new JDialog();
                jasperDialog.setContentPane(jasView.getContentPane());
                jasperDialog.setSize(jasView.getSize());
                jasperDialog.setModal(true);
                jasperDialog.setVisible(true);
            } catch (JRException ex) {
                //Logger.getLogger(CtrlPanelInformes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource() == panelInformes.informe3){
            String path="src/informes/Reporte3.jasper";
            
            try {
                jasPrint = JasperFillManager.fillReport(path, null, con);
                
                jasView = new JasperViewer(jasPrint);

                jasperDialog = new JDialog();
                jasperDialog.setContentPane(jasView.getContentPane());
                jasperDialog.setSize(jasView.getSize());
                jasperDialog.setModal(true);
                jasperDialog.setVisible(true);
            } catch (JRException ex) {
                //Logger.getLogger(CtrlPanelInformes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource() == panelInformes.informe4){
            String path="src/informes/Reporte4.jasper";
            
            try {
                Map num = new HashMap();

                try{
                    num.put("Oficina", Integer.parseInt(panelInformes.txtOficina.getText()));
                }catch(NumberFormatException ex){
                    num.put("Oficina", 101);
                }

                jasView = new JasperViewer(jasPrint);

                jasPrint = JasperFillManager.fillReport(path, num, con);
                
                jasView = new JasperViewer(jasPrint);

                jasperDialog = new JDialog();
                jasperDialog.setContentPane(jasView.getContentPane());
                jasperDialog.setSize(jasView.getSize());
                jasperDialog.setModal(true);
                jasperDialog.setVisible(true);
            } catch (JRException ex) {
                //Logger.getLogger(CtrlPanelInformes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource() == panelInformes.informe5){
            String path="src/informes/Reporte5.jasper";
            
            try {
                jasPrint = JasperFillManager.fillReport(path, null, con);
                
                jasView = new JasperViewer(jasPrint);

                jasperDialog = new JDialog();
                jasperDialog.setContentPane(jasView.getContentPane());
                jasperDialog.setSize(jasView.getSize());
                jasperDialog.setModal(true);
                jasperDialog.setVisible(true);
            } catch (JRException ex) {
                //Logger.getLogger(CtrlPanelInformes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource() == panelInformes.pdf1){
            String path="src/informes/Reporte1.jasper";            
            try {
                jasPrint = JasperFillManager.fillReport(path, null, con);               
                JasperExportManager.exportReportToPdfFile(jasPrint, "src/pdf/Reporte1.pdf");
                File pathPDF = new File("src/pdf/Reporte1.pdf");
                try {
                    Desktop.getDesktop().open(pathPDF); //Metodo para abrir archivo con aplicacion predeterminada del sistema
                } catch (IOException ex) {
                    //Logger.getLogger(CtrlInformes.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (JRException ex) {
                //Logger.getLogger(CtrlPanelInformes.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        if(e.getSource() == panelInformes.pdf2){
            String path="src/informes/Reporte2.jasper";            
            try {
                jasPrint = JasperFillManager.fillReport(path, null, con);               
                JasperExportManager.exportReportToPdfFile(jasPrint, "src/pdf/Reporte2.pdf");
                File pathPDF = new File("src/pdf/Reporte2.pdf");
                try {
                    Desktop.getDesktop().open(pathPDF); //Metodo para abrir archivo con aplicacion predeterminada del sistema
                } catch (IOException ex) {
                    //Logger.getLogger(CtrlInformes.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (JRException ex) {
                //Logger.getLogger(CtrlPanelInformes.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        if(e.getSource() == panelInformes.pdf3){
            String path="src/informes/Reporte3.jasper";            
            try {
                jasPrint = JasperFillManager.fillReport(path, null, con);               
                JasperExportManager.exportReportToPdfFile(jasPrint, "src/pdf/Reporte3.pdf");
                File pathPDF = new File("src/pdf/Reporte3.pdf");
                try {
                    Desktop.getDesktop().open(pathPDF); //Metodo para abrir archivo con aplicacion predeterminada del sistema
                } catch (IOException ex) {
                    //Logger.getLogger(CtrlInformes.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (JRException ex) {
                //Logger.getLogger(CtrlPanelInformes.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        if(e.getSource() == panelInformes.pdf4){
            String path="src/informes/Reporte4.jasper";            
            try {
                Map num = new HashMap();
                try{
                    num.put("Oficina", Integer.parseInt(panelInformes.txtOficina.getText()));
                }catch(NumberFormatException ex){
                    num.put("Oficina", 101);
                }
                jasPrint = JasperFillManager.fillReport(path, num, con); 
                JasperExportManager.exportReportToPdfFile(jasPrint, "src/pdf/Reporte4.pdf");
                File pathPDF = new File("src/pdf/Reporte4.pdf");
                try {
                    Desktop.getDesktop().open(pathPDF); //Metodo para abrir archivo con aplicacion predeterminada del sistema
                } catch (IOException ex) {
                    //Logger.getLogger(CtrlInformes.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (JRException ex) {
                //Logger.getLogger(CtrlPanelInformes.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        if(e.getSource() == panelInformes.pdf5){
            String path="src/informes/Reporte5.jasper";            
            try {
                jasPrint = JasperFillManager.fillReport(path, null, con);               
                JasperExportManager.exportReportToPdfFile(jasPrint, "src/pdf/Reporte5.pdf");
                File pathPDF = new File("src/pdf/Reporte5.pdf");
                try {
                    Desktop.getDesktop().open(pathPDF); //Metodo para abrir archivo con aplicacion predeterminada del sistema
                } catch (IOException ex) {
                    //Logger.getLogger(CtrlInformes.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (JRException ex) {
                //Logger.getLogger(CtrlPanelInformes.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        if(e.getSource() == panelInformes.pdf6||e.getSource() == panelInformes.informe6){
            JOptionPane.showMessageDialog(null, "No he conseguido enlazarlos");
        }
    }
    /**
     * KeyListener que limita los campos de texto indicados
     * @param e Evento que genera al presionar el boton
     */
    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==panelInformes.txtOficina){
            if(!Character.isDigit(e.getKeyChar())){
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
