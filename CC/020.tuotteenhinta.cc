#include <iostream>
/* Ohjelma laskee tuotteen alennetun hinnan:
esitell��n muuttujat 
pyydet��n tuotteen nime� ja otetaan vastaan
pyydet��n tuotteen hintaa ja otetaan vastaan
pyydet��n alennusprosenttia ja otetaan vastaan
lasketaan aleHinta=tuoteHinta-(tuoteHinta/100*alePros)
tulostetaan aleHinta
*/



using namespace std;

int main()
{
	string tuoteNimi;
	double tuoteHinta, alennusPros, aleHinta;
	
	cout << "Sy�t� tuotteen nimi: \n";
	getline(cin, tuoteNimi);
	
	cout << "Sy�t� tuotteen hinta: \n";
	cin >> tuoteHinta;
	
	cout << "Sy�t� alennusprosentti: \n";
	cin >> alennusPros;
	
	aleHinta=tuoteHinta-(tuoteHinta/100*alennusPros);
	
	
	cout << "Alennettuhinta on: \t"<<aleHinta<<endl;






    return 0;
}
