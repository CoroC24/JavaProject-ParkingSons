//Connection to DB

package javaproject.parking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connectionDB {
    
    String bd ="";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String pass = "";
    String driver = "com.mysql.cj.jdbc.Driver";

    Connection connection;
    
    public static SimpleDateFormat sdfResult = new SimpleDateFormat("HH:mm:ss");
    public static SimpleDateFormat sdfResultMinutes = new SimpleDateFormat("m");
    
    
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
    
    public boolean ifExists(String qSQL, String consult) {
        try {
            
            PreparedStatement pst = connection.prepareStatement(qSQL);
            pst.setString(1, consult);
            ResultSet rs = pst.executeQuery();
            return rs.next();
            
        } catch(SQLException ex) {
            Logger.getLogger(connectionDB.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("No se ha podido realizar la consulta a la base de datos.");
        }
        
        return false;
    }
    
    
    /*public static Date getDifferenceBetweenDates(Date timeEnter, Date timeExit) {
        long milliseconds = timeExit.getTime() - timeEnter.getTime();
        int seconds = (int) (milliseconds / 1000) % 60;
        int minutes = (int) ((milliseconds / (1000 * 60)) % 60);
        int hours = (int) ((milliseconds / (1000 * 60 * 60)) % 24);
        
        Calendar c = Calendar.getInstance();
        c.set(Calendar.SECOND, seconds);
        c.set(Calendar.MINUTE, minutes);
        c.set(Calendar.HOUR_OF_DAY, hours);
        return c.getTime();
    }*/
}
