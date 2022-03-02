

//PROGRAMA QUE ORDENA TRES NOMBRES DEMANATS A L'USUARI DE MENOR A MAJOR


public class TresEnOrdre {
    public static void main (String args[]){
        int numImp1;
        int numImp2;
        int numImp3;
        
        System.out.println("Primer?");
        int num1 = Integer.parseInt(Entrada.readLine());
        System.out.println("Segon?");
        int num2 = Integer.parseInt(Entrada.readLine());
        System.out.println("Tercer?");
        int num3 = Integer.parseInt(Entrada.readLine());
        
        if (num1>num2){
            if (num2>num3) {
                numImp1=num1;
                numImp2=num2; 
                numImp3=num3;     
            } else if (num3 > num1){
                numImp1=num3;
                numImp2=num1; 
                numImp3=num2;
                } else {
                    numImp1 = num1;
                    numImp2 = num3;
                    numImp3 = num2;
                }
        } else {
            if (num3 > num2){
                numImp1 = num3;
                numImp2 = num2;
                numImp3 = num1;
            } else if (num3>num1){
                numImp1 = num2;
                numImp2 = num3;
                numImp3 = num1;
            } else {
                numImp1 = num2;
                numImp2 = num1;
                numImp3 = num3;
            }
        }
        
        System.out.println(numImp3 + ", " + numImp2 + " i " + numImp1);
    }
}
