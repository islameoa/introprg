/*Creació de la classe ascensor que compta amb el mòdul creaAscensor per tal de poder crear un ascensor i inicialitzar-lo al pis que vulguem*/

public class Ascensor {
    public int pis = -1;

    public static Ascensor[] creaAscensors(int quants) {
        Ascensor[] ascensor = new Ascensor[quants];
        
        for(int i=0; i<quants; i++){ 
        	ascensor[i] = new Ascensor();
        	ascensor[i].pis = i;
        }
        return ascensor;
    }

    public static void main(String[] args){
        Ascensor ascensor;
        
        if (args.length!=1 || !esEnter(args[0])){
        	System.out.println("Cap ascensor");
        } else {
        	int quants = Integer.parseInt(args[0]);
        	Ascensor[] ascensors = creaAscensors(quants);
		    for (int i = 0; i < ascensors.length; i++) {
		        System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
		    }
        }
    }
    public static boolean esEnter(String nombre){
	   boolean isNumeric = true;
	   for (int i = 0; i < nombre.length(); i++) {
	       if (!Character.isDigit(nombre.charAt(i))) {
	           isNumeric = false;
	       }
	       if (nombre.charAt(i)=='-'){
	       	isNumeric = true;
	       }
	   }
	   return isNumeric;
    }
}
