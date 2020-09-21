

/**
 *
 * @author vadenn
 */
class Kirja {
    private String nimi;
    private int kohdeika;

    public Kirja(String nimi, int kohdeika) {
        this.nimi = nimi;
        this.kohdeika = kohdeika;
    }
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public void setKohdeiḱa(int ika) {
        this.kohdeika = ika;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getKohdeika() {
        return this.kohdeika;
    }
    
    @Override
    public String toString() {
        return this.getNimi()+" ("+this.getKohdeika()+" vuotiaille ja vanhemmille)";
    }
    
}
