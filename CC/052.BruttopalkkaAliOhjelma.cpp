#include <iostream>
//Ohjelma laskee tuntipalkan


using namespace std;

double PalkkaLaskuri();

int main()
{
	PalkkaLaskuri();


    return 0;
}

double PalkkaLaskuri()
{
	//Input
	double tuntiPalkka, tehdytTunnit, veroPros, veroEur, bruttoPalkka, nettoPalkka;
	
//Kysyt‰‰n tuntipalkka
	cout << "Syˆt‰ tuntipalkka: ";
	cin >> tuntiPalkka;
	cout << "\n";
	
//Kysyt‰‰n tehdyt tunnit
	cout << "Syˆt‰ Tekem‰si tunnit: ";
	cin >> tehdytTunnit;
	cout << "\n";
	
//Kysyt‰‰n veroprosentti
	cout << "Syˆt‰ veroprosenttisi(ilman prosenttimerkki‰): ";
	cin >> veroPros;
	cout << "\n";

//temput

//Lasketaan bruttopalkka ja tulostetaan se ruudulle
	bruttoPalkka=tuntiPalkka*tehdytTunnit;
	
//Lasketaan	veronm‰‰r‰
	veroEur=(bruttoPalkka*veroPros)/100;	//jos on enemm‰n, kuin kahden summan laskenta
											//niin pit‰‰ laitta sulkuihiin
											
//lasketaan nettopalkka
	nettoPalkka=bruttoPalkka-veroEur;
											

	cout << "Palkka ennen veroa on: " <<bruttoPalkka<<"Ä"<<endl;
	cout << "Verojen osuus on: " <<veroEur<<"Ä"<<endl;
	cout << "Palkka verojen j‰lkeen on: "<<nettoPalkka<<"Ä"<<endl;
}
