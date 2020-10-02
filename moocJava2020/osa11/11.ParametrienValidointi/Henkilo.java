package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {
        if(nimi == null) {
            throw new IllegalArgumentException("Nimi ei saa olla null");
        }else if (nimi.isEmpty()) {
            throw new IllegalArgumentException("Nimi ei saa olla tyhjä");
        }else if( nimi.length() > 40 ) {
            throw new IllegalArgumentException("Nimi ei saa olla ylipitkä");
        }if(ika < 0 || ika > 120) {
            throw new IllegalArgumentException("Ikä välilta 0-120");
        }else{
            this.nimi = nimi;
            this.ika = ika;
        }
        
    }

    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }
}
