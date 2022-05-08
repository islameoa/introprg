//prpgrama que ens permetra introduir una hora i probar el llançament de les excepcions
public class UsaHora {
    public static void main(String[] args) throws Exception {
        System.out.println("Intentarem crear una hora amb valors no vàlids");
        try {
            Hora hora = new Hora(-1, 1, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Argument il·legal!");
        }
    }
}