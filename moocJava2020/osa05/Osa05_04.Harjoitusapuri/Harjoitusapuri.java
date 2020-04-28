/*
 * Karvosen kaavan avulla voidaan laskea tavoitesyke fyysistä harjoittelua varten.
 * Tavoitesykkeen laskeminen perustuu kaavaan
 * (maksimisyke - leposyke) * (tavoitesykeprosentti) + leposyke,
 *
 * missä tavoitesyke annetaan prosenttina maksimisykkeestä.
 *
 * Esimerkiksi, jos henkilön maksimisyke on 200,
 * leposyke 50, ja tavoitesyke 75% maksimisykkeestä,
 * on tavoiteltava sydämen syke noin
 * ((200-50) * (0.75) + 50) eli 162.5 lyöntiä minuutissa.
 *
 * Luo luokka Harjoitusapuri,
 * jolle annetaan konstruktorin parametrina ikä ja leposyke.
 * Harjoitusapurin tulee tarjota metodi tavoitesyke,
 * jolle annetaan parametrina prosentuaalista maksimisykkeen osuutta
 * kuvaava double-tyyppinen luku.
 *
 * Osuus annetaan lukuna nollan ja yhden välillä. Luokalla tulee olla:
 * Konstruktori
 * public Harjoitusapuri(int ika, int leposyke)
 *
 * Metodi
 * public double tavoitesyke(double prosenttiaMaksimista),
 *
 * joka laskee ja palauttaa tavoiteltavan sykkeen.
 * Käytä maksimisykkeen laskemiseen kaavaa 
 * 206.3 - (0.711 * ikä).
 *
 */
 
 
public class Harjoitusapuri {
        private int ika;
        private int leposyke;

    public Harjoitusapuri(int ika, int leposyke) {
            this.ika = ika;
            this.leposyke = leposyke;
    }
    public double tavoitesyke(double prosenttiMaksimista) {
            double maxsyke = 206.3 - (0.711 * this.ika);
            double tavoitesyke = (maxsyke - this.leposyke) * prosenttiMaksimista + this.leposyke;
            return tavoitesyke;
     }
}
