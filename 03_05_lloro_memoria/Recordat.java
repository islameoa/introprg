/*Programa que consisteix en un lloro que recorda totes les entrades que li passem, i quan li posem l'entrada buida, ens recita tot lo recordat*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Recordat {
    public static void main(String[] args) throws IOException {
    	String cami = "records.txt";
    	String linia = "lloro";
    	BufferedWriter sortida = new BufferedWriter(new FileWriter(cami));
        while (linia.isBlank()==false){
        	System.out.println("El lloro pregunta paraula:");
		    linia = Entrada.readLine();
		    System.out.println("El lloro registra: " + linia);
		    sortida.write(linia);
		    sortida.newLine();
        }
        sortida.close();
        System.out.println("D'acord");
        
        String camiTornada = "records.txt";
        FileReader fileReader = new FileReader(camiTornada);
        BufferedReader input = new BufferedReader(fileReader);
        while(true){
        	String linia2 = input.readLine();
        	if(null == linia2){
        		System.out.println("Adéu");
        		break;
        	}
        	if (linia2.isBlank()==false){
        		System.out.print("El lloro recorda: ");
        		System.out.println(linia2);
        	}
        }
        input.close();
    }
}






