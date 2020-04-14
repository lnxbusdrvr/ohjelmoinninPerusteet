/*
 * Luo luokka nimeltä Musiikkikappale.
 * Musiikkikappaleella on oliomuuttujat
 *
 * nimi (merkkijono)
 * pituus sekunteina (kokonaisluku)
 *
 * Molemmat asetetaan konstruktorissa
 *
 * public Musiikkikappale(String kappaleenNimi, int kappaleenPituus)
 *
 * Lisää oliolle myös metodit
 *
 * public String nimi()
 *
 * joka palauttaa kappaleen nimen
 *
 * public int pituus()
 *
 * joka palauttaa kappaleen pituuden.
 *
 * Luokan tulee toimia seuraavasti.
 *
 * Musiikkikappale garden = new Musiikkikappale("In The Garden", 10910);
 * System.out.println("Kappaleen " + garden.nimi() + " pituus on " + garden.pituus() + " sekuntia.");
 *
 */
 
 

public class Musiikkikappale {
    private String nimi;
    private int pituus;
    
    // Konsruktori
    public Musiikkikappale(String kappaleenNimi, int kappaleenPituus) {
        this.nimi = kappaleenNimi;
        this.pituus = kappaleenPituus;
    }
    
    // Metodit
    public String nimi() {
        return nimi;
    }
    
    public int pituus() {
        return pituus;
    }
}

