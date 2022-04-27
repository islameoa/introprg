import java.security.PublicKey;

/*Exercici en el que declarem la classe GatRenat que tindrà com a propietat posició i diversos mòduls per gestionar-la*/

public class GatRenat {
    private GatPosicio posicio = GatPosicio.ESTIRAT;

    public GatRenat() {

    }

    public GatRenat(GatPosicio pos) {
        posicio = pos;
    }

    public GatRenat(String pos) {
        posicio = GatPosicio.fromString(pos);
    }

    public GatPosicio getPosicio() {
        return posicio;
    }

    public void setPosicio(GatPosicio pos) {
        posicio = pos;
        // try {
        // posicio = pos;
        // } catch (Exception e) {
        // throw new IllegalArgumentException(String.format("Nom \"%s\" no suportat per
        // GatPosicio", pos));
        // }
    }

    public void setPosicio(String pos) {
        posicio = GatPosicio.fromString(pos);
    }
}
