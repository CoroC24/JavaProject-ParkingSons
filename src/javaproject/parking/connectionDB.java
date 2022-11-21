//Connection to DB

package javaproject.parking;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connectionDB {
    
    String bd ="";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String pass = "";
    String driver = "com.mysql.cj.jdbc.Driver";

    Connection connection;
    
    public connectionDB(String bd) {
        this.bd = bd;
    }
    
    public Connection connect(){
        try {
            
            Class.forName(driver);
            connection = DriverManager.getConnection(url + bd, user, pass);
            System.out.println("La conexión a la base de datos " + bd + " ha sido exitosa.");
            
        } catch (ClassNotFoundException | SQLException ex) {
            
            System.err.println("No se conectó a la base de datos" + bd);
            Logger.getLogger(connectionDB.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return connection;
    }
    
    public void disconnect() {
        try {
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(connectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
