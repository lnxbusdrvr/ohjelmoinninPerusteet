# Tehtävä: 11.ParametrienValidointi (2 osaa)

Harjoitellaan hieman parametrien validointia 
`IllegalArgumentException`-poikkeuksen avulla. Tehtäväpohjassa tulee kaksi 
luokkaa, `Henkilo` ja `Laskin`. Muuta luokkia seuraavasti:

## Osa 1: Henkilön validointi

Luokan `Henkilo` konstruktorin tulee varmistaa että parametrina annettu 
nimi ei ole null, tyhjä tai yli 40 merkkiä pitkä. 
Myös iän tulee olla väliltä 0-120. 
Jos joku edelläolevista ehdoista ei päde, tulee konstruktorin heittää 
`IllegalArgumentException`-poikkeus.

## Osa 2: Laskimen validointi

Luokan `Laskin` metodeja tulee muuttaa seuraavasti: 
Metodin kertoma tulee toimia vain jos parametrina annetaan 
ei-negatiivinen luku (0 tai suurempi). 
Metodin binomikerroin tulee toimia vain jos parametrit ovat 
ei-negatiivisia ja osajoukon koko on pienempi kuin joukon koko. 
Jos jompikumpi metodeista saa epäkelpoja arvoja metodikutsujen yhteydessä, 
tulee metodien heittää poikkeus `IllegalArgumentException`.

