
/* Classe entorn on hem programat "l'aplicació" que utilitzarà la senyora Estrella per afegir vins, buscar vins, modificar les característiques d'algun vi i eliminar-ne un del catàleg de la botiga*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Entorn {
    private final static Botiga botiga = new Botiga();

    public static void main(String[] args) throws IOException {
        Entorn entorn = new Entorn();
        mostraBenvinguda();
        System.out.println("Referències llegides: " + comptaReferencies());
        try {
            if (existeixFitxer()) {
                getReferencies();
            }
        } catch (IOException e) {
            System.out.println("El fitxer botiga.csv no existeix");
        }
        while (true) {
            mostraPrompt();
            String comanda = Entrada.readLine().strip();
            if (comanda.isEmpty())
                continue;
            if (comanda.equals("surt"))
                break;
            switch (comanda) {
                case "ajuda":
                    mostraAjuda();
                    break;
                case "afegeix":
                    entorn.processaAfegeix();
                    break;
                case "cerca":
                    entorn.processaCerca();
                    break;
                case "modifica":
                    entorn.processaModifica();
                    break;
                case "elimina":
                    entorn.processaElimina();
                    break;
                default:
                    mostraErrorComandaDesconeguda();
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
        System.out.println("Comandes disponibles:");
        System.out.println("ajuda");
        System.out.println("cerca");
        System.out.println("afegeix");
        System.out.println("modifica");
        System.out.println("elimina");
        System.out.println("surt");
    }

    private void processaAfegeix() {
        System.out.println("Comanda temporalment no disponible");
    }

    private void processaCerca() {
        System.out.print("ref> ");
        String ref = Entrada.readLine();
        if (ref.isEmpty()) {
            String ambivalente = "";
            String nom = "";
            int preu = -1;
            int estoc = -1;
            String lloc = "";
            String origen = "";
            String tipus = "";
            String collita = "";
            boolean error = false;
            for (int i = 0; i < 8; i++) {
                if (i == 0) {
                    System.out.print("nom> ");
                    ambivalente = Entrada.readLine();
                    if (ambivalente.equals("!")) {
                        nom = null;
                        break;
                    } else {
                        nom = ambivalente;
                    }
                }
                if (i == 1) {
                    System.out.print("preu max.> ");
                    String preuString = Entrada.readLine();
                    if (preuString.equals("!")) {
                        preu = -1;
                        break;
                    } else if (preuString.isEmpty()) {
                        preu = -1;
                    } else if (!UtilString.esEnter(preuString)) {
                        System.out.println("ERROR: el valor ha de ser un enter positiu");
                        error = true;
                        break;
                    } else {
                        preu = Integer.parseInt(preuString);
                    }
                }
                if (i == 2) {
                    System.out.print("estoc min.> ");
                    String estocString = Entrada.readLine();
                    if (estocString.equals("!")) {
                        estoc = -1;
                        break;
                    } else if (estocString.isEmpty()) {
                        estoc = -1;
                    } else if (!UtilString.esEnter(estocString)) {
                        System.out.println("ERROR: el valor ha de ser un enter positiu");
                        error = true;
                        break;
                    } else {
                        estoc = Integer.parseInt(estocString);
                    }
                }
                if (i == 3) {
                    System.out.print("lloc> ");
                    ambivalente = Entrada.readLine();
                    if (ambivalente.equals("!")) {
                        lloc = null;
                        break;
                    } else {
                        lloc = ambivalente;
                    }
                }
                if (i == 4) {
                    System.out.print("origen> ");
                    ambivalente = Entrada.readLine();
                    if (ambivalente.equals("!")) {
                        origen = null;
                        break;
                    } else {
                        origen = ambivalente;
                    }
                }
                if (i == 5) {
                    System.out.print("tipus> ");
                    ambivalente = Entrada.readLine();
                    if (ambivalente.equals("!")) {
                        tipus = null;
                        break;
                    } else {
                        tipus = ambivalente;
                    }
                }
                if (i == 6) {
                    System.out.print("collita> ");
                    ambivalente = Entrada.readLine();
                    if (ambivalente.equals("!")) {
                        collita = null;
                        break;
                    } else {
                        collita = ambivalente;
                    }
                }
            }
            Vi vi = new Vi(ref, nom, preu, estoc, collita, lloc, origen, tipus);
            Vi viTrobat = botiga.cerca(vi);
            if (!error) {
                if (viTrobat == null) {
                    System.out.println("No trobat");
                } else {
                    System.out.println("Trobat:");
                    System.out.println(viTrobat);
                }
            }
        } else if (ref.equals("!")) {
            ref = null;
        } else {
            ref = Vi.normalitzaString(ref);
            Vi vi = botiga.cerca(ref);
            if (vi == null) {
                System.out.println("No trobat");
            } else {
                System.out.println("Trobat:");
                System.out.println(vi);
            }
        }
    }

    private void processaModifica() {
        System.out.println("Comanda temporalment no disponible");
    }

    private void processaElimina() {
        System.out.println("Comanda temporalment no disponible");
    }

    private static void mostraComiat() {
        System.out.println("adéu");
    }

    private static void mostraErrorComandaDesconeguda() {
        System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
    }

    public static int comptaReferencies() throws IOException {
        File fitxer = new File("botiga.csv");
        botiga.iniciaRecorregut();
        if (fitxer.isFile()) {
            BufferedReader input = new BufferedReader(new FileReader("botiga.csv"));
            String line = input.readLine();
            int i = 0;
            while (true) {
                if (line == null) {
                    break;
                }
                String[] parts = line.split(";");
                if (parts.length == 8 && UtilString.esEnter(parts[2]) && UtilString.esEnter(parts[3]) && UtilString.esEnter(parts[7])) {
                    i++;
                }
                line = input.readLine();
            }
            input.close();
            return i;
        }
        return 0;
    }

    public static void getReferencies() throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("botiga.csv"));
        String line = input.readLine();
        while (line != null) {
            String[] parts = line.split(";");
            if (parts.length == 8 && UtilString.esEnter(parts[2]) && UtilString.esEnter(parts[3]) && UtilString.esEnter(parts[7])) {
                if (UtilString.esEnter(parts[2]) && UtilString.esEnter(parts[3]) && UtilString.esEnter(parts[7])) {
                    botiga.afegeix(Vi.deArrayString(parts));
                }
            }
            line = input.readLine();
        }
        input.close();
    }

    // metodo booleano que mira si existe el fichero botiga.txt
    public static boolean existeixFitxer() {
        File fitxer = new File("botiga.csv");
        return fitxer.isFile();
    }
}
