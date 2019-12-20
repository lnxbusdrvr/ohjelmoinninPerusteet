#include <iostream>
using namespace std;

int main() 
{
   string nimi;
   
   cout << "Kirjoita etunimesi: ";
   cin >> nimi; //tallennetaan annettu nimi

   cout << "Etunimesi on: " << nimi << endl;
   /*tulostetaan annetun nimen kirjainmäärä  */
   cout << "Etunimessäsi on " << nimi.length() << " kirjainta." << endl;
   
   string lause; 
   /*tutkitaan onko äsken luotu olio tyhjä*/
   if ( lause.empty() )
   {
   		//+ -merkillä voidaan yhdistää merkkijonoja
      lause = nimi + " on hieno nimi!"; 
      cout << "Uusi lause on nyt: " << lause << endl;
   }
   /*Find-funktiolla voidaan etsiä merkkijonoja olion sisältämästä tekstistä ja 
   erase-funktiolla poistaa tekstiä oliosta. Etsittävä teksti on "hieno" ja 
   tekstin etsimisen aloitetaan merkkijonon alusta, eli kohdasta 0*/
   int i = lause.find("hieno",0);
   /*Funktio palauttaa kohdan, josta etsitty merkkijono alkaa. 
   Tallennamme sen muuttujaan i.
   Erase-funktiolla voidaan poistaa merkkejä merkkijonosta.
   Seuraavaksi poistamme lause-muuttujasta kuusi kirjainta alkaen kohdasta i.*/
   lause.erase(i,6);
   cout << "Lause on nyt: " << lause << endl;
   
   /*Seuraavaksi tutkimme replace-funktion toimintaa. Sen avulla voidaan 
   merkkijonosta korvata tekstiä toisella tekstillä.
    Etsimme ensin sanan "on" oliosta lause. Tallennamme kohdan, josta sana alkaa
     muuttujaan i. Kohta lasketaan merkkeinä tekstin alusta alkaen. Sen jälkeen 
     käytämme replace-funktiota ja muutamme sanan "on" tilalle sanat:"ei ole".*/
   i = lause.find("on",0);
   lause.replace(i,2,"ei ole");
   cout << "Onko " << nimi << " hyvä nimi? " << lause << endl;
   
   /*Viimeisenä asiana esimerkissä käytämme rfind-funktiota joka toimii aivan 
   kuten find-funktio, mutta nyt sanan haku aloitetaan oikelta eli lauseen 
   lopusta päin.
   Tutkimme if-funktiolla löytyikö sanaa.
   Rfind- ja find-funktiot palauttavat arvon string::npos, jos merkkijonoa 
   ei löytynyt lauseesta. Toisinpäin sanottuna: Jos merkkijono löytyi, 
   string::npos-arvoa ei palauteta. Joten voimme if-lauseessa verrata 
   rfind-funktion paluuarvoa arvoon string::npos. Näin voimme helposti 
   tutkia pelkästään sen, löytyykö etsittyä tekstiä olion merkkijonosta. 
   Jos paluuarvo ei ole kyseinen arvo tiedämme, että etsitty merkkijono 
   löytyi ja voimme tulostaa siitä kertovan tekstin.*/
   if ( lause.rfind(nimi, 0) != string::npos )
   {
      cout << "Nimi " << nimi << " löytyi tekstistä: " << lause << endl;
   }
 
   
   return 0; 
}
