public class Botiga {
    int DEFAULT_MAX_VINS = 10;
    Vi vins[];

    public Botiga() {
        vins = new Vi[DEFAULT_MAX_VINS];
    }

    public Botiga(int maxVins) {
        if (maxVins < 0) {
            maxVins = DEFAULT_MAX_VINS;
        }
        vins = new Vi[maxVins];
    }

    public Vi afegeix(Vi vi){
        boolean elegible = true;
        if(vi.esValid()){
            for(int i=0; i<vins.length; i++){
                if (vins[i] != null) {
                    if(vins[i].getNom() == vi.getNom()){
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

    public Vi cerca(String nom){
        nom = Vi.normalitzaNom(nom);
        for(int i=0; i<vins.length; i++){
            if (vins[i] != null) {
                if(vins[i].getNom() == nom){
                    return vins[i];
                }
            }
        }
        return null;
    }

    public Vi elimina(String nom){
        nom = Vi.normalitzaNom(nom);
        for(int i=0; i<vins.length; i++){
            if (vins[i] != null) {
                if(vins[i].getNom() == nom){
                    if (vins[i].getEstoc() > 0){
                        return null;
                    } else {
                        vins[i] = null;
                        return vins[i];
                    }
                }
            }
        }
        return null;
    }

}
