/*Programa que repeteix qualsevol paraula que comenci o acabi en vocal*/

public class LloroVocalIniciFi{
	public static void main(String args[]){
	
		boolean confirmacio = false;
	
		while (confirmacio!=true){
			System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
			String text = Entrada.readLine();
			
			if (text.isBlank()){
				System.out.println("El lloro demana confirmació per finalitzar");
				String resposta = Entrada.readLine();
				confirmacio = UtilitatsConfirmacio.respostaABoolean(resposta);
			} else {
				boolean vocal = UtilString.esVocal(text.charAt(0));
				boolean vocalfi = UtilString.esVocal(text.charAt(text.length()-1));
			
				if (vocal || vocalfi == true){
					System.out.println("El lloro diu: " + text);
				}
			}
		}
		System.out.println("Adéu");
	}
}
