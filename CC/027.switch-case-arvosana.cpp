#include <iostream>

/*Ohjelma tutkii k‰ytt‰j‰n antamaa arvosanaa (4-10):
esitell‰‰n muuttuja: arvosana
pyydet‰‰n k‰ytt‰j‰lt‰ arvosanaa, otetaan vastaan.
jos(4-5), tulostetaan "tulos oli heikko"
jos taas (6-7), tulostetaan "tulos oli tyydytt‰v‰"
jos taas (8-10), tulostetaan "tulos oli hyv‰"
muussa tapauksessa, tulostetaan "tarkista arvosana"
*/

using namespace std;

int main()
{
//input
 int arvosana;
 
 cout << "Anna arvosana (4-10): ";	//pyydet‰‰n k‰ytt‰j‰lt‰ arvosanaa
 cin >> arvosana;
 
//Temput
	switch(arvosana)
	{
		case 4:
		case 5:
			cout << "Tulos oli heikko\n";
			break;
			
		case 6:
		case 7:
			cout << "Tulos oli tyydytt‰v‰\n";
			break;
		
		case 8:
		case 9:
		case 10:
			cout << "Tulos oli hyv‰\n";
			break;
		
		default:
			cout << "Tarkista arvosana! \n";
			break;
			
	}



    return 0;
}
