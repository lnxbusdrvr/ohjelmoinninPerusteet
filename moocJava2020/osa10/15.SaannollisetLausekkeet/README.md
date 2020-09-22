# Tehtävä: 15.SaannollisetLausekkeet (3 osaa)

Harjoitellaan hieman säännöllisten lausekkeiden käyttöä. 
Tehtävissä haetut metodit tehdään luokkaan Tarkistin.

## Osa 1: Viikonpäivä

Tee säännöllisen lausekkeen avulla metodi 
`public boolean onViikonpaiva(String merkkijono)`, 
  
joka palauttaa `true` jos sen parametrina saama merkkijono on 
viikonpäivän lyhenne (ma, ti, ke, to, pe, la tai su).

Esimerkkitulostuksia metodia käyttävästä ohjelmasta:

Esimerkkitulostus

```
Anna merkkijono: ti
Muoto on oikea.

Anna merkkijono: abc
Muoto ei ole oikea.
```

## Osa 2: Vokaalitarkistus

Tee metodi 
`public boolean kaikkiVokaaleja(String merkkijono)` 

joka tarkistaa säännöllisen lausekkeen avulla ovatko parametrina olevan 
merkkijonon kaikki merkit vokaaleja.

Esimerkkitulostuksia metodia käyttävästä ohjelmasta:

Esimerkkitulostus:

```
Anna merkkijono: aie
Muoto on oikea.

Anna merkkijono: ane
Muoto ei ole oikea.
```

## Osa 3: Kellonaika

Säännölliset lausekkeet sopivat tietynlaisiin tilanteisiin. 
Joissain tapaukseesa lausekkeista tulee liian monimutkaisia, 
ja merkkijonon "sopivuus" kannattaa tarkastaa muulla tyylillä tai voi olla 
tarkoituksenmukaista käyttää säännöllisiä lausekkeita 
vain osaan tarkastuksesta.

Tee metodi 
`public boolean kellonaika(String merkkijono)` 

ohjelma, joka tarkistaa säännöllisen lausekkeen avulla onko parametrina 
oleva merkkijono muotoa tt:mm:ss oleva kellonaika 
(tunnit, minuutit ja sekunnit kaksinumeroisina).

Esimerkkitulostuksia metodia käyttävästä ohjelmasta:

Esimerkkitulostus:

```
Anna merkkijono: 17:23:05
Muoto on oikea.

Anna merkkijono: abc
Muoto ei ole oikea.

Anna merkkijono: 33:33:33
Muooto ei ole oikea.
```
