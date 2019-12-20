#include <iostream>
#include <string>
using namespace std;

struct KIRJAT
{
	string isbn;
	string tNimi;
	string kNimi;
	double ostoHinta;
};

int main()
{
	KIRJAT kKirjat; //luodaan ilmentymä kaunokirjat=kKirjat
	
	cout<<"ISBN: ";
	getline(cin, kKirjat.isbn);
	cout<<"Tekijä: ";
	getline(cin, kKirjat.kNimi);
	cout<<"Kirjan nimi: ";
	getline(cin, kKirjat.tNimi);
	cout<<"Ostohinta: ";
	cin>>kKirjat.ostoHinta;
	
	//tulostetaan näytölle
	cout<<"\n Kirjan tiedot ovat "<<endl;
	cout<<"ISBN-numero..........."<<kKirjat.isbn<<endl;
	cout<<"Tekijä................"<<kKirjat.tNimi<<endl;
	cout<<"Kirjan nimi..........."<<kKirjat.kNimi<<endl;
	cout<<"Ostohinta............."<<kKirjat.ostoHinta<<endl;
	
	
	return 0;
}
