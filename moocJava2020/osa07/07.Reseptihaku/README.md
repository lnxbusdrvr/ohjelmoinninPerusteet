# Reseptihaku (4 osaa)

## Osa 1: Reseptien lukeminen ja listaaminen

Luo ohjelmaan ensin mahdollisuus reseptien lukemiseen sekä listaamiseen. 
Ohjelman käyttöliittymän tulee olla seuraavanlainen. 
Voit olettaa, että käyttäjä syöttää aina tiedoston, 
joka on olemassa. Alla oletetaan, 
että tehtävänannossa annetut esimerkkireseptit ovat tiedostossa `reseptit.txt`.

Esimerkkitulostus:

```
Mistä luetaan? reseptit.txt

Komennot:
listaa - listaa reseptit
lopeta - lopettaa ohjelman

Syötä komento: listaa

Reseptit:
Lettutaikina, keittoaika: 60
Lihapullat, keittoaika: 20
Tofurullat, keittoaika: 30

Syötä komento:  lopeta
```

## Osa 2: Reseptien hakeminen nimen perusteella

Lisää ohjelmaan mahdollisuus reseptien hakemiseen nimen perusteella. 
Nimen perusteella hakeminen tapahtuu komennolla hae nimi, 
jonka jälkeen käyttäjältä kysytään merkkijonoa, jota etsitään reseptin nimistä. 
Hakutoiminnallisuuden tulee toimia siten, että se tulostaa kaikki ne reseptit, 
joiden nimessä esiintyy käyttäjän kirjoittama merkkijono.

Esimerkkitulostus:

```
Mistä luetaan? reseptit.txt

Komennot:
listaa - listaa reseptit
lopeta - lopettaa ohjelman
hae nimi - hakee reseptiä nimen perusteella

Syötä komento: listaa

Reseptit:
Lettutaikina, keittoaika: 60
Lihapullat, keittoaika: 20
Tofurullat, keittoaika: 30

Syötä komento: hae nimi
Mitä haetaan: rulla

Reseptit:
Tofurullat, keittoaika: 30

Syötä komento:  lopeta
```

## Osa 3: Reseptien hakeminen keittoajan perusteella

Lisää seuraavaksi ohjelmaan mahdollisuus reseptien hakemiseen keittoajan perusteella. 
Keittoajan perusteella hakeminen tapahtuu komennolla hae keittoaika, 
jonka jälkeen käyttäjältä kysytään suurinta hyväksyttävää keittoaikaa. 
Hakutoiminnallisuuden tulee toimia siten, että se tulostaa kaikki ne reseptit, 
joiden keittoaika on pienempi tai yhtä suuri kuin käyttäjän syöttämä keittoaika.

Esimerkkitulostus:

```
Mistä luetaan? reseptit.txt

Komennot:
listaa - listaa reseptit
lopeta - lopettaa ohjelman
hae nimi - hakee reseptiä nimen perusteella
hae keittoaika - hakee reseptiä keittoajan perusteella

Syötä komento: hae keittoaika
Keittoaika korkeintaan: 30

Reseptit:
Lihapullat, keittoaika: 20
Tofurullat, keittoaika: 30

Syötä komento: hae keittoaika
Keittoaika korkeintaan: 15

Reseptit:

Syötä komento: hae nimi
Mitä haetaan: rulla

Reseptit:
Tofurullat, keittoaika: 30

Syötä komento:  lopeta
```

## Osa 4: Reseptien hakeminen raaka-aineen perusteella

Lisää lopulta ohjelmaan mahdollisuus reseptien hakemiseen raaka-aineen perusteella. 
Raaka-aineen perusteella hakeminen tapahtuu komennolla hae aine, 
jonka jälkeen käyttäjältä kysytään merkkijonoa. 
Hakutoiminnallisuuden tulee toimia siten, 
että se tulostaa kaikki ne reseptit, joiden raaka-aineissa esiintyy käyttäjän antama merkkijono. 
Huomaa, että tässä annetun merkkijonon täytyy vastata täysin haettua raaka-ainetta (esim. "okeri" ei käy ole sama kuin "sokeri").

Esimerkkitulostus:

```
Mistä luetaan? reseptit.txt

Komennot:
listaa - listaa reseptit
lopeta - lopettaa ohjelman
hae nimi - hakee reseptiä nimen perusteella
hae keittoaika - hakee reseptiä keittoajan perusteella
hae aine - hakee reseptiä raaka-aineen perusteella

Syötä komento: hae keittoaika
Keittoaika korkeintaan: 30

Reseptit:
Lihapullat, keittoaika: 20
Tofurullat, keittoaika: 30

Syötä komento: hae aine
Mitä raaka-ainetta haetaan: sokeri

Reseptit:
Lettutaikina, keittoaika: 60

Syötä komento: hae aine
Mitä raaka-ainetta haetaan: muna

Reseptit:
Lettutaikina, keittoaika: 60
Lihapullat, keittoaika: 20

Syötä komento: hae aine
Mitä raaka-ainetta haetaan: una

Reseptit:

Syötä komento:  lopeta
```
