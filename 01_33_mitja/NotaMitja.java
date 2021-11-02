/* Programa que calcula la mitjana de les notes que introdueix l'usuari*/

public class NotaMitja {
    public static void main (String[] args){
        
        int nota = 0;
        int suma = 0;
        int comptador = 0;
        int mitja;
        
        System.out.println("Introdueix nota");
        nota = Integer.parseInt(Entrada.readLine());
        
        if ((nota < 0)||(nota > 100)){
            System.out.println("Cap nota vàlida introduïda");
        } else {
            while ((nota >= 0)&&(nota < 100)){
            suma += nota;
            comptador ++;
            System.out.println("Introdueix nota");
            nota = Integer.parseInt(Entrada.readLine());
        }
        
        mitja = suma / comptador;
        
        System.out.println("La mitja de les notes vàlides és " + mitja);
        
        }
    }
}
