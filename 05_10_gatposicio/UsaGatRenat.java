/*Classe UsaGatRenat que servirà per probar la classe GatRenat i l'enum GatPosicio */

public class UsaGatRenat {
    public static void main(String[] args){
        try {
            GatPosicio posicio = GatPosicio.fromString(args[0]);
            GatRenat renat = new GatRenat(posicio);
            System.out.println("El gat Renat està: " + renat.getPosicio());
        } catch (IllegalArgumentException e) {
        System.out.println("Posició incorrecta");
        }
    }
}