/* Programa que imprimeix els nombres entre els dos primers valors que introdueixi 
l'usuari amb salts iguals al tercer número que introdueixi*/


public class EntersIniciFi{
    public static void main(String[] args){
        
        System.out.println("Valor inicial?");
        int nombre1 = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Valor final?");
        int nombre2 = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Valor inicial?");
        int salt = Integer.parseInt(Entrada.readLine());
        
        while (nombre1 <= nombre2){
            System.out.println(nombre1);
            nombre1+=salt;
        }
    }
}
