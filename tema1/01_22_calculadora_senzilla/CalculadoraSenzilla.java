
//Programa que consta d'una calculadora senzilla que demana a l’usuari un 
//operand, una operació entre (+ - * /) i un segon operand, i escriu el resultat 
//d’aplicar l’operació als operands.

public class CalculadoraSenzilla {
    public static void main (String args[]){
        
        System.out.println("Operand1?");
        double num1 = Double.parseDouble(Entrada.readLine());
        System.out.println("Operador?");
        char operador = Entrada.readLine().charAt(0);
        System.out.println("Operand2?");
        double num2 = Double.parseDouble(Entrada.readLine());
        
        double res;
        
        if (operador == '+'){
            res = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + res );
        } else if (operador == '-'){
            res = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + res );
        } else if (operador == '*'){
            res = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + res );
        } else if (operador == '/'){
            if (num2 == 0){
                System.out.println("No es pot dividir entre 0");
            } else {
                res = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + res );
            }
        } else {
            System.out.println("L'operador " + operador + " no està disponible");
        }
    }
}
