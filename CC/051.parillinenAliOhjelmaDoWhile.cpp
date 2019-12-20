#include <iostream>
/* Ohjelma pyytää käyttäjältä lukua 1-10 ja tutkii onko
Luku pariton vai parillinen.
aliohjelma-versio
*/



using namespace std;

int ParillisuusTarkastelu(int luku);

int main()
{
	int vastaus, luku;
	

	
	vastaus=ParillisuusTarkastelu(luku);
	
	return 0;
}

int ParillisuusTarkastelu(int luku)
{
	char jatko;
	do
	{
		cout << "Anna luku väliltä 1-10: \n";
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
				cout << "Antamasi luku ei ole väliltä 1-10\n";
				break;	
		}
		cout << "Jatketaanko (k/e)? \n";
		cin >> jatko;
	}while(jatko == 'k');
	return luku;
}
