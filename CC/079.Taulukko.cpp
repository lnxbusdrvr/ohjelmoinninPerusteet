#include <iostream>

/*
Taulukot
*/
using namespace std;

int main()
{
	int luvut[5]={1,2,3,4,5};  //esitellään ja alustetaan 5-aihion taulukko
	int i;
	
	for(i=0; i<5; i++)
	{
		cout<<"\n Järjestynumero: "<<i;
		cout<<" Sisältö: "<<luvut[i];
	}
	
	
	return 0;
}
