/*Programa que mostra l'interval desitjat d'un string*/

public class MostraInterval {
	public static void main(String args[]){
		System.out.println("Text?");
		String text = Entrada.readLine();
		System.out.println("inici?");
		int inici = Integer.parseInt(Entrada.readLine());
		System.out.println("final?");
		int fi = Integer.parseInt(Entrada.readLine());
		
		String textImp = UtilString.intervalString(text, inici, fi);
		System.out.println(textImp);
	}
}
