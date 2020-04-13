/*
 * Osa1: Metodin vahene() toteutus
 * -------------------------------
 * Täydennä luokan runkoon metodin vahene() toteutus
 * sellaiseksi, että se vähentää kutsuttavan olion oliomuuttujan
 * arvo arvoa yhdellä.
 * Kun olet toteuttanut metodin vahene(), 
 * 
 * Osa2: Laskurin arvo ei saa olla negatiivinen
 * --------------------------------------------
 * Täydennä metodin vahene() toteutus sellaiseksi,
 * ettei laskurin arvo mene koskaan negatiiviseksi.
 * Eli jos laskurin arvo on jo 0,
 * ei vähennys sitä enää vähennä. Ehtolause auttaa tässä.
 *
 * Osa3: Laskurin arvon nollaus
 * ----------------------------
 * Tee laskurille metodi public void nollaa()
 * joka nollaa laskurin arvon, esim:
 *
 * arvo: 100
 * arvo: 0
 * arvo: 0
 *
 */
 
    public void vahene() {
        // kirjoita tänne metodin toteutus
        // laskurin arvon on siis tarkoitus vähentyä yhdellä
        this.arvo = this.arvo - 1;
        if(this.arvo < 0) {
            this.arvo = this.arvo + 1;
        }
    }

    // ja tänne muut metodit
    public void nollaa() {
        this.arvo = 0;
    }
