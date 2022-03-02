/* Programa que rep una paraula i forma un triangle amb les seves lletres,
 a la primera linia tindrem la paraula completa i anirem baixant*/
 
public class TriangleLletresInvertit {
    public static void main(String args[]){
    
        System.out.println("Text?");
        
        String text = Entrada.readLine();
        
        if (text.isBlank()){
            System.out.println("");
        } else {
             for (int x = text.length()-1; x>=0; x--){
             int lletra = x;
                for (int y = 0; y<=x; y++){
                    char a = text.charAt(lletra);
                    if (y==x){
                        System.out.print(a);
                    } else {
                        System.out.print(a + ", ");
                    }
                    lletra--;
                }
                System.out.println("");
             }
        }
    } 
 }
