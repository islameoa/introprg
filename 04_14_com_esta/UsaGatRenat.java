/*Exercici que utilitza la classe GatRenat per provar que funciona*/

public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("Inicialment renat.estaViu(): " + renat.estaViu(renat.getVides()));
        System.out.println("Inicialment renat.estaDret(): " + renat.estaDret(renat.getPosicio()));
        System.out.println("Inicialment renat.estaAssegut(): " + renat.estaAssegut(renat.getPosicio()));
        System.out.println("Inicialment renat.estaEstirat(): " + renat.estaEstirat(renat.getPosicio()));
        System.out.println("Introdueix quantes vides:");
        renat.setVides(Integer.parseInt(Entrada.readLine()));
        System.out.println("Introdueix nova posició:");
        renat.setPosicio(Entrada.readLine());
        System.out.println("Finalment renat.estaViu(): " + renat.estaViu(renat.getVides()));
        System.out.println("Finalment renat.estaDret(): " + renat.estaDret(renat.getPosicio()));
        System.out.println("Finalment renat.estaAssegut(): " + renat.estaAssegut(renat.getPosicio()));
        System.out.println("Finalment renat.estaEstirat(): " + renat.estaEstirat(renat.getPosicio()));
    }
}
