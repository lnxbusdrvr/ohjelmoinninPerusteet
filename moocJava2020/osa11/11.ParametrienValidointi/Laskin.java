package validointi;

public class Laskin {

    public int kertoma(int luvusta) {
        int kertoma = 1;
        if(luvusta >= 0) {
            for (int i = 1; i <= luvusta; i++) {
                kertoma *= i;
            }
        }else{
            throw new IllegalArgumentException("Ei negatiivisia lukuja");
        }

        return kertoma;
    }

    public int binomikerroin(int joukonKoko, int osaJoukonKoko) {
        int osoittaja = 0;
        int nimittaja = 0;
        if(joukonKoko >= 0 && osaJoukonKoko >= 0) {
            if(osaJoukonKoko > joukonKoko) {
                osoittaja = kertoma(joukonKoko);
                nimittaja = kertoma(osaJoukonKoko) * 
                        kertoma(joukonKoko - osaJoukonKoko);
            }
        }else{
            throw new IllegalArgumentException("Ei negatiivisia lukuja");
        }

        return osoittaja / nimittaja;
    }
}
