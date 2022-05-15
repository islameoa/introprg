/* CLasse TestPunt que ens crea els diversos test per la classe punt */
public class TestPunt {
    @Test
    public void constructor() {
        new Punt();
    }
    @@Test
    public void constructorDefecteXZero() {
        Punt p = new Punt();
        Assertions.assertEquals(0, p.getX());
    }
    @Test
    public void constructorDefecteYZero(){
        Punt p = new Punt();
        Assertions.assertEquals(0, p.getY());
    }
}
