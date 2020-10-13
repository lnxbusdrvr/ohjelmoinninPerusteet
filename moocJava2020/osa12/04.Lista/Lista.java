

/**
 *
 * @author lnxbusdrvr
 */
public class Lista<T> {

    private T[] arvot;
    private int arvoja;
    
    /** Luo listan
     *
     */
    public Lista() {
        this.arvot = (T[]) new Object[10];
        this.arvoja = 0;
    }

    /** Lisää listalle arvon
     *
     * @param arvo T-tyyppinen lisättävä arvo
     */
    public void lisaa(T arvo) {
        if(this.arvoja == this.arvot.length) {
            kasvata();
        }

        this.arvot[this.arvoja] = arvo;
        this.arvoja++;
    }
    
    private void kasvata() {
        int uusiKoko = this.arvot.length + this.arvot.length / 2;
        T[] uusi = (T[]) new Object[uusiKoko];
        for (int i = 0; i < this.arvot.length; i++) {
            uusi[i] = this.arvot[i];
        }

        this.arvot = uusi;
    }
    
    /** avulla voidaan tarkistaa onko arvoja listalla
     *
     * @param arvo
     * @return palautetaan totuusarvona
     */
    public boolean sisaltaa(T arvo) {
        return arvonIndeksi(arvo) >= 0;
    }
    
    /** etsii annetun arvon indeksin
     *
     * @param arvo annettava T-arvo
     * @return palauttaa kokonaisluvun, mikäli arvoa ei löydy palauttaa -1
     */
    public int arvonIndeksi(T arvo) {
        for (int i = 0; i < this.arvoja; i++) {
            if (this.arvot[i].equals(arvo)) {
                return i;
            }
        }

        return -1;
    }
    
    private void siirraVasemmalle(int indeksistaLahtien) {
        for (int i = indeksistaLahtien; i < this.arvoja - 1; i++) {
            this.arvot[i] = this.arvot[i + 1];
        }
    }
    
    /** Poistaa listasta arvon
     *
     * @param arvo poistettava arvo
     */
    public void poista(T arvo) {
        int arvonIndeksi = arvonIndeksi(arvo);
        if (arvonIndeksi < 0) {
            return; // ei löydy
        }

        siirraVasemmalle(arvonIndeksi);
        this.arvoja--;
    }
    
    /** kertoo listan indeksin
     *
     * @param indeksi Listan indeksi
     * @return listan indeksi T:na
     */
    public T arvo(int indeksi) {
        if (indeksi < 0 || indeksi >= this.arvoja) {
            throw new ArrayIndexOutOfBoundsException("Indeksi " + indeksi + " alueen [0, " + this.arvoja + "[ ulkopuolella.");
        }

        return this.arvot[indeksi];
    }
    
    /** kertoo listan koon
     *
     * @return listan koko kokoaislukuna 
     */
    public int koko() {
        return this.arvoja;
    }
    
}
