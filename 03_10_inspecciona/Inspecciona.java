/*Programa que per cada argument, comprovarà si correspon a un camí existent, si no existeix, indicarà "No trobat".
En cas que existeixi, indicarà els seus permisos per l’usuari en el format típic de GNU (rwx). A continuació, indicarà si correspon a un
fitxer o un directori. Si és un fitxer farà una cosa i si és un directori farà una altra*/

public class Inspecciona{
	public static void main(){
		if (args.length<0){
			return;
		} else {
			for (int i=0; i<args.length; i++){
				cami = args[i];
				File fitxer = new File(cami);
		    	if (! fitxer.exists()) {
				    System.out.println("No trobat");
				    //break;
				} else {
					if(fitxer.canRead()){
						System.out.print("r");
					} else {
						System.out.print("-");
					}
					if(fitxer.canWrite()){
						System.out.print("w");
					} else {
						System.out.print("-");
					}
					if(fitxer.canExecute()){
						System.out.print("x");	
					} else {
						System.out.print("-");
					}
				}
			}
		}
		
	}
}
