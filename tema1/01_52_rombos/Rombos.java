/*Programa que imprimeix un rombe de nombres les vegades que l'usuari 
introdueixi*/


public class Rombos {
    public static void main (String[] args){
        System.out.println("quants?");
        int valor = Integer.parseInt(Entrada.readLine());
        int comptador = 1;
        int numTriangles = 1;
        
        while (comptador<=valor){
            for (int f=0; f<=9; f++){
                for (int c=0; c<=9; c++){
                    if (c >= 9-f){
                        System.out.print(c);
                    } else {
                        System.out.print(".");
                    }
                }            
                for (int c=8; c>=0; c--){
                    if(f >= 9-c){
                     System.out.print(c);
                    } else {
                        System.out.print(".");
                    } 
                }
                System.out.println("");
            }
            for (int f=0; f<=8; f++){
                for (int c=0; c<=9; c++){
                    if (c > f){
                        System.out.print(c);
                    } else {
                        System.out.print(".");
                    }
                }            
                for (int c=8; c>=0; c--){
                    if(f >= c){
                     System.out.print(".");
                    } else {
                        System.out.print(c);
                    } 
                }
                System.out.println("");
            }
            comptador++;
        }
    }
}
