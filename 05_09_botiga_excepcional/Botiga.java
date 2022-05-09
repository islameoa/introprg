/*
*Primera versio de la class Botiga, treballa amb arrays de vins, permet guardar nous vins als arrays i cercarlos dins dels arrays.
*Actualment no disposa d'execucio propia.
*/
public class Botiga {
    private int DEFAULT_MAX_VINS = 10;
    private Vi vins[];
    private int apuntador = -1;

    public int getApuntador() {
        return this.apuntador;
    }

    public void setApuntador(int apuntador) {
        this.apuntador = apuntador;
    }

    // constructor de la classe botiga que seteja el maxim de vins a 10
    public Botiga() {
        vins = new Vi[DEFAULT_MAX_VINS];
    }

    // constructor de la classe botiga que rep el nombre de vins màxim i si es major
    // que zero crea el nou array
    public Botiga(int maxVins) throws Exception {
        try {
            vins = new Vi[maxVins];
        } catch (IllegalArgumentException e) {
            System.out.println("No es pot crear una botiga amb menys d'un vi");
        } catch (Exception e) {
            System.out.println("No es pot crear una botiga");
        }
    }

    // mòdul afegeix que afegeix un vi a l'array
    public Vi afegeix(Vi vi) throws Exception {
        try {
            boolean elegible = true;
            if (vi == null) {
                throw new Exception("El vi no pot ser null");
            }
            if (apuntador == vins.length - 1) {
                throw new BotigaException();
            }
            if (vi.esValid()) {
                for (int i = 0; i < vins.length; i++) {
                    if (vins[i] != null) {
                        if (vins[i].getRef().equals(vi.getRef())) {
                            elegible = false;
                            throw new Exception("Referència de vi repetida");
                        }
                    }
                }
                if (elegible) {
                    for (int i = 0; i < vins.length; i++) {
                        if (vins[i] == null) {
                            vins[i] = vi;
                            return vi;
                        }
                    }
                }
            } else {
                throw new Exception("El vi ha de ser vàlid");
            }
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // mòdul cerca que rep el nom d'un vi i si el troba el retorna
    public Vi cerca(String ref) throws Exception{
        try {
            ref = Vi.normalitzaString(ref).toLowerCase();
            for (int i = 0; i < vins.length; i++) {
                if (vins[i] != null) {
                    String vi = vins[i].getRef().toLowerCase();
                    if (vi.equals(ref)) {
                        return vins[i];
                    }
                }
            }
            return null;
        } catch (IllegalArgumentException e) {
            System.out.println("La referència no pot ser null");
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Vi cerca(Vi plantilla) throws Exception{
        try {
            for (Vi vi : vins) {
                if (vi == null)
                    continue;
                if (vi.getPreu() == plantilla.getPreu())
                    return vi;
                if (plantilla.getRef() != null && !plantilla.getRef().equalsIgnoreCase(vi.getRef()))
                    continue;
    
                if (plantilla.getNom() != null && !plantilla.getNom().equalsIgnoreCase(vi.getNom()))
                    continue;
    
                if (plantilla.getPreu() >= 0 && plantilla.getPreu() <= vi.getPreu())
                    continue;
    
                if (plantilla.getEstoc() >= 0 && plantilla.getEstoc() > vi.getEstoc())
                    continue;
    
                if (plantilla.getTipus() != null && !plantilla.getTipus().equalsIgnoreCase(vi.getTipus()))
                    continue;
    
                if (plantilla.getOrigen() != null && !plantilla.getOrigen().equalsIgnoreCase(vi.getOrigen()))
                    continue;
    
                if (plantilla.getLloc() != null && !plantilla.getLloc().equalsIgnoreCase(vi.getLloc()))
                    continue;
    
                if (plantilla.getCollita() != null && !plantilla.getCollita().equalsIgnoreCase(vi.getCollita()))
                    continue;
    
                return vi;
            }
            return null;
        } catch (IllegalArgumentException e) {
            System.out.println("La plantilla no pot ser null");
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // mòdul elimina que rep el nom d'un vi i l'elimina de l'array si el troba
    public Vi elimina(String ref) throws Exception{      
        try {
            ref = Vi.normalitzaString(ref);
            if (ref != null) {
                // ref = ref.toLowerCase();
                for (int i = 0; i < vins.length; i++) {
                    if (vins[i] != null) {
                        if (vins[i].getRef().equalsIgnoreCase(ref)) {
                            if (vins[i].getEstoc() > 0) {
                                System.out.println("El vi a eliminar no pot tenir estoc");
                                return null;
                            } else {
                                Vi vi = vins[i];
                                vins[i] = null;
                                return vi;
                            }
                        }
                    }
                }
            } else {
                System.out.println("La referència no pot ser null");
            }
            System.out.println("La instància a eliminar ha d'estar present");
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // comença el recorregut dels vins de la botiga
    public void iniciaRecorregut() {
        setApuntador(-1);
    }

    // retorna el segÜent vi del recorregut de la botiga
    public Vi getSeguent() {
        if (getApuntador() < vins.length - 1) {
            setApuntador(getApuntador() + 1);
        }

        while (vins[getApuntador()] == null && getApuntador() < vins.length - 1) {
            setApuntador(getApuntador() + 1);
        }

        return vins[getApuntador()];
    }
}
