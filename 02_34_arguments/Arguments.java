/*Programa que diu quins arguments dels que passem per terminal són enters i quins no*/

public class Arguments{
	public static void main(String[] args){
		for (int i=0; i<args.length; i++){
			System.out.print("["+i+"] " + '"' + args[i] + '"' + ":");
			boolean esEnter = UtilString.esEnter(args[i]);
			if (esEnter==true){
				System.out.print(" és enter");
			} else {
				System.out.print(" no és enter");
			}
			System.out.println();
		}
	}
}
