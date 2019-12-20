#include <iostream>
/* Ohjelma pyyt�� Fahreheitteja ja muuntaa sen Celcius-muotoon
pyydet��n fahrenheit
otetaan vastaan
jaetaan f / 1.8 = celcius
tulostetaan tulos=celcius
*/

using namespace std;

double Fahrenheit(double fahre);
double Celcius(double celcius);

int main()
{
	double fahre, muunto, valinta;
	char jatketaanko;
	
	while(jatketaanko == 'k')
	{
		cout << "\n";
		cout << "L�mp�tilamuunnin\n";
		cout << "----------------\n";
		cout << "f. Fahrenheit   \n";
		cout << "c. Celcius      \n";
		cin >> valinta;
	
		switch(valinta)
		{			
			case 'f':
				Fahrenheit(fahre);
				muunto=Fahrenheit(fahre);
	
				cout << "�F on "<<muunto<<"�C\n";
				break
				
			default:
				Celcius(celcius);
				break
		}
		cout << "Lopetetaanko? (k/e): \n";
		cin >> jatketaanko;
    }
				
	

		
	return 0;
}

double Fahrenheit(double fahre)
{
	cout << "Sy�t� l�mp�tila(�F): \n";
	cin >> fahre;
	
	return fahre-32;
}

double Celcius(double celcius)
{
	cout << "Sy�t� l�mp�tila(�C): \n";
	cin >> celcius;
	
	return celcius+32;
}
