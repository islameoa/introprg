/*Exercici en el que declarem la classe GatRenat que tindrà com a propietat posició i diversos mòduls per gestionar-la*/

public class GatRenat {
    private GatPosicio posicio;
    public GatRenat(GatPosicio pos){
        posicio = pos;
    }

    public GatRenat(String pos){
        posicio = GatPosicio.fromString(pos);
    }

    public GatPosicio getPosicio(){
        return posicio;
    }

    public void setPosicio(GatPosicio pos){
        try {
            posicio = pos;
        } catch (Exception e) {
            System.out.println("Posició incorrecta");
        }
    }

    public void setPosicio(String pos){
        posicio = GatPosicio.fromString(pos);
    }
}
