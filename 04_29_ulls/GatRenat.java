/* */

public class GatRenat {

    public UllDeGat ullDret;
    public UllDeGat ullEsquerre;
    private int vides = 7;
    private String posicio = "estirat";

    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        UllDeGat ullDret = renat.getUllDret();
        UllDeGat ullEsquerre = renat.getUllEsquerre();

        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().estaObert(),
                renat.getUllEsquerre().estaObert());
        renat.seu();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().estaObert(),
                renat.getUllEsquerre().estaObert());
        renat.aixecat();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().estaObert(),
                renat.getUllEsquerre().estaObert());
    }

    public GatRenat() {
    }

    public UllDeGat getUllDret(){
        ullDret = new UllDeGat();
        if (posicio.equals("estirat")) {
            ullDret.tancat();
        } else if (posicio.equals("assegut")){
            ullDret.obret();
        } else {
            ullDret.obret();
        }
        return ullDret;
    }

    public UllDeGat getUllEsquerre() {
        ullEsquerre = new UllDeGat();
        if (posicio.equals("estirat")) {
            ullEsquerre.tancat();
        } else if (posicio.equals("assegut")){
            ullEsquerre.tancat();
        } else {
            ullEsquerre.obret();
        }
        return ullEsquerre;
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

    public GatRenat(String posicio) {
        setPosicio(posicio);
    }

    public void aixecat() {
        posicio = "dret";
    }

    public void estirat() {
        posicio = "estirat";
    }

    public void seu() {
        posicio = "assegut";
    }
}