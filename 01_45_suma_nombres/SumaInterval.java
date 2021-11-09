/*Programa que demana un valor inicial i un de final i suma tots 
els nombres entre ells */

public class SumaInterval {
    public static void main (String[] args) {
        
        System.out.println("inici?");  
        int inici = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int finale = Integer.parseInt(Entrada.readLine());
        int suma = 0;
        int tmp;
        
        if (inici > finale){
            tmp = inici;
            inici = finale;
            finale = tmp;
        }
        
        for (int i = inici; i <= finale; i++){
            suma += i;
        }
        System.out.println(suma);
    }
}
