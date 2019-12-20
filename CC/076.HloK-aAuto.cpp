/* 2x aliohjelmaa
tietueohjelma
yhdess� on kuorma-auto ja toinen aliohjelma on henkil�autot
ohjelmassa on menu ja jatketaanko-silmukka
*/
#include <iostream>
#include <string>  // Tietueet
#include <cstdlib> //ISOT kirjaimet

using namespace std;

struct AUTO
{
	string reknro;
	string merkki;
	string malli;
	string vari;
	string kori;
	double hinta;
};


int main()
{
	AUTO hloauto;  // Henkil�auto
	AUTO Kauto;  // Kuorma-auto
	AUTO Lauto;  // Linja-auto
	
	char valinta, jatketaanko='k';  // jatketaanko pit�� olla m��ritelty k,
									// eli kyll�, koska muuten
									// while-silmukka ei toimi
	while(jatketaanko == 'k')
	{
		system("cls");  // jos olet *nix:ssa vaihda cls clear:ksi
		
		cout << "\n";
		cout << "Autokeskus\n";
		cout << "---------------\n";
		cout << "B. Henkil�auto.\n";
		cout << "C. Kuorma-auto.\n";
		cout << "D. Linja-auto.\n";
		cout << "---------------\n\n";
	
		cout << "Anna valinta: ";
		cin >> valinta;
		valinta=toupper(valinta);
	
		if(valinta == 'B')
		{
			cin.get();
			cout << "\n\nHenkil�auton tiedot\n";
			cout << "-------------------\n\n";
	
	
			cout << "Rekisterinumero: ";
			getline(cin, hloauto.reknro);
	
			cout << "Merkki: ";
			getline(cin, hloauto.merkki);
	
			cout << "Malli: ";
			getline(cin, hloauto.malli);
	
			cout << "V�ri: ";
			getline(cin, hloauto.vari);
	
			cout << "Kori: ";
			getline(cin, hloauto.kori);
	
			cout << "Hinta: ";
			cin >> hloauto.hinta;
	
			cout << "\n\nHenkil�auton tiedot:\n";
	
			cout << "Rekisterinumero: "<<hloauto.reknro<<endl;
			cout << "Merkki: "<<hloauto.merkki<<endl;
			cout << "Malli: "<<hloauto.malli<<endl;
			cout << "V�ri: "<<hloauto.vari<<endl;
			cout << "Kori: "<<hloauto.kori<<endl;
			cout << "Hinta: "<<hloauto.hinta<<endl;
		}
		else if(valinta == 'C')
		{
			cin.get();
			cout << "\n\nKuorma-auton tiedot\n";
			cout << "-------------------\n\n";
	
	
			cout << "Rekisterinumero: ";
			getline(cin, Kauto.reknro);
	
			cout << "Merkki: ";
			getline(cin, Kauto.merkki);
	
			cout << "Malli: ";
			getline(cin, Kauto.malli);
	
			cout << "V�ri: ";
			getline(cin, Kauto.vari);
	
			cout << "Kori: ";
			getline(cin, Kauto.kori);
	
			cout << "Hinta: ";
			cin >> Kauto.hinta;
	
			cout << "\n\nHenkil�auton tiedot:\n";
	
			cout << "Rekisterinumero: "<<Kauto.reknro<<endl;
			cout << "Merkki: "<<Kauto.merkki<<endl;
			cout << "Malli: "<<Kauto.malli<<endl;
			cout << "V�ri: "<<Kauto.vari<<endl;
			cout << "Kori: "<<Kauto.kori<<endl;
			cout << "Hinta: "<<Kauto.hinta<<endl;
		}
		else if(valinta == 'D')
		{
			cin.get();
			cout << "\n\nLinja-auton tiedot\n";
			cout << "-------------------\n\n";
	
	
			cout << "Rekisterinumero: ";
			getline(cin, Lauto.reknro);
	
			cout << "Merkki: ";
			getline(cin, Lauto.merkki);
	
			cout << "Malli: ";
			getline(cin, Lauto.malli);
	
			cout << "V�ri: ";
			getline(cin, Lauto.vari);
	
			cout << "Kori: ";
			getline(cin, Lauto.kori);
	
			cout << "Hinta: ";
			cin >> Lauto.hinta;
	
			cout << "\n\nHenkil�auton tiedot:\n";
	
			cout << "Rekisterinumero: "<<Lauto.reknro<<endl;
			cout << "Merkki: "<<Lauto.merkki<<endl;
			cout << "Malli: "<<Lauto.malli<<endl;
			cout << "V�ri: "<<Lauto.vari<<endl;
			cout << "Kori: "<<Lauto.kori<<endl;
			cout << "Hinta: "<<Lauto.hinta<<endl;
		}
		else cout << "Tarkista sy�te!\n";
				
		cout << "\n\nJatketaanko (k/e): ";
		cin >> jatketaanko;
		
		if(jatketaanko == 'e') cout<<"Kiitos ohjelman k�yt�st�!\n\n";
			
	} //While loppuuu

	


	
	return 0;
}
