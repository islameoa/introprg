/*Classe Punt on declarem dos propietats, les coordenades, un cconstructor que ens les retorna i uns getters i setter per aquestes coordenades*/

public class Punt {
   private int [] coord = new int[2];
   
   public Punt() {}

   public Punt(int x, int y) {
      coord[0] = x;
      coord[1] = y;
   }

   public int getX() {
      return coord[0];
   }

   public int getY() {
      return coord[1];
   }

   public void setY(int y) {
      this.coord[1] = y;
   }

   public void setX(int x) {
      this.coord[0] = x;
   }

   public void suma(Punt p) {
      coord[0] += p.getX();
      coord[1] += p.getY();
   }

   public String toString() {
      return String.format("Punt(%d, %d)", getX(), getY());
   }
}
