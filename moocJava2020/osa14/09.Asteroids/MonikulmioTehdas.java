package asteroids;

import java.util.Random;
import javafx.scene.shape.Polygon;

/**
 *
 * @author lnxbusdrvr
 */
public class MonikulmioTehdas {
    // Luodaan satunnaisia monikulmioita, tarkoituksena näyttää asteroideilta
    public Polygon luoMonikulmio() {
        Random satunnainen = new Random();
        
        double koko = 10 + satunnainen.nextInt(10);
        
        // Kaava kulmioiden tekemiseen
        // http://mathworld.wolfram.com/Pentagon.html
        
        Polygon monikulmio = new Polygon();
        double c1 = Math.cos(Math.PI * 2 / 5);
        double c2 = Math.cos(Math.PI / 5);
        double s1 = Math.sin(Math.PI * 2 / 5);
        double s2 = Math.sin(Math.PI * 4 / 5);
        
        monikulmio.getPoints().addAll(
                koko, 0.0,
                koko * c1, -1 * koko *s1,
                -1 * koko * c2, -1 * koko * s2,
                -1 * koko * c2, koko * s2,
                koko * c1, koko * s1);
        // Asetetaan ilmeisesti satunnaiseen järjestykseen
        for(int i = 0; i < monikulmio.getPoints().size(); i++) {
            int muutos = satunnainen.nextInt(5) - 2;
            monikulmio.getPoints().set(i, monikulmio.getPoints().get(i) + muutos);
        }
        
        return monikulmio;
    }
    
}
