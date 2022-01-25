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
    			lletresSeparades += a;
    			lletresSeparades += " ";
    		}
    		return lletresSeparades;
    } 
}
