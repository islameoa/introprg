/*Programa que rep un string i el retorna amb tots els caracters entre 
parentesis*/

public class Parentitza {
    public static void main(String args[]){
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        for (int x=0; x<text.length(); x++){
            if (text.charAt(x) == ' '){
            System.out.print(" ");
            } else if (text.charAt(x) == '.') {
                System.out.print(" ");
            } else {
                System.out.print("(" + text.charAt(x) + ")");
            }
        }
    }
}
