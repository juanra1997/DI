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
public class Modelo {
    
    private int numerouno, numerodos, resultado;

    public int getNumerouno() {
        return numerouno;
    }

    public void setNumerouno(int numerouno) {
        this.numerouno = numerouno;
    }

    public int getNumerodos() {
        return numerodos;
    }

    public void setNumerodos(int numerodos) {
        this.numerodos = numerodos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int multiplicar(){
        
        resultado=numerouno*numerodos;
        
        return resultado;
    }
    
}
