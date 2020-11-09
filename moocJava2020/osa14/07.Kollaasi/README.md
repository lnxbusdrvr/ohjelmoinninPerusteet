# Tehtävä: 07.Kollaasi (3 osaa)

Andy Warhol tuli tutuksi kuvakollaaseista, joissa yksi tai useampi kuva 
toistui useampaan otteeseen esimerkiksi eri väreissä.

Matkitaan tässä tehtävässä hänen tyyliään ja luodaan Andy Warholmainen 
versio klassisesta Mona Lisasta. Valmis ohjelma näyttää Mona Lisan 
seuraavan näköisenä.

![Kuva](kuva0.png)

Aloitetaan.

## Osa 1: Vasen yläkulma

Tehtäväpohjassa on ohjelma, joka lataa ja näyttää Mona Lisan. 
Tässä tehtävän osassa tavoitteenasi on luoda tilanne, missä Mona Lisa näkyy 
pienempänä kuvana vasemmassa yläkulmassa. Pienemmän kuvan koon tulee olla 
neljäsosa alkuperäisestä kuvasta.

![Kuva 1](kuva1.png)

Käytännössä siis koordinaattiin 0, 0 tulee kopioida koordinaatin 0, 0 arvo. 
Koordinaattiin 0, 1 koordinaatin 0, 2 arvo. Koordinaattiin 0, 
2 koordinaatin 0, 4 arvo. Koordinaattiin 0, 3 koordinaatin 0, 6 arvo jne. 
Vastaavasti myös y-akselilla, eli esimerkiksi koordinaattiin 1, 
1 koordinaatin 2, 2 arvo, ja koordinaattiin 1, 2 koordinaatin 2, 4 arvo.

## Osa 2: Ruudukko

Muokkaa seuraavaksi ohjelmaa siten, että edellisessä osassa vasempaan 
yläkulmaan luotu kuva toistuu kuvassa neljään kertaan. Ensimmäisen kuvan 
vasemman yläkulman tulee olla koordinaatissa 0, 0. Toisen kuvan vasemman 
yläkulman tulee olla koordinaatissa (kuvan leveys / 2), 0. Kolmannen kuvan 
vasemman yläkulman tulee olla koordinaatissa 0, (kuvan korkeus / 2). 
Neljännen kuvan vasemman yläkulman tulee olla 
koordinaatissa (kuvan leveys / 2), (kuvan korkeus / 2).

![Kuva 2](kuva2.png)

## Osa 3: Negatiivi

Kun olet saanut muodostettua ruudukon, muokkaa kuvaa vielä siten, 
että kuvassa näytetään negatiivi alkuperäisen kuvan sijaan. 
Negatiivin luominen onnistuu ottamalla jokaisen pikselin värin erotus 
luvusta yksi, esim. `punainen = 1.0 - punainen`.

![kuva3](kuva3.jpg)

Tehtäväpohjan mukana tuleva Mona Lisa -kuva on noudettu Wikimedian 
osoitteesta [https://commons.wikimedia.org/wiki/Category:Mona_Lisa](https://commons.wikimedia.org/wiki/Category:Mona_Lisa). 
Käytetty kuva on vapaasti käytettävissä.


