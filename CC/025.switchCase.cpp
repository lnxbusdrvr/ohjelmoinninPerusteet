#include <iostream>
/* Ohjelma pyyt�� viikonp�iv�numeroa ja tutkii
mik� p�iv� on kyseess�. Switch-case-rakenne */


using namespace std;

int main()
{
	int paiva;
	
	cout << "Sy�t� viikonpaiv� numerona (1-7): \n";
	cin >> paiva;
	
	switch(paiva)		// tutkii mit� k�ytt�j� sy�tt��
	{
		case 1:						// jos k�ytt�j� sy�lt�� numeron 1
			cout<<"Maanantai\n";	// niin tulostetaan Maanantai
			break;
			
		case 2:
			cout<<"Tiistai\n";
			break;
		
		case 3:
			cout<<"Keskiviikko\n";
			break;
		
		case 4:
			cout<<"Torstai\n";
			break;
		
		case 5:
			cout<<"Perjantai\n";
			break;
		
		case 6:
			cout<<"Lauantai\n";
			break;
		
		case 7:
			cout<<"Sunnuntai\n";
			break;
			
		default:
			cout<<"Antamasi luku ei ole v�lilt� 1-7\n";
			break;
		
		
	}



    return 0;
}
