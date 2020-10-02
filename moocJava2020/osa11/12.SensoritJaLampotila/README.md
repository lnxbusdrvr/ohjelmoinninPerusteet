# Tehtävä: 12.SensoritJaLampotila

Kaikki luotavat luokat tulee sijoittaa pakkaukseen `sovellus`.

Käytössämme on seuraava rajapinta:

```java
public interface Sensori {
    boolean onPaalla();  // palauttaa true jos sensori on päällä
    void paalle();       // käynnistä sensorin
    void poisPaalta();   // sulkee sensorin
    int mittaa();        // palauttaa sensorin lukeman jos sensori on päällä
                         // jos sensori ei ole päällä heittää poikkeuksen
                         // IllegalStateException
}
```

## Osa 1: Vakiosensori

Tee luokka `Vakiosensori` joka toteuttaa rajapinnan `Sensori`.

`Vakiosensori` on koko ajan päällä. Metodien `paalle` ja `poisPaalta` 
kutsuminen ei tee mitään. `Vakiosensorilla` tulee olla konstruktori, 
jonka parametrina on kokonaisluku. Metodikutsu `mittaa` palauttaa aina 
konstruktorille parametrina annetun luvun.

Esimerkki:

```java
public static void main(String[] args) {
    Vakiosensori kymppi = new Vakiosensori(10);
    Vakiosensori miinusViis = new Vakiosensori(-5);

    System.out.println(kymppi.mittaa());
    System.out.println(miinusViis.mittaa());

    System.out.println(kymppi.onPaalla());
    kymppi.poisPaalta();
    System.out.println(kymppi.onPaalla());
}
```

Esimerkkitulostus:

```
Esimerkkitulostus

10
-5
true
true
```


## Osa 2: Lampomittari

Tee luokka `Lampomittari`, joka toteuttaa rajapinnan `Sensori`.

Aluksi lämpömittari on poissa päältä. Kutsuttaessa metodia `mittaa` 
kun mittari on päällä mittari arpoo luvun väliltä -30...30 
ja palauttaa sen kutsujalle. 
Jos mittari ei ole päällä, heitetään poikkeus `IllegalStateException`.

Käytä Javan valmista luokkaa [Random](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html) 
satunnaisen luvun arpomiseen. Saat luvun väliltä 0...60 kutsulla 
`new Random().nextInt(61);` — väliltä -30...30 arvotun luvun saa 
vähentämällä väliltä 0...60 olevasta luvusta sopiva luku.

## Osa 3: Keskiarvosensori

Tee luokka `Keskiarvosensori`, joka toteuttaa rajapinnan `Sensori`.

`Keskiarvosensori` sisältää useita sensoreita. Rajapinnan `Sensori` 
määrittelemien metodien lisäksi keskiarvosensorilla on metodi 
`public void lisaaSensori(Sensori lisattava)` 

jonka avulla keskiarvosensorin hallintaan lisätään uusi sensori.

`Keskiarvosensori` on päällä silloin kuin kaikki sen sisältävät sensorit 
ovat päällä. Kun keskiarvosensori käynnistetään, täytyy kaikkien sen 
sisä ltävien sensorien käynnistyä jos ne eivät ole käynnissä. 
Kun keskiarvosensori suljetaan, täytyy ainakin yhden sen sisältävän 
sensorin mennä pois päältä. Saa myös käydä niin että kaikki sen 
sisältävät sensorit menevät pois päältä.

`Keskiarvosensori`n metodi mittaa palauttaa sen sisältämien sensoreiden 
lukemien keskiarvon (koska paluuarvo on int, pyöristyy lukema alaspäin 
kuten kokonaisluvuilla tehdyissä jakolaskuissa). Jos keskiarvosensorin 
metodia mittaa kutsutaan sensorin ollessa poissa päältä, tai jos 
keskiarvosensorille ei vielä ole lisätty yhtään sensoria heitetään 
poikkeus `IllegalStateException`.

Seuraavassa sensoreja käyttävä esimerkkiohjelma 
(huomaa, että sekä Lämpömittarin että `Keskiarvosensori`n konstruktorit 
ovat parametrittomia):

```java
public static void main(String[] args) {
    Sensori kumpula = new Lampomittari();
    kumpula.paalle();
    System.out.println("lämpötila Kumpulassa " + kumpula.mittaa() + " astetta");

    Sensori kaisaniemi = new Lampomittari();
    Sensori helsinkiVantaa = new Lampomittari();

    Keskiarvosensori paakaupunki = new Keskiarvosensori();
    paakaupunki.lisaaSensori(kumpula);
    paakaupunki.lisaaSensori(kaisaniemi);
    paakaupunki.lisaaSensori(helsinkiVantaa);

    paakaupunki.paalle();
    System.out.println("lämpötila Pääkaupunkiseudulla " + paakaupunki.mittaa() + " astetta");
}
```

## Osa 4: Kaikki mittaukset

Lisää luokalle `Keskiarvosensori` metodi 
`public List<Integer> mittaukset()`, 
  
joka palauttaa listana kaikkien keskiarvosensorin avulla suoritettujen 
mittausten tulokset. Seuraavassa esimerkki metodin toiminnasta:

```java
public static void main(String[] args) {
    Sensori kumpula = new Lampomittari();
    Sensori kaisaniemi = new Lampomittari();
    Sensori helsinkiVantaa = new Lampomittari();

    Keskiarvosensori paakaupunki = new Keskiarvosensori();
    paakaupunki.lisaaSensori(kumpula);
    paakaupunki.lisaaSensori(kaisaniemi);
    paakaupunki.lisaaSensori(helsinkiVantaa);

    paakaupunki.paalle();
    System.out.println("lämpötila Pääkaupunkiseudulla " + paakaupunki.mittaa() + " astetta");
    System.out.println("lämpötila Pääkaupunkiseudulla " + paakaupunki.mittaa() + " astetta");
    System.out.println("lämpötila Pääkaupunkiseudulla " + paakaupunki.mittaa() + " astetta");

    System.out.println("mittaukset: " + paakaupunki.mittaukset());
}
```

Alla olevan esimerkin tulostukset riippuvat jälleen arvotuista lämpötiloista:
Esimerkkitulostus

```
lämpötila Pääkaupunkiseudulla -10 astetta
lämpötila Pääkaupunkiseudulla -4 astetta
lämpötila Pääkaupunkiseudulla 5 astetta

mittaukset: [-10, -4, 5]
```

