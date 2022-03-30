public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    private Picarol picarol;

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
        if (picarol == null) {
            picarol = null;
        } else {
            picarol = new Picarol();
            this.picarol = picarol;
        }
        return picarol;
    }

    public Picarol treuPicarol(){
        Picarol picarol = this.picarol;
        this.picarol = null;
        return picarol;
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
        picarol = null;
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
