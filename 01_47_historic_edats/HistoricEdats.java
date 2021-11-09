/* Programa que demana el nom d’una persona, la seva edat i l’any actual, 
i escriu l’edat que tenia la persona cada any des del seu naixement.*/

public class HistoricEdats{
    public static void main(String[] args){
        
        System.out.println("nom?");
        String nom = Entrada.readLine();
        System.out.println("edat?");
        int edat = Integer.parseInt(Entrada.readLine());
        System.out.println("any actual?");
        int any = Integer.parseInt(Entrada.readLine());
                
        if (nom.isEmpty() || (edat < 0) || (any < 1971) || (any > 2022)){
            System.out.println("Entrada errònia");
        } else if (edat == 0){
            System.out.println("Adéu " + nom);        
        } else {
            int anyNaix = any - edat;
            int any1 = anyNaix + 1;
            
            System.out.println("El " + anyNaix + " va néixer");
            System.out.println("El " + any1  + " tenia 1 any");
            
            for (int i = 2; i < edat; i++){
                any1++;
                System.out.println("El " + any1 + " tenia " + i + " anys");
                
            }
            System.out.println("Adéu " + nom);
        }
    }
}
