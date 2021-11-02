/* Programa que suma les notes que introdueix l'usuari mentre els valors
introduïts estiguin entre 0 i 100. */

public class SumaNotes {
    public static void main(String [] args){
        
        System.out.println("Introdueix una nota");
        int nota = Integer.parseInt(Entrada.readLine());
        int suma = 0;
        
        while ((nota > 0) && (nota < 100)){
            suma = nota + suma;
            System.out.println("Introdueix una nota entre 0 i 100: ");
            nota = Integer.parseInt(Entrada.readLine());
        }
        
        System.out.println("La suma de les notes vàlides és " + suma);
    }
}
