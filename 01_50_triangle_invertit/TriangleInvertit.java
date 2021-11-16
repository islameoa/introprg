/*Programa al que se li introdueix un nombre i imprimeix un triangle invertit
és a dir, la fila més llarga serà la primera i anirà baixant*/


public class TriangleInvertit {
    public static void main (String[] args){
        System.out.println("Nombre?");
        int valor = Integer.parseInt(Entrada.readLine());
        int numImp = 1;
        int max = valor;
        
        
            for (int col=1; col<=valor; col++){
                for (int fil=1; fil<=max; fil++){
                    System.out.print(numImp);
                    numImp++;
                    if (max != fil){
                        System.out.print(", ");
                    }
                }
                System.out.println(" ");
                max --;
                numImp = 1;
            }   
    
    }
}
