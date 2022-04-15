/* Demostració d'ús de membres de classe */
public class GatRenat {
    private static int numInstancies = 0;
    private int vides = 7;
    public GatRenat() {
        // constructor per defecte incrementa el nombre d'instàncies
        GatRenat.numInstancies++;
        System.out.println("Creat un nou gat Renat. Ja van " + numInstancies);
    }
    public static int getNumInstancies() {
        // retorna el nombre d'instàncies creades fins el moment
        return numInstancies;
    }
    public int getVides() { return vides; }
    public void setVides(int vides) { if (vides>=0) this.vides = vides; }
    public String toString() { return "Gat Renat amb " + vides + " vides"; }
    public static void main(String[] args) {
        System.out.println("Inicialment el nombre d'instàncies és: " +
            GatRenat.getNumInstancies());
        // crea uns quants GatRenat per demostrar l'ús de membres estàtics
        GatRenat[] gats = new GatRenat[10];
        for (int i=0; i < gats.length; i++) {
            gats[i] = new GatRenat();
            gats[i].setVides(i);    // canviem les vides només per distingir-los
            System.out.println("Tenim: " + gats[i] + " amb " +
                gats[i].getNumInstancies() + " germanets");
        }
        // tornem a demanar a cadascun quants germans té
        System.out.println("I si tornem a demanar-los quants germans tenen, ens diuen:");
        for (int i=0; i < gats.length; i++) {
            System.out.println(gats[i] + " amb " +
                gats[i].getNumInstancies() + " germanets");
        }
    }
}
