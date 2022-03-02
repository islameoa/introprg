/*Programa que imprimeix un triangle de nombres les vegades que l'usuari 
introdueixi*/


public class Triangle {
    public static void main (String[] args){
        System.out.println("quants?");
        int valor = Integer.parseInt(Entrada.readLine());
        int comptador = 1;
        
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
            comptador++;
        }
    }
}
