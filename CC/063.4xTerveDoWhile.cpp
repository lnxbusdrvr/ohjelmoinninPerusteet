#include <iostream>
/* ohjelma tulostaa 4x "Terve" */

using namespace std;

int main()
{
	int i=1, kerrat=4;
	
	do
	{
		cout<<"Terve\n";
		i++;
	}while(i <= kerrat);
	return 0;
}
