package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

/**
 *
 * @author lnxbusdrvr
 */
public abstract class Hahmo {
    
    private Polygon hahmo;
    private Point2D liike;

    public Hahmo(Polygon monikulmio, int x, int y) {
        this.hahmo = monikulmio;
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
    
    public boolean tormaa(Hahmo toinen) {
        Shape tormaysalue = Shape.intersect(this.hahmo, toinen.getHahmo());
        return tormaysalue.getBoundsInLocal().getWidth() != -1;
    }
    
}
