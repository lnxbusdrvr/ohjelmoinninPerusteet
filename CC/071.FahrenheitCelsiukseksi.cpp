#include <iostream>
/* Ohjelma pyytää Fahreheitteja ja muuntaa sen Celcius-muotoon
pyydetään fahrenheit
otetaan vastaan
jaetaan f / 1.8 = celcius
tulostetaan tulos=celcius
*/

using namespace std;

double Fahrenheit(double fahre);

int main()
{
	double fahre, muunto;
	
	
	
	muunto=Fahrenheit(fahre);
	
	cout << "°F on "<<muunto<<"°C\n";
		
	return 0;
}

double Fahrenheit(double fahre)
{
	cout << "Syötä lämpötila(°F): \n";
	cin >> fahre;
	
	return fahre-32;
}
