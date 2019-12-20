#include <iostream>

using namespace std;
//aliohjelman esittely
double LaskePintaAla(double pituus, double leveys);
int main()
{
	double pituus, leveys, pa;
	//aliohjelman kutsu
	pa=LaskePintaAla(pituus, leveys);	//kaikki muuttujat, joita
										//aliohjelmassa käytetään pitää
										//myös esitellä
	cout<<"Pinta-ala on "<<pa<<endl;
	
	return 0;
}

double LaskePintaAla(double pituus, double leveys)
{
	cout<<"Anna huoneen pituus: ";
	cin>>pituus;
	cout<<"Anna huoneen leveys: ";
	cin>>leveys;
	
	return pituus*leveys;
}
