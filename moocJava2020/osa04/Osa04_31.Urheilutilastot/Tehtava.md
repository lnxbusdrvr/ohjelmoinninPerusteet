# Urheilutilastot

## 2 osaa

Tehtävässä käsitellään CSV-muodossa tallennettuja urheilutilastoja.
Tiedosto sisältää pilkulla erotettuna kotijoukkeen, vierasjoukkueen,
kotijoukkueen pisteet, sekä vierasjoukkueen pisteet.

### Comma Seperated Values -tiedosto

data.csv sisältö:

```
ENCE,Vitality,9,16
ENCE,Vitality,16,12
ENCE,Vitality,9,16
ENCE,Heroic,10,16
SJ,ENCE,0,16
SJ,ENCE,3,16
FURIA,NRG,7,16
FURIA,Prospects,16,1
```

Kirjoita ohjelma, joka kysyy käyttäjältä tiedoston nimeä,
jonka jälkeen ohjelma lukee tiedostosta ottelutilastot.
Tämän jälkeen ohjelma kysyy käyttäjältä joukkueen nimeä,
ja tulostaa joukkueeseen liittyen seuraavissa osissa määritellyt tiedot.

## Osa 1: Otteluiden määrä

Toteuta ohjelmaan mahdollisuus annetun joukkueen otteluiden lukumäärän tulostamiseen.
Alla olevassa esimerkissä käytetään edellä kuvattua ```data.csv```-tiedostoa.

Esimerkkitulostus:
```
Minkä niminen tiedosto luetaan?
data.csv
Minkä nimisen joukkueen tiedot tulostetaan?
FURIA
Otteluita: 2
```

Esimerkkitulostus:
```
Esimerkkitulostus

Minkä niminen tiedosto luetaan?
data.csv
Minkä nimisen joukkueen tiedot tulostetaan?
ENCE
Otteluita: 6
```
## Osa 2: Voittojen ja tappioiden määrä

Lisää ohjelmaan toiminnallisuus annetun joukkueen voittojen ja tappioiden määrän tulostamiseen.
Voittaja on se joukkue, joka saa ottelussa enemmän pisteitä.

Voit olettaa, ettei pelit pääty koskaan tasapeliin.
Alla olevassa esimerkissä käytetään edellä kuvattua ```data.csv```-tiedostoa.

Esimerkkitulostus:
```
Minkä niminen tiedosto luetaan?
data.csv
Minkä nimisen joukkueen tiedot tulostetaan?
FURIA
Otteluita: 2
Voittoja: 1
Tappioita: 1
```
Esimerkkitulostus:
```
Minkä niminen tiedosto luetaan?
data.csv
Minkä nimisen joukkueen tiedot tulostetaan?
ENCE
Otteluita: 6
Voittoja: 3
Tappioita: 3
```



