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
		int contador = 0;
		
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
				System.out.println("Introdueix una lletra");
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
						boolean repetida = false;
						if (contador==0){
							lletresUsades = lletraActual;
						}
						contador++;
						lletresUsades = lletresUsades.toUpperCase();
						lletraActual = lletraActual.toUpperCase();
						
						if (lletresUsades.contains(lletraActual)){
							repetida = true;
						}
						
						if (repetida){
							intents--;
							mostraFigura(intents);
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
							System.out.print("Intents disponibles: " + intents);
							System.out.println("");
						} else {
							boolean lletraCorrecta = false;
							char lletraActualC = Character.toLowerCase(lletraActual.charAt(0));							
							lletresUsades += lletraActual;
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
							} else {
								if (lletraCorrecta){
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
									System.out.print("Intents disponibles: " + intents);
									System.out.println("");
								} else {
									intents--;
									mostraFigura(intents);
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
									System.out.print("Intents disponibles: " + intents);
									System.out.println("");
								}
							}
						}
					}
					if (!noEncertada){
						lletraActual = Entrada.readLine();
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









