#include <iostream>
#include <string>



using namespace std;

void YhteysTiedot();

int main()
{
	YhteysTiedot();
	
	return 0;
}

void YhteysTiedot()
{
	string nimi, osoite, puhelin;	//merkkijonotyyppi. Merkkijono tarkoittaa kirjaimia
	
	cout << "Anna nimesi: ";
	getline(cin, nimi);				//getline ottaa rivin vastaan
	
	cout << "Anna osoitteesi: ";
	getline(cin, osoite);
	
	cout << "Anna puhelinnumerosi: ";
	getline(cin, puhelin);
	
	cout << "Nimesi on \n\t"<<nimi<<endl<< " ja osoitteesi on \n\t"<<osoite<<endl;
	cout << "Puhelinnumerosi on \n\t"<< puhelin<<endl;
	
}
