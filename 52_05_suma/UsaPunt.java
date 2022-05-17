/*Classe UsaPunt que ens servirà per probar la classe punt al prgtessst*/
public class UsaPunt {
    public static void main(String[] args) {
        Punt punt = new Punt();

        int x = 0;
        int y = 0;
        if (args.length == 2) {
            if (UtilString.esEnter(args[0])) {
                x = Integer.parseInt(args[0]);
            }
            if (UtilString.esEnter(args[1])) {
                y = Integer.parseInt(args[1]);
            }
        } else if (args.length == 1) {

            x = Integer.parseInt(args[0]);
        }
        punt.setX(x);
        punt.setY(y);
        System.out.printf("punt.getX() -> %d%n", punt.getX());
        System.out.printf("punt.getY() -> %d%n", punt.getY());
    }
}
