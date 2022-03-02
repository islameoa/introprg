
/* Programa que imprimeix els nombres parells entre els deu primers nombres*/


public class PrimersParells{
    public static void main(String[] args){
        
        int nombre = 1;
        while (nombre <= 10){
            if (nombre%2 == 0){
                System.out.println(nombre);
            }
            nombre++;
        }
    }
}
