/*Programa que donat un parametre busca si aquest paramatre, que ha de ser un string, està al nom o al correu dels alumnes que estàn al fitxer alumnes.csv i en retorna la informació dels alumnes imprimida de forma ordenada*/

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class CercaAlumnes {

    static class Alumne {
        String nom;
        String email;
        int edat;
        boolean esOient;
        int[] notes;
    }

    public static Alumne construeixAlumne(String nom, String email,
                                          int edat, boolean esOient,
                                          int[] notes) {
        Alumne alumne = new Alumne();
        alumne.nom = nom;
        alumne.email = email;
        alumne.edat = edat;
        alumne.esOient = esOient;
        alumne.notes = notes;
        return alumne;
    }

    public static void mostraAlumne(Alumne alumne) {
        System.out.println("Alumne: " + alumne.nom);
        System.out.println("- email: " + alumne.email);
        System.out.println("- edat: " + alumne.edat);
        System.out.println("- és oïent: " + (alumne.esOient?"Sí":"No"));
        System.out.println("- notes: " + notesACsv(alumne.notes));
    }

    public static String alumneAString(Alumne alumne) {
        return String.format(
                "Alumne(nom: \"%s\", email: \"%s\", " +
                "edat: %d, esOient: %b, notes: {%s})",
                alumne.nom, alumne.email, alumne.edat, alumne.esOient,
                notesACsv(alumne.notes));
    }

    // converteix un array de notes a CSV
    // Té en comptes els valors NP com a -1
    public static String notesACsv(int[] notes) {
        String notesS = "";
        for (int i=0; i<notes.length; i++){
        	String nota = String.valueOf(notes[i]);
        	if (nota.equals("NP")){
        		notesS+="-1";
        	} else {
        		notesS += nota;
        	}
        	notesS += ", ";
        }
        return notesS;
    }

    //public static String alumneACsv(Alumne alumne) {
        // XXX a completar encara que no es fa servir en aquest programa
    //}

    public static Alumne csvAAlumne(String csv) {
    	Alumne alumne = new Alumne();
    	
        String[] part = csv.split(",");
        alumne.nom = part[0];
        alumne.email = part[1];
        alumne.edat = Integer.parseInt(part[2]);
		alumne.esOient = Boolean.parseBoolean(part[3]);
		alumne.notes[0] = Integer.parseInt(part[4]);
		alumne.notes[1] = Integer.parseInt(part[5]);
		alumne.notes[2] = Integer.parseInt(part[6]);  
		alumne.notes[3] = Integer.parseInt(part[7]);
		alumne.notes[4] = Integer.parseInt(part[8]);
		alumne.notes[5] = Integer.parseInt(part[9]);
		
		return alumne;
    }

    public static void main(String[] args) throws IOException {
        // assegura que hi ha el criteri de cerca
        if (args.length<1){
        	System.out.println("Error: indica el criteri de cerca");
        } else {
        	// declaracions, inicialitzacions, apertura de fitxer, ignora línia de capçaleres, etc.
        	//String cami = "alumnes.csv";
		    BufferedReader input = new BufferedReader(new FileReader("alumnes.csv"));
			String linia = input.readLine();
			Alumne alumne = new Alumne();
			
		    while (true) {
		        // llegeix entrada i finalitza bucle si no en queden més
		        linia = input.readLine();
				if (null == linia) break;
		        // converteix l'entrada a Alumne
		        alumne = csvAAlumne(linia);

		        // comprova si el criteri de cerca es troba dins del nom o
		        // el email. Si és així, mostra'l
		        if (linia.contains(args[0])){
		        	mostraAlumne(alumne);
		        }
		    }
		    // consideracions finals com ara el tancament del fitxer
		    input.close();
        }
    }
}




