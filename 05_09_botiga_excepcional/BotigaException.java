@SuppressWarnings("serial")
    public class BotigaException extends Exception {
        public BotigaException(){
            super("Botiga plena");
        }
        public BotigaException(String msg){
            super(msg);
        }
    }