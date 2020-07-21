
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lnxbusdrvr
 */
public class Arvosanat {
    
    private ArrayList<Integer> pisteet;
    private static int lukumaara;
    private static int hyvks_lkm;
    
    public Arvosanat() {
        this.pisteet = new ArrayList<>();
    }
    
    public void lisaaPisteet() {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");

        while(true) {
            int luku = Integer.valueOf(lukija.nextLine());

            if(luku == -1) {
                break;
            }
            if(luku > 0 && luku <=100) {
                this.pisteet.add(luku);
            }
        }
        // Kaikki
        this.keskiarvo();
        this.hyvaksyttyKeskiarvo();
        this.hyvaksyttyKeskiarvoProsentti();
        this.arvosanajakauma();
    }
    
    public void keskiarvo() {
        lukumaara = 0;
        int summa = 0;
        
        for(int piste : this.pisteet) {
            summa = summa + piste;
            lukumaara++;
        }
        double keskiarvo = (double)summa/lukumaara;
        
        System.out.println("Pisteiden keskiarvo (kaikki): "+keskiarvo);
    }
    
    public void hyvaksyttyKeskiarvo() {
        hyvks_lkm = 0;
        int hyvks_summa = 0;
        
        for(int hyvks_piste : this.pisteet) {
            if(hyvks_piste >= 50) {
                hyvks_summa += hyvks_piste;
                hyvks_lkm++;
            }
        }
        double hyvks_keskiarvo = (double)hyvks_summa/hyvks_lkm;
        
        if(hyvks_keskiarvo > 0) {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): "+hyvks_keskiarvo);
        }else{
            System.out.println("Pisteiden keskiarvo (hyväksytyt): -");
        }
    }
    
    public void hyvaksyttyKeskiarvoProsentti() {
        double hyvks_pros = 100.0*hyvks_lkm/lukumaara;
        
        System.out.println("Hyväksymisprosentti: "+hyvks_pros);
    }
    
    public int nollanPisteet() {
        int nolla = 0;
        
        for(int arvosana : this.pisteet) {
            if(arvosana >0 && arvosana < 50) {
                nolla++;
            }
        }
        return nolla;
    }
    
    public int yhdenPisteet() {
        int yksi = 0;
        
        for(int arvosana : this.pisteet) {
            if(arvosana >= 50 && arvosana < 60) {
                yksi++;
            }
        }
        return yksi;
    }
    
    public int kahdenPisteet() {
        int kaksi = 0;
        
        for(int arvosana : this.pisteet) {
            if(arvosana >= 60 && arvosana < 70) {
                kaksi++;
            }
        }
        return kaksi;
    }
    
    public int kolmenPisteet() {
        int kolme = 0;
        
        for(int arvosana : this.pisteet) {
            if(arvosana >= 70 && arvosana < 80) {
                kolme++;
            }
        }
        return kolme;
    }
    
    public int neljanPisteet() {
        int nelja = 0;
        
        for(int arvosana : this.pisteet) {
            if(arvosana >= 80 && arvosana < 90) {
                nelja++;
            }
        }
        return nelja;
    }
    
    public int viidenPisteet() {
        int viisi = 0;
        
        for(int arvosana : this.pisteet) {
            if(arvosana >= 90 && arvosana < 100) {
                viisi++;
            }
        }
        return viisi;
    }
    
    public void arvosanajakauma() {
        System.out.println("Arvosanajakauma:");
        System.out.print("5: "); 
        tahtia(viidenPisteet());
        System.out.print("\n4: "); 
        tahtia(neljanPisteet());
        System.out.print("\n3: "); 
        tahtia(kolmenPisteet());
        System.out.print("\n2: "); 
        tahtia(kahdenPisteet());
        System.out.print("\n1: "); 
        tahtia(yhdenPisteet());
        System.out.print("\n0: "); 
        tahtia(nollanPisteet());
    }
    
    /**
     *
     * @param tahtia
     */
    public static void tahtia(int tahtia) {
        for(int i=0; i<tahtia;i++) {
            System.out.print("*");
        }
    }
    
}
