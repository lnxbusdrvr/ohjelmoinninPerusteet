#include <iostream>
/* Ohjelma laskee auton polttoaineen kulutuksen/100 min.
Ohjelma kysyy ajokilometrit, tankkauslitrat ja polttoaineen litrahinnan.
Ohjelma tulostaa polttaineen kulutuksen/100 km ja polttoainekustannukset/100 km
kulutus: tankatutlitrat / ajokm * 100
*/

#define PLTTOAINEENHINTA 1.599

using namespace std;

double AjoKm(double km);
double TankLtr(double litrat);

int main()
{
	double km, litrat, kulu, kust;
	
	kulu=TankLtr(litrat) / AjoKm(km)*100;
	kust=kulu*PLTTOAINEENHINTA;
	
	cout << "Polttoaineen kulutus: "<<kulu<<endl;
	cout << "Polttoaineen kustannus(100km/l): "<<kust<<"€"<<endl;
	return 0;
}

// Kysyy kilometrit
double AjoKm(double km)
{
	cout << "Syötä ajetut kilometrit: \n";
	cin >> km;
	
	return km;
}

// Kysyy tankkauslitrat
double TankLtr(double litrat)
{
	cout << "Syötä tankatut litrat(l): \n";
	cin >> litrat;
	
	return litrat;
}

