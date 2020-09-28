# Kyselypalaute, palauta kaavio

Tee osoitteessa [yuml.me](https://yuml.me/) olevan palvelun avulla 
seuraavia luokkia kuvaava luokkakaavio. 
Liitä tehtävän vastauskenttään luokkakaavion luomiseen käytetty 
tekstimuotoinen esitys yUML-palvelusta.

```java
public class Opettaja {
    private String nimi;
    public Opettaja(String nimi) {
        this.nimi = nimi;
    }
    public String toString() {
        return this.nimi;
    }
}

public class Luento {
    private Opettaja opettaja;
    private String kurssi;
    public Luento(Opettaja opettaja, String kurssi) {
        this.opettaja = opettaja;
        this.kurssi = kurssi;
    }
    public void tulostaTiedot() {
        System.out.println(this.kurssi + ", ope: " + this.opettaja);
    }
}

import java.util.ArrayList;
public class Oppilaitos {
    private ArrayList<Opettaja> opettajat;
    public Oppilaitos() {
        this.opettajat = new ArrayList<>();
    }
    public void lisaaOpettaja(Opettaja opettaja) {
        this.opettajat.add(opettaja);
    }
    public String toString() {
        return "Oppilaitoksessa opettajia: " + this.opettajat.size();
    }
}
```

```yuml
// Osa 11.1 Tehtävä 07.2
[Oppilaitos||+Oppilaitos(); +lisaaOpettaja(opettaja: Opettaja): void; toString(): String] --> * [Opettaja|-nimi: String|+Opettaja(nimi:String);+toString():String] <-- [Luento|-kurssi:String|+Luento(opettaja: Opettaja, kurssi: String);+tulostaTiedot():void]
```

![luokkakaavio](yuml.png)


