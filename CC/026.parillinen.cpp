#include <iostream>
/* Ohjelma pyyt‰‰ k‰ytt‰j‰lt‰ lukua 1-10 ja tutkii onko
Luku pariton vai parillinen.
*/



using namespace std;

int main()
{
	int luku;
	
	cout << "Anna luku v‰lilt‰ 1-10: \n";
	cin >> luku;
	
	switch(luku)
	{
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			cout << "Luku on pariton\n";
			break;
		
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			cout <<"Luku on parillinen\n";
			break;
		
		default:
			cout << "Antamasi luku ei ole v‰lilt‰ 1-10\n";
			break;
				
	}





    return 0;
}
