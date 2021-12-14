/*Programa que repeteix paraules i si rep dibuixa quadrat o rectangle els 
dibuixa, per a sortir Àdeu!*/

public class LloroQuadrat{
    public static void main(String args[]){
        String frase;        
        System.out.println("El lloro espera paraula:");
        frase = Entrada.readLine();
        
        
        while ((!frase.isBlank()) && (!frase.isEmpty()) && (!frase.equals("Adéu"))){
            if (frase.equals("dibuixa quadrat")){
                dibuixaQuadrat();
            } else if (frase.equals("dibuixa rectangle")){
                dibuixaRectangle();
            } else {
                System.out.println("El lloro repeteix: " + frase);
            }
            System.out.println("El lloro espera paraula:");
            frase = Entrada.readLine();
        }
    }
    /* Programa que dibuixa un quadrat numèric de 5x5 */
    public static void dibuixaQuadrat() {
            for (int linia=1; linia <= 5; linia++) {
                for (int columna=1; columna <= 5; columna++) {
                    System.out.print(" X");
                }
                System.out.println();
            }
        }
    
    /* Programa que dibuixa un rectangle numèric de 5x9 */
    public static void dibuixaRectangle() {
            for (int linia=1; linia <= 5; linia++) {
                for (int columna=1; columna <= 9; columna++) {
                    System.out.print(" X");
                }
                System.out.println();
            }
        }
          
}
