/*Programa que retorna un string donat, pero al revés i amb comes*/

public class TextReves{
	public static void main(String args[]){
		String text = Entrada.readLine();
		System.out.println("Text?");
		mostraReves(text);
	}
	
	public static void mostraReves(String text){
		for (int i=text.length()-1; i>-1; i--){
			if(i==0){
				System.out.print(text.charAt(i));
			} else {
				System.out.print(text.charAt(i) + ", ");
			}
		}
		System.out.println();
	}
}
