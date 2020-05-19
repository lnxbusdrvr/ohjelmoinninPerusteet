# Tehtavalista (2 osaa)

## Osa 1: Tehtävälista

Luo luokka Tehtavalista. Luokalla tulee olla parametriton konstruktori sekä seuraavat metodit:

- public void lisaa(String tehtava) - lisää tehtävälistalle parametrina annetun tehtävän.
- public void tulosta() - tulostaa tehtävät. Tulostuksessa jokaiselle tehtävällä on myös numero — käytä tässä tehtävän indeksiä (+1).
- public void poista(int numero) - poistaa annettua numeroa vastaavan tehtävän; numero liittyy tulostuksessa nähtyyn tehtävän numeroon.

Esimerkkitulostus:

```
1: lue kurssimateriaalia
2: katso uusin fool us
3: ota rennosti

1: lue kurssimateriaalia
2: ota rennosti
```

**Huom!** Voit olettaa, että metodille poista syötetään oikea tehtävää vastaava numero. 
Metodin tarvitsee toimia oikein vain kerran kunkin tulostuskutsun jälkeen.

## Osa 2: Käyttöliittymä

Toteuta seuraavaksi luokka `Kayttoliittyma`. 
Luokalla `Kayttoliittyma` tulee olla kaksiparametrinen konstruktori. 
Ensimmäisenä parametrina annetaan luokan `Tehtavalista` ilmentymä 
ja toisena parametrina luokan `Scanner` ilmentymä. 
Konstruktorin lisäksi luokalla tulee olla metodi 
`public void kaynnista()`, 

joka käynnistää tekstikäyttöliittymän. 
Tekstikäyttöliittymä toteutetaan ikuisen toistolauseen (while-true) avulla, 
ja sen tulee tarjota seuraavat komennot:

- Komento lopeta lopettaa toistolauseen suorituksen, jonka jälkeen ohjelman suoritus palaa kaynnista-metodista.
- Komento lisaa kysyy käyttäjältä lisättävää tehtävää. Kun käyttäjä syöttää lisättävän tehtävän, tulee se lisätä tehtävälistalle.
- Komento listaa tulostaa kaikki tehtävälistalla olevat tehtävät.
- Komento poista kysyy käyttäjältä poistettavan tehtävän tunnusta ja poistaa käyttäjän syöttämää tunnusta vastaavan tehtävän tehtävälistalta.

Esimerkkitulostus
```
Komento: lisaa
Lisättävä: kirjoita essee
Komento: lisaa
Lisättävä: lue kirja
Komento: listaa
1: kirjoita essee
2: lue kirja
Komento: poista
Mikä poistetaan? 1
Komento: listaa
1: lue kirja
Komento: poista
Mikä poistetaan? 1
Komento: listaa
Komento: lisaa
Lisättävä: lopeta
Komento: listaa
1: lopeta
Komento: lopeta
```

Huom! Käyttöliittymän tulee käyttää sille parametrina annettua tehtävälistaa ja Scanneria.
