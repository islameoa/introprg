import java.lang.reflect.Constructor;

public class UllDeGat {

    public boolean posicio = false;

    public UllDeGat() {
    }

    public UllDeGat(boolean posicio) {
        if (posicio == true) {
            this.posicio = true;
        } else {
            this.posicio = false;
        }
    }

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