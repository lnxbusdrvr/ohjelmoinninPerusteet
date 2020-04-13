/*
 * Luo luokka Tuote, joka esittää kaupan tuotetta.
 * Tuotteella tulee olla 
 * hinta (double)
 * lukumäärä (int)
 * nimi (String)
 *
 * Luokalla tulee olla:
 *
 * -Konstruktori
 *
 * public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa)
 *
 * -Metodi
 *
 * public void tulostaTuote()
 *
 * joka tulostaa tuotteen tiedot tässä muodossa:
 *
 * Esimerkkitulostus:
 *
 * Banaani, hinta 1.1, 13 kpl
 *
 * Yllä oleva tulostus olettaa,
 * että tuotteen nimeksi on annettu
 * banaani,
 * hinnaksi on annettu
 * 1.1,
 * ja määräksi on annettu
 * 13.
 *
 */
 

public class Tuote {
    private String nimi;
    private double hinta;
    private int lkm;
    
    // Konstruktori
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa) {
        this.nimi = nimiAlussa;
        this.hinta = hintaAlussa;
        this.lkm = maaraAlussa;
    }
    
    // Metodi
    public void tulostaTuote() {
        System.out.println(nimi+ ", "+hinta+ ", " +lkm+ " kpl");
    }    
}
