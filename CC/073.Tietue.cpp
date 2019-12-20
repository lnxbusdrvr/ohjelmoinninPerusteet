#include <iostream>
#include <string>

using namespace std;
//henkilö-tietue
struct HLO
{
	string nimi;	//tämä saadaan getline():lla
	int ika;
	double paino;
};


int main()
{
	HLO henkilo;  //HLO-tietueen ilmentymä
	
	cout<<"Anne nimi: ";
	getline(cin, henkilo.nimi);  //stringin otetaan getline():lla
	cout<<"Anna ikä: ";
	cin>>henkilo.ika;
	cout<<"Anna paino: ";
	cin>>henkilo.paino;
	
	cout<<"\n Henkilötiedot:  \n";
	cout<<"Nimi..............."<<henkilo.nimi<<endl;
	cout<<"Ikä................"<<henkilo.ika<<endl;
	cout<<"Paino.............."<<henkilo.paino<<endl;
	
	return 0;
}
