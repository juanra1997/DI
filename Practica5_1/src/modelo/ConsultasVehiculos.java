/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Juanra
 */
public class ConsultasVehiculos {
    
    private Connection con;
    
    public ConsultasVehiculos(Connection c){
        
        con=c;
    }
    
        public boolean guardar(Vehiculo v){
        
        PreparedStatement ps=null;
        
        String sql="insert into vehiculos values (?,?,?,?,?)";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setString(1, v.getMatricula());
            ps.setString(2, v.getMarca());
            ps.setString(3, v.getModelo());
            ps.setInt(4, v.getKilometros());
            ps.setDate(5, v.getFechaRevision());
            
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
    
    public boolean actualizar(Vehiculo v){
        
        PreparedStatement ps=null;
        
        String sql="update vehiculos set marca=?, modelo=?, nKilometros=?, fRevision=? where matricula=?";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            
            ps.setString(1, v.getMarca());
            ps.setString(2, v.getModelo());
            ps.setInt(3, v.getKilometros());
            ps.setDate(4, v.getFechaRevision());
            ps.setString(5, v.getMatricula());

            
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
    
    public boolean eliminar(Vehiculo v){
        
        PreparedStatement ps=null;
        //Connection con=getConexion();
        
        String sql="delete from vehiculos where matricula=?";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setString(1, v.getMatricula());
            
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
    
    public boolean buscar(Vehiculo v){
        
        PreparedStatement ps=null;
        ResultSet result=null;
        //Connection con=getConexion();
        
        String sql="select * from vehiculos where matricula=?";
        
        try{
            ps=(PreparedStatement) con.prepareStatement(sql);
            
            ps.setString(1, v.getMatricula());
            
            result=ps.executeQuery();
            
            if(result.next()){
                
                v.setMatricula(result.getString("matricula"));
                v.setMarca(result.getString("marca"));
                v.setModelo(result.getString("modelo"));
                v.setKilometros(Integer.parseInt(result.getString("nKilometros")));
                v.setFechaRevision(Date.valueOf(result.getString("fRevision")));
                
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
