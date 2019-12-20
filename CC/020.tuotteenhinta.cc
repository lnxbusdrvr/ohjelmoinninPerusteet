#include <iostream>
/* Ohjelma laskee tuotteen alennetun hinnan:
esitell‰‰n muuttujat 
pyydet‰‰n tuotteen nime‰ ja otetaan vastaan
pyydet‰‰n tuotteen hintaa ja otetaan vastaan
pyydet‰‰n alennusprosenttia ja otetaan vastaan
lasketaan aleHinta=tuoteHinta-(tuoteHinta/100*alePros)
tulostetaan aleHinta
*/



using namespace std;

int main()
{
	string tuoteNimi;
	double tuoteHinta, alennusPros, aleHinta;
	
	cout << "Syˆt‰ tuotteen nimi: \n";
	getline(cin, tuoteNimi);
	
	cout << "Syˆt‰ tuotteen hinta: \n";
	cin >> tuoteHinta;
	
	cout << "Syˆt‰ alennusprosentti: \n";
	cin >> alennusPros;
	
	aleHinta=tuoteHinta-(tuoteHinta/100*alennusPros);
	
	
	cout << "Alennettuhinta on: \t"<<aleHinta<<endl;






    return 0;
}
