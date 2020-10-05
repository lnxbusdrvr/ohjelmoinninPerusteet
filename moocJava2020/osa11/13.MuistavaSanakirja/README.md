# Tehtävä: 13.MuistavaSanakirja (4 osaa)

Tässä tehtävässä laajennetaan sanakirjaa siten, että sanat voidaan lukea 
tiedostosta ja kirjoittaa tiedostoon. Sanakirjan tulee myös osata 
kääntää molempiin suuntiin, suomesta vieraaseen kieleen sekä toiseen 
suuntaan (tehtävässä oletetaan hieman epärealistisesti, että suomen 
kielessä ja vieraassa kielessä ei ole yhtään samalla tavalla 
kirjoitettavaa sanaa). Tehtävänäsi on luoda sanakirja luokkaan 
`MuistavaSanakirja`. Toteuta luokka pakkaukseen `sanakirja`.

# Osa 1: Muistiton perustoiminnallisuus

Tee sanakirjalle parametriton konstruktori sekä metodit:

- `public void lisaa(String sana, String kaannos)` lisää sanan 
  sanakirjaan. Jokaisella sanalla on vain yksi käännös ja jos sama 
  sana lisätään uudelleen, ei tapahdu mitään.
- `public String kaanna(String sana)` palauttaa käännöksen annetulle 
  sanalle. Jos sanaa ei tunneta, palautetaan null.

Sanakirjan tulee tässä vaiheessa toimia seuraavasti:

```java
MuistavaSanakirja sanakirja = new MuistavaSanakirja();
sanakirja.lisaa("apina", "monkey");
sanakirja.lisaa("banaani", "banana");
sanakirja.lisaa("apina", "apfe");

System.out.println(sanakirja.kaanna("apina"));
System.out.println(sanakirja.kaanna("monkey"));
System.out.println(sanakirja.kaanna("ohjelmointi"));
System.out.println(sanakirja.kaanna("banana"));
```


Esimerkkitulostus:

```
monkey
apina
null
banaani
```

# Osa 2: Sanojen poistaminen

Lisää sanakirjalle metodi 
`public void poista(String sana)` 

joka poistaa annetun sanan ja sen käännöksen sanakirjasta.

Kannattanee kerrata aiemmilta viikoilta materiaalia, mikä liittyy olioiden 
poistamiseen ArrayListista.
**HUOM2**: metodi `poista` ei kirjoita tiedostoon.

Sanakirjan tulee tässä vaiheessa toimia seuraavasti:


```
MuistavaSanakirja sanakirja = new MuistavaSanakirja();
sanakirja.lisaa("apina", "monkey");
sanakirja.lisaa("banaani", "banana");
sanakirja.lisaa("ohjelmointi", "programming");
sanakirja.poista("apina");
sanakirja.poista("banana");

System.out.println(sanakirja.kaanna("apina"));
System.out.println(sanakirja.kaanna("monkey"));
System.out.println(sanakirja.kaanna("banana"));
System.out.println(sanakirja.kaanna("banaani"));
System.out.println(sanakirja.kaanna("ohjelmointi"));
```


```
null
null
null
null
programming
```

Poisto siis toimii myös molemmin puolin, alkuperäisen sanan tai sen 
käännöksen poistamalla, poistuu sanakirjasta tieto molempien suuntien 
käännöksestä

# Osa 3: Lataaminen tiedostosta

Tee sanakirjalle konstruktori 
`public MuistavaSanakirja(String tiedosto)` 

ja metodi `public boolean lataa()`, 

joka lataa sanakirjan konstruktorin parametrina annetun nimisestä 
tiedostosta. Jos tiedoston avaaminen tai lukeminen ei onnistu, 
palauttaa metodi false ja muuten true.
**Huom**: parameterillinen konstruktori ainoastaan kertoo sanakirjalle 
käytetävän tiedoston nimen. Konstruktori ei lue tiedostoa, tiedoston 
lukeminen tapahtuu ainoastaan metodissa lataa.

Sanakirjatiedostossa yksi rivi sisältää sanan ja sen käännöksen 
merkillä ":" erotettuna. Tehtäväpohjan mukana tuleva testaamiseen 
tarkoitettu sanakirjatiedosto `sanat.txt` on sisällöltään seuraava:
Esimerkkitulostus:

```
apina:monkey
alla oleva:below
olut:beer
```

Lue sanakirjatiedosto rivi riviltä lukijan metodilla `nextLine`. 
Voit pilkkoa rivin String metodilla `split` seuraavasti:

```
Scanner tiedostonLukija = new ...
while (tiedostonLukija.hasNextLine()) {
    String rivi = tiedostonLukija.nextLine();
    String[] osat = rivi.split(":");   // pilkotaan rivi :-merkkien kohdalta

    System.out.println(osat[0]);     // ennen :-merkkiä ollut osa rivistä
    System.out.println(osat[1]);     // :-merkin jälkeen ollut osa rivistä
}
```

Sanakirjaa käytetään seuraavasti:


```
MuistavaSanakirja sanakirja = new MuistavaSanakirja("sanat.txt");
boolean onnistui = sanakirja.lataa();

if (onnistui) {
    System.out.println("sanakirjan lataaminen onnistui");
}

System.out.println(sanakirja.kaanna("apina"));
System.out.println(sanakirja.kaanna("ohjelmointi"));
System.out.println(sanakirja.kaanna("alla oleva"));
```

Tulostuu

```
sanakirjan lataaminen onnistui
monkey
null
below
```

# Osa 4: Tallennus tiedostoon

Tee sanakirjalle metodi `public boolean tallenna()`, 
    
jota kutsuttaessa sanakirjan sisältö kirjoitetaan konstruktorin 
parametrina annetun nimiseen tiedostoon. Jos tallennus ei onnistu, 
palauttaa metodi false ja muuten true. Sanakirjatiedostot tulee 
tallentaa ylläesitellyssä muodossa, eli ohjelman on osattava lukea itse 
kirjoittamiaan tiedostoja.

**Huom1**: mikään muu metodi kuin tallenna ei kirjoita tiedostoon. Jos teit 
edelliset kohdat oikein, sinun ei tulisi tarvita muuttaa mitään olemassaolevaa 
koodia.

**Huom2**: vaikka sanakirja osaa käännökset molempiin suuntiin, ei 
sanakirjatiedostoon tule kirjoittaa kuin toinen suunta. Eli jos sanakirja 
tietää esim. käännöksen tietokone = computer, tulee tallennuksessa olla rivi:

```
tietokone:computer
```

tai rivi

```
computer:tietokone
```

 
mutta ei molempia!

Talletus kannattanee hoitaa siten, että koko käännöslista kirjoitetaan 
uudelleen vanhan tiedoston päälle, eli materiaalissa esiteltyä 
`append`-metodia ei kannata käyttää.

Sanakirjan lopullista versiota on tarkoitus käyttää seuraavasti: 


```
MuistavaSanakirja sanakirja = new MuistavaSanakirja("sanat.txt");
sanakirja.lataa();

// käytä sanakirjaa

sanakirja.tallenna();
```

Eli käytön aluksi ladataan sanakirja tiedostosta ja lopussa tallennetaan se 
takaisin tiedostoon jotta sanakirjaan tehdyt muutokset pysyvät voimassa 
seuraavallekin käynnistyskerralle.


