/*Classe Categoria que ofereix dues maneres de construir instàncies: amb o sense identificador. Les instàncies tenen id i nom com a propietats. */
public class Categoria {
    private int id = -1;  // -1 indica no assignat/indefinit
    private String nom;

    public Categoria(String nom) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        }
        this.nom = nom;
    }

    public Categoria(int id, String nom) {
        this(nom);
        if (id < 0) {
            throw new IllegalArgumentException("L'identificador ha de ser positiu");
        }
        setId(id);
    }

    public boolean idIndefinit() { return id < 0; }
    public int getId() {
        if (idIndefinit()) {
            //throw new UnsupportedOperationException("L'identificador no està disponible");
            id = 0;
        }
        return id;
    }
    public String getNom() { return nom; }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("L'identificador ha de ser positiu");
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return "Categoria(id:" +
            (id < 0 ? "indefinit" : id) +
            ", " + nom + ")";
    }
}