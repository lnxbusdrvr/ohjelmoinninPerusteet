#include <iostream>
/* Ohjelma laskee lahden luvun osam��r�n:
osam��r�=jaettava/jakaja
aliohjelma-versio
aliohjelma palauttaa osam��r�n
a = c : b, jossa a on osam��r�, c on jaettava ja b jakajaksi
koska aliohjelma k�ytt�� 2 luku,
jotka jaetaan, niin ne molemmat laitetaan parametreihiin
kutsutaan aliohjelma: AliOhjelma();
kysyy k�ytt�j�lt�: mist� luvusta jaetaan
ottaa sy�tteen vastaan
kysyy k�ytt�j�lt�: mihiin lukuun jaetaan
ottaa sy�tteen vastaan
aliohjelma:
*/
using namespace std;

double OsaMaara(double jaettava, double jakaja);

int main()
{
	double osamaara, jaettava, jakaja;
	osamaara=OsaMaara(jaettava, jakaja);
	
	cout <<osamaara<<endl;
	
	return 0;
}

double OsaMaara(double jaettava, double jakaja)
{
	cout << "Sy�t� luku mist� jaetaan, eli jaettava:\n";
	cin >> jaettava;
	
	cout << "Sy�t� luku mill� jaettava luku jaetaan, eli jakaja:\n";
	cin >> jakaja;
	
	return jaettava/jakaja;
}
