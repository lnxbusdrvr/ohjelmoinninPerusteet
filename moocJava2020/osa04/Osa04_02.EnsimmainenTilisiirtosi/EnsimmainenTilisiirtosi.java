/*
 * Tässäkin tehtävässä on käytössä edellisessä tehtävässä mukana ollut luokka Tili.
 *
 * Tee ohjelma joka:
 *
 *   Luo tilin nimeltä "Matin tili" saldolla 1000
 *   Luo tilin nimeltä "Oma tili" saldolla 0
 *   Nostaa matin tililtä 100.0
 *   Panee omalle tilille 100.0
 *   Tulostaa molemmat tilit
 *
 */
 

public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        
        Tili matinTili = new Tili("Matin tili", 1000);
        
        Tili omaTili = new Tili("Oma tili", 0);
        
        matinTili.otto(100);
        omaTili.pano(100);
        
        System.out.println(matinTili);
        System.out.println(omaTili);
    }
}
