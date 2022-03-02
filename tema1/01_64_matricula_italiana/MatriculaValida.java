/*Programa al que se li introdueix una matrícula i et diu si és vàlida o no en 
format AA000AA (italiana)*/

public class MatriculaValida {
    public static void main(String args[]){
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        boolean valida = true;
        String invalid = "IOQU";
        
        if (matricula.isBlank()){
            valida = false;
        } else {
            if ((matricula.length()>7)||(matricula.length()<7)){
                valida = false;
            } else {
                for (int x=2; x<=4; x++){
                    if ((matricula.charAt(x)<48) || (matricula.charAt(x)>57)){
                        valida = false;
                    }
                }
                for (int x=0; x<7; x++){
                    if (x == 2){
                        x += 3;
                    }
                    if ((matricula.charAt(x)<64) || (matricula.charAt(x)>90)){
                        valida = false;
                    }
                    for (int y=0; y<4; y++){
                        if (matricula.charAt(x) == invalid.charAt(y)){
                            valida = false;
                        }
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
