/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.mysql.jdbc.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JOptionPane;
import modelo.ConsultasProductos;
import modelo.Curso;
import modelo.Producto;
import vista.PanelCursos;

/**
 * Clase que controla las acciones que se realizan al pulsar los botones de la vista productos
 * @author Juanra
 */
public class CtrlPanelProductos implements ActionListener/*, KeyListener*/{
    
    //private Connection conexion;    
    private Curso curso;
    private ConsultasProductos consultas;
    private PanelCursos panelProductos;
    
    public CtrlPanelProductos(PanelCursos pp, Connection c){
        
        //conexion=c;
        //Ayuda();
        curso=new Curso();
        
        consultas=new ConsultasProductos(c);
        
        panelProductos=pp;
        
        panelProductos.guardar.addActionListener(this);
        panelProductos.actualizar.addActionListener(this);
        panelProductos.borrar.addActionListener(this);
        panelProductos.limpiar.addActionListener(this);
        panelProductos.buscar.addActionListener(this);
       // panelProductos.txtNota.addKeyListener(this);
        //panelProductos.txtDescuento.addKeyListener(this);
        
    }
    /**
     * ActionListener que ejecuta la accion del boton que se presiona
     * @param e Evento que genera al presionar el boton
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==panelProductos.buscar){        
            
            //System.out.println("Holis");
            if(!panelProductos.txtCurso.getText().isEmpty()){
                curso.setCurso(Integer.parseInt(panelProductos.txtCurso.getText()));
            
            
            if(consultas.buscar(curso)){
                JOptionPane.showMessageDialog(null, "Registro encontrado");
                panelProductos.txtCurso.setText(String.valueOf(curso.getCurso()));
                panelProductos.txtNombre.setText(curso.getNombre());
                panelProductos.txtAlumnos.setText(String.valueOf(curso.getAlumnos()));
                panelProductos.txtNota.setText(curso.getNota());
                //panelProductos.txtDescuento.setText(String.valueOf(producto.getDescuento()));
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al buscar el registro");
                limpiar();
            }
            }else{
                JOptionPane.showMessageDialog(null, "Rellena el campo curso");
            }
        }
        if(e.getSource()==panelProductos.limpiar){
            limpiar();
        }
        if(e.getSource()==panelProductos.guardar){
            if(!panelProductos.txtCurso.getText().isEmpty()&&!panelProductos.txtNombre.getText().isEmpty()&&!panelProductos.txtAlumnos.getText().isEmpty()&&!panelProductos.txtNota.getText().isEmpty()){
            curso.setCurso(Integer.parseInt(panelProductos.txtCurso.getText()));
            curso.setNombre(panelProductos.txtNombre.getText());
            curso.setAlumnos(Integer.parseInt(panelProductos.txtAlumnos.getText()));
            curso.setNota(panelProductos.txtNota.getText());
            //curso.setDescuento(Double.parseDouble(panelProductos.txtDescuento.getText()));
            
            if(consultas.guardar(curso)){
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar el registro");
                limpiar();
            }
            }else{
                JOptionPane.showMessageDialog(null, "Rellena los datos");
            }
        }
        if(e.getSource()==panelProductos.actualizar){
            if(!panelProductos.txtCurso.getText().isEmpty()&&!panelProductos.txtNombre.getText().isEmpty()&&!panelProductos.txtAlumnos.getText().isEmpty()&&!panelProductos.txtNota.getText().isEmpty()){
            curso.setCurso(Integer.parseInt(panelProductos.txtCurso.getText()));
            curso.setNombre(panelProductos.txtNombre.getText());
            curso.setAlumnos(Integer.parseInt(panelProductos.txtAlumnos.getText()));
            curso.setNota(panelProductos.txtNota.getText());
            //curso.setDescuento(Double.parseDouble(panelProductos.txtDescuento.getText()));
            
            if(consultas.actualizar(curso)){
                JOptionPane.showMessageDialog(null, "Registro modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar el registro");
                limpiar();
            }
            }else{
                JOptionPane.showMessageDialog(null, "Rellena los datos");
            }
        }
        if(e.getSource()==panelProductos.borrar){
            if(!panelProductos.txtCurso.getText().isEmpty()){
            curso.setCurso(Integer.parseInt(panelProductos.txtCurso.getText()));
            if(consultas.eliminar(curso)){
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
                limpiar();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Rellena el campo curso");
        }
        }
        
    }
    /**
     * Metodo para limpiar los campos de texto
     */
    public void limpiar(){
        panelProductos.txtCurso.setText("");
        panelProductos.txtNombre.setText("");
        panelProductos.txtAlumnos.setText("");
        panelProductos.txtNota.setText("");
        //panelProductos.txtDescuento.setText("");
    }
    /**
     * Metodo que permite mostrar la ayuda en la ventanaa
     */
    /*
    public void Ayuda(){
        try{
            File fichero =new File("src/help/help_set.hs");
            URL hsURL=fichero.toURI().toURL();
            HelpSet helpset=new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb=helpset.createHelpBroker();
            hb.enableHelpOnButton(panelProductos, "productos", helpset);
            hb.enableHelpKey(panelProductos.buscar, "pbuscar", helpset);
            
        }catch(Exception e){
            
        }
    }
    */
    /**
     * KeyListener que limita los campos de texto indicados
     * @param e Evento que genera al introducir un valor
     */
    /*@Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==panelProductos.txtNota||e.getSource()==panelProductos.txtDescuento){
            if(!Character.isDigit(e.getKeyChar())&&e.getKeyChar()!=KeyEvent.VK_PERIOD){
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
    }*/
}
