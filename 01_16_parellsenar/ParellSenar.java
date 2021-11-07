/*Programa al que se li passa un nombre pel terminal i ens mostra si 

és parell o senar*/



public class ParellSenar{
    public static void main(String[] args){
        int numero = Integer.parseInt(args[0]);
        int modul = numero % 2;
        if (modul == 0){
            System.out.println("El número " + numero + " és parell");
        } else {
            System.out.println("El número " + numero + " és senar");
        }
    }
}
