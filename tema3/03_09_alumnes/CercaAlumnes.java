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
        	if (notes[i]<0){
        		notesS += "NP";
        	} else {
        		notesS += nota;
        	}
        	if (i==notes.length-1){
        		return notesS;
        	}
        	notesS += ",";
        }
        return notesS;
    }

    public static String alumneACsv(Alumne alumne) {
    	String nom = alumne.nom;
    	String email = alumne.email;
    	int edat = alumne.edat;
    	boolean esOient = alumne.esOient;
        String[] notesS = new String[6];
        for(int i=0; i<alumne.notes.length; i++){
            if(alumne.notes[i] == -1){
                notesS[i]="NP";
            } else{
                notesS[i]=String.valueOf(alumne.notes[i]);
            }
        }
    	
    	String edaTS = String.valueOf(edat);
        String nota1 = notesS[0];
    	String nota2 = notesS[1];
    	String nota3 = notesS[2];
    	String nota4 = notesS[3];
    	String nota5 = notesS[4];
    	String nota6 = notesS[5];
    	
    	String csv = (nom + "," + email + "," + edaTS + "," + esOient + "," + nota1 + "," + nota2 + ","+ nota3 + ","+ nota4 + "," + nota5 + "," + nota6);
    	
    	return csv;
    }

    public static Alumne csvAAlumne(String csv) {  	
        String[] part = csv.split(",");
        int edat = Integer.parseInt(part[2]);
		boolean esOient = Boolean.parseBoolean(part[3]);
		int[] notes = new int[6];
		for(int i=4; i < part.length; i++){
			try {
				notes[i-4] = Integer.parseInt(part[i]);
			} catch (Exception e){
				notes[i-4] = -1;	
			}
		}
		return construeixAlumne(part[0], part[1], edat, esOient, notes);
    }

    public static void main(String[] args) throws IOException {
    	int contador = 0;
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
		        	contador ++;
		        	mostraAlumne(alumne);
		        }
		    }
		    if (contador == 0){
		    	System.out.println("Cap alumne");
		    }
		    // consideracions finals com ara el tancament del fitxer
		    input.close();
        }
    }
}




