/*Programa que rebrà un fitxer ple de matrñicules i en generarà dos amb les correctes i les incorrectes*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class TriaMatricules{
	public static void main(String[] args) throws IOException{
		String cami = "matriculesllegides.txt";
		String tornada1 = "matriculesvalides.txt";
		String tornada2 = "matriculeserronies.txt";
		
		FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        BufferedWriter sortida1 = new BufferedWriter(new FileWriter(tornada1));
        BufferedWriter sortida2 = new BufferedWriter(new FileWriter(tornada2));
        
        while (true){
        	String matricula = input.readLine();
        	if (matricula == null){
        		break;
        	} else {
        		boolean valida = matriculaItalianaValida(matricula);
		    	if (valida){
		    		sortida1.write(matricula);
		    		sortida1.newLine();
		    	} else {
		    		sortida2.write(matricula);
		    		sortida2.newLine();
		    	}
        	}
        }
        input.close();
        sortida1.close();
        sortida2.close();        
	}
	
	public static boolean matriculaItalianaValida(String matricula){
		boolean valida = true;
        
        if (matricula.isBlank()){
            valida = false;
        } else {
            if ((matricula.length()>7)||(matricula.length()<7)){
                valida = false;
            } else {
            	for (int i=0; i<matricula.length(); i++){
            		char lletra = matricula.charAt(i);
            		if (i==2 || i==3 || i==4){
            			if ((lletra<48) || (lletra>57)){
        				valida = false;
        				}	
            		} else {	
                		valida = esLletraValidaPerMatriculaItaliana(lletra);
            		}
            		if (!valida){
            			break;
            		}
            	}
            }
    	}
    	return valida;
	}
	
	public static boolean esLletraValidaPerMatriculaItaliana(char lletra){
    	boolean valida = true;
        String invalid = "IOQU";
        
        if ((lletra<64) || (lletra>90)){
        	valida = false;
        }
        for (int y=0; y<4; y++){
        	if (lletra == invalid.charAt(y)){
                    valida = false;
                }
        }
        return valida;
    }
}
