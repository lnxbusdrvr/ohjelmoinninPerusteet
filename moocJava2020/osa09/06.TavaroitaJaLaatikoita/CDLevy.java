

/**
 *
 * @author vadenn
 */
public class CDLevy implements Talletettava {
    String artisti;
    String albumi;
    int julkaisuvuosi;
    double paino;
    
    public CDLevy(String artisti, String albumi, int julkaisuvuosi) {
        this.artisti = artisti;
        this.albumi = albumi;
        this.julkaisuvuosi = julkaisuvuosi;
        this.paino = 0.1;
    }

    @Override
    public double paino() {
        return this.paino;
    }
    
    @Override
    public String toString() {
        return this.artisti+": "+this.albumi+" ("+this.julkaisuvuosi+")";
    }
    
}
