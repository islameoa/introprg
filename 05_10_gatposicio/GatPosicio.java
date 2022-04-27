/*Enumerat GatPosicio que conté les 3 possibles posicions i el mètode fromString per passar de string a enu*/
public enum GatPosicio {
    DRET, ASSEGUT, ESTIRAT;
    @Override
    public static GatPosicio fromString(String nom) {
        for (GatPosicio posicio: GatPosicio.values()) {
            if (posicio.name().equalsIgnoreCase(nom)) return posicio;
        }
        throw new IllegalArgumentException(String.format("Nom \"%s\" no suportat per GatPosicio", nom));
    }
}
