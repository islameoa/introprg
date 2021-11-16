/*Programa al que se li introdueix un nombre i imprimeix un triangle amb un numbre de files
igual al nombre introduit*/


public class TriangleNombres {
    public static void main (String[] args){
        System.out.println("Nombre?");
        int valor = Integer.parseInt(Entrada.readLine());
        int numImp = 1;
        int max = 1;
        
        if ((valor>9) || (valor<1)){
            System.out.println ("Valor inadequat");
        } else {
            for (int col=1; col<=valor; col++){
                for (int fil=1; fil<=max; fil++){
                    System.out.print(numImp + " ");
                    numImp--;
                }
                System.out.println("");
                max ++;
                numImp = max;
            }   
        }
    }
}
