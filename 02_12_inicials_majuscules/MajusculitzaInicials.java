public class MajusculitzaInicials {
	public static void main(String args[]){
		System.out.println("Text?");
		String text = Entrada.readLine();
		majusculitzaInicials(text);
	}
	public static void majusculitzaInicials(String text){
		char primeraLletra = text.charAt(0);
		System.out.print(Character.toUpperCase(primeraLletra));
		for (int i=1; i<text.length(); i++){
			char lletra = text.charAt(i);
			char lletraAnterior=text.charAt(i-1);
			if (((lletraAnterior<96) || (lletraAnterior>123)) && ((lletraAnterior<64) || (lletraAnterior>91))){
				System.out.print(Character.toUpperCase(lletra));
			} else if (i == text.length()-1){
				System.out.print(Character.toLowerCase(lletra));
			} else {
				System.out.print(Character.toLowerCase(lletra));
			}
		}
		System.out.println();
		
	}
}
