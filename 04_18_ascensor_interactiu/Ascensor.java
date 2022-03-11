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
	
	public boolean estaAmunt(){
		if (pis==10){
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
		if (! moviment.equals("aturat")){
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
	
	public boolean aturat(){
		moviment = "aturat";
		return true;
	}
	public boolean arrencaAmunt(){
		if(pis==-1 || estaAturat()){
			moviment = "pujant";
			return true;
		}
		return false;
	}
	public boolean arrencaAbaix(){
		if(pis==10 || estaAturat()){
			moviment = "baixant";
			return true;
		}
		return false;
	}
	
	public int seguentPis(){
		if (moviment.equals("pujant") && pis==10){
			moviment = "baixant";
		}
		if (moviment.equals("baixant") && pis==-1){
			moviment = "pujant";
		}
		if(moviment.equals("pujant")){
			pis++;
			return pis;
		}
		if(moviment.equals("baixant")){
			pis--;
			return pis;
		}
		return pis;
	}
}









