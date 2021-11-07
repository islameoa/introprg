/* Exercici que ens demana l'edat i depenent de l'edat ens dóna un missatge o 
un altre :) */



public class Preso {
    public static void main(String[] args){
        System.out.println("Com us dieu?");
        String nom = Entrada.readLine();
        System.out.println("Quants anys teniu?");
        int edat = Integer.parseInt(Entrada.readLine());
        if (edat <= 17){
            System.out.println("Aneu amb compte " + nom);
            } else {
                System.out.println("Vos ja podeu anar a la presó!");
                System.out.println("Aneu amb compte " + nom);
                }
        }
}
