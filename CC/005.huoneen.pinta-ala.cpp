#include <iostream>
/* Ohjelma laskee  huoneen pinta-alan
esitellään muuttujat pituus, leveys, pinta-ala
pyydetöän käyttäjältä pituus, otetaan vastaan
pyydetään käyttäjältä leveys, otetaan vastsaan
lasketaan pinta-ala: pituus*leveys
tulostetaan pinta-ala
luvut ovat desimaaleja

*/
using namespace std;

int main()
{
 double pituus, leveys, pa;
 
// Input 
 cout << "\n";
 
 cout << "Syötä huoneen pituus: ";
 cin >> pituus;
 
 cout << "\n";
 
 cout << "Syötä huoneen leveys: ";
 cin >> leveys;
 
 cout << "\n";

//temput 
 pa=pituus*leveys;
 
 cout << "Pinta-ala on: \n" <<pa;
 
 
    return 0;
}
