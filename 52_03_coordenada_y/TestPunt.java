/*Classe TestPunt que ens crearà el seu test,    h simplement declara un nou punt.*/

import org.junit.Test;
public class TestPunt {
    @Test
    public void constructor() {
        // comprova que Punt() pugui ser cridat
        new Punt();
    }
}
