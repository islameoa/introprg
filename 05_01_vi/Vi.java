/*Classe Vi que té com a propietats privades nom, preu i estoc i mètodes per construir una instància, setters i getters, metode toString per imprimir 
la informació com volem i nomNormalitza que treu els espais al nom del vi, també té esValida, per saber si l'instància és vàlida */
public class Vi {
    private String nom;
    private int preu;
    private int estoc;

    public Vi(String nom, int preu, int estoc) {
        this.nom = nom;
        if (this.preu < 0) {
            this.preu = -1;
        } else {
            this.preu = preu;
        }
        if (this.estoc < 0) {
            this.estoc = -1;
        } else {
            this.estoc = estoc;
        }
    }

    public Vi(String nom, int preu) {
        this.nom = nom;
        if (this.preu < 0) {
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

    @Override
    public String toString() {
        return "\n    Vi: " + getNom() + "\n    Preu: " + getPreu() + "\n    Estoc: " + getEstoc() + "\n";
    }

    // metode normalitzaNom() que treu el espais en blanc del nom
    public static String normalitzaNom(String nom) {
        // try {
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
        // } catch (Exception e) {
        //     return "NOM NO VÀLID!";
        // }
    }

    public boolean esValid() {
        return (nom != null && nom != "NOM NO VÀLID!" && nom.length() > 0 && preu >= 0 && estoc >= 0);
    }
}