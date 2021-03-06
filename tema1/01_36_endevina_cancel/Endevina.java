/* Programa en el que l'usuari tractarà d'endevinar un número, amb intents
il·limitats*/

public class Endevina {
    public static void main (String[] args){
        
        int numeroAEndevinar = 42;
        int numeroUsuari = 0;
        String stringUsuari;
        
        while (numeroUsuari != numeroAEndevinar){
            System.out.println("Nombre?");
            stringUsuari = Entrada.readLine();
            
            if (stringUsuari.isBlank()){
                numeroUsuari = numeroAEndevinar;
                System.out.println("Cancel·lat!");
            } else {
                numeroUsuari = Integer.parseInt(stringUsuari);
                if ((numeroUsuari > 100) || (numeroUsuari <= 0)){
                    System.out.println("Fora de rang");
                } else {
                    if (numeroUsuari < numeroAEndevinar){
                    System.out.println("Massa petit");
                    } else if (numeroUsuari > numeroAEndevinar){
                    System.out.println("Massa gran");
                    } else {
                        numeroUsuari = numeroAEndevinar;
                        System.out.println("Encertat!");
                    }
                }
            } 
        }   
    }
}
