package Hilos;//Paquete

import java.util.Scanner;//Importacion de la clase Scanner


public class prueba {//Comienzo de la clase

  public static void main(String[] args) {//Comienzo del metodo principal
  
   Scanner sc;//Objeto de tipo escaner que nos va a permitir la introduccion de datos por teclado
   boolean correcto=false;//Objeto de tipo booleanl que nos va a controlar la salida del bucle
   String linea;//Objeto de tipo String que nos va a permitir guardar los datos introducidos por teclado
   
   /*while(!correcto){//Comienzo del bucle, mientras que la condicion sea verdadera, seguira ejecutandose. (La variable booleana es false pero la exclamacion cambia el significado, por lo tanto pasa a ser true)
    sc=new Scanner(System.in);//Instanciamos la variable aqui para asi evitar posibles futuros errores de buffer
    System.out.println("Introduce una cadena de tres caracteres o menos");//Mostramos por patalla un mensaje
    linea=sc.nextLine();//Guardamos la introduccion del usuario por teclado en una variable
    if(linea.length()==3||linea.length()<3){//Ponemos las condiciones, si las condiciones se cumplen:
      System.out.println("Dato correcto");//Mostramos por pantalla un mensaje
      correcto=true;//Cambiamos el valor de la variable booleana para poder salir del bucle
    }else{//Sino se cumplen
      System.out.println("Dato incorrecto\n");//Mostramos por pantalla un mensaje
    }//Salimos del if
    sc.close();//Cerramos el Scanner
   }//Salimos del bucle
   System.out.println("\nFin del programa");//Mostramos por pantalla un mensaje*/
   while(!correcto) {
	   sc=new Scanner(System.in);
	   System.out.println("Introduce una cadena de 3 caracteres o menos");
	   linea=sc.nextLine();
	   if(linea.length()==3||linea.length()<3) {
		   System.out.println("Correcto");
		   correcto=true;
	   }else {
		   System.out.println("Incorrecto");
	   }
	   if(correcto) {
		   sc.close();
	   }
   }
   
  }//Fin del metodo
 
}//Fin de la clase
