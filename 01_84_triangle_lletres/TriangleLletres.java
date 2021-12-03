/* Programa que rep una paraula i forma un triangle amb les seves lletres,
 a la base tindrem la paraula completa*/
 
public class TriangleLletres {
    public static void main(String args[]){
    
        System.out.println("Text?");
        
        String text = Entrada.readLine();
        
        if (text.isBlank()){
            System.out.println("");
        } else {
             for (int x = 0; x<text.length(); x++){
                for (int y = 0; y <= x; y++){
                    char a = text.charAt(y);
                    if (y==x){
                        System.out.print(a);
                    } else {
                        System.out.print(a + ",");
                    }
                }
                System.out.println("");
             }
        }
    } 
 }
