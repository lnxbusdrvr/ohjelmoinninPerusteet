#include <iostream>
#include <string>

using namespace std;
//henkil�-tietue
struct HLO
{
	string nimi;	//t�m� saadaan getline():lla
	int ika;
	double paino;
};


int main()
{
	HLO henkilo;  //HLO-tietueen ilmentym�
	
	cout<<"Anne nimi: ";
	getline(cin, henkilo.nimi);  //stringin otetaan getline():lla
	cout<<"Anna ik�: ";
	cin>>henkilo.ika;
	cout<<"Anna paino: ";
	cin>>henkilo.paino;
	
	cout<<"\n Henkil�tiedot:  \n";
	cout<<"Nimi..............."<<henkilo.nimi<<endl;
	cout<<"Ik�................"<<henkilo.ika<<endl;
	cout<<"Paino.............."<<henkilo.paino<<endl;
	
	return 0;
}
