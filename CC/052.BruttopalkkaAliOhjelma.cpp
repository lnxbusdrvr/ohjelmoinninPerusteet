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
	
//Kysyt��n tuntipalkka
	cout << "Sy�t� tuntipalkka: ";
	cin >> tuntiPalkka;
	cout << "\n";
	
//Kysyt��n tehdyt tunnit
	cout << "Sy�t� Tekem�si tunnit: ";
	cin >> tehdytTunnit;
	cout << "\n";
	
//Kysyt��n veroprosentti
	cout << "Sy�t� veroprosenttisi(ilman prosenttimerkki�): ";
	cin >> veroPros;
	cout << "\n";

//temput

//Lasketaan bruttopalkka ja tulostetaan se ruudulle
	bruttoPalkka=tuntiPalkka*tehdytTunnit;
	
//Lasketaan	veronm��r�
	veroEur=(bruttoPalkka*veroPros)/100;	//jos on enemm�n, kuin kahden summan laskenta
											//niin pit�� laitta sulkuihiin
											
//lasketaan nettopalkka
	nettoPalkka=bruttoPalkka-veroEur;
											

	cout << "Palkka ennen veroa on: " <<bruttoPalkka<<"�"<<endl;
	cout << "Verojen osuus on: " <<veroEur<<"�"<<endl;
	cout << "Palkka verojen j�lkeen on: "<<nettoPalkka<<"�"<<endl;
}
