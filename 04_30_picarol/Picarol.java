/*Classe picarol que conté la propietat cops, cops que sona el picarol, metode sona per fer-lo sonar i mètode quants cops per saber el nombre de cops que ha sonat */
public class Picarol {
    private static int cops = 0;

    // metodo suena que muestra el mensaje "clink-clink" en la consola
    public void sona() {
        cops++;
        System.out.println("clink-clink");
    }

    // metodo que devuelve cops
    public int quantsCops() {
        return cops;
    }

}