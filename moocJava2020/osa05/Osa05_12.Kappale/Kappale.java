/*
 *
 * Tehtäväpohjassa on luokka Kappale, 
 * jonka perusteella voidaan luoda musiikkikappaleita esittäviä olioita. 
 *
 * Lisää luokkaan kappale metodi equals, 
 * jonka avulla voidaan tarkastella musiikkikappaleiden samankaltaisuutta.
 *
 */

public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }
    
    public boolean equals(Object verrattava) {
        // Tehdään tarvittavat toimenpiteet ennen vertailua
        // jos muuttujat sijaitsevat samassa paikassa, ovat ne samat
        if (this == verrattava) {
            return true;
        }

        // jos verrattava olio ei ole Henkilo-tyyppinen, oliot eivät ole samat
        if (!(verrattava instanceof Kappale)) {
            return false;
        }

        // muunnetaan olio Kappale-olioksi
        Kappale verrattavaKappale = (Kappale)verrattava;
        
        
        if(this.esittaja.equals(verrattavaKappale.esittaja)
                && this.nimi.equals(verrattavaKappale.nimi)
        && this.pituusSekunteina == verrattavaKappale.pituusSekunteina) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }
}
