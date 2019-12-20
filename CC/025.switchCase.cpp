#include <iostream>
/* Ohjelma pyytää viikonpäivänumeroa ja tutkii
mikä päivä on kyseessä. Switch-case-rakenne */


using namespace std;

int main()
{
	int paiva;
	
	cout << "Syötä viikonpaivä numerona (1-7): \n";
	cin >> paiva;
	
	switch(paiva)		// tutkii mitä käyttäjä syöttää
	{
		case 1:						// jos käyttäjä syöltää numeron 1
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
			cout<<"Antamasi luku ei ole väliltä 1-7\n";
			break;
		
		
	}



    return 0;
}
