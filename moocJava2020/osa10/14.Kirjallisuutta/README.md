# Tehtävä: 14.Kirjallisuutta (3 osaa)

Tee ohjelma, joka lukee käyttäjältä kirjoja ja niiden minimikohdeikiä. 
Minimikohdeiällä tarkoitetaan pienintä ikää vuosina, jolle kyseistä i
kirjaa suositellaan.

Ohjelma kysyy uusia kirjoja kunnes käyttäjä syöttää tyhjän merkkijonon 
kirjan nimen kohdalla (eli painaa rivinvaihtoa). Tämän jälkeen ohjelma 
tulostaa syötettyjen kirjojen lukumäärän sekä kirjat.

## Osa 1: Kirjojen lukeminen ja tulostaminen

Toteuta ensin kirjojen lukeminen ja niiden listaaminen. 
Tässä vaiheessa kirjojen järjestyksellä ei ole vielä väliä.

Esimerkkitulostus:

```
Syötä kirjan nimi, tyhjä lopettaa: Soiva tuutulaulukirja
Syötä kirjan pienin kohdeikä: 0

Syötä kirjan nimi, tyhjä lopettaa: Kurkkaa kulkuneuvot
Syötä kirjan pienin kohdeikä: 0

Syötä kirjan nimi, tyhjä lopettaa: Lunta tupaan
Syötä kirjan pienin kohdeikä: 12

Syötä kirjan nimi, tyhjä lopettaa: Litmanen 10
Syötä kirjan pienin kohdeikä: 10

Syötä kirjan nimi, tyhjä lopettaa:

Yhteensä 4 kirjaa.

Kirjat:
Soiva tuutulaulukirja (0 vuotiaille ja vanhemmille)
Kurkkaa kulkuneuvot (0 vuotiaille ja vanhemmille)
Lunta tupaan (12 vuotiaille ja vanhemmille)
Litmanen 10 (10 vuotiaille ja vanhemmille)
```

## Osa 2: Kirjojen järjestäminen kohdeiän perusteella

Täydennä toteuttamaasi ohjelmaa siten, että kirjat järjestetään 
tulostuksen yhteydessä kohdeiän perusteella. 
Jos kahdella kirjalla on sama kohdeikä, näiden kahden kirjan keskinäinen 
järjestys saa olla mielivaltainen.

Esimerkkitulostus:

```
Syötä kirjan nimi, tyhjä lopettaa: Soiva tuutulaulukirja
Syötä kirjan pienin kohdeikä: 0

Syötä kirjan nimi, tyhjä lopettaa: Kurkkaa kulkuneuvot
Syötä kirjan pienin kohdeikä: 0

Syötä kirjan nimi, tyhjä lopettaa: Lunta tupaan
Syötä kirjan pienin kohdeikä: 12

Syötä kirjan nimi, tyhjä lopettaa: Litmanen 10
Syötä kirjan pienin kohdeikä: 10

Syötä kirjan nimi, tyhjä lopettaa:

Yhteensä 4 kirjaa.

Kirjat:
Soiva tuutulaulukirja (0 vuotiaille ja vanhemmille)
Kurkkaa kulkuneuvot (0 vuotiaille ja vanhemmille)
Litmanen 10 (10 vuotiaille ja vanhemmille)
Lunta tupaan (12 vuotiaille ja vanhemmille)
```

## Osa 3: Kirjojen järjestäminen kohdeiän ja nimen perusteella

Täydennä edellistä ohjelmaasi siten, että saman kohdeiän kirjat 
tulostetaan aakkosjärjestyksessä.

Esimerkkitulostus:

```
Syötä kirjan nimi, tyhjä lopettaa: Soiva tuutulaulukirja
Syötä kirjan pienin kohdeikä: 0

Syötä kirjan nimi, tyhjä lopettaa: Kurkkaa kulkuneuvot
Syötä kirjan pienin kohdeikä: 0

Syötä kirjan nimi, tyhjä lopettaa: Lunta tupaan
Syötä kirjan pienin kohdeikä: 12

Syötä kirjan nimi, tyhjä lopettaa: Litmanen 10
Syötä kirjan pienin kohdeikä: 10

Syötä kirjan nimi, tyhjä lopettaa:

Yhteensä 4 kirjaa.

Kirjat:
Kurkkaa kulkuneuvot (0 vuotiaille ja vanhemmille)
Soiva tuutulaulukirja (0 vuotiaille ja vanhemmille)
Litmanen 10 (10 vuotiaille ja vanhemmille)
Lunta tupaan (12 vuotiaille ja vanhemmille)
```

