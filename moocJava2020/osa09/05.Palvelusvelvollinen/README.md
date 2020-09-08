# Tehtävä: 05.Palvelusvelvollinen

## Alku

Tehtäväpohjassa on valmiina rajapinta Palvelusvelvollinen, jossa on seuraavat toiminnot:

- `metodi int paiviaJaljella()` palauttaa jäljellä olevien 
  palveluspäivien määrän
- `metodi void palvele()` vähentää yhden palveluspäivän. i
  Palveluspäivien määrä ei saa mennä negatiiviseksi.

```java
public interface Palvelusvelvollinen {
    int paiviaJaljella();
    void palvele();
}
```

### Osa 1: Sivari

Tee `Palvelusvelvollinen`-rajapinnan toteuttava luokka `Sivari`, 
jolla parametriton konstruktori. 
Luokalla on oliomuuttuja `paivia`, 
joka alustetaan konstruktorikutsun yhteydessä arvoon 362.

### Osa 2: Asevelvollinen

Tee `Palvelusvelvollinen`-rajapinnan toteuttava luokka `Asevelvollinen`, 
jolla on parametrillinen konstruktori, jolla määritellään 
palvelusaika (`int paivia`).


