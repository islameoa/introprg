/*Programa que retorna true si una lletra es vocal i false en cas contrari*/


public class UtilString {
    
    public static boolean nomesLletres(char lletra) {
    		String vocals = "aeiouàèéíïòóúüAEIOUÀÈÉÍÏÒÓÚÜ";
    		for (int i = 0; i < vocals.length(); i++){
    			if (vocals.charAt(i)==lletra){
    				return true;
    			}
    		}
    		return false;
    }
    public static String nomesLletres(String text){
    		String nomesLletres = "";
    		for (int i=0; i<text.length(); i++){
    			char a = text.charAt(i);
    			if (Character.isLetter(a)){
    				nomesLletres += a;
    			}
    		}
    		return nomesLletres;
    }
    public static String lletresSeparades(String text){
    		String lletresSeparades = "";
    		for (int i = 0; i< text.length(); i++){
    			char a = text.charAt(i);
    			if (i == text.length()-1){
    				lletresSeparades += a;
    			} else {
    				lletresSeparades += a;
    				lletresSeparades += ", ";
    			}
    		}
    		return lletresSeparades;
    		
    }
    
    public static String intervalString(String text, int inici, int fi){
    		String interval = "";
    		if (inici>fi){
    			if(inici>text.length()-1){
    				inici = text.length()-1;
    			}
    			if (fi<0){
    				fi = 0;
    			}
    			for(int i=inici; i>=fi; i--){
    				char a = text.charAt(i);
    				interval += a;
    			}
    			return interval;
    		}
    		if (inici<fi){
    			if(fi>text.length()-1){
    				fi = text.length()-1;
    			}
    			if (inici<0){
    				inici = 0;
    			}
    			for(int i=inici; i<=fi; i++){
    				char a = text.charAt(i);
    				interval += a;
    			}
    			return interval;
    		}
    		if (inici==fi){
    			interval += text.charAt(inici);
    			return interval;
    		}
    		return interval;
    		
    }
    
    public static boolean esEnter(String nombre){
    		   boolean isNumeric = true;
		   for (int i = 0; i < nombre.length(); i++) {
		       if (!Character.isDigit(nombre.charAt(i))) {
		           isNumeric = false;
		       }
		   }
		   return isNumeric;
    }
    
    public static String entreComes(int[] numeros, char separador){
    		String entreComes = "";
    		entreComes += Integer.toString(numeros[0]);
    		if (numeros.length>0){
    			for (int i=1; i<numeros.length; i++){
    			entreComes += separador + " ";
    			entreComes += Integer.toString(numeros[i]);
    			}
    		}
    		return entreComes;
    }
    
    
    
    
    
}
