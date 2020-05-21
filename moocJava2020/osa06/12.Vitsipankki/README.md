# Tehtävä

## 12: Vitsipankki (2 osaa)

### Osa 1: Vitsipankki

Luo luokka `Vitsipankki` ja siirrä sinne vitsien hallinnointiin liittyvä toiminnallisuus. 
Luokalla tulee olla parametriton konstruktori sekä seuraavat metodit:

- `public void lisaaVitsi(String vitsi)` - lisää vitsin vitsipankkiin.
- `public String arvoVitsi()` - arpoo vitsipankin vitseistä yhden vitsin ja palauttaa sen. Mikäli vitsipankissa ei ole vitsejä, palauttaa merkkijonon "Vitsit vähissä.".
- `public void tulostaVitsit()` - tulostaa vitsipankissa olevat vitsit.

Alla ohjelman mahdollinen tulostus. Huomaa, 
että arvotut vitsit eivät todennäköisesti tulostu alla kuvatun esimerkin mukaisesti.

Esimerkkitulostus:

```
Arvotaan vitsejä:
Mikä on sinistä ja tuoksuu punaiselle maalille? - Sininen maali.
Mikä on punaista ja tuoksuu siniselle maalille? - Punainen maali.
Mikä on sinistä ja tuoksuu punaiselle maalille? - Sininen maali.
Mikä on sinistä ja tuoksuu punaiselle maalille? - Sininen maali.
Mikä on sinistä ja tuoksuu punaiselle maalille? - Sininen maali.

Tulostetaan vitsit:
Mikä on punaista ja tuoksuu siniselle maalille? - Punainen maali.
Mikä on sinistä ja tuoksuu punaiselle maalille? - Sininen maali.
```

### Osa 2: Käyttöliittymä

Luo luokka `Kayttoliittyma` ja siirrä sinne sovelluksen käyttöliittymätoiminnallisuus. 
Luokalla tulee olla kaksiparametrinen konstruktori. 
Ensimmäisenä parametrina annetaan `Vitsipankki`-luokan ilmentymä, 
ja toisena parametrina Scanner-luokan ilmentymä. 
Tämän lisäksi luokalla tulee olla metodi public void kaynnista(), 
joka käynnistää käyttöliittymän.

Käyttöliittymän tulee tarjota seuraavat komennot:

- `X` - lopettaminen: poistuu metodista kaynnista.
- `1` - lisääminen: kysyy käyttäjältä vitsipankkiin lisättävää vitsiä ja lisää käyttäjän syöttämän vitsin vitsipankkiin.
- `2` - arpominen: arpoo vitsipankista vitsin ja tulostaa sen. Mikäli vitsipankissa ei ole vitsejä, tulostaa merkkijonon "Vitsit vähissä.".
- `3` - tulostaminen: tulostaa kaikki vitsipankissa olevat vitsit.

Esimerkkitulostus:

```
Komennot:
1 - lisää vitsi
2 - arvo vitsi
3 - listaa vitsit
X - lopeta
1
Kirjoita lisättävä vitsi:
Did you hear about the claustrophobic astronaut? — He just needed a little space.
Komennot:
1 - lisää vitsi
2 - arvo vitsi
3 - listaa vitsit
X - lopeta
3
Tulostetaan vitsit.
Did you hear about the claustrophobic astronaut? — He just needed a little space.
Komennot:
1 - lisää vitsi
2 - arvo vitsi
3 - listaa vitsit
X - lopeta
X
```
