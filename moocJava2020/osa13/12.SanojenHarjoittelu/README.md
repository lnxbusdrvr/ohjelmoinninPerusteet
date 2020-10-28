# Tehtävä: 12.SanojenHarjoittelu

Tässä tehtävässä laadit edellä olevaa materiaalia noudattaen sanojen 
harjoitteluun tarkoitetun sovelluksen. Sovelluksen tulee käynnistyä 
kun luokan SanaharjoitteluSovellus main-metodi suoritetaan.

Luo edellistä esimerkkiä noudattaen sanojen harjoitteluun tarkoitettu 
sovellus. Sanojen harjoitteluun tarkoitetun sovelluksen tulee tarjota 
kaksi näkymää. Ensimmäisessä näkymässä käyttäjä voi syöttää alkuperäisiä 
sanoja ja niiden käännöksiä. Toisessa näkymässä käyttäjältä kysytään 
sanojen käännöksiä. Harjoiteltavat sanat tulee aina arpoa kaikista 
syötetyistä sanoista.

Käyttöliittymästä tarkemmin. Sanojen syöttämisnäkymän näyttävän napin 
tekstin tulee olla "Lisää sanoja". Sanojen harjoittelunäkymän näyttävän 
napin tekstin tulee olla "Harjoittele". Sanoja syötettäessä ensimmäisen 
tekstikentän tulee olla sana alkuperäiskielellä, ja toisen tekstikentän 
tulee olla sana käännettynä. Syöttämiseen käytetyn napin tekstin tulee 
olla "Lisää sanapari". Harjoittelutilassa käyttäjältä kysytään aina 
sanoja alkuperäiskielellä ja hänen tulee kirjoittaa sanojen käännöksiä. 
Vastauksen tarkistamiseen käytetyn napin tekstin tulee olla "Tarkista". 
Jos vastaus on oikein, käyttöliittymässä näytetään teksti "Oikein!". 
Jos taas vastaus on väärin, käyttöliittymässä näytetään teksti "Väärin!" 
sekä tieto oikeasta vastausksesta.

```
 ___________________________________
|_____________________________-_o_x_|
|   ______________   _____________  |
|  |_lisää sanoja_| |_Harjoittele_| |
|                                   |
|      Sana:                        |
|      __________                   |
|     |_sana_____|                  |
|                                   |
|                                   |
|      Käännös:                     |
|      __________                   |
|     |_word_____|                  |
|                                   |
|      ________________             |
|     |_Lisää_sanapari_|            |
|                                   |
|___________________________________|
```


```
 ___________________________________
|_____________________________-_o_x_|
|   ______________   _____________  |
|  |_lisää sanoja_| |_Harjoittele_| |
|                                   |
|                                   |
|                                   |
|      Käännä sana 'sana'           |
|      __________                   |
|     |_word_____|                  |
|                                   |
|      ________                     |
|     |_Käännä_|                    |
|                                   |
|     oikein                        |
|___________________________________|
```

```
 ____________________________________________
|______________________________________-_o_x_|
|   ______________   _____________           |
|  |_lisää sanoja_| |_Harjoittele_|          |
|                                            |
|                                            |
|                                            |
|                                            |
|                                            |
|      Käännä sana 'koira'                   |
|      __________                            |
|     |_cat______|                           |
|                                            |
|      ________                              |
|     |_Käännä_|                             |
|                                            |
|     Väärin! Sanan 'koira' käännös on 'dog' |
|____________________________________________|
```

Sovelluksessa ei ole automaattisia testejä — palauta tehtävä kun sovellus 
toimii tehtävänannossa kuvatulla tavalla. Esimerkkiratkaisuun on 
hahmoteltu ensiaskeleita myös mahdollisesta tilastotoiminnallisuudesta, 
joka ei kuitenkaan ole oleellista tehtävän tavoitteiden kannalta.

