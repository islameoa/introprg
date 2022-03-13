/*En aquest exercici descobrirem com s'escriu el constructor d'una classe i en veurem l'utilitat*/

public class GatRenat {
    private int vides;
    private String posicio;
    public GatRenat() {
        vides = 7;
        posicio = "estirat";
    }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    public int getVides() { return vides; }
    
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println(renat);
    }
}
