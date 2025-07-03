package proyecto.avance.sistemaventa.utils;

import java.sql.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Conexion {

    private static Conexion instance;
    private Connection connection;
    public static final String URL = "jdbc:mysql://localhost:3306/punto_venta_java";
    public static final String USER = "root";
    public static final String CLAVE = "";

    /**
     * Conecta con la base de datos.
     *
     * @return conección con la base de datos
     */
    private Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(URL, USER, CLAVE);
        } catch (ClassNotFoundException | SQLException e) {
            Utilitarios.mostrarErrorGenerico(e);
        }
        return connection;
    }
    
    public static Conexion getInstance() {
        if (instance == null) {
            synchronized (Conexion.class) {
                if (instance == null) {
                    instance = new Conexion();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        conectar();
        return connection;
    }

}
