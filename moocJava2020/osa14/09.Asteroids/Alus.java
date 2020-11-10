package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;

/**
 *
 * @author lnxbusdrvr
 */
public class Alus {
    private Polygon hahmo;
    private Point2D liike;

    public Alus(int x, int y) {
        this.hahmo = new Polygon(-5, -5, 10, 0, -5, 5);
        //missä kohdassa alus on ruudulla
        this.hahmo.setTranslateX(x);    //Leveys
        this.hahmo.setTranslateY(y);    //Korkeus
        
        this.liike = new Point2D(0, 0);// Paremtreinä nopeus
    }
    
    public Polygon getHahmo() {
        return this.hahmo;
    }
    
    public void kaannaVasemmalle() {
        this.hahmo.setRotate(this.hahmo.getRotate() - 5);
    }
    
    public void kaannaOikealle() {
        this.hahmo.setRotate(this.hahmo.getRotate() + 5);
    }
    
    public void liiku() {
        this.hahmo.setTranslateX(this.hahmo.getTranslateX() + liike.getX());
        this.hahmo.setTranslateY(this.hahmo.getTranslateY() + liike.getY());
    }
    
    public void kiihdyta() {
        double kiihdyX = Math.cos(Math.toRadians(this.hahmo.getRotate()));
        double kiihdyY = Math.sin(Math.toRadians(this.hahmo.getRotate()));
        
        // Hidastetaan liikkumista
        kiihdyX *= 0.01;    // Nopeus 5% 
        kiihdyY *= 0.01;
        
        this.liike = this.liike.add(kiihdyX, kiihdyY);
    }
    
}
