public class MesosAnys {
    public static void main(String args []) {
        int mes;
        int any;
        int mesImpAnt=0;
        int anyImpAnt=0;
        int mesImpSeg=0;
        int anyImpSeg=0;
        
        System.out.println("Mes?");
        mes = Integer.parseInt(Entrada.readLine());
        System.out.println("Any?");
        any = Integer.parseInt(Entrada.readLine());
        
        if (mes == 1){
            mesImpAnt = 12;
            anyImpAnt = any - 1;
            mesImpSeg = mes + 1;
            anyImpSeg = any;
            } else if (mes == 12){
                mesImpSeg = 1;
                anyImpSeg = any + 1;
                mesImpAnt = mes - 1;
                anyImpSeg = any;
                } else {
                    mesImpAnt = mes - 1;
                    anyImpAnt = any;
                    mesImpSeg = mes + 1;
                    anyImpSeg = any;
                    }
         
         System.out.println("Anterior " + mesImpAnt + "/" + anyImpAnt + " i posterior " + mesImpSeg + "/" + anyImpSeg);
    }
}
