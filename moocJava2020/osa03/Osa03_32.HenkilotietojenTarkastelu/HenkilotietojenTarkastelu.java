/*
 * Kirjoita ohjelma, joka lukee käyttäjältä henkilötietoja.
 * Henkilötiedot sisältävät etunimen ja syntymävuoden pilkulla eroteltuna.
 * TIetojen lukemista jatketaan kunnes käyttäjä syöttää tyhjän merkkijonon.
 * 
 * Kun lukeminen lopetetaan,
 * ohjelman tulee tulostaa pisin luettu etunimi
 * sekä luettujen henkilöiden syntymävuosien keskiarvo.
 * Mikäli pisimpiä etunimiä on useita, voit tulostaa niistä minkä tahansa.
 * Voit olettaa, että käyttäjä syöttää aina vähintään yhden henkilötiedon.
 *
 * Esimerkkitulostus:
 *
 * leevi,2017
 * anton,2017
 * lilja,2017
 * venla,2014
 * gabriel,2009
 *
 * Pisin nimi: gabriel
 * Syntymävuosien keskiarvo: 2014.8
 *
 * Esimerkkitulostus:
 *
 * sauli,1948
 * tarja,1943
 * martti,1936
 * mauno,1923
 * urho,1900
 *
 * Pisin nimi: martti
 * Syntymävuosien keskiarvo: 1930.0
 *
 */
 
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int lukumaara = 0;
        int summa = 0;
        int sananPituus = 0;
        String pisinNimi = null;
        
        while(true) {
            String lukulaite = lukija.nextLine();
            
            if(lukulaite.equals("")) {
                break;
            }
            
            String[] luoAlkiot = lukulaite.split(",");
            
            for(String alkio : luoAlkiot) {
                int sanaApu = luoAlkiot[0].length();
                String nimi = luoAlkiot[0];
                summa += Integer.parseInt(luoAlkiot[1]);
                lukumaara++;
                if(sanaApu > sananPituus) {
                    sananPituus = sanaApu;
                    pisinNimi = nimi;
                }
            }
        }
        double keskiarvo = (double)summa / lukumaara;
        System.out.println("Pisin nimi: "+pisinNimi);
        System.out.println("Syntymävuosien keskiarvo: "+keskiarvo);
    }
}
