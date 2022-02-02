/*Programa que retorna true si una lletra es vocal i false en cas contrari*/


public class UtilString {
    
    public static boolean esVocal(char lletra) {
    		String vocals = "aeiouàèéíïòóúüAEIOUÀÈÉÍÏÒÓÚÜ";
    		for (int i = 0; i < vocals.length(); i++){
    			if (vocals.charAt(i)==lletra){
    				return true;
    			}
    		}
    		return false;
    }
}
