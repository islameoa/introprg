/* Programa que ens demana el nom i el cognom i ens els imprimeix per pantalla
amb una frase bonicaaaa*/


public class NomICognom {
    public static void main(String[] args) {
        
        System.out.println("Com et dius?");
        String nom = Entrada.readLine();
        
        System.out.println("I quin és el teu primer cognom?");
        String cognom = Entrada.readLine();
        
        System.out.println("Ei " + nom + ", tinc una amiga que també és " + cognom + ".");
        
        }
    }
