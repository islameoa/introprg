public class Pagament {
    public static void main (String[] args) {
        
        int quantitatInicial;
        int quantitatPagada;
        int diferencia;
        
        System.out.println("Preu?");
        quantitatInicial = Integer.parseInt(Entrada.readLine());
        System.out.println("Paga?");
        quantitatPagada = Integer.parseInt(Entrada.readLine());
        
        if (quantitatInicial > quantitatPagada){
            diferencia = quantitatInicial - quantitatPagada;
            System.out.println("Sobren " + diferencia + "€");
        } else {
            diferencia = quantitatPagada - quantitatInicial;
            System.out.println("Falten " + diferencia + "€");
        }
    }
}        
