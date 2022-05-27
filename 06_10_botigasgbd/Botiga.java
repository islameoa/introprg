
/*
*Primera versio de la class Botiga, treballa amb arrays de vins, permet guardar nous vins als arrays i cercarlos dins dels arrays.
*Actualment no disposa d'execucio propia.
*/
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Botiga {
    private static final String NOM_BASE_DE_DADES = "animals.bd";
    private static final String CADENA_DE_CONNEXIO = "jdbc:sqlite:" +
            NOM_BASE_DE_DADES;
    private Connection conn = null;

    public void connecta() throws SQLException {
        if (conn != null)
            return; // ja connectat
        conn = DriverManager.getConnection(CADENA_DE_CONNEXIO);
    }

    public void desconnecta() throws SQLException {
        if (conn == null)
            return; // ja desconnectat
        conn.close();
        conn = null;
    }

    // crea la taula botiga si no existeix
    public void creaTaula() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS botiga (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "nom VARCHAR(50) NOT NULL," +
                     "preu INTEGER NOT NULL," +
                     "quantitat INTEGER NOT NULL,";
                     Statement st = null;
                     try {
                         st = conn.createStatement();
                         st.executeUpdate(sql);
                     } finally {
                         if (st != null) {
                             st.close();
                         }
                     }
    }

    public void afegeixCategoria(Vi vi) throws SQLException {
        
    }

    // afegeix un vin a la base de dades
    public void afegeixVi(Vi vi) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO vins (nom, tipus, preu, quantitat) " +
                "VALUES ('" + vi.getNom() +
                "', " + vi.getPreu() + ")";
        stmt.executeUpdate(sql);
    }
}