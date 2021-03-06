# Tehtävä: 16.EnumJaIteraattori (4 osaa)

Tehdään ohjelma pienen yrityksen henkilöstön hallintaan.

## Osa 1: Koulutus

Tee lueteltu tyyppi eli enum `Koulutus` jolla on tunnukset i
FT (tohtori), FM (maisteri), LuK (kandidaatti), FilYO (ylioppilas).

## Osa 2: Henkilo

Tee luokka `Henkilo`. Henkilölle annetaan konstruktorin parametrina 
annettava `nimi` ja `koulutus`. Henkilöllä on myös koulutuksen kertova 
metodi 
`public Koulutus getKoulutus()` 

sekä alla olevan esimerkin mukaista jälkeä tekevä `toString`-metodi.

```java
Henkilo vilma = new Henkilo("Vilma", Koulutus.FT);
System.out.println(vilma);
```

Esimerkkitulostus

```
Vilma, FT
```

## Osa 3: Tyontekijat

Luo luokka `Tyontekijat`. `Työntekijät`-olio sisältää listan 
`Henkilo`-olioita. Luokalla on parametriton konstruktori ja seuraavat 
metodit:

- `public void lisaa(Henkilo lisattava)` lisää parametrina 
  olevan henkilön työntekijäksi
- `public void lisaa(List<Henkilo> lisattavat)` lisää parametrina 
  olevan listan henkilöitä työntekijöiksi
- `public void tulosta()` tulostaa kaikki työntekijät
- `public void tulosta(Koulutus koulutus)` tulostaa työntekijät 
  joiden koulutus on sama kuin parametrissa määritelty koulutus

HUOM: Luokan `Tyontekijat` tulosta-metodit on toteutettava 
iteraattoria käyttäen!

## Osa 4: Irtisanominen

Tee luokalle `Tyontekijat` metodi 
`public void irtisano(Koulutus koulutus)` 

joka poistaa Työntekijöiden joukosta kaikki henkilöt joiden koulutus on 
sama kuin metodin parametrina annettu.

**HUOM**: toteuta metodi iteraattoria käyttäen!

Seuraavassa esimerkki luokan käytöstä:

```java
Tyontekijat yliopisto = new Tyontekijat();
yliopisto.lisaa(new Henkilo("Petrus", Koulutus.FT));
yliopisto.lisaa(new Henkilo("Arto", Koulutus.FilYO));
yliopisto.lisaa(new Henkilo("Elina", Koulutus.FT));

yliopisto.tulosta();

yliopisto.irtisano(Koulutus.FilYO);

System.out.println("==");

yliopisto.tulosta();
```

Tulostuu:

```
Petrus, FT
Arto, FilYO
Elina, FT
==
Petrus, FT
Elina, FT
```
