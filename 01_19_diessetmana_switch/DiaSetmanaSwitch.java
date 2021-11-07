/*Programa que demana per entrada estàndard un nombre de l'1 al 7 i
 mostra el dia de la setmana corresponent amb un switch*/


public class DiaSetmanaSwitch {
    public static void main(String[] args) {
        System.out.println("Introdueix un nombre de l'1 al 7: ");
        int dia;
        dia = Integer.parseInt(args[0]);
        String diaEscrit;
        
        switch(dia){
        
        case 1: diaEscrit = "Dilluns";
                break;
        case 2: diaEscrit = "Dimarts";
                break;
        case 3: diaEscrit = "Dimecres";
                break;
        case 4: diaEscrit = "Dijous";
                break;
        case 5: diaEscrit = "Divendres";
                break;
        case 6: diaEscrit = "Dissabte";
                break;
        case 7: diaEscrit = "Diumenge";
                break;
        default: diaEscrit = "Error";
        
        }
        System.out.println(diaEscrit);
    }       
}
