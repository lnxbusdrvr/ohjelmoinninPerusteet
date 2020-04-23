public class Ottelu {
    private String paaOttelija;
    private String vastustaja;
    private int paaOttelijaPisteet;
    private int vastustajaPisteet;
    
    public Ottelu(String paaOttelija, String vastustaja, int paaOttelijaPisteet, int vastustajaPisteet) {
        this.paaOttelija = paaOttelija;
        this.vastustaja = vastustaja;
        this.paaOttelijaPisteet = paaOttelijaPisteet;
        this.vastustajaPisteet = vastustajaPisteet;
    }
    
    public String getPaaOttelija() {
        return this.paaOttelija;
    }
    
    public String getVastustaja() {
        return this.vastustaja;
    }
    
    public int getPaaOttelijaPisteet() {
        return this.paaOttelijaPisteet;
    }
    
    public int getVastustajaPisteet() {
        return this.vastustajaPisteet;
    }
    
    public String getVoittaja() {
        String voittaja = null;
        
        if(this.paaOttelijaPisteet < this.vastustajaPisteet) {
            voittaja = this.vastustaja;
        }else if(this.paaOttelijaPisteet > this.vastustajaPisteet) {
            voittaja = this.paaOttelija;
        }
        return voittaja;
    }
    
    public boolean pelaasikoJoukkue(String joukkue) {
        // Nyt vertaillaan, että joukkue pelaa samaa joukkuetta vastaan
      /*if(this.getPaaOttelija().equals(joukkue)) {
            return true;
        }else{
            return false;
        }*/
        if(joukkue.equals(this.getPaaOttelija()) || joukkue.equals(this.getVastustaja())) {
            return true;
        }else{
            return false;
        }
    }
        
    @Override
    public String toString() {
        return this.paaOttelija+", "+this.vastustaja+", "+this.paaOttelijaPisteet+", "+this.vastustajaPisteet;
    }
}
