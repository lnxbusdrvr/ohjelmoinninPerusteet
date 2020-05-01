/*
 *
 * Tehtäväpohjassa on ohjelma, joka lukee käyttäjältä kirjoja 
 * ja lisää niitä listalle. 
 *
 * Muokkaa ohjelmaa siten, että listalle ei lisätä kirjoja, 
 * jotka ovat jo listalla. 
 * Kaksi kirjaa tulee käsittää samaksi mikäli niiden nimi 
 * ja julkaisuvuosi on sama.
 *
 */

public class Kirja {

    private String nimi;
    private int julkaisuvuosi;

    public Kirja(String nimi, int julkaisuvuosi) {
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getJulkaisuvuosi() {
        return julkaisuvuosi;
    }

}
