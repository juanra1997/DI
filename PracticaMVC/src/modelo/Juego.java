/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juanra
 */
public class Juego {
    
    String nombre;
    String dificultad;
    int horas_de_juego;
    String genero;
    
    /*public Juego(){
        
        nombre=null;
        dificultad=null;
        horas_de_juego=0;
        genero=null;
        
    }
    
    public Juego(String n, String d, int h, String g){
        
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public int getHoras_de_juego() {
        return horas_de_juego;
    }

    public void setHoras_de_juego(int horas_de_juego) {
        this.horas_de_juego = horas_de_juego;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
