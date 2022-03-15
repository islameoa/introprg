public class Hora {
    private int hores;
    private int minuts;
    private int segons;

    public Hora(){
        this.hores = 0;
        this.minuts = 0;
        this.segons = 0;
    }

    public Hora(int hores, int minuts, int segons) {
        this.hores = hores;
        this.minuts = minuts;
        this.segons = segons;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public void setSegons(int segons) {
        this.segons = segons;
    }

    public int getHores() {
        return hores;
    }

    public int getMinuts() {
        return minuts;
    }

    public int getSegons() {
        return segons;
    }



    /**
     * Compara dues hores i retorna l'operador corresponent
     * Per exemple, si hora1 és menor que hora2, l'operador serà "<". Els
     * altres dos valors possibles són ">" i "=="
     * 
     * @param hora1: primera hora a comparar
     * @param hora2: segona hora a comparar
     * @return operador resultant
     */
    private static String composaOperadorComparacio(Hora hora1, Hora hora2) {
        int comparacio = hora1.compareTo(hora2);
        if (comparacio < 0) {
            return "<";
        } else if (comparacio > 0) {
            return ">";
        } else {
            return "==";
        }
    }

    // Fa que l’hora tingui un segon més
    void incrementa(){

    }

    // Fa que l’hora s’incrementi en el nombre de segons indicats
    void incrementa(int segons){

    }

    // Fa que l’hora tingui un segon menys
    void decrementa(){

    }
    // Fa que l’hora es decrementi en el nombre de segons indicats
    void decrementa(int segons){

    }

    // Compara amb l’hora indicada i retorna <0 si és menor que la indicada, 0 si són iguals i >0 si és més gran que la indicada
    int compareTo(Hora hora){
        return 0;
    }

    // Retorna un String amb l’hora en format h:mm:ss

    @Override
    public String toString() {
        return String.format("%d %02d %02d", getHores(), getMinuts(), getSegons());
    }

    public static void main(String[] args) {
        Hora hora1 = new Hora();
        Hora hora2 = new Hora(0, 0, 2);
        System.out.printf("Inicialment hora1: %s %s hora2: %s%n",
                hora1,
                composaOperadorComparacio(hora1, hora2),
                hora2);
        System.out.println("Incrementem 1 segon a la primera i decrementem 1 segon a la segona");
        hora1.incrementa();
        hora2.decrementa();
        System.out.printf("Finalment hora1: %s %s hora2: %s%n",
                hora1,
                composaOperadorComparacio(hora1, hora2),
                hora2);

    }
}