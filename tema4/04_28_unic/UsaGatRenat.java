/*Programa que utilitza la classe GatRenat per provar-la, creem una instància amb getInstancia i la propietat privada de GatRenat, desprès les canviem amb canviaPosicio i veiem que canvia per ser estatic*/

public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = GatRenat.getInstancia();
        System.out.println("Inicialment Renat està " + renat.getPosicio());
        for (String posicio : args) {
            canviaPosicio(posicio);
            System.out.println("Ara està " + renat.getPosicio());
        }
    }

    private static void canviaPosicio(String novaPosicio) {
        if (novaPosicio.equals("1")) {
            novaPosicio = "estirat";
        }
        if (novaPosicio.equals("2")) {
            novaPosicio = "assegut";
        }
        if (novaPosicio.equals("3")) {
            novaPosicio = "dret";
        }
        GatRenat.getInstancia(novaPosicio);
    }
}
