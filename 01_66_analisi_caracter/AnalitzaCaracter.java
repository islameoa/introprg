/*Programa que rep un string i una posicio i et diu el que hi ha en aquella
posició*/

public class AnalitzaCaracter {
    public static void main(String args[]){
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println("Posició?");
        int pos = Integer.parseInt(Entrada.readLine());
        
        if (pos < 0){
            pos = pos + text.length();
        } 
        if ((pos >= text.length()) || (pos < 0)){
            System.out.println("Fora de rang");
        } else {
            if ((text.charAt(pos)>47) && (text.charAt(pos)<58)){
                System.out.println("'" + text.charAt(pos) + "' és un nombre");
            } else if (((text.charAt(pos)>64) && (text.charAt(pos)<91)) || (text.charAt(pos)>96)&&(text.charAt(pos)<123)){
                System.out.println("'" + text.charAt(pos) + "' és una lletra");
            } else {
                System.out.println("'" + text.charAt(pos) + "' és una altra cosa");
            }
        }
        
    }
}
