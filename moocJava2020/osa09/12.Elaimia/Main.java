
public class Main {

    public static void main(String[] args) {
        // voit kokeilla luomiesi luokkien toimintaa täällä
        
        /* Osa 2
        Koira koira = new Koira();
        koira.hauku();
        koira.syo();

        Koira vuffe = new Koira("Vuffe");
        vuffe.hauku();
        */
        
        /* Osa 3
        Kissa kissa = new Kissa();
        kissa.mourua();
        kissa.syo();

        Kissa karvinen = new Kissa("Karvinen");
        karvinen.mourua();
        */
        
        // Osa 4
        Aanteleva koira = new Koira();
        koira.aantele();

        Aanteleva kissa = new Kissa("Karvinen");
        kissa.aantele();
        Kissa k = (Kissa) kissa;
        k.mourua();

    }

}
