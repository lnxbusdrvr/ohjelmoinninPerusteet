/*
 *
 * Osa 1: Seuraava päivä 
 * ---------------------
 *
 * Toteuta metodi 
 * public void etene(), 
 *
 * joka siirtää päiväystä yhdellä päivällä. 
 * Tässä tehtävässä oletetaan, että jokaisessa kuukaudessa on 30 päivää. 
 *
 * Huom! 
 * Sinun tulee tietyissä tilanteissa muuttaa kuukauden ja vuoden arvoa.
 *
 * Osa 2: Tietty määrä päiviä eteenpäin
 * ------------------------------------
 *
 * Toteuta metodi 
 * public void etene(int montakoPaivaa), 
 *
 * joka siirtää päiväystä annetun päivien määrän verran. 
 * Käytä apuna edellisessä tehtävässä toteutettua metodia etene().
 *
 * Osa 3: Ajan kuluminen
 * ---------------------
 *
 * Lisätään Paivays-olioon mahdollisuus edistää aikaa. 
 * Tee oliolle metodi 
 * Paivays paivienPaasta(int paivia), joka luo uuden Paivays-olion, 
 * jonka päiväys on annetun päivien lukumäärän verran suurempi 
 * kuin oliolla, jolle sitä kutsuttiin. 
 *
 * Voit edelleen olettaa, että jokaisessa kuukaudessa on 30 päivää. 
 * Huomaa, että vanhan päiväysolion on pysyttävä muuttumattomana!
 * 
 * Koska metodissa on luotava uusi olio, 
 * tulee rungon olla suunnilleen seuraavanlainen:
 *
 * public Paivays paivienPaasta(int paivia) {
 *     Paivays uusiPaivays = new Paivays( ... );
 *
 *     // tehdään jotain...
 *     return uusiPaivays;
 * }
 *
 */

public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi &&
                 this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }

}
