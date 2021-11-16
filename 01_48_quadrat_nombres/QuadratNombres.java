/* Programa al que se li introdueix un nombre i imprimeixx un quadrat de la
mesura del nombre amb dos for*/


public class QuadratNombres {
    public static void main(String[] args){
        System.out.println("Valor final?");
        int valor = Integer.parseInt(Entrada.readLine());
        int numImp = 1;
        
        for (int y=1; y<=valor; y++){
            for (int x=1; x<=valor; x++){
            System.out.print(numImp + " ");
            numImp ++;
        }
        System.out.println(" ");
        numImp = 1;
        }
    }
}
