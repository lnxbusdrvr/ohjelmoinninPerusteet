# Arvosanatilastot (4 osaa)

## Osa 1: Pisteiden keskiarvot

Kirjoita ohjelma, joka lukee käyttäjältä kurssin yhteispisteitä kuvaavia kokonaislukuja. 
Luvut väliltä [0-100] ovat hyväksyttäviä ja luku -1 lopettaa syötteen. 
Muut luvut ovat virhesyötteitä, jotka tulee jättää huomiotta. 
Kun käyttäjä syöttää luvun -1, tulostetaan syötettyjen yhteispisteiden keskiarvo.

Esimerkkitulostus:

```
Syötä yhteispisteet, -1 lopettaa:
-42
24
42
72
80
52
-1
Pisteiden keskiarvo (kaikki): 54.0
```

## Osa 2: Hyväksyttyyn arvosanaan liittyvien pisteiden keskiarvot

Täydennä ohjelmaa siten, että se laskee kaikkien pisteiden keskiarvon lisäksi 
myös hyväksyttyyn arvosanaan liittyvien pisteiden keskiarvot.

Hyväksytyn arvosanan saa vähintään 50 kurssipisteellä. 
Voit olettaa, että käyttäjä kirjoittaa aina vähintään yhden välillä [0-100] olevan kokonaisluvun. 
Jos hyväksyttyyn arvosanaan osuvia lukuja ei ole lainkaan, tulostetaan viiva hyväksyttyjen keskiarvon kohdalle "-".

Esimerkkitulostus:

```
Syötä yhteispisteet, -1 lopettaa:
-42
24
42
72
80
52
-1
Pisteiden keskiarvo (kaikki): 54.0
Pisteiden keskiarvo (hyväksytyt): 68.0
```

## Osa 3: Hyväksyttyjen prosenttiosuus

Täydennä edellisessä osassa toteuttamaasi ohjelmaa siten, 
että ohjelma tulostaa myös hyväksymisprosentin. 
Hyväksymisprosentti lasketaan kaavalla 100 * hyväksytyt / osallistujat.

Esimerkkitulostus:

```
Syötä yhteispisteet, -1 lopettaa:
49
48
47
-1
Pisteiden keskiarvo (kaikki): 48.0
Pisteiden keskiarvo (hyväksytyt): -
Hyväksymisprosentti: 0.0
```

## Osa 4: Arvosanajakauma

Täydennä ohjelmaa siten, että ohjelma tulostaa myös arvosanajakauman. 
Arvosananajakauma muodostetaan seuraavasti.

| pistemäärä | arvosana      |
|------------|---------------|
|  < 50      | hylätty eli 0 |
|  < 60      | 1             |
|  < 70      | 2             |
|  < 80      | 3             |
|  < 90      | 4             |
| >= 90      | 5             |

Jokainen koepistemäärä muutetaan arvosanaksi yllä olevan taulukon perusteella. 
Jos syötetty pistemäärä ei ole välillä [0-100], jätetään se huomiotta.

Arvosanajakauma tulostetaan tähtinä. 
Esim jos arvosanaan 5 oikeuttavia koepistemääriä on 1 kappale, 
tulostuu rivi 5: *. Jos johonkin arvosanaan oikeuttavia pistemääriä ei ole, 
ei yhtään tähteä tulostu, alla olevassa esimerkissä näin on mm. nelosten kohdalla.

Esimerkkitulostus:

```
Syötä yhteispisteet, -1 lopettaa:
102
-2
1
33
77
99
-1
Pisteiden keskiarvo (kaikki): 52.5
Pisteiden keskiarvo (hyväksytyt): 88.0
Hyväksymisprosentti: 50.0
Arvosanajakauma:
5: *
4:
3: *
2:
1:
0: **
```

