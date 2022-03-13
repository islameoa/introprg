/*Exercici en el que passarem les propietats de la classe com a paramàtres del constructor*/

public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    public GatRenat(int vides, String novaPosicio) {
        setVides(vides);
        setPosicio(novaPosicio);
    }
    
    public int getVides() { return vides; }
    public String getPosicio() { return posicio; }
    
    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }
    public void setPosicio(String novaPosicio) {
    	if (novaPosicio != "estirat" && novaPosicio != "dret" && novaPosicio != "assegut"){
    		posicio = "estirat";
    	} else {
    		posicio = novaPosicio;
    	}
    }
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "dret"));
    }
}
