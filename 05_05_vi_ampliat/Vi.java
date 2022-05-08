/*Classe Vi que té com a propietats privades nom, preu i estoc i mètodes per construir una instància, setters i getters, metode toString per imprimir 
la informació com volem i nomNormalitza que treu els espais al nom del vi, també té esValida, per saber si l'instància és vàlida */
public class Vi {
    private String nom;
    private int preu;
    private int estoc;
    private String ref;
    private String lloc;
    private String origen;
    private String tipus;
    private String collita;

    public Vi() {
        this.nom = null;
        this.preu = -1;
        this.estoc = -1;
        this.ref = null;
        this.lloc = null;
        this.origen = null;
        this.tipus = null;
        this.collita = null;
    }

             
    public Vi(String ref, String nom, int preu, int estoc, String lloc, String origen, String tipus, String collita) {
        if(ref != null){
            ref = normalitzaString(ref);
            if (!ref.isEmpty()){
                this.ref = ref;
            } else {
                this.ref = null;
            }
        }
        if(nom != null){
            nom = normalitzaString(nom);
            if (!nom.isEmpty()){
                this.nom = nom;
            } else {
                this.nom = null;
            }
        }
        if (preu < 0) {
            this.preu = -1;
        } else {
            this.preu = preu;
        }
        if (estoc < 0) {
            this.estoc = -1;
        } else {
            this.estoc = estoc;
        }
        if (lloc != null){
            lloc = normalitzaString(lloc);
            if (!lloc.isEmpty()) {
                this.lloc = lloc;
            } else {
                this.lloc = null;
            }
        }
        if (origen != null){
            origen = normalitzaString(origen);
            if (!origen.isEmpty()) {
                this.origen = origen;
            } else {
                this.origen = null;
            }
        }
        if (tipus != null){
            tipus = normalitzaString(tipus);
            if (!tipus.isEmpty()) {
                this.tipus = tipus;
            } else {
                this.tipus = null;
            }
        }
        if (collita != null){
            collita = normalitzaString(collita);
            if (!collita.isEmpty()) {
                this.collita = collita;
            } else {
                this.collita = null;
            }
        }     
    }

    public String getNom() {
        return nom;
    }

    public int getPreu() {
        return preu;
    }

    public int getEstoc() {
        return estoc;
    }

    public String getRef() {
        return ref;
    }

    public String getLloc() {
        return lloc;
    }

    public String getOrigen() {
        return origen;
    }

    public String getTipus() {
        return tipus;
    }

    public String getCollita() {
        return collita;
    }

    public void setLloc(String lloc) {
        this.lloc = lloc;
    }

    public void setPreu(int preu) {
        if (preu >= 0) {
            this.preu = preu;
        }
    }

    public void setEstoc(int estoc) {
        if (estoc >= 0) {
            this.estoc = estoc;
        }
    }

    //altres metodes
        //asigna un format correcte per el vi
    public static String normalitzaString(String nom) {
        try {
            nom = nom.strip();
            String nomNormalitzat = "";
            boolean espai = false;
            for (int i = 0; i < nom.length(); i++) {
                if (nom.charAt(i) != ' ') {
                    nomNormalitzat += nom.charAt(i);
                    espai = false;
                }
                if ((nom.charAt(i) == ' ') && (!espai)) {
                    nomNormalitzat += ' ';
                    espai = true;
                }
            }
            if (nomNormalitzat.isBlank()) {
                nomNormalitzat = null;
            }
            return nomNormalitzat;
        } catch (Exception e) {
            return null;
        }
    }
        //comprova si un vi es valid
    public boolean esValid() {
        return (nom != null && nom.length() > 0 && ref != null && ref.length() > 0 && preu >= 0 && estoc >= 0);
    }

        //format del vi per ser mostrat com String
    @Override
    public String toString() {
        return "\n    Ref: " + getRef() + "\n    Nom: " + getNom() + "\n    Preu: " + getPreu() + "\n    Estoc: " + getEstoc() + "\n    Lloc: " + getLloc() + "\n    D.O.: " + getOrigen() + "\n    Tipus: " + getTipus() + "\n    Collita: " + getCollita()  +"\n";
    }
    
    //rep un array de Strings amb els atributs del vi i retorna un vi amb aquests atributs
    public static Vi deArrayString(String[] vi){
        if (vi.length != 8) {
            return null;
        }
        try {
            vi[0] = normalitzaString(vi[0]);
            vi[1] = normalitzaString(vi[1]);
            int preu = Integer.parseInt(vi[2]);
            int estoc = Integer.parseInt(vi[3]);
            vi[4] = normalitzaString(vi[4]);
            vi[5] = normalitzaString(vi[5]);
            vi[6] = normalitzaString(vi[6]);
            vi[7] = normalitzaString(vi[7]);
            if (preu < 0 || estoc < 0 || vi[0] == null || vi[1] == null || vi[4] == null || vi[5] == null || vi[6] == null || vi[7] == null) {
                return null;
            }
            return new Vi(vi[0], vi[1],preu, estoc, vi[4], vi[5], vi[6], vi[7]);
        } catch (Exception e) {
            return null;
        }
    }
    
    //rep una instància de vi i retorna un array de strings amb els atributs del vi
    
    public String[] aArrayString(){
        String[] vi = new String[8];
        vi[0] = getRef();
        vi[1] = getNom();
        vi[2] = Integer.toString(getPreu());
        vi[3] = Integer.toString(getEstoc());
        vi[4] = getLloc(); 
        vi[5] = getOrigen();
        vi[6] = getTipus();
        vi[7] = getCollita();
        return vi;
    }
}
