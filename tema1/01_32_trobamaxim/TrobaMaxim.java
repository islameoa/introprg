/* Programa que demana enters i quan s'escriu un negatiu mostra per pantalla
l'enter més gran dels introduïts*/

public class TrobaMaxim {
    public static void main (String[] args){
        
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        int max = 0;
        
        while (valor>=0){
            if (valor > max){
                max = valor;
            }
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
        }
        
        System.out.println("El màxim és " + max);
    }
}
