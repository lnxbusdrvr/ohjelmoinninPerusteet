# Edellä kuvattu sovellus

`Paikka` domain-paketissa, eli tässä paketissa on aihealueet.

```java
package lentokentta.domain;

public class Paikka {

    private String tunnus;

    public Paikka(String tunnus) {
        this.tunnus = tunnus;
    }

    @Override
    public String toString() {
        return this.tunnus;
    }
}
```

`Lentokone` domain-paketissa

```java
package lentokentta.domain;

public class Lentokone {

    private String tunnus;
    private int kapasiteetti;

    public Lentokone(String tunnus, int kapasiteetti) {
        this.tunnus = tunnus;
        this.kapasiteetti = kapasiteetti;
    }

    public String getTunnus() {
        return this.tunnus;
    }

    public int getKapasiteetti() {
        return this.kapasiteetti;
    }

    @Override
    public String toString() {
        return this.tunnus + " (" + this.kapasiteetti + " henkilöä)";
    }
}
```

`Lento` doimain-paketissa

```java
package lentokentta.domain;

public class Lento {

    private Lentokone lentokone;
    private Paikka lahtopaikka;
    private Paikka kohdepaikka;

    public Lento(Lentokone lentokone, Paikka lahtopaikka, Paikka kohdepaikka) {
        this.lentokone = lentokone;
        this.lahtopaikka = lahtopaikka;
        this.kohdepaikka = kohdepaikka;
    }

    public Lentokone getLentokone() {
        return this.lentokone;
    }

    public Paikka getLahtopaikka() {
        return lahtopaikka;
    }

    public Paikka getKohdepaikka() {
        return kohdepaikka;
    }

    @Override
    public String toString() {
        return this.lentokone + " (" + this.lahtopaikka 
							+ "-" + this.kohdepaikka + ")";
    }
}
```

`Lentohallinta` logiikka-paketissa, eli tässä paketissa on toiminto.

```java
package lentokentta.logiikka;

import java.util.Collection;
import lentokentta.domain.Lento;
import lentokentta.domain.Lentokone;
import java.util.HashMap;
import java.util.Map;
import lentokentta.domain.Paikka;

public class Lentohallinta {

    private Map<String, Lentokone> lentokoneet;
    private Map<String, Lento> lennot;
    private Map<String, Paikka> paikat;

    public Lentohallinta() {
        this.lennot = new HashMap<>();
        this.lentokoneet = new HashMap<>();
        this.paikat = new HashMap<>();
    }

    public void lisaaLentokone(String tunnus, int kapasiteetti) {
        Lentokone lentokone = new Lentokone(tunnus, kapasiteetti);
        this.lentokoneet.put(tunnus, lentokone);
    }

    public void lisaaLento(Lentokone lentokone, String lahtotunnus, String kohdetunnus) {
        this.paikat.putIfAbsent(lahtotunnus, new Paikka(lahtotunnus));
        this.paikat.putIfAbsent(kohdetunnus, new Paikka(kohdetunnus));

        Lento lento = new Lento(lentokone, this.paikat.get(lahtotunnus), this.paikat.get(kohdetunnus));
        this.lennot.put(lento.toString(), lento);
    }

    public Collection<Lentokone> getLentokoneet() {
        return this.lentokoneet.values();
    }

    public Collection<Lento> getLennot() {
        return this.lennot.values();
    }

    public Lentokone haeLentokone(String tunnus) {
        return this.lentokoneet.get(tunnus);
    }
}
```

`Tekstikayttoliittyma `  ui-pakettissa, eli tässä paketissa on käyttöliittymä.

```java
package lentokentta.ui;

import lentokentta.domain.Lento;
import lentokentta.domain.Lentokone;
import java.util.Scanner;
import lentokentta.logiikka.Lentohallinta;

public class Tekstikayttoliittyma {

    private Lentohallinta lentohallinta;
    private Scanner lukija;

    public Tekstikayttoliittyma(Lentohallinta lentohallinta, Scanner lukija) {
        this.lentohallinta = lentohallinta;
        this.lukija = lukija;
    }

    public void kaynnista() {
        // tehdään käynnistys kahdessa osassa -- ensin käynnistetään hallinta,
        // sitten lentopalvelu
        kaynnistaLentokentanHallinta();
        System.out.println();
        kaynnistaLentoPalvelu();
        System.out.println();
    }

    private void kaynnistaLentokentanHallinta() {
        System.out.println("Lentokentän hallinta");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Valitse toiminto:");
            System.out.println("[1] Lisää lentokone");
            System.out.println("[2] Lisää lento");
            System.out.println("[x] Poistu hallintamoodista");

            System.out.print("> ");
            String vastaus = lukija.nextLine();

            if (vastaus.equals("1")) {
                lisaaLentokone();
            } else if (vastaus.equals("2")) {
                lisaaLento();
            } else if (vastaus.equals("x")) {
                break;
            }
        }
    }

    private void lisaaLentokone() {
        System.out.print("Anna lentokoneen tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.print("Anna lentokoneen kapasiteetti: ");
        int kapasiteetti = Integer.parseInt(lukija.nextLine());

        this.lentohallinta.lisaaLentokone(tunnus, kapasiteetti);
    }

    private void lisaaLento() {
        System.out.print("Anna lentokoneen tunnus: ");
        Lentokone lentokone = kysyLentokone();
        System.out.print("Anna lähtöpaikan tunnus: ");
        String lahtotunnus = lukija.nextLine();
        System.out.print("Anna kohdepaikan tunnus: ");
        String kohdetunnus = lukija.nextLine();

        this.lentohallinta.lisaaLento(lentokone, lahtotunnus, kohdetunnus);
    }

    private void kaynnistaLentoPalvelu() {
        System.out.println("Lentopalvelu");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Valitse toiminto:");
            System.out.println("[1] Tulosta lentokoneet");
            System.out.println("[2] Tulosta lennot");
            System.out.println("[3] Tulosta lentokoneen tiedot");
            System.out.println("[x] Lopeta");

            System.out.print("> ");
            String vastaus = lukija.nextLine();
            if (vastaus.equals("1")) {
                tulostaLentokoneet();
            } else if (vastaus.equals("2")) {
                tulostaLennot();
            } else if (vastaus.equals("3")) {
                tulostaLentokone();
            } else if (vastaus.equals("x")) {
                break;
            }
        }
    }

    private void tulostaLentokoneet() {
        for (Lentokone lentokone : lentohallinta.getLentokoneet()) {
            System.out.println(lentokone);
        }
    }

    private void tulostaLennot() {
        for (Lento lento : lentohallinta.getLennot()) {
            System.out.println(lento);
            System.out.println("");
        }
    }

    private void tulostaLentokone() {
        System.out.print("Mikä kone: ");
        Lentokone kone = kysyLentokone();
        System.out.println(kone);
        System.out.println();
    }

    private Lentokone kysyLentokone() {
        Lentokone lentokone = null;
        while (lentokone == null) {
            String tunnus = lukija.nextLine();
            lentokone = lentohallinta.haeLentokone(tunnus);

            if (lentokone == null) {
                System.out.println("Tunnuksella " 
				+ tunnus + " ei ole lentokonetta.");
            }
        }

        return lentokone;
    }
}
```

