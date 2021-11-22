/* Programa que demana 2 nombres i mostra les taules d'aquests nombres 
multiplicats pels dos nombres nombres seguents que demana*/

public class TaulaMultiplicar {
    public static void main(String[] args) {
        int inici = Integer.parseInt(args[0]);
        int finale = Integer.parseInt(args[1]);
        int primer = Integer.parseInt(args[2]);
        int limit = Integer.parseInt(args[3]);
        int res = 0;
        
        if (inici > finale){
            int var = finale;
            finale = inici;
            inici = var;
        }
        
        for(int i=inici; i <= finale; i++){
            for(int a=primer; a <= limit; a++){
                res = i * a;
                System.out.println(i + " x " + a + " = " + res);
            }
        }
    }
}
