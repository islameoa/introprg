
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
    public void constructorEspecific() {
        Punt p = new Punt(1, 2);
        Assertions.assertAll(
            () -> assertEquals(1, p.getX()),
            () -> assertEquals(2, p.getY())
        );
    }
    @test
    public void testSuma(Punt p) {
        Punt p1 = new Punt();
        int x = p1.getX();
        int y = p1.getY();
        p1.suma(p);
        Assertions.assertEquals(p1.getX(), p.getX() + x);
        Assertions.assertEquals(p1.getY(), p.getY() + y);
    }
    
}
