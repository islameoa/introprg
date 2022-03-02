/*Programa que calcula la nota mitja dels alumnes que estan al fitxer notes.csv, el programa:

	- ignorarà la primera línia doncs correspon a les capçaleres

	- Per cada estudiant mirarà quines notes té i, si són numèriques sumarà els seus valors enters. El resultat el dividirà per 6, per 		  obtenir la mitja.

	- Un cop disposa de la mitja, el programa llistarà els noms seguits de la nota entre parèntesis i amb dos decimals */
	
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NotaMitja{
	public static void main(String[] args) throws IOException{
	
		boolean buit = true;
		
		String fitxer = "notes.csv";
		FileReader fileReader = new FileReader(fitxer);
        BufferedReader input = new BufferedReader(fileReader);
        
        String liniaBuida = input.readLine();
        while(true){
        	
        	float notaTotal = 0;
			float notaMitja = 0;
			
        	String linia = input.readLine();
        	
        	if (null == linia) break;
        	buit = false;
        	
        	String[] elements = linia.split(",");
            
            for (int i=0; i<elements.length; i++) {
                if (UtilString.esEnter(elements[i])){
                	notaTotal+=Integer.parseInt(elements[i]);
                }
            }
            notaMitja = notaTotal/6;
            
           	System.out.print(elements[0]);
           	System.out.println(String.format(" (%.2f)", notaMitja));
        }
        if (buit == true) System.out.println("Cap entrada");
        input.close();
	}
}









