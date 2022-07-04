package inmobiliaria.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private String url = "jdbc:mysql://localhost/inmobiliariag7";
    private String usuario = "root";
    private String password = "";
    private Connection conexion;

    public Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar drivers de conexion");
        }
    }

    public Connection getConexion() {
        try {
            if (conexion == null) {
                conexion = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + usuario + "&password=" + password);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }
        return conexion;
    }
}
