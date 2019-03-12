/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Clase Producto
 * @author Juanra
 */
public class Producto {

    String referencia;
    String nombre;
    String descripcion;
    double precio;
    double descuento;
    /**
     * Metodo para obtener la referencia del producto
     * @return una cadena
     */
    public String getReferencia() {
        return referencia;
    }
    /**
     * Metodo para establecer una referencia de producto
     * @param referencia cadena que indica la referencia
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    /**
     * Metodo para obtener el nombre del producto
     * @return una cadena
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para establecer un nombre de producto
     * @param nombre cadena que indica el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para obtener la descripcion del producto
     * @return una cadena
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Metodo para establecer una descripcion del producto
     * @param descripcion cadena que indica la descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Metodo para obtener el precio del producto
     * @return un numero
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Metodo para establecer el precio del producto
     * @param precio numero que indica el precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Metodo para obtener el descuento del producto
     * @return un numero
     */
    public double getDescuento() {
        return descuento;
    }
    /**
     * Metodo para establecer el descuento del producto
     * @param descuento numero referente al descuento
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

}
