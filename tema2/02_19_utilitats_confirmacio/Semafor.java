/*Programa que segons el color del semafor i la teva edat et diu el que has de fer*/

public class Semafor{
	public static void main (String args[]){
		System.out.println("Ets major d'edat?");
		String resposta = Entrada.readLine();
		boolean confirmacio = UtilitatsConfirmacio.respostaABoolean(resposta);
		if (confirmacio==true){
			System.out.println("Color?");
        		String color = Entrada.readLine();
            
        		if (color.equals("groc")) {
            		System.out.println("corre!");
        		} else if (color.equals("vermell")){
            		System.out.println("espera");
        		} else if (color.equals("verd")){
            		System.out.println("passa");
       		} else {
            		System.out.println("ves a l'oculista");
        		}
    		} else {
    			System.out.println("No pots fer servir aquest programa sense supervisió");
    		}
	}
}
