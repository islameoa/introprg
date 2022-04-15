 /*Exercici que utilitza la classe Ascensor per provar que funciona*/

public class UsaAscensor {
	public static boolean esEnter(String nombre){
		boolean isNumeric = true;
		for (int i = 0; i < nombre.length(); i++) {
			if (!Character.isDigit(nombre.charAt(i))) {
				isNumeric = false;
			}
			if (nombre.charAt(i)=='-' || nombre.charAt(i)=='+'){
				isNumeric = true;
			}
		}
		return isNumeric;
	}
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        System.out.println("Introdueix nou pis:");
        //llegir el nou pis de stdin i assignar-lo a l'ascensor
        String pis = Entrada.readLine();
        boolean enter = esEnter(pis);
        if (enter){
        	ascensor.setPis(Integer.parseInt(pis));
        }

        System.out.println("Introdueix nou moviment:");
        //llegir el nou moviment de stdin i assignar-lo a l'ascensor
		ascensor.setMoviment(Entrada.readLine());
		
        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
        System.out.println("Estat de l'ascensor: " + ascensor.comEsta());
    }
}
