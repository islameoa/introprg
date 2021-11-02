/* Programa que repeteix els strings que introdueix els missatges que escriu
l'usuari al terminal */

public class Lloro {
    public static void main (String [] args){
    
        String frase;        
        System.out.println("El lloro espera paraula: ");
        frase = Entrada.readLine();
        
        while ((frase.isBlank()==false) && (frase.isEmpty()==false)){
            System.out.println("El lloro repeteix: " + frase);
            System.out.println("El lloro espera paraula: ");
            frase = Entrada.readLine(); 
        }
        
        System.out.println("Adéu");
    }
}
