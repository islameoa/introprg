/*Programa que ens permet jugar al joc del penjat*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Penjat{
	public static void main(String[] args) throws IOException{
		boolean hiHaParaules = true;
		boolean confirmacio = false;
		int contador = 0;
		
		String fitxer = "paraules.txt";
		FileReader fileReader = new FileReader(fitxer);
		BufferedReader input = new BufferedReader(fileReader);
		
		System.out.println("Comencem a jugar");
		
		while(hiHaParaules || confirmacio){
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
        	while(noEncertada || confirmacio){
        		
		    	System.out.println("Introdueix una lletra");
		    	String lletraActual = Entrada.readLine();
		    	if (lletraActual.equals("prou")){
		    		System.out.println("Vols sortir?");
		    		String resposta = Entrada.readLine();
		    		confirmacio = UtilitatsConfirmacio.respostaABoolean(resposta);
		    	} else if (lletraActual.equals("glups")){
		    		noEncertada = false;
		    	} else if (lletraActual.charAt(0)<65 || lletraActual.charAt(0)>123){
		    		System.out.println("Error: cal una lletra entre 'a' i 'z', 'prou' o 'glups'");
		    	} else {
		    		if (contador==0){
						lletresUsades = lletraActual;
					} else {
						lletresUsades += lletraActual;
					}
					lletresUsades = lletresUsades.toUpperCase();
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
					System.out.print("Intents disponibles: ");
					noEncertada = paraulaEncertada(paraulaU, paraulaSys);
		    	}
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
	public static void mostraFigura(int intentsDisponibles){
		
	}
}









