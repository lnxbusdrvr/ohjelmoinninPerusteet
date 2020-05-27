# Ohjelmoinnin testaus

## Testivetoinen ohjelmistokehitys

### Ohjelman luominen pienin askelin

1. Kirjoita testi, joka testaa ohjelmalle myöhemmin lisättävää toiminnallisuutta.
2. Suorita testi. Testin ei tule mennä läpi.
    - Mikäli testi menee läpi, siirry kohtaan 1.
3. Kirjoita ohjelmaan testin läpäisemiseen tarvittava toiminnallisuus.
4. Suorita testit.
    - Mikäli testit eivät mene läpi, siirry kohtaan 3 ja täydennä toiminnallisuutta.
5. Refaktoroi.
    - Mikäli ohjelma on valmis, lopeta.
    - Muuten, siirry kohtaan 1.

Refaktoroinnissa koodia siistitään säilyttäen samalla ohjelman toiminnallisuus. 
Siistiminen sisältää mm. luettavuuden parantamista sekä esimerkiksi 
ohjelman pilkkomista pienempiin metodeihin ja luokkiin.


## Kaavio

```
alku -->  ( Kirjoita testi )------------> (Suorita testi)
              /\                                 ||
              ||                                 ||
              ||                                 \/
      (Refaktoroi ohjelma)       (Kirjoita tarvittu toiminnallisuus)
              /\                                 ||
              ||                                 ||
              \\                                 //
               \-----<----(Suorita testi)--<-----/
```

## Hyötyjä

- Pakottaa miettimään toiminnallisuutta ennen ohjelman koodausta.
- Johtaa ylläpidettävään rakenteeseen, sillä ohjelmaa tehdään pienissä osissa refaktoroiden. 
- Lopputuotoksessa testit, jonka ansiosta ohjelman jatkokehitys helpompaa: muutoksen yhteydessä voi tarkastaa menikö aiempi toiminnallisuus rikki.
- Vähemmän bugeja tuotannossa.


## Esimerkki: tehtävienhallinta

### Osa 1: Projektin luominen ja JUnit-kirjaston käyttöönotto

Tarkastellaan testivetoista ohjelmistokehitystä 
tehtävien hallintaan tarkoitetun sovelluksen kannalta.

**Tehtävien hallintasovellukseen halutaan mahdollisuus tehtävien listaamiseen, 
lisäämiseen, tehdyksi merkkaamiseen sekä poistamiseen.**

Aloitetaan sovelluksen kehitys luomalla tyhjä projekti. 
Tämä tapahtuu valitsemalla NetBeansissa File -> New Project. 
Valitaan projektin kategoriaksi “Maven” ja projektin tyypiksi “Java Application”.

Tämän jälkeen täytetään uuden projektin tiedot. 
Asetetaan projektin nimeksi “tehtavienhallinta”. 
Projektin sijainti kertoo missä päin tiedostojärjestelmää 
projektin tiedostot sijaitsevat.

Pidetään kohdassa Package-oleva kenttä tyhjänä.

Kun painamme Finish, uusi projekti on luotu. 
Projekti näkyy NetBeansissa vasemmalla laidalla.

Kun painamme Finish, uusi projekti on luotu. 
Projekti näkyy NetBeansissa vasemmalla laidalla.

Lisätään seuraavaksi yksikkötestien kirjoittamiseen käytetty 
JUnit-kirjasto (tämä on valmiina TMC:stä ladattavissa tehtäväpohjissa).

Klikataan kansio Project Files auki ja tuplaklikataan tiedostoa pom.xml. 
Tiedosto pom.xml kertoo projektimme rakenteesta sekä 
sen käyttämistä kirjastoista -- tähän tutustutaan tarkemmin Ohjelmoinnin jatkokurssilla.

Kopioidaan JUnit-kirjasto ennen riviä `</project>`:

```xml
<dependencies>
  <dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>    
  </dependency>
</dependencies>
```
Kun yllä oleva sisältö on kopioitu 
pom.xml-tiedostoon (ennen riviä </project>), tallennetaan tiedosto.

Tämä tuo ohjelman käyttöön JUnit-kirjaston ja mahdollistaa yksikkötestien kirjoittamisen. 

## Osa 2: Yksikkötestiluokan luominen

Luodaan ensimmäinen yksikkötesti. 
Yksikkötestien luominen onnistuu klikkaamalla projektia oikealla hiirennapilla ja valitsemalla new -> Other. 

Tämä avaa näkyville uuden tiedoston luomiseen käytetyn valikon. 
Valitse kategoriaksi “Unit Tests” ja luotavan tiedoston tyypiksi “JUnit Test”.

Paina tämän jälkeen “Next”

Eteen aukeaa yksikkötestitiedoston luomiseen käytettävä apuri.

Asetetaan luokan nimeksi “TehtavienhallintaTest” ja valitaan 
ettei testiluokkaan tehdä koodia.

Huom! Varmista, että luokan nimi päättyy sanalla “Test”. 

Paina lopulta Finish.

Nyt projektin kansioon “Test Packages” on ilmestynyt luokka “TehtavienhallintaTest”.

## Osa 3: Ensimmäinen yksikkötesti

```java

import static org.junit.Assert.*;
import org.junit.Test; // Huom ei static:

public class TehtavienhallintaTest {

    @Test
    public void TehtavienhallintaTest() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        assertEquals(0, hallinta.tehtavalista().size());
    }

}
```

Luodaan ensimmäinen testi. Testissä määritellään luokka Tehtavienhallinta, 
ja oletetaan, että luokalla on metodi tehtavalista, joka palauttaa tehtävälistan.

Testimetodi assertEquals saa parametrinaan 
kaksi arvoa -- ensimmäinen on odotettu arvo ja toinen on ohjelman palauttama arvo. 

Tässä metodia käytetään tehtävälistan koon tarkastamiseen uuden tehtävälistan luomisen yhteydessä: uuden listan tulee olla tyhjä.

### Testi

Testi on luokassa TehtavienhallintaTest. 
Kun testi on luotu, nähdään suoraan 
ettei se mene läpi sillä testin testaama 
luokka Tehtavienhallinta puuttuu. 

Suoritetaan testit silti. 
Tämä tapahtuu klikkaamalla projektia 
hiiren oikealla napilla ja valitsemalla “Test”

Näemme virheen “Failed to execute...”

## Osa 4: Yksikkötestin vaatimusten täyttävän toiminnallisuuden toteutus

### I Toiminnallisuus

```java

import java.util.ArrayList;

public class Tehtavienhallinta {

    public ArrayList<String> tehtavalista() {
        return new ArrayList<>();
    }
}
```

Luodaan luokka Tehtavienhallinta 
(luokka lisätään kansioon Source Packages) 
ja lisätään luokalle listan palauttava metodi tehtavalista.

Suoritetaan projektiin liittyvät testit klikkaamalla 
projektia hiiren oikealla napilla ja valitsemalla “Test”

Projektiin liittyvät testit menevät läpi. 
Refaktoroitavaa ei ole, joten jatkamme seuraavan testin kirjoitukseen.

## Osa 5: Toinen yksikkötesti ja siihen liittyvän toiminnallisuuden toteutus

```java

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TehtavienhallintaTest {

    @Test
    public void tehtavalistaAlussaTyhja() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        assertEquals(0, hallinta.tehtavalista().size());
    }
 
    @Test
    public void tehtavanLisaaminenKasvattaaListanKokoaYhdella() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
        assertEquals(1, hallinta.tehtavalista().size());
    }
}
```

Seuraavaksi luomme uuden testin, 
jossa tarkastellaan tehtävien lisäämiseen 
liittyvää toiminnallisuutta. 

Testissä määritellään luokalle Tehtavienhallinta metodi lisaa, 
joka lisää tehtävälistalle uuden tehtävän. 
Tehtävän lisäämisen onnistuminen tarkastetaan 
tehtavalista-metodin koon kasvamisen kautta.

Testi ei toimi lainkaan, sillä luokasta 
Tehtavienhallinta puuttuu lisaa-metodi.

### II Toiminnallisuus

```java

import java.util.ArrayList;

public class Tehtavienhallinta {

    public ArrayList<String> tehtavalista() {
        return new ArrayList<>();
    }

    public void lisaa(String tehtava) {

    }
}
```

Lisätään luokkaan Tehtavienhallinta metodi 
lisaa ja suoritetaan testit.
Metodi ei tässä vaiheessa tee vielä mitään.

Alussa lisäämämme testi menee läpi, 
mutta edellä lisätty testi ei.

Virheilmoitus on “Failed: expected: <1> but 
was: <0>” eli testi odotti arvoa 1 mutta sai 
arvon 0.

### Pieni muokkaus

```java
public class Tehtavienhallinta {

    private ArrayList<String> tehtavat;

    public Tehtavienhallinta() {
        this.tehtavat = new ArrayList<>();
    }

    public ArrayList<String> tehtavalista() {
        return this.tehtavat;
    }

    public void lisaa(String tehtava) {
        this.tehtavat.add("Uusi");
    }
}
```

Muokataan luokan tehtävänhallinta toiminnallisuutta siten, 
että luokalle luodaan oliomuuttujaksi tehtävät sisältävä lista. 
Muokataan metodin lisaa-toiminnallisuutta vain niin, 
että se läpäisee testin, mutta ei tee todellisuudessa haluttua asiaa.

Suoritetaan testit -- testit menevät läpi, 
joten voimme siirtyä seuraavan testin kirjoittamiseen.

## Osa 6: Kolmas yksikkötesti ja siihen liittyvän toiminnallisuuden toteutus

### Uusi testi


```java

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TehtavienhallintaTest {

    @Test
    public void tehtavalistaAlussaTyhja() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        assertEquals(0, hallinta.tehtavalista().size());
    }
 
    @Test
    public void tehtavanLisaaminenKasvattaaListanKokoaYhdella() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
        assertEquals(1, hallinta.tehtavalista().size());
    }

    @Test
    public void lisattyTehtavaLoytyyTehtavalistalta() {
	Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
	assertTrue(hallinta.tehtavalista().contains("Kirjoita testi"));
    }
}
```

Täydennetään testejä siten, että ne vaativat, 
että lisätyn tehtävän tulee olla listalla. 

JUnit-kirjaston tarjoama metodi assertTrue vaatii, 
että sille parametrina annettu lauseke saa lopulta arvon true.

Kun ohjelmaan on lisätty uusi testi,
testit eivät taaskaan mene läpi.

### III Toiminnallisuus

```java

import java.util.ArrayList;

public class Tehtavienhallinta {

    private ArrayList<String> tehtavat;

    public Tehtavienhallinta() {
        this.tehtavat = new ArrayList<>();
    }

    public ArrayList<String> tehtavalista() {
        return this.tehtavat;
    }

    public void lisaa(String tehtava) {
        this.tehtavat.add(tehtava);
    }
}
```

Noheva ohjelmoija muokkaisi luokan Tehtavienhallinta toimintaa siten, 
että metodissa lisaa lisättäisiin listalle aina merkkijono "Kirjoita testi".

Tämä johtaisi tilanteeseen, missä testit menisivät läpi, mutta sovellus 
ei vieläkään tarjoaisi toimivaa tehtävien lisäämistoiminnallisuutta. 

Muokataan luokkaa Tehtavienhallinta siten, 
että lisättävä tehtävä lisätään tehtävälistalle.

### Refaktorointi

```java

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TehtavienhallintaTest {

    @Test
    public void tehtavalistaAlussaTyhja() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        assertEquals(0, hallinta.tehtavalista().size());
    }

    @Test
    public void tehtavanLisaaminenKasvattaaListanKokoaYhdella() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
	hallinta.lisaa("Kirjoita testi");
        assertEquals(1, hallinta.tehtavalista().size());
    }

    @Test
    public void lisattyTehtavaLoytyyTehtavalistalta() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
	assertTrue(hallinta.tehtavalista().contains("Kirjoita testi"));
    }
}
```

Huomaamme, että testiluokassa on toistoa -- hyvä hetki refaktoroinnille.

Muuttujan alustaminen onnistuu luomalla testiluokkaan metodi alusta, missä muuttuja(t) alustetaan. 

Metodille alusta annetaan annotaatio @Before, joka määrää että metodi
suoritetaan ennen kunkin testimetodin suoritusta.

Testit menevät läpi refaktoroinnin jälkeenkin.

## Osa 7: Neljäs yksikkötesti ja siihen liittyvän toiminnallisuuden toteutus

```java

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TehtavienhallintaTest {

    @Test
    public void tehtavalistaAlussaTyhja() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        assertEquals(0, hallinta.tehtavalista().size());
    }

    @Test
    public void tehtavanLisaaminenKasvattaaListanKokoaYhdella() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
	hallinta.lisaa("Kirjoita testi");
        assertEquals(1, hallinta.tehtavalista().size());
    }

    @Test
    public void lisattyTehtavaLoytyyTehtavalistalta() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
	assertTrue(hallinta.tehtavalista().contains("Kirjoita testi"));
    }

    @Test
    public void tehtavanVoiMerkataTehdyksi() {
        hallinta.lisaa("Uusi tehtävä");
        hallinta.merkkaaTehdyksi("Uusi tehtävä");
        assertTrue(hallinta.onTehty("Uusi tehtävä"));
    }
}
```

Lisätään toiminnallisuus tehtävän tehdyksi merkkaamiseen.

Kun ohjelmaan on lisätty uusi testi, testit eivät taaskaan mene läpi.

### IV Toiminnallisuus

```java

import java.util.ArrayList;

public class Tehtavienhallinta {

    private ArrayList<String> tehtavat;

    public Tehtavienhallinta() {
        this.tehtavat = new ArrayList<>();
    }

    public ArrayList<String> tehtavalista() {
        return this.tehtavat;
    }

    public void lisaa(String tehtava) {
        this.tehtavat.add(tehtava);
    }

    public void merkkaaTehdyksi() {

    }

    public boolean onTehty(String tehtava) {
        return true;
    }
}
```

Toiminnallisuutta varten tulee lisätä 
luokkaan Tehtavienhallinta metoditmerkkaaTehdyksi ja onTehty.

Testit eivät tarkasta metodien toimintaa tarkemmin, 
joten lisätään toiminnallisuus aluksi hyvin kevyenä.

Testit menevät läpi.

## Osa 8: Viides yksikkötesti ja siihen liittyvän toiminnallisuuden toteutus

```java

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TehtavienhallintaTest {

    @Test
    public void tehtavalistaAlussaTyhja() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        assertEquals(0, hallinta.tehtavalista().size());
    }

    @Test
    public void tehtavanLisaaminenKasvattaaListanKokoaYhdella() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
	hallinta.lisaa("Kirjoita testi");
        assertEquals(1, hallinta.tehtavalista().size());
    }

    @Test
    public void lisattyTehtavaLoytyyTehtavalistalta() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
	assertTrue(hallinta.tehtavalista().contains("Kirjoita testi"));
    }

    @Test
    public void tehtavanVoiMerkataTehdyksi() {
        hallinta.lisaa("Uusi tehtävä");
        hallinta.merkkaaTehdyksi("Uusi tehtävä");
        assertTrue(hallinta.onTehty("Uusi tehtävä"));
    }

    @Test
    public void tehdyksiMerkkaamatonEiOleTehty() {
        hallinta.lisaa("Uusi tehtava");
        hallinta.merkkaaTehdyksi("Uusi tehtävä");
        assertFalse(hallinta.onTehty("Joku tehtävä"));
    }
}
```

Olemme tähän mennessä tarkistaneet, 
että haluttu toiminnallisuus on olemassa, 
mutta emme ole juurikaan tarkastaneet 
epätoivotun toiminnan poissaoloa.

Mikäli testejä kirjoitettaessa keskitytään halutun 
toiminnallisuuden olemassaoloon, 
testit saattavat jäädä ohjelman toiminnallisuutta 
hyvin vähän tarkastelevaksi.

Kirjoitetaan seuraavaksi testi, 
joka tarkastaa, että tehdyksi 
merkkaamaton testi ei ole tehty.

Testit eivät mene läpi.

### V Toiminnallisuus

```java
public class Tehtavienhallinta {

    private ArrayList<String> tehtavat;
    private ArrayList<String> tehdytTehtavat;

    public Tehtavienhallinta() {
        this.tehtavat = new ArrayList<>();
        this.tehdytTehtavat = new ArrayList<>();
    }

    public ArrayList<String> tehtavalista() {
	return this.tehtavat;
    }

    public void lisaa(String tehtava) {
        this.tehtavat.add(tehtava);
    }

    public void merkkaaTehdyksi(String tehtava) {
        this.tehdytTehtavat.add(tehtava);
    }

    public boolean onTehty(String tehtava) {
        return this.tehdytTehtavat.contains(tehtava);
    }
}
```

Toteutetaan taas testit täyttävä toiminnallisuus. Joudumme tekemään hieman isomman muutoksen 
ohjelmaan: lisätään luokkaan erillinen lista tehtäville, jotka on merkattu tehdyiksi.

Testit menevät taas läpi.

Sovelluksessa on kuitenkin muutamia kysymysmerkkejä.
Pitäisikö tehtävälistauksessa palautetut tehtävät merkitä jollain tavalla tehdyksi?
Voiko tehtävän, joka ei ole tehtävälistalla tosiaankin merkata tehdyksi?

### Tehtävälle oma luokka

```java
public class Tehtava {

    private String nimi;
    private boolean tehty;

    public Tehtava(String nimi) {
        this.nimi = nimi;
        this.tehty = false;
    }

    public String getNimi() {
        return this.nimi;
    }

    public boolean setTehty(boolean tehty) {
        return tehty;
    }

    public boolean onTehty() {
        return tehty;
    }
}
```

Tehdään ensimmäinen hieman laajempi ohjelman sisäisen rakenteen korjaus.
Tehtävä on selkeästi käsite, joten sille kannattanee luoda oma erillinen luokka. 

Luodaan luokka Tehtava. 
Luokalla Tehtava on nimi sekä tieto siitä, onko tehtävä tehty.

### Muokkausta

```java

public class Tehtavienhallinta {

    private ArrayList<Tehtava> tehtavat;

    public Tehtavienhallinta() {
        this.tehtavat = new ArrayList<>();
    }

    public ArrayList<String> tehtavalista() {
        ArrayList<String> palautettavat = new ArrayList<>();
        for(Tehtava tehtava : this.tehtavat) {
            palautettavat.add(tehtava.getNimi());
        }
        return palautettavat;
    }

    public void lisaa(String tehtava) {
        this.tehtavat.add(new Tehtava(tehtava));
    }

    public void merkkaaTehdyksi(String tehdyksiMerkattavaTehtava) {
        for(Tehtava tehtava : this.tehtavat) {
            if(tehtava.getNimi().equals(tehdyksiMerkattavaTehtava)) {
                tehtava.setTehty(true);
            }
        }
    }

    public boolean onTehty(String tarkistettavaTehtava) {
        for(Tehtava tehtava : this.tehtavat) {
            if(tehtava.getNimi().equals(tarkistettavaTehtava)) {
                return tehtava.onTehty();
            }
        }
        return false;
    }
}
```

Muokataan tämän jälkeen luokan Tehtavienhallinta rakennetta siten, 
että luokka tallentaa tehtävät merkkijonojen sijaan Tehtava-olioina.

Huomaa, että luokan metodien määrittelyt eivät muutu, 
mutta niiden sisäinen toteutus muuttuu.

Vaikka tehty muutos muutti luokan Tehtavienhallinta sisäistä toimintaa 
merkittävästi, testit toimivat yhä. 

Testivetoinen ohjelmistokehitys jatkuisi samalla tavalla kunnes 
toivottu perustoiminnallisuus olisi paikallaan

## Yhteenveto

Testivetoisessa ohjelmistokehitysmenetelmässä ohjelman toiminnallisuus 
rakennetaan pieninä askelina siten, 
että ohjelmoija kirjoittaa aina ensin uutta 
toiminnallisuutta tarkastelevan testin, jota seuraa testin läpäisevän ohjelmakoodin 
kirjoitus.

## Lähde
1. mooc.fi
