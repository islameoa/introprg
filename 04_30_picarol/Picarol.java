public class Picarol {
    private int cops = 0;

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