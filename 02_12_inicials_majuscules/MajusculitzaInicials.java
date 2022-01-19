public class MajusculitzaInicials {
	public static void main(String args[]){
		System.out.println("Text?");
		String text = Entrada.readLine();
		majusculitzaInicials(text);
	}
	public static void majusculitzaInicials(String text){
		char primeraLletra = text.charAt(0);
		System.out.print(Character.toUpperCase(primeraLletra));
		for (int i=1; i<text.length()-1; i++){
			char lletra = text.charAt(i);
			if (((lletra>96) && (lletra<123)) || ((lletra>64) && (lletra<91))){
				System.out.print(lletra);
			} else {
				char lletraCam = text.charAt(i+1);
				System.out.print(lletra);
				System.out.print(Character.toUpperCase(lletraCam));
				i++;
			}
		}
		System.out.print(text.charAt(text.length()-1));
		System.out.println();
		
	}
}
