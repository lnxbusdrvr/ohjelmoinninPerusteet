
public class Kassapaate {


    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä


    public Kassapaate() {
        // kassassa on aluksi 1000 euroa rahaa
        this.rahaa = 1000;
    }

    public double syoEdullisesti(double maksu) {
        // edullinen lounas maksaa 2.50 euroa.
        double eduLounas = 2.50;
        double takaisin = 0;
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        if(maksu < eduLounas) {
            return maksu;
        }else {
            this.edulliset++;
            takaisin = maksu - eduLounas;
            this.rahaa = this.rahaa + eduLounas;
            return takaisin;
        }
        
    }
    
    public boolean syoEdullisesti(Maksukortti kortti) {
        double eduLounas = 2.50;
        double erotus = kortti.saldo() - eduLounas;
        if(kortti.saldo() >= eduLounas) {
            this.edulliset++;
            kortti.otaRahaa(eduLounas);
            return true;
        }else{
            return false;
        }
    }

    public double syoMaukkaasti(double maksu) {
        // maukas lounas maksaa 4.30 euroa.
        double mauLounas = 4.30;
        double takaisin = 0;
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        if(maksu < mauLounas) {
            return maksu;
        }else {
            this.maukkaat++;
            takaisin = maksu - mauLounas;
            this.rahaa = this.rahaa + mauLounas;
            return takaisin;
        }
    }
    
    public boolean syoMaukkaasti(Maksukortti kortti) {
        double mauLounas = 4.30;
        double erotus = kortti.saldo() - mauLounas;
        if(kortti.saldo() >= mauLounas) {
            this.maukkaat++;
            kortti.otaRahaa(mauLounas);
            return true;
        }else{
            return false;
        }
    }
    
    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if(summa > 0) {
            this.rahaa = this.rahaa + summa;
            kortti.lataaRahaa(summa);
        }        
    }


    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
