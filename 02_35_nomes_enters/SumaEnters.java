/*Programa que suma tots els enters que es passin per argument i els que no siguin enters no els suma*/

public class SumaEnters{
	public static void main(String[] args){
		
		int quants = quantsEnters(args);
		int[] enters = new int[quants];
		enters = filtraEnters(args);
		int suma = sumaEnters(enters);
		System.out.println(suma);
	}
	public static int quantsEnters(String[] valors){     // nombre d'enters a valors
		int nombre=0;
		if (valors.length<1){
			return nombre;
		}
		for (int i=0; i<valors.length; i++){
			boolean esEnter = UtilString.esEnter(valors[i]);
			if (esEnter){
				nombre += 1;
			}
		}
		return nombre;
	}
	public static int[] filtraEnters(String[] valors){   // enters que hi ha a valors
		int quants = quantsEnters(valors);
		int[] enters = new int[quants];
		int valor = 0;
		if(quants<1){
			return enters;
		} else {
			for (int i=0; i<valors.length; i++){
				valor = Integer.parseInt(valors[i]);
				enters[i]=valor;
			}
		}
		return enters;
	}
	public static int sumaEnters(int[] valors){          // suma dels valors
		int suma=0;
		for(int i=0; i<valors.length; i++){
			suma += valors[i];
		}
		return suma;
	}
}
