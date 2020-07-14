# Järjestäminen (5 osaa)

## Osa 1: Pienimmän arvon etsiminen

Tee luokkaan ```Paaohjelma``` luokkametodi ```pienin```, 
joka palauttaa metodille parametrina annetun kokonaislukutaulukon pienimmän luvun.

Metodin runko on seuraava:

```
public static int pienin(int[] taulukko) {
    // kirjoita koodia tähän
}
```

Seuraava esimerkki esittelee metodin toimintaa:
```
int[] luvut = {6, 5, 8, 7, 11};
System.out.println("Pienin: " + Paaohjelma.pienin(luvut));
```

Esimerkkitulostus:

```
Pienin: 5
```

## Osa 2: Pienimmän arvon indeksi

Tee luokkaan ```Paaohjelma``` luokkametodi ```pienimmanIndeksi```, 
joka palauttaa sille parametrina annetun taulukon pienimmän luvun indeksin.

Metodin runko on seuraava:

```
public static int pienimmanIndeksi(int[] taulukko) {
    // kirjoita koodia tähän
}
```

Esimerkkitulostus:

```
Pienimmän indeksi: 1
```

## Osa 3: Pienimmän arvon indeksi taulukon loppuosassa

Tee luokkaan ```Paaohjelma``` luokkametodi ```pienimmanIndeksiAlkaen```, 
joka toimii samalla tavalla kuin edellisen tehtävän metodi, 
mutta ottaa huomioon vain taulukon loppuosan jostain indeksistä alkaen. 
Metodille annetaan parametrina taulukon lisäksi aloitusindeksi, 
josta lähtien pienintä lukua etsitään.

Metodin runko on seuraava:

```
public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
    // kirjoita koodia tähän
}
```

Seuraava koodi esittelee metodin toimintaa:

```
// indeksit:    0  1  2  3   4
int[] luvut = {-1, 6, 9, 8, 12};
System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 0));
System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 1));
System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 2));
```

Esimerkkitulostus:

```
0
1
3
```

## Osa 4: Lukujen vaihtaminen

Tee luokkaan ```Paaohjelma``` luokkametodi ```vaihda```, 
jolle annetaan taulukko ja kaksi sen indeksiä. 
Metodi vaihtaa indekseissä olevat luvut keskenään.

Metodin runko on seuraava:

```
public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
    // kirjoita koodia tähän
}
```

Seuraavassa estellään metodin toimintaa. 
Taulukon tulostamisessa käytetään apuna 
taulukon merkkijonoksi muotoilevaa 
Arrays-luokan ```toString```-luokkametodia:

```
int[] luvut = {3, 2, 5, 4, 8};

System.out.println(Arrays.toString(luvut));

Paaohjelma.vaihda(luvut, 1, 0);
System.out.println(Arrays.toString(luvut));

Paaohjelma.vaihda(luvut, 0, 3);
System.out.println(Arrays.toString(luvut));
```

Esimerkkitulostus:

```
[3, 2, 5, 4, 8]
[2, 3, 5, 4, 8]
[4, 3, 5, 2, 8]
```

## Osa 5: Järjestäminen

Nyt koossa on joukko hyödyllisiä metodeja, 
joiden avulla voimme toteuttaa järjestämisalgoritmin 
nimeltä valintajärjestäminen.

Valintajärjestämisen idea on seuraava:

- Siirretään taulukon pienin luku indeksiin 0.
- Siirretään taulukon toiseksi pienin luku indeksiin 1.
- Siirretään taulukon kolmanneksi pienin luku indeksiin 2.
- Jne.

Toisin sanoen:

- Tarkastellaan taulukkoa indeksistä 0 alkaen. Vaihdetaan keskenään indeksissä 0 oleva luku sekä taulukon pienin luku indeksistä 0 alkaen.
- Tarkastellaan taulukkoa indeksistä 1 alkaen. Vaihdetaan keskenään indeksissä 1 oleva luku sekä taulukon pienin luku indeksistä 1 alkaen.
- Tarkastellaan taulukkoa indeksistä 2 alkaen. Vaihdetaan keskenään indeksissä 2 oleva luku sekä taulukon pienin luku indeksistä 2 alkaen.
- Jne.

Toteuta luokkaan ```Paaohjelma``` luokkametodi ```jarjesta```, 
joka perustuu yllä olevaan ideaan. Metodissa on syytä olla silmukka, 
joka käy läpi taulukon indeksejä. 
Metodeista pieninIndeksiAlkaen ja vaihda on varmasti hyötyä. 
Tulosta myös taulukon sisältö ennen järjestämistä 
ja jokaisen kierroksen jälkeen, jotta voit varmistaa algoritmin toimivan oikein.

Metodin runko on seuraava:

```
public static void jarjesta(int[] taulukko) {

}
```

Testaa metodin toimintaa ainakin seuraavalla esimerkillä:

```
int[] luvut = {8, 3, 7, 9, 1, 2, 4};
Paaohjelma.jarjesta(luvut);
```

Ohjelman tulosteen tulisi olla seuraavanlainen. 
Huomaa että sinun tulee tulostaa taulukon sisältö jokaisen vaihtamisen jälkeen!


Esimerkkitulostus:

```
[8, 3, 7, 9, 1, 2, 4]
[1, 3, 7, 9, 8, 2, 4]
[1, 2, 7, 9, 8, 3, 4]
[1, 2, 3, 9, 8, 7, 4]
[1, 2, 3, 4, 8, 7, 9]
[1, 2, 3, 4, 7, 8, 9]
[1, 2, 3, 4, 7, 8, 9]
```

Huomaat, miten taulukko tulee pikkuhiljaa järjestykseen alkaen alusta ja edeten loppua kohti.
