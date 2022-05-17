/*Classe TestSegment que ens permetrà provar la programació amb TDD perquè farem els test abans de programar res */
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestSegment {
    @Test
    public void constructorPerDefecte() {
        Segment seg = new Segment();
        Assertions.assertAll(
            () -> Assertions.assertEquals(0, seg.getP1().getX()),
            () -> Assertions.assertEquals(0, seg.getP1().getY()),
            () -> Assertions.assertEquals(0, seg.getP2().getX()),
            () -> Assertions.assertEquals(0, seg.getP2().getY())
        );
    }
    @Test 
    public void constructorEspecific() {
        Segment seg = new Segment(new Punt(1, 2), new Punt(3, 4));
        Assertions.assertAll(
            () -> Assertions.assertEquals(1, seg.getP1().getX()),
            () -> Assertions.assertEquals(2, seg.getP1().getY()),
            () -> Assertions.assertEquals(3, seg.getP2().getX()),
            () -> Assertions.assertEquals(4, seg.getP2().getY())
        );
    }
    @Test
    public void testLongitud() {
        Segment seg = new Segment(new Punt(2, 3), new Punt(4, 5));
        Assertions.assertEquals(2.83, Math.round(seg.longitud()*100.0)/100.0);
    }
}
