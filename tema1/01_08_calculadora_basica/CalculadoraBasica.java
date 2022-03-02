public class CalculadoraBasica {
    public static void main(String[] args){
    // obté operands d'entrada
        System.out.println("Primer operand:");
        int primerOperand = Integer.parseInt(Entrada.readLine());
        System.out.println("Segon operand:");
        int segonOperand = Integer.parseInt(Entrada.readLine());

        // operacions
        int suma = primerOperand + segonOperand;
        int resta = primerOperand - segonOperand;
        int multiplicacio = primerOperand * segonOperand;
        int divisio = primerOperand / segonOperand;

        // mostra resultats
        System.out.println(primerOperand + " + " + segonOperand + " = " + suma);
        System.out.println(primerOperand + " - " + segonOperand + " = " + resta);
        System.out.println(primerOperand + " * " + segonOperand + " = " + multiplicacio);
        System.out.println(primerOperand + " / " + segonOperand + " = " + divisio);
    }
}
