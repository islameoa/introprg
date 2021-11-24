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
            } else if ((matricula.charAt(0)<64) || (matricula.charAt(0)>90)){
                valida = false;
            } else if ((matricula.charAt(1)<64) || (matricula.charAt(1)>90)){
                valida = false;
            } else if ((matricula.charAt(5)<64) || (matricula.charAt(5)>90)){
                valida = false;
            } else if ((matricula.charAt(6)<64) || (matricula.charAt(6)>90)){
                valida = false;
            } else {
                for (int x=2; x<=4; x++){
                    if ((matricula.charAt(x)<48) || (matricula.charAt(x)>57)){
                        valida = false;
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
}
