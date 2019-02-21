/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctorado2;

import com.matisse.MtDatabase;
import com.matisse.MtException;

/**
 *
 * @author Juanra
 */
public class Main {
    
    static MtDatabase db;
    
    public static void main(String[] args){
        
        db=new MtDatabase("localhost","doctorado2");     
        
        try{
            
            db.open();
            db.startTransaction();
            insertarObjetos(db);
            
        }catch(MtException mte){
            System.err.println(mte);
        }finally{
            if(db.isTransactionInProgress()){
                db.commit();
            }
            db.close();
        }
    }
    
    private static void insertarObjetos(MtDatabase db){

        Departamento d1 = new Departamento(db);
        d1.setNombre("Bases de datos");
        
        Departamento d2 = new Departamento(db);
        d2.setNombre("Lenguajes");
        
        Tesis t1 = new Tesis(db);
        t1.setTitulo("Persistencia");
        t1.setTema("BD de objetos");

        Profesor p1 = new Profesor(db);
        p1.setNombre("Ana Martos Gil");
        p1.setEmail("anamartos@gmail.com");
        p1.setIngreso(16);

        Profesor p2=new Profesor(db);
        p2.setNombre("Isabel Ruiz Granados");
        p2.setEmail("isabel.ruiz@universi.es");
        p2.setIngreso(1986);
        
        Profesor p3=new Profesor(db);
        p3.setNombre("Antonio Barea Navarro");
        p3.setEmail("antonio.barea@universi.es");
        p3.setIngreso(1995);
        
        Tesis t2=new Tesis(db);
        t2.setTitulo("Bases de datos nativas XML");
        t2.setTema("Bases de datos XML");
        
        Tesis t3=new Tesis(db);
        t3.setTitulo("Mapeo Objeto-Relacional");
        t3.setTema("Bases de datos");
        
        p1.setPertenece(d1);
        p1.appendDirige(t1); 
        t1.setEs_dirigida(p1);
        
        p2.setPertenece(d1);
        p2.appendDirige(t2); 
        t2.setEs_dirigida(p2);
        p2.appendDirige(t3); 
        t3.setEs_dirigida(p2);
        
        p3.setPertenece(d2);
        p3.appendDirige(t3);
        t3.setEs_dirigida(p3);   
    }
}
