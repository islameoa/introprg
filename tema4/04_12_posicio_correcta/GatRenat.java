/*Classe GatRenat que inicialitza les seves instàncies amb 7 vides i assegudes*/

public class GatRenat {
    private int vides = 7;         // vides disponibles del gat Renat
    private String posicio = "estirat";

	public int getVides(){
		return vides;
	}

	public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
		       if (novesVides >= 0) {
		           vides = novesVides;
		       }
		   }
		   
	public void setPosicio(String posicio2){
		if(posicio2.equals("assegut") || posicio2.equals("estirat") || posicio2.equals("dret")){
			posicio = posicio2;
		}
	}
	
	public String getPosicio(){
		return posicio;
	}	
}
