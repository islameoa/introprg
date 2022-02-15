/*Programa que ens permet jugar al joc del penjat*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Penjat{
	public static void main(String[] args) throws IOException{
		boolean hiHaParaules = true;
		int contador = 0;
		
		String fitxer = "paraules.txt";
		FileReader fileReader = new FileReader(fitxer);
		BufferedReader input = new BufferedReader(fileReader);
		
		while(hiHaParaules){
			String paraulaSys = input.readLine();
        	if (null == paraulaSys){
        		if (contador==0){
        			System.out.println("No tinc paraules per jugar");
        		} else {
        		System.out.println("No queden més paraules");
        		}
        		break;
        	}
        	boolean noEncertada = true;
        	char [] paraulaU = new char[paraulaSys.length()];
        	while(noEncertada){
        		String lletresUsades = "";
		    	System.out.println("Introdueix una lletra");
		    	String lletraActual = Entrada.readLine();
		    	lletresUsades += lletraActual;
		    	lletresUsades = lletresUsades.toUpperCase();
		    	char lletraActualC = lletraActual.charAt(0);
		    	
		    	for (int i=0; i<paraulaSys.length(); i++){
					if (lletraActualC == paraulaSys.charAt(i)){
						paraulaU[i] = Character.toLowerCase(lletraActualC);
					} else if (noEncertada){
						for(int j=0; j<lletresUsades.length(); j++){
							if (lletresUsades.charAt(j) == paraulaSys.charAt(i)){
								paraulaU[i] = lletresUsades.charAt(j);
							}
						}
					} else {
						paraulaU[i] = '*';
					}
		    	}
		    	mostraParaula(paraulaU);
        	}
        }
	}
	
	public static void mostraParaula(char[] paraula){
		for (int i=0; i<paraula.length; i++){
			System.out.print(paraula[i]);
		}
		System.out.println("");
	}
}









