/*
 *
 *
 * Luo lyhenteiden ylläpitoon käytettävä luokka Lyhenteet. 
 * Luokalla tulee olla parametriton konstruktori, 
 * ja sen tulee tarjota seuraavat metodit:
 *
 * public void lisaaLyhenne(String lyhenne, String selite) 
 *    lisää lyhenteen sekä siihen liittyvän selitteen.
 * 
 * public boolean onkoLyhennetta(String lyhenne) 
 *    tarkastaa onko lyhennettä lisätty; palauttaa true
 *    mikäli kyllä, false mikäli ei.
 *    
 * public String haeLyhenne(String lyhenne) 
 *    hakee lyhenteeseen liittyvän selitteen;
 *    palauttaa null mikäli lyhennettä ei ole lisätty.
 *
 * Käyttöesimerkki:
 * 
 * Lyhenteet lyhenteet = new Lyhenteet();
 * lyhenteet.lisaaLyhenne("esim.", "esimerkiksi");
 * lyhenteet.lisaaLyhenne("jne.", "ja niin edelleen");
 * lyhenteet.lisaaLyhenne("yms.", "ynnä muuta sellaista");
 *
 * String teksti = "esim. jne. yms. lol.";
 *
 * for (String osa: teksti.split(" ")) {
 *     if(lyhenteet.onkoLyhennetta(osa)) {
 *         osa = lyhenteet.haeLyhenne(osa);
 *     }
 *
 *     System.out.print(osa);
 *     System.out.print(" ");
 * }
 *
 * System.out.println();
 *
 */

public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        /*
        Lyhenteet lyhenteet = new Lyhenteet();
        lyhenteet.lisaaLyhenne("ok", "olipa kerran");
        lyhenteet.lisaaLyhenne("jne", "ja niin edelleen");
        System.out.println(lyhenteet.onkoLyhennetta("lol"));
        System.out.println(lyhenteet.onkoLyhennetta("jne"));
        System.out.println(lyhenteet.haeLyhenne("jne"));*/
        
        Lyhenteet lyhenteet = new Lyhenteet();
        lyhenteet.lisaaLyhenne("esim.", "esimerkiksi");
        lyhenteet.lisaaLyhenne("jne.", "ja niin edelleen");
        lyhenteet.lisaaLyhenne("yms.", "ynnä muuta sellaista");

        String teksti = "esim. jne. yms. lol.";

        for (String osa: teksti.split(" ")) {
            if(lyhenteet.onkoLyhennetta(osa)) {
                osa = lyhenteet.haeLyhenne(osa);
                System.out.println(osa);
            }
            System.out.println(osa);
            
            System.out.print(" ");
        }
        System.out.println(lyhenteet.haeLyhenne("ja niin edelleen"));
        System.out.println(lyhenteet.haeLyhenne("jne."));
        System.out.println(lyhenteet);
        System.out.println();
        
        // Lambda-testi, joka paljasti,
        // Että olin myös avaimeksi (key) laittanut arvon (value)
        //lyhenteet.hajautustaulu.forEach((K, V) -> System.out.println(K));
        
    }
}
