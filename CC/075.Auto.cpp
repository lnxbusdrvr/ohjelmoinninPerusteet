#include <iostream>
#include <string>
using namespace std;
 
struct AUTO
{
	string reknro;
	string tyyppi;
	string malli;
	string vari;
	double hinta;
};

int main ()
{
	system("color F0");
 AUTO autot; //henkilöautot
 
 cout<<"Rekisterinumero: ";
 getline(cin, autot.reknro);
 cout<<"Tyyppi: ";
 getline(cin, autot.tyyppi);
 cout<<"Malli: ";
 getline(cin, autot.malli);
 cout<<"Väri: ";
 getline(cin, autot.vari);
 cout<<"Hinta: ";
 cin>>autot.hinta;
 
 cout<<"\nHenkilöauton tiedot: "<<endl;
 cout<<"Rekisterinumero: "<<autot.reknro<<endl;
 cout<<"Tyyppi: "<<autot.tyyppi<<endl;
 cout<<"Malli: "<<autot.malli<<endl;
 cout<<"Väri: "<<autot.vari<<endl;
 cout<<"Hinta: "<<autot.hinta<<endl;
 
   
 AUTO kautot;//kuorma-autot
 
 cin.get();
 cout<<"\nRekisterinumero: "<<endl;
 getline(cin, kautot.reknro);
 cout<<"Tyyppi: ";
 getline(cin, kautot.tyyppi);
 cout<<"Malli: ";
 getline(cin, kautot.malli);
 cout<<"Väri: ";
 getline(cin, kautot.vari);
 cout<<"Hinta: ";
 cin>>kautot.hinta;

 cout<<"\nKuoma-auton tiedot: "<<endl;
 cout<<"Rekisterinumero: "<<kautot.reknro<<endl;
 cout<<"Tyyppi: "<<kautot.tyyppi<<endl;
 cout<<"Malli: "<<kautot.malli<<endl;
 cout<<"Väri: "<<kautot.vari<<endl;
 cout<<"Hinta: "<<kautot.hinta<<endl;
 
 return 0;   
}
  	

