# For each

## Kaksoispiste, eli colon

For-each lausee voi toteuttaa,
jos ei tarvitse luoda laskevaa/nousevaa numeroa.

Esimerkissa for-each -lause:

```
ArrayList<String> opettajat = new ArrayList<>();

opettajat.add("Sami");
opettajat.add("Samu");
opettajat.add("Anne");
opettajat.add("Anna");

for (String opettaja: opettajat) {
    System.out.println(opettaja);
}
```

Sama lause luotuna (huonompana) eri menetelmällä:

```
ArrayList<String> opettajat = new ArrayList<>();

opettajat.add("Sami");
opettajat.add("Samu");
opettajat.add("Anne");
opettajat.add("Anna");

for (int i = 0; i < opettajat.size(); i++) {
    String opettaja = opettajat.get(i);
    // for-each -toistolauseen sisältö:
    System.out.println(opettaja);
}
```

Kätevää!

Esim keskiarvojen numeroiden lukumäärää ei näin voi ehkä laskea,
mutta summassa, tai juurikin kaikkien listojen, 
tai taulukoiden[] tulostamiseen tämä voi ollakin todella kätevää 
ja vie vähemmän tilaa koodilta.

## Esimerkki 2

```
String cardString = "";
for (PlayingCard c : this.list)  // <--
{
    cardString = cardString + c + "\n";
}
```

this.list is a collection (list, 
set, or array), 
and that code assigns c
to each element of the collection.

```this.lista``` on kokoelma(lista, setter, tai array)
ja sen koodi sijoittaa ```c``` 
jokaiseen kokoelmaan elementtiin(lista, setteri ja array).


## Esimerkki 2

```
ArrayList<String> opettajat = new ArrayList<>();

opettajat.add("Sami");
opettajat.add("Samu");
opettajat.add("Anne");
opettajat.add("Anna");

for (String opettaja: opettajat) {
    System.out.println(opettaja);
}
```




## Lähde
1. [What does the colon (:) operator do?](https://stackoverflow.com/questions/2399590/what-does-the-colon-operator-do)
1. mooc
