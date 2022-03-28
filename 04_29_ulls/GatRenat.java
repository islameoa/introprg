public class GatRenat {

    public UllDeGat ullDeGat;
    private int vides = 7;
    private String posicio = "estirat";

    public GatRenat() {
    }

    public UllDeGat getUllDret(){
        ullDeGat.getUll();
    }

    public UllDeGat getUllEsquerre(){
        getPosicio();
    }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }

    public int getVides() {
        return vides;
    }

    public String getPosicio() {
        return this.posicio;
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

    private GatRenat(String posicio) {
        setPosicio(posicio);
    }

    public String aixecat() {
        if (posicio.equals("dret")) {
            return "no faig res";
        }
        posicio = "dret";
        return "m'aixeco";
    }

    public String estirat() {
        if (posicio.equals("estirat")) {
            return "no faig res";
        }
        posicio = "estirat";
        return "m'estiro";
    }

    public String seu() {
        if (posicio.equals("assegut")) {
            return "no faig res";
        }
        posicio = "assegut";
        return "m'assec";
    }

    public static void main(String[] args) {
        // GatRenat renat = new GatRenat();
        // UllDeGat ullDret = renat.getUllDret();
        // UllDeGat ullEsquerre = renat.getUllEsquerre();
        // System.out.printf("Quan està %s: %b + %b%n",
        //         renat.getPosicio(),
        //         renat.getUllDret().estaObert(),
        //         renat.getUllEsquerre().estaObert());
        // renat.seu();
        // System.out.printf("Quan està %s: %b + %b%n",
        //         renat.getPosicio(),
        //         renat.getUllDret().estaObert(),
        //         renat.getUllEsquerre().estaObert());
        // renat.aixecat();
        // System.out.printf("Quan està %s: %b + %b%n",
        //         renat.getPosicio(),
        //         renat.getUllDret().estaObert(),
        //         renat.getUllEsquerre().estaObert());
    }
}