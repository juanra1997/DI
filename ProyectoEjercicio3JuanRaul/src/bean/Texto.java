/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.beans.*;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class Texto extends JTextField implements Serializable, KeyListener {
    
    /*public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    public Texto() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }*/
    
    private String tipo;
    private Color color;
    private Font fuente;
    private int columnas;
    
    public Texto(){
        setSize(100, 30);
        setTipo("Texto");
        color=Color.BLACK;
        columnas=10;
        addKeyListener(this);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo.equals("Entero")||tipo.equals("Real")||tipo.equals("Texto")||tipo.equals("S/N")){
            this.tipo = tipo;
            switch(tipo){
            case "S/N":
                    try{
                    removeKeyListener(entero);
                    removeKeyListener(real);
                    removeKeyListener(sn);
                }catch(Exception e){
                    
                }finally{
                    addKeyListener(sn);
                }
                    break;
            case "Real":
                try{
                    removeKeyListener(entero);
                    removeKeyListener(real);
                    removeKeyListener(sn);
                }catch(Exception e){
                    
                }finally{
                    addKeyListener(real);
                }
                break;
            case "Entero":
                try{
                    removeKeyListener(entero);
                    removeKeyListener(real);
                    removeKeyListener(sn);
                }catch(Exception e){
                    
                }finally{
                    addKeyListener(entero);
                }
                break;
            case "Texto":
                try{
                    removeKeyListener(entero);
                    removeKeyListener(real);
                    removeKeyListener(sn);
                }catch(Exception e){
                }
                break;
        }
        }        
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setForeground(color);
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

    KeyListener real=new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if(e.getKeyChar()!=KeyEvent.VK_PERIOD&&!Character.isDigit(e.getKeyChar())){
                e.consume();
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
    };
    KeyListener entero=new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if(!Character.isDigit(e.getKeyChar())){
                e.consume();
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
    };
    KeyListener sn=new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if(e.getKeyChar()!=KeyEvent.VK_S&&e.getKeyChar()!=KeyEvent.VK_N){
                e.consume();
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
    };

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.7
        if(getText().length()>=columnas){
            e.consume();
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
