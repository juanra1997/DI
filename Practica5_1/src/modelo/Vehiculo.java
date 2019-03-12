/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 * Clase Vehiculo
 * @author Juanra
 */
public class Vehiculo {
    
    String matricula;
    String marca;
    String modelo;
    int kilometros;
    Date fechaRevision;
    /**
     * Metodo que devuelve la matricula del coche
     * @return una cadena 
     */
    public String getMatricula() {
        return matricula;
    }
    /**
     * Metodo que establece la matricula del coche
     * @param matricula una cadena con la matricula del coche
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    /**
     * Metodo que devuelve la marca del coche
     * @return una cadena
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Metodo para establecer la marca del coche
     * @param marca una cadena con la marca del coche
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Metodo que devuelve el modelo del coche
     * @return una cadena
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * Metodo que establece el modelo del coche
     * @param modelo cadena con el modelo del coche
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Metodo que devuelve los kilometros del coche
     * @return un numero
     */
    public int getKilometros() {
        return kilometros;
    }
    /**
     * Metodo que establece los kilometros del coche
     * @param kilometros numero que indica los kilometros del coche
     */
    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
    /**
     * Metodo que devuelve la fecha de revision del coche
     * @return una fecha
     */
    public Date getFechaRevision() {
        return fechaRevision;
    }
    /**
     * Metodo que establece la fecha de revision del coche
     * @param fechaRevision fehca de la revision
     */
    public void setFechaRevision(Date fechaRevision) {
        this.fechaRevision = fechaRevision;
    }
    
}
