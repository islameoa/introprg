/*Classe gatrenat que fa neixer el gatrenat sense picarol i que se'l posa i se'l treu amb els mòduls posaPicarol i treuPicarol */

public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    private Picarol picarol;

    public void setPicarol(Picarol picarol) {
        this.picarol = picarol;
    }

    public Picarol getPicarol() {
        return picarol;
    }

    public static void main(String[] args) {
        Picarol picarol = new Picarol();
        picarol.sona(); // el picarol funciona fins i tot sense gat!
        GatRenat renat = new GatRenat();
        renat.aixecat();
        renat.posaPicarol(picarol);
        renat.seu(); // ha de sonar el picarol
        renat.seu(); // no sona el picarol doncs no es mou!
        renat.treuPicarol();
        renat.estirat(); // no sona el picarol doncs ja no el té
        System.out.println("Nombre de cops que sona el picarol: " + picarol.quantsCops());
    }

    // metodo Picarol posaPicarol que le assigna un picarol, si no te cap picarol, el posa

    public Picarol posaPicarol(Picarol picarol) {
        if (!tePicarol()) {
            setPicarol(picarol);
            return null;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        } else {
            Picarol anticPicarol = new Picarol();
            anticPicarol = getPicarol();
            setPicarol(picarol);
            return anticPicarol;
        }
    }

    public Picarol treuPicarol(){
        if (!tePicarol()) {
            return null;
        } else {
            Picarol anticPicarol = getPicarol();
            this.picarol = null;
            return anticPicarol;
        }
    }

    // metodo booleano tePicarol que retorna true si te picarol, false en cas contrari
    public boolean tePicarol() {
        if (picarol == null) {
            return false;
        } else {
            return true;
        }
    }

    public GatRenat() {
        //picarol = null;
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
        if (!posicio.equals("dret")) {
            posicio = "dret";
            if (tePicarol()) {
                picarol.sona();
            }
        }
    }

    public void estirat() {
        if (!posicio.equals("estirat")) {
            posicio = "estirat";
            if (tePicarol()) {
                picarol.sona();
            }
        }
    }

    public void seu() {
        if (!posicio.equals("assegut")) {
            posicio = "assegut";
            if (tePicarol()) {
                picarol.sona();
            }
        }
    }
}
