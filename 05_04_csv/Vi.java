/*Classe Vi que té com a propietats privades nom, preu i estoc i mètodes per construir una instància, setters i getters, metode toString per imprimir 
la informació com volem i nomNormalitza que treu els espais al nom del vi, també té esValida, per saber si l'instància és vàlida */
public class Vi {
    private String nom;
    private int preu;
    private int estoc;

    public Vi(String nom, int preu, int estoc) {
        this.nom = normalitzaNom(nom);
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
    }

    public Vi(String nom, int preu) {
        this.nom = normalitzaNom(nom);
        if (preu < 0) {
            this.preu = -1;
        } else {
            this.preu = preu;
        }
        this.estoc = 0;
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
    public static String normalitzaNom(String nom) {
        try {
            if (nom.isBlank()) {
                throw new Exception("NOM NO VÀLID!");
            }
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
            return nomNormalitzat;
        } catch (Exception e) {
            return "NOM NO VÀLID!";
        }
    }
        //comprova si un vi es valid
    public boolean esValid() {
        return (nom != null && nom != "NOM NO VÀLID!" && nom.length() > 0 && preu >= 0 && estoc >= 0);
    }

        //format del vi per ser mostrat com String
    @Override
    public String toString() {
        return "\n    Vi: " + getNom() + "\n    Preu: " + getPreu() + "\n    Estoc: " + getEstoc() + "\n";
    }
    
    //rep un array de Strings amb els atributs del vi i retorna un vi amb aquests atributs
    public static Vi deArrayString(String[] vi){
        if (vi.length != 3) {
            return null;
        }
        try {
            int preu = Integer.parseInt(vi[1]);
            int estoc = Integer.parseInt(vi[2]);
            return new Vi(vi[0], preu, estoc);
        } catch (Exception e) {
            return null;
        }
    }
    
    //rep una instància de vi i retorna un array de strings amb els atributs del vi

    public static String[] aArrayString(Vi vino){
        String[] vi = new String[3];
        vi[0] = vino.getNom();
        vi[1] = Integer.toString(vino.getPreu());
        vi[2] = Integer.toString(vino.getEstoc());
        return vi;
    }
    public String[] aArrayString(){
        String[] vi = new String[3];
        vi[0] = getNom();
        vi[1] = Integer.toString(getPreu());
        vi[2] = Integer.toString(getEstoc());
        if (Integer.parseInt(vi[1]) <0 || Integer.parseInt(vi[2]) < 0 || vi[0].equals("NOM NO VÀLID!")){
            return null;
        }
        vi[1] = Integer.toString(getPreu());
        vi[2] = Integer.toString(getEstoc());
        return vi;
    }
}












