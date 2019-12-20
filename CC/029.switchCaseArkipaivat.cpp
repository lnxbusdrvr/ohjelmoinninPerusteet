#include <iostream>
/* Ohjelma pyyt‰‰ viikonp‰iv‰numeroa ja tutkii
mik‰ p‰iv‰ on kyseess‰. Switch-case-rakenne */


using namespace std;

int main()
{
	int paiva;
	
	cout << "Syˆt‰ viikonpaiv‰ numerona (1-7): \n";
	cin >> paiva;
	
	switch(paiva)
	{
		case 1:			
		case 2:
		case 3:
		case 4:
		case 5:
			cout<<"Arkip‰iv‰\n";
			break;
		
		case 6:
			cout<<"Lauantai\n";
			break;
		
		case 7:
			cout<<"Sunnuntai\n";
			break;
			
		default:
			cout<<"Antamasi luku ei ole v‰lilt‰ 1-7\n";
			break;
		
		
	}



    return 0;
}
