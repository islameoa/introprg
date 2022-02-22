/*Programa que ens permet jugar al joc del penjat */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class Penjat{
	public static void main(String[] args) throws IOException{
		String fitxer = "paraules.txt";
		FileReader fileReader = new FileReader(fitxer);
		BufferedReader input = new BufferedReader(fileReader);
		
		System.out.println("Comencem a jugar");
		
		boolean paraules = true;
		
		while(paraules){
			boolean confirmacio = false;
			boolean noEncertada = true;
			int intents = 10;
			String paraulaSys = input.readLine();
			String lletresUsades = "";
        	if (null == paraulaSys){
        		if (contador==0){
        			System.out.println("No tinc paraules per jugar");
        		} else {
        		System.out.println("No queden més paraules");
        		}
        		paraules = false;
        	}
        	if(paraules){
        		char [] paraulaU = new char[paraulaSys.length()];
				for (int x =0; x<paraulaSys.length(); x++){
					paraulaU[x]='*';
				}
        		String lletraActual = Entrada.readLine();
        		while(!confirmacio && intents>0 && noEncertada){
        			if (lletraActual.equals("prou")){
						System.out.println("Vols sortir?");
						String resposta = Entrada.readLine();
						confirmacio = UtilitatsConfirmacio.respostaABoolean(resposta);
						paraules = false;
					} else if (lletraActual.equals("glups")){
						confirmacio = true;
					} else if (lletraActual.charAt(0)<65 || lletraActual.charAt(0)>123 || lletraActual.length()>1){
						System.out.println("Error: cal una lletra entre 'a' i 'z', 'prou' o 'glups'");
					} else {
						
						if (contador==0){
							lletresUsades = lletraActual;
						} else {
							lletresUsades += lletraActual;
						}
						lletresUsades = lletresUsades.toUpperCase();
						char lletraActualC = lletraActual.charAt(0);
						
						for(int y=0; y<paraulaSys.length(); y++){
							if (lletresUsades.contains(lletraActual)){
								
							}
						}
					}
        		}
        	}
		}
	}
}















public class Penjat{
	public static void main(String[] args) throws IOException{
		boolean hiHaParaules = true;
		boolean confirmacio = false;
		int contador = 0;
		
		String fitxer = "paraules.txt";
		FileReader fileReader = new FileReader(fitxer);
		BufferedReader input = new BufferedReader(fileReader);
		
		System.out.println("Comencem a jugar");
		
		while(hiHaParaules || !confirmacio){
			if (confirmacio){
				break;
			}			
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
        	boolean lletraRepetida = true;
        	char [] paraulaU = new char[paraulaSys.length()];
        	int intentsDisponibles = 10;
        	boolean lletraFallada;
        	
        	for (int x =0; x<paraulaSys.length(); x++){
        		paraulaU[x]='*';
        	}
        	
			String lletresUsades = "";
        	while(noEncertada || confirmacio || intentsDisponibles>0){
        		
		    	System.out.println("Introdueix una lletra");
		    	String lletraActual = Entrada.readLine();
		    	if (lletraActual.equals("prou")){
		    		System.out.println("Vols sortir?");
		    		String resposta = Entrada.readLine();
		    		confirmacio = UtilitatsConfirmacio.respostaABoolean(resposta);
		    		if (confirmacio){
		    			noEncertada = false;
		    			intentsDisponibles = -1;
		    		}
		    	} else if (lletraActual.equals("glups")){
		    		noEncertada = false;
		    		confirmacio = false;
		    		intentsDisponibles = -1;
		    	} else if (lletraActual.charAt(0)<65 || lletraActual.charAt(0)>123 || lletraActual.length()>1){
		    		System.out.println("Error: cal una lletra entre 'a' i 'z', 'prou' o 'glups'");
		    	} else {
		    	lletraRepetida = lletraRepetida(lletraActual.charAt(0), lletresUsades);
		    	if (!lletraRepetida){
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
					
					noEncertada = paraulaEncertada(paraulaU, paraulaSys);
					if(!noEncertada){
						System.out.println("Has encertat! La paraula era " + paraulaSys);
					} else {
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
						String paraulaUString = "";
						for (int i=0; i<paraulaU.length; i++){
							paraulaUString += paraulaU[i];
						}
						lletraFallada = paraulaUString.contains(lletraActual);
						if (intentsDisponibles<10 && !lletraFallada){
							mostraFigura(intentsDisponibles);
						}
						intentsDisponibles--;
						if (intentsDisponibles == 0){
							noEncertada = false;
		    				confirmacio = false;
						}
					}
					//lletraRepetida = true;
		    	}
        	}
        }
	}
	input.close();
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
	public static void mostraFigura(int intentsDisponibles) throws IOException{
		int intentos=0;
		if (intentsDisponibles == 8){
			intentos = 1;
		}
		if (intentsDisponibles == 7){
			intentos = 2;
		}
		if (intentsDisponibles == 6){
			intentos = 3;
		}
		if (intentsDisponibles == 5){
			intentos = 4;
		}
		if (intentsDisponibles == 4){
			intentos = 5;
		}
		if (intentsDisponibles == 3){
			intentos = 6;
		}
		if (intentsDisponibles == 2){
			intentos = 7;
		}
		if (intentsDisponibles == 1){
			intentos = 8;
		}
		if (intentsDisponibles == 0){
			intentos = 9;
		}
		FileReader fileReader = new FileReader("./recursos/figura"+intentos+".txt");
        BufferedReader input = new BufferedReader(fileReader);
                
        while(true){
        	String linia = input.readLine();
        	if(null == linia){
        		break;
        	}
        	System.out.println(linia);
        }
        input.close();
	}
	public static boolean lletraRepetida(char lletraActual, String lletresUsades){
		for(int j=0; j<lletresUsades.length(); j++){
			if (lletresUsades.charAt(j) == lletraActual){
				return true;
			}
		}
		return false;
	}
}









