/*
 *
 * Osa 1: Esineiden lisääminen ja listaaminen
 * ------------------------------------------
 *
 * Ohjelman tulee lukea käyttäjältä esineitä. 
 * Kun kaikki käyttäjän esineet on luettu, 
 * ohjelma tulostaa esineiden tiedot. 
 *
 * Kustakin esineestä tulee lukea tunnus ja nimi. 
 * Mikäli syötetty tunnus tai nimi on tyhjä, 
 * ohjelma lopettaa syötteen pyytämisen ja tulostaa esineiden tiedot.
 *
 * Osa 2: Kukin esine tulostetaan vain kerran
 *
 * Muokkaa ohjelmaa siten, 
 * että esineiden syöttämisen jälkeen kukin esine tulostetaan 
 * korkeintaan kerran. 
 * Kaksi esinettä tulee käsittää samoina mikäli niiden tunnukset 
 * ovat samat (nimet voivat vaihdella esimerkiksi maittain). 
 *
 * Mikäli käyttäjä syöttää saman esineen useaan otteeseen, 
 * tulostuksessa käytetään ensimmäisenä syötettyä esinettä.
 *
 */

public class Varasto{
    private String tunnus;
    private String nimi;
    
    public Varasto(String tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
    }
    
    public String getTunnus() {
        return this.tunnus;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public void setTunnus(String tunnus) {
        this.tunnus = tunnus;
    }
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public boolean equals(Object verrattava) {
        // Onko sama paikka
        if(this == verrattava) {
            return true;
        }
        // Onko sama tyyppi
        if(!(verrattava instanceof Varasto)) {
            return false;
        }
        // Tyyppimuunnos
        Varasto verrattavaVarasto = (Varasto)verrattava;
        
        // Vertaus, vain tunnus
        if(this.tunnus.equals(verrattavaVarasto.tunnus)) {
            return true;
        }else{
            return false;
        }
    }/*
        if(this.tunnus.equals(verrattavaVarasto.tunnus)
        && this.nimi.equals(verrattavaVarasto.nimi)) {
            return true;
        }else{
            return false;
        }
    }*/
    
    @Override
    public String toString() {
        return this.tunnus+": "+this.nimi;
    }
}
