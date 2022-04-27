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


    public Vi(String ref, String nom, String lloc, int preu, String origen, int estoc, String tipus, String collita) {
        this.nom = normalitzaString(nom);
        this.ref = normalitzaString(ref);
        this.lloc = normalitzaString(lloc);
        this.origen = normalitzaString(origen);
        this.tipus = normalitzaString(tipus);
        this.collita = normalitzaString(collita);

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
        if ((ref != null) || (!ref.isBlank())){
            this.ref = ref;
        } else {
            this.ref = null;
        }
        if ((lloc != null) || (!lloc.isBlank())){
            this.lloc = lloc;
        } else {
            this.lloc = null;
        }
        if ((origen != null) || (!origen.isBlank())){
            this.origen = origen;
        } else {
            this.origen = null;
        }
        if ((tipus != null) || (!tipus.isBlank())){
            this.tipus = tipus;
        } else {
            this.tipus = null;
        }
        if ((collita != null) || (!collita.isBlank())){
            this.collita = collita;
        } else {
            this.collita = null;
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
        return (nom != null && nom.length() > 0 && preu >= 0 && estoc >= 0);
    }

        //format del vi per ser mostrat com String
    @Override
    public String toString() {
        return "\n    Referència: " + getRef() + "\n    Vi: " + getNom() + "\n    Tipus: " + getTipus() + "\n    Preu: " + getPreu() + "\n    Collita: " + getCollita() + "\n    Estoc: " + getEstoc() + "\n    Denominació d'origen: " + getOrigen() + "\n    Lloc: " + getLloc()  +"\n";
    }
    
    //rep un array de Strings amb els atributs del vi i retorna un vi amb aquests atributs
    public static Vi deArrayString(String[] vi){
        if (vi.length != 8) {
            return null;
        }
        try {
            int preu = Integer.parseInt(vi[3]);
            int estoc = Integer.parseInt(vi[5]);
            vi[0] = normalitzaString(vi[0]);
            vi[1] = normalitzaString(vi[1]);
            vi[2] = normalitzaString(vi[2]);
            vi[4] = normalitzaString(vi[4]);
            vi[6] = normalitzaString(vi[6]);
            vi[7] = normalitzaString(vi[7]);
            if (preu < 0 || estoc < 0 || vi[0] == null || vi[1] == null || vi[2] == null || vi[4] == null || vi[6] == null || vi[7] == null) {
                return null;
            }
            return new Vi(vi[0], vi[1], vi[2], preu, vi[4], estoc, vi[6], vi[7]);
        } catch (Exception e) {
            return null;
        }
    }
    
    //rep una instància de vi i retorna un array de strings amb els atributs del vi
    
    public String[] aArrayString(){
        String[] vi = new String[8];
        vi[0] = getRef();
        vi[1] = getNom();
        vi[2] = getTipus();
        vi[3] = Integer.toString(getPreu());
        vi[4] = getCollita();
        vi[5] = getOrigen();
        vi[6] = Integer.toString(getEstoc());
        vi[7] = getLloc();
        return vi;
    }
}
