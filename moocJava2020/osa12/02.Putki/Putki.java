
import java.util.ArrayList;

public class Putki<T> {
  ArrayList<T> putket;
  
  public Putki() {
    this.putket = new ArrayList<>();
  }

  public void lisaaPutkeen(T arvo) {
    this.putket.add(arvo);
  }

  public T otaPutkesta() {
      if(this.putket.isEmpty()) {
        return null;
      }
      // Sijoita putkessa pisimpään ollut
      T oliPutkessa = this.putket.get(0);
      // Ota putkesta (pois)
      this.putket.remove(0);

      return oliPutkessa;
  }
  
  public boolean onkoPutkessa() {
      if(this.putket.isEmpty()) {
          return false;
      }
      return true;
  }

}
