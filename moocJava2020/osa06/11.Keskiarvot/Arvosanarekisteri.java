
import java.util.ArrayList;

public class Arvosanarekisteri {

    private ArrayList<Integer> arvosanat;
    // Osa 2 Lisää oliomuuttuja
    private ArrayList<Integer> lista;

    public Arvosanarekisteri() {
        this.arvosanat = new ArrayList<>();
        // Osa 2 Lisää oliomuuttuja
        this.lista = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.arvosanat.add(pisteetArvosanaksi(pisteet));
        // Osa 2:
        // Lisää pisteet listaan
        this.lista.add(pisteet);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        int lkm = 0;
        for (int saatu : this.arvosanat) {
            if (saatu == arvosana) {
                lkm++;
            }
        }

        return lkm;
    }

    public static int pisteetArvosanaksi(int pisteet) {
        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
    
    // Osa 1/3 Koodausaika 7min 46sek
    public double arvosanojenKeskiarvo() {
        int arvosanatYht = 0;
        for(int arvot : this.arvosanat) {
            arvosanatYht += arvot;
        }
        if(this.arvosanat.isEmpty()) {
            return -1;
        }
        return (double)arvosanatYht / this.arvosanat.size();
    }
    
    // Osa 2/3 Koodausaika 3min 53sek
    public double koepisteidenKeskiarvo() {
        int pisteetYht = 0;
        for(int piste : this.lista) {
            pisteetYht += piste;
        }
        if(this.lista.isEmpty()) {
            return -1;
        }
        return (double)pisteetYht / this.lista.size();
    }
}
