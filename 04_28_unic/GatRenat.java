/*Programa que tindrà diversos constructors amb diferents arguments per posar-ho a prova*/
public class GatRenat {
    private static int vides = 7;
    private static String posicio = "estirat";
    private static GatRenat instancia;

    private GatRenat(){}

    private GatRenat(int vides) {
        setVides(vides);
    }

    private GatRenat(String posicio) {
        setPosicio(posicio);
    }

    private GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }

    public static GatRenat getInstancia() {
        if (instancia == null) {
            return instancia = new GatRenat();
        }
        return instancia;
    }

    public static GatRenat getInstancia(int vides) {
        if (instancia == null) {
            return instancia = new GatRenat(vides);
        }
        instancia = new GatRenat(vides);
        return instancia;
    }

    public static GatRenat getInstancia(String posicio) {
        if (instancia == null) {
            return instancia;
        }
        instancia = new GatRenat(posicio);
        return instancia;
    }

    public static GatRenat getInstancia(int vides, String posicio) {
        if (instancia == null) {
            instancia = new GatRenat(vides, posicio);
        }
        instancia = new GatRenat(vides, posicio);
        return instancia;
    }

    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }

    public int getVides() {
        return vides;
    }

    public String getPosicio() {
        return posicio;
    }

    public void setPosicio(String posicio) {
        if (posicio.equals("estirat") || posicio.equals("dret") || posicio.equals("assegut")) {
            this.posicio = posicio;
        } else {
            this.posicio = "estirat";
        }
    }

    public void setVides(int vides) {
        if (vides >= 0) {
            this.vides = vides;
        }
    }
}