/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Juanra
 */
public class Ejercicio02 {
    
    //Creamos los objetos
    static int maximo, introducido, minimo, contador, suma;
    static Scanner sc;
 
    public static void main(String[] args){
        
        //Instanciamos los objetos
        sc=new Scanner(System.in);
        contador=0;
        suma=0;
        
        //Introducimos el primer numero
        //System.out.println("Introduce un valor entero");
        //introducido=sc.nextInt();
        introducido=introducirEntero();
        
        //Guardamos el valor como maximo y minimo
        maximo=introducido;
        minimo=introducido;
        
        //Bucle
        while(introducido!=0){
            //sumamos 1 al contador
            contador++;
            //comprobamos si el numero introducido es mayor al que ya tenemos para guardarlo como tal o no
            if(introducido>maximo){
                maximo=introducido;
            }
            //comprobamos si el numero introducido es menor al que ya tenemos para guardarlo como tal o no
            if(introducido<minimo){
                minimo=introducido;
            }
            //sumamos el valor
            suma+=introducido;
            //Volvemos a pedir la introduccion del numero
            //System.out.println("Introduce un valor entero");
            //introducido=sc.nextInt();
            introducido=introducirEntero();
        }
        sc.close();
        //Cuando salgamos del bucle mostramos los datos que tenemos
        System.out.println("El maximo valor introducido ha sido: "+maximo);
        System.out.println("El minimo valor introducido ha sido: "+minimo);
        System.out.println("El numero de valores introducidos ha sido: "+contador);
        System.out.println("El total de la suma de los valores introducidos es: "+suma);
        if(contador!=0){
            System.out.println("La media de los valores introducidos es: "+suma/contador);
        }
    }
    
    public static int introducirEntero(){
        int resultado=0;
        try{
            System.out.println("Introduce un valor entero");
            resultado=sc.nextInt();
        }catch(Exception e){
            System.out.println("No es un valor entero");
            resultado=introducirEntero();
        }
    return resultado;   
    }
}
