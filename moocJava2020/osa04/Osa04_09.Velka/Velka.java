/*
 * Luo luokka Velka, jolla on double-tyyppiset oliomuuttujat
 * saldo ja korkokerroin.
 *
 * Saldo ja korkokerroin annetaan konstruktorin parametrina
 *
 * public Velka(double saldoAlussa, double korkokerroinAlussa).
 *
 * Luo luokalle myös metodit
 *
 * public void tulostaSaldo()
 * public void odotaVuosi()
 *
 * Metodi tulostaSaldo tulostaa tämän hetkisen saldon,
 * ja metodi odotaVuosi kasvattaa velan määrää.
*
* Velan määrän kasvattaminen tapahtuu kertomalla saldo korkokertoimella.
*
*/



public class Velka {
    private double saldo;
    private double korkokerroin;
    
    // Konstruktori
    public Velka(double saldoAlussa, double korkokerroinAlussa) {
        this.saldo = saldoAlussa;
        this.korkokerroin = korkokerroinAlussa;
    }
    
    // Methodit
    public void tulostaSaldo() {
        System.out.println(this.saldo);
    }
    
    public void odotaVuosi() {
        this.saldo = this.saldo * this.korkokerroin;
    }   
}
