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
 *
 * @author Juanra
 */
public class Consultas extends Conexion {
    
    public boolean registrar(Juego j){
        
        PreparedStatement ps=null;
        Connection con=getConexion();
        
        String sql="insert into completados values (?,?,?,?)";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setString(1, j.getNombre());
            ps.setString(2, j.getDificultad());
            ps.setInt(3, j.getHoras_de_juego());
            ps.setString(4, j.getGenero());
            
            ps.execute();
            
            return true;
            
        }catch(SQLException e){
            
            System.err.println(e);
            
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean modificar(Juego j){
        
        PreparedStatement ps=null;
        Connection con=getConexion();
        
        String sql="update completados set nombre=?, dificultad=?, horas_de_juego=?, genero=? where nombre=?";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setString(1, j.getNombre());
            ps.setString(2, j.getDificultad());
            ps.setInt(3, j.getHoras_de_juego());
            ps.setString(4, j.getGenero());
            ps.setString(5, j.getNombre());
            
            ps.execute();
            
            return true;
            
        }catch(SQLException e){
            
            System.err.println(e);
            
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean eliminar(Juego j){
        
        PreparedStatement ps=null;
        Connection con=getConexion();
        
        String sql="delete from completados where nombre=?";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setString(1, j.getNombre());
            
            ps.execute();
            
            return true;
            
        }catch(SQLException e){
            
            System.err.println(e);
            
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean buscar(Juego j){
        
        PreparedStatement ps=null;
        ResultSet result=null;
        Connection con=getConexion();
        
        String sql="select * from completados where nombre=?";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setString(1, j.getNombre());
            
            result=ps.executeQuery();
            
            if(result.next()){
                
                j.setNombre(result.getString("nombre"));
                j.setGenero(result.getString("dificultad"));
                j.setDificultad(result.getString("dificultad"));
                j.setHoras_de_juego(Integer.parseInt(result.getString("horas_de_juego")));
                
                return true;
            }
            
            return false;
            
        }catch(SQLException e){
            
            System.err.println(e);
            
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
}
