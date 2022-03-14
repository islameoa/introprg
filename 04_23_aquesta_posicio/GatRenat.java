/*Exercici en el que passarem les propietats de la classe com a paramàtres del constructor*/

public class GatRenat {
    private int vides;
    private String posicio;
    
    public GatRenat(int novesVides, String posicio) {
        vides = novesVides;
        posicio = "dret";
    }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    public int getVides() { return vides; }
    public String getPosicio() { return posicio; }
    
    public void setPosicio(String posicio){
    	posicio = posicio;
    }
    
    public static void main(String[] args) {
        GatRenat renat = new GatRenat(7, "estirat");
        System.out.println(renat);
    }
}
