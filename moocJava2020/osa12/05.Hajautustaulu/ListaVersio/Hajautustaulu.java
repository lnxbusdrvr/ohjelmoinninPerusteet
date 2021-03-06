

/**
 *
 * @author lnxbusdrvr
 */
public class Hajautustaulu<K, V> {

    private Lista<Pari<K, V>>[] arvot;
    private int arvoja;
    
    /** Luo hajautustaulun
     *
     */
    public Hajautustaulu() {
        this.arvot = new Lista[32];
        this.arvoja = 0;
    }
    
    /** Hakee arvon avaimen perusteella
     *
     * @param avain Perusteella haettava arvo
     * @return Mikäli indeksissä ei ole listaa, ei indeksiin ole lisätty 
     * vielä yhtäkään avain-arvo -paria, eikä avaimelle ole tallennettu 
     * arvoa. Tällöin palautetaan null-viite.
     */
    public V hae(K avain) {
        int hajautusArvo = Math.abs(avain.hashCode() % this.arvot.length);
        if (this.arvot[hajautusArvo] == null) {
            return null;
        }

        Lista<Pari<K, V>> arvotIndeksissa = this.arvot[hajautusArvo];

        for (int i = 0; i < arvotIndeksissa.koko(); i++) {
            if (arvotIndeksissa.arvo(i).getAvain().equals(avain)) {
                return arvotIndeksissa.arvo(i).getArvo();
            }
        }

        return null;
    }
    
    private Lista<Pari<K, V>> haeAvaimeenLittyvaLista(K avain) {
        int hajautusArvo = Math.abs(avain.hashCode() % arvot.length);
        if (arvot[hajautusArvo] == null) {
            arvot[hajautusArvo] = new Lista<>();
        }

        return arvot[hajautusArvo];
    }

    private int haeAvaimenIndeksi(Lista<Pari<K, V>> lista, K avain) {
        for (int i = 0; i < lista.koko(); i++) {
            if (lista.arvo(i).getAvain().equals(avain)) {
                return i;
            }
        }

        return -1;
    }
    
    /** Lisää listaalle avaimen ja sen arvon
     *
     * @param avain on avain, avainsana jonka avulla löytyy arvo
     * @param arvo avaimen perusteella sijoitettu arvo.
     */
    public void lisaa(K avain, V arvo) {
        Lista<Pari<K, V>> arvotIndeksissa = haeAvaimeenLittyvaLista(avain);
        int indeksi = haeAvaimenIndeksi(arvotIndeksissa, avain);

        if (indeksi < 0) {
            arvotIndeksissa.lisaa(new Pari<>(avain, arvo));
            this.arvoja++;
        } else {
            arvotIndeksissa.arvo(indeksi).setArvo(arvo);
        }

        if (1.0 * this.arvoja / this.arvot.length > 0.75) {
            kasvata();
        }
    }
    
    private void kasvata() {
        // luodaan uusi taulukko
        Lista<Pari<K, V>>[] uusi = new Lista[this.arvot.length * 2];

        for (int i = 0; i < this.arvot.length; i++) {
            // kopioidaan vanhan taulukon arvot uuteen
            kopioi(uusi, i);
        }

        // korvataan vanha taulukko uudella
        this.arvot = uusi;
    }
    
    private void kopioi(Lista<Pari<K, V>>[] uusi, int indeksista) {
        for (int i = 0; i < this.arvot[indeksista].koko(); i++) {
            Pari<K, V> arvo = this.arvot[indeksista].arvo(i);

            int hajautusarvo = Math.abs(arvo.getAvain().hashCode() % uusi.length);
            if(uusi[hajautusarvo] == null) {
                uusi[hajautusarvo] = new Lista<>();
            }

            uusi[hajautusarvo].lisaa(arvo);
        }
    }
    
    public V poista(K avain) {
        Lista<Pari<K, V>> arvotIndeksissa = haeAvaimeenLittyvaLista(avain);
        if (arvotIndeksissa.koko() == 0) {
            return null;
        }

        int indeksi = haeAvaimenIndeksi(arvotIndeksissa, avain);
        if (indeksi < 0) {
            return null;
        }

        Pari<K, V> pari = arvotIndeksissa.arvo(indeksi);
        arvotIndeksissa.poista(pari);
        return pari.getArvo();
    }
    
}
