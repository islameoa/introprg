/*
*Primera versio de la class Botiga, treballa amb arrays de vins, permet guardar nous vins als arrays i cercarlos dins dels arrays.
*Actualment no disposa d'execucio propia.
*/
public class Botiga {
    private int DEFAULT_MAX_VINS = 10;
    private Vi vins[];
    private int apuntador = -1;

    public int getApuntador() {
        return this.apuntador;
    }

    public void setApuntador(int apuntador) {
        this.apuntador = apuntador;
    }

    // constructor de la classe botiga que seteja el maxim de vins a 10
    public Botiga() {
        vins = new Vi[DEFAULT_MAX_VINS];
    }

    // constructor de la classe botiga que rep el nombre de vins màxim i si es major
    // que zero crea el nou array
    public Botiga(int maxVins) {
        if (maxVins < 0) {
            maxVins = DEFAULT_MAX_VINS;
        }
        vins = new Vi[maxVins];
    }

    // mòdul afegeix que afegeix un vi a l'array
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

    // mòdul cerca que rep el nom d'un vi i si el troba el retorna
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

    // mòdul elimina que rep el nom d'un vi i l'elimina de l'array si el troba
    public Vi elimina(String nom) {
        // ordena();
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

    // comença el recorregut dels vins de la botiga
    public void iniciaRecorregut() {
        setApuntador(-1);
    }

    // retorna el segÜent vi del recorregut de la botiga
    public Vi getSeguent() {
        if (getApuntador() < vins.length) {
            setApuntador(getApuntador() + 1);
        }
        if (getApuntador() == vins.length) {
            return null;
        }

        while (vins[getApuntador()] == null && getApuntador() < vins.length) {
            setApuntador(getApuntador() + 1);
        }

        return vins[getApuntador()];
    }

    public Vi getActual() {
        return vins[0];
    }

    // modulo que mira si la botiga esta buida
    public boolean estaBuida() {
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] != null) {
                return false;
            }
        }
        return true;
    }

    // modulo que ordena el array de vinos
    public void ordena() {
        for (int i = 0; i < vins.length; i++) {
            for (int j = i + 1; j < vins.length; j++) {
                if (vins[i] != null && vins[j] != null) {
                    if (vins[i].getNom().compareTo(vins[j].getNom()) > 0) {
                        Vi aux = vins[i];
                        vins[i] = vins[j];
                        vins[j] = aux;
                    }
                }
            }
        }
    }
}