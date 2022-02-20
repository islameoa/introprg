/* En aquest exercici implementarem el joc del tres en ratlla de manera que es pugui jugar. 
El joc començarà amb el taulell en blanc i anirà demanant moviments alternativament a cada jugador. 
Finalitza quan un dels dos guanya, hi ha empat o un dels dos escriu a*/
public class TresEnRatlla {

    // mòduls de suport
    
    public static boolean casellaOcupada(char[][] taulell, int fila, int columna){
    	if (taulell[fila][columna] == '·'){
    		return false;	
		}
		return true;
    }
    public static void mostraTaulell(char[][] taulell){
    		for(int fila=0; fila<taulell.length; fila++){
    			for(int col=0; col<taulell[0].length; col++){
    				System.out.print(taulell[fila][col]);
    			}
    			System.out.println();
    		}
    }
        
    public static boolean jugadorGuanya(char[][] taulell, char jugador){
    		int contador = 0;
    		for(int fila=0; fila<taulell.length; fila++){
    			for(int col=0; col<taulell[0].length; col++){
    				if (taulell[fila][col]==jugador){
    					contador++;
    				} else {
    					contador = 0;
    				}
    			}
    			if (contador == 3){
    				return true;
    			}                                                                               
    		}
    		contador = 0;
    		for(int col=0; col<taulell[0].length; col++){
				contador=0;
				for(int fila=0; fila<taulell.length; fila++){
					if (taulell[fila][col]==jugador){
						contador++;
					} else {
    					contador = 0;
    				}

					if (contador == 3){
						return true;
					}
				}
    		}
    		contador = 0;
    		for(int fila=0; fila<taulell.length; fila++){
    			for(int col=0; col<taulell[0].length; col++){
    				if (taulell[fila][col]==jugador && fila==col){
    					contador++;
    				}
    			}
    			if (contador == 3){
    				return true;
    			}                                                                
    		}
    		contador = 0;
    		for(int fila=0; fila<taulell.length; fila++){
    			for(int col=0; col<taulell[0].length; col++){
    				if ((taulell[fila][col]==jugador) && ((fila==0 && col==2) || (fila==1 && col==1) || (fila==2 && col==0))){
    					contador++;
    				}
    			}
    			if (contador == 3){
    				return true;
    			}                                                           
    		}
    		return false;
    }
    public static boolean hiHaEmpat(char[][] taulell){
    	for(int fila=0; fila<3; fila++){
			for(int col=0; col<3; col++){
				if (taulell[col][fila]=='·'){
					return false;
				}
			}
		}
    	return true;
    }

    public static void main(String[] args) {
        // declara i inicialitza el taulell
        char[][] taulell = new char[3][3];
        for(int fila=0; fila<taulell.length; fila++){
			for(int col=0; col<taulell[0].length; col++){
				taulell[fila][col] ='·';
			}
		}

        System.out.println("Comença el joc");

        // indica quin és el jugador que té el torn
        char jugador = 'X';
        int valor1 = 3;
        int valor2 = 3;
        boolean guanyador = false;
        boolean empat = false;

        while (!guanyador && !empat) {
        
            mostraTaulell(taulell);
			System.out.println(jugador + "?");
            // obté el moviment del jugador actual
            
            boolean entradaCorrecta = false;
            boolean ocupada = true;
            
            
            while(!entradaCorrecta || ocupada){
            	String entrada = Entrada.readLine();
            	if (entrada.equals("a")){
            		System.out.println(jugador + " abandona");
            		return;
            	}
            	if (entrada.length()!=2){
            		System.out.println("Error");
					//entrada = Entrada.readLine();
				} else {
					String uno = "" + entrada.charAt(0);
					String dos = "" + entrada.charAt(1);
					if (((uno.charAt(0) < 48) || (uno.charAt(0)>57)) || ((dos.charAt(0) < 48) || (dos.charAt(0)>57))){
						System.out.println("Error");
					} else {
						valor1 = Integer.parseInt(uno);
						valor2 = Integer.parseInt(dos);
						
						if ((valor1!=0 && valor1!=1 && valor1!=2) || (valor2!=0 && valor2!=1 && valor2!=2)){
							System.out.println("Error");
							//entrada = Entrada.readLine();
						} else {
							entradaCorrecta = true;
						}
					}
				}
				if (entradaCorrecta){
						ocupada = casellaOcupada(taulell, valor1, valor2);
						
						if (ocupada){
							ocupada = true;
							System.out.println("Ocupada");
							//entrada = Entrada.readLine();
						}
				}
            }           

            // realitza el moviment
            taulell[valor1][valor2] = jugador;

            // comprova jugador guanya
            guanyador = jugadorGuanya(taulell, jugador);
            if (guanyador){
            	mostraTaulell(taulell);
            	System.out.println("Ha guanyat " + jugador);
            }

            // comprova empat
            empat = hiHaEmpat(taulell);
            if (empat){
            	System.out.println("Empat");
            }

            // passa torn a l'altre jugador
            if (jugador =='X'){
            	jugador = 'O';
            } else {
            	jugador = 'X';
            }
        }

    }
}
