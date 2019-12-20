/*
Luo uusi ohjelma ja määrittele siihen aluksi asiakastietuetyyppi
ASIAKAS , jóssa on seuraavat kentän:
*asiakasnumero, kokonaisLuku
*asiakkaan nimi, merkkijono
*puhelinnumero, merkkijono
*jakeluosoite, merkkijono
*postinumero, merkkijono
*postitimoipaikka, merkkijono
*luottoraja, desimaaliluku

Luo tietueesta uusi ilmentymä ja pyydä asiakkaan tiedot ja tulosta ne
*/
#include <iostream>
#include <string>

using namespace std;

struct ASIAKAS
{
	int asNro;
	string asNimi;
	string puh;
	string osoite;
	string pNro;
	string pToim;
	double luottoRaj;
};

void kysy();

int main()
{
	ASIAKAS as;
	
	cout << "\n";
	cout << "Asiakastiedot\n\n";
	
	kysy();
	//tulosta();  -Ei toiminut, kun teki erikseen tulosta()-aliohjelman
	
	
	return 0;
}

void kysy()
{
	ASIAKAS as;
	//Kysytään käyttäjältä
	cout << "Asiakasnumero:    ";
	cin >> as.asNro;
	
	cin.get();
	cout << "Asiakkaan nimi:   ";
	getline(cin, as.asNimi);
	
	cout << "Puhelinnumero:    ";
	getline(cin, as.osoite);
	
	cout << "Jakuluosoite:     ";
	getline(cin, as.osoite);
	
	cout << "Postinumero:      ";
	getline(cin, as.pNro);
	
	cout << "Postitoimipaikka: ";
	getline(cin, as.pToim);
	
	cout << "Luottoraja:       ";
	cin >> as.luottoRaj;

	cout << "Asiakkaan tiedot ovat:\n\n";
	
	cout << "Asiakasnumero:    "<<as.asNro<<endl;
	cout << "Asiakkaan nimi:   "<<as.asNimi<<endl;
	cout << "Puhelinnumero:    "<<as.pNro<<endl;
	cout << "Jakeluosoite:     "<<as.osoite<<endl;
	cout << "Postinumero:      "<<as.pNro<<endl;
	cout << "Postitoimipaikka: "<<as.pToim<<endl;
	cout << "Luottoraja:       "<<as.luottoRaj<<endl<<endl;
}
