/*Programa que rep un string i uns valors inicials i finals i en retorna els
caràcters que estan entre aquests valors*/

public class MostraInterval {
    public static void main(String args[]){
        System.out.println("text?");
        String text = Entrada.readLine();
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int fi = Integer.parseInt(Entrada.readLine());
        
        
        if ((inici < 0) && (fi < 0)){
            System.out.println("");
        } else if (inici < 0){
            inici = 0;
        } else if (inici > text.length()){
            inici = text.length()-1;
        }
        
        if (inici>fi){
                for (int x=inici; x>=fi; x--){
                    if (x > text.length()){
                        System.out.println("");
                    } else {
                        System.out.println(text.charAt(x));
                    }  
                }    
            } else if ((inici < fi) && (inici < 0) && (fi < 0)){
                for (int x=inici; x<=fi; x++){
                    if (x > text.length()){
                        System.out.println("");
                    } else {
                        System.out.println(text.charAt(x));
                    }
                } 
            
        }
    }
}
