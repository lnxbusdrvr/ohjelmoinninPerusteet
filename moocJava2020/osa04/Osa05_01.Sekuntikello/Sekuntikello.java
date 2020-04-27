/*
 * Tehtäväpohjassa tulee edellä kuvattu luokka Viisari.
 * Toteuta materiaalin Kello-luokkaa mukaillen luokka Sekuntikello.
 *
 * Sekuntikellossa on kaksi viisaria.
 * Yksi sadasosasekunneille ja yksi sekunneille.
 * Sekuntikellon edetessä sadasosasekuntien määrä kasvaa yhdellä.
 * Kun sadasosasekunteja vastaava viisari saavuttaa arvon sata,
 * viisarin arvo nollaantuu ja sekuntien määrä kasvaa yhdellä.
 * Vastaavasti, kun sekunteja vastaava viisari saavuttaa arvon kuusikymmentä,
 * viisarin arvo nollaantuu.
 *
 * public Sekuntikello() luo uuden sekuntikellon.
 * public String toString() palauttaa sekuntikellon merkkijonoesityksen.
 *
 * Merkkijonoesityksen tulee olla muotoa "sekunnit:sadasosasekunnit",
 * missä sekä sekunnit että sadasosasekunnit esitetään kahdella numerolla.
 * Esimerkiksi merkkijono "19:83" kuvastaisi aikaa 19 sekuntia,
 * 83 sadasosasekuntia.
 * public void etene()
 * siirtää kelloa yhden sadasosasekunnin eteenpäin.
 *
 */
 
 
public class Sekuntikello {
    private Viisari sekuntti;
    private Viisari sadasOsaSekuntti;
    
    public Sekuntikello() {
        this.sekuntti = new Viisari(60);
        this.sadasOsaSekuntti = new Viisari(100);
    }
    
    public void etene() {
        this.sadasOsaSekuntti.etene();
        
        if(this.sadasOsaSekuntti.arvo() == 0) {
            this.sekuntti.etene();
        }
    }
    
    public String toString() {
        return this.sekuntti+":"+this.sadasOsaSekuntti;
    }
}

