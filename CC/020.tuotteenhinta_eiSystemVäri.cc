#include <iostream>
#include <windows>
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
	
	SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), a);	//vihre‰ teksti 1=tummansininen, 2=vihre‰, 3=sininen
	cout << "Syˆt‰ tuotteen hinta: \n";								//4:punainen, 5:purple, 6=ruskea, 7=valkoinen, 0=musta
																	//8=harmaa, 9=sininen
	cin>>tuoteHinta;
	
	cout << "Syˆt‰ tuotteen hinta: ";






    return 0;
}
