/**Classe Zoo en la que tenim un metode que crea la taula categories i un metode que l'elimina, un metode que afegeix categoria i un altre qeurecupera totes les categories.*/
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zoo {
    private static final String NOM_BASE_DE_DADES = "animals.bd";
    private static final String CADENA_DE_CONNEXIO = "jdbc:sqlite:" +
                                                     NOM_BASE_DE_DADES;
    private Connection conn = null;

    public void connecta() throws SQLException {
        if (conn != null) return;   // ja connectat
        conn = DriverManager.getConnection(CADENA_DE_CONNEXIO);
    }

    public void desconnecta() throws SQLException {
        if (conn == null) return; // ja desconnectat
        conn.close();
        conn = null;
    }

    public void eliminaTaulaCategories() throws SQLException {
        String sql = "DROP TABLE IF EXISTS CATEGORIES";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        eliminaTaulaAnimals();
    }

    public void creaTaulaCategories() throws SQLException {
        String sql = "DROP TABLE IF EXISTS CATEGORIES; CREATE TABLE  CATEGORIES (" +
                 "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
                 "       nom       VARCHAR(40))";
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

    public void afegeixCategoria(Categoria categoria) throws SQLException {
        String sql = String.format(
                "INSERT INTO CATEGORIES (nom) VALUES ('%s')",
                categoria.getNom());
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            ResultSet rs = st.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            categoria.setId(id);
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    public List<Categoria> recuperaCategories() throws SQLException {
        String sql = "SELECT * FROM CATEGORIES ORDER BY nom";
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Categoria> categories = new LinkedList<>();
            while (rs.next()) {
                int bdId = rs.getInt("id");
                String nom = rs.getString("nom");
                Categoria categoria = new Categoria(bdId, nom);
                categories.add(categoria);
            }
            rs.close();
            return categories;
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    public Categoria obteCategoriaPerNom(String nom) throws SQLException {
        String sql = String.format(
                "SELECT * FROM CATEGORIES WHERE nom='%s'", nom);
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                int bdId = rs.getInt("id");
                String nomCategoria = rs.getString("nom");
                Categoria categoria = new Categoria(bdId, nomCategoria);
                rs.close();
                return categoria;
            } else {
                rs.close();
                return null;
            }
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    public String getNomTaules() throws SQLException {
        String sql = "SELECT name FROM sqlite_schema " +
                     "WHERE name NOT LIKE 'sqlite%' " +
                     "ORDER BY name";
        List<String> taules = new ArrayList<>();
        try (Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) { taules.add(rs.getString("name")); }
            rs.close();
        }
        return taules.size() > 0 ? String.join(", ", taules) : "cap";
    }

    public void creaTaulaAnimals() throws SQLException {
        creaTaulaCategories();
        String sql = "CREATE TABLE IF NOT EXISTS ANIMALS (" +
                     "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "       nom       VARCHAR(40)," +
                     "       categoria INTEGER," +
                     "       FOREIGN KEY (categoria) REFERENCES CATEGORIES(id))";
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

    public void eliminaTaulaAnimals() throws SQLException {
        String sql = "DROP TABLE IF EXISTS ANIMALS";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
    }

    public void afegeixAnimal(Animal animal) throws SQLException {
        Categoria cate = obteCategoriaPerNom(animal.getCategoria().getNom());
            if (cate == null) {
                afegeixCategoria(animal.getCategoria());
            } else {
                animal.getCategoria().setId(cate.getId());
            }
        if (! animal.getCategoria().idIndefinit()) {
            String sql = String.format(
                "INSERT INTO ANIMALS (nom, categoria) VALUES ('%s', %d)",
                animal.getNom(), animal.getCategoria().getId());
            Statement st = null;
            try {
                st = conn.createStatement();
                st.executeUpdate(sql);
                ResultSet rs = st.getGeneratedKeys();
                rs.next();
                int id = rs.getInt(1);
                animal.setId(id);
            } finally {
                if (st != null) {
                    st.close();
                }
            }
        }
    }

    public String obteAnimalPerNom(String nom) throws SQLException {
        String sql = String.format(
                "SELECT * FROM ANIMALS WHERE nom='%s'", nom);
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                int bdId = rs.getInt("id");
                String nomAnimal = rs.getString("nom");
                int bdCategoria = rs.getInt("categoria");
                Categoria categoria = obteCategoriaPerId(bdCategoria);
                Animal animal = new Animal(bdId, nomAnimal, categoria);
                rs.close();
                return animal.toString();
            } else {
                rs.close();
                return null;
            }
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    public List<Animal> recuperaAnimals() throws SQLException {
        String sql = "SELECT * FROM ANIMALS ORDER BY nom";
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Animal> animals = new LinkedList<>();
            while (rs.next()) {
                int bdId = rs.getInt("id");
                String nomAnimal = rs.getString("nom");
                int bdCategoria = rs.getInt("categoria");
                Categoria categoria = obteCategoriaPerId(bdCategoria);
                Animal animal = new Animal(bdId, nomAnimal, categoria);
                animals.add(animal);
            }
            rs.close();
            return animals;
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    private Categoria obteCategoriaPerId(int bdCategoria) {
        String sql = String.format(
                "SELECT * FROM CATEGORIES WHERE id=%d", bdCategoria);
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                int bdId = rs.getInt("id");
                String nomCategoria = rs.getString("nom");
                Categoria categoria = new Categoria(bdId, nomCategoria);
                rs.close();
                return categoria;
            } else {
                rs.close();
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void canviaCategoria(Animal animal, Categoria categoria) throws SQLException {
        if (animal.idIndefinit()) {
            animal.setCategoria(categoria);
            afegeixAnimal(animal);
        }
        if (categoria.idIndefinit()) {
            afegeixCategoria(categoria);
            int idNovaCategoria = obteCategoriaPerNom(categoria.getNom()).getId();
            int idAnimal = animal.getId();
            String sql = String.format("UPDATE ANIMALS " +
                           "SET categoria = %d " +
                           "WHERE id = %d",
                           idNovaCategoria,
                           idAnimal
                           );
            Statement st = null;
            try {
                st = conn.createStatement();
                st.executeUpdate(sql);
                ResultSet rs = st.getGeneratedKeys();
                rs.next();
                int id = rs.getInt(1);
                animal.setId(id);
            } finally {
                if (st != null) {
                    st.close();
                }
            }
        } else {
            int idNovaCategoria = obteCategoriaPerNom(categoria.getNom()).getId();
            int idAnimal = animal.getId();
            String sql = String.format("UPDATE ANIMALS " +
                           "SET categoria = %d " +
                           "WHERE id = %d",
                           idNovaCategoria,
                           idAnimal
                           );
            Statement st = null;
            try {
                st = conn.createStatement();
                st.executeUpdate(sql);
                ResultSet rs = st.getGeneratedKeys();
                rs.next();
                int id = rs.getInt(1);
                animal.setId(id);
            } finally {
                if (st != null) {
                    st.close();
                }
            }
        }
    }

    public void eliminaCategoria(Categoria categoria) {
        String sql = String.format(
                "DELETE FROM CATEGORIES WHERE id=%d", categoria.getId());
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminaAnimal(Animal animal) {
        String sql = String.format(
                "DELETE FROM ANIMALS WHERE id=%d", animal.getId());
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}