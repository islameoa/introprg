/*Programa que rep un string i una posicio i et diu el que hi ha en aquella
posició*/

public class AnalitzaCaracter {

    public static void main(String args[]){
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println("Posició?");
        int pos = Integer.parseInt(Entrada.readLine());
        char lletra = text.charAt(pos); 
        
        if (pos < 0){
            pos = pos + text.length();
        } 
        if ((pos >= text.length()) || (pos < 0)){
            System.out.println("Fora de rang");
        } else {
            analitzaCaracter(lletra);
        }
        
    }
    
    public static void analitzaCaracter(char caracter){       
        if ((caracter>47) && (caracter<58)){
                System.out.println("'" + caracter + "' és un nombre");
            } else if (((caracter>64) && (caracter<91)) || (caracter>96)&&(caracter<123)){
                System.out.println("'" + caracter + "' és una lletra");
            } else {
                System.out.println("'" + caracter + "' és una altra cosa");
            }
    }
}
