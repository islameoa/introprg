/*Programa que demana un valor inicial, un de final i un salt i imprimeix 
els nombres que hi ha entre ells amb el salt a cada iteració*/

public class EntersIniciFi {
    public static void main (String[] args) {
        
        System.out.println("Valor inicial?");  
        int inici = Integer.parseInt(Entrada.readLine());
        System.out.println("Valor final?");
        int finale = Integer.parseInt(Entrada.readLine());
        System.out.println("Salt?");
        int salt = Integer.parseInt(Entrada.readLine());
        
        for (int i = inici; i <= finale; i=i+salt){
            
            System.out.println(i);
        }
    }
}
