/*Programa que consisteix en un lloro que recorda totes les entrades que li passem, i quan li posem l'entrada buida, ens recita tot lo recordat*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Recordat {

	public static void main(String[] args) throws IOException {
        String cami = "records.txt";
        processaEntrada(cami);
        System.out.println("D'acord");
        mostraRecords(cami);
    }

    /**
     * Demana frases per entrada estàndard i les guarda a un fitxer
     * @param nomFitxer: nom del fitxer
     */
    public static void processaEntrada(final String nomFitxer) throws IOException {
        // XXX: aquí la part d'escriure les memòries
        //      No oblidaràs tancar en sortir, oi?
        String linia = "lloro";
    	BufferedWriter sortida = new BufferedWriter(new FileWriter(nomFitxer));
        while (linia.isBlank()==false){
        	System.out.println("El lloro pregunta paraula:");
		    linia = Entrada.readLine();
		    if(linia.isBlank()){
        		System.out.println("D'acord");
        		break;
        	}
        	linia = linia.trim();
		    System.out.println("El lloro registra: " + linia);
		    sortida.write(linia);
		    sortida.newLine();
        }
        sortida.close();
        
    }

    /**
     * Mostra el contingut del fitxer amb nom nomFitxer
     * @param nomFitxer: el nom del fitxer del que es mostrarà el contingut
     */
    public static void mostraRecords(final String nomFitxer) throws IOException {
        // XXX: aquí la part de recordar les memòries escrites
        FileReader fileReader = new FileReader(nomFitxer);
        BufferedReader input = new BufferedReader(fileReader);
        int contador = 0;
        
        while(true){
        	String linia2 = input.readLine();
        	if(null == linia2){
        		if (contador == 0){
        			System.out.println("El lloro no recorda res");
        		}
        		System.out.println("Adéu");
        		break;
        	}
        	if (linia2.isBlank()==false){
        		System.out.print("El lloro recorda: ");
        		System.out.println(linia2);
        		contador ++;
        	}
        }
        input.close();
    }
}

/*

    public static void main(String[] args) throws IOException {
    	String cami = "records.txt";
    	String linia = "lloro";
    	BufferedWriter sortida = new BufferedWriter(new FileWriter(cami));
        while (linia.isBlank()==false){
        	System.out.println("El lloro pregunta paraula:");
		    linia = Entrada.readLine();
		    if(linia.isBlank()){
        		System.out.println("D'acord");
        		break;
        	}
        	linia = linia.trim();
		    System.out.println("El lloro registra: " + linia);
		    sortida.write(linia);
		    sortida.newLine();
        }
        sortida.close();
        
        String camiTornada = "records.txt";
        FileReader fileReader = new FileReader(camiTornada);
        BufferedReader input = new BufferedReader(fileReader);
        int contador = 0;
        
        while(true){
        	String linia2 = input.readLine();
        	if(null == linia2){
        		if (contador == 0){
        			System.out.println("El lloro no recorda res");
        		}
        		System.out.println("Adéu");
        		break;
        	}
        	if (linia2.isBlank()==false){
        		System.out.print("El lloro recorda: ");
        		System.out.println(linia2);
        		contador ++;
        	}
        }
        input.close();
    }
}
*/





