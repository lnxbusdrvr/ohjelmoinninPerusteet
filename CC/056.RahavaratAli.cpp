#include <iostream>
/*Ohjelma tutkii käyttäjän rahavaroja:
esitellään muuttuja
käyttäjältä tiedustellaan, paljonko hänellä on rahaa, otetaan vastaan
jos (rahaa >100), tulostetaan "Olet varoissasi"
jos taas (rahaa on 50-100), tulostetaan "Rahaa on kohtalaisesti"
muussa tapauksessa, tulostetaan "Rahaa on niukasti"*/
using namespace std;

void VrtRaha();

int main ()
{
	VrtRaha();

 
  	return 0;
}

void VrtRaha()
{
	double rahaa;
  
  	cout<<"Paljonko sinulla on rahaa?: ";
  	cin>>rahaa;
  
  	if(rahaa > 100) cout<<"Olet varoissasi!"<<endl;
  	else if(rahaa >=50 && rahaa <=100) cout<<"Rahaa on kohtalaisesti."<<endl;
  	else cout<<"Rahaa on niukasti!"<<endl;
}
