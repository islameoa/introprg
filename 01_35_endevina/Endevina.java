/* Programa en el que l'usuari tractarà d'endevinar un número, amb intents
il·limitats*/

public class Endevina {
    public static void main (String[] args){
        
        int numeroAEndevinar = 42;
        int numeroUsuari = 0;
        
        while (numeroUsuari != numeroAEndevinar){
            System.out.println("Introdueix un nombre entre el 1 i el 100");
            numeroUsuari = Integer.parseInt(Entrada.readLine());
            
            if (numeroUsuari < numeroAEndevinar){
                System.out.println("És més gran que " + numeroUsuari);
            }
            if (numeroUsuari > numeroAEndevinar){
                System.out.println("És més petit que " + numeroUsuari);
            }
        }
        
        System.out.println("Has encertat!");
    }
}
