/*Classe Punt on declarem dos propietats, les coordenades, un cconstructor que ens les retorna i uns getters i setter per aquestes coordenades*/

public class Punt {
     private int x = 0;
     private int y = 0;
     
     public Punt(){
        getX();
        getY();
     }
     public int getX(){ 
     return x; 
     }
     
     public int getY(){ 
     return y; 
     }
     
     public void setY(int y){
        this.y = y;
     }
     public void setX(int x){
        this.x = x;
     }
 }
