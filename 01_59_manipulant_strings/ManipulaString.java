/*
 * Programa que demostra diferents manipulacions amb Strings
 */
public class ManipulaString {
    public static void main(String[] args){
        System.out.println("Paraula?");
        String paraula = Entrada.readLine();
        
        if (!(paraula.isBlank()) || (paraula.length()<4)){
            int ultim = paraula.length() - 1;
            int penultim = ultim - 1;
            char a = paraula.charAt(0);
            char b = paraula.charAt(1);
            char c = paraula.charAt(2);
            char d = paraula.charAt(3);

            // Mostra la longitud de la paraula (quantes lletres conté)
            System.out.println("La longitud és " + paraula.length());

            // Mostra la segona lletra de la paraula
            System.out.println("La segona lletra és '" + paraula.charAt(1) + "'");

            // Mostra la darrera lletra de la paraula
            System.out.println("La darrera lletra és '" + paraula.charAt(ultim) + "'");

            // Mostra la penúltima lletra de la paraula
            System.out.println("La penúltima lletra és '" + paraula.charAt(penultim) + "'");

            // Mostra la paraula amb totes les lletres en majúscules
            System.out.println("La paraula en majúscules és " + '"' + paraula.toUpperCase() + '"');

            // Una composició formada per la primera lletra de la paraula en
            // majúscules, seguida de les següents tres lletres en minúscules. Per
            // exemple, si la paraula és «nEkAnE», resultatà en «Neka».
            System.out.println("La composició de quatre primeres és " + '"' + Character.toUpperCase(a) + Character.toLowerCase(b) + Character.toLowerCase(c) + Character.toLowerCase(d) + '"');

            // Mostra una composició formada per la darrera lletra de la paraula,
            // seguida de les tres primeres. (ex. si la paraula és «Nekane»
            // mostrarà «eNek»)
            System.out.println("La composició de quatre és " + '"' + paraula.charAt(ultim) + a + b + c + '"');

            // Com en el cas anterior però ara corregint les majúscules i
            // minúscules de manera que la primera sigui majúscules i la resta en
            // minúscules.  (ex. si la paraula és «Nekane» mostrarà «Enek»)
            System.out.println("La composició de quatre corregint majúscules és " + '"' + Character.toUpperCase(paraula.charAt(ultim)) + Character.toLowerCase(a) + Character.toLowerCase(b) +      
            Character.toLowerCase(c) + '"');
        }
    }
}
