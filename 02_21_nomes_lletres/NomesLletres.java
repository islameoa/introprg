/*Programa que demana un string i només en retorna les lletres */

public class NomesLletres{
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nomesLletres = UtilString.nomesLletres(text);
        String separades = UtilString.lletresSeparades(nomesLletres);
        System.out.println(separades);
    }
}
