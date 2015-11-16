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

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DatabaseP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        Dia dia1 = new Dia(2, 2, 2, 2, 2);
        
        DiaSQL sql = new DiaSQL();
        Dia dia2 = new Dia();
        try {
            dia2= sql.recuperarPorId(Conexion.obtener(), 2);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseP.class.getName()).log(Level.SEVERE, null, ex);
        }
       /* try{
            sql.guardar(Conexion.obtener(), dia1);
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }*/
        System.out.println(dia2.toString());
        
    }
    
}
