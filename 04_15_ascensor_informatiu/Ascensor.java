/*Creació de la classe ascensor que inicialitza el pis a -1 amb varis mòduls per consultar-li certes coses*/

public class Ascensor {
    private int pis = -1;         // pis inicial de l'ascnesor
    private String moviment = "aturat";
    
    public int getPis(){
    	return pis;
    }
    
    public void setPis(int pis2){
    	if (pis2>-1 && pis2<11){
    		pis = pis2;
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
    
    public boolean estaAbaix(){
		if (pis==-1){
			return true;
		}
		return false;
	}
	
	public boolean estaAmunt(int pis2){
		if (pis==pis2){
			return true;
		}
		return false;
	}
	
	public boolean estaAturat(){
		if (moviment.equals("aturat")){
			return true;
		}
		return false;
	}
	
	public boolean estaMovent(){
		if (estaPujant() || estaBaixant()){
			return true;
		}
		return false;
	}
	
	public boolean estaPujant(){
		if (moviment.equals("pujant")){
			return true;
		}
		return false;
	}
	public boolean estaBaixant(){
		if (moviment.equals("baixant")){
			return true;
		}
		return false;
	}
	
	public String comEsta(){
		return (moviment + " al pis " + pis);
	}
}




