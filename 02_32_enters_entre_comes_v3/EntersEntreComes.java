/*Programa que demana la longitud de l'array, en demana els enters que contindrà, els fica a l'array i els imprimeix entre comes*/

public class EntersEntreComes{
	public static void main(String args[]){
		System.out.println("Quants?");
		int quants = Integer.parseInt(Entrada.readLine());
		if (quants<1){
			System.out.println("Res a fer");
		} else {
			int[] numeros = new int[quants];
		
			System.out.println("Valor 1?");
			numeros[0]=Integer.parseInt(Entrada.readLine());
			System.out.print(numeros[0]);
			for (int i = 1; i < numeros.length; i++) {
				System.out.println("Valor " + i+1 + "?");
				numeros[i]=Integer.parseInt(Entrada.readLine());
				System.out.print(", " + numeros[i]);
			}
			System.out.println();
		}
	}
}
