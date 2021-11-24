/*Programa que rep un string i en retorna només les lletres separades per comes*/

public class NomesLletres {
    public static void main(String args[]){
    
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        for (int x = 0; x < text.length(); x++){
            char c = text.charAt(x);
            
            if ((x == text.length()-1) || (Character.isLetter(c))){
                System.out.print(c);
            }
            if (Character.isLetter(c)){
                System.out.print(c + ", ");
            }
        }
    }
}
