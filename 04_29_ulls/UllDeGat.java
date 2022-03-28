public class UllDeGat {

    private String ull = "tancat";
    
    public UllDeGat(){}
    
    public String getUll() {
        return ull;
    }

    public void obret() {
        ull = "obert";
    }

    public void tancat(){
        ull = "tancat";
    }

    public boolean estaObert(){
        if (getUll()=="obert") {
            return true;
        }
        return false;
    }
}