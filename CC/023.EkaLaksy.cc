#include <iostream>
/* Ohjelma tutkii oletko mies, vai nainen
esitellään muuttuja
pyydetään henkilötunnuksen viimeistä numeroa, otetaan vastaan
jos(jakojäännös on 0 eli jako menee tasan).
tulostetaan "olet nainen"
muussa tapauksessa, tulostetaan: "olet mies"
*/

using namespace std;

int main()
{
    int htunnus;

    cout << "Syötä henkilönumeron viimeinen numero: \n";
    cin >>htunnus;

    if(htunnus%2 == 0 ) cout << "Olet nainen\n";
    else cout << "Olet mies\n"; 

    return 0;


}
