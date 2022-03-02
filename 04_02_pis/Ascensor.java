/*Creació de la classe ascensor que inicialitza el pis a -1*/

public class Ascensor {
    public int pis = -1;         // pis inicial de l'ascnesor
    public static void main(String[] args) {
        Ascensor ascensor;           // declarem la referència a l'ascensor
        ascensor = new Ascensor();   // creem la instància de l'ascensor
        System.out.println("L'ascensor està a la planta " + ascensor.pis);
    }
}
