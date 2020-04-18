/*
 * Toteuta ohjelma, joka ensin lukee kirjojen tietoja käyttäjältä.
 * Jokaisesta kirjasta tulee lukea kirjan nimi,
 * sivujen lukumäärä sekä julkaisuvuosi.
 * Kirjojen lukeminen lopetetaan kun käyttäjä syöttää tyhjän kirjan nimen.
 *
 * Tämän jälkeen käyttäjältä kysytään mitä tulostetaan.
 * Jos käyttäjä syöttää merkkijonon "kaikki",
 * tulostetaan kirjojen nimet, sivujen lukumäärät sekä julkaisuvuodet.
 * Jos taas käyttäjä syöttää merkkijonon "nimi", tulostetaan vain kirjojen nimet.
 *
 * Ohjelmaa varten kannattanee toteuttaa yksittäistä kirjaa kuvaava
 * Kirja-luokka.
 *
 * Tehtävä on kokonaisuudessaan kahden tehtäväpisteen arvoinen.
 *
 * Esimerkkitulostus:
 *
 * Nimi: Minä en sitten muutu
 * Sivuja: 201
 * Julkaisuvuosi: 2010
 * Nimi: Nalle Puh ja elämisen taito
 * Sivuja: 100
 * Julkaisuvuosi: 2005
 * Nimi: Beautiful Code
 * Sivuja: 593
 * Julkaisuvuosi: 2007
 * Nimi: KonMari
 * Sivuja: 222
 * Julkaisuvuosi: 2011
 * Nimi:
 *
 * Mitä tulostetaan? kaikki
 * Minä en sitten muutu, 201 sivua, 2010
 * Nalle Puh ja elämisen taito, 100 sivua, 2005
 * Beautiful Code, 593 sivua, 2007
 * KonMari, 222 sivua, 2011
 *
 */
 
public class Kirja {
    private String nimi;
    private int sivuja;
    private int vuosi;
    
    public Kirja(String asetaNimi, int asetaSivuja, int asetaVuosi) {
        this.nimi = asetaNimi;
        this.sivuja = asetaSivuja;
        this.vuosi = asetaVuosi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public String toString() {
        return this.nimi+", "+this.sivuja+" sivua, "+this.vuosi;
    }
}
