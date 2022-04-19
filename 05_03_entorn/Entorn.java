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
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
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
        System.out.println("nom (enter cancel·la)> ");
        String nom = Entrada.readLine().strip();
        if (nom.isEmpty()) return;
        nom = Vi.normalitzaNom(nom);
        System.out.println("preu (en cèntims)> ");
        String preu = Entrada.readLine();
        if (preu.isEmpty()) preu = "0";
        int preuEnter = Integer.parseInt(preu);
        if (preuEnter < 0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        System.out.println("estoc (enter sense estoc)> ");
        String estoc = Entrada.readLine();
        if (estoc.isEmpty()) estoc = "0";
        int estocEnter = Integer.parseInt(estoc);
        if (estocEnter < 0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        Vi vi = new Vi(nom, preuEnter, estocEnter);
        if (botiga.afegeix(vi) == null) {
            System.out.println("ERROR: no s'ha pogut afegir");
        } else {
            System.out.println("Introduït:");
            System.out.println(vi);
        }
    }
    private void processaCerca() {
        String nom = Entrada.readLine();
        nom = Vi.normalitzaNom(nom);
        if (nom.isEmpty()) return;
        nom = Vi.normalitzaNom(nom);
        Vi vi = botiga.cerca(nom);
        if (vi == null) {
            System.out.println("No trobat");
        } else {
            System.out.println("Trobat:");
            System.out.println(vi);
        }
    }
    private void processaModifica() {
        String nom = Entrada.readLine();
        nom = Vi.normalitzaNom(nom);
        if (nom.isEmpty()) return;
        Vi vi = botiga.cerca(nom);
        if (vi == null) {
            System.out.println("No trobat");
        } else {
            String preu = Entrada.readLine();
            int preuEnter = 0;
            if (preu.isEmpty()){
                preuEnter = vi.getPreu();
            } else {
                preuEnter = Integer.parseInt(preu);
                if (preuEnter < 0) {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
                vi.setPreu(preuEnter);
            }
            String estoc = Entrada.readLine();
            int estocEnter = 0;
            if (estoc.isEmpty()){
                estocEnter = vi.getEstoc();
            } else {
                estocEnter = Integer.parseInt(estoc);
                if (estocEnter < 0) {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
                vi.setEstoc(estocEnter);
            }            
            System.out.println("Modificat:");
            System.out.println(vi);
        }
    }
    private void processaElimina() {
        System.out.println("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty()) return;
        nom = Vi.normalitzaNom(nom);
        Vi vi = botiga.cerca(nom);
        if (vi == null) {
            System.out.println("No trobat");
        } else {
            System.out.println("A eliminar:");
            System.out.println(vi);
            String resposta = Entrada.readLine();
            UtilitatsConfirmacio.respostaABoolean(resposta);
            vi = botiga.elimina(nom);
            if (vi == null) {
                System.out.println("ERROR: no s'ha pogut eliminar");
            } else {
                System.out.println("Eliminat");
            }
        }
    }
    private static void mostraComiat() {
        System.out.println("adéu");
    }
    private static void mostraErrorComandaDesconeguda() {
        System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
    }
}
