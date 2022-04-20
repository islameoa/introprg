/*Classe botiga que contindrà un catàleg dels vins i  mòduls per afegir vins, cercar un vi, i eliminar vins del catàleg. Es pot inicialitzar una instància de la classe botiga amb un array amb el número de posicions que vulguem*/
public class Botiga {
    private int DEFAULT_MAX_VINS = 10;
    private Vi vins[];

    public Botiga() {
        vins = new Vi[DEFAULT_MAX_VINS];
    }

    public Botiga(int maxVins) {
        if (maxVins < 0) {
            maxVins = DEFAULT_MAX_VINS;
        }
        vins = new Vi[maxVins];
    }

    public Vi afegeix(Vi vi) {
        boolean elegible = true;
        if (vi.esValid()) {
            for (int i = 0; i < vins.length; i++) {
                if (vins[i] != null) {
                    if (vins[i].getNom().equals(vi.getNom())) {
                        elegible = false;
                    }
                }
            }
            if (elegible) {
                for (int i = 0; i < vins.length; i++) {
                    if (vins[i] == null) {
                        vins[i] = vi;
                        return vi;
                    }
                }
            }
        }
        return null;
    }

    public Vi cerca(String nom) {
        nom = Vi.normalitzaNom(nom).toLowerCase();
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] != null) {
                String vi = vins[i].getNom().toLowerCase();
                if (vi.equals(nom)) {
                    return vins[i];
                }
            }
        }
        return null;
    }

    public Vi elimina(String nom) {
        nom = Vi.normalitzaNom(nom);
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] != null) {
                if (vins[i].getNom().equals(nom)) {
                    if (vins[i].getEstoc() > 0) {
                        return null;
                    } else {
                        Vi vi = vins[i];
                        vins[i] = null;
                        return vi;
                    }
                }
            }
        }
        return null;
    }
}
