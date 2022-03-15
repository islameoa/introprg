/*Programa que tindrà diversos constructors amb diferents arguments per posar-ho a prova*/

public class GatRenat{
    private int vides;
    private String posicio;

    
    
    public GatRenat(int vides, String posicio) {
        this.vides = vides;
        setPosicio(posicio);
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
        GatRenat[] renats = {
            new GatRenat(),         // tot per defecte
            new GatRenat(8),        // 8 vides i posició per defecte
            new GatRenat("dret"),   // posició dret i vides per defecte
            new GatRenat(8, "dret") // 8 vides i posició dret
    
        };
        for (GatRenat renat: renats) {
            System.out.println(renat);
        }
    }
}
