/*Programa que ens permet jugar al joc del penjat */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;


public class Penjat{
	public static void main(String[] args) throws IOException{
		String fitxer = "paraules.txt";
		FileReader fileReader = new FileReader(fitxer);
		BufferedReader input = new BufferedReader(fileReader);
		
		File fitxerr = new File("paraules.txt");
		boolean paraules = isFileEmpty(fitxerr);
		boolean imp = true;
		
		if (!paraules){
			System.out.println("No tinc paraules per jugar");
			imp = false;
		} else {
			System.out.println("Comencem a jugar");
		}
		int contador = 0;
		int pJugades = 0;
		int pEncertades = 0;
		int pFallades = 0;
		int pCancelades = 0;
		
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
        	contador++;
        	if(paraules){
        		pJugades++;
        		char [] paraulaU = new char[paraulaSys.length()];
				for (int x =0; x<paraulaSys.length(); x++){
					paraulaU[x]='*';
				}
        		while(!confirmacio && intents>0 && noEncertada){
        			
        			System.out.print("Paraula: ");
					mostraParaula(paraulaU);
					System.out.print("Utilitzades: ");
					String lletraActual = ("");
					
					lletresUsades = lletresUsades.toUpperCase();
					
					
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
					System.out.print("Intents disponibles: " + intents);
					System.out.println("");
					System.out.println("Introdueix una lletra");
        			lletraActual = Entrada.readLine();
        			lletraActual = lletraActual.toUpperCase();
        			
        			if (lletraActual.equals("PROU")){
						System.out.println("Vols finalitzar?");
						String resposta = Entrada.readLine();
						confirmacio = UtilitatsConfirmacio.respostaABoolean(resposta);
						if (confirmacio) pCancelades++;
						paraules = false;
					} else if (lletraActual.equals("GLUPS")){
						pCancelades++;
						confirmacio = true;
					} else if (lletraActual.charAt(0)<65 || lletraActual.charAt(0)>123 || lletraActual.length()>1 || lletraActual.isBlank()){
						System.out.println("Error: cal una lletra entre 'a' i 'z', 'prou' o 'glups'");
					} else {
						boolean repetida = false; 
						
						if (lletresUsades.contains(lletraActual)){
							repetida = true;
						}
						if (repetida){
							System.out.println("La lletra ja ha estat utilitzada");
						} else {
							
							lletresUsades += lletraActual;
							
							boolean lletraCorrecta = false;
							char lletraActualC = Character.toLowerCase(lletraActual.charAt(0));							
							
							for (int i=0; i<paraulaSys.length(); i++){
								if (lletraActualC == paraulaSys.charAt(i)){
									paraulaU[i] = Character.toLowerCase(lletraActualC);
									lletraCorrecta = true;
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
								pEncertades++;
							} else {
								if (!lletraCorrecta){
									intents--;
									mostraFigura(intents);
								}
							}
						}
					}
        		}
        		if (intents==0){
        			System.out.println("Has mort");
        			pFallades++;
        		}
        	}
		}
		if (imp){
			System.out.println("Paraules jugades: " + pJugades);
			System.out.println("Paraules encertades: " + pEncertades);
			System.out.println("Paraules fallades: " + pFallades);
			System.out.println("Paraules cancel·lades: " + pCancelades);
			System.out.println("Espero que t'hagis divertit");
		}
		input.close();
	}
	public static boolean isFileEmpty(File file) {
		return file.length() != 0;
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









