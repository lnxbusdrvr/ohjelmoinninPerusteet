/*
 * Luo kuutiota (eli säännöllistä kuusitahokasta) esittävä
 * luokka Kuutio.
 *
 * Luo luokalle konstruktori
 * public Kuutio(int sarmanPituus),
 *
 * joka saa parametrinaan kuution särmän pituuden.
 *
 * Tee kuutiolle metodi
 * public int tilavuus(),
 *
 * joka laskee ja palauttaa kuution tilavuuden.
 * Kuution tilavuus lasketaan
 * kaavalla sarmanPituus * sarmanPituus * sarmanPituus.
 *
 * Tee tämän jälkeen kuutiolle vielä metodi
 * public String toString(),
 *
 * joka palauttaa kuutiota kuvaavan merkkijonoesityksen.
 * Merkkijonoesityksen tulee olla muotoa
 * "Kuution särmän pituus on p, tilavuus on t",
 *
 * missä pon pituus ja t on tilavuus — 
 * sekä pituus että tilavuus tulee kuvata kokonaislukuina.
 *
 */


public class Kuutio {
    private int sarmanPituus;
    
    public Kuutio(int sarmanPituus) {
        this.sarmanPituus = sarmanPituus;
    }
    
    public int tilavuus() {
        return this.sarmanPituus * this.sarmanPituus * this.sarmanPituus;
    }
    
    public String toString() {
        return "Kuution särmän pituus on "+this.sarmanPituus+", tilavuus on "+this.tilavuus();
    }
}
