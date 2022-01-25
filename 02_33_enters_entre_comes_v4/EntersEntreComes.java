/*Programa que demana el nombre de posicions de l'array, el separador i els valors que el contindràn. després ho imprimeix per pantalla*/

public class EntersEntreComes{
	public static void main(String args[]){
		System.out.println("Quants?");
		String quants = Entrada.readLine();
		String numero = quants.replace(" ","");
		
		boolean esEnter = UtilString.esEnter(numero);
		while (esEnter==false){
			System.out.println("Per favor, un valor enter");
			numero = Entrada.readLine();
			esEnter = UtilString.esEnter(numero);
		}
		
		System.out.println("Separador?");
		String sep = Entrada.readLine();
		char separador = Character.MIN_VALUE;
		if (sep.isBlank()){
			separador = ',';
		} else {
			separador = sep.charAt(0);
		}
		
		int nombre = Integer.parseInt(numero);	
		int[] numeros = new int[nombre];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("");
			int num = i+1;
			
			System.out.println("Valor " + num + "?");
			String valor = Entrada.readLine();
			esEnter = UtilString.esEnter(valor);
			while (esEnter==false){
				System.out.println("Per favor, un valor enter");
				valor = Entrada.readLine();
				esEnter = UtilString.esEnter(valor);
			}
			numeros[i]=Integer.parseInt(valor);
		}
		System.out.println();
		
		String imp = UtilString.entreComes(numeros, separador);
		System.out.print(imp);
		System.out.println();
	}
}



