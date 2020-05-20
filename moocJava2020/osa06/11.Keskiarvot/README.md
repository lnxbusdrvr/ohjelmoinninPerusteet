# Tehtävä

## 11: Keskiarvot (3 osaa)

### Osa 1: Arvosanojen keskiarvo

Lisää luokalle `Arvosanarekisteri` metodi 
`public double arvosanojenKeskiarvo()`, 

joka palauttaa arvosanojen keskiarvon. 
Mikäli arvosanarekisterissä ei ole yhtäkään arvosanaa, 
tulee metodin palauttaa luku -1. 
Laske arvosanojen keskiarvo arvosanat-listaa hyödyntäen.

Esimerkkitulostus:

```
4.75
```

### Osa 2: Koepisteiden keskiarvo

Lisää luokalle `Arvosanarekisteri` uusi oliomuuttuja `lista`, 
johon lisäät koepisteitä aina kun luokkaa käyttävä ohjelma kutsuu metodia `lisaaArvosanaPisteidenPerusteella`. 
Lisää tämän jälkeen luokalle metodi 
`public double koepisteidenKeskiarvo()`, 

joka laskee ja palauttaa koepisteiden keskiarvon. 
Mikäli arvosanarekisteriin ei ole lisätty yhtäkään koepistettä, 
tulee metodin palauttaa luku -1.

Esimerkkitulostus:

```
92.0
```

### Osa 3: Tulostukset käyttöliittymään

Lisää lopulta edellä toteutetut metodit osaksi käyttöliittymää. 
Kun sovellus tulostaa arvosanajakauman, tulee sovelluksen tulostaa myös pisteiden ja arvosanojen keskiarvo.

Esimerkkitulostus:


```
Syötä koepisteet: 82
Syötä koepisteet: 83
Syötä koepisteet: 96
Syötä koepisteet: 51
Syötä koepisteet: 48
Syötä koepisteet: 56
Syötä koepisteet: 61
Syötä koepisteet:

5: *
4: **
3:
2: *
1: **
0: *
Koepisteiden keskiarvo: 68.14285714285714
Arvosanojen keskiarvo: 2.4285714285714284``

```
