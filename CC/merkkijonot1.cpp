#include <iostream>
using namespace std;

int main() 
{
   string nimi;
   
   cout << "Kirjoita etunimesi: ";
   cin >> nimi; //tallennetaan annettu nimi

   cout << "Etunimesi on: " << nimi << endl;
   /*tulostetaan annetun nimen kirjainm��r�  */
   cout << "Etunimess�si on " << nimi.length() << " kirjainta." << endl;
   
   string lause; 
   /*tutkitaan onko �sken luotu olio tyhj�*/
   if ( lause.empty() )
   {
   		//+ -merkill� voidaan yhdist�� merkkijonoja
      lause = nimi + " on hieno nimi!"; 
      cout << "Uusi lause on nyt: " << lause << endl;
   }
   /*Find-funktiolla voidaan etsi� merkkijonoja olion sis�lt�m�st� tekstist� ja 
   erase-funktiolla poistaa teksti� oliosta. Etsitt�v� teksti on "hieno" ja 
   tekstin etsimisen aloitetaan merkkijonon alusta, eli kohdasta 0*/
   int i = lause.find("hieno",0);
   /*Funktio palauttaa kohdan, josta etsitty merkkijono alkaa. 
   Tallennamme sen muuttujaan i.
   Erase-funktiolla voidaan poistaa merkkej� merkkijonosta.
   Seuraavaksi poistamme lause-muuttujasta kuusi kirjainta alkaen kohdasta i.*/
   lause.erase(i,6);
   cout << "Lause on nyt: " << lause << endl;
   
   /*Seuraavaksi tutkimme replace-funktion toimintaa. Sen avulla voidaan 
   merkkijonosta korvata teksti� toisella tekstill�.
    Etsimme ensin sanan "on" oliosta lause. Tallennamme kohdan, josta sana alkaa
     muuttujaan i. Kohta lasketaan merkkein� tekstin alusta alkaen. Sen j�lkeen 
     k�yt�mme replace-funktiota ja muutamme sanan "on" tilalle sanat:"ei ole".*/
   i = lause.find("on",0);
   lause.replace(i,2,"ei ole");
   cout << "Onko " << nimi << " hyv� nimi? " << lause << endl;
   
   /*Viimeisen� asiana esimerkiss� k�yt�mme rfind-funktiota joka toimii aivan 
   kuten find-funktio, mutta nyt sanan haku aloitetaan oikelta eli lauseen 
   lopusta p�in.
   Tutkimme if-funktiolla l�ytyik� sanaa.
   Rfind- ja find-funktiot palauttavat arvon string::npos, jos merkkijonoa 
   ei l�ytynyt lauseesta. Toisinp�in sanottuna: Jos merkkijono l�ytyi, 
   string::npos-arvoa ei palauteta. Joten voimme if-lauseessa verrata 
   rfind-funktion paluuarvoa arvoon string::npos. N�in voimme helposti 
   tutkia pelk�st��n sen, l�ytyyk� etsitty� teksti� olion merkkijonosta. 
   Jos paluuarvo ei ole kyseinen arvo tied�mme, ett� etsitty merkkijono 
   l�ytyi ja voimme tulostaa siit� kertovan tekstin.*/
   if ( lause.rfind(nimi, 0) != string::npos )
   {
      cout << "Nimi " << nimi << " l�ytyi tekstist�: " << lause << endl;
   }
 
   
   return 0; 
}
