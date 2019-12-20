#include <iostream>
/* Ohjelma tutkii oletko mies, vai nainen
esitellään muuttuja
pyydetään henkilötunnuksen viimeistä numeroa, otetaan vastaan
jos(jakojäännös on 0 eli jako menee tasan).
tulostetaan "olet nainen"
muussa tapauksessa, tulostetaan: "olet mies"
*/

using namespace std;

//Aliohjelman esittely
void AnnaHetu();	//void: aliohjelma olisi tyj�, eli se ei palauta mit��n
					//aliohjelmia sanotaan my�s methodeiksi
					//Aliohjelmassa on ensimm�inen kirjain isolla

int main()
{
	//Aliohjelman kutsu
	AnnaHetu();
     

    return 0;


}

//Aliohjelman toteutus tulee main():n j�lkeen
void AnnaHetu()
{
	int htunnus;

    cout << "Syötä henkilönumeron viimeinen numero: \n";
    cin >>htunnus;

    if(htunnus%2 == 0 ) cout << "Olet nainen\n";
    else cout << "Olet mies\n";
	
}
