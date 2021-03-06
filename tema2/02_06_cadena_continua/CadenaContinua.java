/*Programa que rep un string i un nombre i en repeteix els caracters que te 
tantes vegades com el nombre indica*/

public class CadenaContinua{
    public static void main(String args[]){
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        if (text.isBlank()){
            System.out.println("error");
        } else {
            System.out.println("Nombre?");
            int num = Integer.parseInt(Entrada.readLine());
            mostraCadenaContinua(text, num);
        }
    }
    
    public static void mostraCadenaContinua(String text, int longitud){
        for (int x=0; x<longitud; x++){
                if (x>=text.length()){
                    int pos = x-text.length();
                    while (pos>=text.length()){
                        pos = pos-text.length();
                    }
                    System.out.print(text.charAt(pos));
                } else {
                    System.out.print(text.charAt(x));
                }
            }
        }
    }
