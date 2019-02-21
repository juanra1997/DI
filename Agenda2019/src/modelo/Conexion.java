/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juanra
 */
public class Conexion {
    
    private /*static*/ final String base = "agenda";
    private /*static*/ final String user = "root";
    private /*static*/ final String password = "juanra&useSSL=false";
    //private final String url = "jdbc:mysql://localhost:3306/"+base;
    private /*static*/ Connection con = null;
    
    public Connection getConexion(){
    //public static void main(String[] args){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+base+"?user="+user+"&password="+password+"&useSSL=false");
            
            //System.out.println("Si conecta");
        }catch(SQLException e){
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
