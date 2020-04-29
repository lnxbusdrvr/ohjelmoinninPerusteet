/*
 * Tehtäväpohjassa tulee kaksi luokkaa,
 * Henkilo ja Lemmikki.
 * Jokaisella henkilöllä on yksi lemmikki.
 * Täydennä luokan Henkilo metodia
 * public String toString 
 *
 * siten, että metodi palauttaa merkkijonon,
 * joka kertoo henkilön nimen lisäksi lemmikin nimen ja rodun.
 *
 * Lemmikki hulda = new Lemmikki("Hulda", "sekarotuinen koira");
 * Henkilo leevi = new Henkilo("Leevi", hulda);
 *
 * System.out.println(leevi);
 *
 * Esimerkkitulostus:
 *
 * Leevi, kaverina Hulda, joka on sekarotuinen koira
 *
 */
 
 public class Henkilo {

    private String nimi;
    private Lemmikki lemmikki;

    public Henkilo(String nimi, Lemmikki lemmikki) {
        this.nimi = nimi;
        this.lemmikki = lemmikki;
    }

    public Henkilo(String nimi) {
        this(nimi, new Lemmikki("Karvinen", "kissa"));
    }

    public Henkilo() {
        this("Caliban", new Lemmikki("Tuntematon", "mielikuvituskaveri"));
    }

    @Override
    public String toString() {
        return this.nimi+", kaverina "+lemmikki.getNimi()+", joka on "+lemmikki.getRotu();
    }

}
