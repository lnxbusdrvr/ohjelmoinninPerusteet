#include <iostream>
/* ohjelma tulostaa 4x "Terve" */

using namespace std;

int main()
{
	int kerrat=4;
	
	cout<<"\n";
	//esitellään muuttuja ja annetaan sille arvo;
	//luodaan muuttujan ehto; tulostetaan "Terve";
	//ja kasvatetaan laskuria
	for(int i=1; i<=kerrat; i++)
	{
		cout<<"Terve\n";
	}
	cout<<"\n";
	return 0;
}
