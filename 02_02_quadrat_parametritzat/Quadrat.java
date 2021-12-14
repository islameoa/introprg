/*Programa que rep el nombre de línies del quadrat per paràmetre*/

public class Quadrat{
    public static void main(String[] args){
    
        int parametreUsuari = Integer.parseInt(args[0]);
        dibuixaQuadrat(parametreUsuari);
    }
        
    public static void dibuixaQuadrat(int parametre) {
        for (int linia=1; linia <= parametre; linia++) {
            for (int columna=1; columna <= parametre; columna++) {
                System.out.print(" X");
            }
            System.out.println();
        }
    }
}
