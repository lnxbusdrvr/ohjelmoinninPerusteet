# 06_09: Sanakirja

## Tehtävä

### Osa 1: Tekstikäyttöliittymän käynnistys ja lopetus

Toteuta luokka `Tekstikayttoliittyma`, 
joka saa konstruktorin parametrina `Scanner`-olion sekä `Sanakirja`-olion. 
Lisää tämän jälkeen luokalle metodi 
`public void kaynnista()`. 

Metodin tulee toimia seuraavalla tavalla:

1. Metodi kysyy käyttäjältä komentoa.
2. Mikäli komento on lopeta, tekstikäyttöliittymä tulostaa merkkijonon "Hei hei!" ja metodin kaynnista suoritus päättyy.
3. Muulloin, tekstikäyttöliittymä tulostaa viestin "Tuntematon komento", jonka jälkeen metodi jatkaa kysymällä käyttäjältä komentoa eli kohdasta 1.

Esimerkkitulostus:

```
Komento: jotain
Tuntematon komento
Komento: lisaa
Tuntematon komento
Komento: lopeta
Hei hei!
```

### Osa 2: Käännösten lisääminen

Muokkaa metodia `public void kaynnista()` siten, että se toimii seuraavalla tavalla:

1. Metodi kysyy käyttäjältä komentoa.
2. Mikäli komento on lopeta, tekstikäyttöliittymä tulostaa merkkijonon "Hei hei!" ja metodin kaynnista suoritus päättyy.
3. Mikäli komento on lisaa, tekstikäyttöliittymä kysyy käyttäjältä sanaa ja käännöstä, kumpaakin omalla rivillään. Tämän jälkeen sanat lisätään sanakirjaan ja metodi jatkaa kysymällä käyttäjältä komentoa eli kohdasta 1.
4. Muulloin, tekstikäyttöliittymä tulostaa viestin "Tuntematon komento", jonka jälkeen metodi jatkaa kysymällä käyttäjältä komentoa eli kohdasta 1.

Esimerkkitulostus:
```
Komento: jotain
Tuntematon komento
Komento: lisaa
Sana: hauki
Käännös: pike
Komento: muuta
Tuntematon komento
Komento: lopeta
Hei hei!
```

### Osa 3: Sanan kääntäminen

Muokkaa metodia `public void kaynnista()` 
siten, että se toimii seuraavalla tavalla:

1. Metodi kysyy käyttäjältä komentoa.
2. Mikäli komento on lopeta, tekstikäyttöliittymä tulostaa merkkijonon "Hei hei!" ja metodin kaynnista suoritus päättyy.
3. Mikäli komento on lisaa, tekstikäyttöliittymä kysyy käyttäjältä sanaa ja käännöstä, kumpaakin omalla rivillään. Tämän jälkeen sanat lisätään sanakirjaan ja metodi jatkaa kysymällä käyttäjältä komentoa eli kohdasta 1.
3. Mikäli komento on hae, tekstikäyttöliittymä kysyy käyttäjältä käännettävää sanaa. Tämän jälkeen tekstikäyttöliittymä tulostaa sanan käännöksen ja metodi jatkaa kysymällä käyttäjältä komentoa eli kohdasta 1.
4. Muulloin, tekstikäyttöliittymä tulostaa viestin "Tuntematon komento", jonka jälkeen metodi jatkaa kysymällä käyttäjältä komentoa eli kohdasta 1

Esimerkkitulostus:

```
Komento: jotain
Tuntematon komento
Komento: lisaa
Sana: hauki
Käännös: pike
Komento: muuta
Tuntematon komento
Komento: hae
Haettava: hauki
Käännös: pike
Komento: hae
Haettava: nauris
Käännös: null
Komento: lopeta
Hei hei!
```

### Osa 4: Käännöksen siistiminen

Muokkaa tekstikäyttöliittymän hakutoiminnallisuutta siten, että mikäli sanaa ei löydy 
(eli sanakirja palauttaa null-viitteen), tekstikäyttöliittymä tulostaa viestin "Sanaa (haettava) ei löydy".

Esimerkkitulostus:

```
Komento: jotain
Tuntematon komento
Komento: lisaa
Sana: hauki
Käännös: pike
Komento: muuta
Tuntematon komento
Komento: hae
Haettava: hauki
Käännös: pike
Komento: hae
Haettava: nauris
Sanaa nauris ei löydy
Komento: lopeta
Hei hei!
```
