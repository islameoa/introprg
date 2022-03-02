/*Programa que imprimeix els parells entre els deu primers nombres amb un for*/

public class PrimersParells {
    public static void main (String[] args) {
        for (int num = 1; num <= 10; num++){
            if (num % 2 == 0){
                System.out.println(num);
            }
        }
    }
}
