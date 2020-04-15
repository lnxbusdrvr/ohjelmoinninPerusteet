/*
 * Tehtäväpohjassa on määriteltynä luokka
 * Agentti
 * jolla on
 * etunimi 
 * sukunimi
 *
 * Luokalle on määritelty metodi tulosta,
 *
 * Esimerkkitulostus:
 *
 * My name is Bond, James Bond
 *
 * Poista luokan metodi tulosta
 * ja luo luokalle metodi
 * public String toString()
 *
 * joka palauttaa edellämainitun merkkijonoesityksen.
 *
 */
 
    public String toString() {
        return "My name is " +this.sukunimi+", "+etunimi+" "+this.sukunimi;
    }
}
