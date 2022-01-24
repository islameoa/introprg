/*Programa al que se li introdueix una matrícula i et diu si és vàlida o no en 
format AA000AA (italiana)*/

public class MatriculaValida {
    public static void main(String args[]){
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        boolean valida = true;
        
        if (matricula.isBlank()){
            valida = false;
        } else {
            if ((matricula.length()>7)||(matricula.length()<7)){
                valida = false;
            } else {
            	for (int i=0; i<matricula.length(); i++){
            		char lletra = matricula.charAt(i);
            		if (i==2 || i==3 || i==4){
            			if ((lletra<48) || (lletra>57)){
        				valida = false;
        				}	
            		} else {	
                		valida = esLletraValidaPerMatriculaItaliana(lletra);
            		}
            	}
            }
        }
        
        if (valida == true){
            System.out.println("És una matrícula italiana vàlida");
        } else {
            System.out.println("No és una matrícula italiana vàlida");
        }
    }
    
    public static boolean esLletraValidaPerMatriculaItaliana(char lletra){
    	boolean valida = true;
        String invalid = "IOQU";
        
        if ((lletra<64) || (lletra>90)){
        	valida = false;
        }
        for (int y=0; y<4; y++){
        	if (lletra == invalid.charAt(y)){
                    valida = false;
                }
        }
        return valida;
    }
}
