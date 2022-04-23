/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Marisol
 */
public class conexionMysql {
    Connection cn;
    
    public Connection conectar() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/database","root","");
            System.out.println("Conectado");
        } catch (ClassNotFoundException e) {
                System.out.println("ERROR DE CONEXION BD" +e);              
        }        
        return cn;
    }
}
