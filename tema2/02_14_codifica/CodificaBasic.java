/*Programa que rep un text i en codifica les minúscules cambiant-les 
per la nostra elecció */

public class CodificaBasic {
    public static void main(String args[]){
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        System.out.println("Quants?");
        int quants = Integer.parseInt(Entrada.readLine());
        
        if (quants < 0){
        	System.out.println("No s'accepten números negatius");
        } else {
        	codifica(text, quants);
        }
    }
    
    public static void codifica(String text, int quants){
    	for (int x=0; x<text.length(); x++){
            int lletra = text.charAt(x);
           
            if ((lletra>=97)&&(lletra<=122)){
                lletra = lletra + quants;
            	if (lletra>122){
            		lletra = lletra - 26;
            	}
            	System.out.print((char)lletra);
            	
            } else {
                System.out.print((char)lletra);
            }
        }
        System.out.println("");
      
    }
}
