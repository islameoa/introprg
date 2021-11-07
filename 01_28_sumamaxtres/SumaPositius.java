/*Programa que demana enters i els suma mentre no posis un número negatiu*/

public class SumaPositius {
    public static void main(String[] args) {

        // creem la variable on guardarem el resultat de sumar
        int suma = 0;   // inicialment no hem sumat res i per tant és 0

        int valor;
        System.out.println("Introdueix el primer valor");
        valor = Integer.parseInt(Entrada.readLine());
        if (valor >= 0){
            suma += valor;
            System.out.println("Introdueix el segon valor");
            valor = Integer.parseInt(Entrada.readLine());
            if (valor >= 0){
                suma += valor;
                System.out.println("Introdueix el tercer valor");
                valor = Integer.parseInt(Entrada.readLine());
                suma += valor;
                System.out.println("La suma és " + suma);
            } else {
               System.out.println("La suma és " + suma); 
            }
        } else {
            System.out.println("La suma és " + suma);
        }
    }
}
