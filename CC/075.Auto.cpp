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
 AUTO autot; //henkil�autot
 
 cout<<"Rekisterinumero: ";
 getline(cin, autot.reknro);
 cout<<"Tyyppi: ";
 getline(cin, autot.tyyppi);
 cout<<"Malli: ";
 getline(cin, autot.malli);
 cout<<"V�ri: ";
 getline(cin, autot.vari);
 cout<<"Hinta: ";
 cin>>autot.hinta;
 
 cout<<"\nHenkil�auton tiedot: "<<endl;
 cout<<"Rekisterinumero: "<<autot.reknro<<endl;
 cout<<"Tyyppi: "<<autot.tyyppi<<endl;
 cout<<"Malli: "<<autot.malli<<endl;
 cout<<"V�ri: "<<autot.vari<<endl;
 cout<<"Hinta: "<<autot.hinta<<endl;
 
   
 AUTO kautot;//kuorma-autot
 
 cin.get();
 cout<<"\nRekisterinumero: "<<endl;
 getline(cin, kautot.reknro);
 cout<<"Tyyppi: ";
 getline(cin, kautot.tyyppi);
 cout<<"Malli: ";
 getline(cin, kautot.malli);
 cout<<"V�ri: ";
 getline(cin, kautot.vari);
 cout<<"Hinta: ";
 cin>>kautot.hinta;

 cout<<"\nKuoma-auton tiedot: "<<endl;
 cout<<"Rekisterinumero: "<<kautot.reknro<<endl;
 cout<<"Tyyppi: "<<kautot.tyyppi<<endl;
 cout<<"Malli: "<<kautot.malli<<endl;
 cout<<"V�ri: "<<kautot.vari<<endl;
 cout<<"Hinta: "<<kautot.hinta<<endl;
 
 return 0;   
}
  	

