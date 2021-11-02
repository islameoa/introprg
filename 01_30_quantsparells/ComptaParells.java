/* Programa que demana enters positius i quan es posa un negatiu mostra el
número de parells que s'han introduit*/

public class ComptaParells {
    public static void main (String[] args){
        
        int acumulador = 0;
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        
        while (valor >= 0){
            if (valor % 2 == 0){
                acumulador ++;
            }
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
        }
        
        System.out.println("Valors parells introduïts: " + acumulador);
    }
}
