/*Exercici en el que passarem les propietats de la classe com a paramàtres del constructor*/

public class GatRenat {
    private int vides;
    private String posicio;
    
    public GatRenat(int vides, String posicio) {
        this.vides = vides;
        this.posicio = posicio;
    }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    public int getVides() { return this.vides; }
    public String getPosicio() { return this.posicio; }
    
    public void setPosicio(String posicio){
    	if (posicio.equals("estirat") || posicio.equals("dret") || posicio.equals("assegut")){
    		this.posicio = posicio;
    	} else {
    		this.posicio = "estirat";
    	}
    }
    public void setVides(int vides){
    	if (vides >= 0)  {
        	this.vides = vides;
        }
    }
    
    public static void main(String[] args) {
        GatRenat renat = new GatRenat(7, "dret");
        System.out.println(renat);
    }
}
