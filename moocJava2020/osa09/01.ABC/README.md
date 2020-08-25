# Tehtävä 01.ABC

Harjoitellaan tässä luokkien luomista ja perintää.
Luokkien luominen

Luo tehtäväpohjaan seuraavat kolme luokkaa:

- Luokka `A`. Luokalla ei ole oliomuuttujia eikä erikseen määriteltyä konstruktoria. Luokalla on vain metodi public void a(), joka tulostaa merkkijonon "A".
- Luokka `B`. Luokalla ei ole oliomuuttujia eikä erikseen määriteltyä konstruktoria. Luokalla on vain metodi public void b(), joka tulostaa merkkijonon "B".
- Luokka `C`. Luokalla ei ole oliomuuttujia eikä erikseen määriteltyä konstruktoria. Luokalla on vain metodi public void c(), joka tulostaa merkkijonon "C".

```java
A a = new A();
B b = new B();
C c = new C();

a.a();
b.b();
c.c();
```

Esimerkkitulostus:

```
A
B
C
```

## Osa 2

Muokkaa luokkia siten, että luokka B perii luokan A ja luokka C perii luokan B. Luokasta A tulee siis luokan B yliluokka, ja luokasta B luokan C yliluokka.


```
C c = new C();

c.a();
c.b();
c.c();
```

Esimerkkitulostus:

```
A
B
C
```

