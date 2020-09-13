# _Tehtävä: 12.Elaimia (4 osaa)

Tässä tehtävässä demonstroit perinnän ja rajapintojen käyttöä.

## Osa 1: Eläin

Toteuta ensin abstrakti luokka `Elain`. 
Luokalla `Elain` on konstruktori, jolle annetaan parametrina 
eläimen `nimi`. 
Luokalla `Elain` on lisäksi parametrittomat metodit `syo` ja `nuku`, 
jotka eivät palauta arvoa (`void`), 
sekä parametriton metodi `getNimi`, joka palauttaa eläimen nimen.

Metodin `nuku` tulee tulostaa "(`nimi) nukkuu`" 
ja metodin `syo` tulee tulostaa "(nimi) syo". 
Tässä (nimi) on eläimelle annettu nimi.


## Osa 2: Koira

Toteuta luokan `Elain` perivä luokka `Koira`. 
Luokalla `Koira` tulee olla parametrillinen konstruktori, 
jolla luotavalle koiraoliolle voi antaa nimen. 
Tämän lisäksi koiralla tulee olla parametriton konstruktori, 
jolla koiran nimeksi tulee "Koira" sekä parametriton metodi hauku, 
joka ei palauta arvoa (void). Koiralla tulee olla myös metodit 
`syo` ja `nuku` kuten eläimillä yleensä ottaen.

Alla on esimerkki luokan Koira odotetusta toiminnasta:

```java
Koira koira = new Koira();
koira.hauku();
koira.syo();

Koira vuffe = new Koira("Vuffe");
vuffe.hauku();
```

Esimerkkitulostus:

```
Koira haukkuu
Koira syo
Vuffe haukkuu
```

## Osa 3: Kissa

Toteuta seuraavaksi luokka `Kissa`, joka perii luokan `Elain`. 
Luokalla `Kissa` tulee olla parametrillinen konstruktori, 
jolla luotavalle kissaoliolle voi antaa nimen. 
Tämän lisäksi kissalla tulee olla parametriton konstruktori, 
jolla kissan nimeksi tulee "Kissa" sekä parametriton metodi mourua, 
joka ei palauta arvoa (void). 
Kissalla tulee olla myös metodit syo ja nuku kuten ensimmäisessä osassa.

Alla on esimerkki luokan Kissa odotetusta toiminnasta:


```java
Kissa kissa = new Kissa();
kissa.mourua();
kissa.syo();

Kissa karvinen = new Kissa("Karvinen");
karvinen.mourua();
```

Esimerkkitulostus:

```
Kissa mouruaa
Kissa syo
Karvinen mouruaa
```

## Osa 4: Ääntelevä

Luo lopulta rajapinta `Aanteleva`, joka maarittelee parametrittoman 
metodin `aantele`, joka ei palauta arvoa (void). 
Toteuta rajapinta luokissa `Koira` että `Kissa`. 
Rajapinnan tulee hyödyntää aiemmin määriteltyjä 
`hauku` ja `mourua` -metodeja.

Alla on esimerkki odotetusta toiminnasta:

```java
Aanteleva koira = new Koira();
koira.aantele();

Aanteleva kissa = new Kissa("Karvinen");
kissa.aantele();
Kissa k = (Kissa) kissa;
k.mourua();
```

Esimerkkitulostus:


```
Koira haukkuu
Karvinen mouruaa
Karvinen mouruaa
```
