/*
 * Algoritmi:
 * 
 * eka = (taulunKoko/SarakkeenKoko -1)/2
 * toka = ylos ja oikealle
 *      jos seinä tulee vastaan korkeussuunnassa/pituussuunassa, 
 *      siirytään vastkkaisen puolen alkuun
 * yksi ylös ja oikealle
 *      jos seinä tulee vastaan leveyssuunassa, 
 *      siirytään vastkkaisen puolen alkuun
 * Jos kohdassa onkin luku, siirytään askel eteenpäin, 
 * siitä askeleesta mistä viimeksi aloitettiin.
 * 
 */

public class Taikaneliotehdas {

    public Taikanelio luoTaikanelio(int koko) {

        Taikanelio nelio = new Taikanelio(koko);
        // toteuta taikaneliön luominen Siamese method -algoritmilla tänne
        int nro = 1;
        int rivi = 0;
        int sarake = ((koko-1) / 2);
        int nykyRivi = 0;
        int nykySarake = ((koko-1) / 2);
        for(int i = 0; i < (koko * koko); i++) {
            nelio.asetaArvo(sarake, rivi, nro);    // Asettaa arvon
            // Muutetaan sijaintia
            
            //Siirrä ylös
            rivi -= 1;
            //Jos pituussuunassa yli laidan
            if(rivi < 0) {
                // Siirrä vastakkaisen puolen alkuun
                rivi = (koko-1);
            }
            // Siirrä oikealle
            sarake += 1;
            //Jos leveyssuunassa yli laidan
            if(sarake > (koko-1)) {
                // Siirrä vastakkaisen puolen alkuun
                sarake = 0;
            }
            // Kun neliössä on jo numero
            if(nelio.annaArvo(sarake, rivi) > 0) {
                // Siirrytään kohdan alusta
                rivi = nykyRivi;
                sarake = nykySarake;
                // Askel oikealle
                rivi += 1;
                // Jos mentiin leveyssuunassa yli laidan
                if(rivi < 0) {
                    // Mennän toisenpuolen alkuun/loppuun
                    rivi = (koko-1);
                }
            }
            // Sijoitetaan wanhempien muuttuijen arvot
            // Seuravalle kerralle
            nykyRivi = rivi;
            nykySarake = sarake;
            //Kasvatetaan numeroa ja aloitetaan alusta
            nro++;            
        }
        return nelio;
    }

}
