/*Exercici en el que passarem les propietats de la classe com a paramàtres del constructor*/

public class GatRenat {
    private int vides;
    private String posicio;
    
    public GatRenat(int vides, String posicio) {
        this.vides = 7;
        this.posicio = "dret";
    }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    public int getVides() { return this.vides; }
    public String getPosicio() { return this.posicio; }
    
    public void setPosicio(String posicio){
    	this.posicio = posicio;
    }
    
    public static void main(String[] args) {
        GatRenat renat = new GatRenat(7, "estirat");
        System.out.println(renat);
    }
}
