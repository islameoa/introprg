/*Programa que rep un string i en retorna només les lletres separades per comes*/

public class NomesLletres {
    public static void main(String args[]){
    
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        for (int x = 0; x < text.length(); x++){
            char c = text.charAt(x);
            
            if (Character.isLetter(c)){
                if (x == text.length()-1){
                    System.out.print(c);
                } else {
                    System.out.print(c + ", ");
                }
            }
        }
    }
}
