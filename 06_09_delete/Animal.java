/**Classe animal semblannt a la taula categories, d'aquests animals es formaran en el futur les categories del zoo */

public class Animal {
    private int id = -1;
    private String nom;
    private Categoria categoria;

    public Animal(String nom, Categoria categoria) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        }
        if (categoria == null) {
            throw new IllegalArgumentException("La categoria no pot ser null");
        }
        this.nom = nom;
        this.categoria = categoria;
    }

    public Animal(int id, String nom, Categoria categoria) {
        this(nom, categoria);
        if (id < 0) {
            throw new IllegalArgumentException("L'identificador ha de ser positiu");
        }
        this.id = id;
    }

    public boolean idIndefinit() { return id < 0; }

    public int getId() {
        
        return id;
    }

    public String getNom() { return nom; }

    public Categoria getCategoria() { return categoria; }

    @Override
    public String toString() {
        return "Animal(id:" +
            (id < 0 ? "indefinit" : id) +
            ", " + nom + ", " + categoria + ")";
    }

    public void setId(int id2) {
        if (id2 < 0) {
            throw new IllegalArgumentException("L'identificador ha de ser positiu");
        }
        this.id = id2;
    }

    public void setCategoria(Categoria categoria2) {
        if (categoria2 == null) {
            throw new IllegalArgumentException("La categoria no pot ser null");
        }
        this.categoria = categoria2;
    }
}
