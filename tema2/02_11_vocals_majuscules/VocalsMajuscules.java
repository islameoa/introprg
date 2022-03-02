/*Programa que rep un text i passa totes les lletres a minúscules menys
 les vocals que les deixa en majúscules*/

public class VocalsMajuscules {
    public static void main(String args[]){
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        
        if (text.isBlank()){
            System.out.print("");
        } else {
            majusculitzaVocals(text);
        }
    }
    
    public static void majusculitzaVocals(String text){
        String vocals ="aeiouAEIOU";
        boolean noVocal = true;
        
        for (int x = 0; x<text.length(); x++){
                char a = text.charAt(x);
                int i = 0;
              
                while ((noVocal) && (i<10)){
                    if (a == vocals.charAt(i)){
                        System.out.print(Character.toUpperCase(a));
                        noVocal = false;
                    }
                    i++;
                }
                
                if (noVocal == true){
                    System.out.print(Character.toLowerCase(a)); 
                }
                noVocal = true;         
            }
            System.out.println("");
    }
}
