/*Programa que rep 3 parametres: un fitxer a traduir, un fitxer amb les claus i les paraules per les que s'han de canviar i un fitxer on s'emmagatzemarà el canvi*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Traduccio{
	public static void main(String[] args) throws IOException{
		if (args.length<3){
			System.out.println("ERROR: Cal especificar els fitxers origen, traduccio i destinació");
		} else {
			String fitxerOrigen = args[0];
			String fitxerTraduccio = args[1];
			String fitxerDesti = args[2];
			
			tradueix(fitxerOrigen, fitxerTraduccio, fitxerDesti);
		}
	}
	
	public static void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) throws IOException{
		String linia = "hh";
		BufferedWriter sortida = new BufferedWriter(new FileWriter(fitxerDestinacio));
		
		FileReader fileReader = new FileReader(fitxerOrigen);
        BufferedReader input = new BufferedReader(fileReader);
        
        while(true){
        	linia = input.readLine();
        	if(null == linia){
        		break;
        	}
        	if (linia.isBlank()==false){
        		String liniaTraduida = tradueixLinia(linia, fitxerTraduccio);
        		sortida.write(liniaTraduida);
		    	sortida.newLine();
        	}
        }
        sortida.close();
        input.close();
	}
	
	public static String tradueixLinia(String linia, String fitxerTraduccio) throws IOException{
		FileReader fileReader = new FileReader(fitxerTraduccio);
        BufferedReader input = new BufferedReader(fileReader);
        String liniaT = "hh";
        
        while(true){
        	String traduccio = input.readLine();
        	if(null == traduccio){
        		break;
        	} else {
        		String[] parts = traduccio.split(", ");
				String part1 = parts[0];
				String part2 = parts[1];
				if (linia.contains(part1)){
        			liniaT = linia.replaceAll(part1, part2);
        			linia = liniaT;
        		}
        	}
        }
        return liniaT;
	}
	
	/*public static esborraRepetits(String fitxerTraduccio){
		String linia = "rep";
    	BufferedWriter sortida = new BufferedWriter(new FileWriter(fitxerTraduccio));
        
        while (linia.isBlank()==false){
        	
		    linia = input.readLine();
		    String[] parts = traduccio.split(", ");
			String part1 = parts[0];
			String part2 = parts[1];
		    sortida.write(linia);
		    sortida.newLine();
        }
        sortida.close();
    }*/
}


