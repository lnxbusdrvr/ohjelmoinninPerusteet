# Tehtävä: 08.EnsimmaisiaPakkauksia (3 osaa)

## Osa 1: Käyttöliittymä-rajapinta

Tehtäväpohjassa on valmiina pakkaus `mooc`. Rakennetaan tämän pakkauksen 
sisälle sovelluksen toiminta. 
Lisää pakkaukseen `mooc` pakkaus `ui` 
(tämän jälkeen käytössä pitäisi olla pakkaus mooc.ui), 
ja lisää sinne rajapinta `Kayttoliittyma`.

Rajapinnan Kayttoliittyma tulee määritellä metodi `void paivita()`.

## Osa 2: Tekstikäyttöliittymä

Luo samaan pakkaukseen luokka `Tekstikayttoliittyma`, joka toteuttaa 
rajapinnan `Kayttoliittyma`. Toteuta luokassa `Tekstikayttoliittyma` 
rajapinnan `Kayttoliittyma` vaatima metodi 
`public void paivita()` 

siten, että sen ainut tehtävä on merkkijonon 
"Päivitetään käyttöliittymää"-tulostaminen 
`System.out.println`-metodikutsulla.

## Osa 3: Sovellusloogiikka

Luo tämän jälkeen pakkaus `mooc.logiikka`, ja lisää sinne luokka 
`Sovelluslogiikka`. Sovelluslogiikan tarjoaman toiminnallisuuden tulee 
olla seuraavanlainen.

- `public Sovelluslogiikka(Kayttoliittyma kayttoliittyma)`
  `Sovelluslogiikka`-luokan konstruktori. Saa parametrina 
  `Kayttoliittyma`-rajapinnan toteuttavan luokan. 
  Huom: jotta sovelluslogiikka näkisi rajapinnan, on sen "importoitava" se, 
  eli tarvitset tiedoston alkuun rivin `import mooc.ui.Kayttoliittyma`;
- `public void suorita(int montaKertaa)` Tulostaa `montaKertaa`-muuttujan 
  määrittelemän määrän merkkijonoa "Sovelluslogiikka toimii". 
  Jokaisen "Sovelluslogiikka toimii"-tulostuksen jälkeen tulee kutsua 
  konstruktorin parametrina saadun rajapinnan 
  `Kayttoliittyma`-toteuttaman olion määrittelemää `paivita()`-metodia.

Voit testata sovelluksen toimintaa seuraavalla pääohjelmaluokalla.

```java
import mooc.logiikka.Sovelluslogiikka;
import mooc.ui.Kayttoliittyma;
import mooc.ui.Tekstikayttoliittyma;

public class Main {

    public static void main(String[] args) {
        Kayttoliittyma kayttoliittyma = new Tekstikayttoliittyma();
        new Sovelluslogiikka(kayttoliittyma).suorita(3);
    }
}
```

Esimerkkitulostus

```
Sovelluslogiikka toimii
Päivitetään käyttöliittymää
Sovelluslogiikka toimii
Päivitetään käyttöliittymää
Sovelluslogiikka toimii
Päivitetään käyttöliittymää
```

