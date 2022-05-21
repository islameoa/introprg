/***Classe Zoo Utils que contindrà mètodes per a facilitar la interacció entre Zoo i usa zoo */
import java.util.List;

public class ZooUtils {
    public static void mostraCategories(List<Categoria> categories) {
        if (categories.isEmpty()) {
            System.out.println("Cap categoria");
        } else {
            System.out.println("Nombre de categories: " + categories.size());
        }
        for (Categoria categoria : categories) {
            System.out.println("\t" + categoria);
        }
        
    }
}
