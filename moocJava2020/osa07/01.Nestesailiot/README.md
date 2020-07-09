# Nestesäiliöt (3 osaa)

## Osa 1: Lisääminen

```lisaa maara``` lisää ensimmäiseen säiliöön parametrina annetun määrän nestettä. 
Annettu määrä kuvataan kokonaislukuna.
Säiliössä ei voi olla yli sataa yksikköä nestettä ja liialliset lisäykset menevät hukkaan.
Tee luokka Lahja, josta muodostetut oliot kuvaavat erilaisia lahjoja. 
Tallennettavat tiedot ovat tavaran nimi ja paino (kg).

Esimerkkitulostus:

```
Ensimmäinen: 0/100
Toinen: 0/100
lisaa 5

Ensimmäinen: 5/100
Toinen: 0/100
lisaa 25

Ensimmäinen: 30/100
Toinen: 0/100
lisaa 60

Ensimmäinen: 90/100
Toinen: 0/100
lisaa 1000

Ensimmäinen: 100/100
Toinen: 0/100
lisaa -5

Ensimmäinen: 100/100
Toinen: 0/100
lopeta
```
 
## Osa 2: Siirtäminen

```siirra maara``` siirtää ensimmäisestä säiliöstä toiseen parametrina annetun määrän nestettä.
Annettu määrä kuvataan kokonaislukuna. Säiliössä ei voi olla yli sataa yksikköä nestettä. 
Mikäli ohjelmassa yritetään siirtää enemmän kuin ensimmäisessä säiliössä on, 
siirretään ensimmäisen säiliön koko sisältö. 
Mikäli ohjelmassa yritetään siirtää enemmän kuin toiseen säiliöön mahtuu, 
valuu toiseen säiliöön mahtumaton osa hukkaan.

Toteuta toiminnallisuus nesteen siirtämiseen ensimmäisestä säiliöstä toiseen.

Esimerkkitulostus:

```
Ensimmäinen: 0/100
Toinen: 0/100
lisaa 1000

Ensimmäinen: 100/100
Toinen: 0/100
siirra 50

Ensimmäinen: 50/100
Toinen: 50/100
lisaa 100

Ensimmäinen: 100/100
Toinen: 50/100
siirra 100

Ensimmäinen: 0/100
Toinen: 100/100
lopeta
```

## Osa 3: Poistaminen

```poista maara``` poistaa toisesta säiliöstä parametrina annetun määrän nestettä. 
Mikäli ohjelmaa pyydetään poistamaan enemmän kuin mitä säiliössä on, 
poistetaan säiliöstä vain säiliön sisältö.

Toteuta toiminnallisuus nesteen poistamiseen toisesta säiliöstä.

Esimerkkitulostus:

```
Ensimmäinen: 0/100
Toinen: 0/100
poista 10

Ensimmäinen: 0/100
Toinen: 0/100
lisaa 20

Ensimmäinen: 20/100
Toinen: 0/100
poista 5

Ensimmäinen: 20/100
Toinen: 0/100
siirra 15

Ensimmäinen: 5/100
Toinen: 15/100
poista 5

Ensimmäinen: 5/100
Toinen: 10/100
poista 20

Ensimmäinen: 5/100
Toinen: 0/100
lopeta
```

### Toteutustapa

Toteuta ohjelma proseduraalista ohjelmointityyliä noudattaen ilman omia luokkia. 
Kaikki toiminnallisuus tulee lisätä luokassa Nestesailiot olevaan metodiin main (älä siis tee omia metodeja). 
Tehtäväpohjassa on valmiina toistolause, mistä poistutaan kun käyttäjä kirjoittaa "lopeta".

