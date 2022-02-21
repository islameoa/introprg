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
		
		System.out.println("Comencem a jugar");
		
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
        	for (int x =0; x<paraulaSys.length(); x++){
        		paraulaU[x]='*';
        	}
        	
			String lletresUsades = "";
        	while(noEncertada){
        		
		    	System.out.println("Introdueix una lletra");
		    	String lletraActual = Entrada.readLine();
		    	if (contador==0){
		    		lletresUsades = lletraActual;
		    		lletresUsades = lletresUsades.toUpperCase();
		    	} else {
		    		lletresUsades += lletraActual;
		    		lletresUsades = lletresUsades.toUpperCase();
		    	}
		    	contador++;
		    	char lletraActualC = lletraActual.charAt(0);
		    	
		    	for (int i=0; i<paraulaSys.length(); i++){
					if (lletraActualC == paraulaSys.charAt(i)){
						paraulaU[i] = Character.toLowerCase(lletraActualC);
					} else {
						for(int j=0; j<lletresUsades.length(); j++){
							if (lletresUsades.charAt(j) == paraulaSys.charAt(i)){
								paraulaU[i] = lletresUsades.charAt(j);
							}
						}
					}
		    	}
		    	System.out.print("Paraula: ");
		    	mostraParaula(paraulaU);
		    	System.out.print("Utilitzades: ");
		    	
		    	if (lletresUsades.length()==0){
		    		System.out.print("cap");
		    	} else {
		    		for (int u=0; u<lletresUsades.length(); u++){
		    			
		    			System.out.print(lletresUsades.charAt(u));
		    			if (u==lletresUsades.length()-2){
		    				System.out.print(" i ");
		    			} else if (u<lletresUsades.length()-2){
		    				System.out.print(", ");
		    			}
		    		}
		    	}
		    	System.out.println("");
		    	noEncertada = paraulaEncertada(paraulaU, paraulaSys);
        	}
        }
	}
	
	public static void mostraParaula(char[] paraula){
		for (int i=0; i<paraula.length; i++){
			System.out.print(paraula[i]);
		}
		System.out.println("");
	}
	
	public static boolean paraulaEncertada(char[] paraula, String paraulaSys){
		String compare = "";
		for (int i=0; i<paraula.length; i++){
			compare += paraula[i];
		}
		if (compare.equals(paraulaSys)){
			return false;
		}
		return true;
	}
}









