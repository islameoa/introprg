/*Creació de la classe ascensor que inicialitza el pis a -1*/

public class Ascensor {
    private int pis = -1;         // pis inicial de l'ascnesor
    private String moviment = "aturat";
    
    public int getPis(){
    	return pis;
    }
    
    public void setPis(int pis2){
    	if (pis2>0 && pis2<11){
    		pis = pis2;
    	} else {
    		pis = 0;
    	}
    }
    
    public String getMoviment(){
    	return moviment;
    }
    
    public void setMoviment(String moviment2){
    	if(moviment2.equals("aturat") || moviment2.equals("pujant") || moviment2.equals("baixant")){
			moviment = moviment2;
		}
    }
}
