#include <iostream>
/* Aliohjelma, joka tulostaa Ukko Nooa -sanat */

using namespace std;

char rivi1();
char rivi2();
char rivi3();
char rivi4();

int main()
{
	rivi1();
	rivi2();
	rivi3();
	rivi4();
	rivi1();
	rivi2();
	
	cout << "\n";
	
	return 0;
}

char rivi1()
{
	cout << "Ukko Nooa, Ukko Nooa\n";
}

char rivi2()
{
	cout << "Oli kunnon mies\n";
}

char rivi3()
{
	cout << "Kun hän meni saunaan\n";
}

char rivi4()
{
	cout << "Laittoi laukun naulaanw\n";
}

