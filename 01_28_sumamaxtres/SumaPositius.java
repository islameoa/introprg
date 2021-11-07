/*Programa que demana enters i els suma mentre no posis un número negatiu*/

public class SumaPositius {
    public static void main(String[] args) {

        // creem la variable on guardarem el resultat de sumar
        int suma = 0;   // inicialment no hem sumat res i per tant és 0

        int valor = 0;

        while (valor >= 0) {
            
            System.out.println("Introdueix un altre valor o negatiu per acabar");
            valor = Integer.parseInt(Entrada.readLine());
            if (valor >= 0){
                suma = suma + valor;
            }
        }

        // mostrem el resultat
        System.out.println("La suma és " + suma);
    }
}
