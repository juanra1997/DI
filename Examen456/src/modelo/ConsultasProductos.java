/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase para realizar las acciones sobre la tabla productos de la base de datos
 * @author Juanra
 */
public class ConsultasProductos {
    
    private Connection con;
    /**
     * Constructor
     * @param c Objeto de tipo Connection que recibe el constructor
     */
    public ConsultasProductos(Connection c){
        
        con=c;
    }
    /**
     * Metodo para guardar los datos
     * @param c Objeto de tipo producto con el que se opera
     * @return devuelve true si se ha podido realizar la operacion o false sino se ha podido
     */
    public boolean guardar(Curso c){
        
        PreparedStatement ps=null;
        
        String sql="insert into cursos values (?,?,?,?)";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setInt(1, c.getCurso());
            ps.setString(2, c.getNombre());
            ps.setInt(3, c.getAlumnos());
            ps.setString(4, c.getNota());
            //ps.setDouble(5, p.getDescuento());
            
            ps.execute();
            
            return true;
            
        }catch(SQLException e){
            
            System.err.println(e);
            
            return false;
        }/*finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }*/
    }
    /**
     * Metodo para actualizar los datos
     * @param c Objeto de tipo producto con el que se opera
     * @return devuelve true si se ha podido realizar la operacion o false sino se ha podido
     */
    public boolean actualizar(Curso c){
        
        PreparedStatement ps=null;
        
        String sql="update cursos set curso=?, nomcurso=?, numalum=?, notamedia=? where curso=?";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
                       
            ps.setInt(1, c.getCurso());
            ps.setString(2, c.getNombre());
            ps.setInt(3, c.getAlumnos());
            ps.setString(4, c.getNota());
            ps.setInt(5, c.getCurso());
            
            ps.execute();
            
            return true;
            
        }catch(SQLException e){
            
            System.err.println(e);
            
            return false;
        }/*finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }*/
    }
    /**
     * Metodo para eliminar datos
     * @param c Objeto de tipo producto con el que se opera
     * @return devuelve true si se ha podido realizar la operacion o false sino se ha podido
     */
    public boolean eliminar(Curso c){
        
        PreparedStatement ps=null;
        //Connection con=getConexion();
        
        String sql="delete from cursos where curso=?";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setInt(1, c.getCurso());
            
            ps.execute();
            
            return true;
            
        }catch(SQLException e){
            
            System.err.println(e);
            
            return false;
        }/*finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }*/
    }
    /**
     * Metodo para buscar los datos
     * @param c Objeto de tipo producto con el que se opera
     * @return devuelve true si se ha podido realizar la operacion o false sino se ha podido
     */
    public boolean buscar(Curso c){
        
        PreparedStatement ps=null;
        ResultSet result=null;
        //Connection con=getConexion();
        
        String sql="select * from cursos where curso=?";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setInt(1, c.getCurso());
            
            result=ps.executeQuery();
            
            if(result.next()){
                
                c.setCurso(result.getInt("curso"));
                c.setNombre(result.getString("nomcurso"));
                c.setAlumnos(result.getInt("numalum"));
                c.setNota(result.getString("notamedia"));
                //p.setDescuento(Double.parseDouble(result.getString("descuento")));
                
                return true;
            }
            
            return false;
            
        }catch(SQLException e){
            
            System.err.println(e);
            
            return false;
        }/*finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }*/
    }
}
