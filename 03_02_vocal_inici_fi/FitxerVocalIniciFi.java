/*Programa que repeteix qualsevol paraula que comenci o acabi en vocal d'un fitxer de text*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FitxerVocalIniciFi{
	public static void main(String args[]) throws IOException{
	
		String cami = "frases.txt";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        while (true) {
            String linia = input.readLine();
            if (null == linia) break;
            boolean vocal = UtilString.esVocal(linia.charAt(0));
			boolean vocalfi = UtilString.esVocal(linia.charAt(linia.length()-1));
			
			if (vocal || vocalfi == true){
				System.out.println(linia);
			}
        }
        input.close();
	}
}
