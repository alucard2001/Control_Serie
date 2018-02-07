package Sys.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos E. Cedeño 30/01/2018 6:50 pm
 */
public class Conection {

    public String db = "systsererie";
    public String url = "jdbc:postgresql://localhost:5432/" + db;
    public String usuario = "postgres";
    public String pass = "Tatiana17";

    public Conection() {
    }

    public Connection conectar() {
        Connection link = null;
        try {
            Class.forName("org.postgresql.Driver");
            link = DriverManager.getConnection(this.url, this.usuario, this.pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }

        return link;
    }

}
