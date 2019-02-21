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
public class ConsultasProductos {
    
    private Connection con;
    
    public ConsultasProductos(Connection c){
        
        con=c;
    }
    public boolean guardar(Producto p){
        
        PreparedStatement ps=null;
        
        String sql="insert into productos values (?,?,?,?,?)";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setString(1, p.getReferencia());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getDescripcion());
            ps.setDouble(4, p.getPrecio());
            ps.setDouble(5, p.getDescuento());
            
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
    
    public boolean actualizar(Producto p){
        
        PreparedStatement ps=null;
        
        String sql="update productos set nombre=?, descripcion=?, precio=?, descuento=? where referencia=?";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
                       
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setDouble(4, p.getDescuento());
            ps.setString(5, p.getReferencia());
            
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
    
    public boolean eliminar(Producto p){
        
        PreparedStatement ps=null;
        //Connection con=getConexion();
        
        String sql="delete from productos where referencia=?";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setString(1, p.getReferencia());
            
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
    
    public boolean buscar(Producto p){
        
        PreparedStatement ps=null;
        ResultSet result=null;
        //Connection con=getConexion();
        
        String sql="select * from productos where referencia=?";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setString(1, p.getReferencia());
            
            result=ps.executeQuery();
            
            if(result.next()){
                
                p.setReferencia(result.getString("referencia"));
                p.setNombre(result.getString("nombre"));
                p.setDescripcion(result.getString("descripcion"));
                p.setPrecio(Double.parseDouble(result.getString("precio")));
                p.setDescuento(Double.parseDouble(result.getString("descuento")));
                
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
