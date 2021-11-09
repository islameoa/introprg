
/*Programa que demana un valor inicial i un de final i mostra per pantalla
els que hi ha entre ells */

public class MostraInterval {
    public static void main (String[] args) {
        
        System.out.println("inici?");  
        int inici = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int finale = Integer.parseInt(Entrada.readLine());
             
        if (inici > finale){
            for ( int i = inici; i >= finale; i--){
                System.out.println(i);
            }
        } else {
            for ( int i = inici; i <= finale; i++){
                System.out.println(i);
            }
        }
    }
}
