/* Classe entorn on hem programat "l'aplicació" que utilitzarà la senyora Estrella per afegir vins, buscar vins, modificar les característiques d'algun vi i eliminar-ne un del catàleg de la botiga*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Entorn {
    private final static Botiga botiga = new Botiga();

    public static int comptaReferencies() throws IOException {
        File fitxer = new File("botiga.txt");
        if (fitxer.isFile()) {
            System.out.println("El fitxer botiga.txt existeix");
            BufferedReader input = new BufferedReader(new FileReader("botiga.csv"));
            String line = input.readLine();
            int i = 0;
            while (line != null) {
                String[] parts = line.split(";");
                if (parts[i] != null) {
                    botiga.afegeix(Vi.deArrayString(parts));
                }
                line = input.readLine();
                i++;
            }
            input.close();
            return i;
        } else {
            System.out.println("El fitxer botiga.txt no existeix");
        }
        return 0;
    }

    public static int getReferencies() throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("botiga.csv"));
        String line = input.readLine();
        int i = 0;
        while (line != null) {
            String[] parts = line.split(";");
            if (parts[i] != null) {
                botiga.afegeix(Vi.deArrayString(parts));
            }
            line = input.readLine();
            i++;
        }
        input.close();
        return i;
    }

    public static void writeReferencies() throws IOException {
        BufferedWriter sortida = new BufferedWriter(new FileWriter("botiga.csv"));
        String[] parts = Vi.aArrayString(botiga.getSeguent());
        String line = String.join(";", parts);
        while (line != null) {
            sortida.write(line);
            parts = Vi.aArrayString(botiga.getSeguent());
            line = String.join(";", parts);
            sortida.newLine();
        }
        sortida.close();
    }

    public static void main(String[] args) throws IOException {
        Entorn entorn = new Entorn();
        mostraBenvinguda();
        try {
            System.out.println("Referències llegides: " + comptaReferencies());
        } catch (IOException e) {
            System.out.println("No s'ha trobat el fitxer botiga.csv");
        }
        botiga.iniciaRecorregut();

        while (true) {
            Vi vi = botiga.getSeguent();
            if (vi == null)
                break;
            System.out.println(vi);
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
        try {
            System.out.println("Referències guardades: " + getReferencies());
        } catch (IOException e) {
            System.out.println("No s'ha trobat el fitxer botiga.csv");
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
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine().strip();
        if (nom.isEmpty())
            return;
        nom = Vi.normalitzaNom(nom);
        System.out.print("preu (en cèntims)> ");
        String preu = Entrada.readLine();
        if (preu.isEmpty())
            preu = "0";
        int preuEnter = Integer.parseInt(preu);
        if (preuEnter < 0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        System.out.print("estoc (enter sense estoc)> ");
        String estoc = Entrada.readLine();
        if (estoc.isEmpty())
            estoc = "0";
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
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty())
            return;
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
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty())
            return;
        nom = Vi.normalitzaNom(nom);
        Vi vi = botiga.cerca(nom);
        if (vi == null) {
            System.out.println("No trobat");
        } else {
            System.out.print("preu (enter " + vi.getPreu() + ")> ");
            String preu = Entrada.readLine();
            int preuEnter = 0;
            if (preu.isEmpty()) {
                preuEnter = vi.getPreu();
            } else {
                preuEnter = Integer.parseInt(preu);
                if (preuEnter < 0) {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
                vi.setPreu(preuEnter);
            }
            System.out.print("estoc (enter " + vi.getEstoc() + ")> ");
            String estoc = Entrada.readLine();
            int estocEnter = 0;
            if (estoc.isEmpty()) {
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
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty())
            return;
        nom = Vi.normalitzaNom(nom);
        Vi vi = botiga.cerca(nom);
        if (vi == null) {
            System.out.println("No trobat");
        } else {
            System.out.println("A eliminar:");
            System.out.println(vi);
            System.out.print("Segur?> ");
            String resposta = Entrada.readLine();
            if (!UtilitatsConfirmacio.respostaABoolean(resposta)) {
                System.out.println("No eliminat");
                return;
            }
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
