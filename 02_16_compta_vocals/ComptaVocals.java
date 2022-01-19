/* Programa que compta l'us de totes les vocals catalanes a un string donat */


public class ComptaVocals {
    public static void main(String[] args) {
	System.out.println("Text?");
        String text = Entrada.readLine();
        
        int nombre = quantesOcurrencies(text, 'a');
        mostraOcurrencies('a', nombre);
        nombre = quantesOcurrencies(text, 'à');
        mostraOcurrencies('à', nombre);
        nombre = quantesOcurrencies(text, 'e');
        mostraOcurrencies('e', nombre);
        nombre = quantesOcurrencies(text, 'è');
        mostraOcurrencies('è', nombre);
        nombre = quantesOcurrencies(text, 'é');
        mostraOcurrencies('é', nombre);
        nombre = quantesOcurrencies(text, 'i');
        mostraOcurrencies('i', nombre);
        nombre = quantesOcurrencies(text, 'í');
        mostraOcurrencies('í', nombre);
        nombre = quantesOcurrencies(text, 'ï');
        mostraOcurrencies('ï', nombre);
        nombre = quantesOcurrencies(text, 'o');
        mostraOcurrencies('o', nombre);
        nombre = quantesOcurrencies(text, 'ó');
        mostraOcurrencies('ó', nombre);
        nombre = quantesOcurrencies(text, 'ò');
        mostraOcurrencies('ò', nombre);
        nombre = quantesOcurrencies(text, 'u');
        mostraOcurrencies('u', nombre);
        nombre = quantesOcurrencies(text, 'ú');
        mostraOcurrencies('ú', nombre);
        nombre = quantesOcurrencies(text, 'ù');
        mostraOcurrencies('ù', nombre);
        
    }
    public static void mostraOcurrencies(char lletra, int quantes) {
        System.out.println("Nombre de '" + lletra + "'s: " + quantes);
    }
    public static int quantesOcurrencies(String text, char lletra) {
        int comptador = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        return comptador;
    }
}










