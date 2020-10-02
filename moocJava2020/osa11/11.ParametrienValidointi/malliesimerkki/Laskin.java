package validointi;
 
public class Laskin {
 
    public int kertoma(int luvusta) {
        if (luvusta < 0) {
            throw new IllegalArgumentException("Kertoma voidaan laskea vain ei-negatiivisille luvuille.");
        }
 
        int kertoma = 1;
        for (int i = 1; i <= luvusta; i++) {
            kertoma *= i;
        }
 
        return kertoma;
    }
 
    public int binomikerroin(int joukonKoko, int osaJoukonKoko) {
        if (joukonKoko < 0) {
            throw new IllegalArgumentException("Binomikerrointa laskettaessa joukon koon "
                    + "tulee olla 0 tai suurempi.");
        }
 
        if (osaJoukonKoko < 0) {
            throw new IllegalArgumentException("Binomikerrointa laskettaessa osajoukon koon "
                    + "tulee olla 0 tai suurempi.");
        }
 
        if (osaJoukonKoko > joukonKoko) {
            throw new IllegalArgumentException("Binomikerrointa laskettaessa joukon koon "
                    + "tulee olla suurempi kuin osajoukon koko.");
        }
 
        int osoittaja = kertoma(joukonKoko);
        int nimittaja = kertoma(osaJoukonKoko) * kertoma(joukonKoko - osaJoukonKoko);
 
        return osoittaja / nimittaja;
    }
}
 
