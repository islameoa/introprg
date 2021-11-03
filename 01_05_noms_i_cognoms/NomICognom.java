/* Programa que ens demana el nom i el cognom i ens els imprimeix per pantalla
amb una frase bonica*/


public class NomICognom {
    public static void main(String[] args) {
        
        System.out.println("Quin és el teu nom?");
        String nom = Entrada.readLine();
        
        System.out.println("Quin és el teu cognom?");
        String cognom = Entrada.readLine();
        
        System.out.println("Ei " + nom + ", tinc una amiga que també és " + cognom);
        
        }
    }
