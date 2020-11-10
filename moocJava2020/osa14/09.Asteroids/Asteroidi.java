package asteroids;

import java.util.Random;

/**
 *
 * @author lnxbusdrvr
 */
public class Asteroidi extends Hahmo {
    
    private double pyorimisliike;
    
    public Asteroidi(int x, int y) {
        super(new MonikulmioTehdas().luoMonikulmio(), x, y);
        
        Random satunnainen = new Random();
        
        super.getHahmo().setRotate(satunnainen.nextInt(360));
        
        // Satunnainen kiihdyttäminen
        int kiihdytystenMaara = 1 + satunnainen.nextInt(10);
        
        for(int i = 0; i < kiihdytystenMaara; i++) {
            kiihdyta();
        }
        
        // Satunnainen pyörimisliike
        this.pyorimisliike = 0.5 - satunnainen.nextDouble();       
    }
    
    @Override
    public void liiku() {
        super.liiku();
        super.getHahmo().setRotate(super.getHahmo().getRotate() + this.pyorimisliike);
        
    }
    
    
    
}
