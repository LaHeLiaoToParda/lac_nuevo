package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	
	Connection connection = null;
	String DB = "lac";
	String driverClassName = "com.mysql.jdbc.Driver";
	String driverUrl = "jdbc:mysql://10.90.36.3:3306/" + DB;
	String user = "opazo";
	String password = "opazo";
	
    public ConexionDB() {
        try {
            //Aunque ya no hace falta en Java             
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(driverUrl, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("No se encuentra el driver");
        } catch (SQLException e) {
            System.out.println("Excepcion SQL: " + e.getMessage());
            System.out.println("Estado SQL: " + e.getSQLState());
            System.out.println("Codigo del Error: " + e.getErrorCode());
            System.out.println("ERROR. No se puede conectar con la Bases de Datos: " + e);
            System.exit(-1);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException se) {
            System.out.println("Exception closing Connection: " + se);
        }
    }
}
