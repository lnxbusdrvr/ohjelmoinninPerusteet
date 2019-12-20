#include <iostream>
/* Ohjelma laskee lahden luvun osamäärän:
osamäärä=jaettava/jakaja
aliohjelma-versio
aliohjelma palauttaa osamäärän
a = c : b, jossa a on osamäärä, c on jaettava ja b jakajaksi
koska aliohjelma käyttää 2 luku,
jotka jaetaan, niin ne molemmat laitetaan parametreihiin
kutsutaan aliohjelma: AliOhjelma();
kysyy käyttäjältä: mistä luvusta jaetaan
ottaa syötteen vastaan
kysyy käyttäjältä: mihiin lukuun jaetaan
ottaa syötteen vastaan
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
	cout << "Syötä luku mistä jaetaan, eli jaettava:\n";
	cin >> jaettava;
	
	cout << "Syötä luku millä jaettava luku jaetaan, eli jakaja:\n";
	cin >> jakaja;
	
	return jaettava/jakaja;
}
