/*Programa que demana dos texts i un nombre i en fa un informe manipulant 
amb diferents mètodes de strings*/

public class InformeCaracter {
    public static void main(String args[]){
        System.out.println("Caràcter?");
        String text = Entrada.readLine();
        if (text.isBlank()){
            System.out.println("Caràcter buit");
        } else {
            char caracter = text.charAt(0);
        
            System.out.println("Character.getName('" + caracter + "'): " + Character.getName(caracter));
            System.out.println("Character.isDigit('" + caracter + "'): " + Character.isDigit(caracter));
            System.out.println("Character.isJavaIdentifierStart('" + caracter + "'): " + Character.isJavaIdentifierStart(caracter));
            System.out.println("Character.isJavaIdentifierPart('" + caracter + "'): " + Character.isJavaIdentifierPart(caracter));
            System.out.println("Character.isLetter('" + caracter + "'): " + Character.isLetter(caracter));
            System.out.println("Character.isLowerCase('" + caracter + "'): " + Character.isLowerCase(caracter));
            System.out.println("Character.isUpperCase('" + caracter + "'): " + Character.isUpperCase(caracter));
            System.out.println("Character.isWhitespace('" + caracter + "'): " + Character.isWhitespace(caracter));
            System.out.println("Character.toLowerCase('" + caracter + "'): " + Character.toLowerCase(caracter));
            System.out.println("Character.toUpperCase('" + caracter + "'): " + Character.toUpperCase(caracter));
        }
    }
}
