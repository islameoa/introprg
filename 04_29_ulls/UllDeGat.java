/*Classe UllDeGat que te una propietat que indica la posicio de l'ull, true si està obert, false si està tancat i mòduls per obrir-lo o tancar-lo*/
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
