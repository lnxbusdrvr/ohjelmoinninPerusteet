/*
 *
 * Tehtäväpohjassa on luokka Henkilo, johon liittyy Paivays-olio. 
 * Lisää luokalle Henkilo metodi 
 * public boolean equals(Object verrattava), 
 *
 * jonka avulla voidaan verrata henkilöiden samuutta. 
 * Vertailussa tulee verrata kaikkien henkilön muuttujien 
 * yhtäsuuruutta (ml. syntymäpäivä).
 *
 */

import java.util.Objects;

public class Henkilo {

    private String nimi;
    private Paivays syntymaPaiva;
    private int pituus;
    private int paino;

    public Henkilo(String nimi, Paivays syntymaPaiva, int pituus, int paino) {
        this.nimi = nimi;
        this.syntymaPaiva = syntymaPaiva;
        this.pituus = pituus;
        this.paino = paino;
    }

    // toteuta tänne equals-metodi, jolla tarkastellaan olioiden samuutta
    public boolean equals(Object verrattava) {
        // Sijaitanko samassa paikassa
        if(this == verrattava) {
            return true;
        }
        // Onko Henkilötyyppi
        if(!(verrattava instanceof Henkilo)) {
            return false;
        }
        
        // Tyyppimuunnos
        Henkilo verrattavaHlo = (Henkilo)verrattava;
        
        // arsinainen vertailu
        if(this.nimi.equals(verrattavaHlo.nimi)
          && this.paino == verrattavaHlo.paino
        && this.pituus == verrattavaHlo.pituus
        && this.syntymaPaiva.equals(verrattavaHlo.syntymaPaiva)) {
            return true;
        }else{
            return false;
        }
    }
}
