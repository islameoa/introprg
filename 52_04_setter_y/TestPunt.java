
/* CLasse TestPunt que ens crea els diversos test per la classe punt */

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestPunt {
    @Test
    public void constructor() {
        new Punt();
    }

    @Test
    public void constructorDefecteXZero() {
        Punt p = new Punt();
        Assertions.assertEquals(0, p.getX());
    }

    @Test
    public void constructorDefecteYZero() {
        Punt p = new Punt();
        Assertions.assertEquals(0, p.getY());
    }
    @Test
    public void setX42() {
        Punt p = new Punt();
        p.setX(42);
        Assertions.assertEquals(42, p.getX());
    }
    @Test
    public void setY42() {
        Punt p = new Punt();
        p.setY(24);
        Assertions.assertEquals(24, p.getY());
    }
}
