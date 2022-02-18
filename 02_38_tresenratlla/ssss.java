/*Este programa creará un juego de tres en ralla.
Voy a tener que crear un módulo llamado mostraTaulell(char[][]) que mostrrá el tablero,
Otro llamado boolean jugadorGuanya(char[][], char jugador) que retorna cierto cuando un jugador gana y otro llamado
boolean hiHaEmpat(char[][]) que devuelve cierto cuando no pueden haber movimientos*/

public class TresEnRatlla{

    public static void main (String[]args){
    
        char [][] taulell = new char [3][3];
        //declaración de tablero
        
        System.out.println("Comença el joc");
         
        // inicialització de la fila 0
        taulell[0][0] = '·';
        taulell[0][1] = '·';
        taulell[0][2] = '·';
        //fila 1
        taulell[1][0] = '·';
        taulell[1][1] = '·';
        taulell[1][2] = '·';
        //fila 2
        taulell[2][0] = '·';
        taulell[2][1] = '·';
        taulell[2][2] = '·';
        
        
        
        //indica quién es el jugador que juega
        
            
        
        char jugador = 'X';
      
        while ( true){  //juego. 
      
        System.out.println("Juga el jugador" + jugador);
         
        mostraTaulell(taulell);
         
        System.out.println("Fila y columa del següent moviment");
         
        String valores = Entrada.readLine();
        
        int fila = ' ';
        int columna = ' ';
        
        
        for (int i = 0; i < valores.length(); i++){
        
        String fil = "";
        String col ="";
        
        
            if (valores.length() != 2){
            
                System.out.println("Error");
                
                valores = Entrada.readLine();        
                   
            }else if ((valores.charAt(0) =='0')||
                (valores.charAt(0) =='1')||
                (valores.charAt(0) =='2')){
                
                fil = fil + valores.charAt(0);
                fila = Integer.parseInt(fil);
        
            }else if (valores.charAt(0) == 'a'){
            
                System.out.println("El jugador abandona el joc");
                
            }else if (!(valores.charAt(0) =='0')||
                      (valores.charAt(0) =='1')||
                      (valores.charAt(0) =='2')){
            
                System.out.println("Error");
                
            }
            
            if((valores.charAt(1) =='0')||
               (valores.charAt(1) =='1')||
               (valores.charAt(1) =='2')){
                
                col= col + valores.charAt(1);
                columna = Integer.parseInt(col);
            
            }else if (valores.charAt(1) == 'a'){
            
                System.out.println("El jugador abandona el joc");
                
            }else{
            
                System.out.println("Error");
                
            }
            
            }
            
            boolean comproba = casellaOcupada (taulell, fila, columna);
            
            if(comproba== false){
            
                taulell[fila][columna] = jugador;
            
                mostraTaulell(taulell);
                
            }else{  
            	valores = Entrada.readLine();
            }
            
            if (jugador == 'X'){
            
                jugador = 'O';
                
            }else{
            
                jugador = 'X';
            }
            
        }
            
    }
            
    public static void mostraTaulell(char taulell[][]){
    //Este módulo muestra el tablero
    
           for (int fila = 0 ; fila < 3; fila ++){
           
                for(int columna = 0; columna < 3; columna ++){
                
                    System.out.print(taulell[fila][columna]);
                }
                
                System.out.println();
            }
    }
    
    public static boolean casellaOcupada(char taulell[][], int fila, int columna){
    //Módulo que comprueba si casilla está llena.
        boolean comproba = false;
    
        if (taulell[fila][columna]== '·'){
            return false;
        }
        
        return true;
    }
 
 
 
    
}
