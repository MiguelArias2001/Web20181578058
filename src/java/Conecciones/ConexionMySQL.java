package Conecciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    private static ConexionMySQL instance; //Singleton
    private Connection cnn;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String pss = "";
    private String nom_bd = "bd_tallerjavaweb";

    private ConexionMySQL() {
        try 
        {
            Class.forName(driver);
            cnn = DriverManager.getConnection(url+nom_bd, user, pss);
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println("Error en driver mysql: "+ex.getMessage());
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error en conexion mysql: "+ex.getMessage());
        }
    }

    public static synchronized ConexionMySQL getInstance() 
    {
        if(instance == null)
        {
            instance = new ConexionMySQL();
        }
        return instance;
    }

    public Connection getCnn() 
    {
        return cnn;
    }
    
    public void cerrarConexion()
    {
        /*
        if(cnn != null)
        {
            try 
            {
                cnn.close();
            } 
            catch (SQLException ex) 
            {
                System.out.println("Error al cerrar la conexion: "+ex.getMessage());
            }
        }
        
        instance = null;
        */
    }
    
    

}
