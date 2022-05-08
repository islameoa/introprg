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
    public Vi cerca(String ref) {
        ref = Vi.normalitzaString(ref).toLowerCase();
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] != null) {
                String vi = vins[i].getRef().toLowerCase();
                if (vi.equals(ref)) {
                    return vins[i];
                }
            }
        }
        return null;
    }

    public Vi cerca(Vi plantilla) {
        if (!plantilla.esValid()) {
            for (int i = 0; i < vins.length; i++) {
                if (vins[i] != null) {
                    if (vins[i].getNom().equals(plantilla.getNom())) {
                        return vins[i];
                    }
                    if (vins[i].getRef().equals(plantilla.getRef())) {
                        return vins[i];
                    }
                    if (vins[i].getPreu() == plantilla.getPreu()) {
                        return vins[i];
                    }
                    if (vins[i].getEstoc() == plantilla.getEstoc()) {
                        return vins[i];
                    }
                    if (vins[i].getLloc().equals(plantilla.getLloc())) {
                        return vins[i];
                    }
                    if (vins[i].getOrigen().equals(plantilla.getOrigen())) {
                        return vins[i];
                    }
                    if (vins[i].getTipus().equals(plantilla.getTipus())) {
                        return vins[i];
                    }
                }
            }
        } else {
            for (Vi vi : vins) {
                if (vi == null)
                    continue;
                if (plantilla.getRef() != null && !plantilla.getRef().equalsIgnoreCase(vi.getRef()))
                    continue;

                if (plantilla.getNom() != null && !plantilla.getNom().equalsIgnoreCase(vi.getNom()))
                    continue;

                if (plantilla.getPreu() >= 0 && plantilla.getPreu() < vi.getPreu())
                    continue;

                if (plantilla.getEstoc() >= 0 && plantilla.getEstoc() > vi.getEstoc())
                    continue;

                if (plantilla.getTipus() != null && !plantilla.getTipus().equalsIgnoreCase(vi.getTipus()))
                    continue;

                if (plantilla.getOrigen() != null && !plantilla.getOrigen().equalsIgnoreCase(vi.getOrigen()))
                    continue;

                if (plantilla.getLloc() != null && !plantilla.getLloc().equalsIgnoreCase(vi.getLloc()))
                    continue;

                if (plantilla.getCollita() != null && !plantilla.getCollita().equalsIgnoreCase(vi.getCollita()))
                    continue;

                return vi;
            }
        }
        return null;
    }

    // mòdul elimina que rep el nom d'un vi i l'elimina de l'array si el troba
    public Vi elimina(String ref) {
        // ordena();
        ref = Vi.normalitzaString(ref).toLowerCase();
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] != null) {
                if (vins[i].getRef().toLowerCase().equals(ref)) {
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
        iniciaRecorregut();
        if (getApuntador() < vins.length) {
            setApuntador(getApuntador() + 1);
        }

        while (vins[getApuntador()] == null && getApuntador() < vins.length - 1) {
            setApuntador(getApuntador() + 1);
        }

        return vins[getApuntador()];
    }
}
