/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasep;

/*import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
//import datechooser.beans.DateChooserPanel;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.SQLException;*/
/**
 *
 * @author Ma. Belen
 */
public class DatabaseP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        String recordar;
        recordar="recordar";
        String telefono;
        telefono = "telefono";
        String dos;
        dos="2";
        conexion.ejecutarSQL("INSERT INTO "+recordar+"("+telefono+")VALUES("+2+")");
        
    }
    
}
