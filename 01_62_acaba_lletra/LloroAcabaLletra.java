/*Lloro que només repteix per pantalla les paraules que acaben
 amb una no vocal*/

public class LloroAcabaLletra{
    public static void main(String args[]){
    
        System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
        String paraula = Entrada.readLine();
        
        
        while(!paraula.isBlank()){
            int ultim = paraula.length() - 1;
            if (paraula.charAt(ultim)!='a'|| paraula.charAt(ultim)!='e' || paraula.charAt(ultim)!='i' || paraula.charAt(ultim)!='o' || paraula.charAt(ultim)!='u' ||
                paraula.charAt(ultim)!='A'|| paraula.charAt(ultim)!='E' || paraula.charAt(ultim)!='I' || paraula.charAt(ultim)!='O' || paraula.charAt(ultim)!='U'){
                System.out.println("El lloro diu: " + paraula);
            }
            System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
            paraula = Entrada.readLine();
        }        
        System.out.println("Adéu");
    }
}
