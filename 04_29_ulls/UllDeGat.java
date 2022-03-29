public class UllDeGat {

    public boolean posicio = false;

    public void obret() {
        posicio = true;
    }

    public void tancat() {
        posicio = false;
    }

    public boolean estaObert() {
        if (posicio) {
            return true;
        }
        return false;
    }
}