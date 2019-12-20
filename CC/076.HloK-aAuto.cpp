/* 2x aliohjelmaa
tietueohjelma
yhdessä on kuorma-auto ja toinen aliohjelma on henkilöautot
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
	AUTO hloauto;  // Henkilöauto
	AUTO Kauto;  // Kuorma-auto
	AUTO Lauto;  // Linja-auto
	
	char valinta, jatketaanko='k';  // jatketaanko pitää olla määritelty k,
									// eli kyllä, koska muuten
									// while-silmukka ei toimi
	while(jatketaanko == 'k')
	{
		system("cls");  // jos olet *nix:ssa vaihda cls clear:ksi
		
		cout << "\n";
		cout << "Autokeskus\n";
		cout << "---------------\n";
		cout << "B. Henkilöauto.\n";
		cout << "C. Kuorma-auto.\n";
		cout << "D. Linja-auto.\n";
		cout << "---------------\n\n";
	
		cout << "Anna valinta: ";
		cin >> valinta;
		valinta=toupper(valinta);
	
		if(valinta == 'B')
		{
			cin.get();
			cout << "\n\nHenkilöauton tiedot\n";
			cout << "-------------------\n\n";
	
	
			cout << "Rekisterinumero: ";
			getline(cin, hloauto.reknro);
	
			cout << "Merkki: ";
			getline(cin, hloauto.merkki);
	
			cout << "Malli: ";
			getline(cin, hloauto.malli);
	
			cout << "Väri: ";
			getline(cin, hloauto.vari);
	
			cout << "Kori: ";
			getline(cin, hloauto.kori);
	
			cout << "Hinta: ";
			cin >> hloauto.hinta;
	
			cout << "\n\nHenkilöauton tiedot:\n";
	
			cout << "Rekisterinumero: "<<hloauto.reknro<<endl;
			cout << "Merkki: "<<hloauto.merkki<<endl;
			cout << "Malli: "<<hloauto.malli<<endl;
			cout << "Väri: "<<hloauto.vari<<endl;
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
	
			cout << "Väri: ";
			getline(cin, Kauto.vari);
	
			cout << "Kori: ";
			getline(cin, Kauto.kori);
	
			cout << "Hinta: ";
			cin >> Kauto.hinta;
	
			cout << "\n\nHenkilöauton tiedot:\n";
	
			cout << "Rekisterinumero: "<<Kauto.reknro<<endl;
			cout << "Merkki: "<<Kauto.merkki<<endl;
			cout << "Malli: "<<Kauto.malli<<endl;
			cout << "Väri: "<<Kauto.vari<<endl;
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
	
			cout << "Väri: ";
			getline(cin, Lauto.vari);
	
			cout << "Kori: ";
			getline(cin, Lauto.kori);
	
			cout << "Hinta: ";
			cin >> Lauto.hinta;
	
			cout << "\n\nHenkilöauton tiedot:\n";
	
			cout << "Rekisterinumero: "<<Lauto.reknro<<endl;
			cout << "Merkki: "<<Lauto.merkki<<endl;
			cout << "Malli: "<<Lauto.malli<<endl;
			cout << "Väri: "<<Lauto.vari<<endl;
			cout << "Kori: "<<Lauto.kori<<endl;
			cout << "Hinta: "<<Lauto.hinta<<endl;
		}
		else cout << "Tarkista syöte!\n";
				
		cout << "\n\nJatketaanko (k/e): ";
		cin >> jatketaanko;
		
		if(jatketaanko == 'e') cout<<"Kiitos ohjelman käytöstä!\n\n";
			
	} //While loppuuu

	


	
	return 0;
}
