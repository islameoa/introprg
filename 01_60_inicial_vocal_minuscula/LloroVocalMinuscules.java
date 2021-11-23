/*Lloro que només repteix per pantalla les paraules que comencen
 amb una vocal mínuscula*/

public class LloroVocalMinuscules {
    public static void main(String args[]){
    
        System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
        String paraula = Entrada.readLine();
        
        while(!paraula.isBlank()){
            if (paraula.charAt(0)=='a'|| paraula.charAt(0)=='e' || paraula.charAt(0)=='i' || paraula.charAt(0)=='o' || paraula.charAt(0)=='u'){
                System.out.println("El lloro diu: " + paraula);
            }
            paraula = Entrada.readLine();
        }
        System.out.println("Adéu!");
    }
}
