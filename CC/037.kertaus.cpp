#include <iostream>

int laskeSumma(int luku1, int luku2);
int laskeTulo(int luku1, int luku2);
int laskeErotus(int luku1, int luku2);

using namespace std;

int main()
{
	int luku1, luku2, summa, tulo, erotus, valinta;
	
	cout << "\n";
	cout << "Menu\n";
	cout << "1. Summa\n";
	cout << "2. Tulo\n";
	cout << "3. Erotus\n\n";
	
	cout << "Valitse laskutoimitus: ";
	cin >> valinta;
	
	switch(valinta)
	{
		case 1:
			summa=laskeSumma(luku1, luku2);
			cout << "Summa on "<<summa<<endl;
			break;
			
		case 2:
			tulo=laskeTulo(luku1, luku2);
			cout << "Tulo on " <<tulo<<endl;
			break;
		
		case 3:
			erotus=laskeErotus(luku1, luku2);
			cout << "Erotus on "<<erotus<<endl;
			break;
		
		default:
			cout << "Tarkista valinta" << endl;
			break;		
	}

    return 0;
}

int laskeSumma(int luku1, int luku2)
{
	cout << "Anna eka luku:  ";
	cin >> luku1;
	
	cout << "Anna toka luku:  ";
	cin >> luku2;
	return luku1+luku2;				//Vie tulosteen takaisin main():iin
}

int laskeTulo(int luku1, int luku2)
{
	cout << "Anna eka luku: ";
	cin >> luku1;
	
	cout << "Anna toka luku:  ";
	cin >> luku2;
	return luku1*luku2;
}

int laskeErotus(int luku1, int luku2)
{
	cout << "Anna eka luku:  ";
	cin >> luku1;
	
	cout << "Anna toka luku:  ";
	cin >> luku2;
	return luku1-luku2;
}

