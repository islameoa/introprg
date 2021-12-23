/*Programa que rep dos arguments per terminal i fara un quadrat amb 
les dimensions del primer argument imprimint el segon argument*/

public class Quadrat{
    public static void main(String args[]){
        int parametre = Integer.parseInt(args[0]);
        String lletra = args[1];
        char lletraImp = lletra.charAt(0);
        
        dibuixaQuadrat(parametre, lletraImp);
    }
        
    public static void dibuixaQuadrat(int costat, char caracter){
        for(int y=1; y<=costat; y++){
            dibuixaLinia(costat, caracter);
            System.out.println();
        }
    }
    
    public static void dibuixaLinia(int costat, char caracter){
        for(int x=1; x<=costat; x++){
            System.out.print(caracter + " ");   
        }
    }
}
