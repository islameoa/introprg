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
         
         String pis = Entrada.readLine();
         boolean enter = esEnter(pis);
         if (enter){
         	ascensor.setPis(Integer.parseInt(pis));
         }
         
         
         System.out.println("Introdueix nou moviment:");
         String moviment = Entrada.readLine();
         //setMoviment(Entrada.readLine());
         
         System.out.println("Pis final: " + ascensor.getPis());
         System.out.println("Moviment final: " + ascensor.getMoviment());
         
     }
 }
