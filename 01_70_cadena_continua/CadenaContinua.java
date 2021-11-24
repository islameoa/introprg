/*Programa que rep un string i un nombre i en repeteix els caracters que te 
tantes vegades com el nombre indica*/

public class CadenaContinua{
    public static void main(String args[]){
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println("Nombre?");
        
        
        if (text.isBlank()){
            System.out.println("error");
        } else {
            int num = Integer.parseInt(Entrada.readLine());
            for (int x=0; x<num; x++){
                if (x>=text.length()){
                    int pos = x-text.length();
                    System.out.print(text.charAt(pos));
                } else {
                    System.out.print(text.charAt(x));
                }
            }
        }
    }
}
