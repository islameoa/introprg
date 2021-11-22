/*Programa al que se li introdueix un nombre i imprimeix un triangle invertit
és a dir, la fila més llarga serà la primera i anirà baixant*/


public class rayoMcQueen {
    public static void main (String[] args){
        for (int lineNum=9; lineNum>=0; lineNum--){
            for (int lineCont=0; lineCont<=18; lineCont++){
                if (lineCont <= 9){
                    if (lineCont < lineNum){
                        System.out.print(".");
                    }
                    if (lineCont >= lineNum){
                        System.out.print("0");
                    }
                } else {
                    lineCont-=10;
                    if (lineCont < lineNum){
                        System.out.print("0");
                    }
                    if (lineCont >= lineNum){
                        System.out.print(".");
                    }
                    lineCont+=10;
                }
            }
            System.out.println("");
        }
        
        for (int i=0; i<=18; i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i=0; i<=18; i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i=0; i<=18; i++){
            System.out.print("*");
        }
        System.out.println();
        
        for (int lineNum=9; lineNum>=0; lineNum--){
            for (int lineCont=0; lineCont<=18; lineCont++){
                if (lineCont <= 9){
                    if (lineCont < lineNum){
                        System.out.print(".");
                    }
                    if (lineCont >= lineNum){
                        System.out.print("0");
                    }
                } else {
                    lineCont-=10;
                    if (lineCont < lineNum){
                        System.out.print("0");
                    }
                    if (lineCont >= lineNum){
                        System.out.print(".");
                    }
                    lineCont+=10;
                }
            }
            System.out.println("");
        }
        
    }
}
