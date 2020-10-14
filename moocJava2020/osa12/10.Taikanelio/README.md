# Tehtävä: 10.Taikanelio (4 osaa)

[Taikaneliöt](https://fi.wikipedia.org/wiki/Taikaneli%C3%B6) ovat 
kokonaisluvuista järjestettyjä neliöitä, joiden jokaisen rivin, sarakkeen ja lävistäjän summa on sama. Harjoitellaan taulukoiden käyttöä taikaneliöiden yhteydessä.

Ohjelmassa on annettu osittain toteutettu luokka `Taikanelio`, 
jota voidaan käyttää lähtökohtana. Tehtävänäsi on ensin lisätä luokkaan 
toiminnallisuutta, jolla tarkistetaan onko neliö taikaneliö. 
Tämän jälkeen toteutat algoritmin taikaneliön luomiseen.

## Osa 1: Rivien summat

Luokassa `Taikanelio` on valmiina metodi 
`public ArrayList<Integer> rivienSummat()`, 

joka palauttaa tyhjän ArrayList-olion. Muuta metodin toiminnallisuutta 
siten, että se palauttaa listan, jossa on jokaisen taikaneliön rivin summa.

Esimerkiksi seuraavanlaisella taikaneliöllä rivienSummat-metodin pitäisi 
palauttaa lista, jossa on luvut `15`, `15`, `15`.

```
8 1 6
3 5 7
4 9 2
```

Vaikka taikaneliö ei olisi "oikea" taikaneliö, tulee rivien summat 
silti palauttaa. 
Allaolevalla esimerkillä rivienSummat-metodin pitäisi palauttaa lista, 
jossa on luvut `6, 15, 24`.

```
1 2 3
4 5 6
7 8 9
```

## Osa 2: Sarakkeiden summat

Luokassa Taikanelio on valmiina metodi 
`public ArrayList<Integer> sarakkeidenSummat()`, 
joka palauttaa tyhjän ArrayList-olion. Muuta metodin toiminnallisuutta 
siten, että se palauttaa listan, jossa on jokaisen taikaneliön 
sarakkeen summa.

Esimerkiksi seuraavanlaisella taikaneliöllä sarakkeidenSummat-metodin 
pitäisi palauttaa lista, jossa on luvut `15, 15, 15`.

```
8 1 6
3 5 7
4 9 2
```

Vaikka taikaneliö ei olisi "oikea" taikaneliö, tulee sarakkeiden summat 
silti palauttaa. Allaolevalla esimerkillä sarakkeidenSummat-metodin 
pitäisi palauttaa lista, jossa on luvut `12, 15, 18`.

```
1 2 3
4 5 6
7 8 9
```

## Osa 3: Lävistäjien summat

Toteuta seuraavaksi metodi 
`public ArrayList<Integer> lavistajienSummat()`, 
joka palauttaa listan, jossa on taikaneliön lävistäjien summat.

Esimerkiksi seuraavanlaisella taikaneliöllä lavistajienSummat-metodin 
pitäisi palauttaa lista, jossa on luvut `15, 15 (8 + 5 + 2) ja (4 + 5 + 6)`.

```
8 1 6
3 5 7
4 9 2
```

Vaikka taikaneliö ei olisi "oikea" taikaneliö, tulee lävistäjien summat 
silti palauttaa. Allaolevalla esimerkillä lavistajienSummat-metodin 
pitäisi palauttaa lista, jossa on luvut `15, 15 (1 + 5 + 9) ja (7 + 5 + 3)`.

```
1 2 3
4 5 6
7 8 9
```

## Osa 4: Taikaneliön luominen


Huom! Tämä tehtävä on melko visainen, kannattanee palauttaa edelliset osat 
ennen tämän aloitusta.
Taikaneliön pystyy myös luomaan. Tutustutaan [Siamese method](https://en.wikipedia.org/wiki/Siamese_method)
-menetelmään, jonka avulla voidaan luoda parittomien lukujen 
kokoisia taikaneliöitä.

Siamese method -algoritmi toimii siten, että numero yksi asetetaan ylimmän 
rivin keskimmäiseen sarakkeeseen. Tämän jälkeen siirrytään yksi ylös ja 
yksi oikealle ja asetetaan luku kaksi. Tämän jälkeen taas siirrytään yksi 
ylös ja yksi oikealle, ja asetetaan luku kolme jne.

Lukujen lisäämiseen liittyy kaksi sääntöä:

1. Jos siirtymä tapahtuu siten, että mennään taikaneliön alueen 
  ulkopuolelle, hypätään toiselle laidalle. Jos siis mennään "oikealta yli" 
  mennään vasempaan laitaan ja jos mennään "ylhäältä yli" 
  mennään alalaitaan.
2. Jos kohdassa on jo luku, ei mennäkään ylös ja oikealle, vaan astutaan 
  yksi askel alaspäin.

Käy katsomassa yllä kuvatun algoritmin visualisaatio Wikipedian sivulta 
[Siamese method](https://en.wikipedia.org/wiki/Siamese_method).

Toteuta luokkaan Taikaneliotehdas metodi luoTaikanelio joka palauttaa 
taikaneliön jonka sivun pituus annetaan parametrina. Metodin tarvitsee 
toimia vain tilanteissa, missä neliön leveys on pariton luku.

