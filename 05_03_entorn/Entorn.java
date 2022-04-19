public class Entorn {
    private final Botiga botiga = new Botiga();
    public static void main(String[] args) {
        Entorn entorn = new Entorn();
        mostraBenvinguda();
        while (true) {
            mostraPrompt();
            String comanda = Entrada.readLine().strip();
            if (comanda.isEmpty()) continue;
            if (comanda.equals("surt")) break;
            switch (comanda) {
                case "ajuda": mostraAjuda();
                             break;
                case "afegeix": entorn.processaAfegeix();
                           break;
                case "cerca": entorn.processaCerca();
                             break;
                case "modifica": entorn.processaModifica();
                            break;
                case "elimina": entorn.processaElimina();
                           break;
                default: mostraErrorComandaDesconeguda();
            }
        }
        mostraComiat();
    }
    private static void mostraBenvinguda() {
        System.out.println("Benvingut a la botiga de vins");
    }
    private static void mostraPrompt() {
        System.out.print("botiga> ");
    }
    private static void mostraAjuda() {
        System.out.println("\nComandes disponibles:");
        System.out.println("  ajuda");
        System.out.println("  cerca");
        System.out.println("  afegeix");
        System.out.println("  modifica");
        System.out.println("  elimina <nom>");
        System.out.println("  surt");
    }
    private void processaAfegeix() {
        String nom = Entrada.readLine("Nom del vin: ").strip();
        if (nom.isEmpty()) return;
        double preu = Entrada.readDouble("Preu del vin: ");
        int estoc = Entrada.readInt("Estoc del vin: ");
        Vi vi = new Vi(nom, preu, estoc);
        if (botiga.afegeix(vi) == null) {
            System.out.println("El vin " + nom + " ja existeix");
        } else {
            System.out.println("El vin " + nom + " s'ha afegit correctament");
        }
    }
    private void processaCerca() {
        String nom = Entrada.readLine("Nom del vin: ").strip();
        if (nom.isEmpty()) return;
        Vi vi = botiga.cerca(nom);
        if (vi == null) {
            System.out.println("El vin " + nom + " no existeix");
        } else {
            System.out.println("El vin " + nom + " es troba a la botiga");
        }
    }
    private void processaModifica() {
        String nom = Entrada.readLine("Nom del vin: ").strip();
        if (nom.isEmpty()) return;
        Vi vi = botiga.cerca(nom);
        if (vi == null) {
            System.out.println("El vin " + nom + " no existeix");
        } else {
            double preu = Entrada.readDouble("Preu del vin: ");
            int estoc = Entrada.readInt("Estoc del vin: ");
            vi.modifica(preu, estoc);
            System.out.println("El vin " + nom + " s'ha modificat correctament");
        }
    }
    private void processaElimina() {
        String nom = Entrada.readLine("Nom del vin: ").strip();
        if (nom.isEmpty()) return;
        Vi vi = botiga.elimina(nom);
        if (vi == null) {
            System.out.println("El vin " + nom + " no existeix");
        } else {
            System.out.println("El vin " + nom + " s'ha eliminat correctament");
        }
    }
    private static void mostraComiat() {
        System.out.println("\nAdeu!");
    }
    private static void mostraErrorComandaDesconeguda() {
        System.out.println("\nComanda desconeguda");
    }
}
