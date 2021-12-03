/*Programa que rep un text i en codifica les minúscules cambiant-les 
per la nostra elecció */

public class CodificaBasic {
    public static void main(String args[]){
        System.out.println("Text?");
        
        String text = Entrada.readLine();
        
        for (int x=0; x<text.length(); x++){
            int lletra = text.charAt(x);
            
            if ((lletra>=97)&&(lletra<=121)){
                lletra = lletra+1;
                char lletraConvertida = (char)lletra;
                System.out.print(lletraConvertida);
            } else if (lletra==122){
                System.out.print('a');
            } else {
                char lletraConvertida = (char)lletra;
                System.out.print(lletraConvertida);
            }
        }
        System.out.println("");
    }
}
