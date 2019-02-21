/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

//import java.beans.*;
//import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Juanra
 */
public class PanelRB extends JPanel implements Serializable, ActionListener {
    
    /*public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    public panelRB() {
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
    
    ButtonGroup bg;
    JRadioButton radio1, radio2, radio3;
    JLabel label;
    
    public PanelRB(){
        
        //setSize(200, 100);
        setLayout(null);
        //setBackground(Color.CYAN);
        
        bg=new ButtonGroup();
        
        radio1=new JRadioButton();
        
        radio1.setText("Azul");
        radio1.setBounds(20, 20, 100, 20);
        radio1.setOpaque(false);
        radio1.setSelected(true);
        radio1.addActionListener(this);
        add(radio1);
        
        radio2=new JRadioButton();
        
        radio2.setText("Rojo");
        radio2.setBounds(20, 40, 100, 20);
        radio2.setOpaque(false);
        radio2.setSelected(false);
        radio2.addActionListener(this);
        add(radio2);
        
        radio3=new JRadioButton();
        
        radio3.setText("Amarillo");
        radio3.setBounds(20, 60, 100, 20);
        radio3.setOpaque(false);
        radio3.setSelected(false);
        radio3.addActionListener(this);
        add(radio3);
        
        bg.add(radio1);
        bg.add(radio2);
        bg.add(radio3);
        
        label=new JLabel();
        
        label.setText("Azul");
        label.setBounds(120, 40, 50, 20);
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
    }

    public ButtonGroup getBg() {
        return bg;
    }

    public void setBg(ButtonGroup bg) {
        this.bg = bg;
    }

    public JRadioButton getRadio1() {
        return radio1;
    }

    public void setRadio1(JRadioButton radio1) {
        this.radio1 = radio1;
    }

    public JRadioButton getRadio2() {
        return radio2;
    }

    public void setRadio2(JRadioButton radio2) {
        this.radio2 = radio2;
    }

    public JRadioButton getRadio3() {
        return radio3;
    }

    public void setRadio3(JRadioButton radio3) {
        this.radio3 = radio3;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
    
    public String getSelected(){
        
        String seleccionado="";
        
        if(radio1.isSelected()){
            seleccionado="Azul";
        }else if(radio2.isSelected()){
            seleccionado="Rojo";
        }else if(radio3.isSelected()){
            seleccionado="Amarillo";
        }
        
        return seleccionado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(radio1.isSelected()){
            label.setText("Azul");
        }else if(radio2.isSelected()){
            label.setText("Rojo");
        }else if(radio3.isSelected()){
            label.setText("Amarillo");
        }
    }
}
