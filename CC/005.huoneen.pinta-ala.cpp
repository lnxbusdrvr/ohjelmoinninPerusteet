#include <iostream>
/* Ohjelma laskee  huoneen pinta-alan
esitell��n muuttujat pituus, leveys, pinta-ala
pyydet��n k�ytt�j�lt� pituus, otetaan vastaan
pyydet��n k�ytt�j�lt� leveys, otetaan vastsaan
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
 
 cout << "Sy�t� huoneen pituus: ";
 cin >> pituus;
 
 cout << "\n";
 
 cout << "Sy�t� huoneen leveys: ";
 cin >> leveys;
 
 cout << "\n";

//temput 
 pa=pituus*leveys;
 
 cout << "Pinta-ala on: \n" <<pa;
 
 
    return 0;
}
