#include <iostream>
/* Ohjelma pyyt�� Fahreheitteja ja muuntaa sen Celcius-muotoon
pyydet��n fahrenheit
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
	
	cout << "�F on "<<muunto<<"�C\n";
		
	return 0;
}

double Fahrenheit(double fahre)
{
	cout << "Sy�t� l�mp�tila(�F): \n";
	cin >> fahre;
	
	return fahre-32;
}
