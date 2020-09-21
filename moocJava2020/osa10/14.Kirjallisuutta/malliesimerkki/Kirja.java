 
public class Kirja implements Comparable<Kirja> {
 
    private String nimi;
    private int ika;
 
    public Kirja(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }
 
    public String getNimi() {
        return nimi;
    }
 
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
 
    public int getIka() {
        return ika;
    }
 
    public void setIka(int ika) {
        this.ika = ika;
    }
 
    @Override
    public String toString() {
        return this.nimi + " (" + this.ika + " vuotiaille ja vanhemmille)";
    }
 
    @Override
    public int compareTo(Kirja o) {
        if (this.ika == o.ika) {
            return this.nimi.compareTo(o.nimi);
        }
 
        return this.ika - o.ika;
    }
 
}
 
