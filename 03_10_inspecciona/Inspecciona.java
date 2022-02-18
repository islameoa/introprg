/*Programa que per cada argument, comprovarà si correspon a un camí existent, si no existeix, indicarà "No trobat".
En cas que existeixi, indicarà els seus permisos per l’usuari en el format típic de GNU (rwx). A continuació, indicarà si correspon a un
fitxer o un directori. Si és un fitxer farà una cosa i si és un directori farà una altra*/

import java.io.File;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Inspecciona{
	public static void main(String[] args) throws IOException{
		if (args.length<0){
			return;
		} else {
			for (int i=0; i<args.length; i++){
				String cami = args[i];
				File fitxer = new File(cami);
				String info = "Processant argument: " + cami;
				System.out.println(info);
				for (int x=0; x<info.length(); x++){
					System.out.print("=");
				}
				System.out.println("");
				System.out.println("");
		    	if (! fitxer.exists()) {
				    System.out.println("No trobat");
				    //break;
				} else {
					if(fitxer.canRead()){
						System.out.print("r");
					} else {
						System.out.print("-");
					}
					if(fitxer.canWrite()){
						System.out.print("w");
					} else {
						System.out.print("-");
					}
					if(fitxer.canExecute()){
						System.out.print("x ");	
					} else {
						System.out.print("- ");
					}
					if (fitxer.isDirectory()){
						System.out.print("directori que conté: ");
						Llista(fitxer);
						System.out.println("");
					}
					if (fitxer.isFile()){
						if (fitxer.length()<1){
							System.out.println("fitxer buit");
						} else {
							System.out.print("fitxer de mida en bytes: ");
							System.out.print(fitxer.length());
							System.out.println("");
							System.out.println("Amb els continguts:");
							FileReader fileReader = new FileReader(fitxer);
		    				BufferedReader input = new BufferedReader(fileReader);
							while (true) {
								String linia = input.readLine();
								if (null == linia) break;
								System.out.println("|" + linia + "|");
							}
							input.close();
						}
						System.out.println("");
					}
				}
			}
		}
		
	}
	
	
    public static void Llista(File fitxer) {
        String[] continguts = fitxer.list();
        Arrays.sort(continguts);
        for (String item: continguts) {
            System.out.print(item + ", " );
        }
    }
}
