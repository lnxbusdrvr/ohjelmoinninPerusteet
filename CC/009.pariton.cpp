#include <iostream>



using namespace std;

int main()
{
	int luku;

//Input
	cout << "\n";
	cout << "Sy�t� luku: ";
	cin >> luku;
	
//Temput
	if(luku <= 0 || luku > 100)					// tai -merkki on kaksi palkkia ||
	cout << "Luku ei kelpaa. \n";
	else if(luku % 2 == 0)						// % -merkki on jakoj��n�smerkki
	cout << "Annoit parillisen luvun. \n";		// puhutaan my�s modulo:sta
												// kaksi = -merkki� tarkoittaa vertailua
	else cout << "Annoit parittoman luvun.\n";





    return 0;
}
