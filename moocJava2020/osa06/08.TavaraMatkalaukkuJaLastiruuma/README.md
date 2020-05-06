# Luku 6 osa 8

## Tehtävä 7 osaa

### Osa 1: Tavara-luokka

Tee luokka Tavara, josta muodostetut oliot vastaavat erilaisia tavaroita. 
Tallennettavat tiedot ovat tavaran nimi ja paino (kg).

Lisää luokkaan seuraavat metodit:

- Konstruktori, jolle annetaan parametrina tavaran nimi ja paino
- Metodi `public String getNimi()`, joka palauttaa tavaran nimen
- Metodi `public int getPaino()`, joka palauttaa tavaran painon
- Metodi `public String toString()`, joka palauttaa merkkijonon muotoa "nimi (paino kg)"

### Osa 2: Matkalaukku-luokka

Tee luokka Matkalaukku. Matkalaukkuun liittyy tavaroita ja maksimipaino, 
joka määrittelee tavaroiden suurimman mahdollisen yhteispainon.

Lisää luokkaan seuraavat metodit:

- Konstruktori, jolle annetaan maksimipaino
- Metodi `public void lisaaTavara(Tavara tavara)`, joka lisää parametrina annettavan tavaran matkalaukkuun. Metodi ei palauta mitään arvoa.
- Metodi `public String toString()`, joka palauttaa merkkijonon muotoa "x tavaraa (y kg)"

Tavarat kannattaa tallentaa ArrayList-olioon:

### Osa 3: Kielenhuoltoa

Ilmoitukset "0 tavaraa" ja "1 tavaraa" eivät ole kovin hyvää suomea — paremmat muodot 
olisivat "ei tavaroita" ja "1 tavara". 
Tee tämä muutos luokassa Matkalaukku sijaitsevaan `toString`-metodiin.

### Osa 4: Kaikki tavarat

Lisää luokkaan Matkalaukku seuraavat metodit:

- metodi `tulostaTavarat`, joka tulostaa kaikki matkalaukussa olevat tavarat
- metodi `yhteispaino`, joka palauttaa tavaroiden yhteispainon

### Osa 5: Raskain tavara

Lisää vielä luokkaan 
`Matkalaukku` metodi `raskainTavara`, 

joka palauttaa painoltaan suurimman tavaran.
Jos yhtä raskaita tavaroita on useita, metodi voi palauttaa minkä tahansa niistä. 
Metodin tulee palauttaa olioviite. Jos laukku on tyhjä, palauta arvo null.

### Osa 6: Lastiruuma-luokka

Tee luokka Lastiruuma, johon liittyvät seuraavat metodit:

- konstruktori, jolle annetaan maksimipaino
- metodi `public void lisaaMatkalaukku(Matkalaukku laukku)`, joka lisää parametrina annetun matkalaukun lastiruumaan
- metodi `public String toString()`, joka palauttaa merkkijonon muotoa "x matkalaukkua (y kg)"

Tallenna matkalaukut sopivaan ArrayList-rakenteeseen.

Luokan `Lastiruuma` tulee valvoa, että sen sisältämien matkalaukkujen yhteispaino ei ylitä maksimipainoa. 
Jos maksimipaino ylittyisi uuden matkalaukun vuoksi, metodi lisaaMatkalaukku ei saa lisätä uutta matkalaukkua.

### Osa 7: Lastiruuman sisältö

Lisää luokkaan `Lastiruuma` 
metodi `public void tulostaTavarat()`, 

joka tulostaa kaikki lastiruuman matkalaukuissa olevat tavarat.
