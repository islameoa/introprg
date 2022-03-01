/*Creació de la classe ascensor amb el mòdul pujaPis per tal de que a la seva variable pis se li sumi 1*/

public class Ascensor {
    public int pis = -1;
    
    public static void Ascensor(Ascensor ascensor) {
        ascensor.pis++;
    }
    public static void main(String[] args){
        Ascensor ascensor;           // declarem la referència a l'ascensor
        ascensor = new Ascensor();   // creem la instància de l'ascensor
        
        System.out.println("L'ascensor inicialment està a la planta " + ascensor.pis);
        
        Ascensor(ascensor);
        
        System.out.println("L'ascensor finalment està a la planta " + ascensor.pis);
    }
}

