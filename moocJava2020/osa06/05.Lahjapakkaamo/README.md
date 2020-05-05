# Lahjapakkaamo

## Osa 1: Lahja-luokka

Tee luokka Lahja, josta muodostetut oliot kuvaavat erilaisia lahjoja. Tallennettavat tiedot ovat tavaran nimi ja paino (kg).

Lisää luokkaan seuraavat metodit:

 -   Konstruktori, jolle annetaan parametrina lahjan nimi ja paino
 -   Metodi public String getNimi(), joka palauttaa lahjan nimen
 -   Metodi public int getPaino(), joka palauttaa lahjan painon
 -   Metodi public String toString(), joka palauttaa merkkijonon muotoa "nimi (paino kg)"
 
## Osa 2: Pakkaus-luokka

Tee luokka Pakkaus, johon voi lisätä lahjoja, ja joka pitää kirjaa pakkauksessa olevien lahjojen yhteispainosta. Luokassa tulee olla:

- Parametriton konstruktori
- Metodi public void lisaaLahja(Lahja lahja), joka lisää parametrina annettavan lahjan pakkaukseen. Metodi ei palauta mitään arvoa.
- Metodi public int yhteispaino(), joka palauttaa pakkauksessa olevien lahjojen yhteispainon.

Tavarat kannattaa tallentaa ArrayList-olioon:
